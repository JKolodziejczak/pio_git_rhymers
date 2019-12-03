package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private int[] NUMBERS = new int[12];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    } //poprawione

    public boolean isFull() {
        return total == 11;
    } //poprawione

    protected int peekaboo() { //poprawione
        if (callCheck()) //poprawione
            return -1; //poprawione
        return NUMBERS[total]; //poprawione
    }

    public int countOut() { //poprawione
        if (callCheck()) //poprawione
            return -1; //poprawione
        return NUMBERS[total--]; //poprawione
    }

}
