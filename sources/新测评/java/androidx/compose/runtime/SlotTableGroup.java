package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(m13557d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0012\u0010&\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020\rH\u0016J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020+H\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u0016\u0010\u001f\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0010¨\u0006,"}, m13558d2 = {"Landroidx/compose/runtime/SlotTableGroup;", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", "table", "Landroidx/compose/runtime/SlotTable;", "group", "", "version", "(Landroidx/compose/runtime/SlotTable;II)V", "compositionGroups", "getCompositionGroups", "()Ljava/lang/Iterable;", "data", "", "getData", "getGroup", "()I", "groupSize", "getGroupSize", "identity", "getIdentity", "()Ljava/lang/Object;", "isEmpty", "", "()Z", "key", "getKey", "node", "getNode", "slotsSize", "getSlotsSize", "sourceInfo", "", "getSourceInfo", "()Ljava/lang/String;", "getTable", "()Landroidx/compose/runtime/SlotTable;", "getVersion", "find", "identityToFind", "iterator", "", "validateRead", "", "runtime_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,3963:1\n3672#2:3964\n3726#2:3965\n3681#2:3966\n3666#2,4:3967\n3777#2:3978\n3777#2:3979\n158#3,7:3971\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n*L\n3238#1:3964\n3239#1:3965\n3243#1:3966\n3247#1:3967,4\n3278#1:3978\n3280#1:3979\n3258#1:3971,7\n*E\n"})
/* loaded from: classes2.dex */
final class SlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, KMappedMarker {
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
        return (CompositionGroup) CollectionsKt.firstOrNull(CollectionsKt.drop(compositionGroup.getCompositionGroups(), i10));
    }

    private final void validateRead() {
        if (this.table.getVersion() != this.version) {
            SlotTableKt.throwConcurrentModificationException();
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object identityToFind) {
        if (identityToFind instanceof Anchor) {
            return find$findAnchoredGroup(this, (Anchor) identityToFind);
        }
        if (identityToFind instanceof SourceInformationSlotTableGroupIdentity) {
            SourceInformationSlotTableGroupIdentity sourceInformationSlotTableGroupIdentity = (SourceInformationSlotTableGroupIdentity) identityToFind;
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
        Intrinsics.checkNotNull(obj);
        return obj;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getNode() {
        if ((this.table.getGroups()[(this.group * 5) + 1] & 1073741824) != 0) {
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

    public /* synthetic */ SlotTableGroup(SlotTable slotTable, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(slotTable, i10, (i12 & 4) != 0 ? slotTable.getVersion() : i11);
    }
}
