package io.swagger.api.factories;

import io.swagger.api.RandomApiService;
import io.swagger.api.impl.RandomApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-15T13:45:37.038Z[GMT]")
public class RandomApiServiceFactory {
    private final static RandomApiService service = new RandomApiServiceImpl();

    public static RandomApiService getRandomApi() {
        return service;
    }
}
