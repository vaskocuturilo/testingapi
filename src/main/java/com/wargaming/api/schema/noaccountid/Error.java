package com.wargaming.api.schema.noaccountid;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;


/**
 * The class Error.
 */
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

    /**
     * Set code.
     *
     * @param code the code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Get code int.
     *
     * @return the int
     */
    public int getCode() {
        return code;
    }

    /**
     * Set field.
     *
     * @param field the field
     */
    public void setField(String field) {
        this.field = field;
    }

    /**
     * Get field string.
     *
     * @return the string
     */
    public String getField() {
        return field;
    }

    /**
     * Set message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Get message string.
     *
     * @return the string
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set value.
     *
     * @param value the value
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * Get value object.
     *
     * @return the object
     */
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