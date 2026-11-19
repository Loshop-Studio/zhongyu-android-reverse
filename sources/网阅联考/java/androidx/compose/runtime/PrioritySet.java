package androidx.compose.runtime;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0007R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m5175d2 = {"Landroidx/compose/runtime/PrioritySet;", "", "list", "", "", "(Ljava/util/List;)V", "add", "", "value", "isEmpty", "", "isNotEmpty", "peek", "takeMax", "validateHeap", "runtime_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3443:1\n4492#2,5:3444\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/PrioritySet\n*L\n3392#1:3444,5\n*E\n"})
/* loaded from: classes.dex */
public final class PrioritySet {
    private final List<Integer> list;

    /* JADX WARN: Multi-variable type inference failed */
    public PrioritySet() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void add(int value) {
        if (!this.list.isEmpty()) {
            if (this.list.get(0).intValue() == value) {
                return;
            }
            if (this.list.get(r0.size() - 1).intValue() == value) {
                return;
            }
        }
        int size = this.list.size();
        this.list.add(Integer.valueOf(value));
        while (size > 0) {
            int i4 = ((size + 1) >>> 1) - 1;
            int iIntValue = this.list.get(i4).intValue();
            if (value <= iIntValue) {
                break;
            }
            this.list.set(size, Integer.valueOf(iIntValue));
            size = i4;
        }
        this.list.set(size, Integer.valueOf(value));
    }

    public final boolean isEmpty() {
        return this.list.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !this.list.isEmpty();
    }

    public final int peek() {
        return ((Number) CollectionsKt___CollectionsKt.first((List) this.list)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int takeMax() {
        int iIntValue;
        if (!(this.list.size() > 0)) {
            ComposerKt.composeRuntimeError("Set is empty".toString());
            throw new KotlinNothingValueException();
        }
        int iIntValue2 = this.list.get(0).intValue();
        while ((!this.list.isEmpty()) && this.list.get(0).intValue() == iIntValue2) {
            List<Integer> list = this.list;
            list.set(0, CollectionsKt___CollectionsKt.last((List) list));
            List<Integer> list2 = this.list;
            list2.remove(list2.size() - 1);
            int size = this.list.size();
            int size2 = this.list.size() >>> 1;
            int i4 = 0;
            while (i4 < size2) {
                int iIntValue3 = this.list.get(i4).intValue();
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int iIntValue4 = this.list.get(i6).intValue();
                if (i5 >= size || (iIntValue = this.list.get(i5).intValue()) <= iIntValue4) {
                    if (iIntValue4 > iIntValue3) {
                        this.list.set(i4, Integer.valueOf(iIntValue4));
                        this.list.set(i6, Integer.valueOf(iIntValue3));
                        i4 = i6;
                    }
                } else if (iIntValue > iIntValue3) {
                    this.list.set(i4, Integer.valueOf(iIntValue));
                    this.list.set(i5, Integer.valueOf(iIntValue3));
                    i4 = i5;
                }
            }
        }
        return iIntValue2;
    }

    public final void validateHeap() {
        int size = this.list.size();
        int i4 = size / 2;
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i5 + 1;
            int i7 = i6 * 2;
            boolean z3 = true;
            if (!(this.list.get(i5).intValue() >= this.list.get(i7 + (-1)).intValue())) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (i7 < size && this.list.get(i5).intValue() < this.list.get(i7).intValue()) {
                z3 = false;
            }
            if (!z3) {
                throw new IllegalStateException("Check failed.".toString());
            }
            i5 = i6;
        }
    }

    public PrioritySet(List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
    }

    public /* synthetic */ PrioritySet(List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new ArrayList() : list);
    }
}
