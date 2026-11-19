package androidx.compose.foundation.layout;

import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.runtime.internal.StabilityInferred;
import id.InterfaceC9624a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p181hd.InterfaceC9544p;
import p325rc.AbstractC10947g0;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ContextualFlowItemIterator implements Iterator<Measurable>, InterfaceC9624a {
    public static final int $stable = 8;
    private final List<Measurable> _list = new ArrayList();
    private final InterfaceC9544p getMeasurables;
    private final int itemCount;
    private int itemIndex;
    private int listIndex;

    public ContextualFlowItemIterator(int i10, InterfaceC9544p interfaceC9544p) {
        this.itemCount = i10;
        this.getMeasurables = interfaceC9544p;
    }

    public static /* synthetic */ Measurable getNext$foundation_layout_release$default(ContextualFlowItemIterator contextualFlowItemIterator, FlowLineInfo flowLineInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            flowLineInfo = new FlowLineInfo(0, 0, 0.0f, 0.0f, 15, null);
        }
        return contextualFlowItemIterator.getNext$foundation_layout_release(flowLineInfo);
    }

    public final List<Measurable> getList() {
        return this._list;
    }

    public final Measurable getNext$foundation_layout_release(FlowLineInfo flowLineInfo) {
        if (this.listIndex < getList().size()) {
            Measurable measurable = getList().get(this.listIndex);
            this.listIndex++;
            return measurable;
        }
        int i10 = this.itemIndex;
        if (i10 >= this.itemCount) {
            throw new IndexOutOfBoundsException("No item returned at index call. Index: " + this.itemIndex);
        }
        List list = (List) this.getMeasurables.invoke(Integer.valueOf(i10), flowLineInfo);
        this.itemIndex++;
        if (list.isEmpty()) {
            return next();
        }
        Measurable measurable2 = (Measurable) AbstractC10947g0.m23944m0(list);
        this._list.addAll(list);
        this.listIndex++;
        return measurable2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.listIndex < getList().size() || this.itemIndex < this.itemCount;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public Measurable next() {
        return getNext$foundation_layout_release$default(this, null, 1, null);
    }
}
