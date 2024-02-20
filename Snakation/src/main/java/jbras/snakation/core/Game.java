package jbras.snakation.core;

import java.util.Random;
import java.util.Scanner;

public class Game {

    Point point = new Point(1);
    Random random = new Random();
    Scanner input = new Scanner(System.in);
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
        map.initTiles();

        this.spawnSnake();
        this.map.updateTilesWithSnake(this.snake);

        this.spawnPoint();
        this.map.updateTilesWithPoint(this.point);

        this.displayMap();
        while (true)
        {
            int[] move = this.inputMove();
            calculateNextPosition(move);
            this.map.updateTilesWithSnake(this.snake);
            displayMap();
        }
    }

    private void calculateNextPosition(int[] move)
    {
        int[] snakeTile = this.snake.getPosition();
        int move_v = move[0] + snakeTile[0];
        int move_h = move[1] + snakeTile[1];
        setSnakePosition(new int[]{move_v, move_h});
    }

    private void displayMap()
    {
        char[][] layout = this.map.getLayout();
        for (char[] rows : layout) {
            for (char tile : rows) {
                System.out.print(tile + "\t");
            }
            System.out.println();
        }
    }

    private void spawnSnake()
    {
        int v = random.nextInt(this.map.getSize_v());
        int h = random.nextInt(this.map.getSize_h());
        setSnakePosition(new int[]{v, h});
    }

    private void spawnPoint()
    {
        int[] snake_pos = this.snake.getPosition();
        int v, h;
        do
        {
            v = random.nextInt(this.map.getSize_v());
            h = random.nextInt(this.map.getSize_h());
        }
        while (v == snake_pos[0] || h == snake_pos[1]);
        this.setPointPosition(new int[]{v, h});
    }

    private void setSnakePosition(int[] position)
    {
        snake.setPosition(position);
    }

    private void setPointPosition(int[] position)
    {
        point.setPosition(position);
    }

    private int[] inputMove()
    {
        System.out.print("Enter your move: ");
        String move = input.nextLine();
        int[] directions = new int[2];

        switch (move)
        {
            case "w":
                directions = new int[]{1, 0};
                break;
            case "a":
                directions = new int[]{-1, 0};
                break;
            case "d":
                directions = new int[]{0, 1};
                break;
            case "s":
                directions = new int[]{0, -1};
                break;
            default:
                System.exit(-1);
                System.out.println("A valid move must be inputted!");
        }
        return directions;
    }
}
