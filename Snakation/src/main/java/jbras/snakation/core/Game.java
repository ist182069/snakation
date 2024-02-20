package jbras.snakation.core;
public class Game {

    private int score = 0;
    private Snake snake;
    private Map map;

    public Game(Snake snake, Map map)
    {
        this.snake = snake;
        this.map = map;
    }

    public void start()
    {
        this.map.initTiles();
    }
}
