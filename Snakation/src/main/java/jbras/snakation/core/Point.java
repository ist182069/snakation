package jbras.snakation.core;

public class Point {

    int value;
    int[] position;

    public Point(int value)
    {
        this.value = value;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }
}
