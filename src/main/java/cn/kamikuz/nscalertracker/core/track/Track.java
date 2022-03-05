package cn.kamikuz.nscalertracker.core.track;

public class Track extends Connectable {
  public final static char identifier = 'B';
  DimInfo dim;

  Connectable port_1 = null;
  Connectable port_2 = null;
}
