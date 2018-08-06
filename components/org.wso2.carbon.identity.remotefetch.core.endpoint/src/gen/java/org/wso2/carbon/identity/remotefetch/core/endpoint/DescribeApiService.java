package org.wso2.carbon.identity.remotefetch.core.endpoint;

import org.wso2.carbon.identity.remotefetch.core.endpoint.*;
import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.*;

import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.RemoteFetchComponentDefinitionDTO;
import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.ErrorDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import javax.ws.rs.core.Response;

public abstract class DescribeApiService {
    public abstract Response describeComponentsComponentTypeGet(String componentType,String spTenantDomain);
}

