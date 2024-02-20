package jbras.snakation;

import jbras.snakation.core.Game;
import jbras.snakation.core.Snake;
import jbras.snakation.core.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to Snakation!");
        new Game(new Snake(5), new Map(8, 8)).start();
        System.out.println("Thank you for playing!");
    }
}