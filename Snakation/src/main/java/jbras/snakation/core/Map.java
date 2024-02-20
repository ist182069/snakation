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

    public void updateTilesWithSnake(Snake snake)
    {
        int[] snake_pos = snake.getPosition();
        int pos_v = snake_pos[0];
        int pos_h = snake_pos[1];
        layout[pos_v][pos_h] = 'O';
    }

    public void updateTilesWithPoint(Point point)
    {
        int[] point_pos = point.getPosition();
        int pos_v = point_pos[0];
        int pos_h = point_pos[1];
        layout[pos_v][pos_h] = '#';
    }
}
