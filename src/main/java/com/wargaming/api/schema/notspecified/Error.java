package com.wargaming.api.schema.notspecified;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

@SuppressWarnings("PMD.MethodArgumentCouldBeFinal")
@Generated("com.robohorse.robopojogenerator")
public class Error {

    @JsonProperty("code")
    private int code;

    @JsonProperty("field")
    private String field;

    @JsonProperty("message")
    private String message;

    @JsonProperty("value")
    private Object value;

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return
                "Error{" +
                        "code = '" + code + '\'' +
                        ",field = '" + field + '\'' +
                        ",message = '" + message + '\'' +
                        ",value = '" + value + '\'' +
                        "}";
    }
}