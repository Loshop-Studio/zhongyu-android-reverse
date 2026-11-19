package androidx.compose.runtime;

import androidx.compose.p013ui.spatial.RectListKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SlotReader {
    public static final int $stable = 8;
    private boolean closed;
    private int currentEnd;
    private int currentGroup;
    private int currentSlot;
    private int currentSlotEnd;
    private final IntStack currentSlotStack;
    private int emptyCount;
    private final int[] groups;
    private final int groupsSize;
    private boolean hadNext;
    private int parent;
    private final Object[] slots;
    private final int slotsSize;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private final SlotTable table;

    public SlotReader(SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        int groupsSize = slotTable.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = slotTable.getSlots();
        this.slotsSize = slotTable.getSlotsSize();
        this.currentEnd = groupsSize;
        this.parent = -1;
        this.currentSlotStack = new IntStack();
    }

    public static /* synthetic */ Anchor anchor$default(SlotReader slotReader, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = slotReader.currentGroup;
        }
        return slotReader.anchor(i10);
    }

    private final Object aux(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 268435456) != 0 ? this.slots[SlotTableKt.auxIndex(iArr, i10)] : Composer.Companion.getEmpty();
    }

    private final Object objectKey(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 536870912) != 0) {
            return this.slots[SlotTableKt.objectKeyIndex(iArr, i10)];
        }
        return null;
    }

    public final Anchor anchor(int i10) {
        ArrayList<Anchor> anchors$runtime_release = this.table.getAnchors$runtime_release();
        int iSearch = SlotTableKt.search(anchors$runtime_release, i10, this.groupsSize);
        if (iSearch >= 0) {
            return anchors$runtime_release.get(iSearch);
        }
        Anchor anchor = new Anchor(i10);
        anchors$runtime_release.add(-(iSearch + 1), anchor);
        return anchor;
    }

    public final void beginEmpty() {
        this.emptyCount++;
    }

    public final void close() {
        this.closed = true;
        this.table.close$runtime_release(this, this.sourceInformationMap);
    }

    public final boolean containsMark(int i10) {
        return (this.groups[(i10 * 5) + 1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0;
    }

    public final void endEmpty() {
        if (!(this.emptyCount > 0)) {
            PreconditionsKt.throwIllegalArgumentException("Unbalanced begin/end empty");
        }
        this.emptyCount--;
    }

    public final void endGroup() {
        if (this.emptyCount == 0) {
            if (!(this.currentGroup == this.currentEnd)) {
                ComposerKt.composeImmediateRuntimeError("endGroup() not called at the end of a group");
            }
            int[] iArr = this.groups;
            int i10 = iArr[(this.parent * 5) + 2];
            this.parent = i10;
            this.currentEnd = i10 < 0 ? this.groupsSize : SlotTableKt.groupSize(iArr, i10) + i10;
            int iPop = this.currentSlotStack.pop();
            if (iPop < 0) {
                this.currentSlot = 0;
                this.currentSlotEnd = 0;
            } else {
                this.currentSlot = iPop;
                this.currentSlotEnd = i10 >= this.groupsSize - 1 ? this.slotsSize : this.groups[((i10 + 1) * 5) + 4];
            }
        }
    }

    public final List<KeyInfo> extractKeys() {
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount <= 0) {
            int i10 = 0;
            int iGroupSize = this.currentGroup;
            while (true) {
                int i11 = i10;
                if (iGroupSize >= this.currentEnd) {
                    break;
                }
                int[] iArr = this.groups;
                int i12 = iGroupSize * 5;
                int i13 = iArr[i12];
                Object objObjectKey = objectKey(iArr, iGroupSize);
                int i14 = 1;
                int i15 = this.groups[i12 + 1];
                if ((1073741824 & i15) == 0) {
                    i14 = i15 & RectListKt.Lower26Bits;
                }
                i10 = i11 + 1;
                arrayList.add(new KeyInfo(i13, objObjectKey, iGroupSize, i14, i11));
                iGroupSize += SlotTableKt.groupSize(this.groups, iGroupSize);
            }
        }
        return arrayList;
    }

    public final Object get(int i10) {
        int i11 = this.currentSlot + i10;
        return i11 < this.currentSlotEnd ? this.slots[i11] : Composer.Companion.getEmpty();
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentEnd() {
        return this.currentEnd;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final Object getGroupAux() {
        int i10 = this.currentGroup;
        if (i10 < this.currentEnd) {
            return aux(this.groups, i10);
        }
        return 0;
    }

    public final int getGroupEnd() {
        return this.currentEnd;
    }

    public final int getGroupKey() {
        int i10 = this.currentGroup;
        if (i10 < this.currentEnd) {
            return this.groups[i10 * 5];
        }
        return 0;
    }

    public final Object getGroupNode() {
        int i10 = this.currentGroup;
        if (i10 < this.currentEnd) {
            return node(this.groups, i10);
        }
        return null;
    }

    public final Object getGroupObjectKey() {
        int i10 = this.currentGroup;
        if (i10 < this.currentEnd) {
            return objectKey(this.groups, i10);
        }
        return null;
    }

    public final int getGroupSize() {
        return SlotTableKt.groupSize(this.groups, this.currentGroup);
    }

    public final int getGroupSlotCount() {
        int i10 = this.currentGroup;
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i10);
        int i11 = i10 + 1;
        return (i11 < this.groupsSize ? this.groups[(i11 * 5) + 4] : this.slotsSize) - iSlotAnchor;
    }

    public final int getGroupSlotIndex() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    public final boolean getHadNext() {
        return this.hadNext;
    }

    public final boolean getHasObjectKey() {
        int i10 = this.currentGroup;
        return i10 < this.currentEnd && (this.groups[(i10 * 5) + 1] & 536870912) != 0;
    }

    public final boolean getInEmpty() {
        return this.emptyCount > 0;
    }

    public final int getNodeCount() {
        return this.groups[(this.currentGroup * 5) + 1] & RectListKt.Lower26Bits;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getParentNodes() {
        int i10 = this.parent;
        if (i10 >= 0) {
            return this.groups[(i10 * 5) + 1] & RectListKt.Lower26Bits;
        }
        return 0;
    }

    public final int getRemainingSlots() {
        return this.currentSlotEnd - this.currentSlot;
    }

    public final int getSize() {
        return this.groupsSize;
    }

    public final int getSlot() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    public final Object groupAux(int i10) {
        return aux(this.groups, i10);
    }

    public final int groupEnd(int i10) {
        return i10 + SlotTableKt.groupSize(this.groups, i10);
    }

    public final Object groupGet(int i10) {
        return groupGet(this.currentGroup, i10);
    }

    public final int groupKey(int i10) {
        return this.groups[i10 * 5];
    }

    public final Object groupObjectKey(int i10) {
        return objectKey(this.groups, i10);
    }

    public final int groupSize(int i10) {
        return SlotTableKt.groupSize(this.groups, i10);
    }

    public final boolean hasMark(int i10) {
        return (this.groups[(i10 * 5) + 1] & 134217728) != 0;
    }

    public final boolean hasObjectKey(int i10) {
        return (this.groups[(i10 * 5) + 1] & 536870912) != 0;
    }

    public final boolean isGroupEnd() {
        return getInEmpty() || this.currentGroup == this.currentEnd;
    }

    public final boolean isNode() {
        return (this.groups[(this.currentGroup * 5) + 1] & BasicMeasure.EXACTLY) != 0;
    }

    public final Object next() {
        int i10;
        if (this.emptyCount > 0 || (i10 = this.currentSlot) >= this.currentSlotEnd) {
            this.hadNext = false;
            return Composer.Companion.getEmpty();
        }
        this.hadNext = true;
        Object[] objArr = this.slots;
        this.currentSlot = i10 + 1;
        return objArr[i10];
    }

    public final Object node(int i10) {
        int[] iArr = this.groups;
        if ((iArr[(i10 * 5) + 1] & BasicMeasure.EXACTLY) != 0) {
            return node(iArr, i10);
        }
        return null;
    }

    public final int nodeCount(int i10) {
        return this.groups[(i10 * 5) + 1] & RectListKt.Lower26Bits;
    }

    public final int parent(int i10) {
        return this.groups[(i10 * 5) + 2];
    }

    public final int parentOf(int i10) {
        if (!(i10 >= 0 && i10 < this.groupsSize)) {
            PreconditionsKt.throwIllegalArgumentException("Invalid group index " + i10);
        }
        return this.groups[(i10 * 5) + 2];
    }

    public final void reposition(int i10) {
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot reposition while in an empty region");
        }
        this.currentGroup = i10;
        int i11 = this.groupsSize;
        int i12 = i10 < i11 ? this.groups[(i10 * 5) + 2] : -1;
        this.parent = i12;
        if (i12 < 0) {
            this.currentEnd = i11;
        } else {
            this.currentEnd = i12 + SlotTableKt.groupSize(this.groups, i12);
        }
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void restoreParent(int i10) {
        int iGroupSize = SlotTableKt.groupSize(this.groups, i10) + i10;
        int i11 = this.currentGroup;
        if (!(i11 >= i10 && i11 <= iGroupSize)) {
            ComposerKt.composeImmediateRuntimeError("Index " + i10 + " is not a parent of " + i11);
        }
        this.parent = i10;
        this.currentEnd = iGroupSize;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final int skipGroup() {
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot skip while in an empty region");
        }
        int[] iArr = this.groups;
        int i10 = this.currentGroup;
        int i11 = (iArr[(i10 * 5) + 1] & BasicMeasure.EXACTLY) == 0 ? iArr[(i10 * 5) + 1] & RectListKt.Lower26Bits : 1;
        this.currentGroup = i10 + SlotTableKt.groupSize(iArr, i10);
        return i11;
    }

    public final void skipToGroupEnd() {
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot skip the enclosing group while in an empty region");
        }
        this.currentGroup = this.currentEnd;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void startGroup() {
        GroupSourceInformation groupSourceInformation;
        if (this.emptyCount <= 0) {
            int i10 = this.parent;
            int i11 = this.currentGroup;
            if (!(this.groups[(i11 * 5) + 2] == i10)) {
                PreconditionsKt.throwIllegalArgumentException("Invalid slot table detected");
            }
            HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
            if (map != null && (groupSourceInformation = map.get(anchor(i10))) != null) {
                groupSourceInformation.reportGroup(this.table, i11);
            }
            IntStack intStack = this.currentSlotStack;
            int i12 = this.currentSlot;
            int i13 = this.currentSlotEnd;
            if (i12 == 0 && i13 == 0) {
                intStack.push(-1);
            } else {
                intStack.push(i12);
            }
            this.parent = i11;
            this.currentEnd = SlotTableKt.groupSize(this.groups, i11) + i11;
            int i14 = i11 + 1;
            this.currentGroup = i14;
            this.currentSlot = SlotTableKt.slotAnchor(this.groups, i11);
            this.currentSlotEnd = i11 >= this.groupsSize - 1 ? this.slotsSize : this.groups[(i14 * 5) + 4];
        }
    }

    public final void startNode() {
        if (this.emptyCount <= 0) {
            if (!((this.groups[(this.currentGroup * 5) + 1] & BasicMeasure.EXACTLY) != 0)) {
                PreconditionsKt.throwIllegalArgumentException("Expected a node group");
            }
            startGroup();
        }
    }

    public String toString() {
        return "SlotReader(current=" + this.currentGroup + ", key=" + getGroupKey() + ", parent=" + this.parent + ", end=" + this.currentEnd + ')';
    }

    public final Object groupGet(int i10, int i11) {
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i10);
        int i12 = i10 + 1;
        int i13 = iSlotAnchor + i11;
        return i13 < (i12 < this.groupsSize ? this.groups[(i12 * 5) + 4] : this.slotsSize) ? this.slots[i13] : Composer.Companion.getEmpty();
    }

    public final int groupKey(Anchor anchor) {
        if (anchor.getValid()) {
            return this.groups[this.table.anchorIndex(anchor) * 5];
        }
        return 0;
    }

    public final boolean isNode(int i10) {
        return (this.groups[(i10 * 5) + 1] & BasicMeasure.EXACTLY) != 0;
    }

    private final Object node(int[] iArr, int i10) {
        int i11 = i10 * 5;
        if ((iArr[i11 + 1] & BasicMeasure.EXACTLY) != 0) {
            return this.slots[iArr[i11 + 4]];
        }
        return Composer.Companion.getEmpty();
    }
}
