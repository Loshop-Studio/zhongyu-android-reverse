package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0016J\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u0013J\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001d\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006$"}, m13558d2 = {"Landroidx/compose/runtime/PrioritySet;", "", "list", "Landroidx/collection/MutableIntList;", "constructor-impl", "(Landroidx/collection/MutableIntList;)Landroidx/collection/MutableIntList;", "add", "", "value", "", "add-impl", "(Landroidx/collection/MutableIntList;I)V", "equals", "", "other", "equals-impl", "(Landroidx/collection/MutableIntList;Ljava/lang/Object;)Z", "hashCode", "hashCode-impl", "(Landroidx/collection/MutableIntList;)I", "isEmpty", "isEmpty-impl", "(Landroidx/collection/MutableIntList;)Z", "isNotEmpty", "isNotEmpty-impl", "peek", "peek-impl", "takeMax", "takeMax-impl", "toString", "", "toString-impl", "(Landroidx/collection/MutableIntList;)Ljava/lang/String;", "validateHeap", "validateHeap-impl", "(Landroidx/collection/MutableIntList;)V", "runtime_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 IntList.kt\nandroidx/collection/IntListKt\n*L\n1#1,3963:1\n366#2:3964\n65#2:3965\n65#2:3966\n363#2:3967\n366#2:3968\n65#2:3969\n366#2:3974\n65#2:3975\n65#2:3976\n65#2:3977\n65#2:3978\n4658#3,4:3970\n57#4,5:3979\n57#4,5:3984\n905#5:3989\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n*L\n3875#1:3964\n3875#1:3965\n3877#1:3966\n3892#1:3967\n3894#1:3968\n3900#1:3969\n3907#1:3974\n3910#1:3975\n3912#1:3976\n3913#1:3977\n3944#1:3978\n3900#1:3970,4\n3948#1:3979,5\n3949#1:3984,5\n3871#1:3989\n*E\n"})
/* loaded from: classes2.dex */
public final class PrioritySet {
    private final MutableIntList list;

    private /* synthetic */ PrioritySet(MutableIntList mutableIntList) {
        this.list = mutableIntList;
    }

    /* renamed from: add-impl, reason: not valid java name */
    public static final void m20377addimpl(MutableIntList mutableIntList, int i10) {
        if (mutableIntList._size == 0 || !(mutableIntList.get(0) == i10 || mutableIntList.get(mutableIntList._size - 1) == i10)) {
            int i11 = mutableIntList._size;
            mutableIntList.add(i10);
            while (i11 > 0) {
                int i12 = ((i11 + 1) >>> 1) - 1;
                int i13 = mutableIntList.get(i12);
                if (i10 <= i13) {
                    break;
                }
                mutableIntList.set(i11, i13);
                i11 = i12;
            }
            mutableIntList.set(i11, i10);
        }
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PrioritySet m20378boximpl(MutableIntList mutableIntList) {
        return new PrioritySet(mutableIntList);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static MutableIntList m20379constructorimpl(MutableIntList mutableIntList) {
        return mutableIntList;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableIntList m20380constructorimpl$default(MutableIntList mutableIntList, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        int i11 = 1;
        if ((i10 & 1) != 0) {
            mutableIntList = new MutableIntList(0, i11, null);
        }
        return m20379constructorimpl(mutableIntList);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m20381equalsimpl(MutableIntList mutableIntList, Object obj) {
        return (obj instanceof PrioritySet) && Intrinsics.areEqual(mutableIntList, ((PrioritySet) obj).getList());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m20382equalsimpl0(MutableIntList mutableIntList, MutableIntList mutableIntList2) {
        return Intrinsics.areEqual(mutableIntList, mutableIntList2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m20383hashCodeimpl(MutableIntList mutableIntList) {
        return mutableIntList.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m20384isEmptyimpl(MutableIntList mutableIntList) {
        return mutableIntList._size == 0;
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m20385isNotEmptyimpl(MutableIntList mutableIntList) {
        return mutableIntList._size != 0;
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final int m20386peekimpl(MutableIntList mutableIntList) {
        return mutableIntList.first();
    }

    /* renamed from: takeMax-impl, reason: not valid java name */
    public static final int m20387takeMaximpl(MutableIntList mutableIntList) {
        int i10;
        int i11 = mutableIntList._size;
        int i12 = mutableIntList.get(0);
        while (mutableIntList._size != 0 && mutableIntList.get(0) == i12) {
            mutableIntList.set(0, mutableIntList.last());
            mutableIntList.removeAt(mutableIntList._size - 1);
            int i13 = mutableIntList._size;
            int i14 = i13 >>> 1;
            int i15 = 0;
            while (i15 < i14) {
                int i16 = mutableIntList.get(i15);
                int i17 = (i15 + 1) * 2;
                int i18 = i17 - 1;
                int i19 = mutableIntList.get(i18);
                if (i17 >= i13 || (i10 = mutableIntList.get(i17)) <= i19) {
                    if (i19 > i16) {
                        mutableIntList.set(i15, i19);
                        mutableIntList.set(i18, i16);
                        i15 = i18;
                    }
                } else if (i10 > i16) {
                    mutableIntList.set(i15, i10);
                    mutableIntList.set(i17, i16);
                    i15 = i17;
                }
            }
        }
        return i12;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m20388toStringimpl(MutableIntList mutableIntList) {
        return "PrioritySet(list=" + mutableIntList + ')';
    }

    /* renamed from: validateHeap-impl, reason: not valid java name */
    public static final void m20389validateHeapimpl(MutableIntList mutableIntList) {
        int i10 = mutableIntList._size;
        int i11 = i10 / 2;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i12 + 1;
            int i14 = i13 * 2;
            boolean z9 = true;
            if (!(mutableIntList.get(i12) >= mutableIntList.get(i14 + (-1)))) {
                PreconditionsKt.throwIllegalStateException("Check failed.");
            }
            if (i14 < i10 && mutableIntList.get(i12) < mutableIntList.get(i14)) {
                z9 = false;
            }
            if (!z9) {
                PreconditionsKt.throwIllegalStateException("Check failed.");
            }
            i12 = i13;
        }
    }

    public boolean equals(Object obj) {
        return m20381equalsimpl(this.list, obj);
    }

    public int hashCode() {
        return m20383hashCodeimpl(this.list);
    }

    public String toString() {
        return m20388toStringimpl(this.list);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ MutableIntList getList() {
        return this.list;
    }
}
