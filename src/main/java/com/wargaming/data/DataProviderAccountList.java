package com.wargaming.data;

import com.wargaming.api.schema.SearchApiBuilder;
import org.testng.annotations.DataProvider;

import java.util.ResourceBundle;


/**
 * The type Data provider account list.
 */
public class DataProviderAccountList {

    /**
     * The Api key.
     */
    private String applicationId = ResourceBundle.getBundle("test").getString("APPLICATION_ID");

    /**
     * Constant SEARCH_NOT_SPECIFIED.
     */
    private static final int SEARCH_NOT_SPECIFIED = 402;

    /**
     * Constant NOT_ENOUGH_SEARCH_LENGTH.
     */

    private static final int NOT_ENOUGH_SEARCH_LENGTH = 407;

    /**
     * Search not specified object [ ] [ ].
     *
     * @return the object [ ] [ ]
     */
    @DataProvider(name = "searchWithoutAccountID")
    public static Object[][] searchWithoutAccountID() {
        return new Object[][]{
                {"account_id", "ACCOUNT_ID_NOT_SPECIFIED", SEARCH_NOT_SPECIFIED, null, "error"}

        };
    }

    /**
     * Search with not correct id object [ ] [ ].
     *
     * @return the object [ ] [ ]
     */
    @DataProvider(name = "searchWithNotCorrectID")
    public static Object[][] searchWithNotCorrectID() {
        return new Object[][]{
                {"!!!!!!", "error", "INVALID_APPLICATION_ID", NOT_ENOUGH_SEARCH_LENGTH},
                {"@!%$#%^%&^%^", "error", "INVALID_APPLICATION_ID", NOT_ENOUGH_SEARCH_LENGTH},
                {"scscscscscscscscscscscscsc", "error", "INVALID_APPLICATION_ID", NOT_ENOUGH_SEARCH_LENGTH},
                {"sc", "error", "INVALID_APPLICATION_ID", NOT_ENOUGH_SEARCH_LENGTH},
                {"", "error", "ACCOUNT_ID_NOT_SPECIFIED", SEARCH_NOT_SPECIFIED},

        };
    }


    /**
     * Search with accountID object [ ] [ ].
     *
     * @return the object [ ] [ ]
     */
    @DataProvider(name = "searchWithAccountID")
    public static Object[][] searchWithAccountID() {
        return new Object[][]{
                {6269, "Som"}
        };
    }


    /**
     * Search with accountID object [ ] [ ].
     *
     * @return the object [ ] [ ]
     */
    @DataProvider(name = "insertSearchData")
    public Object[][] insertSearchData() {
        return new Object[][]{
                {new SearchApiBuilder(applicationId, "TEST").build().getSearchApiMap()}
        };
    }


}
