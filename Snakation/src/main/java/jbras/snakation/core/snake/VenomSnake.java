package jbras.snakation.core.snake;

import jbras.snakation.core.archetypes.Rogue;

public class VenomSnake extends Snake implements Rogue {

    int venom = 5;
    public VenomSnake(int size, boolean alive, int venom)
    {
        this.size = size;
        this.alive = alive;
        this.venom = venom;
    }
    @Override
    public void stab() {

    }

    @Override
    public void sprint() {

    }

    @Override
    public void vanish() {

    }

    @Override
    public int life() {
        return 0;
    }

    @Override
    public void cry() {

    }
}
