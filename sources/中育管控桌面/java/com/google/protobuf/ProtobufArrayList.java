package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class ProtobufArrayList<E> extends AbstractProtobufList<E> implements RandomAccess {
    private static final Object[] EMPTY_ARRAY;
    private static final ProtobufArrayList<Object> EMPTY_LIST;
    private E[] array;
    private int size;

    static {
        Object[] objArr = new Object[0];
        EMPTY_ARRAY = objArr;
        EMPTY_LIST = new ProtobufArrayList<>(objArr, 0, false);
    }

    public ProtobufArrayList() {
        this(EMPTY_ARRAY, 0, true);
    }

    private static <E> E[] createArray(int i6) {
        return (E[]) new Object[i6];
    }

    public static <E> ProtobufArrayList<E> emptyList() {
        return (ProtobufArrayList<E>) EMPTY_LIST;
    }

    private void ensureIndexInRange(int i6) {
        if (i6 < 0 || i6 >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i6));
        }
    }

    private static int growSize(int i6) {
        return Math.max(((i6 * 3) / 2) + 1, 10);
    }

    private String makeOutOfBoundsExceptionMessage(int i6) {
        return "Index:" + i6 + ", Size:" + this.size;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e6) {
        ensureIsMutable();
        int i6 = this.size;
        E[] eArr = this.array;
        if (i6 == eArr.length) {
            this.array = (E[]) Arrays.copyOf(this.array, growSize(eArr.length));
        }
        E[] eArr2 = this.array;
        int i7 = this.size;
        this.size = i7 + 1;
        eArr2[i7] = e6;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void ensureCapacity(int i6) {
        E[] eArr = this.array;
        if (i6 <= eArr.length) {
            return;
        }
        if (eArr.length == 0) {
            this.array = (E[]) new Object[Math.max(i6, 10)];
            return;
        }
        int length = eArr.length;
        while (length < i6) {
            length = growSize(length);
        }
        this.array = (E[]) Arrays.copyOf(this.array, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i6) {
        ensureIndexInRange(i6);
        return this.array[i6];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E remove(int i6) {
        ensureIsMutable();
        ensureIndexInRange(i6);
        E[] eArr = this.array;
        E e6 = eArr[i6];
        if (i6 < this.size - 1) {
            System.arraycopy(eArr, i6 + 1, eArr, i6, (r2 - i6) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return e6;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E set(int i6, E e6) {
        ensureIsMutable();
        ensureIndexInRange(i6);
        E[] eArr = this.array;
        E e7 = eArr[i6];
        eArr[i6] = e6;
        ((AbstractList) this).modCount++;
        return e7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private ProtobufArrayList(E[] eArr, int i6, boolean z6) {
        super(z6);
        this.array = eArr;
        this.size = i6;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public ProtobufArrayList<E> mutableCopyWithCapacity2(int i6) {
        if (i6 >= this.size) {
            return new ProtobufArrayList<>(i6 == 0 ? EMPTY_ARRAY : Arrays.copyOf(this.array, i6), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i6, E e6) {
        int i7;
        ensureIsMutable();
        if (i6 >= 0 && i6 <= (i7 = this.size)) {
            E[] eArr = this.array;
            if (i7 < eArr.length) {
                System.arraycopy(eArr, i6, eArr, i6 + 1, i7 - i6);
            } else {
                E[] eArr2 = (E[]) createArray(growSize(eArr.length));
                System.arraycopy(this.array, 0, eArr2, 0, i6);
                System.arraycopy(this.array, i6, eArr2, i6 + 1, this.size - i6);
                this.array = eArr2;
            }
            this.array[i6] = e6;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i6));
    }
}
