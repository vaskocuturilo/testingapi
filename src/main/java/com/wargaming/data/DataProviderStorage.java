package com.wargaming.data;

import org.testng.annotations.DataProvider;

/**
 * The type Data provider storage.
 */
public final class DataProviderStorage {

    /**
     * Constant ONE_HUNDRED.
     */
    private static final int ONE_HUNDRED = 100;

    /**
     * Constant TEN.
     */
    private static final int TEN = 10;

    /**
     * Constant ONE_THOUSAND.
     */
    private static final int ONE_THOUSAND = 1000;

    /**
     * Constant OK_STRING.
     */
    private static final String OK_STRING = "ok";

    /**
     * Constant SEARCH_NOT_SPECIFIED.
     */
    private static final int SEARCH_NOT_SPECIFIED = 402;

    /**
     * Constant NOT_ENOUGH_SEARCH_LENGTH.
     */

    private static final int NOT_ENOUGH_SEARCH_LENGTH = 407;

    /**
     * Private Constructor.
     */
    private DataProviderStorage() {
    }

    /**
     * Search not specified object [ ] [ ].
     *
     * @return the object [ ] [ ]
     */
    @DataProvider(name = "searchNotSpecified")
    public static Object[][] searchNotSpecified() {
        return new Object[][]{
                {"search", "SEARCH_NOT_SPECIFIED", SEARCH_NOT_SPECIFIED, null, "error"},
        };
    }

    /**
     * Search with parameters object [ ] [ ].
     *
     * @return the object [ ] [ ]
     */
    @DataProvider(name = "searchWithParameters")
    public static Object[][] searchWithParameters() {
        return new Object[][]{
                {"TEST", OK_STRING, ONE_HUNDRED}
        };
    }

    /**
     * Search with not correct data object [ ] [ ].
     *
     * @return the object [ ] [ ]
     */
    @DataProvider(name = "searchWithNotCorrectData")
    public static Object[][] searchWithNotCorrectData() {
        return new Object[][]{
                {"!!!!!!", "error", "INVALID_SEARCH", NOT_ENOUGH_SEARCH_LENGTH},
                {"@!%$#%^%&^%^", "error", "INVALID_SEARCH", NOT_ENOUGH_SEARCH_LENGTH},
                {"scscscscscscscscscscscscsc", "error", "INVALID_SEARCH", NOT_ENOUGH_SEARCH_LENGTH},
                {"sc", "error", "NOT_ENOUGH_SEARCH_LENGTH", NOT_ENOUGH_SEARCH_LENGTH},
                {"", "error", "SEARCH_NOT_SPECIFIED", SEARCH_NOT_SPECIFIED},

        };
    }


    /**
     * Check not null value object [ ] [ ].
     *
     * @return the object [ ] [ ]
     */
    @DataProvider(name = "checkNotNullValue")
    public static Object[][] checkNotNullValue() {
        return new Object[][]{
                {"test", 100},
                {"TEST_TEST", 14},
                {"StOa", 100}
        };
    }

    /**
     * Search with limit object [ ] [ ].
     *
     * @return the object [ ] [ ]
     */
    @DataProvider(name = "searchWithLimit")
    public static Object[][] searchWithLimit() {
        return new Object[][]{
                {"TEST", TEN, OK_STRING, TEN},
                {"TEST", ONE_HUNDRED, OK_STRING, 100},
                {"TEST", ONE_THOUSAND, OK_STRING, 100}
        };
    }

    /**
     * Search with limit object [ ] [ ].
     *
     * @return the object [ ] [ ]
     */
    @DataProvider(name = "searchWithExactMatches")
    public static Object[][] searchWithExactMatches() {
        return new Object[][]{
                {"vasko,som", "exact"}
        };
    }

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


}
