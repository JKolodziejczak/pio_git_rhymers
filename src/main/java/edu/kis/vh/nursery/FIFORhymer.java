package edu.kis.vh.nursery;

public final class FIFORhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())

            temp.countIn(super.countOut()); //poprawione

        int ret = temp.countOut();

        while (!temp.callCheck())

            countIn(temp.countOut()); //poprawione

        return ret;
    }
}
