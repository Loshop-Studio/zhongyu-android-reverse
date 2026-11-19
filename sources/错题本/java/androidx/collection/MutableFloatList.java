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

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b!\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\rJ\u001f\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0012J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0013J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\b¢\u0006\u0004\b\u0010\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\n¢\u0006\u0004\b\u0015\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u0005J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u0015\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010 \u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b \u0010\nJ\u0015\u0010!\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b!\u0010\u0014J\u0015\u0010!\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b!\u0010\u0013J\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u001f\u0010\u0017J\u0018\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u001f\u0010\u0016J\u0017\u0010\"\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\f2\b\b\u0001\u0010$\u001a\u00020\u00022\b\b\u0001\u0010%\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b(\u0010\u0014J\u0015\u0010(\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b(\u0010\u0013J\"\u0010)\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\f¢\u0006\u0004\b+\u0010\u0019J\r\u0010,\u001a\u00020\f¢\u0006\u0004\b,\u0010\u0019R\u0012\u0010\u001c\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006/"}, m5110d2 = {"Landroidx/collection/MutableFloatList;", "Landroidx/collection/FloatList;", "", "initialCapacity", "<init>", "(I)V", "", "element", "", "add", "(F)Z", "index", "Ld6/s;", "(IF)V", "", "elements", "addAll", "(I[F)Z", "(ILandroidx/collection/FloatList;)Z", "(Landroidx/collection/FloatList;)Z", "([F)Z", "plusAssign", "(Landroidx/collection/FloatList;)V", "([F)V", "clear", "()V", "minCapacity", "trim", "capacity", "ensureCapacity", "(F)V", "minusAssign", "remove", "removeAll", "removeAt", "(I)F", "start", "end", "removeRange", "(II)V", "retainAll", "set", "(IF)F", "sort", "sortDescending", "getCapacity", "()I", "collection"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/MutableFloatList\n+ 2 FloatList.kt\nandroidx/collection/FloatList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,976:1\n559#1:978\n365#2:977\n70#2:979\n237#2,6:982\n70#2:988\n70#2:989\n70#2:996\n13344#3,2:980\n1687#3,6:990\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/MutableFloatList\n*L\n695#1:978\n631#1:977\n755#1:979\n768#1:982,6\n782#1:988\n828#1:989\n845#1:996\n763#1:980,2\n830#1:990,6\n*E\n"})
/* loaded from: classes.dex */
public final class MutableFloatList extends FloatList {
    public MutableFloatList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableFloatList mutableFloatList, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = mutableFloatList._size;
        }
        mutableFloatList.trim(i);
    }

    public final boolean add(float element) {
        ensureCapacity(this._size + 1);
        float[] fArr = this.content;
        int i = this._size;
        fArr[i] = element;
        this._size = i + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index, @NotNull float[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        float[] fArr = this.content;
        int i = this._size;
        if (index != i) {
            AbstractC5802q.m5176C(fArr, elements.length + index, fArr, index, i);
        }
        AbstractC5802q.m5180G(elements, index, fArr, 12);
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
            AbstractC5830k.m5329f(fArrCopyOf, "copyOf(...)");
            this.content = fArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(float element) {
        remove(element);
    }

    public final void plusAssign(@NotNull FloatList elements) {
        AbstractC5830k.m5330g(elements, "elements");
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

    public final boolean removeAll(@NotNull float[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int i = this._size;
        for (float f : elements) {
            remove(f);
        }
        return i != this._size;
    }

    public final float removeAt(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        float[] fArr = this.content;
        float f = fArr[index];
        int i = this._size;
        if (index != i - 1) {
            AbstractC5802q.m5176C(fArr, index, fArr, index + 1, i);
        }
        this._size--;
        return f;
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
                float[] fArr = this.content;
                AbstractC5802q.m5176C(fArr, start, fArr, end, i8);
            }
            this._size -= end - start;
        }
    }

    public final boolean retainAll(@NotNull float[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int i = this._size;
        float[] fArr = this.content;
        int i8 = i - 1;
        while (true) {
            int i9 = 0;
            int i10 = -1;
            if (-1 >= i8) {
                break;
            }
            float f = fArr[i8];
            int length = elements.length;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (elements[i9] == f) {
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

    public final float set(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index, float element) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        float[] fArr = this.content;
        float f = fArr[index];
        fArr[index] = element;
        return f;
    }

    public final void sort() {
        int i = this._size;
        if (i == 0) {
            return;
        }
        float[] fArr = this.content;
        AbstractC5830k.m5330g(fArr, "<this>");
        Arrays.sort(fArr, 0, i);
    }

    public final void sortDescending() {
        int i = this._size;
        if (i == 0) {
            return;
        }
        float[] fArr = this.content;
        AbstractC5830k.m5330g(fArr, "<this>");
        Arrays.sort(fArr, 0, i);
        C5780c c5780c = AbstractC5786f.Companion;
        int length = fArr.length;
        c5780c.getClass();
        C5780c.m5145d(0, i, length);
        int i8 = i / 2;
        if (i8 == 0) {
            return;
        }
        int i9 = i - 1;
        for (int i10 = 0; i10 < i8; i10++) {
            float f = fArr[i10];
            fArr[i10] = fArr[i9];
            fArr[i9] = f;
            i9--;
        }
    }

    public final void trim(int minCapacity) {
        int iMax = Math.max(minCapacity, this._size);
        float[] fArr = this.content;
        if (fArr.length > iMax) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, iMax);
            AbstractC5830k.m5329f(fArrCopyOf, "copyOf(...)");
            this.content = fArrCopyOf;
        }
    }

    public MutableFloatList(int i) {
        super(i, null);
    }

    public final void minusAssign(@NotNull float[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        for (float f : elements) {
            remove(f);
        }
    }

    public final void plusAssign(@NotNull float[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        addAll(this._size, elements);
    }

    public /* synthetic */ MutableFloatList(int i, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? 16 : i);
    }

    public final void plusAssign(float element) {
        add(element);
    }

    public final void add(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index, float element) {
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        float[] fArr = this.content;
        int i = this._size;
        if (index != i) {
            AbstractC5802q.m5176C(fArr, index + 1, fArr, index, i);
        }
        fArr[index] = element;
        this._size++;
    }

    public final void minusAssign(@NotNull FloatList elements) {
        AbstractC5830k.m5330g(elements, "elements");
        float[] fArr = elements.content;
        int i = elements._size;
        for (int i8 = 0; i8 < i; i8++) {
            remove(fArr[i8]);
        }
    }

    public final boolean removeAll(@NotNull FloatList elements) {
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

    public final boolean retainAll(@NotNull FloatList elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int i = this._size;
        float[] fArr = this.content;
        for (int i8 = i - 1; -1 < i8; i8--) {
            if (!elements.contains(fArr[i8])) {
                removeAt(i8);
            }
        }
        return i != this._size;
    }

    public final boolean addAll(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index, @NotNull FloatList elements) {
        AbstractC5830k.m5330g(elements, "elements");
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i = elements._size;
        if (i == 0) {
            return false;
        }
        ensureCapacity(this._size + i);
        float[] fArr = this.content;
        int i8 = this._size;
        if (index != i8) {
            AbstractC5802q.m5176C(fArr, elements._size + index, fArr, index, i8);
        }
        AbstractC5802q.m5176C(elements.content, index, fArr, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(@NotNull FloatList elements) {
        AbstractC5830k.m5330g(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(@NotNull float[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        return addAll(this._size, elements);
    }
}
