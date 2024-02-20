package jbras.snakation.core;

import java.util.Arrays;

public class Map {

    final char[][] layout;
    public Map(int size_h, int size_v)
    {
        this.layout = new char[size_h][size_v];
    }

    public void initTiles()
    {
        for (char[] chars : layout) {
            Arrays.fill(chars, '0');
        }
    }

    public char[][] getLayout()
    {
        return this.layout;
    }

    /*
    public void setLayout(char[][] layout)
    {
        this.layout = layout;
    }
     */
}
