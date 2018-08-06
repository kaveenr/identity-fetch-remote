package org.wso2.carbon.identity.remotefetch.core.endpoint.dto;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class RemoteFetchConfigurationStatusDTO  {
  
  
  
  private BigDecimal id = null;
  
  
  private Boolean isEnabled = null;
  
  
  private String userName = null;
  
  
  private String repositoryManagerType = null;
  
  
  private String actionListenerType = null;
  
  
  private String configurationDeployerType = null;
  
  
  private Integer successfulDeployments = null;
  
  
  private Integer failedDeployments = null;
  
  
  private javax.xml.datatype.XMLGregorianCalendar lastDeployment = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public BigDecimal getId() {
    return id;
  }
  public void setId(BigDecimal id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("isEnabled")
  public Boolean getIsEnabled() {
    return isEnabled;
  }
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("repositoryManagerType")
  public String getRepositoryManagerType() {
    return repositoryManagerType;
  }
  public void setRepositoryManagerType(String repositoryManagerType) {
    this.repositoryManagerType = repositoryManagerType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("actionListenerType")
  public String getActionListenerType() {
    return actionListenerType;
  }
  public void setActionListenerType(String actionListenerType) {
    this.actionListenerType = actionListenerType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("configurationDeployerType")
  public String getConfigurationDeployerType() {
    return configurationDeployerType;
  }
  public void setConfigurationDeployerType(String configurationDeployerType) {
    this.configurationDeployerType = configurationDeployerType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("successfulDeployments")
  public Integer getSuccessfulDeployments() {
    return successfulDeployments;
  }
  public void setSuccessfulDeployments(Integer successfulDeployments) {
    this.successfulDeployments = successfulDeployments;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("failedDeployments")
  public Integer getFailedDeployments() {
    return failedDeployments;
  }
  public void setFailedDeployments(Integer failedDeployments) {
    this.failedDeployments = failedDeployments;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lastDeployment")
  public javax.xml.datatype.XMLGregorianCalendar getLastDeployment() {
    return lastDeployment;
  }
  public void setLastDeployment(javax.xml.datatype.XMLGregorianCalendar lastDeployment) {
    this.lastDeployment = lastDeployment;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteFetchConfigurationStatusDTO {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  isEnabled: ").append(isEnabled).append("\n");
    sb.append("  userName: ").append(userName).append("\n");
    sb.append("  repositoryManagerType: ").append(repositoryManagerType).append("\n");
    sb.append("  actionListenerType: ").append(actionListenerType).append("\n");
    sb.append("  configurationDeployerType: ").append(configurationDeployerType).append("\n");
    sb.append("  successfulDeployments: ").append(successfulDeployments).append("\n");
    sb.append("  failedDeployments: ").append(failedDeployments).append("\n");
    sb.append("  lastDeployment: ").append(lastDeployment).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
