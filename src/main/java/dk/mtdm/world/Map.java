package dk.mtdm.world;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dk.mtdm.Key;
import dk.mtdm.world.entity.Entity;
import dk.mtdm.world.tiles.ComponentTile;
import dk.mtdm.world.tiles.GroundTile;
import dk.mtdm.world.tiles.tilePrefab.GroundTilePrefab;

public class Map {
    private static Map instance;
    private final HashMap<Key<Integer>, GroundTile> groundTiles = new HashMap<>();
    private final HashMap<Key<Integer>, ComponentTile> componentTiles = new HashMap<>();

    private final ArrayList<Entity> entities = new ArrayList<>();

    public Map(int initSize) {
        for (int x = -initSize; x < initSize; x++) {
            for (int y = -initSize; y < initSize; y++) {
                groundTiles.put(new Key<Integer>(x, y), new GroundTilePrefab(new Location(x, y)) {
                });
            }
        }
    }

    public static Map getMap() {
        if (instance == null) {
            instance = new Map(10);
        }
        return instance;
    }

    public HashMap<Key<Integer>, GroundTile> getGroundTiles() {
        return groundTiles;
    }
}
