package org.wso2.carbon.identity.remotefetch.core.endpoint.dto;

import java.math.BigDecimal;
import org.wso2.carbon.identity.remotefetch.core.endpoint.dto.RemoteFetchComponentDTO;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class RemoteFetchConfigurationDTO  {
  
  
  
  private BigDecimal id = null;
  
  
  private BigDecimal tenantId = null;
  
  @NotNull
  private Boolean isEnabled = null;
  
  @NotNull
  private String userName = null;
  
  
  private RemoteFetchComponentDTO repositoryManager = null;
  
  @NotNull
  private RemoteFetchComponentDTO actionListener = null;
  
  @NotNull
  private RemoteFetchComponentDTO configurationDeployer = null;

  
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
  @JsonProperty("tenantId")
  public BigDecimal getTenantId() {
    return tenantId;
  }
  public void setTenantId(BigDecimal tenantId) {
    this.tenantId = tenantId;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("isEnabled")
  public Boolean getIsEnabled() {
    return isEnabled;
  }
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
  @JsonProperty("repositoryManager")
  public RemoteFetchComponentDTO getRepositoryManager() {
    return repositoryManager;
  }
  public void setRepositoryManager(RemoteFetchComponentDTO repositoryManager) {
    this.repositoryManager = repositoryManager;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("actionListener")
  public RemoteFetchComponentDTO getActionListener() {
    return actionListener;
  }
  public void setActionListener(RemoteFetchComponentDTO actionListener) {
    this.actionListener = actionListener;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("configurationDeployer")
  public RemoteFetchComponentDTO getConfigurationDeployer() {
    return configurationDeployer;
  }
  public void setConfigurationDeployer(RemoteFetchComponentDTO configurationDeployer) {
    this.configurationDeployer = configurationDeployer;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteFetchConfigurationDTO {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  tenantId: ").append(tenantId).append("\n");
    sb.append("  isEnabled: ").append(isEnabled).append("\n");
    sb.append("  userName: ").append(userName).append("\n");
    sb.append("  repositoryManager: ").append(repositoryManager).append("\n");
    sb.append("  actionListener: ").append(actionListener).append("\n");
    sb.append("  configurationDeployer: ").append(configurationDeployer).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
