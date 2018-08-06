package org.wso2.carbon.identity.remotefetch.core.endpoint.dto;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class RemoteFetchComponentAttributeDTO  {
  
  
  @NotNull
  private String identifier = null;
  
  @NotNull
  private String value = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteFetchComponentAttributeDTO {\n");
    
    sb.append("  identifier: ").append(identifier).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
