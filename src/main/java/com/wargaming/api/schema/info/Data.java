package com.wargaming.api.schema.info;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;


/**
 * The class Data.
 */
@SuppressWarnings({"PMD.MethodArgumentCouldBeFinal", "PMD.ShortVariable", "PMD.LongVariable", "PMD.ShortClassName"})
@Generated("com.robohorse.robopojogenerator")
public class Data {

    @JsonProperty("6269")
    private JsonMember6269 jsonMember6269;

    /**
     * Sets json member 6269.
     *
     * @param jsonMember6269 the json member 6269
     */
    public void setJsonMember6269(JsonMember6269 jsonMember6269) {
        this.jsonMember6269 = jsonMember6269;
    }

    /**
     * Gets json member 6269.
     *
     * @return the json member 6269
     */
    public JsonMember6269 getJsonMember6269() {
        return jsonMember6269;
    }

    @Override
    public String toString() {
        return
                "Data{" +
                        "6269 = '" + jsonMember6269 + '\'' +
                        "}";
    }
}