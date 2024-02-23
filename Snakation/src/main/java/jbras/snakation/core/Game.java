package jbras.snakation.core;

import jbras.snakation.core.snake.Snake;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;
import java.util.Scanner;


public class Game {

    private Point point = new Point(1);
    private Random random = new Random();
    private Scanner input;
    private int score = 0;
    private Snake snake;
    private Map map;
    private Player player;

    public Game(Snake snake, Map map, Player player, Scanner input)
    {
        this.snake = snake;
        this.map = map;
        this.player = player;
        this.input = input;
    }

    @Bean
    public void start()
    {

        map.initTiles();

        this.spawnSnake();
        int[] spawnSnakeTile = this.snake.getHeadPosition();
        this.map.updateTile(spawnSnakeTile, 'O');

        this.spawnPoint(spawnSnakeTile);
        this.map.updateTile(this.point.getPosition(), '#');

        this.displayMap();
        while (this.snake.isAlive())
        {
            System.out.println(this.player.getId() + "'s current score: " + score);
            int[] move = this.inputMove();

            int[] currSnakeTile = this.snake.getHeadPosition();
            this.map.updateTile(currSnakeTile, ' ');

            calculateNextPosition(move, currSnakeTile);

            int[] newSnakeTile = this.snake.getHeadPosition();
            this.map.updateTile(newSnakeTile, 'O');

            if (this.pointEaten(newSnakeTile, this.point.getPosition()))
            {
                this.spawnPoint(newSnakeTile);
                this.map.updateTile(this.point.getPosition(), '#');
                score++;
                this.player.setLatest_score(score);
            }
            displayMap();
        }

    }

    private boolean pointEaten(int[] snake_pos, int[] point_pos)
    {
        return snake_pos[0] == point_pos[0] && snake_pos[1] == point_pos[1];
    }

    private void calculateNextPosition(int[] move, int[] snakeTile)
    {
        int move_v = move[0] + snakeTile[0];
        int move_h = move[1] + snakeTile[1];
        this.setSnakePosition(new int[]{move_v, move_h});
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

    private void spawnPoint(int[] snake_pos)
    {
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
        snake.setHeadPosition(position);
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
                directions = new int[]{-1, 0};
                break;
            case "s":
                directions = new int[]{1, 0};
                break;
            case "d":
                directions = new int[]{0, 1};
                break;
            case "a":
                directions = new int[]{0, -1};
                break;
            case "ded":
                this.snake.setAlive(false);
                break;
            default:
                System.exit(-1);
                System.out.println("A valid move must be inputted!");
        }
        return directions;
    }
}
