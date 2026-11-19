package androidx.collection;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0018\u0010\b\u001a\u0014\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0007J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0001H\u0001¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u001a\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00028\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010 J\u001f\u0010\"\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b&\u0010\u001dJ'\u0010'\u001a\u00020\n2\u0016\u0010\b\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b'\u0010\tJ!\u0010(\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b(\u0010\u001dJ\u0019\u0010)\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010\u001aJ\u001f\u0010)\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010 J!\u0010,\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b,\u0010\u001dJ'\u0010,\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010-\u001a\u00028\u00012\u0006\u0010.\u001a\u00028\u0001H\u0016¢\u0006\u0004\b,\u0010/J\u000f\u00100\u001a\u00020\u0004H\u0016¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020\u00102\b\u00102\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b3\u0010\u0012J\u000f\u00104\u001a\u00020\u0004H\u0016¢\u0006\u0004\b4\u00101J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u001f\u00109\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u00108\u001a\u00020\u0004H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0004H\u0002¢\u0006\u0004\b;\u00101J.\u0010=\u001a\u00028\u0002\"\n\b\u0002\u0010<*\u0004\u0018\u00018\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00028\u0002H\u0082\b¢\u0006\u0004\b=\u0010\u001dR\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010D¨\u0006E"}, m5110d2 = {"Landroidx/collection/SimpleArrayMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "capacity", "<init>", "(I)V", "map", "(Landroidx/collection/SimpleArrayMap;)V", "Ld6/s;", "clear", "()V", "minimumCapacity", "ensureCapacity", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "indexOfKey", "(Ljava/lang/Object;)I", "value", "__restricted$indexOfValue", "indexOfValue", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "defaultValue", "getOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "index", "keyAt", "(I)Ljava/lang/Object;", "valueAt", "setValueAt", "(ILjava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "put", "putAll", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeAt", "replace", "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "size", "()I", "other", "equals", "hashCode", "", "toString", "()Ljava/lang/String;", "hash", "indexOf", "(Ljava/lang/Object;I)I", "indexOfNull", ExifInterface.GPS_DIRECTION_TRUE, "getOrDefaultInternal", "", "hashes", "[I", "", "array", "[Ljava/lang/Object;", "I", "collection"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSimpleArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,761:1\n299#1,5:762\n299#1,5:767\n59#2,5:772\n59#2,5:777\n59#2,5:782\n59#2,5:788\n1#3:787\n*S KotlinDebug\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n*L\n278#1:762,5\n294#1:767,5\n315#1:772,5\n330#1:777,5\n346#1:782,5\n512#1:788,5\n*E\n"})
/* loaded from: classes.dex */
public class SimpleArrayMap<K, V> {

    @NotNull
    private Object[] array;

    @NotNull
    private int[] hashes;
    private int size;

    @JvmOverloads
    public SimpleArrayMap() {
        this(0, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends V> T getOrDefaultInternal(Object key, T defaultValue) {
        int iIndexOfKey = indexOfKey(key);
        return iIndexOfKey >= 0 ? (T) this.array[(iIndexOfKey << 1) + 1] : defaultValue;
    }

    private final int indexOf(K key, int hash) {
        int i = this.size;
        if (i == 0) {
            return -1;
        }
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.hashes, i, hash);
        if (iBinarySearch < 0 || AbstractC5830k.m5325b(key, this.array[iBinarySearch << 1])) {
            return iBinarySearch;
        }
        int i8 = iBinarySearch + 1;
        while (i8 < i && this.hashes[i8] == hash) {
            if (AbstractC5830k.m5325b(key, this.array[i8 << 1])) {
                return i8;
            }
            i8++;
        }
        for (int i9 = iBinarySearch - 1; i9 >= 0 && this.hashes[i9] == hash; i9--) {
            if (AbstractC5830k.m5325b(key, this.array[i9 << 1])) {
                return i9;
            }
        }
        return ~i8;
    }

    private final int indexOfNull() {
        int i = this.size;
        if (i == 0) {
            return -1;
        }
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.hashes, i, 0);
        if (iBinarySearch < 0 || this.array[iBinarySearch << 1] == null) {
            return iBinarySearch;
        }
        int i8 = iBinarySearch + 1;
        while (i8 < i && this.hashes[i8] == 0) {
            if (this.array[i8 << 1] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = iBinarySearch - 1; i9 >= 0 && this.hashes[i9] == 0; i9--) {
            if (this.array[i9 << 1] == null) {
                return i9;
            }
        }
        return ~i8;
    }

    @JvmName(name = "__restricted$indexOfValue")
    public final int __restricted$indexOfValue(V value) {
        int i = this.size * 2;
        Object[] objArr = this.array;
        if (value == null) {
            for (int i8 = 1; i8 < i; i8 += 2) {
                if (objArr[i8] == null) {
                    return i8 >> 1;
                }
            }
            return -1;
        }
        for (int i9 = 1; i9 < i; i9 += 2) {
            if (value.equals(objArr[i9])) {
                return i9 >> 1;
            }
        }
        return -1;
    }

    public void clear() {
        if (this.size > 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.array = ContainerHelpersKt.EMPTY_OBJECTS;
            this.size = 0;
        }
        if (this.size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K key) {
        return indexOfKey(key) >= 0;
    }

    public boolean containsValue(V value) {
        return __restricted$indexOfValue(value) >= 0;
    }

    public void ensureCapacity(int minimumCapacity) {
        int i = this.size;
        int[] iArr = this.hashes;
        if (iArr.length < minimumCapacity) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, minimumCapacity);
            AbstractC5830k.m5329f(iArrCopyOf, "copyOf(...)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, minimumCapacity * 2);
            AbstractC5830k.m5329f(objArrCopyOf, "copyOf(...)");
            this.array = objArrCopyOf;
        }
        if (this.size != i) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        try {
            if (other instanceof SimpleArrayMap) {
                if (getSize() != ((SimpleArrayMap) other).getSize()) {
                    return false;
                }
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) other;
                int i = this.size;
                for (int i8 = 0; i8 < i; i8++) {
                    K kKeyAt = keyAt(i8);
                    V vValueAt = valueAt(i8);
                    Object obj = simpleArrayMap.get(kKeyAt);
                    if (vValueAt == null) {
                        if (obj != null || !simpleArrayMap.containsKey(kKeyAt)) {
                            return false;
                        }
                    } else if (!vValueAt.equals(obj)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(other instanceof Map) || getSize() != ((Map) other).size()) {
                return false;
            }
            int i9 = this.size;
            for (int i10 = 0; i10 < i9; i10++) {
                K kKeyAt2 = keyAt(i10);
                V vValueAt2 = valueAt(i10);
                Object obj2 = ((Map) other).get(kKeyAt2);
                if (vValueAt2 == null) {
                    if (obj2 != null || !((Map) other).containsKey(kKeyAt2)) {
                        return false;
                    }
                } else if (!vValueAt2.equals(obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    @Nullable
    public V get(K key) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey >= 0) {
            return (V) this.array[(iIndexOfKey << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(@Nullable Object key, V defaultValue) {
        int iIndexOfKey = indexOfKey(key);
        return iIndexOfKey >= 0 ? (V) this.array[(iIndexOfKey << 1) + 1] : defaultValue;
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.array;
        int i = this.size;
        int i8 = 1;
        int i9 = 0;
        int iHashCode = 0;
        while (i9 < i) {
            Object obj = objArr[i8];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i9];
            i9++;
            i8 += 2;
        }
        return iHashCode;
    }

    public int indexOfKey(K key) {
        return key == null ? indexOfNull() : indexOf(key, key.hashCode());
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public K keyAt(int index) {
        boolean z8 = false;
        if (index >= 0 && index < this.size) {
            z8 = true;
        }
        if (!z8) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + index);
        }
        return (K) this.array[index << 1];
    }

    @Nullable
    public V put(K key, V value) {
        int i = this.size;
        int iHashCode = key != null ? key.hashCode() : 0;
        int iIndexOf = key != null ? indexOf(key, iHashCode) : indexOfNull();
        if (iIndexOf >= 0) {
            int i8 = (iIndexOf << 1) + 1;
            Object[] objArr = this.array;
            V v2 = (V) objArr[i8];
            objArr[i8] = value;
            return v2;
        }
        int i9 = ~iIndexOf;
        int[] iArr = this.hashes;
        if (i >= iArr.length) {
            int i10 = 8;
            if (i >= 8) {
                i10 = (i >> 1) + i;
            } else if (i < 4) {
                i10 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            AbstractC5830k.m5329f(iArrCopyOf, "copyOf(...)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i10 << 1);
            AbstractC5830k.m5329f(objArrCopyOf, "copyOf(...)");
            this.array = objArrCopyOf;
            if (i != this.size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i9 < i) {
            int[] iArr2 = this.hashes;
            int i11 = i9 + 1;
            AbstractC5802q.m5212y(i11, i9, iArr2, iArr2, i);
            Object[] objArr2 = this.array;
            AbstractC5802q.m5178E(objArr2, objArr2, i11 << 1, i9 << 1, this.size << 1);
        }
        int i12 = this.size;
        if (i == i12) {
            int[] iArr3 = this.hashes;
            if (i9 < iArr3.length) {
                iArr3[i9] = iHashCode;
                Object[] objArr3 = this.array;
                int i13 = i9 << 1;
                objArr3[i13] = key;
                objArr3[i13 + 1] = value;
                this.size = i12 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(@NotNull SimpleArrayMap<? extends K, ? extends V> map) {
        AbstractC5830k.m5330g(map, "map");
        int i = map.size;
        ensureCapacity(this.size + i);
        if (this.size != 0) {
            for (int i8 = 0; i8 < i; i8++) {
                put(map.keyAt(i8), map.valueAt(i8));
            }
        } else if (i > 0) {
            AbstractC5802q.m5212y(0, 0, map.hashes, this.hashes, i);
            AbstractC5802q.m5178E(map.array, this.array, 0, 0, i << 1);
            this.size = i;
        }
    }

    @Nullable
    public V putIfAbsent(K key, V value) {
        V v2 = get(key);
        return v2 == null ? put(key, value) : v2;
    }

    @Nullable
    public V remove(K key) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey >= 0) {
            return removeAt(iIndexOfKey);
        }
        return null;
    }

    public V removeAt(int index) {
        if (index < 0 || index >= this.size) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + index);
        }
        Object[] objArr = this.array;
        int i = index << 1;
        V v2 = (V) objArr[i + 1];
        int i8 = this.size;
        if (i8 <= 1) {
            clear();
            return v2;
        }
        int i9 = i8 - 1;
        int[] iArr = this.hashes;
        if (iArr.length <= 8 || i8 >= iArr.length / 3) {
            if (index < i9) {
                int i10 = index + 1;
                AbstractC5802q.m5212y(index, i10, iArr, iArr, i8);
                Object[] objArr2 = this.array;
                AbstractC5802q.m5178E(objArr2, objArr2, i, i10 << 1, i8 << 1);
            }
            Object[] objArr3 = this.array;
            int i11 = i9 << 1;
            objArr3[i11] = null;
            objArr3[i11 + 1] = null;
        } else {
            int i12 = i8 > 8 ? i8 + (i8 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
            AbstractC5830k.m5329f(iArrCopyOf, "copyOf(...)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i12 << 1);
            AbstractC5830k.m5329f(objArrCopyOf, "copyOf(...)");
            this.array = objArrCopyOf;
            if (i8 != this.size) {
                throw new ConcurrentModificationException();
            }
            if (index > 0) {
                AbstractC5802q.m5212y(0, 0, iArr, this.hashes, index);
                AbstractC5802q.m5178E(objArr, this.array, 0, 0, i);
            }
            if (index < i9) {
                int i13 = index + 1;
                AbstractC5802q.m5212y(index, i13, iArr, this.hashes, i8);
                AbstractC5802q.m5178E(objArr, this.array, i, i13 << 1, i8 << 1);
            }
        }
        if (i8 != this.size) {
            throw new ConcurrentModificationException();
        }
        this.size = i9;
        return v2;
    }

    @Nullable
    public V replace(K key, V value) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey >= 0) {
            return setValueAt(iIndexOfKey, value);
        }
        return null;
    }

    public V setValueAt(int index, V value) {
        boolean z8 = false;
        if (index >= 0 && index < this.size) {
            z8 = true;
        }
        if (!z8) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + index);
        }
        int i = (index << 1) + 1;
        Object[] objArr = this.array;
        V v2 = (V) objArr[i];
        objArr[i] = value;
        return v2;
    }

    /* renamed from: size, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @NotNull
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i = this.size;
        for (int i8 = 0; i8 < i; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            K kKeyAt = keyAt(i8);
            if (kKeyAt != sb) {
                sb.append(kKeyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vValueAt = valueAt(i8);
            if (vValueAt != sb) {
                sb.append(vValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        return AbstractC0037f.m80e('}', "toString(...)", sb);
    }

    public V valueAt(int index) {
        boolean z8 = false;
        if (index >= 0 && index < this.size) {
            z8 = true;
        }
        if (!z8) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + index);
        }
        return (V) this.array[(index << 1) + 1];
    }

    @JvmOverloads
    public SimpleArrayMap(int i) {
        this.hashes = i == 0 ? ContainerHelpersKt.EMPTY_INTS : new int[i];
        this.array = i == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[i << 1];
    }

    public boolean remove(K key, V value) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey < 0 || !AbstractC5830k.m5325b(value, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public boolean replace(K key, V oldValue, V newValue) {
        int iIndexOfKey = indexOfKey(key);
        if (iIndexOfKey < 0 || !AbstractC5830k.m5325b(oldValue, valueAt(iIndexOfKey))) {
            return false;
        }
        setValueAt(iIndexOfKey, newValue);
        return true;
    }

    public /* synthetic */ SimpleArrayMap(int i, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? 0 : i);
    }

    public SimpleArrayMap(@Nullable SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this(0, 1, null);
        if (simpleArrayMap != null) {
            putAll(simpleArrayMap);
        }
    }
}
