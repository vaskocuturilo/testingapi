package com.wargaming.api.schema;

import com.wargaming.api.schema.info.PlayerInformation;
import com.wargaming.api.schema.noaccountid.NoAccountID;
import com.wargaming.api.schema.notspecified.NotSpecified;
import com.wargaming.api.schema.search.Search;
import io.qameta.allure.Step;
import io.restassured.path.json.JsonPath;

/**
 * The class Api json.
 */
public final class ApiJson {

    /**
     * Constant JSON_PATH.
     */
    private static final String JSON_PATH = "";

    /**
     * Private value JsonPath.
     */
    private JsonPath jsonPath;

    /**
     * Constructor.
     *
     * @param json this is json.
     */
    protected ApiJson(final String json) {
        this.jsonPath = JsonPath.from(json);
    }

    /**
     * abstractMethod From.
     *
     * @param json the json
     * @return the players.
     */
    public static ApiJson from(final String json) {
        return new ApiJson(json);
    }

    /**
     * Gets not specified.
     *
     * @return get result for one country.
     */
    @Step
    public NotSpecified getNotSpecified() {
        return jsonPath.getObject(JSON_PATH, NotSpecified.class);
    }

    /**
     * Gets not specified.
     *
     * @return get result for one country
     */
    @Step
    public NoAccountID getNoAccountID() {
        return jsonPath.getObject(JSON_PATH, NoAccountID.class);
    }


    /**
     * Gets specified search.
     *
     * @return get result for one country
     */
    @Step
    public Search getSpecifiedSearch() {
        return jsonPath.getObject(JSON_PATH, Search.class);
    }


    /**
     * Gets specified search.
     *
     * @return get result for one country
     */
    @Step
    public PlayerInformation getPlayerInformation() {
        return jsonPath.getObject(JSON_PATH, PlayerInformation.class);
    }
}
