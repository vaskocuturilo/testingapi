package account;

import com.wargaming.api.schema.ApiJson;
import com.wargaming.api.schema.info.PlayerInformation;
import com.wargaming.api.schema.noaccountid.NoAccountID;
import com.wargaming.base.BaseApiClass;
import com.wargaming.api.schema.GetRequest;
import com.wargaming.data.DataProviderAccountList;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AccountInfoListTest extends BaseApiClass {

    /**
     * Constant INFO. Endpoint.
     */
    private static final String INFO = "/info/";

    @Test(dataProvider = "searchWithoutAccountID", dataProviderClass = DataProviderAccountList.class)
    @Story("Check information without account id.")
    public void testCheckInfoWithoutAccountID(String field, String message, int code, String value, String status) {
        final String resultsApiJson = GetRequest.checkErrorStatus(INFO);
        final ApiJson apiJson = ApiJson.from(resultsApiJson);
        final NoAccountID result = apiJson.getNoAccountID();

        assertEquals(result.getError().getField(), field);
        assertEquals(result.getError().getMessage(), message);
        assertEquals(result.getError().getCode(), code);
        assertEquals(result.getError().getValue(), value);
        assertEquals(result.getStatus(), status);
    }

    @Test
    @Story("Check info with account id.")
    public void testCheckInfoWithAccountID() {
        final String resultsApiJson = GetRequest.checkSearchWithAccount(INFO);
        final ApiJson apiJson = ApiJson.from(resultsApiJson);
        final PlayerInformation result = apiJson.getPlayerInformation();

        assertTrue(result.getStatus().contains("ok"));
        assertTrue(result.getData().toString().contains("6269"));
        assertEquals(result.getMeta().getCount(), 1);
    }


    @Test(dataProvider = "searchWithNotCorrectID", dataProviderClass = DataProviderAccountList.class)
    @Story("Check information with not correct account id.")
    public void testCheckInfoWithNotCorrectData(String text, String status, String message, int code) {
        final String resultsApiJson = GetRequest.checkSearch(INFO, text);
        final ApiJson apiJson = ApiJson.from(resultsApiJson);
        final NoAccountID result = apiJson.getNoAccountID();

        assertEquals(result.getStatus(), status);
        assertEquals(result.getError().getMessage(), message);
        assertEquals(result.getError().getCode(), code);
    }

}

