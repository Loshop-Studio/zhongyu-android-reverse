package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.AbstractC5786f;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.C5780c;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b!\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\rJ\u001f\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0012J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0013J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\b¢\u0006\u0004\b\u0010\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\n¢\u0006\u0004\b\u0015\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u0005J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u0015\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010 \u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b \u0010\nJ\u0015\u0010!\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b!\u0010\u0014J\u0015\u0010!\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b!\u0010\u0013J\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u001f\u0010\u0017J\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u001f\u0010\u0016J\u0017\u0010\"\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\f2\b\b\u0001\u0010$\u001a\u00020\u00022\b\b\u0001\u0010%\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b(\u0010\u0014J\u0015\u0010(\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b(\u0010\u0013J\"\u0010)\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\f¢\u0006\u0004\b+\u0010\u0019J\r\u0010,\u001a\u00020\f¢\u0006\u0004\b,\u0010\u0019R\u0012\u0010\u001c\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006/"}, m5110d2 = {"Landroidx/collection/MutableLongList;", "Landroidx/collection/LongList;", "", "initialCapacity", "<init>", "(I)V", "", "element", "", "add", "(J)Z", "index", "Ld6/s;", "(IJ)V", "", "elements", "addAll", "(I[J)Z", "(ILandroidx/collection/LongList;)Z", "(Landroidx/collection/LongList;)Z", "([J)Z", "plusAssign", "(Landroidx/collection/LongList;)V", "([J)V", "clear", "()V", "minCapacity", "trim", "capacity", "ensureCapacity", "(J)V", "minusAssign", "remove", "removeAll", "removeAt", "(I)J", "start", "end", "removeRange", "(II)V", "retainAll", "set", "(IJ)J", "sort", "sortDescending", "getCapacity", "()I", "collection"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n+ 2 LongList.kt\nandroidx/collection/LongList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,972:1\n557#1:974\n364#2:973\n70#2:975\n237#2,6:978\n70#2:984\n70#2:985\n70#2:992\n13337#3,2:976\n1675#3,6:986\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n*L\n693#1:974\n629#1:973\n751#1:975\n764#1:978,6\n778#1:984\n824#1:985\n841#1:992\n759#1:976,2\n826#1:986,6\n*E\n"})
/* loaded from: classes.dex */
public final class MutableLongList extends LongList {
    public MutableLongList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableLongList mutableLongList, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = mutableLongList._size;
        }
        mutableLongList.trim(i);
    }

    public final boolean add(long element) {
        ensureCapacity(this._size + 1);
        long[] jArr = this.content;
        int i = this._size;
        jArr[i] = element;
        this._size = i + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index, @NotNull long[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        long[] jArr = this.content;
        int i = this._size;
        if (index != i) {
            AbstractC5802q.m5177D(jArr, jArr, elements.length + index, index, i);
        }
        AbstractC5802q.m5177D(elements, jArr, index, 0, elements.length);
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
            AbstractC5830k.m5329f(jArrCopyOf, "copyOf(...)");
            this.content = jArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(long element) {
        remove(element);
    }

    public final void plusAssign(@NotNull LongList elements) {
        AbstractC5830k.m5330g(elements, "elements");
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

    public final boolean removeAll(@NotNull long[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int i = this._size;
        for (long j7 : elements) {
            remove(j7);
        }
        return i != this._size;
    }

    public final long removeAt(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        long[] jArr = this.content;
        long j7 = jArr[index];
        int i = this._size;
        if (index != i - 1) {
            AbstractC5802q.m5177D(jArr, jArr, index, index + 1, i);
        }
        this._size--;
        return j7;
    }

    public final void removeRange(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int start, @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int end) {
        int i;
        if (start < 0 || start > (i = this._size) || end < 0 || end > i) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        if (end < start) {
            RuntimeHelpersKt.throwIllegalArgumentException("The end index must be < start index");
        }
        if (end != start) {
            int i8 = this._size;
            if (end < i8) {
                long[] jArr = this.content;
                AbstractC5802q.m5177D(jArr, jArr, start, end, i8);
            }
            this._size -= end - start;
        }
    }

    public final boolean retainAll(@NotNull long[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int i = this._size;
        long[] jArr = this.content;
        int i8 = i - 1;
        while (true) {
            int i9 = 0;
            int i10 = -1;
            if (-1 >= i8) {
                break;
            }
            long j7 = jArr[i8];
            int length = elements.length;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (elements[i9] == j7) {
                    i10 = i9;
                    break;
                }
                i9++;
            }
            if (i10 < 0) {
                removeAt(i8);
            }
            i8--;
        }
        return i != this._size;
    }

    public final long set(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index, long element) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        long[] jArr = this.content;
        long j7 = jArr[index];
        jArr[index] = element;
        return j7;
    }

    public final void sort() {
        int i = this._size;
        if (i == 0) {
            return;
        }
        long[] jArr = this.content;
        AbstractC5830k.m5330g(jArr, "<this>");
        Arrays.sort(jArr, 0, i);
    }

    public final void sortDescending() {
        int i = this._size;
        if (i == 0) {
            return;
        }
        long[] jArr = this.content;
        AbstractC5830k.m5330g(jArr, "<this>");
        Arrays.sort(jArr, 0, i);
        C5780c c5780c = AbstractC5786f.Companion;
        int length = jArr.length;
        c5780c.getClass();
        C5780c.m5145d(0, i, length);
        int i8 = i / 2;
        if (i8 == 0) {
            return;
        }
        int i9 = i - 1;
        for (int i10 = 0; i10 < i8; i10++) {
            long j7 = jArr[i10];
            jArr[i10] = jArr[i9];
            jArr[i9] = j7;
            i9--;
        }
    }

    public final void trim(int minCapacity) {
        int iMax = Math.max(minCapacity, this._size);
        long[] jArr = this.content;
        if (jArr.length > iMax) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            AbstractC5830k.m5329f(jArrCopyOf, "copyOf(...)");
            this.content = jArrCopyOf;
        }
    }

    public MutableLongList(int i) {
        super(i, null);
    }

    public final void minusAssign(@NotNull long[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        for (long j7 : elements) {
            remove(j7);
        }
    }

    public final void plusAssign(@NotNull long[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        addAll(this._size, elements);
    }

    public /* synthetic */ MutableLongList(int i, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? 16 : i);
    }

    public final void plusAssign(long element) {
        add(element);
    }

    public final void add(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index, long element) {
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        long[] jArr = this.content;
        int i = this._size;
        if (index != i) {
            AbstractC5802q.m5177D(jArr, jArr, index + 1, index, i);
        }
        jArr[index] = element;
        this._size++;
    }

    public final void minusAssign(@NotNull LongList elements) {
        AbstractC5830k.m5330g(elements, "elements");
        long[] jArr = elements.content;
        int i = elements._size;
        for (int i8 = 0; i8 < i; i8++) {
            remove(jArr[i8]);
        }
    }

    public final boolean removeAll(@NotNull LongList elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int i = this._size;
        int i8 = elements._size - 1;
        if (i8 >= 0) {
            int i9 = 0;
            while (true) {
                remove(elements.get(i9));
                if (i9 == i8) {
                    break;
                }
                i9++;
            }
        }
        return i != this._size;
    }

    public final boolean retainAll(@NotNull LongList elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int i = this._size;
        long[] jArr = this.content;
        for (int i8 = i - 1; -1 < i8; i8--) {
            if (!elements.contains(jArr[i8])) {
                removeAt(i8);
            }
        }
        return i != this._size;
    }

    public final boolean addAll(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index, @NotNull LongList elements) {
        AbstractC5830k.m5330g(elements, "elements");
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i = elements._size;
        if (i == 0) {
            return false;
        }
        ensureCapacity(this._size + i);
        long[] jArr = this.content;
        int i8 = this._size;
        if (index != i8) {
            AbstractC5802q.m5177D(jArr, jArr, elements._size + index, index, i8);
        }
        AbstractC5802q.m5177D(elements.content, jArr, index, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(@NotNull LongList elements) {
        AbstractC5830k.m5330g(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(@NotNull long[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        return addAll(this._size, elements);
    }
}
