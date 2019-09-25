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
     * @param applicationIdData the application id
     * @param queryData         the query
     * @param searchApiMapData  the search api map
     */
    public SearchApi(final String applicationIdData, final String queryData, final ConcurrentHashMap<String, String> searchApiMapData) {
        this.applicationId = applicationIdData;
        this.query = queryData;
        this.searchApiMap.putAll(searchApiMapData);

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
