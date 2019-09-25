package account;

import com.wargaming.api.schema.ApiJson;
import com.wargaming.api.schema.GetRequest;
import com.wargaming.base.BaseApiClass;
import org.testng.annotations.Test;

public class AccountTest extends BaseApiClass {

    @Test()
    public void searchWithApiRequest() {

        ApiJson apiJson = GetRequest.makeRequest("TEST");

    }
}
