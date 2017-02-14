/*
 * GraphHopper Directions API
 * With the GraphHopper Directions API you get reliable and fast web services for routing and more with world wide coverage. We offer A-to-B routing via the Routing API optionally with turn instructions and elevation data as well as route optimization with various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API. 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.graphhopper.directions.api.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.graphhopper.directions.api.client.model.GHResponseCoordinates;
import com.graphhopper.directions.api.client.model.GHResponseInstructions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * A found path
 */
@ApiModel(description = "A found path")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T12:21:02.048+11:00")
public class GHRouteResponsePath {
  @SerializedName("distance")
  private Double distance = null;

  @SerializedName("time")
  private Long time = null;

  @SerializedName("ascend")
  private Double ascend = null;

  @SerializedName("descend")
  private Double descend = null;

  @SerializedName("points")
  private GHResponseCoordinates points = null;

  @SerializedName("points_encoded")
  private Boolean pointsEncoded = null;

  @SerializedName("bbox")
  private List<Double> bbox = new ArrayList<Double>();

  @SerializedName("snapped_waypoints")
  private GHResponseCoordinates snappedWaypoints = null;

  @SerializedName("instructions")
  private GHResponseInstructions instructions = null;

  public GHRouteResponsePath distance(Double distance) {
    this.distance = distance;
    return this;
  }

   /**
   * The total distance of the route, in meter
   * @return distance
  **/
  @ApiModelProperty(example = "null", value = "The total distance of the route, in meter")
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public GHRouteResponsePath time(Long time) {
    this.time = time;
    return this;
  }

   /**
   * The total time of the route, in ms
   * @return time
  **/
  @ApiModelProperty(example = "null", value = "The total time of the route, in ms")
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public GHRouteResponsePath ascend(Double ascend) {
    this.ascend = ascend;
    return this;
  }

   /**
   * Get ascend
   * @return ascend
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getAscend() {
    return ascend;
  }

  public void setAscend(Double ascend) {
    this.ascend = ascend;
  }

  public GHRouteResponsePath descend(Double descend) {
    this.descend = descend;
    return this;
  }

   /**
   * The total descend (downhill) of the route, in meter
   * @return descend
  **/
  @ApiModelProperty(example = "null", value = "The total descend (downhill) of the route, in meter")
  public Double getDescend() {
    return descend;
  }

  public void setDescend(Double descend) {
    this.descend = descend;
  }

  public GHRouteResponsePath points(GHResponseCoordinates points) {
    this.points = points;
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  @ApiModelProperty(example = "null", value = "")
  public GHResponseCoordinates getPoints() {
    return points;
  }

  public void setPoints(GHResponseCoordinates points) {
    this.points = points;
  }

  public GHRouteResponsePath pointsEncoded(Boolean pointsEncoded) {
    this.pointsEncoded = pointsEncoded;
    return this;
  }

   /**
   * Is true if the points are encoded, if not paths[0].points contains the geo json of the path (then order is lon,lat,elevation), which is easier to handle but consumes more bandwidth compared to encoded version
   * @return pointsEncoded
  **/
  @ApiModelProperty(example = "null", value = "Is true if the points are encoded, if not paths[0].points contains the geo json of the path (then order is lon,lat,elevation), which is easier to handle but consumes more bandwidth compared to encoded version")
  public Boolean getPointsEncoded() {
    return pointsEncoded;
  }

  public void setPointsEncoded(Boolean pointsEncoded) {
    this.pointsEncoded = pointsEncoded;
  }

  public GHRouteResponsePath bbox(List<Double> bbox) {
    this.bbox = bbox;
    return this;
  }

  public GHRouteResponsePath addBboxItem(Double bboxItem) {
    this.bbox.add(bboxItem);
    return this;
  }

   /**
   * The bounding box of the route, format <br> minLon, minLat, maxLon, maxLat
   * @return bbox
  **/
  @ApiModelProperty(example = "null", value = "The bounding box of the route, format <br> minLon, minLat, maxLon, maxLat")
  public List<Double> getBbox() {
    return bbox;
  }

  public void setBbox(List<Double> bbox) {
    this.bbox = bbox;
  }

  public GHRouteResponsePath snappedWaypoints(GHResponseCoordinates snappedWaypoints) {
    this.snappedWaypoints = snappedWaypoints;
    return this;
  }

   /**
   * Get snappedWaypoints
   * @return snappedWaypoints
  **/
  @ApiModelProperty(example = "null", value = "")
  public GHResponseCoordinates getSnappedWaypoints() {
    return snappedWaypoints;
  }

  public void setSnappedWaypoints(GHResponseCoordinates snappedWaypoints) {
    this.snappedWaypoints = snappedWaypoints;
  }

  public GHRouteResponsePath instructions(GHResponseInstructions instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * Get instructions
   * @return instructions
  **/
  @ApiModelProperty(example = "null", value = "")
  public GHResponseInstructions getInstructions() {
    return instructions;
  }

  public void setInstructions(GHResponseInstructions instructions) {
    this.instructions = instructions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GHRouteResponsePath ghRouteResponsePath = (GHRouteResponsePath) o;
    return Objects.equals(this.distance, ghRouteResponsePath.distance) &&
        Objects.equals(this.time, ghRouteResponsePath.time) &&
        Objects.equals(this.ascend, ghRouteResponsePath.ascend) &&
        Objects.equals(this.descend, ghRouteResponsePath.descend) &&
        Objects.equals(this.points, ghRouteResponsePath.points) &&
        Objects.equals(this.pointsEncoded, ghRouteResponsePath.pointsEncoded) &&
        Objects.equals(this.bbox, ghRouteResponsePath.bbox) &&
        Objects.equals(this.snappedWaypoints, ghRouteResponsePath.snappedWaypoints) &&
        Objects.equals(this.instructions, ghRouteResponsePath.instructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distance, time, ascend, descend, points, pointsEncoded, bbox, snappedWaypoints, instructions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GHRouteResponsePath {\n");
    
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    ascend: ").append(toIndentedString(ascend)).append("\n");
    sb.append("    descend: ").append(toIndentedString(descend)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    pointsEncoded: ").append(toIndentedString(pointsEncoded)).append("\n");
    sb.append("    bbox: ").append(toIndentedString(bbox)).append("\n");
    sb.append("    snappedWaypoints: ").append(toIndentedString(snappedWaypoints)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
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

