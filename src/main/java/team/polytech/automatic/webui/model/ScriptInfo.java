/*
 * FastAPI
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package team.polytech.automatic.webui.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import team.polytech.automatic.webui.model.ScriptArg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ScriptInfo
 */
@JsonPropertyOrder({
  ScriptInfo.JSON_PROPERTY_NAME,
  ScriptInfo.JSON_PROPERTY_IS_ALWAYSON,
  ScriptInfo.JSON_PROPERTY_IS_IMG2IMG,
  ScriptInfo.JSON_PROPERTY_ARGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-27T01:31:55.639766089+03:00[Europe/Moscow]")
public class ScriptInfo {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_IS_ALWAYSON = "is_alwayson";
  private Boolean isAlwayson;

  public static final String JSON_PROPERTY_IS_IMG2IMG = "is_img2img";
  private Boolean isImg2img;

  public static final String JSON_PROPERTY_ARGS = "args";
  private List<ScriptArg> args = new ArrayList<>();

  public ScriptInfo() {
  }

  public ScriptInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Script name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ScriptInfo isAlwayson(Boolean isAlwayson) {
    
    this.isAlwayson = isAlwayson;
    return this;
  }

   /**
   * Flag specifying whether this script is an alwayson script
   * @return isAlwayson
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ALWAYSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAlwayson() {
    return isAlwayson;
  }


  @JsonProperty(JSON_PROPERTY_IS_ALWAYSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsAlwayson(Boolean isAlwayson) {
    this.isAlwayson = isAlwayson;
  }


  public ScriptInfo isImg2img(Boolean isImg2img) {
    
    this.isImg2img = isImg2img;
    return this;
  }

   /**
   * Flag specifying whether this script is an img2img script
   * @return isImg2img
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_IMG2IMG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsImg2img() {
    return isImg2img;
  }


  @JsonProperty(JSON_PROPERTY_IS_IMG2IMG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsImg2img(Boolean isImg2img) {
    this.isImg2img = isImg2img;
  }


  public ScriptInfo args(List<ScriptArg> args) {
    
    this.args = args;
    return this;
  }

  public ScriptInfo addArgsItem(ScriptArg argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * List of script&#39;s arguments
   * @return args
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ARGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ScriptArg> getArgs() {
    return args;
  }


  @JsonProperty(JSON_PROPERTY_ARGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setArgs(List<ScriptArg> args) {
    this.args = args;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScriptInfo scriptInfo = (ScriptInfo) o;
    return Objects.equals(this.name, scriptInfo.name) &&
        Objects.equals(this.isAlwayson, scriptInfo.isAlwayson) &&
        Objects.equals(this.isImg2img, scriptInfo.isImg2img) &&
        Objects.equals(this.args, scriptInfo.args);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isAlwayson, isImg2img, args);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScriptInfo {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isAlwayson: ").append(toIndentedString(isAlwayson)).append("\n");
    sb.append("    isImg2img: ").append(toIndentedString(isImg2img)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
