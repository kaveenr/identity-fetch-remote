package org.wso2.carbon.identity.remotefetch.core.endpoint;

import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.*;
import org.wso2.carbon.identity.remotefetch.core.endpoint.StatusApiService;
import org.wso2.carbon.identity.remotefetch.core.endpoint.factories.StatusApiServiceFactory;

import io.swagger.annotations.ApiParam;

import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.RemoteFetchConfigurationStatusDTO;
import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.ErrorDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/status")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/status", description = "the status API")
public class StatusApi  {

   private final StatusApiService delegate = StatusApiServiceFactory.getStatusApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List Configurations Statuses\n", notes = "This API is used to get remote fetch configuration statuses\n", response = RemoteFetchConfigurationStatusDTO.class, responseContainer = "List")
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response statusGet(@ApiParam(value = "Service provider tenant domain") @QueryParam("spTenantDomain")  String spTenantDomain)
    {
    return delegate.statusGet(spTenantDomain);
    }
}

