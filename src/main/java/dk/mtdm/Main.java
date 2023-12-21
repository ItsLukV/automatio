package dk.mtdm;

import java.lang.System.Logger;

import dk.mtdm.display.tui.CommandTUI;
import dk.mtdm.display.tui.Display;
import dk.mtdm.world.Map;

public class Main {
    public static void main(String[] args) {
        CommandTUI.clearAll();
        Map.getMap().getGroundTiles().forEach((key,value) -> {
            Display.draw(value);
        });
        System.out.print(CommandTUI.RESET);
    }
}
