package org.wso2.carbon.identity.remotefetch.core.endpoint.impl;

import org.wso2.carbon.identity.remotefetch.core.endpoint.*;
import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.*;


import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.RemoteFetchComponentDefinitionDTO;
import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.ErrorDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import javax.ws.rs.core.Response;

public class DescribeApiServiceImpl extends DescribeApiService {
    @Override
    public Response describeComponentsComponentTypeGet(String componentType,String spTenantDomain){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
