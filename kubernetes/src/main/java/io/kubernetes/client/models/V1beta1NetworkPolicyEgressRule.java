/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1beta1NetworkPolicyPeer;
import io.kubernetes.client.models.V1beta1NetworkPolicyPort;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NetworkPolicyEgressRule describes a particular set of traffic that is allowed out of pods matched by a NetworkPolicySpec&#39;s podSelector. The traffic must match both ports and to. This type is beta-level in 1.8
 */
@ApiModel(description = "NetworkPolicyEgressRule describes a particular set of traffic that is allowed out of pods matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and to. This type is beta-level in 1.8")

public class V1beta1NetworkPolicyEgressRule {
  @SerializedName("ports")
  private List<V1beta1NetworkPolicyPort> ports = null;

  @SerializedName("to")
  private List<V1beta1NetworkPolicyPeer> to = null;

  public V1beta1NetworkPolicyEgressRule ports(List<V1beta1NetworkPolicyPort> ports) {
    this.ports = ports;
    return this;
  }

  public V1beta1NetworkPolicyEgressRule addPortsItem(V1beta1NetworkPolicyPort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<V1beta1NetworkPolicyPort>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * List of destination ports for outgoing traffic. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
   * @return ports
  **/
  @ApiModelProperty(value = "List of destination ports for outgoing traffic. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.")
  public List<V1beta1NetworkPolicyPort> getPorts() {
    return ports;
  }

  public void setPorts(List<V1beta1NetworkPolicyPort> ports) {
    this.ports = ports;
  }

  public V1beta1NetworkPolicyEgressRule to(List<V1beta1NetworkPolicyPeer> to) {
    this.to = to;
    return this;
  }

  public V1beta1NetworkPolicyEgressRule addToItem(V1beta1NetworkPolicyPeer toItem) {
    if (this.to == null) {
      this.to = new ArrayList<V1beta1NetworkPolicyPeer>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * List of destinations for outgoing traffic of pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the to list.
   * @return to
  **/
  @ApiModelProperty(value = "List of destinations for outgoing traffic of pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the to list.")
  public List<V1beta1NetworkPolicyPeer> getTo() {
    return to;
  }

  public void setTo(List<V1beta1NetworkPolicyPeer> to) {
    this.to = to;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1NetworkPolicyEgressRule v1beta1NetworkPolicyEgressRule = (V1beta1NetworkPolicyEgressRule) o;
    return Objects.equals(this.ports, v1beta1NetworkPolicyEgressRule.ports) &&
        Objects.equals(this.to, v1beta1NetworkPolicyEgressRule.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ports, to);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1NetworkPolicyEgressRule {\n");
    
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

