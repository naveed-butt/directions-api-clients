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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * GHMatrixRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T12:21:02.048+11:00")
public class GHMatrixRequest {
  @SerializedName("points")
  private List<List<Double>> points = new ArrayList<List<Double>>();

  @SerializedName("from_points")
  private String fromPoints = null;

  @SerializedName("to_points")
  private String toPoints = null;

  @SerializedName("out_arrays")
  private List<String> outArrays = new ArrayList<String>();

  @SerializedName("vehicle")
  private String vehicle = null;

  public GHMatrixRequest points(List<List<Double>> points) {
    this.points = points;
    return this;
  }

  public GHMatrixRequest addPointsItem(List<Double> pointsItem) {
    this.points.add(pointsItem);
    return this;
  }

   /**
   * Specifiy multiple points for which the weight-, route-, time- or distance-matrix should be calculated. In this case the starts are identical to the destinations. If there are N points, then NxN entries will be calculated. The order of the point parameter is important. Specify at least three points. Cannot be used together with from_point or to_point. Is a string with the format longitude,latitude.
   * @return points
  **/
  @ApiModelProperty(example = "null", value = "Specifiy multiple points for which the weight-, route-, time- or distance-matrix should be calculated. In this case the starts are identical to the destinations. If there are N points, then NxN entries will be calculated. The order of the point parameter is important. Specify at least three points. Cannot be used together with from_point or to_point. Is a string with the format longitude,latitude.")
  public List<List<Double>> getPoints() {
    return points;
  }

  public void setPoints(List<List<Double>> points) {
    this.points = points;
  }

  public GHMatrixRequest fromPoints(String fromPoints) {
    this.fromPoints = fromPoints;
    return this;
  }

   /**
   * The starting points for the routes. E.g. if you want to calculate the three routes A-&gt;1, A-&gt;2, A-&gt;3 then you have one from_point parameter and three to_point parameters. Is a string with the format longitude,latitude.
   * @return fromPoints
  **/
  @ApiModelProperty(example = "null", value = "The starting points for the routes. E.g. if you want to calculate the three routes A-&gt;1, A-&gt;2, A-&gt;3 then you have one from_point parameter and three to_point parameters. Is a string with the format longitude,latitude.")
  public String getFromPoints() {
    return fromPoints;
  }

  public void setFromPoints(String fromPoints) {
    this.fromPoints = fromPoints;
  }

  public GHMatrixRequest toPoints(String toPoints) {
    this.toPoints = toPoints;
    return this;
  }

   /**
   * The destination points for the routes. Is a string with the format longitude,latitude.
   * @return toPoints
  **/
  @ApiModelProperty(example = "null", value = "The destination points for the routes. Is a string with the format longitude,latitude.")
  public String getToPoints() {
    return toPoints;
  }

  public void setToPoints(String toPoints) {
    this.toPoints = toPoints;
  }

  public GHMatrixRequest outArrays(List<String> outArrays) {
    this.outArrays = outArrays;
    return this;
  }

  public GHMatrixRequest addOutArraysItem(String outArraysItem) {
    this.outArrays.add(outArraysItem);
    return this;
  }

   /**
   * Specifies which arrays should be included in the response. Specify one or more of the following options 'weights', 'times', 'distances'. To specify more than one array use e.g. out_array=times&amp;out_array=distances. The units of the entries of distances are meters, of times are seconds and of weights is arbitrary and it can differ for different vehicles or versions of this API.
   * @return outArrays
  **/
  @ApiModelProperty(example = "null", value = "Specifies which arrays should be included in the response. Specify one or more of the following options 'weights', 'times', 'distances'. To specify more than one array use e.g. out_array=times&amp;out_array=distances. The units of the entries of distances are meters, of times are seconds and of weights is arbitrary and it can differ for different vehicles or versions of this API.")
  public List<String> getOutArrays() {
    return outArrays;
  }

  public void setOutArrays(List<String> outArrays) {
    this.outArrays = outArrays;
  }

  public GHMatrixRequest vehicle(String vehicle) {
    this.vehicle = vehicle;
    return this;
  }

   /**
   * The vehicle for which the route should be calculated. Other vehicles are foot, bike, mtb, racingbike, motorcycle, small_truck, bus and truck. See here for the details.
   * @return vehicle
  **/
  @ApiModelProperty(example = "null", value = "The vehicle for which the route should be calculated. Other vehicles are foot, bike, mtb, racingbike, motorcycle, small_truck, bus and truck. See here for the details.")
  public String getVehicle() {
    return vehicle;
  }

  public void setVehicle(String vehicle) {
    this.vehicle = vehicle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GHMatrixRequest ghMatrixRequest = (GHMatrixRequest) o;
    return Objects.equals(this.points, ghMatrixRequest.points) &&
        Objects.equals(this.fromPoints, ghMatrixRequest.fromPoints) &&
        Objects.equals(this.toPoints, ghMatrixRequest.toPoints) &&
        Objects.equals(this.outArrays, ghMatrixRequest.outArrays) &&
        Objects.equals(this.vehicle, ghMatrixRequest.vehicle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(points, fromPoints, toPoints, outArrays, vehicle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GHMatrixRequest {\n");
    
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    fromPoints: ").append(toIndentedString(fromPoints)).append("\n");
    sb.append("    toPoints: ").append(toIndentedString(toPoints)).append("\n");
    sb.append("    outArrays: ").append(toIndentedString(outArrays)).append("\n");
    sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
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

