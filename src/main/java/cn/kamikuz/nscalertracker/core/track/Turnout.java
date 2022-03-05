package cn.kamikuz.nscalertracker.core.track;

import java.util.Map;

public class Turnout extends Connectable {
  public final static char identifier = 'T';
  boolean powered;

  Map<Connectable, DimInfo> branches;


  @Override
  public boolean canConnect(Connectable track) {
    return this.meta.brand().equals(track.meta.brand());
  }
}
