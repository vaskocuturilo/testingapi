package com.wargaming.base;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

import static com.wargaming.utils.PropertiesReader.loadPropertyName;

/**
 * The class Base Api class.
 */
public class BaseApiClass {

    /**
     * Default constructor.
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
    public void beforeTest() {
        RestAssured.baseURI = loadPropertyName("API_BASE_URL");
    }
}
