package jbras.snakation.core;

public class Snake {

    int[] head_position;
    int size;
    public Snake(int size)
    {
        this.size = size;
    }

    public int[] getHeadPosition()
    {
        return this.head_position;
    }

    public void setHeadPosition(int[] position)
    {
        this.head_position = position;
    }
}
