package org.wso2.carbon.identity.remotefetch.core.endpoint.factories;

import org.wso2.carbon.identity.remotefetch.core.endpoint.StatusApiService;
import org.wso2.carbon.identity.remotefetch.core.endpoint.impl.StatusApiServiceImpl;

public class StatusApiServiceFactory {

   private final static StatusApiService service = new StatusApiServiceImpl();

   public static StatusApiService getStatusApi()
   {
      return service;
   }
}
