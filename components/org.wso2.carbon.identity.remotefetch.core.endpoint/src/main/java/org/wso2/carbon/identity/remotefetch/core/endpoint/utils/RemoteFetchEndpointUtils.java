package org.wso2.carbon.identity.remotefetch.core.endpoint.utils;

import org.wso2.carbon.context.PrivilegedCarbonContext;
import org.wso2.carbon.identity.core.util.IdentityTenantUtil;
import org.wso2.carbon.identity.remotefetch.common.RemoteFetchConfigurationService;

public class RemoteFetchEndpointUtils {

    public static RemoteFetchConfigurationService getRemoteFetchConfigurationService(){
        return (RemoteFetchConfigurationService) PrivilegedCarbonContext.getThreadLocalCarbonContext()
                .getOSGiService(RemoteFetchConfigurationService.class,null);
    }

    public static int getTenantIdFromDomain(String tenantDomain){

        return IdentityTenantUtil.getTenantId(tenantDomain);
    }
}
