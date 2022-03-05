package cn.kamikuz.nscalertracker.core.track;

public class DimInfo {
  float length;
  float width;
  int curvature;
  float arcLength;

  public DimInfo(float length, float width) {
    this(length, width, 0, 0);
  }

  public DimInfo(float length, float width, int curvature, float arcLength) {
    this.length = length;
    this.width = width;
    this.curvature = curvature;
    this.arcLength = arcLength;
  }
}
