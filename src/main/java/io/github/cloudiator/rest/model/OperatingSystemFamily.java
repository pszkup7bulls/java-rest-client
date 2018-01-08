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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Type of OS Family
 */
@JsonAdapter(OperatingSystemFamily.Adapter.class)
public enum OperatingSystemFamily {
  
  UBUNTU("UBUNTU"),
  
  UNKOWN_OS_FAMILY("UNKOWN_OS_FAMILY"),
  
  AIX("AIX"),
  
  ARCH("ARCH"),
  
  CENTOS("CENTOS"),
  
  DARWIN("DARWIN"),
  
  DEBIAN("DEBIAN"),
  
  ESX("ESX"),
  
  FEDORA("FEDORA"),
  
  FREEBSD("FREEBSD"),
  
  GENTOO("GENTOO"),
  
  HPUX("HPUX"),
  
  COREOS("COREOS"),
  
  AMZN_LINUX("AMZN_LINUX"),
  
  MANDRIVA("MANDRIVA"),
  
  NETBSD("NETBSD"),
  
  OEL("OEL"),
  
  OPENBSD("OPENBSD"),
  
  RHEL("RHEL"),
  
  SCIENTIFIC("SCIENTIFIC"),
  
  CEL("CEL"),
  
  SLACKWARE("SLACKWARE"),
  
  SOLARIS("SOLARIS"),
  
  SUSE("SUSE"),
  
  TURBOLINUX("TURBOLINUX"),
  
  CLOUD_LINUX("CLOUD_LINUX"),
  
  WINDOWS("WINDOWS");

  private String value;

  OperatingSystemFamily(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OperatingSystemFamily fromValue(String text) {
    for (OperatingSystemFamily b : OperatingSystemFamily.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<OperatingSystemFamily> {
    @Override
    public void write(final JsonWriter jsonWriter, final OperatingSystemFamily enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OperatingSystemFamily read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OperatingSystemFamily.fromValue(String.valueOf(value));
    }
  }
}
