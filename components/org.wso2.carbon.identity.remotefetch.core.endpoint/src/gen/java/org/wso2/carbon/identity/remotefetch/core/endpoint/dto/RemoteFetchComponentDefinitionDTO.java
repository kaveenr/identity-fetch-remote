package org.wso2.carbon.identity.remotefetch.core.endpoint.dto;

import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.RemoteFetchComponentAttributeDefinitionDTO;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class RemoteFetchComponentDefinitionDTO  {
  
  
  
  private String identifier = null;
  
  
  private String type = null;
  
  
  private List<RemoteFetchComponentAttributeDefinitionDTO> attributeDefinitions = new ArrayList<RemoteFetchComponentAttributeDefinitionDTO>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
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
  @JsonProperty("attributeDefinitions")
  public List<RemoteFetchComponentAttributeDefinitionDTO> getAttributeDefinitions() {
    return attributeDefinitions;
  }
  public void setAttributeDefinitions(List<RemoteFetchComponentAttributeDefinitionDTO> attributeDefinitions) {
    this.attributeDefinitions = attributeDefinitions;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteFetchComponentDefinitionDTO {\n");
    
    sb.append("  identifier: ").append(identifier).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  attributeDefinitions: ").append(attributeDefinitions).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
