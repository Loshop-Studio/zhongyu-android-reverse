package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8797p;

/* loaded from: classes.dex */
public final class CircularArray<E> {
    private int capacityBitmask;
    private E[] elements;
    private int head;
    private int tail;

    public CircularArray() {
        this(0, 1, null);
    }

    private final void doubleCapacity() {
        E[] eArr = this.elements;
        int length = eArr.length;
        int i10 = this.head;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i12];
        AbstractC8797p.m14649p(eArr, eArr2, 0, i10, length);
        AbstractC8797p.m14649p(this.elements, eArr2, i11, 0, this.head);
        this.elements = eArr2;
        this.head = 0;
        this.tail = length;
        this.capacityBitmask = i12 - 1;
    }

    public final void addFirst(E e10) {
        int i10 = (this.head - 1) & this.capacityBitmask;
        this.head = i10;
        this.elements[i10] = e10;
        if (i10 == this.tail) {
            doubleCapacity();
        }
    }

    public final void addLast(E e10) {
        E[] eArr = this.elements;
        int i10 = this.tail;
        eArr[i10] = e10;
        int i11 = this.capacityBitmask & (i10 + 1);
        this.tail = i11;
        if (i11 == this.head) {
            doubleCapacity();
        }
    }

    public final void clear() {
        removeFromStart(size());
    }

    public final E get(int i10) {
        if (i10 < 0 || i10 >= size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e10 = this.elements[this.capacityBitmask & (this.head + i10)];
        AbstractC9133u.m16130d(e10);
        return e10;
    }

    public final E getFirst() {
        int i10 = this.head;
        if (i10 == this.tail) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e10 = this.elements[i10];
        AbstractC9133u.m16130d(e10);
        return e10;
    }

    public final E getLast() {
        int i10 = this.head;
        int i11 = this.tail;
        if (i10 == i11) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e10 = this.elements[(i11 - 1) & this.capacityBitmask];
        AbstractC9133u.m16130d(e10);
        return e10;
    }

    public final boolean isEmpty() {
        return this.head == this.tail;
    }

    public final E popFirst() {
        int i10 = this.head;
        if (i10 == this.tail) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.elements;
        E e10 = eArr[i10];
        eArr[i10] = null;
        this.head = (i10 + 1) & this.capacityBitmask;
        return e10;
    }

    public final E popLast() {
        int i10 = this.head;
        int i11 = this.tail;
        if (i10 == i11) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.capacityBitmask & (i11 - 1);
        E[] eArr = this.elements;
        E e10 = eArr[i12];
        eArr[i12] = null;
        this.tail = i12;
        return e10;
    }

    public final void removeFromEnd(int i10) {
        if (i10 <= 0) {
            return;
        }
        if (i10 > size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.tail;
        int i12 = i10 < i11 ? i11 - i10 : 0;
        for (int i13 = i12; i13 < i11; i13++) {
            this.elements[i13] = null;
        }
        int i14 = this.tail;
        int i15 = i14 - i12;
        int i16 = i10 - i15;
        this.tail = i14 - i15;
        if (i16 > 0) {
            int length = this.elements.length;
            this.tail = length;
            int i17 = length - i16;
            for (int i18 = i17; i18 < length; i18++) {
                this.elements[i18] = null;
            }
            this.tail = i17;
        }
    }

    public final void removeFromStart(int i10) {
        if (i10 <= 0) {
            return;
        }
        if (i10 > size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.elements.length;
        int i11 = this.head;
        if (i10 < length - i11) {
            length = i11 + i10;
        }
        while (i11 < length) {
            this.elements[i11] = null;
            i11++;
        }
        int i12 = this.head;
        int i13 = length - i12;
        int i14 = i10 - i13;
        this.head = this.capacityBitmask & (i12 + i13);
        if (i14 > 0) {
            for (int i15 = 0; i15 < i14; i15++) {
                this.elements[i15] = null;
            }
            this.head = i14;
        }
    }

    public final int size() {
        return (this.tail - this.head) & this.capacityBitmask;
    }

    public CircularArray(int i10) {
        if (!(i10 >= 1)) {
            RuntimeHelpersKt.throwIllegalArgumentException("capacity must be >= 1");
        }
        if (!(i10 <= 1073741824)) {
            RuntimeHelpersKt.throwIllegalArgumentException("capacity must be <= 2^30");
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.capacityBitmask = i10 - 1;
        this.elements = (E[]) new Object[i10];
    }

    public /* synthetic */ CircularArray(int i10, int i11, AbstractC9126n abstractC9126n) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
