package com.wargaming.api.schema;


/**
 * The enum Parameters.
 */
public enum Parameters {

    /**
     * Application id parameters.
     */
    APPLICATION_ID("application_id"),
    /**
     * Query parameters.
     */
    QUERY("query");

    /**
     * The private value is parameter.
     */
    private String parameter;

    /**
     * The Constructor.
     *
     * @param parameterValue thi is parameter value.
     */
    Parameters(final String parameterValue) {
        this.parameter = parameterValue;
    }

    /**
     * Gets parameter.
     *
     * @return the parameter
     */
    public String getParameter() {
        return parameter;
    }
}
