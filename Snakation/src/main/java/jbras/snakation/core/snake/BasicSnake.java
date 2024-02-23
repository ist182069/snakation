package jbras.snakation.core.snake;

public class BasicSnake extends Snake {
    public BasicSnake(int size, boolean alive)
    {
        this.size = size;
        this.alive = alive;
    }

    public void cry() {
        System.out.println("Basic cry!");
    }
}
