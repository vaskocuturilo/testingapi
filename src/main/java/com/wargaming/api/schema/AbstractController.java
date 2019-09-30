package com.wargaming.api.schema;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;

/**
 * The type Abstract controller.
 */
public abstract class AbstractController {

    /**
     * Constant TIME.
     */
    private static final long TIME = 15000L;


    /**
     * The Request reqSpec.
     * Check Content type(Must be JSON),
     * return log detail(ALL).
     */
    protected final static RequestSpecification reqSpec = new RequestSpecBuilder()
            .setContentType(ContentType.JSON)
            .log(LogDetail.ALL)
            .build();


    /**
     * The Response reqSpec.
     * Check Content type(Must be JSON),
     * Check response time (Must be less 15 sec.).
     */
    protected final static ResponseSpecification resSpec = new ResponseSpecBuilder()
            .expectContentType(ContentType.JSON)
            .expectResponseTime(Matchers.lessThan(TIME)).build();


    /**
     * Default constructor.
     */
    public AbstractController() {
        super();
        //empty
        return;
    }

    /**
     * Abstract method.
     */
    protected abstract void abstractMethod();

}
