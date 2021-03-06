/*
 * Cloudiator REST Api
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.2.0
 * Contact: daniel.baur@uni-ulm.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.github.cloudiator.rest.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.cloudiator.rest.model.Requirement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Subtype of Requirement 
 */
@ApiModel(description = "Subtype of Requirement ")

public class IdentifierRequirement extends Requirement {
  @SerializedName("hardwareId")
  private String hardwareId = null;

  @SerializedName("locationId")
  private String locationId = null;

  @SerializedName("imageId")
  private String imageId = null;

  public IdentifierRequirement hardwareId(String hardwareId) {
    this.hardwareId = hardwareId;
    return this;
  }

   /**
   * Get hardwareId
   * @return hardwareId
  **/
  @ApiModelProperty(value = "")
  public String getHardwareId() {
    return hardwareId;
  }

  public void setHardwareId(String hardwareId) {
    this.hardwareId = hardwareId;
  }

  public IdentifierRequirement locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Get locationId
   * @return locationId
  **/
  @ApiModelProperty(value = "")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public IdentifierRequirement imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * Get imageId
   * @return imageId
  **/
  @ApiModelProperty(value = "")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentifierRequirement identifierRequirement = (IdentifierRequirement) o;
    return Objects.equals(this.hardwareId, identifierRequirement.hardwareId) &&
        Objects.equals(this.locationId, identifierRequirement.locationId) &&
        Objects.equals(this.imageId, identifierRequirement.imageId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hardwareId, locationId, imageId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentifierRequirement {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    hardwareId: ").append(toIndentedString(hardwareId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
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

