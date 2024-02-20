package jbras.snakation.core;

public class Snake {

    int[] position;
    int size;
    public Snake(int size)
    {
        this.size = size;
    }

    public int[] getPosition()
    {
        return this.position;
    }

    public void setPosition(int[] position)
    {
        this.position = position;
    }
}
