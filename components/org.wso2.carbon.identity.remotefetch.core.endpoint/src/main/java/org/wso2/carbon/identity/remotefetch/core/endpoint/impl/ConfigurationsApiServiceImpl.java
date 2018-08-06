package org.wso2.carbon.identity.remotefetch.core.endpoint.impl;

import org.wso2.carbon.identity.remotefetch.core.endpoint.*;
import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.*;


import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.ErrorDTO;
import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.RemoteFetchConfigurationDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import javax.ws.rs.core.Response;

public class ConfigurationsApiServiceImpl extends ConfigurationsApiService {
    @Override
    public Response configurationsConfigurationIdDelete(Integer configurationId,String spTenantDomain){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response configurationsConfigurationIdGet(Integer configurationId,String spTenantDomain){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response configurationsPost(RemoteFetchConfigurationDTO configuration,String spTenantDomain){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
