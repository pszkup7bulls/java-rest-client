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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents a request to create a new virtual machine. 
 */
@ApiModel(description = "Represents a request to create a new virtual machine. ")

public class VirtualMachineRequest {
  @SerializedName("image")
  private String image = null;

  @SerializedName("hardware")
  private String hardware = null;

  @SerializedName("location")
  private String location = null;

  public VirtualMachineRequest image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(example = "01101b2075b7046fff5eaa9beae14ccd:RegionOne/72a4b00b-705f-4290-a4de-c79eddc03fe3", value = "")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public VirtualMachineRequest hardware(String hardware) {
    this.hardware = hardware;
    return this;
  }

   /**
   * Get hardware
   * @return hardware
  **/
  @ApiModelProperty(example = "01101b2075b7046fff5eaa9beae14ccd:RegionOne/3", value = "")
  public String getHardware() {
    return hardware;
  }

  public void setHardware(String hardware) {
    this.hardware = hardware;
  }

  public VirtualMachineRequest location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(example = "01101b2075b7046fff5eaa9beae14ccd:RegionOne", value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualMachineRequest virtualMachineRequest = (VirtualMachineRequest) o;
    return Objects.equals(this.image, virtualMachineRequest.image) &&
        Objects.equals(this.hardware, virtualMachineRequest.hardware) &&
        Objects.equals(this.location, virtualMachineRequest.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, hardware, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualMachineRequest {\n");
    
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    hardware: ").append(toIndentedString(hardware)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

