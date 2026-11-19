package androidx.compose.runtime;

import id.InterfaceC9624a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class SourceInformationGroupDataIterator implements Iterable<Object>, Iterator<Object>, InterfaceC9624a {
    private final int base;
    private final int end;
    private final BitVector filter;
    private int index;
    private final int start;
    private final SlotTable table;

    public SourceInformationGroupDataIterator(SlotTable slotTable, int i10, GroupSourceInformation groupSourceInformation) {
        this.table = slotTable;
        int i11 = slotTable.getGroups()[(i10 * 5) + 4];
        this.base = i11;
        this.start = groupSourceInformation.getDataStartOffset();
        int dataEndOffset = groupSourceInformation.getDataEndOffset();
        if (dataEndOffset <= 0) {
            int i12 = i10 + 1;
            dataEndOffset = (i12 < slotTable.getGroupsSize() ? slotTable.getGroups()[(i12 * 5) + 4] : slotTable.getSlotsSize()) - i11;
        }
        this.end = dataEndOffset;
        BitVector bitVector = new BitVector();
        ArrayList<Object> groups = groupSourceInformation.getGroups();
        if (groups != null) {
            int size = groups.size();
            for (int i13 = 0; i13 < size; i13++) {
                Object obj = groups.get(i13);
                if (obj instanceof GroupSourceInformation) {
                    GroupSourceInformation groupSourceInformation2 = (GroupSourceInformation) obj;
                    bitVector.setRange(groupSourceInformation2.getDataStartOffset(), groupSourceInformation2.getDataEndOffset());
                }
            }
        }
        this.filter = bitVector;
        this.index = bitVector.nextClear(this.start);
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
        int i10 = this.end;
        int i11 = this.index;
        Object obj = (i11 < 0 || i11 >= i10) ? null : this.table.getSlots()[this.base + this.index];
        this.index = this.filter.nextClear(this.index + 1);
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
