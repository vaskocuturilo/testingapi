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
     * @param applicationId the application id
     * @param query         the query
     */
    public SearchApiBuilder(final String applicationId, final String query) {

        this.applicationId = applicationId;
        this.searchApiMap.put(APPLICATION_ID.getParameter(), applicationId);

        this.query = query;
        this.searchApiMap.put(QUERY.getParameter(), query);


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
