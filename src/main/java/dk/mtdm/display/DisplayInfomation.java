package dk.mtdm.display;

import java.awt.Color;

public class DisplayInfomation {
    private char c;
    private Color color;
    public DisplayInfomation(char c, Color color) {
        this.c = c;
        this.color = color;
    }

    public char getChar() {
        return c;
    }

    public Color getColor() {
        return color;
    }
}
