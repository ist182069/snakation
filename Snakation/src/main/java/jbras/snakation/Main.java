package jbras.snakation;

import jbras.snakation.core.Game;
import jbras.snakation.core.Map;
import jbras.snakation.core.Player;
import jbras.snakation.core.snake.BasicSnake;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to Snakation!");
        System.out.print("Insert player name: ");
        Scanner input = new Scanner(System.in);
        String playerName = input.nextLine();
        new Game(new BasicSnake(5, true), new Map(8, 8), new Player(playerName, 0), input).start();
        System.out.println("Thank you for playing!");
    }
}