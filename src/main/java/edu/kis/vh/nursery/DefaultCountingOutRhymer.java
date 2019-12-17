package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public int getTotal() {
        return total;
    }

    public static final int SIZE = 12;
    private static final int RETURN_NUMBER = -1;
    private final int[] NUMBERS = new int[SIZE];

    public int total = RETURN_NUMBER;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    boolean callCheck() {
        return total == RETURN_NUMBER;
    } //poprawione

    boolean isFull() {
        return total == 11;
    } //poprawione

    int peekaboo() { //poprawione
        if (callCheck()) //poprawione
            return RETURN_NUMBER; //poprawione
        return NUMBERS[total]; //poprawione
    }

    public int countOut() { //poprawione
        if (callCheck()) //poprawione
            return RETURN_NUMBER; //poprawione
        return NUMBERS[total--]; //poprawione
    }

}
