package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bJ\u0011\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\bJ\u0011\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\bJ\u0018\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001J\u0018\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0003J\u0011\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\u0002J\u0011\u0010\u0013\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u000bH\u0086\nJ\u0011\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\u0002J\u0011\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\nJ\u0011\u0010\u0014\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u000bH\u0086\nJ\u0011\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\nJ\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0001J\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0017\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u0003J\u001a\u0010\u0018\u001a\u00020\f2\b\b\u0001\u0010\u0019\u001a\u00020\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0001J\u000e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010J\u001b\u0010\u001c\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002J\u0006\u0010\u001d\u001a\u00020\fJ\u0006\u0010\u001e\u001a\u00020\fJ\u0010\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020\u0003R\u0012\u0010\u0005\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006!"}, m7880d2 = {"Landroidx/collection/MutableDoubleList;", "Landroidx/collection/DoubleList;", "initialCapacity", "", "(I)V", "capacity", "getCapacity", "()I", "add", "", "element", "", "", "index", "addAll", "elements", "", "clear", "ensureCapacity", "minusAssign", "plusAssign", "remove", "removeAll", "removeAt", "removeRange", "start", "end", "retainAll", "set", "sort", "sortDescending", "trim", "minCapacity", "collection"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nDoubleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleList.kt\nandroidx/collection/MutableDoubleList\n+ 2 DoubleList.kt\nandroidx/collection/DoubleList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,983:1\n562#1:985\n367#2:984\n72#2:986\n239#2,6:989\n72#2:995\n72#2:996\n72#2:1003\n13351#3,2:987\n1699#3,6:997\n*S KotlinDebug\n*F\n+ 1 DoubleList.kt\nandroidx/collection/MutableDoubleList\n*L\n698#1:985\n634#1:984\n758#1:986\n771#1:989,6\n785#1:995\n831#1:996\n848#1:1003\n766#1:987,2\n833#1:997,6\n*E\n"})
/* loaded from: classes.dex */
public final class MutableDoubleList extends DoubleList {
    public MutableDoubleList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableDoubleList mutableDoubleList, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i6 = mutableDoubleList._size;
        }
        mutableDoubleList.trim(i6);
    }

    public final boolean add(double element) {
        ensureCapacity(this._size + 1);
        double[] dArr = this.content;
        int i6 = this._size;
        dArr[i6] = element;
        this._size = i6 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int index, double[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        double[] dArr = this.content;
        int i6 = this._size;
        if (index != i6) {
            ArraysKt.copyInto(dArr, dArr, elements.length + index, index, i6);
        }
        ArraysKt.copyInto$default(elements, dArr, index, 0, 0, 12, (Object) null);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int capacity) {
        double[] dArr = this.content;
        if (dArr.length < capacity) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, Math.max(capacity, (dArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
            this.content = dArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(double element) {
        remove(element);
    }

    public final void plusAssign(DoubleList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(double element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(double[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i6 = this._size;
        for (double d6 : elements) {
            remove(d6);
        }
        return i6 != this._size;
    }

    public final double removeAt(@IntRange(from = 0) int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        double[] dArr = this.content;
        double d6 = dArr[index];
        int i6 = this._size;
        if (index != i6 - 1) {
            ArraysKt.copyInto(dArr, dArr, index, index + 1, i6);
        }
        this._size--;
        return d6;
    }

    public final void removeRange(@IntRange(from = 0) int start, @IntRange(from = 0) int end) {
        int i6;
        if (start < 0 || start > (i6 = this._size) || end < 0 || end > i6) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        if (end < start) {
            RuntimeHelpersKt.throwIllegalArgumentException("The end index must be < start index");
        }
        if (end != start) {
            int i7 = this._size;
            if (end < i7) {
                double[] dArr = this.content;
                ArraysKt.copyInto(dArr, dArr, start, end, i7);
            }
            this._size -= end - start;
        }
    }

    public final boolean retainAll(double[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i6 = this._size;
        double[] dArr = this.content;
        int i7 = i6 - 1;
        while (true) {
            int i8 = 0;
            int i9 = -1;
            if (-1 >= i7) {
                break;
            }
            double d6 = dArr[i7];
            int length = elements.length;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                if (elements[i8] == d6) {
                    i9 = i8;
                    break;
                }
                i8++;
            }
            if (i9 < 0) {
                removeAt(i7);
            }
            i7--;
        }
        return i6 != this._size;
    }

    public final double set(@IntRange(from = 0) int index, double element) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        double[] dArr = this.content;
        double d6 = dArr[index];
        dArr[index] = element;
        return d6;
    }

    public final void sort() {
        int i6 = this._size;
        if (i6 == 0) {
            return;
        }
        ArraysKt.sort(this.content, 0, i6);
    }

    public final void sortDescending() {
        int i6 = this._size;
        if (i6 == 0) {
            return;
        }
        ArraysKt.sortDescending(this.content, 0, i6);
    }

    public final void trim(int minCapacity) {
        int iMax = Math.max(minCapacity, this._size);
        double[] dArr = this.content;
        if (dArr.length > iMax) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, iMax);
            Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
            this.content = dArrCopyOf;
        }
    }

    public MutableDoubleList(int i6) {
        super(i6, null);
    }

    public final void minusAssign(double[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (double d6 : elements) {
            remove(d6);
        }
    }

    public final void plusAssign(double[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        addAll(this._size, elements);
    }

    public /* synthetic */ MutableDoubleList(int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 16 : i6);
    }

    public final void plusAssign(double element) {
        add(element);
    }

    public final void add(@IntRange(from = 0) int index, double element) {
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        double[] dArr = this.content;
        int i6 = this._size;
        if (index != i6) {
            ArraysKt.copyInto(dArr, dArr, index + 1, index, i6);
        }
        dArr[index] = element;
        this._size++;
    }

    public final void minusAssign(DoubleList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        double[] dArr = elements.content;
        int i6 = elements._size;
        for (int i7 = 0; i7 < i6; i7++) {
            remove(dArr[i7]);
        }
    }

    public final boolean removeAll(DoubleList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i6 = this._size;
        int i7 = elements._size - 1;
        if (i7 >= 0) {
            int i8 = 0;
            while (true) {
                remove(elements.get(i8));
                if (i8 == i7) {
                    break;
                }
                i8++;
            }
        }
        return i6 != this._size;
    }

    public final boolean retainAll(DoubleList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i6 = this._size;
        double[] dArr = this.content;
        for (int i7 = i6 - 1; -1 < i7; i7--) {
            if (!elements.contains(dArr[i7])) {
                removeAt(i7);
            }
        }
        return i6 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int index, DoubleList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i6 = elements._size;
        if (i6 == 0) {
            return false;
        }
        ensureCapacity(this._size + i6);
        double[] dArr = this.content;
        int i7 = this._size;
        if (index != i7) {
            ArraysKt.copyInto(dArr, dArr, elements._size + index, index, i7);
        }
        ArraysKt.copyInto(elements.content, dArr, index, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(DoubleList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(double[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this._size, elements);
    }
}
