package jbras.snakation.core.snake;

public abstract class Snake {
    int[] head_position;
    int size;
    boolean alive;

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

    public abstract void cry();
}
