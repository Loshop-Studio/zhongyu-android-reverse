package io.reactivex.internal.util;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public class LinkedArrayList {
    final int capacityHint;
    Object[] head;
    int indexInTail;
    volatile int size;
    Object[] tail;

    public LinkedArrayList(int i9) {
        this.capacityHint = i9;
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
        int i9 = this.indexInTail;
        int i10 = this.capacityHint;
        if (i9 != i10) {
            this.tail[i9] = obj;
            this.indexInTail = i9 + 1;
            this.size++;
        } else {
            Object[] objArr2 = new Object[i10 + 1];
            objArr2[0] = obj;
            this.tail[i10] = objArr2;
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
        int i9 = this.capacityHint;
        int i10 = this.size;
        ArrayList arrayList = new ArrayList(i10 + 1);
        Object[] objArrHead = head();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            arrayList.add(objArrHead[i12]);
            i11++;
            i12++;
            if (i12 == i9) {
                objArrHead = (Object[]) objArrHead[i9];
                i12 = 0;
            }
        }
        return arrayList.toString();
    }
}
