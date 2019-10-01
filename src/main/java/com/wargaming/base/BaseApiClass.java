package com.wargaming.base;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

import static com.wargaming.webconfig.WebConfig.BASE_CONFIG;

/**
 * The class Base Api class.
 */
public class BaseApiClass {

    /**
     * The default constructor.
     */
    public BaseApiClass() {
        super();
        //empty
        return;
    }

    /**
     * Before test.
     * baseURi this is static value. This is not a good.
     */
    @BeforeMethod(alwaysRun = true)
    public static void beforeTest() {

        RestAssured.baseURI = BASE_CONFIG.getApiUrl();

    }
}
