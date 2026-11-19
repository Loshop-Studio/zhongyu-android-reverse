package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bJ\u0011\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\bJ\u0011\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\bJ\u0018\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001J\u0018\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0003J\u0011\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\u0002J\u0011\u0010\u0013\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u000bH\u0086\nJ\u0011\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\u0002J\u0011\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\nJ\u0011\u0010\u0014\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u000bH\u0086\nJ\u0011\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\nJ\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0001J\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0017\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u0003J\u001a\u0010\u0018\u001a\u00020\f2\b\b\u0001\u0010\u0019\u001a\u00020\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0001J\u000e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010J\u001b\u0010\u001c\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002J\u0006\u0010\u001d\u001a\u00020\fJ\u0006\u0010\u001e\u001a\u00020\fJ\u0010\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020\u0003R\u0012\u0010\u0005\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006!"}, m13413d2 = {"Landroidx/collection/MutableFloatList;", "Landroidx/collection/FloatList;", "initialCapacity", "", "(I)V", "capacity", "getCapacity", "()I", "add", "", "element", "", "", "index", "addAll", "elements", "", "clear", "ensureCapacity", "minusAssign", "plusAssign", "remove", "removeAll", "removeAt", "removeRange", "start", "end", "retainAll", "set", "sort", "sortDescending", "trim", "minCapacity", "collection"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/MutableFloatList\n+ 2 FloatList.kt\nandroidx/collection/FloatList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,976:1\n559#1:978\n365#2:977\n70#2:979\n237#2,6:982\n70#2:988\n70#2:989\n70#2:996\n13344#3,2:980\n1687#3,6:990\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/MutableFloatList\n*L\n695#1:978\n631#1:977\n755#1:979\n768#1:982,6\n782#1:988\n828#1:989\n845#1:996\n763#1:980,2\n830#1:990,6\n*E\n"})
/* loaded from: classes.dex */
public final class MutableFloatList extends FloatList {
    public MutableFloatList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableFloatList mutableFloatList, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i9 = mutableFloatList._size;
        }
        mutableFloatList.trim(i9);
    }

    public final boolean add(float element) {
        ensureCapacity(this._size + 1);
        float[] fArr = this.content;
        int i9 = this._size;
        fArr[i9] = element;
        this._size = i9 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int index, float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        float[] fArr = this.content;
        int i9 = this._size;
        if (index != i9) {
            ArraysKt.copyInto(fArr, fArr, elements.length + index, index, i9);
        }
        ArraysKt.copyInto$default(elements, fArr, index, 0, 0, 12, (Object) null);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int capacity) {
        float[] fArr = this.content;
        if (fArr.length < capacity) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(capacity, (fArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
            this.content = fArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(float element) {
        remove(element);
    }

    public final void plusAssign(FloatList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(float element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i9 = this._size;
        for (float f10 : elements) {
            remove(f10);
        }
        return i9 != this._size;
    }

    public final float removeAt(@IntRange(from = 0) int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        float[] fArr = this.content;
        float f10 = fArr[index];
        int i9 = this._size;
        if (index != i9 - 1) {
            ArraysKt.copyInto(fArr, fArr, index, index + 1, i9);
        }
        this._size--;
        return f10;
    }

    public final void removeRange(@IntRange(from = 0) int start, @IntRange(from = 0) int end) {
        int i9;
        if (start < 0 || start > (i9 = this._size) || end < 0 || end > i9) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        if (end < start) {
            RuntimeHelpersKt.throwIllegalArgumentException("The end index must be < start index");
        }
        if (end != start) {
            int i10 = this._size;
            if (end < i10) {
                float[] fArr = this.content;
                ArraysKt.copyInto(fArr, fArr, start, end, i10);
            }
            this._size -= end - start;
        }
    }

    public final boolean retainAll(float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i9 = this._size;
        float[] fArr = this.content;
        int i10 = i9 - 1;
        while (true) {
            int i11 = 0;
            int i12 = -1;
            if (-1 >= i10) {
                break;
            }
            float f10 = fArr[i10];
            int length = elements.length;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (elements[i11] == f10) {
                    i12 = i11;
                    break;
                }
                i11++;
            }
            if (i12 < 0) {
                removeAt(i10);
            }
            i10--;
        }
        return i9 != this._size;
    }

    public final float set(@IntRange(from = 0) int index, float element) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        float[] fArr = this.content;
        float f10 = fArr[index];
        fArr[index] = element;
        return f10;
    }

    public final void sort() {
        int i9 = this._size;
        if (i9 == 0) {
            return;
        }
        ArraysKt.sort(this.content, 0, i9);
    }

    public final void sortDescending() {
        int i9 = this._size;
        if (i9 == 0) {
            return;
        }
        ArraysKt.sortDescending(this.content, 0, i9);
    }

    public final void trim(int minCapacity) {
        int iMax = Math.max(minCapacity, this._size);
        float[] fArr = this.content;
        if (fArr.length > iMax) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, iMax);
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
            this.content = fArrCopyOf;
        }
    }

    public MutableFloatList(int i9) {
        super(i9, null);
    }

    public final void minusAssign(float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (float f10 : elements) {
            remove(f10);
        }
    }

    public final void plusAssign(float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        addAll(this._size, elements);
    }

    public /* synthetic */ MutableFloatList(int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 16 : i9);
    }

    public final void plusAssign(float element) {
        add(element);
    }

    public final void add(@IntRange(from = 0) int index, float element) {
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        float[] fArr = this.content;
        int i9 = this._size;
        if (index != i9) {
            ArraysKt.copyInto(fArr, fArr, index + 1, index, i9);
        }
        fArr[index] = element;
        this._size++;
    }

    public final void minusAssign(FloatList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        float[] fArr = elements.content;
        int i9 = elements._size;
        for (int i10 = 0; i10 < i9; i10++) {
            remove(fArr[i10]);
        }
    }

    public final boolean removeAll(FloatList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i9 = this._size;
        int i10 = elements._size - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                remove(elements.get(i11));
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        return i9 != this._size;
    }

    public final boolean retainAll(FloatList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i9 = this._size;
        float[] fArr = this.content;
        for (int i10 = i9 - 1; -1 < i10; i10--) {
            if (!elements.contains(fArr[i10])) {
                removeAt(i10);
            }
        }
        return i9 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int index, FloatList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i9 = elements._size;
        if (i9 == 0) {
            return false;
        }
        ensureCapacity(this._size + i9);
        float[] fArr = this.content;
        int i10 = this._size;
        if (index != i10) {
            ArraysKt.copyInto(fArr, fArr, elements._size + index, index, i10);
        }
        ArraysKt.copyInto(elements.content, fArr, index, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(FloatList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this._size, elements);
    }
}
