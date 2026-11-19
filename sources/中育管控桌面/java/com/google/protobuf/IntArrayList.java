package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final int[] EMPTY_ARRAY;
    private static final IntArrayList EMPTY_LIST;
    private int[] array;
    private int size;

    static {
        int[] iArr = new int[0];
        EMPTY_ARRAY = iArr;
        EMPTY_LIST = new IntArrayList(iArr, 0, false);
    }

    public IntArrayList() {
        this(EMPTY_ARRAY, 0, true);
    }

    public static IntArrayList emptyList() {
        return EMPTY_LIST;
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

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof IntArrayList)) {
            return super.addAll(collection);
        }
        IntArrayList intArrayList = (IntArrayList) collection;
        int i6 = intArrayList.size;
        if (i6 == 0) {
            return false;
        }
        int i7 = this.size;
        if (Integer.MAX_VALUE - i7 < i6) {
            throw new OutOfMemoryError();
        }
        int i8 = i7 + i6;
        int[] iArr = this.array;
        if (i8 > iArr.length) {
            this.array = Arrays.copyOf(iArr, i8);
        }
        System.arraycopy(intArrayList.array, 0, this.array, this.size, intArrayList.size);
        this.size = i8;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.IntList
    public void addInt(int i6) {
        ensureIsMutable();
        int i7 = this.size;
        int[] iArr = this.array;
        if (i7 == iArr.length) {
            int[] iArr2 = new int[growSize(iArr.length)];
            System.arraycopy(this.array, 0, iArr2, 0, this.size);
            this.array = iArr2;
        }
        int[] iArr3 = this.array;
        int i8 = this.size;
        this.size = i8 + 1;
        iArr3[i8] = i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public void ensureCapacity(int i6) {
        int[] iArr = this.array;
        if (i6 <= iArr.length) {
            return;
        }
        if (iArr.length == 0) {
            this.array = new int[Math.max(i6, 10)];
            return;
        }
        int length = iArr.length;
        while (length < i6) {
            length = growSize(length);
        }
        this.array = Arrays.copyOf(this.array, length);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntArrayList)) {
            return super.equals(obj);
        }
        IntArrayList intArrayList = (IntArrayList) obj;
        if (this.size != intArrayList.size) {
            return false;
        }
        int[] iArr = intArrayList.array;
        for (int i6 = 0; i6 < this.size; i6++) {
            if (this.array[i6] != iArr[i6]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.IntList
    public int getInt(int i6) {
        ensureIndexInRange(i6);
        return this.array[i6];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i6 = 1;
        for (int i7 = 0; i7 < this.size; i7++) {
            i6 = (i6 * 31) + this.array[i7];
        }
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            if (this.array[i6] == iIntValue) {
                return i6;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i6, int i7) {
        ensureIsMutable();
        if (i7 < i6) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.array;
        System.arraycopy(iArr, i7, iArr, i6, this.size - i7);
        this.size -= i7 - i6;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.IntList
    public int setInt(int i6, int i7) {
        ensureIsMutable();
        ensureIndexInRange(i6);
        int[] iArr = this.array;
        int i8 = iArr[i6];
        iArr[i6] = i7;
        return i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private IntArrayList(int[] iArr, int i6, boolean z6) {
        super(z6);
        this.array = iArr;
        this.size = i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i6) {
        return Integer.valueOf(getInt(i6));
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int i6) {
        if (i6 >= this.size) {
            return new IntArrayList(i6 == 0 ? EMPTY_ARRAY : Arrays.copyOf(this.array, i6), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer remove(int i6) {
        ensureIsMutable();
        ensureIndexInRange(i6);
        int[] iArr = this.array;
        int i7 = iArr[i6];
        if (i6 < this.size - 1) {
            System.arraycopy(iArr, i6 + 1, iArr, i6, (r2 - i6) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i7);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer set(int i6, Integer num) {
        return Integer.valueOf(setInt(i6, num.intValue()));
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i6, Integer num) {
        addInt(i6, num.intValue());
    }

    private void addInt(int i6, int i7) {
        int i8;
        ensureIsMutable();
        if (i6 >= 0 && i6 <= (i8 = this.size)) {
            int[] iArr = this.array;
            if (i8 < iArr.length) {
                System.arraycopy(iArr, i6, iArr, i6 + 1, i8 - i6);
            } else {
                int[] iArr2 = new int[growSize(iArr.length)];
                System.arraycopy(this.array, 0, iArr2, 0, i6);
                System.arraycopy(this.array, i6, iArr2, i6 + 1, this.size - i6);
                this.array = iArr2;
            }
            this.array[i6] = i7;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i6));
    }
}
