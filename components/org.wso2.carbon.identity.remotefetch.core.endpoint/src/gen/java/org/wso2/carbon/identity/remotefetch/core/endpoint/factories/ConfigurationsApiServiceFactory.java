package org.wso2.carbon.identity.remotefetch.core.endpoint.factories;

import org.wso2.carbon.identity.remotefetch.core.endpoint.ConfigurationsApiService;
import org.wso2.carbon.identity.remotefetch.core.endpoint.impl.ConfigurationsApiServiceImpl;

public class ConfigurationsApiServiceFactory {

   private final static ConfigurationsApiService service = new ConfigurationsApiServiceImpl();

   public static ConfigurationsApiService getConfigurationsApi()
   {
      return service;
   }
}
