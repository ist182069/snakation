package jbras.snakation.core;

public class Snake {

    int[] head_position;
    int size;
    boolean alive;

    public Snake(int size, boolean alive)
    {
        this.size = size;
        this.alive = alive;
    }

    public int[] getHeadPosition()
    {
        return this.head_position;
    }

    public void setHeadPosition(int[] position)
    {
        this.head_position = position;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
