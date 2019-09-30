package com.wargaming.api.schema;

import java.util.Map;
import java.util.ResourceBundle;

import static io.restassured.RestAssured.given;

/**
 * The class GetRequest.
 */
@SuppressWarnings("PMD.LawOfDemeter")
public final class GetRequest extends AbstractController {

    /**
     * The constant APPLICATION_ID.
     */
    private static final String APPLICATION_ID = ResourceBundle.getBundle("test").getString("APPLICATION_ID");

    /**
     * The constant ACCOUNT_ID.
     */
    private static final String ACCOUNT_ID = ResourceBundle.getBundle("test").getString("ACCOUNT_ID");

    /**
     * Constant LIST. Endpoint for GetRequest.
     */
    private static final String LIST = "/list/";

    /**
     * Constant SUCCESS.
     */
    private static final int SUCCESS = 200;

    /**
     * Default constructor.
     */
    private GetRequest() {
        super();
        //empty
        return;
    }

    @Override
    /**
     * Default abstract method.
     */
    protected void abstractMethod() {
    }

    /**
     * Check error status string.
     *
     * @param url this is url.
     * @return the string
     */
    public static String checkErrorStatus(final String url) {
        final String json = given(reqSpec)
                .queryParam("application_id", APPLICATION_ID)
                .then()
                .spec(resSpec)
                .statusCode(SUCCESS)
                .log().ifError()
                .when()
                .get(url)
                .getBody()
                .asString();
        return json;
    }

    /**
     * Check search string.
     *
     * @param url  this is url.
     * @param text the text
     * @return the string
     */
    public static String checkSearch(final String url, final String text) {
        final String json = given(reqSpec)
                .queryParam("application_id", APPLICATION_ID)
                .queryParam("search", text)
                .then()
                .spec(resSpec)
                .statusCode(SUCCESS)
                .log().all()
                .when()
                .get(url)
                .getBody()
                .asString();
        return json;
    }

    /**
     * Check status with limit string.
     *
     * @param url   this is url for api.
     * @param text  the text.
     * @param limit the limit.
     * @return the string
     */
    public static String checkSearch(final String url, final String text, final int limit) {
        final String json = given(reqSpec)
                .queryParam("application_id", APPLICATION_ID)
                .queryParam("search", text)
                .queryParam("limit", limit)
                .then()
                .spec(resSpec)
                .statusCode(SUCCESS)
                .log().all()
                .when()
                .get(url)
                .getBody()
                .asString();
        return json;
    }

    /**
     * Check search with type.
     *
     * @param url        this is url for api.
     * @param text       the text.
     * @param typeSearch type of search( -exact).
     * @return the string
     */
    public static String checkSearch(final String url, final String text, final String typeSearch) {
        final String json = given(reqSpec)
                .queryParam("application_id", APPLICATION_ID)
                .queryParam("search", text)
                .queryParam("type", typeSearch)
                .then()
                .spec(resSpec)
                .statusCode(SUCCESS)
                .log().all()
                .when()
                .get(url)
                .getBody()
                .asString();
        return json;
    }

    /**
     * Make request api json.
     *
     * @param query this is query for api.
     * @return the api json.
     */
    public static ApiJson makeRequest(final Map<String, String> query) {
        final String json = given()
                .params(query)
                .log()
                .all()
                .request()
                .when()
                .get(LIST)
                .getBody().asString();

        return new ApiJson(json);
    }

    /**
     * Method check search with account id.
     *
     * @param url this is url.
     * @return the string
     */
    public static String checkSearchWithAccount(final String url) {
        final String json = given(reqSpec)
                .queryParam("application_id", APPLICATION_ID)
                .queryParam("account_id", ACCOUNT_ID)
                .then()
                .spec(resSpec)
                .statusCode(SUCCESS)
                .log().all()
                .when()
                .get(url)
                .getBody()
                .asString();

        return json;
    }


}
