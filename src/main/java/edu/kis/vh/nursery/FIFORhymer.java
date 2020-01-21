package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackAndList.IntArrayStack;

public final class FIFORhymer extends DefaultCountingOutRhymer {

    private IntArrayStack temp = new IntArrayStack();

    @Override
    public int countOut() {
        while (!callCheck())

            temp.push(super.countOut()); //poprawione

        int ret = temp.pop();

        while (!temp.isEmpty())

            countIn(temp.pop()); //poprawione

        return ret;
    }
}
