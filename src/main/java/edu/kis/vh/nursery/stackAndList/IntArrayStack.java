package edu.kis.vh.nursery.stackAndList;

import edu.kis.vh.nursery.IntArrayStackInterface;

public class IntArrayStack implements IntArrayStackInterface {

    public static final int SIZE = 12;
    private static final int RETURN_NUMBER = 0;
    private final int[] NUMBERS = new int[SIZE];

    public int total = RETURN_NUMBER;

    @Override
    public void push(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    @Override
    public boolean isEmpty() {
        return total == RETURN_NUMBER;
    } //poprawione

    @Override
    public boolean isFull() {
        return total == 11;
    } //poprawione

    @Override
    public int top() { //poprawione
        if (isEmpty()) //poprawione
            return RETURN_NUMBER; //poprawione
        return NUMBERS[total]; //poprawione
    }

    public int pop() { //poprawione
        if (isEmpty()) //poprawione
            return RETURN_NUMBER; //poprawione
        return NUMBERS[total--]; //poprawione
    }
}
