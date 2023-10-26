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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Estimation
 */
@JsonPropertyOrder({
  Estimation.JSON_PROPERTY_MSG,
  Estimation.JSON_PROPERTY_RANK,
  Estimation.JSON_PROPERTY_QUEUE_SIZE,
  Estimation.JSON_PROPERTY_AVG_EVENT_PROCESS_TIME,
  Estimation.JSON_PROPERTY_AVG_EVENT_CONCURRENT_PROCESS_TIME,
  Estimation.JSON_PROPERTY_RANK_ETA,
  Estimation.JSON_PROPERTY_QUEUE_ETA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-27T01:31:55.639766089+03:00[Europe/Moscow]")
public class Estimation {
  public static final String JSON_PROPERTY_MSG = "msg";
  private String msg = "estimation";

  public static final String JSON_PROPERTY_RANK = "rank";
  private Integer rank;

  public static final String JSON_PROPERTY_QUEUE_SIZE = "queue_size";
  private Integer queueSize;

  public static final String JSON_PROPERTY_AVG_EVENT_PROCESS_TIME = "avg_event_process_time";
  private BigDecimal avgEventProcessTime;

  public static final String JSON_PROPERTY_AVG_EVENT_CONCURRENT_PROCESS_TIME = "avg_event_concurrent_process_time";
  private BigDecimal avgEventConcurrentProcessTime;

  public static final String JSON_PROPERTY_RANK_ETA = "rank_eta";
  private BigDecimal rankEta;

  public static final String JSON_PROPERTY_QUEUE_ETA = "queue_eta";
  private BigDecimal queueEta;

  public Estimation() {
  }

  public Estimation msg(String msg) {
    
    this.msg = msg;
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MSG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMsg() {
    return msg;
  }


  @JsonProperty(JSON_PROPERTY_MSG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMsg(String msg) {
    this.msg = msg;
  }


  public Estimation rank(Integer rank) {
    
    this.rank = rank;
    return this;
  }

   /**
   * Get rank
   * @return rank
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRank() {
    return rank;
  }


  @JsonProperty(JSON_PROPERTY_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRank(Integer rank) {
    this.rank = rank;
  }


  public Estimation queueSize(Integer queueSize) {
    
    this.queueSize = queueSize;
    return this;
  }

   /**
   * Get queueSize
   * @return queueSize
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUEUE_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getQueueSize() {
    return queueSize;
  }


  @JsonProperty(JSON_PROPERTY_QUEUE_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQueueSize(Integer queueSize) {
    this.queueSize = queueSize;
  }


  public Estimation avgEventProcessTime(BigDecimal avgEventProcessTime) {
    
    this.avgEventProcessTime = avgEventProcessTime;
    return this;
  }

   /**
   * Get avgEventProcessTime
   * @return avgEventProcessTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVG_EVENT_PROCESS_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAvgEventProcessTime() {
    return avgEventProcessTime;
  }


  @JsonProperty(JSON_PROPERTY_AVG_EVENT_PROCESS_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvgEventProcessTime(BigDecimal avgEventProcessTime) {
    this.avgEventProcessTime = avgEventProcessTime;
  }


  public Estimation avgEventConcurrentProcessTime(BigDecimal avgEventConcurrentProcessTime) {
    
    this.avgEventConcurrentProcessTime = avgEventConcurrentProcessTime;
    return this;
  }

   /**
   * Get avgEventConcurrentProcessTime
   * @return avgEventConcurrentProcessTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVG_EVENT_CONCURRENT_PROCESS_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAvgEventConcurrentProcessTime() {
    return avgEventConcurrentProcessTime;
  }


  @JsonProperty(JSON_PROPERTY_AVG_EVENT_CONCURRENT_PROCESS_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvgEventConcurrentProcessTime(BigDecimal avgEventConcurrentProcessTime) {
    this.avgEventConcurrentProcessTime = avgEventConcurrentProcessTime;
  }


  public Estimation rankEta(BigDecimal rankEta) {
    
    this.rankEta = rankEta;
    return this;
  }

   /**
   * Get rankEta
   * @return rankEta
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RANK_ETA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRankEta() {
    return rankEta;
  }


  @JsonProperty(JSON_PROPERTY_RANK_ETA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRankEta(BigDecimal rankEta) {
    this.rankEta = rankEta;
  }


  public Estimation queueEta(BigDecimal queueEta) {
    
    this.queueEta = queueEta;
    return this;
  }

   /**
   * Get queueEta
   * @return queueEta
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUEUE_ETA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getQueueEta() {
    return queueEta;
  }


  @JsonProperty(JSON_PROPERTY_QUEUE_ETA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQueueEta(BigDecimal queueEta) {
    this.queueEta = queueEta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Estimation estimation = (Estimation) o;
    return Objects.equals(this.msg, estimation.msg) &&
        Objects.equals(this.rank, estimation.rank) &&
        Objects.equals(this.queueSize, estimation.queueSize) &&
        Objects.equals(this.avgEventProcessTime, estimation.avgEventProcessTime) &&
        Objects.equals(this.avgEventConcurrentProcessTime, estimation.avgEventConcurrentProcessTime) &&
        Objects.equals(this.rankEta, estimation.rankEta) &&
        Objects.equals(this.queueEta, estimation.queueEta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msg, rank, queueSize, avgEventProcessTime, avgEventConcurrentProcessTime, rankEta, queueEta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Estimation {\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    queueSize: ").append(toIndentedString(queueSize)).append("\n");
    sb.append("    avgEventProcessTime: ").append(toIndentedString(avgEventProcessTime)).append("\n");
    sb.append("    avgEventConcurrentProcessTime: ").append(toIndentedString(avgEventConcurrentProcessTime)).append("\n");
    sb.append("    rankEta: ").append(toIndentedString(rankEta)).append("\n");
    sb.append("    queueEta: ").append(toIndentedString(queueEta)).append("\n");
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
