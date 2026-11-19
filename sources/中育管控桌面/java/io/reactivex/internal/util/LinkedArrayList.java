package io.reactivex.internal.util;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public class LinkedArrayList {
    final int capacityHint;
    Object[] head;
    int indexInTail;
    volatile int size;
    Object[] tail;

    public LinkedArrayList(int i6) {
        this.capacityHint = i6;
    }

    public void add(Object obj) {
        if (this.size == 0) {
            Object[] objArr = new Object[this.capacityHint + 1];
            this.head = objArr;
            this.tail = objArr;
            objArr[0] = obj;
            this.indexInTail = 1;
            this.size = 1;
            return;
        }
        int i6 = this.indexInTail;
        int i7 = this.capacityHint;
        if (i6 != i7) {
            this.tail[i6] = obj;
            this.indexInTail = i6 + 1;
            this.size++;
        } else {
            Object[] objArr2 = new Object[i7 + 1];
            objArr2[0] = obj;
            this.tail[i7] = objArr2;
            this.tail = objArr2;
            this.indexInTail = 1;
            this.size++;
        }
    }

    public Object[] head() {
        return this.head;
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        int i6 = this.capacityHint;
        int i7 = this.size;
        ArrayList arrayList = new ArrayList(i7 + 1);
        Object[] objArrHead = head();
        int i8 = 0;
        int i9 = 0;
        while (i8 < i7) {
            arrayList.add(objArrHead[i9]);
            i8++;
            i9++;
            if (i9 == i6) {
                objArrHead = (Object[]) objArrHead[i6];
                i9 = 0;
            }
        }
        return arrayList.toString();
    }
}
