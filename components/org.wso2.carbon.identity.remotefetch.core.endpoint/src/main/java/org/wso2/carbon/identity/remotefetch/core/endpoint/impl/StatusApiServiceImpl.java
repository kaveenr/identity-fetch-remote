package org.wso2.carbon.identity.remotefetch.core.endpoint.impl;

import org.wso2.carbon.identity.remotefetch.common.BasicRemoteFetchConfiguration;
import org.wso2.carbon.identity.remotefetch.core.endpoint.*;
import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.*;


import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import javax.ws.rs.core.Response;

public class StatusApiServiceImpl extends StatusApiService {
    @Override
    public Response statusGet(String spTenantDomain){
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
