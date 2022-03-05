package cn.kamikuz.nscalertracker.core.track;

import cn.kamikuz.nscalertracker.core.Meta;

public abstract class Connectable {
  public final char identifier = 0;
  Meta meta;

  public boolean canConnect(Connectable track) {
    return this.meta.brand().equals(track.meta.brand());
  }

  ;
}
