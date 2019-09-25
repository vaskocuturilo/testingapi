package com.wargaming.api.schema;

import java.util.concurrent.ConcurrentHashMap;

import static com.wargaming.api.schema.Parameters.*;


/**
 * The class Search api builder.
 */
public class SearchApiBuilder {

    /**
     * The private value applicationId.
     */
    private final String applicationId;

    /**
     * The private value query.
     */
    private final String query;

    /**
     * The private value searchApiMap .
     */
    private ConcurrentHashMap<String, String> searchApiMap = new ConcurrentHashMap<>();


    /**
     * Instantiates a new Search api builder.
     *
     * @param applicationIdData the application id
     * @param queryData         the query
     */
    public SearchApiBuilder(final String applicationIdData, final String queryData) {

        this.applicationId = applicationIdData;
        this.searchApiMap.put(APPLICATION_ID.getParameter(), applicationIdData);

        this.query = queryData;
        this.searchApiMap.put(QUERY.getParameter(), queryData);


    }

    /**
     * Build search api.
     *
     * @return the search api
     */
    public SearchApi build() {

        return new SearchApi(applicationId, query, searchApiMap);
    }
}
