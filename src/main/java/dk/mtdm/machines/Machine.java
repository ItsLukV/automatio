package dk.mtdm.machines;

import dk.mtdm.world.Location;
import dk.mtdm.world.tiles.ComponentTile;

abstract class Machine extends ComponentTile{
    public Machine(Location location) {
        super(location);
    }
}
