package org.wso2.carbon.identity.remotefetch.core.endpoint;

import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.*;
import org.wso2.carbon.identity.remotefetch.core.endpoint.DescribeApiService;
import org.wso2.carbon.identity.remotefetch.core.endpoint.factories.DescribeApiServiceFactory;

import io.swagger.annotations.ApiParam;

import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.RemoteFetchComponentDefinitionDTO;
import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.ErrorDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/describe")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/describe", description = "the describe API")
public class DescribeApi  {

   private final DescribeApiService delegate = DescribeApiServiceFactory.getDescribeApi();

    @GET
    @Path("/components/{componentType}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Describe available components\n", notes = "describe available components for given type\n", response = RemoteFetchComponentDefinitionDTO.class, responseContainer = "List")
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response describeComponentsComponentTypeGet(@ApiParam(value = "This represents the type of the component",required=true, allowableValues="{values=[repository-manager, action-listener, configuration-deployer]}" ) @PathParam("componentType")  String componentType,
    @ApiParam(value = "Service provider tenant domain") @QueryParam("spTenantDomain")  String spTenantDomain)
    {
    return delegate.describeComponentsComponentTypeGet(componentType,spTenantDomain);
    }
}

