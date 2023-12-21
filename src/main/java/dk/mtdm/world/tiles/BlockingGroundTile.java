package dk.mtdm.world.tiles;

import dk.mtdm.world.Location;

public abstract class BlockingGroundTile  extends GroundTile implements BlockingTile {

    public BlockingGroundTile(Location location) {
        super(location);
    }


}
