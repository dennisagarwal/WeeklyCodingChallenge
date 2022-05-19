package com.revature.challenges;

import java.util.Stack;

public class OriginalStack {
    Stack<Integer> arrayElements = new Stack<>();
    Integer minimumItem;

    public Integer push(Integer item) {
        if (arrayElements.isEmpty()) {
            setMinimum(item);
        } else {
            if (isMinimum(item)) {
                setMinimum(item);
            }
        }
        return arrayElements.push(item);
    }

    public Integer pop(Integer num) {
        arrayElements.remove(num);
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
        for (int i = 0; i < arrayElements.size(); i++) {
            if (arrayElements.get(i) < newMinimum) {
                newMinimum = arrayElements.get(i);
            }
        }
        setMinimum(newMinimum);
    }
}
