package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.RandomApiService;
import io.swagger.api.factories.RandomApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.CardModel;
import io.swagger.model.Error;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

import javax.validation.constraints.*;


@Path("/random")


@io.swagger.annotations.Api(description = "the random API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-15T13:45:37.038Z[GMT]")

public class RandomApi  {
   private final RandomApiService delegate;

   public RandomApi(@Context ServletConfig servletContext) {
      RandomApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("RandomApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (RandomApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = RandomApiServiceFactory.getRandomApi();
      }

      this.delegate = delegate;
   }


    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get random card", notes = "Get random card", response = CardModel.class, tags={ "Random Card Data", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = CardModel.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Error.class) })
    public Response getRandomCard(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getRandomCard(securityContext);
    }

}

