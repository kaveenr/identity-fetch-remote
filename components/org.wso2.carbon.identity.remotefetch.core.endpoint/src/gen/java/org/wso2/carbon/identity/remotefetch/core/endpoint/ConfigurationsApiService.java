package org.wso2.carbon.identity.remotefetch.core.endpoint;

import org.wso2.carbon.identity.remotefetch.core.endpoint.*;
import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.*;

import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.ErrorDTO;
import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.RemoteFetchConfigurationDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import javax.ws.rs.core.Response;

public abstract class ConfigurationsApiService {
    public abstract Response configurationsConfigurationIdDelete(Integer configurationId,String spTenantDomain);
    public abstract Response configurationsConfigurationIdGet(Integer configurationId,String spTenantDomain);
    public abstract Response configurationsPost(RemoteFetchConfigurationDTO configuration,String spTenantDomain);
}

