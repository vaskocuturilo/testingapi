package account;

import com.wargaming.api.schema.ApiJson;
import com.wargaming.api.schema.notspecified.NotSpecified;
import com.wargaming.api.schema.search.Search;
import com.wargaming.base.BaseApiClass;
import com.wargaming.data.DataProviderStorage;
import com.wargaming.api.schema.GetRequest;
import io.qameta.allure.Story;
import com.wargaming.listener.LogListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Listeners(LogListener.class)
public class AccountListTest extends BaseApiClass {

    /**
     * Constant PLAYERS. Endpoint.
     */
    private static final String PLAYERS = "/list/?application_id=78cd8324660d47c7b417049713b49bef";

    /**
     * Constant SEARCH. Endpoint.
     */
    private static final String SEARCH = "&search=";

    @Test(dataProvider = "checkNotNullValue", dataProviderClass = DataProviderStorage.class)
    @Story("Check that the search returns non-empty values.")
    public void testCheckThatDataIsNoEmpty(String text, int count) {
        final String resultsApiJson = GetRequest.checkSearch(PLAYERS + SEARCH, text);
        final ApiJson apiJson = ApiJson.from(resultsApiJson);
        final Search result = apiJson.getSpecifiedSearch();

        assertTrue(result.getStatus().contains("ok"));
        assertEquals(result.getMeta().getCount(), count);

    }

    @Test(dataProvider = "searchNotSpecified", dataProviderClass = DataProviderStorage.class)
    @Story("Do not specify a value for the search parameter.")
    public void testCheckSearchNotSpecified(String field, String message, int code, String value, String status) {
        final String resultsApiJson = GetRequest.checkErrorStatus(PLAYERS);
        final ApiJson apiJson = ApiJson.from(resultsApiJson);
        final NotSpecified result = apiJson.getNotSpecified();

        assertEquals(result.getError().getField(), field);
        assertEquals(result.getError().getMessage(), message);
        assertEquals(result.getError().getCode(), code);
        assertEquals(result.getError().getValue(), value);
        assertEquals(result.getStatus(), status);
    }

    @Test(dataProvider = "searchWithParameters", dataProviderClass = DataProviderStorage.class)
    @Story("Check search with parameters.")
    public void testCheckSearchSpecified(String text, String status, int meta) {
        final String resultsApiJson = GetRequest.checkSearch(PLAYERS + SEARCH, text);
        final ApiJson apiJson = ApiJson.from(resultsApiJson);
        final Search result = apiJson.getSpecifiedSearch();

        assertEquals(result.getStatus(), status);
        assertEquals(result.getData().get(0).getNickname(), text);
        assertEquals(result.getMeta().getCount(), meta);
    }

    @Test(dataProvider = "searchWithNotCorrectData", dataProviderClass = DataProviderStorage.class)
    @Story("Check search with parameters.")
    public void testCheckSearchSpecifiedWithNotCorrectData(String text, String status, String message, int code) {
        final String resultsApiJson = GetRequest.checkSearch(PLAYERS + SEARCH, text);
        final ApiJson apiJson = ApiJson.from(resultsApiJson);
        final NotSpecified result = apiJson.getNotSpecified();

        assertEquals(result.getStatus(), status);
        assertEquals(result.getError().getMessage(), message);
        assertEquals(result.getError().getCode(), code);
    }

    @Test(dataProvider = "searchWithLimit", dataProviderClass = DataProviderStorage.class)
    @Story("Check that search with number of records returned.")
    public void testCheckSearchSpecifiedWithLimit(String text, int limit, String status, int checkLimit) {
        final String resultsApiJson = GetRequest.checkSearchWithLimit(text, limit);
        final ApiJson apiJson = ApiJson.from(resultsApiJson);
        final Search result = apiJson.getSpecifiedSearch();

        assertEquals(result.getStatus(), status);
        assertEquals(result.getData().get(0).getNickname(), text);
        assertEquals(result.getMeta().getCount(), checkLimit);
    }

    @Test(dataProvider = "searchWithExactMatches", dataProviderClass = DataProviderStorage.class)
    @Story("Check with search by strict match of player name case-insensitive.")
    public void testCheckSearchForExactMatches(String text, String typeSearch) {
        final String resultsApiJson = GetRequest.checkSearchWithType(text, typeSearch);
        final ApiJson apiJson = ApiJson.from(resultsApiJson);
        final Search result = apiJson.getSpecifiedSearch();

        assertTrue(result.getStatus().contains("ok"));
        assertTrue(result.getData().get(0).getNickname().contains("SOM"));
        assertTrue(result.getData().get(1).getNickname().contains("Vasko"));
        assertEquals(result.getMeta().getCount(), 2);
    }

}
