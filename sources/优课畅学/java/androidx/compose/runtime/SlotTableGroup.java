package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;
import p311y7.InterfaceC10668a;

/* loaded from: classes2.dex */
final class SlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, InterfaceC10668a {
    private final int group;
    private final SlotTable table;
    private final int version;

    public SlotTableGroup(SlotTable slotTable, int i10, int i11) {
        this.table = slotTable;
        this.group = i10;
        this.version = i11;
    }

    private static final CompositionGroup find$findAnchoredGroup(SlotTableGroup slotTableGroup, Anchor anchor) {
        int iAnchorIndex;
        int i10;
        if (!slotTableGroup.table.ownsAnchor(anchor) || (iAnchorIndex = slotTableGroup.table.anchorIndex(anchor)) < (i10 = slotTableGroup.group) || iAnchorIndex - i10 >= SlotTableKt.groupSize(slotTableGroup.table.getGroups(), slotTableGroup.group)) {
            return null;
        }
        return new SlotTableGroup(slotTableGroup.table, iAnchorIndex, slotTableGroup.version);
    }

    private static final CompositionGroup find$findRelativeGroup(CompositionGroup compositionGroup, int i10) {
        return (CompositionGroup) AbstractC8778f0.m14568n0(AbstractC8778f0.m14560f0(compositionGroup.getCompositionGroups(), i10));
    }

    private final void validateRead() {
        if (this.table.getVersion$runtime_release() != this.version) {
            SlotTableKt.throwConcurrentModificationException();
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object obj) {
        if (obj instanceof Anchor) {
            return find$findAnchoredGroup(this, (Anchor) obj);
        }
        if (obj instanceof SourceInformationSlotTableGroupIdentity) {
            SourceInformationSlotTableGroupIdentity sourceInformationSlotTableGroupIdentity = (SourceInformationSlotTableGroupIdentity) obj;
            CompositionGroup compositionGroupFind = find(sourceInformationSlotTableGroupIdentity.getParentIdentity());
            if (compositionGroupFind != null) {
                return find$findRelativeGroup(compositionGroupFind, sourceInformationSlotTableGroupIdentity.getIndex());
            }
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Iterable<Object> getData() {
        GroupSourceInformation groupSourceInformationSourceInformationOf = this.table.sourceInformationOf(this.group);
        return groupSourceInformationSourceInformationOf != null ? new SourceInformationGroupDataIterator(this.table, this.group, groupSourceInformationSourceInformationOf) : new DataIterator(this.table, this.group);
    }

    public final int getGroup() {
        return this.group;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getGroupSize() {
        return SlotTableKt.groupSize(this.table.getGroups(), this.group);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getIdentity() {
        validateRead();
        SlotReader slotReaderOpenReader = this.table.openReader();
        try {
            return slotReaderOpenReader.anchor(this.group);
        } finally {
            slotReaderOpenReader.close();
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getKey() {
        if ((this.table.getGroups()[(this.group * 5) + 1] & 536870912) == 0) {
            return Integer.valueOf(this.table.getGroups()[this.group * 5]);
        }
        Object obj = this.table.getSlots()[SlotTableKt.objectKeyIndex(this.table.getGroups(), this.group)];
        AbstractC9133u.m16130d(obj);
        return obj;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getNode() {
        if ((this.table.getGroups()[(this.group * 5) + 1] & BasicMeasure.EXACTLY) != 0) {
            return this.table.getSlots()[this.table.getGroups()[(this.group * 5) + 4]];
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getSlotsSize() {
        int groupSize = this.group + getGroupSize();
        return (groupSize < this.table.getGroupsSize() ? this.table.getGroups()[(groupSize * 5) + 4] : this.table.getSlotsSize()) - this.table.getGroups()[(this.group * 5) + 4];
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public String getSourceInfo() {
        int[] groups = this.table.getGroups();
        int i10 = this.group;
        if ((groups[(i10 * 5) + 1] & 268435456) != 0) {
            Object obj = this.table.getSlots()[SlotTableKt.auxIndex(this.table.getGroups(), this.group)];
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }
        GroupSourceInformation groupSourceInformationSourceInformationOf = this.table.sourceInformationOf(i10);
        if (groupSourceInformationSourceInformationOf != null) {
            return groupSourceInformationSourceInformationOf.getSourceInformation();
        }
        return null;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    public final int getVersion() {
        return this.version;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return SlotTableKt.groupSize(this.table.getGroups(), this.group) == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        validateRead();
        GroupSourceInformation groupSourceInformationSourceInformationOf = this.table.sourceInformationOf(this.group);
        if (groupSourceInformationSourceInformationOf != null) {
            SlotTable slotTable = this.table;
            int i10 = this.group;
            return new SourceInformationGroupIterator(slotTable, i10, groupSourceInformationSourceInformationOf, new AnchoredGroupPath(i10));
        }
        SlotTable slotTable2 = this.table;
        int i11 = this.group;
        return new GroupIterator(slotTable2, i11 + 1, i11 + SlotTableKt.groupSize(slotTable2.getGroups(), this.group));
    }

    public /* synthetic */ SlotTableGroup(SlotTable slotTable, int i10, int i11, int i12, AbstractC9126n abstractC9126n) {
        this(slotTable, i10, (i12 & 4) != 0 ? slotTable.getVersion$runtime_release() : i11);
    }
}
