package androidx.compose.p006ui.text.caches;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0011\b\u0017\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001d\b\u0016\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0002\u0010\bJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00028\u0001¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0005J\u0013\u0010\u001f\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\u0018\u0010!\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\"J\u001b\u0010#\u001a\u00028\u00012\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010$\u001a\u00028\u0001¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u0005H\u0016J\u0018\u0010'\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0005H\u0004J\u0010\u0010)\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003J\b\u0010*\u001a\u00020\u0005H\u0004J\u0017\u0010+\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00028\u0001H\u0000¢\u0006\u0004\b,\u0010-J\u0006\u0010.\u001a\u00020\u0018J\u0013\u0010/\u001a\u00028\u00002\u0006\u00100\u001a\u00020\u0005¢\u0006\u0002\u00101J\u001d\u00102\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0001¢\u0006\u0002\u0010%J\u001e\u00103\u001a\u00020\u00162\u0016\u00104\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000J\u001d\u00105\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0001¢\u0006\u0002\u0010%J\u0015\u00106\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0002\u0010\"J\u001b\u00106\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0001¢\u0006\u0002\u00107J\u0015\u00108\u001a\u0004\u0018\u00018\u00012\u0006\u00100\u001a\u00020\u0005¢\u0006\u0002\u00101J\u001d\u00109\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0001¢\u0006\u0002\u0010%J#\u00109\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010:\u001a\u00028\u00012\u0006\u0010;\u001a\u00028\u0001¢\u0006\u0002\u0010<J\u001b\u0010=\u001a\u00028\u00012\u0006\u00100\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00028\u0001¢\u0006\u0002\u0010>J\b\u0010?\u001a\u00020@H\u0016J\u0013\u0010A\u001a\u00028\u00012\u0006\u00100\u001a\u00020\u0005¢\u0006\u0002\u00101R\u001a\u0010\t\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0006R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0010X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00058G¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\u000b¨\u0006B"}, m5175d2 = {"Landroidx/compose/ui/text/caches/SimpleArrayMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "capacity", "", "(I)V", "map", "(Landroidx/compose/ui/text/caches/SimpleArrayMap;)V", "_size", "get_size", "()I", "set_size", "hashes", "", "keyValues", "", "[Ljava/lang/Object;", "size", "size$annotations", "()V", "clear", "", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "ensureCapacity", "minimumCapacity", "equals", "other", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrDefault", "defaultValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "indexOf", "hash", "indexOfKey", "indexOfNull", "indexOfValue", "indexOfValue$ui_text_release", "(Ljava/lang/Object;)I", "isEmpty", "keyAt", "index", "(I)Ljava/lang/Object;", "put", "putAll", "array", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeAt", "replace", "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "setValueAt", "(ILjava/lang/Object;)Ljava/lang/Object;", "toString", "", "valueAt", "ui-text_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SimpleArrayMap<K, V> {
    private int _size;
    private int[] hashes;
    private Object[] keyValues;

    @JvmOverloads
    public SimpleArrayMap() {
        this(0, 1, null);
    }

    public static /* synthetic */ void size$annotations() {
    }

    public final void clear() {
        if (this._size > 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.keyValues = ContainerHelpersKt.EMPTY_OBJECTS;
            this._size = 0;
        }
        if (this._size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(K key) {
        return indexOfKey(key) >= 0;
    }

    public final boolean containsValue(V value) {
        return indexOfValue$ui_text_release(value) >= 0;
    }

    public final void ensureCapacity(int minimumCapacity) {
        int i4 = this._size;
        int[] iArr = this.hashes;
        if (iArr.length < minimumCapacity) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, minimumCapacity);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.keyValues, minimumCapacity << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.keyValues = objArrCopyOf;
        }
        if (this._size != i4) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        try {
            if (other instanceof SimpleArrayMap) {
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) other;
                int i4 = this._size;
                if (i4 != simpleArrayMap._size) {
                    return false;
                }
                for (int i5 = 0; i5 < i4; i5++) {
                    K kKeyAt = keyAt(i5);
                    V vValueAt = valueAt(i5);
                    Object obj = simpleArrayMap.get(kKeyAt);
                    if (vValueAt == null) {
                        if (obj != null || !simpleArrayMap.containsKey(kKeyAt)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(vValueAt, obj)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(other instanceof Map) || this._size != ((Map) other).size()) {
                return false;
            }
            int i6 = this._size;
            for (int i7 = 0; i7 < i6; i7++) {
                K kKeyAt2 = keyAt(i7);
                V vValueAt2 = valueAt(i7);
                Object obj2 = ((Map) other).get(kKeyAt2);
                if (vValueAt2 == null) {
                    if (obj2 != null || !((Map) other).containsKey(kKeyAt2)) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(vValueAt2, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final V get(K key) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey >= 0) {
            return (V) this.keyValues[(iIndexOfKey << 1) + 1];
        }
        return null;
    }

    public final V getOrDefault(K key, V defaultValue) {
        int iIndexOfKey = indexOfKey(key);
        return iIndexOfKey >= 0 ? (V) this.keyValues[(iIndexOfKey << 1) + 1] : defaultValue;
    }

    public final int get_size() {
        return this._size;
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.keyValues;
        int i4 = this._size;
        int i5 = 1;
        int i6 = 0;
        int iHashCode = 0;
        while (i6 < i4) {
            Object obj = objArr[i5];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i6];
            i6++;
            i5 += 2;
        }
        return iHashCode;
    }

    public final int indexOf(Object key, int hash) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i4 = this._size;
        if (i4 == 0) {
            return -1;
        }
        int iBinarySearchInternal = ContainerHelpersKt.binarySearchInternal(this.hashes, i4, hash);
        if (iBinarySearchInternal < 0 || Intrinsics.areEqual(key, this.keyValues[iBinarySearchInternal << 1])) {
            return iBinarySearchInternal;
        }
        int i5 = iBinarySearchInternal + 1;
        while (i5 < i4 && this.hashes[i5] == hash) {
            if (Intrinsics.areEqual(key, this.keyValues[i5 << 1])) {
                return i5;
            }
            i5++;
        }
        for (int i6 = iBinarySearchInternal - 1; i6 >= 0 && this.hashes[i6] == hash; i6--) {
            if (Intrinsics.areEqual(key, this.keyValues[i6 << 1])) {
                return i6;
            }
        }
        return ~i5;
    }

    public final int indexOfKey(Object key) {
        return key == null ? indexOfNull() : indexOf(key, key.hashCode());
    }

    public final int indexOfNull() {
        int i4 = this._size;
        if (i4 == 0) {
            return -1;
        }
        int iBinarySearchInternal = ContainerHelpersKt.binarySearchInternal(this.hashes, i4, 0);
        if (iBinarySearchInternal < 0 || this.keyValues[iBinarySearchInternal << 1] == null) {
            return iBinarySearchInternal;
        }
        int i5 = iBinarySearchInternal + 1;
        while (i5 < i4 && this.hashes[i5] == 0) {
            if (this.keyValues[i5 << 1] == null) {
                return i5;
            }
            i5++;
        }
        for (int i6 = iBinarySearchInternal - 1; i6 >= 0 && this.hashes[i6] == 0; i6--) {
            if (this.keyValues[i6 << 1] == null) {
                return i6;
            }
        }
        return ~i5;
    }

    public final int indexOfValue$ui_text_release(V value) {
        int i4 = this._size << 1;
        Object[] objArr = this.keyValues;
        if (value == null) {
            for (int i5 = 1; i5 < i4; i5 += 2) {
                if (objArr[i5] == null) {
                    return i5 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i4; i6 += 2) {
            if (Intrinsics.areEqual(value, objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this._size <= 0;
    }

    public final K keyAt(int index) {
        return (K) this.keyValues[index << 1];
    }

    public final V put(K key, V value) {
        int iHashCode;
        int iIndexOf;
        int i4 = this._size;
        if (key == null) {
            iIndexOf = indexOfNull();
            iHashCode = 0;
        } else {
            iHashCode = key.hashCode();
            iIndexOf = indexOf(key, iHashCode);
        }
        if (iIndexOf >= 0) {
            int i5 = (iIndexOf << 1) + 1;
            Object[] objArr = this.keyValues;
            V v3 = (V) objArr[i5];
            objArr[i5] = value;
            return v3;
        }
        int i6 = ~iIndexOf;
        int[] iArr = this.hashes;
        if (i4 >= iArr.length) {
            int i7 = 8;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i7 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.keyValues, i7 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.keyValues = objArrCopyOf;
            if (i4 != this._size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i4) {
            int[] iArr2 = this.hashes;
            int i8 = i6 + 1;
            ArraysKt___ArraysJvmKt.copyInto(iArr2, iArr2, i8, i6, i4);
            Object[] objArr2 = this.keyValues;
            ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i8 << 1, i6 << 1, this._size << 1);
        }
        int i9 = this._size;
        if (i4 == i9) {
            int[] iArr3 = this.hashes;
            if (i6 < iArr3.length) {
                iArr3[i6] = iHashCode;
                Object[] objArr3 = this.keyValues;
                int i10 = i6 << 1;
                objArr3[i10] = key;
                objArr3[i10 + 1] = value;
                this._size = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final void putAll(SimpleArrayMap<? extends K, ? extends V> array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i4 = array._size;
        ensureCapacity(this._size + i4);
        if (this._size != 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                put(array.keyAt(i5), array.valueAt(i5));
            }
        } else if (i4 > 0) {
            ArraysKt___ArraysJvmKt.copyInto(array.hashes, this.hashes, 0, 0, i4);
            ArraysKt___ArraysJvmKt.copyInto(array.keyValues, this.keyValues, 0, 0, i4 << 1);
            this._size = i4;
        }
    }

    public final V putIfAbsent(K key, V value) {
        V v3 = get(key);
        return v3 == null ? put(key, value) : v3;
    }

    public final V remove(K key) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey >= 0) {
            return removeAt(iIndexOfKey);
        }
        return null;
    }

    public final V removeAt(int index) {
        Object[] objArr = this.keyValues;
        int i4 = index << 1;
        V v3 = (V) objArr[i4 + 1];
        int i5 = this._size;
        if (i5 <= 1) {
            clear();
        } else {
            int i6 = i5 - 1;
            int[] iArr = this.hashes;
            if (iArr.length <= 8 || i5 >= iArr.length / 3) {
                if (index < i6) {
                    int i7 = index + 1;
                    int i8 = i6 + 1;
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, index, i7, i8);
                    Object[] objArr2 = this.keyValues;
                    ArraysKt___ArraysJvmKt.copyInto(objArr2, objArr2, i4, i7 << 1, i8 << 1);
                }
                Object[] objArr3 = this.keyValues;
                int i9 = i6 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                int i10 = i5 > 8 ? i5 + (i5 >> 1) : 8;
                int[] iArr2 = new int[i10];
                this.hashes = iArr2;
                this.keyValues = new Object[i10 << 1];
                if (index > 0) {
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, 0, 0, index);
                    ArraysKt___ArraysJvmKt.copyInto(objArr, this.keyValues, 0, 0, i4);
                }
                if (index < i6) {
                    int i11 = index + 1;
                    int i12 = i6 + 1;
                    ArraysKt___ArraysJvmKt.copyInto(iArr, this.hashes, index, i11, i12);
                    ArraysKt___ArraysJvmKt.copyInto(objArr, this.keyValues, i4, i11 << 1, i12 << 1);
                }
            }
            if (i5 != this._size) {
                throw new ConcurrentModificationException();
            }
            this._size = i6;
        }
        return v3;
    }

    public final V replace(K key, V value) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey >= 0) {
            return setValueAt(iIndexOfKey, value);
        }
        return null;
    }

    public final V setValueAt(int index, V value) {
        int i4 = (index << 1) + 1;
        Object[] objArr = this.keyValues;
        V v3 = (V) objArr[i4];
        objArr[i4] = value;
        return v3;
    }

    public final void set_size(int i4) {
        this._size = i4;
    }

    @JvmName(name = "size")
    public final int size() {
        return this._size;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this._size * 28);
        sb.append('{');
        int i4 = this._size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            K kKeyAt = keyAt(i5);
            if (kKeyAt != this) {
                sb.append(kKeyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vValueAt = valueAt(i5);
            if (vValueAt != this) {
                sb.append(vValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        return string;
    }

    public final V valueAt(int index) {
        return (V) this.keyValues[(index << 1) + 1];
    }

    @JvmOverloads
    public SimpleArrayMap(int i4) {
        if (i4 == 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.keyValues = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            this.hashes = new int[i4];
            this.keyValues = new Object[i4 << 1];
        }
        this._size = 0;
    }

    public final boolean remove(K key, V value) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(value, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public final boolean replace(K key, V oldValue, V newValue) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey < 0 || valueAt(iIndexOfKey) != oldValue) {
            return false;
        }
        setValueAt(iIndexOfKey, newValue);
        return true;
    }

    public /* synthetic */ SimpleArrayMap(int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleArrayMap(SimpleArrayMap<K, V> simpleArrayMap) {
        this(0, 1, null);
        if (simpleArrayMap != 0) {
            putAll(simpleArrayMap);
        }
    }
}
