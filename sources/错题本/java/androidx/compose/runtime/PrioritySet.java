package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0013J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010#\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006%"}, m5110d2 = {"Landroidx/compose/runtime/PrioritySet;", "", "Landroidx/collection/MutableIntList;", "list", "constructor-impl", "(Landroidx/collection/MutableIntList;)Landroidx/collection/MutableIntList;", "", "value", "Ld6/s;", "add-impl", "(Landroidx/collection/MutableIntList;I)V", "add", "", "isEmpty-impl", "(Landroidx/collection/MutableIntList;)Z", "isEmpty", "isNotEmpty-impl", "isNotEmpty", "peek-impl", "(Landroidx/collection/MutableIntList;)I", "peek", "takeMax-impl", "takeMax", "validateHeap-impl", "(Landroidx/collection/MutableIntList;)V", "validateHeap", "", "toString-impl", "(Landroidx/collection/MutableIntList;)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "equals-impl", "(Landroidx/collection/MutableIntList;Ljava/lang/Object;)Z", "equals", "Landroidx/collection/MutableIntList;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 IntList.kt\nandroidx/collection/IntListKt\n*L\n1#1,3963:1\n366#2:3964\n65#2:3965\n65#2:3966\n363#2:3967\n366#2:3968\n65#2:3969\n366#2:3974\n65#2:3975\n65#2:3976\n65#2:3977\n65#2:3978\n4658#3,4:3970\n57#4,5:3979\n57#4,5:3984\n905#5:3989\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n*L\n3875#1:3964\n3875#1:3965\n3877#1:3966\n3892#1:3967\n3894#1:3968\n3900#1:3969\n3907#1:3974\n3910#1:3975\n3912#1:3976\n3913#1:3977\n3944#1:3978\n3900#1:3970,4\n3948#1:3979,5\n3949#1:3984,5\n3871#1:3989\n*E\n"})
/* loaded from: classes.dex */
public final class PrioritySet {

    @NotNull
    private final MutableIntList list;

    private /* synthetic */ PrioritySet(MutableIntList mutableIntList) {
        this.list = mutableIntList;
    }

    /* renamed from: add-impl, reason: not valid java name */
    public static final void m10062addimpl(MutableIntList mutableIntList, int i) {
        if (mutableIntList._size == 0 || !(mutableIntList.get(0) == i || mutableIntList.get(mutableIntList._size - 1) == i)) {
            int i8 = mutableIntList._size;
            mutableIntList.add(i);
            while (i8 > 0) {
                int i9 = ((i8 + 1) >>> 1) - 1;
                int i10 = mutableIntList.get(i9);
                if (i <= i10) {
                    break;
                }
                mutableIntList.set(i8, i10);
                i8 = i9;
            }
            mutableIntList.set(i8, i);
        }
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PrioritySet m10063boximpl(MutableIntList mutableIntList) {
        return new PrioritySet(mutableIntList);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static MutableIntList m10064constructorimpl(@NotNull MutableIntList mutableIntList) {
        return mutableIntList;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableIntList m10065constructorimpl$default(MutableIntList mutableIntList, int i, AbstractC5824e abstractC5824e) {
        int i8 = 1;
        if ((i & 1) != 0) {
            mutableIntList = new MutableIntList(0, i8, null);
        }
        return m10064constructorimpl(mutableIntList);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10066equalsimpl(MutableIntList mutableIntList, Object obj) {
        return (obj instanceof PrioritySet) && AbstractC5830k.m5325b(mutableIntList, ((PrioritySet) obj).getList());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10067equalsimpl0(MutableIntList mutableIntList, MutableIntList mutableIntList2) {
        return AbstractC5830k.m5325b(mutableIntList, mutableIntList2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10068hashCodeimpl(MutableIntList mutableIntList) {
        return mutableIntList.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m10069isEmptyimpl(MutableIntList mutableIntList) {
        return mutableIntList._size == 0;
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m10070isNotEmptyimpl(MutableIntList mutableIntList) {
        return mutableIntList._size != 0;
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final int m10071peekimpl(MutableIntList mutableIntList) {
        return mutableIntList.first();
    }

    /* renamed from: takeMax-impl, reason: not valid java name */
    public static final int m10072takeMaximpl(MutableIntList mutableIntList) {
        int i;
        int i8 = mutableIntList._size;
        int i9 = mutableIntList.get(0);
        while (mutableIntList._size != 0 && mutableIntList.get(0) == i9) {
            mutableIntList.set(0, mutableIntList.last());
            mutableIntList.removeAt(mutableIntList._size - 1);
            int i10 = mutableIntList._size;
            int i11 = i10 >>> 1;
            int i12 = 0;
            while (i12 < i11) {
                int i13 = mutableIntList.get(i12);
                int i14 = (i12 + 1) * 2;
                int i15 = i14 - 1;
                int i16 = mutableIntList.get(i15);
                if (i14 >= i10 || (i = mutableIntList.get(i14)) <= i16) {
                    if (i16 > i13) {
                        mutableIntList.set(i12, i16);
                        mutableIntList.set(i15, i13);
                        i12 = i15;
                    }
                } else if (i > i13) {
                    mutableIntList.set(i12, i);
                    mutableIntList.set(i14, i13);
                    i12 = i14;
                }
            }
        }
        return i9;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10073toStringimpl(MutableIntList mutableIntList) {
        return "PrioritySet(list=" + mutableIntList + ')';
    }

    /* renamed from: validateHeap-impl, reason: not valid java name */
    public static final void m10074validateHeapimpl(MutableIntList mutableIntList) {
        int i = mutableIntList._size;
        int i8 = i / 2;
        int i9 = 0;
        while (i9 < i8) {
            int i10 = i9 + 1;
            int i11 = i10 * 2;
            boolean z8 = true;
            if (!(mutableIntList.get(i9) >= mutableIntList.get(i11 + (-1)))) {
                PreconditionsKt.throwIllegalStateException("Check failed.");
            }
            if (i11 < i && mutableIntList.get(i9) < mutableIntList.get(i11)) {
                z8 = false;
            }
            if (!z8) {
                PreconditionsKt.throwIllegalStateException("Check failed.");
            }
            i9 = i10;
        }
    }

    public boolean equals(Object obj) {
        return m10066equalsimpl(this.list, obj);
    }

    public int hashCode() {
        return m10068hashCodeimpl(this.list);
    }

    public String toString() {
        return m10073toStringimpl(this.list);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ MutableIntList getList() {
        return this.list;
    }
}
