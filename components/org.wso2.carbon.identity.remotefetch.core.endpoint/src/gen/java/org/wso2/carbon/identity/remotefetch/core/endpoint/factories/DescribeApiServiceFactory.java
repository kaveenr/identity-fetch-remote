package org.wso2.carbon.identity.remotefetch.core.endpoint.factories;

import org.wso2.carbon.identity.remotefetch.core.endpoint.DescribeApiService;
import org.wso2.carbon.identity.remotefetch.core.endpoint.impl.DescribeApiServiceImpl;

public class DescribeApiServiceFactory {

   private final static DescribeApiService service = new DescribeApiServiceImpl();

   public static DescribeApiService getDescribeApi()
   {
      return service;
   }
}
