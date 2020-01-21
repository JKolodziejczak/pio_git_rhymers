package edu.kis.vh.nursery.stackAndList;

import edu.kis.vh.nursery.IntArrayStackInterface;

public final class IntLinkedList implements IntArrayStackInterface {

    private Node last;
    private int i;

    @Override
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.getNext().setPrev(last);
            last = last.next;
        }
    }

    @Override
    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }

    @Override
    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

	public int getI() {
		return i;
	}
}
