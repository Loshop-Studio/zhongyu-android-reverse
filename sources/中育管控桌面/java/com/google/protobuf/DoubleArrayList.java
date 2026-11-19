package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class DoubleArrayList extends AbstractProtobufList<Double> implements Internal.DoubleList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final double[] EMPTY_ARRAY;
    private static final DoubleArrayList EMPTY_LIST;
    private double[] array;
    private int size;

    static {
        double[] dArr = new double[0];
        EMPTY_ARRAY = dArr;
        EMPTY_LIST = new DoubleArrayList(dArr, 0, false);
    }

    public DoubleArrayList() {
        this(EMPTY_ARRAY, 0, true);
    }

    public static DoubleArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Double> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof DoubleArrayList)) {
            return super.addAll(collection);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) collection;
        int i6 = doubleArrayList.size;
        if (i6 == 0) {
            return false;
        }
        int i7 = this.size;
        if (Integer.MAX_VALUE - i7 < i6) {
            throw new OutOfMemoryError();
        }
        int i8 = i7 + i6;
        double[] dArr = this.array;
        if (i8 > dArr.length) {
            this.array = Arrays.copyOf(dArr, i8);
        }
        System.arraycopy(doubleArrayList.array, 0, this.array, this.size, doubleArrayList.size);
        this.size = i8;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public void addDouble(double d6) {
        ensureIsMutable();
        int i6 = this.size;
        double[] dArr = this.array;
        if (i6 == dArr.length) {
            double[] dArr2 = new double[growSize(dArr.length)];
            System.arraycopy(this.array, 0, dArr2, 0, this.size);
            this.array = dArr2;
        }
        double[] dArr3 = this.array;
        int i7 = this.size;
        this.size = i7 + 1;
        dArr3[i7] = d6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public void ensureCapacity(int i6) {
        double[] dArr = this.array;
        if (i6 <= dArr.length) {
            return;
        }
        if (dArr.length == 0) {
            this.array = new double[Math.max(i6, 10)];
            return;
        }
        int length = dArr.length;
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
        if (!(obj instanceof DoubleArrayList)) {
            return super.equals(obj);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) obj;
        if (this.size != doubleArrayList.size) {
            return false;
        }
        double[] dArr = doubleArrayList.array;
        for (int i6 = 0; i6 < this.size; i6++) {
            if (Double.doubleToLongBits(this.array[i6]) != Double.doubleToLongBits(dArr[i6])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public double getDouble(int i6) {
        ensureIndexInRange(i6);
        return this.array[i6];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i6 = 0; i6 < this.size; i6++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(Double.doubleToLongBits(this.array[i6]));
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            if (this.array[i6] == dDoubleValue) {
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
        double[] dArr = this.array;
        System.arraycopy(dArr, i7, dArr, i6, this.size - i7);
        this.size -= i7 - i6;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public double setDouble(int i6, double d6) {
        ensureIsMutable();
        ensureIndexInRange(i6);
        double[] dArr = this.array;
        double d7 = dArr[i6];
        dArr[i6] = d6;
        return d7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private DoubleArrayList(double[] dArr, int i6, boolean z6) {
        super(z6);
        this.array = dArr;
        this.size = i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public Double get(int i6) {
        return Double.valueOf(getDouble(i6));
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Double> mutableCopyWithCapacity2(int i6) {
        if (i6 >= this.size) {
            return new DoubleArrayList(i6 == 0 ? EMPTY_ARRAY : Arrays.copyOf(this.array, i6), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Double remove(int i6) {
        ensureIsMutable();
        ensureIndexInRange(i6);
        double[] dArr = this.array;
        double d6 = dArr[i6];
        if (i6 < this.size - 1) {
            System.arraycopy(dArr, i6 + 1, dArr, i6, (r3 - i6) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d6);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Double set(int i6, Double d6) {
        return Double.valueOf(setDouble(i6, d6.doubleValue()));
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Double d6) {
        addDouble(d6.doubleValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i6, Double d6) {
        addDouble(i6, d6.doubleValue());
    }

    private void addDouble(int i6, double d6) {
        int i7;
        ensureIsMutable();
        if (i6 >= 0 && i6 <= (i7 = this.size)) {
            double[] dArr = this.array;
            if (i7 < dArr.length) {
                System.arraycopy(dArr, i6, dArr, i6 + 1, i7 - i6);
            } else {
                double[] dArr2 = new double[growSize(dArr.length)];
                System.arraycopy(this.array, 0, dArr2, 0, i6);
                System.arraycopy(this.array, i6, dArr2, i6 + 1, this.size - i6);
                this.array = dArr2;
            }
            this.array[i6] = d6;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i6));
    }
}
