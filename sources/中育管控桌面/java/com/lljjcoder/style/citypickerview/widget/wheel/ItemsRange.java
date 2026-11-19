package com.lljjcoder.style.citypickerview.widget.wheel;

/* loaded from: classes3.dex */
public class ItemsRange {
    private int count;
    private int first;

    public ItemsRange() {
        this(0, 0);
    }

    public boolean contains(int i6) {
        return i6 >= getFirst() && i6 <= getLast();
    }

    public int getCount() {
        return this.count;
    }

    public int getFirst() {
        return this.first;
    }

    public int getLast() {
        return (getFirst() + getCount()) - 1;
    }

    public ItemsRange(int i6, int i7) {
        this.first = i6;
        this.count = i7;
    }
}
