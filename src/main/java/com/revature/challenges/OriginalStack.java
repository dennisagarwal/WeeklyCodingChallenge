package com.revature.challenges;

import java.util.Stack;

public class OriginalStack {
    Stack<Integer> elements = new Stack<>();
    Integer minimumItem;

    public Integer push(Integer item) {
        if (elements.isEmpty()) {
            setMinimum(item);
        } else {
            if (isMinimum(item)) {
                setMinimum(item);
            }
        }
        return elements.push(item);
    }

    public Integer pop(Integer num) {
        elements.remove(num);
        if (num == getMinimum()) {
            findMinimum();
        }
        return num;
    }

    public void setMinimum(Integer item) {
        minimumItem = item;
    }

    public boolean isMinimum(Integer item) {
        return item < minimumItem;
    }

    public Integer getMinimum() {
        return minimumItem;
    }

    public void findMinimum() {
        int newMinimum = Integer.MAX_VALUE;
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i) < newMinimum) {
                newMinimum = elements.get(i);
            }
        }
        setMinimum(newMinimum);
    }
}
