package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class LongArrayList extends AbstractProtobufList<Long> implements Internal.LongList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final long[] EMPTY_ARRAY;
    private static final LongArrayList EMPTY_LIST;
    private long[] array;
    private int size;

    static {
        long[] jArr = new long[0];
        EMPTY_ARRAY = jArr;
        EMPTY_LIST = new LongArrayList(jArr, 0, false);
    }

    public LongArrayList() {
        this(EMPTY_ARRAY, 0, true);
    }

    public static LongArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Long> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof LongArrayList)) {
            return super.addAll(collection);
        }
        LongArrayList longArrayList = (LongArrayList) collection;
        int i6 = longArrayList.size;
        if (i6 == 0) {
            return false;
        }
        int i7 = this.size;
        if (Integer.MAX_VALUE - i7 < i6) {
            throw new OutOfMemoryError();
        }
        int i8 = i7 + i6;
        long[] jArr = this.array;
        if (i8 > jArr.length) {
            this.array = Arrays.copyOf(jArr, i8);
        }
        System.arraycopy(longArrayList.array, 0, this.array, this.size, longArrayList.size);
        this.size = i8;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.LongList
    public void addLong(long j6) {
        ensureIsMutable();
        int i6 = this.size;
        long[] jArr = this.array;
        if (i6 == jArr.length) {
            long[] jArr2 = new long[growSize(jArr.length)];
            System.arraycopy(this.array, 0, jArr2, 0, this.size);
            this.array = jArr2;
        }
        long[] jArr3 = this.array;
        int i7 = this.size;
        this.size = i7 + 1;
        jArr3[i7] = j6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public void ensureCapacity(int i6) {
        long[] jArr = this.array;
        if (i6 <= jArr.length) {
            return;
        }
        if (jArr.length == 0) {
            this.array = new long[Math.max(i6, 10)];
            return;
        }
        int length = jArr.length;
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
        if (!(obj instanceof LongArrayList)) {
            return super.equals(obj);
        }
        LongArrayList longArrayList = (LongArrayList) obj;
        if (this.size != longArrayList.size) {
            return false;
        }
        long[] jArr = longArrayList.array;
        for (int i6 = 0; i6 < this.size; i6++) {
            if (this.array[i6] != jArr[i6]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.LongList
    public long getLong(int i6) {
        ensureIndexInRange(i6);
        return this.array[i6];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i6 = 0; i6 < this.size; i6++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(this.array[i6]);
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            if (this.array[i6] == jLongValue) {
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
        long[] jArr = this.array;
        System.arraycopy(jArr, i7, jArr, i6, this.size - i7);
        this.size -= i7 - i6;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.LongList
    public long setLong(int i6, long j6) {
        ensureIsMutable();
        ensureIndexInRange(i6);
        long[] jArr = this.array;
        long j7 = jArr[i6];
        jArr[i6] = j6;
        return j7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private LongArrayList(long[] jArr, int i6, boolean z6) {
        super(z6);
        this.array = jArr;
        this.size = i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int i6) {
        return Long.valueOf(getLong(i6));
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Long> mutableCopyWithCapacity2(int i6) {
        if (i6 >= this.size) {
            return new LongArrayList(i6 == 0 ? EMPTY_ARRAY : Arrays.copyOf(this.array, i6), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Long remove(int i6) {
        ensureIsMutable();
        ensureIndexInRange(i6);
        long[] jArr = this.array;
        long j6 = jArr[i6];
        if (i6 < this.size - 1) {
            System.arraycopy(jArr, i6 + 1, jArr, i6, (r3 - i6) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j6);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Long set(int i6, Long l6) {
        return Long.valueOf(setLong(i6, l6.longValue()));
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Long l6) {
        addLong(l6.longValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i6, Long l6) {
        addLong(i6, l6.longValue());
    }

    private void addLong(int i6, long j6) {
        int i7;
        ensureIsMutable();
        if (i6 >= 0 && i6 <= (i7 = this.size)) {
            long[] jArr = this.array;
            if (i7 < jArr.length) {
                System.arraycopy(jArr, i6, jArr, i6 + 1, i7 - i6);
            } else {
                long[] jArr2 = new long[growSize(jArr.length)];
                System.arraycopy(this.array, 0, jArr2, 0, i6);
                System.arraycopy(this.array, i6, jArr2, i6 + 1, this.size - i6);
                this.array = jArr2;
            }
            this.array[i6] = j6;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i6));
    }
}
