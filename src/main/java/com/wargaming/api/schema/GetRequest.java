package com.wargaming.api.schema;

import io.restassured.RestAssured;

/**
 * The class GetRequest.
 */
@SuppressWarnings("PMD.LawOfDemeter")
public final class GetRequest extends AbstractController {

    /**
     * Constant SEARCH. Endpoint for GetRequest.
     */
    private static final String SEARCH = "/list/?application_id=78cd8324660d47c7b417049713b49bef&search=";

    /**
     * Constant LIMIT. Endpoint for GetRequest.
     */
    private static final String LIMIT = "&limit=";

    /**
     * Constant TYPE. Endpoint for GetRequest.
     */
    private static final String TYPE = "&type=";

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
        final String json = RestAssured
                .given(reqSpec)
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
        final String json = RestAssured
                .given(reqSpec)
                .then()
                .spec(resSpec)
                .statusCode(SUCCESS)
                .log().all()
                .when()
                .get(url + text)
                .getBody()
                .asString();
        return json;
    }

    /**
     * Check status with limit string.
     *
     * @param text  the text.
     * @param limit the limit.
     * @return the string
     */
    public static String checkSearchWithLimit(final String text, final int limit) {
        final String json = RestAssured
                .given(reqSpec)
                .then()
                .spec(resSpec)
                .statusCode(SUCCESS)
                .log().all()
                .when()
                .get(SEARCH + text + LIMIT + limit)
                .getBody()
                .asString();
        return json;
    }

    /**
     * Check search with type.
     *
     * @param text       the text.
     * @param typeSearch type of search( -exact).
     * @return the string
     */
    public static String checkSearchWithType(final String text, final String typeSearch) {
        final String json = RestAssured
                .given(reqSpec)
                .then()
                .spec(resSpec)
                .statusCode(SUCCESS)
                .log().all()
                .when()
                .get(SEARCH + text + TYPE + typeSearch)
                .getBody()
                .asString();
        return json;
    }

}
