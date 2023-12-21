package dk.mtdm.display.tui;

import dk.mtdm.world.tiles.*;

import java.io.IOException;
import java.awt.Color;
import dk.mtdm.world.Location;

/**
 * Printer
 */
public class Display {
  static int  width = -1;
  static int height = -1;
  static int maxRun = 1000;
  static int run = maxRun;
  public static boolean draw(Tile target){
    // if(run >= maxRun){
    //   try {
    //     width = org.jline.terminal.TerminalBuilder.terminal().getWidth();
    //     height = org.jline.terminal.TerminalBuilder.terminal().getHeight();
    //   } catch (IOException ignore) {}
    //   maxRun = 0;
    // }
    Location l = target.getLocation();
    if(l.getX() < 0 ||l.getY() < 0) return false;
    CommandTUI.setPoint(l.getX(),l.getY());
    Color col = target.getDisplayInfomation().getColor();
    System.out.print(CommandTUI.getColor(col.getRed(),col.getGreen(),col.getBlue()) + target.getDisplayInfomation().getChar());
    maxRun++;
    return true;
  }
}
