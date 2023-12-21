package dk.mtdm.world.tiles;

import dk.mtdm.display.DisplayInformationProvider;
import dk.mtdm.world.Location;

public abstract class Tile implements DisplayInformationProvider {
  private Location location;

  public Tile(Location location) {
    this.location = location;
  }

  public Location getLocation() {
    return location;
  }
}
