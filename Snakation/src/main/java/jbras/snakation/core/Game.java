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
        this.displayMap();
    }

    private void displayMap()
    {
        char[][] layout = this.map.getLayout();
        for (int i = 0; i < layout.length; i++)
        {
            for (int j = 0; j < layout[i].length; j++)
            {
                System.out.print(layout[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
