package org.wso2.carbon.identity.remotefetch.core.endpoint.dto;

import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.RemoteFetchComponentAttributeDTO;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class RemoteFetchComponentDTO  {
  
  
  @NotNull
  private String identifier = null;
  
  @NotNull
  private String type = null;
  
  
  private List<RemoteFetchComponentAttributeDTO> attributes = new ArrayList<RemoteFetchComponentAttributeDTO>();

  
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
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("attributes")
  public List<RemoteFetchComponentAttributeDTO> getAttributes() {
    return attributes;
  }
  public void setAttributes(List<RemoteFetchComponentAttributeDTO> attributes) {
    this.attributes = attributes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteFetchComponentDTO {\n");
    
    sb.append("  identifier: ").append(identifier).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  attributes: ").append(attributes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
