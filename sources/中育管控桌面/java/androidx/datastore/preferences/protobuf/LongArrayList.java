package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class LongArrayList extends AbstractProtobufList<Long> implements Internal.LongList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final LongArrayList EMPTY_LIST = new LongArrayList(new long[0], 0, false);
    private long[] array;
    private int size;

    public LongArrayList() {
        this(new long[10], 0, true);
    }

    public static LongArrayList emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int i6) {
        if (i6 < 0 || i6 >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i6));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i6) {
        return "Index:" + i6 + ", Size:" + this.size;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
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

    @Override // androidx.datastore.preferences.protobuf.Internal.LongList
    public void addLong(long j6) {
        ensureIsMutable();
        int i6 = this.size;
        long[] jArr = this.array;
        if (i6 == jArr.length) {
            long[] jArr2 = new long[((i6 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i6);
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

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
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

    @Override // androidx.datastore.preferences.protobuf.Internal.LongList
    public long getLong(int i6) {
        ensureIndexInRange(i6);
        return this.array[i6];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
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

    @Override // androidx.datastore.preferences.protobuf.Internal.LongList
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

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Long> mutableCopyWithCapacity2(int i6) {
        if (i6 >= this.size) {
            return new LongArrayList(Arrays.copyOf(this.array, i6), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
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

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Long set(int i6, Long l6) {
        return Long.valueOf(setLong(i6, l6.longValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Long l6) {
        addLong(l6.longValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
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
                long[] jArr2 = new long[((i7 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i6);
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
