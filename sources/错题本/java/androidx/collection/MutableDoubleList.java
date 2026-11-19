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

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\b!\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\rJ\u001f\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0012J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0013J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\b¢\u0006\u0004\b\u0010\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\n¢\u0006\u0004\b\u0015\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u0005J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u0015\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010 \u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b \u0010\nJ\u0015\u0010!\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b!\u0010\u0014J\u0015\u0010!\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b!\u0010\u0013J\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u001f\u0010\u0017J\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u001f\u0010\u0016J\u0017\u0010\"\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\f2\b\b\u0001\u0010$\u001a\u00020\u00022\b\b\u0001\u0010%\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b(\u0010\u0014J\u0015\u0010(\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b(\u0010\u0013J\"\u0010)\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\f¢\u0006\u0004\b+\u0010\u0019J\r\u0010,\u001a\u00020\f¢\u0006\u0004\b,\u0010\u0019R\u0012\u0010\u001c\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006/"}, m5110d2 = {"Landroidx/collection/MutableDoubleList;", "Landroidx/collection/DoubleList;", "", "initialCapacity", "<init>", "(I)V", "", "element", "", "add", "(D)Z", "index", "Ld6/s;", "(ID)V", "", "elements", "addAll", "(I[D)Z", "(ILandroidx/collection/DoubleList;)Z", "(Landroidx/collection/DoubleList;)Z", "([D)Z", "plusAssign", "(Landroidx/collection/DoubleList;)V", "([D)V", "clear", "()V", "minCapacity", "trim", "capacity", "ensureCapacity", "(D)V", "minusAssign", "remove", "removeAll", "removeAt", "(I)D", "start", "end", "removeRange", "(II)V", "retainAll", "set", "(ID)D", "sort", "sortDescending", "getCapacity", "()I", "collection"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDoubleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleList.kt\nandroidx/collection/MutableDoubleList\n+ 2 DoubleList.kt\nandroidx/collection/DoubleList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,983:1\n562#1:985\n367#2:984\n72#2:986\n239#2,6:989\n72#2:995\n72#2:996\n72#2:1003\n13351#3,2:987\n1699#3,6:997\n*S KotlinDebug\n*F\n+ 1 DoubleList.kt\nandroidx/collection/MutableDoubleList\n*L\n698#1:985\n634#1:984\n758#1:986\n771#1:989,6\n785#1:995\n831#1:996\n848#1:1003\n766#1:987,2\n833#1:997,6\n*E\n"})
/* loaded from: classes.dex */
public final class MutableDoubleList extends DoubleList {
    public MutableDoubleList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableDoubleList mutableDoubleList, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = mutableDoubleList._size;
        }
        mutableDoubleList.trim(i);
    }

    public final boolean add(double element) {
        ensureCapacity(this._size + 1);
        double[] dArr = this.content;
        int i = this._size;
        dArr[i] = element;
        this._size = i + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index, @NotNull double[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        double[] dArr = this.content;
        int i = this._size;
        if (index != i) {
            AbstractC5802q.m5175B(dArr, dArr, elements.length + index, index, i);
        }
        AbstractC5802q.m5175B(elements, dArr, index, 0, elements.length);
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
            AbstractC5830k.m5329f(dArrCopyOf, "copyOf(...)");
            this.content = dArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(double element) {
        remove(element);
    }

    public final void plusAssign(@NotNull DoubleList elements) {
        AbstractC5830k.m5330g(elements, "elements");
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

    public final boolean removeAll(@NotNull double[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int i = this._size;
        for (double d9 : elements) {
            remove(d9);
        }
        return i != this._size;
    }

    public final double removeAt(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        double[] dArr = this.content;
        double d9 = dArr[index];
        int i = this._size;
        if (index != i - 1) {
            AbstractC5802q.m5175B(dArr, dArr, index, index + 1, i);
        }
        this._size--;
        return d9;
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
                double[] dArr = this.content;
                AbstractC5802q.m5175B(dArr, dArr, start, end, i8);
            }
            this._size -= end - start;
        }
    }

    public final boolean retainAll(@NotNull double[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int i = this._size;
        double[] dArr = this.content;
        int i8 = i - 1;
        while (true) {
            int i9 = 0;
            int i10 = -1;
            if (-1 >= i8) {
                break;
            }
            double d9 = dArr[i8];
            int length = elements.length;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (elements[i9] == d9) {
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

    public final double set(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index, double element) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        double[] dArr = this.content;
        double d9 = dArr[index];
        dArr[index] = element;
        return d9;
    }

    public final void sort() {
        int i = this._size;
        if (i == 0) {
            return;
        }
        double[] dArr = this.content;
        AbstractC5830k.m5330g(dArr, "<this>");
        Arrays.sort(dArr, 0, i);
    }

    public final void sortDescending() {
        int i = this._size;
        if (i == 0) {
            return;
        }
        double[] dArr = this.content;
        AbstractC5830k.m5330g(dArr, "<this>");
        Arrays.sort(dArr, 0, i);
        C5780c c5780c = AbstractC5786f.Companion;
        int length = dArr.length;
        c5780c.getClass();
        C5780c.m5145d(0, i, length);
        int i8 = i / 2;
        if (i8 == 0) {
            return;
        }
        int i9 = i - 1;
        for (int i10 = 0; i10 < i8; i10++) {
            double d9 = dArr[i10];
            dArr[i10] = dArr[i9];
            dArr[i9] = d9;
            i9--;
        }
    }

    public final void trim(int minCapacity) {
        int iMax = Math.max(minCapacity, this._size);
        double[] dArr = this.content;
        if (dArr.length > iMax) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, iMax);
            AbstractC5830k.m5329f(dArrCopyOf, "copyOf(...)");
            this.content = dArrCopyOf;
        }
    }

    public MutableDoubleList(int i) {
        super(i, null);
    }

    public final void minusAssign(@NotNull double[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        for (double d9 : elements) {
            remove(d9);
        }
    }

    public final void plusAssign(@NotNull double[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        addAll(this._size, elements);
    }

    public /* synthetic */ MutableDoubleList(int i, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? 16 : i);
    }

    public final void plusAssign(double element) {
        add(element);
    }

    public final void add(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index, double element) {
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        double[] dArr = this.content;
        int i = this._size;
        if (index != i) {
            AbstractC5802q.m5175B(dArr, dArr, index + 1, index, i);
        }
        dArr[index] = element;
        this._size++;
    }

    public final void minusAssign(@NotNull DoubleList elements) {
        AbstractC5830k.m5330g(elements, "elements");
        double[] dArr = elements.content;
        int i = elements._size;
        for (int i8 = 0; i8 < i; i8++) {
            remove(dArr[i8]);
        }
    }

    public final boolean removeAll(@NotNull DoubleList elements) {
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

    public final boolean retainAll(@NotNull DoubleList elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int i = this._size;
        double[] dArr = this.content;
        for (int i8 = i - 1; -1 < i8; i8--) {
            if (!elements.contains(dArr[i8])) {
                removeAt(i8);
            }
        }
        return i != this._size;
    }

    public final boolean addAll(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index, @NotNull DoubleList elements) {
        AbstractC5830k.m5330g(elements, "elements");
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i = elements._size;
        if (i == 0) {
            return false;
        }
        ensureCapacity(this._size + i);
        double[] dArr = this.content;
        int i8 = this._size;
        if (index != i8) {
            AbstractC5802q.m5175B(dArr, dArr, elements._size + index, index, i8);
        }
        AbstractC5802q.m5175B(elements.content, dArr, index, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(@NotNull DoubleList elements) {
        AbstractC5830k.m5330g(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(@NotNull double[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        return addAll(this._size, elements);
    }
}
