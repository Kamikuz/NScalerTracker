package cn.kamikuz.nscalertracker.core.track;

public class ConverterTrack extends Track {
  public final static char identifier = 'B';

  @Override
  public boolean canConnect(Connectable track) {
    return true;
  }
}
