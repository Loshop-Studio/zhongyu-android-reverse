package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.Iterator;
import p311y7.InterfaceC10668a;

/* loaded from: classes2.dex */
final class GroupIterator implements Iterator<CompositionGroup>, InterfaceC10668a {
    private final int end;
    private int index;
    private final SlotTable table;
    private final int version;

    public GroupIterator(SlotTable slotTable, int i10, int i11) {
        this.table = slotTable;
        this.end = i11;
        this.index = i10;
        this.version = slotTable.getVersion$runtime_release();
        if (slotTable.getWriter$runtime_release()) {
            SlotTableKt.throwConcurrentModificationException();
        }
    }

    private final void validateRead() {
        if (this.table.getVersion$runtime_release() != this.version) {
            SlotTableKt.throwConcurrentModificationException();
        }
    }

    public final int getEnd() {
        return this.end;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public CompositionGroup next() {
        validateRead();
        int i10 = this.index;
        this.index = SlotTableKt.groupSize(this.table.getGroups(), i10) + i10;
        return new SlotTableGroup(this.table, i10, this.version);
    }
}
