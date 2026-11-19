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

@Metadata(m13412d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\b\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\fJ\u0011\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\bJ\u0018\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001J\u0018\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010J\u0011\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\bJ\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0003J\u0011\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\u0002J\u0011\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086\nJ\u0011\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\u0002J\u0011\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\nJ\u0011\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086\nJ\u0011\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\nJ\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0001J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0017\u001a\u00020\f2\b\b\u0001\u0010\n\u001a\u00020\u0003J\u001a\u0010\u0018\u001a\u00020\t2\b\b\u0001\u0010\u0019\u001a\u00020\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0001J\u000e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u001b\u0010\u001c\u001a\u00020\f2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002J\u0006\u0010\u001d\u001a\u00020\tJ\u0006\u0010\u001e\u001a\u00020\tJ\u0010\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\u0003R\u0012\u0010\u0005\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006!"}, m13413d2 = {"Landroidx/collection/MutableLongList;", "Landroidx/collection/LongList;", "initialCapacity", "", "(I)V", "capacity", "getCapacity", "()I", "add", "", "index", "element", "", "", "addAll", "elements", "", "clear", "ensureCapacity", "minusAssign", "plusAssign", "remove", "removeAll", "removeAt", "removeRange", "start", "end", "retainAll", "set", "sort", "sortDescending", "trim", "minCapacity", "collection"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n+ 2 LongList.kt\nandroidx/collection/LongList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,972:1\n557#1:974\n364#2:973\n70#2:975\n237#2,6:978\n70#2:984\n70#2:985\n70#2:992\n13337#3,2:976\n1675#3,6:986\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n*L\n693#1:974\n629#1:973\n751#1:975\n764#1:978,6\n778#1:984\n824#1:985\n841#1:992\n759#1:976,2\n826#1:986,6\n*E\n"})
/* loaded from: classes.dex */
public final class MutableLongList extends LongList {
    public MutableLongList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableLongList mutableLongList, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i9 = mutableLongList._size;
        }
        mutableLongList.trim(i9);
    }

    public final boolean add(long element) {
        ensureCapacity(this._size + 1);
        long[] jArr = this.content;
        int i9 = this._size;
        jArr[i9] = element;
        this._size = i9 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int index, long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        long[] jArr = this.content;
        int i9 = this._size;
        if (index != i9) {
            ArraysKt.copyInto(jArr, jArr, elements.length + index, index, i9);
        }
        ArraysKt.copyInto$default(elements, jArr, index, 0, 0, 12, (Object) null);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int capacity) {
        long[] jArr = this.content;
        if (jArr.length < capacity) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(capacity, (jArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.content = jArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(long element) {
        remove(element);
    }

    public final void plusAssign(LongList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(long element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i9 = this._size;
        for (long j9 : elements) {
            remove(j9);
        }
        return i9 != this._size;
    }

    public final long removeAt(@IntRange(from = 0) int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        long[] jArr = this.content;
        long j9 = jArr[index];
        int i9 = this._size;
        if (index != i9 - 1) {
            ArraysKt.copyInto(jArr, jArr, index, index + 1, i9);
        }
        this._size--;
        return j9;
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
                long[] jArr = this.content;
                ArraysKt.copyInto(jArr, jArr, start, end, i10);
            }
            this._size -= end - start;
        }
    }

    public final boolean retainAll(long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i9 = this._size;
        long[] jArr = this.content;
        int i10 = i9 - 1;
        while (true) {
            int i11 = 0;
            int i12 = -1;
            if (-1 >= i10) {
                break;
            }
            long j9 = jArr[i10];
            int length = elements.length;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (elements[i11] == j9) {
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

    public final long set(@IntRange(from = 0) int index, long element) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        long[] jArr = this.content;
        long j9 = jArr[index];
        jArr[index] = element;
        return j9;
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
        long[] jArr = this.content;
        if (jArr.length > iMax) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.content = jArrCopyOf;
        }
    }

    public MutableLongList(int i9) {
        super(i9, null);
    }

    public final void minusAssign(long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (long j9 : elements) {
            remove(j9);
        }
    }

    public final void plusAssign(long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        addAll(this._size, elements);
    }

    public /* synthetic */ MutableLongList(int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 16 : i9);
    }

    public final void plusAssign(long element) {
        add(element);
    }

    public final void add(@IntRange(from = 0) int index, long element) {
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        long[] jArr = this.content;
        int i9 = this._size;
        if (index != i9) {
            ArraysKt.copyInto(jArr, jArr, index + 1, index, i9);
        }
        jArr[index] = element;
        this._size++;
    }

    public final void minusAssign(LongList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        long[] jArr = elements.content;
        int i9 = elements._size;
        for (int i10 = 0; i10 < i9; i10++) {
            remove(jArr[i10]);
        }
    }

    public final boolean removeAll(LongList elements) {
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

    public final boolean retainAll(LongList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i9 = this._size;
        long[] jArr = this.content;
        for (int i10 = i9 - 1; -1 < i10; i10--) {
            if (!elements.contains(jArr[i10])) {
                removeAt(i10);
            }
        }
        return i9 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int index, LongList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i9 = elements._size;
        if (i9 == 0) {
            return false;
        }
        ensureCapacity(this._size + i9);
        long[] jArr = this.content;
        int i10 = this._size;
        if (index != i10) {
            ArraysKt.copyInto(jArr, jArr, elements._size + index, index, i10);
        }
        ArraysKt.copyInto(elements.content, jArr, index, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(LongList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(long[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this._size, elements);
    }
}
