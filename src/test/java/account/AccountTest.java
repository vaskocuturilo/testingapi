package account;

import com.wargaming.api.schema.ApiJson;
import com.wargaming.api.schema.GetRequest;
import com.wargaming.base.BaseApiClass;
import com.wargaming.data.DataProviderAccountList;
import org.testng.annotations.Test;

import java.util.concurrent.ConcurrentHashMap;

public class AccountTest extends BaseApiClass {


    @Test(dataProvider = "insertSearchData", dataProviderClass = DataProviderAccountList.class)
    public void searchWithApiRequest(ConcurrentHashMap<String, String> queryMap) {

        ApiJson apiJson = GetRequest.makeRequest(queryMap);

    }
}
