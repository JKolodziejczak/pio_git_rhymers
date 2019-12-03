package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
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
        return numbers[total]; //poprawione
    }

    public int countOut() { //poprawione
        if (callCheck()) //poprawione
            return -1; //poprawione
        return numbers[total--]; //poprawione
    }

}
