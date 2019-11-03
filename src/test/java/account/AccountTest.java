package account;

import com.wargaming.api.schema.ApiJson;
import com.wargaming.api.schema.GetRequest;
import com.wargaming.api.schema.notspecified.NotSpecified;
import com.wargaming.base.BaseApiClass;
import com.wargaming.data.DataProviderAccountList;
import com.wargaming.listener.LogListener;
import io.qameta.allure.Story;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Map;

import static org.testng.Assert.assertEquals;

@Listeners(LogListener.class)
public class AccountTest extends BaseApiClass {

    @Test(dataProvider = "insertSearchData", dataProviderClass = DataProviderAccountList.class)
    @Story("Check search with query.")
    public void searchWithApiRequest(Map<String, String> query) {
        ApiJson apiJson = GetRequest.makeRequest(query);
        final NotSpecified result = apiJson.getNotSpecified();

        assertEquals(result.getError().getField(), "search");
        assertEquals(result.getError().getMessage(), "SEARCH_NOT_SPECIFIED");
        assertEquals(result.getError().getCode(), 402);
        assertEquals(result.getError().getValue(), null);

    }
}
