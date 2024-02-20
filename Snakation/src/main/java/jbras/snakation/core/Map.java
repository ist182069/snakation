package jbras.snakation.core;

import java.util.Arrays;

public class Map {

    int size_h;
    int size_v;
    final char[][] layout;
    public Map(int size_h, int size_v)
    {
        this.size_h = size_h;
        this.size_v = size_v;
        this.layout = new char[this.size_h][this.size_v];
    }

    public void initTiles()
    {
        for (char[] chars : layout) {
            Arrays.fill(chars, ' ');
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

    public int getSize_h()
    {
        return this.size_h;
    }

    public int getSize_v()
    {
        return this.size_v;
    }

    public void updateTile(int[] pos, char tile)
    {
        int pos_v = pos[0];
        int pos_h = pos[1];
        layout[pos_v][pos_h] = tile;
    }
}
