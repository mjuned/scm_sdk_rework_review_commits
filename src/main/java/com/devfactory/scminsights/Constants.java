package com.devfactory.scminsights;

/**
 * Project Constants
 * 
 * @author code test administrator
 * @version 1.2.0
 * @since 2016-12-24
 *
 */
public interface Constants {

    /**
     * Constants for endpoint.
     */
    public static final String ENDPOINT = "http://localhost:9090/api_v2";

    /**
     * Constants for collect endpoint.
     */
    public static final String COLLECT_ENDPOINT = ENDPOINT + "/api_v2/collect";

    /**
     * Constants for query endpoint.
     */
    public static final String QUERY_ENDPOINT = ENDPOINT + "/api_v2/query";

    /**
     * Constants for Collect airports. params as /airport/{iata}/{lat}/{long}
     */
    public static final String AIRPORT_COLLECT_ENDPOINT = "/api_v2/airport/%s/%s/%s";

    /** earth radius in KM */
    public static final double R = 6372.8;

    /**
     * airport file word separator.
     */
    public static final String WORD_SEPARATOR = ",";

    /**
     * Total field length in dat file.
     */
    public static final short TOTAL_FIELD_LENGTH = 11;

    /**
     * Constants for Collect users.
     */
    public static final String USER_COLLECTOR = "/api_v2/user";
}
