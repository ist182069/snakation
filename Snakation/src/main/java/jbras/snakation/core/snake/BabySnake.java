package jbras.snakation.core.snake;

public class BabySnake extends BasicSnake {

    int blankets;
    public BabySnake(int size, boolean alive, int blankets)
    {
        super(size, alive);
        this.blankets = blankets;
    }

    @Override
    public void cry() {
        super.cry();
        System.out.println("but I cry more");
    }
}
