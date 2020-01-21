package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackAndList.IntArrayStack;

public class DefaultCountingOutRhymer {

    private IntArrayStackInterface stack;

    public DefaultCountingOutRhymer(IntArrayStackInterface stack) {
        this.stack = stack;
    }

    public DefaultCountingOutRhymer() {
        this.stack = new IntArrayStack();
    }

    public void countIn(int in) {
        stack.push(in);
    }

    public boolean callCheck() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int peekaboo() {
        return stack.top();
    }

    public int countOut() {
        return stack.pop();
    }
}
