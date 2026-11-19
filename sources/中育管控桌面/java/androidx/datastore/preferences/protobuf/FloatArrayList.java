package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class FloatArrayList extends AbstractProtobufList<Float> implements Internal.FloatList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final FloatArrayList EMPTY_LIST = new FloatArrayList(new float[0], 0, false);
    private float[] array;
    private int size;

    public FloatArrayList() {
        this(new float[10], 0, true);
    }

    public static FloatArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Float> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof FloatArrayList)) {
            return super.addAll(collection);
        }
        FloatArrayList floatArrayList = (FloatArrayList) collection;
        int i6 = floatArrayList.size;
        if (i6 == 0) {
            return false;
        }
        int i7 = this.size;
        if (Integer.MAX_VALUE - i7 < i6) {
            throw new OutOfMemoryError();
        }
        int i8 = i7 + i6;
        float[] fArr = this.array;
        if (i8 > fArr.length) {
            this.array = Arrays.copyOf(fArr, i8);
        }
        System.arraycopy(floatArrayList.array, 0, this.array, this.size, floatArrayList.size);
        this.size = i8;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.FloatList
    public void addFloat(float f6) {
        ensureIsMutable();
        int i6 = this.size;
        float[] fArr = this.array;
        if (i6 == fArr.length) {
            float[] fArr2 = new float[((i6 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i6);
            this.array = fArr2;
        }
        float[] fArr3 = this.array;
        int i7 = this.size;
        this.size = i7 + 1;
        fArr3[i7] = f6;
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
        if (!(obj instanceof FloatArrayList)) {
            return super.equals(obj);
        }
        FloatArrayList floatArrayList = (FloatArrayList) obj;
        if (this.size != floatArrayList.size) {
            return false;
        }
        float[] fArr = floatArrayList.array;
        for (int i6 = 0; i6 < this.size; i6++) {
            if (Float.floatToIntBits(this.array[i6]) != Float.floatToIntBits(fArr[i6])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.FloatList
    public float getFloat(int i6) {
        ensureIndexInRange(i6);
        return this.array[i6];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i6 = 0; i6 < this.size; i6++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.array[i6]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            if (this.array[i6] == fFloatValue) {
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
        float[] fArr = this.array;
        System.arraycopy(fArr, i7, fArr, i6, this.size - i7);
        this.size -= i7 - i6;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.FloatList
    public float setFloat(int i6, float f6) {
        ensureIsMutable();
        ensureIndexInRange(i6);
        float[] fArr = this.array;
        float f7 = fArr[i6];
        fArr[i6] = f6;
        return f7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private FloatArrayList(float[] fArr, int i6, boolean z6) {
        super(z6);
        this.array = fArr;
        this.size = i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public Float get(int i6) {
        return Float.valueOf(getFloat(i6));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Float> mutableCopyWithCapacity2(int i6) {
        if (i6 >= this.size) {
            return new FloatArrayList(Arrays.copyOf(this.array, i6), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Float remove(int i6) {
        ensureIsMutable();
        ensureIndexInRange(i6);
        float[] fArr = this.array;
        float f6 = fArr[i6];
        if (i6 < this.size - 1) {
            System.arraycopy(fArr, i6 + 1, fArr, i6, (r2 - i6) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f6);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Float set(int i6, Float f6) {
        return Float.valueOf(setFloat(i6, f6.floatValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Float f6) {
        addFloat(f6.floatValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i6, Float f6) {
        addFloat(i6, f6.floatValue());
    }

    private void addFloat(int i6, float f6) {
        int i7;
        ensureIsMutable();
        if (i6 >= 0 && i6 <= (i7 = this.size)) {
            float[] fArr = this.array;
            if (i7 < fArr.length) {
                System.arraycopy(fArr, i6, fArr, i6 + 1, i7 - i6);
            } else {
                float[] fArr2 = new float[((i7 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i6);
                System.arraycopy(this.array, i6, fArr2, i6 + 1, this.size - i6);
                this.array = fArr2;
            }
            this.array[i6] = f6;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i6));
    }
}
