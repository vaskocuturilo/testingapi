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

public class AccountInfoList extends BaseApiClass {

    /**
     * Constant INFO. Endpoint.
     */
    private static final String INFO = "/info/?application_id=78cd8324660d47c7b417049713b49bef";

    /**
     * Constant ACCOUNT_ID. Endpoint.
     */
    private static final String ACCOUNT_ID = "&account_id=6269";

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
        final String resultsApiJson = GetRequest.checkSearch(INFO, ACCOUNT_ID);
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

