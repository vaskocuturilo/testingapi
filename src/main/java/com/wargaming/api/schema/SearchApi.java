package com.wargaming.api.schema;

import java.util.concurrent.ConcurrentHashMap;


/**
 * The type Search api.
 */
public class SearchApi {

    /**
     * The private value applicationId.
     */
    private final String applicationId;

    /**
     * The private value query.
     */
    private final String query;

    /**
     * The private value searchApiMap.
     */
    private ConcurrentHashMap<String, String> searchApiMap = new ConcurrentHashMap<>();

    /**
     * Instantiates a new Search api.
     *
     * @param applicationId the application id
     * @param query         the query
     * @param searchApiMap  the search api map
     */
    public SearchApi(final String applicationId, final String query, final ConcurrentHashMap<String, String> searchApiMap) {
        this.applicationId = applicationId;
        this.query = query;
        this.searchApiMap.putAll(searchApiMap);

    }

    /**
     * Gets search api map.
     *
     * @return the search api map
     */
    public ConcurrentHashMap<String, String> getSearchApiMap() {
        return searchApiMap;
    }
}
