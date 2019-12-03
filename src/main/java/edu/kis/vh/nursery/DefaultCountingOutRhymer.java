package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];

    public int getTotal() {
        return total;
    }

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == -1;
    } //poprawione

    boolean isFull() {
        return total == 11;
    } //poprawione

    int peekaboo() { //poprawione
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
