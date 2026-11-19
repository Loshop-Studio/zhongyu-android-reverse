package androidx.collection;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0007\u001a\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a-\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a'\u0010\n\u001a\u00020\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u000e\u001a\u00020\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0010\u001a\u00020\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a \u0010\u0016\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a(\u0010\u0019\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0018\u001a\u00020\bH\u0080\b¢\u0006\u0004\b\u0019\u0010\u0015\u001a(\u0010\u001c\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001a\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a*\u0010\u001e\u001a\u00020\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0080\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a(\u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010 \u001a\u00020\bH\u0080\b¢\u0006\u0004\b!\u0010\"\u001a \u0010#\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b#\u0010$\u001a(\u0010%\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001a\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b%\u0010\u001d\u001a0\u0010'\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b'\u0010(\u001a(\u0010)\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001a\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b)\u0010\u001d\u001a(\u0010*\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010 \u001a\u00020\bH\u0080\b¢\u0006\u0004\b*\u0010\"\u001a0\u0010+\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b+\u0010,\u001a*\u0010.\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010-\u001a\u0004\u0018\u00010\fH\u0080\b¢\u0006\u0004\b.\u0010\u001d\u001a \u0010/\u001a\u00020\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b/\u0010\u0011\u001a \u00101\u001a\u000200\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b1\u00102\u001a.\u00105\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000003H\u0080\b¢\u0006\u0004\b5\u00106\u001a.\u0010'\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000003H\u0080\b¢\u0006\u0004\b'\u00106\u001a.\u0010+\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000003H\u0080\b¢\u0006\u0004\b+\u00106\u001a.\u00107\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000003H\u0080\b¢\u0006\u0004\b7\u00106\"\u0014\u00108\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/collection/ArraySet;", "arraySetOf", "()Landroidx/collection/ArraySet;", "", "values", "([Ljava/lang/Object;)Landroidx/collection/ArraySet;", ExifInterface.LONGITUDE_EAST, "", "hash", "binarySearchInternal", "(Landroidx/collection/ArraySet;I)I", "", "key", "indexOf", "(Landroidx/collection/ArraySet;Ljava/lang/Object;I)I", "indexOfNull", "(Landroidx/collection/ArraySet;)I", "size", "Ld6/s;", "allocArrays", "(Landroidx/collection/ArraySet;I)V", "clearInternal", "(Landroidx/collection/ArraySet;)V", "minimumCapacity", "ensureCapacityInternal", "element", "", "containsInternal", "(Landroidx/collection/ArraySet;Ljava/lang/Object;)Z", "indexOfInternal", "(Landroidx/collection/ArraySet;Ljava/lang/Object;)I", "index", "valueAtInternal", "(Landroidx/collection/ArraySet;I)Ljava/lang/Object;", "isEmptyInternal", "(Landroidx/collection/ArraySet;)Z", "addInternal", "array", "addAllInternal", "(Landroidx/collection/ArraySet;Landroidx/collection/ArraySet;)V", "removeInternal", "removeAtInternal", "removeAllInternal", "(Landroidx/collection/ArraySet;Landroidx/collection/ArraySet;)Z", "other", "equalsInternal", "hashCodeInternal", "", "toStringInternal", "(Landroidx/collection/ArraySet;)Ljava/lang/String;", "", "elements", "containsAllInternal", "(Landroidx/collection/ArraySet;Ljava/util/Collection;)Z", "retainAllInternal", "ARRAY_SET_BASE_SIZE", "I", "collection"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ArraySetKt {
    public static final int ARRAY_SET_BASE_SIZE = 4;

    public static final <E> void addAllInternal(@NotNull ArraySet<E> arraySet, @NotNull ArraySet<? extends E> array) {
        AbstractC5830k.m5330g(arraySet, "<this>");
        AbstractC5830k.m5330g(array, "array");
        int i = array.get_size$collection();
        arraySet.ensureCapacity(arraySet.get_size$collection() + i);
        if (arraySet.get_size$collection() != 0) {
            for (int i8 = 0; i8 < i; i8++) {
                arraySet.add(array.valueAt(i8));
            }
        } else if (i > 0) {
            AbstractC5802q.m5179F(0, i, array.getHashes(), arraySet.getHashes(), 6);
            AbstractC5802q.m5182I(array.getArray(), arraySet.getArray(), 0, 0, i, 6);
            if (arraySet.get_size$collection() != 0) {
                throw new ConcurrentModificationException();
            }
            arraySet.set_size$collection(i);
        }
    }

    public static final <E> boolean addInternal(@NotNull ArraySet<E> arraySet, E e) {
        int i;
        int iIndexOf;
        AbstractC5830k.m5330g(arraySet, "<this>");
        int i8 = arraySet.get_size$collection();
        if (e == null) {
            iIndexOf = indexOfNull(arraySet);
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iIndexOf = indexOf(arraySet, e, iHashCode);
        }
        if (iIndexOf >= 0) {
            return false;
        }
        int i9 = ~iIndexOf;
        if (i8 >= arraySet.getHashes().length) {
            int i10 = 8;
            if (i8 >= 8) {
                i10 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i10 = 4;
            }
            int[] hashes = arraySet.getHashes();
            Object[] array = arraySet.getArray();
            allocArrays(arraySet, i10);
            if (i8 != arraySet.get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            if (arraySet.getHashes().length != 0) {
                AbstractC5802q.m5179F(0, hashes.length, hashes, arraySet.getHashes(), 6);
                AbstractC5802q.m5182I(array, arraySet.getArray(), 0, 0, array.length, 6);
            }
        }
        if (i9 < i8) {
            int i11 = i9 + 1;
            AbstractC5802q.m5212y(i11, i9, arraySet.getHashes(), arraySet.getHashes(), i8);
            AbstractC5802q.m5178E(arraySet.getArray(), arraySet.getArray(), i11, i9, i8);
        }
        if (i8 != arraySet.get_size$collection() || i9 >= arraySet.getHashes().length) {
            throw new ConcurrentModificationException();
        }
        arraySet.getHashes()[i9] = i;
        arraySet.getArray()[i9] = e;
        arraySet.set_size$collection(arraySet.get_size$collection() + 1);
        return true;
    }

    public static final <E> void allocArrays(@NotNull ArraySet<E> arraySet, int i) {
        AbstractC5830k.m5330g(arraySet, "<this>");
        arraySet.setHashes$collection(new int[i]);
        arraySet.setArray$collection(new Object[i]);
    }

    @NotNull
    public static final <T> ArraySet<T> arraySetOf() {
        return new ArraySet<>(0, 1, null);
    }

    public static final <E> int binarySearchInternal(@NotNull ArraySet<E> arraySet, int i) {
        AbstractC5830k.m5330g(arraySet, "<this>");
        try {
            return ContainerHelpersKt.binarySearch(arraySet.getHashes(), arraySet.get_size$collection(), i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> void clearInternal(@NotNull ArraySet<E> arraySet) {
        AbstractC5830k.m5330g(arraySet, "<this>");
        if (arraySet.get_size$collection() != 0) {
            arraySet.setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            arraySet.setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            arraySet.set_size$collection(0);
        }
        if (arraySet.get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean containsAllInternal(@NotNull ArraySet<E> arraySet, @NotNull Collection<? extends E> elements) {
        AbstractC5830k.m5330g(arraySet, "<this>");
        AbstractC5830k.m5330g(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!arraySet.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final <E> boolean containsInternal(@NotNull ArraySet<E> arraySet, E e) {
        AbstractC5830k.m5330g(arraySet, "<this>");
        return arraySet.indexOf(e) >= 0;
    }

    public static final <E> void ensureCapacityInternal(@NotNull ArraySet<E> arraySet, int i) {
        AbstractC5830k.m5330g(arraySet, "<this>");
        int i8 = arraySet.get_size$collection();
        if (arraySet.getHashes().length < i) {
            int[] hashes = arraySet.getHashes();
            Object[] array = arraySet.getArray();
            allocArrays(arraySet, i);
            if (arraySet.get_size$collection() > 0) {
                AbstractC5802q.m5179F(0, arraySet.get_size$collection(), hashes, arraySet.getHashes(), 6);
                AbstractC5802q.m5182I(array, arraySet.getArray(), 0, 0, arraySet.get_size$collection(), 6);
            }
        }
        if (arraySet.get_size$collection() != i8) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean equalsInternal(@NotNull ArraySet<E> arraySet, @Nullable Object obj) {
        AbstractC5830k.m5330g(arraySet, "<this>");
        if (arraySet == obj) {
            return true;
        }
        if (!(obj instanceof Set) || arraySet.size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = arraySet.get_size$collection();
            for (int i8 = 0; i8 < i; i8++) {
                if (!((Set) obj).contains(arraySet.valueAt(i8))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static final <E> int hashCodeInternal(@NotNull ArraySet<E> arraySet) {
        AbstractC5830k.m5330g(arraySet, "<this>");
        int[] hashes = arraySet.getHashes();
        int i = arraySet.get_size$collection();
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            i8 += hashes[i9];
        }
        return i8;
    }

    public static final <E> int indexOf(@NotNull ArraySet<E> arraySet, @Nullable Object obj, int i) {
        AbstractC5830k.m5330g(arraySet, "<this>");
        int i8 = arraySet.get_size$collection();
        if (i8 == 0) {
            return -1;
        }
        int iBinarySearchInternal = binarySearchInternal(arraySet, i);
        if (iBinarySearchInternal < 0 || AbstractC5830k.m5325b(obj, arraySet.getArray()[iBinarySearchInternal])) {
            return iBinarySearchInternal;
        }
        int i9 = iBinarySearchInternal + 1;
        while (i9 < i8 && arraySet.getHashes()[i9] == i) {
            if (AbstractC5830k.m5325b(obj, arraySet.getArray()[i9])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = iBinarySearchInternal - 1; i10 >= 0 && arraySet.getHashes()[i10] == i; i10--) {
            if (AbstractC5830k.m5325b(obj, arraySet.getArray()[i10])) {
                return i10;
            }
        }
        return ~i9;
    }

    public static final <E> int indexOfInternal(@NotNull ArraySet<E> arraySet, @Nullable Object obj) {
        AbstractC5830k.m5330g(arraySet, "<this>");
        return obj == null ? indexOfNull(arraySet) : indexOf(arraySet, obj, obj.hashCode());
    }

    public static final <E> int indexOfNull(@NotNull ArraySet<E> arraySet) {
        AbstractC5830k.m5330g(arraySet, "<this>");
        return indexOf(arraySet, null, 0);
    }

    public static final <E> boolean isEmptyInternal(@NotNull ArraySet<E> arraySet) {
        AbstractC5830k.m5330g(arraySet, "<this>");
        return arraySet.get_size$collection() <= 0;
    }

    public static final <E> boolean removeAllInternal(@NotNull ArraySet<E> arraySet, @NotNull ArraySet<? extends E> array) {
        AbstractC5830k.m5330g(arraySet, "<this>");
        AbstractC5830k.m5330g(array, "array");
        int i = array.get_size$collection();
        int i8 = arraySet.get_size$collection();
        for (int i9 = 0; i9 < i; i9++) {
            arraySet.remove(array.valueAt(i9));
        }
        return i8 != arraySet.get_size$collection();
    }

    public static final <E> E removeAtInternal(@NotNull ArraySet<E> arraySet, int i) {
        int i8;
        AbstractC5830k.m5330g(arraySet, "<this>");
        int i9 = arraySet.get_size$collection();
        E e = (E) arraySet.getArray()[i];
        if (i9 <= 1) {
            arraySet.clear();
            return e;
        }
        int i10 = i9 - 1;
        if (arraySet.getHashes().length <= 8 || arraySet.get_size$collection() >= arraySet.getHashes().length / 3) {
            if (i < i10) {
                int i11 = i + 1;
                AbstractC5802q.m5212y(i, i11, arraySet.getHashes(), arraySet.getHashes(), i9);
                AbstractC5802q.m5178E(arraySet.getArray(), arraySet.getArray(), i, i11, i9);
            }
            arraySet.getArray()[i10] = null;
        } else {
            int i12 = arraySet.get_size$collection() > 8 ? arraySet.get_size$collection() + (arraySet.get_size$collection() >> 1) : 8;
            int[] hashes = arraySet.getHashes();
            Object[] array = arraySet.getArray();
            allocArrays(arraySet, i12);
            if (i > 0) {
                AbstractC5802q.m5179F(0, i, hashes, arraySet.getHashes(), 6);
                i8 = i;
                AbstractC5802q.m5182I(array, arraySet.getArray(), 0, 0, i8, 6);
            } else {
                i8 = i;
            }
            if (i8 < i10) {
                int i13 = i8 + 1;
                AbstractC5802q.m5212y(i8, i13, hashes, arraySet.getHashes(), i9);
                AbstractC5802q.m5178E(array, arraySet.getArray(), i8, i13, i9);
            }
        }
        if (i9 != arraySet.get_size$collection()) {
            throw new ConcurrentModificationException();
        }
        arraySet.set_size$collection(i10);
        return e;
    }

    public static final <E> boolean removeInternal(@NotNull ArraySet<E> arraySet, E e) {
        AbstractC5830k.m5330g(arraySet, "<this>");
        int iIndexOf = arraySet.indexOf(e);
        if (iIndexOf < 0) {
            return false;
        }
        arraySet.removeAt(iIndexOf);
        return true;
    }

    public static final <E> boolean retainAllInternal(@NotNull ArraySet<E> arraySet, @NotNull Collection<? extends E> elements) {
        AbstractC5830k.m5330g(arraySet, "<this>");
        AbstractC5830k.m5330g(elements, "elements");
        boolean z8 = false;
        for (int i = arraySet.get_size$collection() - 1; -1 < i; i--) {
            if (!AbstractC5805t.m5224d0(elements, arraySet.getArray()[i])) {
                arraySet.removeAt(i);
                z8 = true;
            }
        }
        return z8;
    }

    @NotNull
    public static final <E> String toStringInternal(@NotNull ArraySet<E> arraySet) {
        AbstractC5830k.m5330g(arraySet, "<this>");
        if (arraySet.isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(arraySet.get_size$collection() * 14);
        sb.append('{');
        int i = arraySet.get_size$collection();
        for (int i8 = 0; i8 < i; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            E eValueAt = arraySet.valueAt(i8);
            if (eValueAt != arraySet) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Set)");
            }
        }
        return AbstractC0037f.m80e('}', "toString(...)", sb);
    }

    public static final <E> E valueAtInternal(@NotNull ArraySet<E> arraySet, int i) {
        AbstractC5830k.m5330g(arraySet, "<this>");
        return (E) arraySet.getArray()[i];
    }

    @NotNull
    public static final <T> ArraySet<T> arraySetOf(@NotNull T... values) {
        AbstractC5830k.m5330g(values, "values");
        ArraySet<T> arraySet = new ArraySet<>(values.length);
        for (T t8 : values) {
            arraySet.add(t8);
        }
        return arraySet;
    }

    public static final <E> boolean removeAllInternal(@NotNull ArraySet<E> arraySet, @NotNull Collection<? extends E> elements) {
        AbstractC5830k.m5330g(arraySet, "<this>");
        AbstractC5830k.m5330g(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= arraySet.remove(it.next());
        }
        return zRemove;
    }

    public static final <E> boolean addAllInternal(@NotNull ArraySet<E> arraySet, @NotNull Collection<? extends E> elements) {
        AbstractC5830k.m5330g(arraySet, "<this>");
        AbstractC5830k.m5330g(elements, "elements");
        arraySet.ensureCapacity(elements.size() + arraySet.get_size$collection());
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= arraySet.add(it.next());
        }
        return zAdd;
    }
}
