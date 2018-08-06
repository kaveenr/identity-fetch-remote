package org.wso2.carbon.identity.remotefetch.core.endpoint;

import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.*;
import org.wso2.carbon.identity.remotefetch.core.endpoint.ConfigurationsApiService;
import org.wso2.carbon.identity.remotefetch.core.endpoint.factories.ConfigurationsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.ErrorDTO;
import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.RemoteFetchConfigurationDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/configurations")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/configurations", description = "the configurations API")
public class ConfigurationsApi  {

   private final ConfigurationsApiService delegate = ConfigurationsApiServiceFactory.getConfigurationsApi();

    @DELETE
    @Path("/{configurationId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Configuration\n", notes = "Delete configuration for given id\n", response = void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response configurationsConfigurationIdDelete(@ApiParam(value = "This represents the Configuration Id.",required=true ) @PathParam("configurationId")  Integer configurationId,
    @ApiParam(value = "Service provider tenant domain") @QueryParam("spTenantDomain")  String spTenantDomain)
    {
    return delegate.configurationsConfigurationIdDelete(configurationId,spTenantDomain);
    }
    @GET
    @Path("/{configurationId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Configuration\n", notes = "Get Configuration for given Id\n", response = RemoteFetchConfigurationDTO.class, responseContainer = "List")
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response configurationsConfigurationIdGet(@ApiParam(value = "This represents the Configuration Id.",required=true ) @PathParam("configurationId")  Integer configurationId,
    @ApiParam(value = "Service provider tenant domain") @QueryParam("spTenantDomain")  String spTenantDomain)
    {
    return delegate.configurationsConfigurationIdGet(configurationId,spTenantDomain);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add or update configuration\n", notes = "This endpoint is to store or update configurations\n", response = RemoteFetchConfigurationDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful response"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response configurationsPost(@ApiParam(value = "configuration object to store or update" ,required=true ) RemoteFetchConfigurationDTO configuration,
    @ApiParam(value = "Service provider tenant domain") @QueryParam("spTenantDomain")  String spTenantDomain)
    {
    return delegate.configurationsPost(configuration,spTenantDomain);
    }
}

