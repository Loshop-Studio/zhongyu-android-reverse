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

@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u001f\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\b\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0011J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0012J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0086\n¢\u0006\u0004\b\u0014\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0005J\u0015\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u0005J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0014\u0010\u0005J\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u001d\u0010\u0005J\u0015\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\tJ\u0015\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010\u0013J\u0015\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u001f\u0010\u0012J\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u0016J\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u0015J\u0017\u0010 \u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J!\u0010$\u001a\u00020\u000b2\b\b\u0001\u0010\"\u001a\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\u0002¢\u0006\u0004\b$\u0010\fJ\u0015\u0010%\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b%\u0010\u0013J\u0015\u0010%\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b%\u0010\u0012J\"\u0010&\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u000b¢\u0006\u0004\b(\u0010\u0018J\r\u0010)\u001a\u00020\u000b¢\u0006\u0004\b)\u0010\u0018R\u0012\u0010\u001b\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006,"}, m5110d2 = {"Landroidx/collection/MutableIntList;", "Landroidx/collection/IntList;", "", "initialCapacity", "<init>", "(I)V", "element", "", "add", "(I)Z", "index", "Ld6/s;", "(II)V", "", "elements", "addAll", "(I[I)Z", "(ILandroidx/collection/IntList;)Z", "(Landroidx/collection/IntList;)Z", "([I)Z", "plusAssign", "(Landroidx/collection/IntList;)V", "([I)V", "clear", "()V", "minCapacity", "trim", "capacity", "ensureCapacity", "minusAssign", "remove", "removeAll", "removeAt", "(I)I", "start", "end", "removeRange", "retainAll", "set", "(II)I", "sort", "sortDescending", "getCapacity", "()I", "collection"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,968:1\n556#1:970\n363#2:969\n70#2:971\n237#2,6:974\n70#2:980\n70#2:981\n70#2:988\n13330#3,2:972\n1663#3,6:982\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n*L\n692#1:970\n628#1:969\n749#1:971\n762#1:974,6\n776#1:980\n822#1:981\n839#1:988\n757#1:972,2\n824#1:982,6\n*E\n"})
/* loaded from: classes.dex */
public final class MutableIntList extends IntList {
    public MutableIntList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableIntList mutableIntList, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = mutableIntList._size;
        }
        mutableIntList.trim(i);
    }

    public final boolean add(int element) {
        ensureCapacity(this._size + 1);
        int[] iArr = this.content;
        int i = this._size;
        iArr[i] = element;
        this._size = i + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index, @NotNull int[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        int[] iArr = this.content;
        int i = this._size;
        if (index != i) {
            AbstractC5802q.m5212y(elements.length + index, index, iArr, iArr, i);
        }
        AbstractC5802q.m5179F(index, 0, elements, iArr, 12);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int capacity) {
        int[] iArr = this.content;
        if (iArr.length < capacity) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(capacity, (iArr.length * 3) / 2));
            AbstractC5830k.m5329f(iArrCopyOf, "copyOf(...)");
            this.content = iArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(int element) {
        remove(element);
    }

    public final void plusAssign(@NotNull IntList elements) {
        AbstractC5830k.m5330g(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(int element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(@NotNull int[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int i = this._size;
        for (int i8 : elements) {
            remove(i8);
        }
        return i != this._size;
    }

    public final int removeAt(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i = iArr[index];
        int i8 = this._size;
        if (index != i8 - 1) {
            AbstractC5802q.m5212y(index, index + 1, iArr, iArr, i8);
        }
        this._size--;
        return i;
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
                int[] iArr = this.content;
                AbstractC5802q.m5212y(start, end, iArr, iArr, i8);
            }
            this._size -= end - start;
        }
    }

    public final boolean retainAll(@NotNull int[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int i = this._size;
        int[] iArr = this.content;
        int i8 = i - 1;
        while (true) {
            int i9 = 0;
            int i10 = -1;
            if (-1 >= i8) {
                break;
            }
            int i11 = iArr[i8];
            int length = elements.length;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (elements[i9] == i11) {
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

    public final int set(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index, int element) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i = iArr[index];
        iArr[index] = element;
        return i;
    }

    public final void sort() {
        int i = this._size;
        if (i == 0) {
            return;
        }
        int[] iArr = this.content;
        AbstractC5830k.m5330g(iArr, "<this>");
        Arrays.sort(iArr, 0, i);
    }

    public final void sortDescending() {
        int i = this._size;
        if (i == 0) {
            return;
        }
        int[] iArr = this.content;
        AbstractC5830k.m5330g(iArr, "<this>");
        Arrays.sort(iArr, 0, i);
        C5780c c5780c = AbstractC5786f.Companion;
        int length = iArr.length;
        c5780c.getClass();
        C5780c.m5145d(0, i, length);
        int i8 = i / 2;
        if (i8 == 0) {
            return;
        }
        int i9 = i - 1;
        for (int i10 = 0; i10 < i8; i10++) {
            int i11 = iArr[i10];
            iArr[i10] = iArr[i9];
            iArr[i9] = i11;
            i9--;
        }
    }

    public final void trim(int minCapacity) {
        int iMax = Math.max(minCapacity, this._size);
        int[] iArr = this.content;
        if (iArr.length > iMax) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            AbstractC5830k.m5329f(iArrCopyOf, "copyOf(...)");
            this.content = iArrCopyOf;
        }
    }

    public MutableIntList(int i) {
        super(i, null);
    }

    public final void minusAssign(@NotNull int[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        for (int i : elements) {
            remove(i);
        }
    }

    public final void plusAssign(@NotNull int[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        addAll(this._size, elements);
    }

    public /* synthetic */ MutableIntList(int i, int i8, AbstractC5824e abstractC5824e) {
        this((i8 & 1) != 0 ? 16 : i);
    }

    public final void plusAssign(int element) {
        add(element);
    }

    public final void add(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index, int element) {
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        int[] iArr = this.content;
        int i = this._size;
        if (index != i) {
            AbstractC5802q.m5212y(index + 1, index, iArr, iArr, i);
        }
        iArr[index] = element;
        this._size++;
    }

    public final void minusAssign(@NotNull IntList elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int[] iArr = elements.content;
        int i = elements._size;
        for (int i8 = 0; i8 < i; i8++) {
            remove(iArr[i8]);
        }
    }

    public final boolean removeAll(@NotNull IntList elements) {
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

    public final boolean retainAll(@NotNull IntList elements) {
        AbstractC5830k.m5330g(elements, "elements");
        int i = this._size;
        int[] iArr = this.content;
        for (int i8 = i - 1; -1 < i8; i8--) {
            if (!elements.contains(iArr[i8])) {
                removeAt(i8);
            }
        }
        return i != this._size;
    }

    public final boolean addAll(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int index, @NotNull IntList elements) {
        AbstractC5830k.m5330g(elements, "elements");
        if (index < 0 || index > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i = elements._size;
        if (i == 0) {
            return false;
        }
        ensureCapacity(this._size + i);
        int[] iArr = this.content;
        int i8 = this._size;
        if (index != i8) {
            AbstractC5802q.m5212y(elements._size + index, index, iArr, iArr, i8);
        }
        AbstractC5802q.m5212y(index, 0, elements.content, iArr, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(@NotNull IntList elements) {
        AbstractC5830k.m5330g(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(@NotNull int[] elements) {
        AbstractC5830k.m5330g(elements, "elements");
        return addAll(this._size, elements);
    }
}
