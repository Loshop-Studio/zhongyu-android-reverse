package androidx.compose.runtime;

import java.util.Iterator;
import p311y7.InterfaceC10668a;

/* loaded from: classes2.dex */
final class DataIterator implements Iterable<Object>, Iterator<Object>, InterfaceC10668a {
    private final int end;
    private int index;
    private final int start;
    private final SlotTable table;

    public DataIterator(SlotTable slotTable, int i10) {
        this.table = slotTable;
        int i11 = slotTable.getGroups()[(i10 * 5) + 4];
        this.start = i11;
        int i12 = i10 + 1;
        this.end = i12 < slotTable.getGroupsSize() ? slotTable.getGroups()[(i12 * 5) + 4] : slotTable.getSlotsSize();
        this.index = i11;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getStart() {
        return this.start;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.index;
        Object obj = (i10 < 0 || i10 >= this.table.getSlots().length) ? null : this.table.getSlots()[this.index];
        this.index++;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i10) {
        this.index = i10;
    }
}
