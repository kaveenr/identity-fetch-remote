package org.wso2.carbon.identity.remotefetch.core.endpoint.dto;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class RemoteFetchComponentAttributeDefinitionDTO  {
  
  
  
  private String identifier = null;
  
  
  private String name = null;
  
  
  private String helpText = null;
  
  
  private String fieldType = null;
  
  
  private Boolean isMandatory = null;
  
  
  private List<String> defaultValues = new ArrayList<String>();
  
  
  private String validationRegex = null;

  
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
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("helpText")
  public String getHelpText() {
    return helpText;
  }
  public void setHelpText(String helpText) {
    this.helpText = helpText;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("fieldType")
  public String getFieldType() {
    return fieldType;
  }
  public void setFieldType(String fieldType) {
    this.fieldType = fieldType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("isMandatory")
  public Boolean getIsMandatory() {
    return isMandatory;
  }
  public void setIsMandatory(Boolean isMandatory) {
    this.isMandatory = isMandatory;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("defaultValues")
  public List<String> getDefaultValues() {
    return defaultValues;
  }
  public void setDefaultValues(List<String> defaultValues) {
    this.defaultValues = defaultValues;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("validationRegex")
  public String getValidationRegex() {
    return validationRegex;
  }
  public void setValidationRegex(String validationRegex) {
    this.validationRegex = validationRegex;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteFetchComponentAttributeDefinitionDTO {\n");
    
    sb.append("  identifier: ").append(identifier).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  helpText: ").append(helpText).append("\n");
    sb.append("  fieldType: ").append(fieldType).append("\n");
    sb.append("  isMandatory: ").append(isMandatory).append("\n");
    sb.append("  defaultValues: ").append(defaultValues).append("\n");
    sb.append("  validationRegex: ").append(validationRegex).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
