package dk.mtdm.world.tiles.tilePrefab;

import java.awt.Color;
import java.util.Locale;
import java.util.Random;

import dk.mtdm.display.DisplayInfomation;
import dk.mtdm.world.Location;
import dk.mtdm.world.Map;
import dk.mtdm.world.tiles.BlockingGroundTile;

public class GroundTilePrefab extends BlockingGroundTile{
    public GroundTilePrefab(Location location) {
        super(location);
    }

    @Override
    public DisplayInfomation getDisplayInfomation() {
        return new DisplayInfomation('*', Math.random() > 0.5 ? Color.GREEN : Color.CYAN);
    }

}
