package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import androidx.compose.p013ui.spatial.RectListKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8797p;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10574p;
import p311y7.InterfaceC10668a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SlotWriter {
    private ArrayList<Anchor> anchors;
    private MutableIntObjectMap<MutableIntSet> calledByMap;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;
    private MutableIntObjectMap<MutableObjectList<Object>> deferredSlotWrites;
    private int groupGapLen;
    private int groupGapStart;
    private int[] groups;
    private int insertCount;
    private int nodeCount;
    private MutableIntList pendingRecalculateMarks;
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private final SlotTable table;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final IntStack startStack = new IntStack();
    private final IntStack endStack = new IntStack();
    private final IntStack nodeCountStack = new IntStack();
    private int parent = -1;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Anchor> moveGroup(SlotWriter slotWriter, int i10, SlotWriter slotWriter2, boolean z10, boolean z11, boolean z12) {
            boolean zRemoveGroups;
            List<Anchor> listM14771n;
            int iGroupSize = slotWriter.groupSize(i10);
            int i11 = i10 + iGroupSize;
            int iDataIndex = slotWriter.dataIndex(i10);
            int iDataIndex2 = slotWriter.dataIndex(i11);
            int i12 = iDataIndex2 - iDataIndex;
            boolean zContainsAnyGroupMarks = slotWriter.containsAnyGroupMarks(i10);
            slotWriter2.insertGroups(iGroupSize);
            slotWriter2.insertSlots(i12, slotWriter2.getCurrentGroup());
            if (slotWriter.groupGapStart < i11) {
                slotWriter.moveGroupGapTo(i11);
            }
            if (slotWriter.slotsGapStart < iDataIndex2) {
                slotWriter.moveSlotGapTo(iDataIndex2, i11);
            }
            int[] iArr = slotWriter2.groups;
            int currentGroup = slotWriter2.getCurrentGroup();
            int i13 = currentGroup * 5;
            AbstractC8797p.m14647n(slotWriter.groups, iArr, i13, i10 * 5, i11 * 5);
            Object[] objArr = slotWriter2.slots;
            int i14 = slotWriter2.currentSlot;
            System.arraycopy(slotWriter.slots, iDataIndex, objArr, i14, i12);
            int parent = slotWriter2.getParent();
            iArr[i13 + 2] = parent;
            int i15 = currentGroup - i10;
            int i16 = currentGroup + iGroupSize;
            int iDataIndex3 = i14 - slotWriter2.dataIndex(iArr, currentGroup);
            int i17 = slotWriter2.slotsGapOwner;
            int i18 = slotWriter2.slotsGapLen;
            int length = objArr.length;
            int i19 = i17;
            int i20 = currentGroup;
            while (true) {
                zRemoveGroups = false;
                if (i20 >= i16) {
                    break;
                }
                if (i20 != currentGroup) {
                    int i21 = (i20 * 5) + 2;
                    iArr[i21] = iArr[i21] + i15;
                }
                int[] iArr2 = iArr;
                int i22 = currentGroup;
                iArr2[(i20 * 5) + 4] = slotWriter2.dataIndexToDataAnchor(slotWriter2.dataIndex(iArr, i20) + iDataIndex3, i19 >= i20 ? slotWriter2.slotsGapStart : 0, i18, length);
                if (i20 == i19) {
                    i19++;
                }
                i20++;
                currentGroup = i22;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            slotWriter2.slotsGapOwner = i19;
            int iLocationOf = SlotTableKt.locationOf(slotWriter.anchors, i10, slotWriter.getSize$runtime_release());
            int iLocationOf2 = SlotTableKt.locationOf(slotWriter.anchors, i11, slotWriter.getSize$runtime_release());
            if (iLocationOf < iLocationOf2) {
                ArrayList arrayList = slotWriter.anchors;
                ArrayList arrayList2 = new ArrayList(iLocationOf2 - iLocationOf);
                for (int i23 = iLocationOf; i23 < iLocationOf2; i23++) {
                    Anchor anchor = (Anchor) arrayList.get(i23);
                    anchor.setLocation$runtime_release(anchor.getLocation$runtime_release() + i15);
                    arrayList2.add(anchor);
                }
                slotWriter2.anchors.addAll(SlotTableKt.locationOf(slotWriter2.anchors, slotWriter2.getCurrentGroup(), slotWriter2.getSize$runtime_release()), arrayList2);
                arrayList.subList(iLocationOf, iLocationOf2).clear();
                listM14771n = arrayList2;
            } else {
                listM14771n = AbstractC8809v.m14771n();
            }
            if (!listM14771n.isEmpty()) {
                HashMap map = slotWriter.sourceInformationMap;
                HashMap map2 = slotWriter2.sourceInformationMap;
                if (map != null && map2 != null) {
                    int size = listM14771n.size();
                    for (int i24 = 0; i24 < size; i24++) {
                        Anchor anchor2 = listM14771n.get(i24);
                        GroupSourceInformation groupSourceInformation = (GroupSourceInformation) map.get(anchor2);
                        if (groupSourceInformation != null) {
                            map.remove(anchor2);
                            map2.put(anchor2, groupSourceInformation);
                        }
                    }
                }
            }
            int parent2 = slotWriter2.getParent();
            GroupSourceInformation groupSourceInformationSourceInformationOf = slotWriter2.sourceInformationOf(parent);
            if (groupSourceInformationSourceInformationOf != null) {
                int iGroupSize2 = parent2 + 1;
                int currentGroup2 = slotWriter2.getCurrentGroup();
                int i25 = -1;
                while (iGroupSize2 < currentGroup2) {
                    i25 = iGroupSize2;
                    iGroupSize2 = SlotTableKt.groupSize(slotWriter2.groups, iGroupSize2) + iGroupSize2;
                }
                groupSourceInformationSourceInformationOf.addGroupAfter(slotWriter2, i25, currentGroup2);
            }
            int iParent = slotWriter.parent(i10);
            if (z12) {
                if (z10) {
                    boolean z13 = iParent >= 0;
                    if (z13) {
                        slotWriter.startGroup();
                        slotWriter.advanceBy(iParent - slotWriter.getCurrentGroup());
                        slotWriter.startGroup();
                    }
                    slotWriter.advanceBy(i10 - slotWriter.getCurrentGroup());
                    boolean zRemoveGroup = slotWriter.removeGroup();
                    if (z13) {
                        slotWriter.skipToGroupEnd();
                        slotWriter.endGroup();
                        slotWriter.skipToGroupEnd();
                        slotWriter.endGroup();
                    }
                    zRemoveGroups = zRemoveGroup;
                } else {
                    zRemoveGroups = slotWriter.removeGroups(i10, iGroupSize);
                    slotWriter.removeSlots(iDataIndex, i12, i10 - 1);
                }
            }
            if (zRemoveGroups) {
                ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
            }
            int i26 = slotWriter2.nodeCount;
            int i27 = iArr3[i13 + 1];
            slotWriter2.nodeCount = i26 + ((1073741824 & i27) == 0 ? i27 & RectListKt.Lower26Bits : 1);
            if (z11) {
                slotWriter2.currentGroup = i16;
                slotWriter2.currentSlot = i14 + i12;
            }
            if (zContainsAnyGroupMarks) {
                slotWriter2.updateContainsMark(parent);
            }
            return listM14771n;
        }

        public static /* synthetic */ List moveGroup$default(Companion companion, SlotWriter slotWriter, int i10, SlotWriter slotWriter2, boolean z10, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 32) != 0) {
                z12 = true;
            }
            return companion.moveGroup(slotWriter, i10, slotWriter2, z10, z11, z12);
        }

        private Companion() {
        }
    }

    /* renamed from: androidx.compose.runtime.SlotWriter$groupSlots$1 */
    public static final class C25431 implements Iterator<Object>, InterfaceC10668a {
        final /* synthetic */ int $end;
        private int current;
        final /* synthetic */ SlotWriter this$0;

        public C25431(int i10, int i11, SlotWriter slotWriter) {
            this.$end = i11;
            this.this$0 = slotWriter;
            this.current = i10;
        }

        public final int getCurrent() {
            return this.current;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.current < this.$end;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                return null;
            }
            Object[] objArr = this.this$0.slots;
            SlotWriter slotWriter = this.this$0;
            int i10 = this.current;
            this.current = i10 + 1;
            return objArr[slotWriter.dataIndexToDataAddress(i10)];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setCurrent(int i10) {
            this.current = i10;
        }
    }

    public SlotWriter(SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        this.slots = slotTable.getSlots();
        this.anchors = slotTable.getAnchors$runtime_release();
        this.sourceInformationMap = slotTable.getSourceInformationMap$runtime_release();
        this.calledByMap = slotTable.getCalledByMap$runtime_release();
        this.groupGapStart = slotTable.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - slotTable.getGroupsSize();
        this.slotsGapStart = slotTable.getSlotsSize();
        this.slotsGapLen = this.slots.length - slotTable.getSlotsSize();
        this.slotsGapOwner = slotTable.getGroupsSize();
        this.currentGroupEnd = slotTable.getGroupsSize();
    }

    public static /* synthetic */ Anchor anchor$default(SlotWriter slotWriter, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i10);
    }

    private final int auxIndex(int[] iArr, int i10) {
        return dataIndex(iArr, i10) + Integer.bitCount(iArr[(i10 * 5) + 1] >> 29);
    }

    private final boolean childContainsAnyMarks(int i10) {
        int iGroupSize = i10 + 1;
        int iGroupSize2 = i10 + groupSize(i10);
        while (iGroupSize < iGroupSize2) {
            if ((this.groups[(groupIndexToAddress(iGroupSize) * 5) + 1] & 201326592) != 0) {
                return true;
            }
            iGroupSize += groupSize(iGroupSize);
        }
        return false;
    }

    private final void clearSlotGap() {
        int i10 = this.slotsGapStart;
        AbstractC8797p.m14613C(this.slots, null, i10, this.slotsGapLen + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean containsAnyGroupMarks(int i10) {
        return i10 >= 0 && (this.groups[(groupIndexToAddress(i10) * 5) + 1] & 201326592) != 0;
    }

    private final boolean containsGroupMark(int i10) {
        return i10 >= 0 && (this.groups[(groupIndexToAddress(i10) * 5) + 1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0;
    }

    private final int dataAnchorToDataIndex(int i10, int i11, int i12) {
        return i10 < 0 ? (i12 - i11) + i10 + 1 : i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int i10) {
        return dataIndex(this.groups, groupIndexToAddress(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAddress(int i10) {
        return i10 + (this.slotsGapLen * (i10 < this.slotsGapStart ? 0 : 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAnchor(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    private final List<Integer> dataIndexes(int[] iArr) {
        List listDataAnchors$default = SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
        List listM14529F0 = AbstractC8778f0.m14529F0(AbstractC8778f0.m14534K0(listDataAnchors$default, AbstractC8323h.m13525t(0, this.groupGapStart)), AbstractC8778f0.m14534K0(listDataAnchors$default, AbstractC8323h.m13525t(this.groupGapStart + this.groupGapLen, iArr.length / 5)));
        ArrayList arrayList = new ArrayList(listM14529F0.size());
        int size = listM14529F0.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(Integer.valueOf(dataAnchorToDataIndex(((Number) listM14529F0.get(i10)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    private final void fixParentAnchorsFor(int i10, int i11, int i12) {
        int iParentIndexToAnchor = parentIndexToAnchor(i10, this.groupGapStart);
        while (i12 < i11) {
            this.groups[(groupIndexToAddress(i12) * 5) + 2] = iParentIndexToAnchor;
            int iGroupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i12)) + i12;
            fixParentAnchorsFor(i12, iGroupSize, i12 + 1);
            i12 = iGroupSize;
        }
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    private final int getCurrentGroupSlotIndex() {
        MutableObjectList<Object> mutableObjectList;
        int iSlotsStartIndex$runtime_release = this.currentSlot - slotsStartIndex$runtime_release(this.parent);
        MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
        return iSlotsStartIndex$runtime_release + ((mutableIntObjectMap == null || (mutableObjectList = mutableIntObjectMap.get(this.parent)) == null) ? 0 : mutableObjectList.getSize());
    }

    private final void groupAsString(StringBuilder sb, int i10) {
        int iGroupIndexToAddress = groupIndexToAddress(i10);
        sb.append("Group(");
        if (i10 < 10) {
            sb.append(' ');
        }
        if (i10 < 100) {
            sb.append(' ');
        }
        if (i10 < 1000) {
            sb.append(' ');
        }
        sb.append(i10);
        if (iGroupIndexToAddress != i10) {
            sb.append("(");
            sb.append(iGroupIndexToAddress);
            sb.append(")");
        }
        sb.append('#');
        sb.append(SlotTableKt.groupSize(this.groups, iGroupIndexToAddress));
        sb.append('^');
        int i11 = iGroupIndexToAddress * 5;
        int i12 = i11 + 2;
        sb.append(parentAnchorToIndex(this.groups[i12]));
        sb.append(": key=");
        sb.append(this.groups[i11]);
        sb.append(", nodes=");
        int i13 = i11 + 1;
        sb.append(this.groups[i13] & RectListKt.Lower26Bits);
        sb.append(", dataAnchor=");
        sb.append(this.groups[i11 + 4]);
        sb.append(", parentAnchor=");
        sb.append(this.groups[i12]);
        if ((this.groups[i13] & BasicMeasure.EXACTLY) != 0) {
            sb.append(", node=" + SlotTableKt.summarize(String.valueOf(this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))]), 10));
        }
        int iSlotIndex = slotIndex(this.groups, iGroupIndexToAddress);
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i10 + 1));
        if (iDataIndex > iSlotIndex) {
            sb.append(", [");
            for (int i14 = iSlotIndex; i14 < iDataIndex; i14++) {
                if (i14 != iSlotIndex) {
                    sb.append(", ");
                }
                sb.append(SlotTableKt.summarize(String.valueOf(this.slots[dataIndexToDataAddress(i14)]), 10));
            }
            sb.append(']');
        }
        sb.append(")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int groupIndexToAddress(int i10) {
        return i10 + (this.groupGapLen * (i10 < this.groupGapStart ? 0 : 1));
    }

    private final GroupSourceInformation groupSourceInformationFor(int i10, String str) {
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map == null) {
            return null;
        }
        Anchor anchor = anchor(i10);
        GroupSourceInformation groupSourceInformation = map.get(anchor);
        if (groupSourceInformation == null) {
            groupSourceInformation = new GroupSourceInformation(0, str, 0);
            if (str == null) {
                int iGroupSize = i10 + 1;
                int i11 = this.currentGroup;
                while (iGroupSize < i11) {
                    groupSourceInformation.reportGroup(this, iGroupSize);
                    iGroupSize += SlotTableKt.groupSize(this.groups, iGroupSize);
                }
            }
            map.put(anchor, groupSourceInformation);
        }
        return groupSourceInformation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertGroups(int i10) {
        if (i10 > 0) {
            int i11 = this.currentGroup;
            moveGroupGapTo(i11);
            int i12 = this.groupGapStart;
            int i13 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < i10) {
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[iMax * 5];
                int i15 = iMax - i14;
                AbstractC8797p.m14647n(iArr, iArr2, 0, 0, i12 * 5);
                AbstractC8797p.m14647n(iArr, iArr2, (i12 + i15) * 5, (i13 + i12) * 5, length * 5);
                this.groups = iArr2;
                i13 = i15;
            }
            int i16 = this.currentGroupEnd;
            if (i16 >= i12) {
                this.currentGroupEnd = i16 + i10;
            }
            int i17 = i12 + i10;
            this.groupGapStart = i17;
            this.groupGapLen = i13 - i10;
            int iDataIndexToDataAnchor = dataIndexToDataAnchor(i14 > 0 ? dataIndex(i11 + i10) : 0, this.slotsGapOwner >= i12 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i18 = i12; i18 < i17; i18++) {
                this.groups[(i18 * 5) + 4] = iDataIndexToDataAnchor;
            }
            int i19 = this.slotsGapOwner;
            if (i19 >= i12) {
                this.slotsGapOwner = i19 + i10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertSlots(int i10, int i11) {
        if (i10 > 0) {
            moveSlotGapTo(this.currentSlot, i11);
            int i12 = this.slotsGapStart;
            int i13 = this.slotsGapLen;
            if (i13 < i10) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i14 = length - i13;
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = iMax - i14;
                int i17 = i13 + i12;
                System.arraycopy(objArr, 0, objArr2, 0, i12);
                System.arraycopy(objArr, i17, objArr2, i12 + i16, length - i17);
                this.slots = objArr2;
                i13 = i16;
            }
            int i18 = this.currentSlotEnd;
            if (i18 >= i12) {
                this.currentSlotEnd = i18 + i10;
            }
            this.slotsGapStart = i12 + i10;
            this.slotsGapLen = i13 - i10;
        }
    }

    private final List<Integer> keys() {
        List listKeys$default = SlotTableKt.keys$default(this.groups, 0, 1, null);
        ArrayList arrayList = new ArrayList(listKeys$default.size());
        int size = listKeys$default.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = listKeys$default.get(i10);
            ((Number) obj).intValue();
            int i11 = this.groupGapStart;
            if (i10 < i11 || i10 >= i11 + this.groupGapLen) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = slotWriter.parent;
        }
        slotWriter.markGroup(i10);
    }

    private final void moveAnchors(int i10, int i11, int i12) {
        Anchor anchor;
        int iAnchorIndex;
        int i13 = i12 + i10;
        int size$runtime_release = getSize$runtime_release();
        int iLocationOf = SlotTableKt.locationOf(this.anchors, i10, size$runtime_release);
        ArrayList arrayList = new ArrayList();
        if (iLocationOf >= 0) {
            while (iLocationOf < this.anchors.size() && (iAnchorIndex = anchorIndex((anchor = this.anchors.get(iLocationOf)))) >= i10 && iAnchorIndex < i13) {
                arrayList.add(anchor);
                this.anchors.remove(iLocationOf);
            }
        }
        int i14 = i11 - i10;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            Anchor anchor2 = (Anchor) arrayList.get(i15);
            int iAnchorIndex2 = anchorIndex(anchor2) + i14;
            if (iAnchorIndex2 >= this.groupGapStart) {
                anchor2.setLocation$runtime_release(-(size$runtime_release - iAnchorIndex2));
            } else {
                anchor2.setLocation$runtime_release(iAnchorIndex2);
            }
            this.anchors.add(SlotTableKt.locationOf(this.anchors, iAnchorIndex2, size$runtime_release), anchor2);
        }
    }

    public static /* synthetic */ List moveFrom$default(SlotWriter slotWriter, SlotTable slotTable, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        return slotWriter.moveFrom(slotTable, i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveGroupGapTo(int i10) {
        int i11 = this.groupGapLen;
        int i12 = this.groupGapStart;
        if (i12 != i10) {
            if (!this.anchors.isEmpty()) {
                updateAnchors(i12, i10);
            }
            if (i11 > 0) {
                int[] iArr = this.groups;
                int i13 = i10 * 5;
                int i14 = i11 * 5;
                int i15 = i12 * 5;
                if (i10 < i12) {
                    AbstractC8797p.m14647n(iArr, iArr, i14 + i13, i13, i15);
                } else {
                    AbstractC8797p.m14647n(iArr, iArr, i15, i15 + i14, i13 + i14);
                }
            }
            if (i10 < i12) {
                i12 = i10 + i11;
            }
            int capacity = getCapacity();
            if (!(i12 < capacity)) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            while (i12 < capacity) {
                int i16 = (i12 * 5) + 2;
                int i17 = this.groups[i16];
                int iParentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(i17), i10);
                if (iParentIndexToAnchor != i17) {
                    this.groups[i16] = iParentIndexToAnchor;
                }
                i12++;
                if (i12 == i10) {
                    i12 += i11;
                }
            }
        }
        this.groupGapStart = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveSlotGapTo(int i10, int i11) {
        int i12 = this.slotsGapLen;
        int i13 = this.slotsGapStart;
        int i14 = this.slotsGapOwner;
        if (i13 != i10) {
            Object[] objArr = this.slots;
            if (i10 < i13) {
                System.arraycopy(objArr, i10, objArr, i10 + i12, i13 - i10);
            } else {
                int i15 = i13 + i12;
                System.arraycopy(objArr, i15, objArr, i13, (i10 + i12) - i15);
            }
        }
        int iMin = Math.min(i11 + 1, getSize$runtime_release());
        if (i14 != iMin) {
            int length = this.slots.length - i12;
            if (iMin < i14) {
                int iGroupIndexToAddress = groupIndexToAddress(iMin);
                int iGroupIndexToAddress2 = groupIndexToAddress(i14);
                int i16 = this.groupGapStart;
                while (iGroupIndexToAddress < iGroupIndexToAddress2) {
                    int i17 = (iGroupIndexToAddress * 5) + 4;
                    int i18 = this.groups[i17];
                    if (!(i18 >= 0)) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a positive anchor");
                    }
                    this.groups[i17] = -((length - i18) + 1);
                    iGroupIndexToAddress++;
                    if (iGroupIndexToAddress == i16) {
                        iGroupIndexToAddress += this.groupGapLen;
                    }
                }
            } else {
                int iGroupIndexToAddress3 = groupIndexToAddress(i14);
                int iGroupIndexToAddress4 = groupIndexToAddress(iMin);
                while (iGroupIndexToAddress3 < iGroupIndexToAddress4) {
                    int i19 = (iGroupIndexToAddress3 * 5) + 4;
                    int i20 = this.groups[i19];
                    if (!(i20 < 0)) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a negative anchor");
                    }
                    this.groups[i19] = i20 + length + 1;
                    iGroupIndexToAddress3++;
                    if (iGroupIndexToAddress3 == this.groupGapStart) {
                        iGroupIndexToAddress3 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = iMin;
        }
        this.slotsGapStart = i10;
    }

    private final int nodeIndex(int[] iArr, int i10) {
        return dataIndex(iArr, i10);
    }

    private final int parentAnchorToIndex(int i10) {
        return i10 > -2 ? i10 : (getSize$runtime_release() + i10) - (-2);
    }

    private final int parentIndexToAnchor(int i10, int i11) {
        return i10 < i11 ? i10 : -((getSize$runtime_release() - i10) + 2);
    }

    private final Object rawUpdate(Object obj) {
        Object objSkip = skip();
        set(obj);
        return objSkip;
    }

    private final void recalculateMarks() {
        MutableIntList mutableIntList = this.pendingRecalculateMarks;
        if (mutableIntList != null) {
            while (PrioritySet.m23664isNotEmptyimpl(mutableIntList)) {
                m23682updateContainsMarkNowXpTMRCE(PrioritySet.m23666takeMaximpl(mutableIntList), mutableIntList);
            }
        }
    }

    private final boolean removeAnchors(int i10, int i11, HashMap<Anchor, GroupSourceInformation> map) {
        int i12 = i11 + i10;
        int iLocationOf = SlotTableKt.locationOf(this.anchors, i12, getCapacity() - this.groupGapLen);
        if (iLocationOf >= this.anchors.size()) {
            iLocationOf--;
        }
        int i13 = iLocationOf + 1;
        int i14 = 0;
        while (iLocationOf >= 0) {
            Anchor anchor = this.anchors.get(iLocationOf);
            int iAnchorIndex = anchorIndex(anchor);
            if (iAnchorIndex < i10) {
                break;
            }
            if (iAnchorIndex < i12) {
                anchor.setLocation$runtime_release(Integer.MIN_VALUE);
                if (map != null) {
                    map.remove(anchor);
                }
                if (i14 == 0) {
                    i14 = iLocationOf + 1;
                }
                i13 = iLocationOf;
            }
            iLocationOf--;
        }
        boolean z10 = i13 < i14;
        if (z10) {
            this.anchors.subList(i13, i14).clear();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeGroups(int i10, int i11) {
        if (i11 > 0) {
            ArrayList<Anchor> arrayList = this.anchors;
            moveGroupGapTo(i10);
            zRemoveAnchors = arrayList.isEmpty() ? false : removeAnchors(i10, i11, this.sourceInformationMap);
            this.groupGapStart = i10;
            this.groupGapLen += i11;
            int i12 = this.slotsGapOwner;
            if (i12 > i10) {
                this.slotsGapOwner = Math.max(i10, i12 - i11);
            }
            int i13 = this.currentGroupEnd;
            if (i13 >= this.groupGapStart) {
                this.currentGroupEnd = i13 - i11;
            }
            int i14 = this.parent;
            if (containsGroupMark(i14)) {
                updateContainsMark(i14);
            }
        }
        return zRemoveAnchors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSlots(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.slotsGapLen;
            int i14 = i10 + i11;
            moveSlotGapTo(i14, i12);
            this.slotsGapStart = i10;
            this.slotsGapLen = i13 + i11;
            AbstractC8797p.m14613C(this.slots, null, i10, i14);
            int i15 = this.currentSlotEnd;
            if (i15 >= i10) {
                this.currentSlotEnd = i15 - i11;
            }
        }
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int slotIndex(int[] iArr, int i10) {
        return i10 >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(SlotTableKt.slotAnchor(iArr, i10), this.slotsGapLen, this.slots.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GroupSourceInformation sourceInformationOf(int i10) {
        Anchor anchorTryAnchor$runtime_release;
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map == null || (anchorTryAnchor$runtime_release = tryAnchor$runtime_release(i10)) == null) {
            return null;
        }
        return map.get(anchorTryAnchor$runtime_release);
    }

    private final void updateAnchors(int i10, int i11) {
        Anchor anchor;
        int location$runtime_release;
        Anchor anchor2;
        int location$runtime_release2;
        int i12;
        int capacity = getCapacity() - this.groupGapLen;
        if (i10 >= i11) {
            for (int iLocationOf = SlotTableKt.locationOf(this.anchors, i11, capacity); iLocationOf < this.anchors.size() && (location$runtime_release = (anchor = this.anchors.get(iLocationOf)).getLocation$runtime_release()) >= 0; iLocationOf++) {
                anchor.setLocation$runtime_release(-(capacity - location$runtime_release));
            }
            return;
        }
        for (int iLocationOf2 = SlotTableKt.locationOf(this.anchors, i10, capacity); iLocationOf2 < this.anchors.size() && (location$runtime_release2 = (anchor2 = this.anchors.get(iLocationOf2)).getLocation$runtime_release()) < 0 && (i12 = location$runtime_release2 + capacity) < i11; iLocationOf2++) {
            anchor2.setLocation$runtime_release(i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateContainsMark(int i10) {
        if (i10 >= 0) {
            MutableIntList mutableIntListM23659constructorimpl$default = this.pendingRecalculateMarks;
            if (mutableIntListM23659constructorimpl$default == null) {
                mutableIntListM23659constructorimpl$default = PrioritySet.m23659constructorimpl$default(null, 1, null);
                this.pendingRecalculateMarks = mutableIntListM23659constructorimpl$default;
            }
            PrioritySet.m23656addimpl(mutableIntListM23659constructorimpl$default, i10);
        }
    }

    /* renamed from: updateContainsMarkNow-XpTMRCE, reason: not valid java name */
    private final void m23682updateContainsMarkNowXpTMRCE(int i10, MutableIntList mutableIntList) {
        int iGroupIndexToAddress = groupIndexToAddress(i10);
        boolean zChildContainsAnyMarks = childContainsAnyMarks(i10);
        int[] iArr = this.groups;
        if (((iArr[(iGroupIndexToAddress * 5) + 1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) != zChildContainsAnyMarks) {
            SlotTableKt.updateContainsMark(iArr, iGroupIndexToAddress, zChildContainsAnyMarks);
            int iParent = parent(i10);
            if (iParent >= 0) {
                PrioritySet.m23656addimpl(mutableIntList, iParent);
            }
        }
    }

    private final void updateDataIndex(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 4] = dataIndexToDataAnchor(i11, this.slotsGapStart, this.slotsGapLen, this.slots.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateNodeOfGroup(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.groupIndexToAddress(r5)
            int[] r1 = r4.groups
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r0 * 5
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            if (r3 != 0) goto L31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Updating the node of a group at "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " that was not created with as a node group"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError(r5)
        L31:
            java.lang.Object[] r5 = r4.slots
            int[] r1 = r4.groups
            int r0 = r4.nodeIndex(r1, r0)
            int r0 = r4.dataIndexToDataAddress(r0)
            r5[r0] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.updateNodeOfGroup(int, java.lang.Object):void");
    }

    public final void advanceBy(int i10) {
        boolean z10 = false;
        if (!(i10 >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek backwards");
        }
        if (!(this.insertCount <= 0)) {
            PreconditionsKt.throwIllegalStateException("Cannot call seek() while inserting");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.currentGroup + i10;
        if (i11 >= this.parent && i11 <= this.currentGroupEnd) {
            z10 = true;
        }
        if (!z10) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')');
        }
        this.currentGroup = i11;
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i11));
        this.currentSlot = iDataIndex;
        this.currentSlotEnd = iDataIndex;
    }

    public final Anchor anchor(int i10) {
        ArrayList<Anchor> arrayList = this.anchors;
        int iSearch = SlotTableKt.search(arrayList, i10, getSize$runtime_release());
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        if (i10 > this.groupGapStart) {
            i10 = -(getSize$runtime_release() - i10);
        }
        Anchor anchor = new Anchor(i10);
        arrayList.add(-(iSearch + 1), anchor);
        return anchor;
    }

    public final int anchorIndex(Anchor anchor) {
        int location$runtime_release = anchor.getLocation$runtime_release();
        return location$runtime_release < 0 ? getSize$runtime_release() + location$runtime_release : location$runtime_release;
    }

    public final void appendSlot(Anchor anchor, Object obj) {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Can only append a slot if not current inserting");
        }
        int i10 = this.currentSlot;
        int i11 = this.currentSlotEnd;
        int iAnchorIndex = anchorIndex(anchor);
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(iAnchorIndex + 1));
        this.currentSlot = iDataIndex;
        this.currentSlotEnd = iDataIndex;
        insertSlots(1, iAnchorIndex);
        if (i10 >= iDataIndex) {
            i10++;
            i11++;
        }
        this.slots[iDataIndex] = obj;
        this.currentSlot = i10;
        this.currentSlotEnd = i11;
    }

    public final void bashCurrentGroup() {
        SlotTableKt.updateGroupKey(this.groups, this.currentGroup, -3);
    }

    public final void beginInsert() {
        int i10 = this.insertCount;
        this.insertCount = i10 + 1;
        if (i10 == 0) {
            saveCurrentGroupEnd();
        }
    }

    public final Object clear(int i10) {
        int iDataIndexToDataAddress = dataIndexToDataAddress(i10);
        Object[] objArr = this.slots;
        Object obj = objArr[iDataIndexToDataAddress];
        objArr[iDataIndexToDataAddress] = Composer.Companion.getEmpty();
        return obj;
    }

    public final void close(boolean z10) {
        this.closed = true;
        if (z10 && this.startStack.tos == 0) {
            moveGroupGapTo(getSize$runtime_release());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            clearSlotGap();
            recalculateMarks();
        }
        this.table.close$runtime_release(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap, this.calledByMap);
    }

    public final int endGroup() {
        MutableObjectList<Object> mutableObjectList;
        boolean z10 = this.insertCount > 0;
        int i10 = this.currentGroup;
        int i11 = this.currentGroupEnd;
        int i12 = this.parent;
        int iGroupIndexToAddress = groupIndexToAddress(i12);
        int i13 = this.nodeCount;
        int i14 = i10 - i12;
        int i15 = (iGroupIndexToAddress * 5) + 1;
        boolean z11 = (this.groups[i15] & BasicMeasure.EXACTLY) != 0;
        if (z10) {
            MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
            if (mutableIntObjectMap != null && (mutableObjectList = mutableIntObjectMap.get(i12)) != null) {
                Object[] objArr = mutableObjectList.content;
                int i16 = mutableObjectList._size;
                for (int i17 = 0; i17 < i16; i17++) {
                    rawUpdate(objArr[i17]);
                }
                mutableIntObjectMap.remove(i12);
            }
            SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress, i14);
            SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i13);
            this.nodeCount = this.nodeCountStack.pop() + (z11 ? 1 : i13);
            int iParent = parent(this.groups, i12);
            this.parent = iParent;
            int size$runtime_release = iParent < 0 ? getSize$runtime_release() : groupIndexToAddress(iParent + 1);
            int iDataIndex = size$runtime_release >= 0 ? dataIndex(this.groups, size$runtime_release) : 0;
            this.currentSlot = iDataIndex;
            this.currentSlotEnd = iDataIndex;
            return i13;
        }
        if (!(i10 == i11)) {
            ComposerKt.composeImmediateRuntimeError("Expected to be at the end of a group");
        }
        int iGroupSize = SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
        int[] iArr = this.groups;
        int i18 = iArr[i15] & RectListKt.Lower26Bits;
        SlotTableKt.updateGroupSize(iArr, iGroupIndexToAddress, i14);
        SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i13);
        int iPop = this.startStack.pop();
        restoreCurrentGroupEnd();
        this.parent = iPop;
        int iParent2 = parent(this.groups, i12);
        int iPop2 = this.nodeCountStack.pop();
        this.nodeCount = iPop2;
        if (iParent2 == iPop) {
            this.nodeCount = iPop2 + (z11 ? 0 : i13 - i18);
            return i13;
        }
        int i19 = i14 - iGroupSize;
        int i20 = z11 ? 0 : i13 - i18;
        if (i19 != 0 || i20 != 0) {
            while (iParent2 != 0 && iParent2 != iPop && (i20 != 0 || i19 != 0)) {
                int iGroupIndexToAddress2 = groupIndexToAddress(iParent2);
                if (i19 != 0) {
                    SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress2, SlotTableKt.groupSize(this.groups, iGroupIndexToAddress2) + i19);
                }
                if (i20 != 0) {
                    int[] iArr2 = this.groups;
                    SlotTableKt.updateNodeCount(iArr2, iGroupIndexToAddress2, (iArr2[(iGroupIndexToAddress2 * 5) + 1] & RectListKt.Lower26Bits) + i20);
                }
                int[] iArr3 = this.groups;
                if ((iArr3[(iGroupIndexToAddress2 * 5) + 1] & BasicMeasure.EXACTLY) != 0) {
                    i20 = 0;
                }
                iParent2 = parent(iArr3, iParent2);
            }
        }
        this.nodeCount += i20;
        return i13;
    }

    public final void endInsert() {
        if (!(this.insertCount > 0)) {
            PreconditionsKt.throwIllegalStateException("Unbalanced begin/end insert");
        }
        int i10 = this.insertCount - 1;
        this.insertCount = i10;
        if (i10 == 0) {
            if (!(this.nodeCountStack.tos == this.startStack.tos)) {
                ComposerKt.composeImmediateRuntimeError("startGroup/endGroup mismatch while inserting");
            }
            restoreCurrentGroupEnd();
        }
    }

    public final void ensureStarted(int i10) {
        boolean z10 = false;
        if (!(this.insertCount <= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot call ensureStarted() while inserting");
        }
        int i11 = this.parent;
        if (i11 != i10) {
            if (i10 >= i11 && i10 < this.currentGroupEnd) {
                z10 = true;
            }
            if (!z10) {
                ComposerKt.composeImmediateRuntimeError("Started group at " + i10 + " must be a subgroup of the group at " + i11);
            }
            int i12 = this.currentGroup;
            int i13 = this.currentSlot;
            int i14 = this.currentSlotEnd;
            this.currentGroup = i10;
            startGroup();
            this.currentGroup = i12;
            this.currentSlot = i13;
            this.currentSlotEnd = i14;
        }
    }

    public final void forAllData(int i10, InterfaceC10574p interfaceC10574p) {
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(getCurrentGroup() + groupSize(getCurrentGroup())));
        for (int iDataIndex2 = dataIndex(this.groups, groupIndexToAddress(i10)); iDataIndex2 < iDataIndex; iDataIndex2++) {
            interfaceC10574p.invoke(Integer.valueOf(iDataIndex2), this.slots[dataIndexToDataAddress(iDataIndex2)]);
        }
    }

    public final void forEachTailSlot(int i10, int i11, InterfaceC10574p interfaceC10574p) {
        int iSlotsStartIndex$runtime_release = slotsStartIndex$runtime_release(i10);
        int iSlotsEndIndex$runtime_release = slotsEndIndex$runtime_release(i10);
        for (int iMax = Math.max(iSlotsStartIndex$runtime_release, iSlotsEndIndex$runtime_release - i11); iMax < iSlotsEndIndex$runtime_release; iMax++) {
            interfaceC10574p.invoke(Integer.valueOf(iMax), this.slots[dataIndexToDataAddress(iMax)]);
        }
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final boolean getCollectingCalledInformation() {
        return this.calledByMap != null;
    }

    public final boolean getCollectingSourceInformation() {
        return this.sourceInformationMap != null;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getSize$runtime_release() {
        return getCapacity() - this.groupGapLen;
    }

    public final int getSlotsSize() {
        return this.slots.length - this.slotsGapLen;
    }

    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    public final Object groupAux(int i10) {
        int iGroupIndexToAddress = groupIndexToAddress(i10);
        int[] iArr = this.groups;
        return (iArr[(iGroupIndexToAddress * 5) + 1] & 268435456) != 0 ? this.slots[auxIndex(iArr, iGroupIndexToAddress)] : Composer.Companion.getEmpty();
    }

    public final int groupKey(int i10) {
        return this.groups[groupIndexToAddress(i10) * 5];
    }

    public final Object groupObjectKey(int i10) {
        int iGroupIndexToAddress = groupIndexToAddress(i10);
        int[] iArr = this.groups;
        if ((iArr[(iGroupIndexToAddress * 5) + 1] & 536870912) != 0) {
            return this.slots[SlotTableKt.objectKeyIndex(iArr, iGroupIndexToAddress)];
        }
        return null;
    }

    public final int groupSize(int i10) {
        return SlotTableKt.groupSize(this.groups, groupIndexToAddress(i10));
    }

    public final Iterator<Object> groupSlots() {
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int[] iArr = this.groups;
        int i10 = this.currentGroup;
        return new C25431(iDataIndex, dataIndex(iArr, groupIndexToAddress(i10 + groupSize(i10))), this);
    }

    public final boolean indexInCurrentGroup(int i10) {
        return indexInGroup(i10, this.currentGroup);
    }

    public final boolean indexInGroup(int i10, int i11) {
        int iIndexOf;
        int capacity;
        if (i11 == this.parent) {
            capacity = this.currentGroupEnd;
        } else if (i11 <= this.startStack.peekOr(0) && (iIndexOf = this.startStack.indexOf(i11)) >= 0) {
            capacity = (getCapacity() - this.groupGapLen) - this.endStack.peek(iIndexOf);
        } else {
            int iGroupSize = groupSize(i11);
            capacity = iGroupSize + i11;
        }
        return i10 > i11 && i10 < capacity;
    }

    public final boolean indexInParent(int i10) {
        int i11 = this.parent;
        if (i10 <= i11 || i10 >= this.currentGroupEnd) {
            return i11 == 0 && i10 == 0;
        }
        return true;
    }

    public final void insertAux(Object obj) {
        if (!(this.insertCount >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot insert auxiliary data when not inserting");
        }
        int i10 = this.parent;
        int iGroupIndexToAddress = groupIndexToAddress(i10);
        if ((this.groups[(iGroupIndexToAddress * 5) + 1] & 268435456) != 0) {
            ComposerKt.composeImmediateRuntimeError("Group already has auxiliary data");
        }
        insertSlots(1, i10);
        int iAuxIndex = auxIndex(this.groups, iGroupIndexToAddress);
        int iDataIndexToDataAddress = dataIndexToDataAddress(iAuxIndex);
        int i11 = this.currentSlot;
        if (i11 > iAuxIndex) {
            int i12 = i11 - iAuxIndex;
            if (!(i12 < 3)) {
                PreconditionsKt.throwIllegalStateException("Moving more than two slot not supported");
            }
            if (i12 > 1) {
                Object[] objArr = this.slots;
                objArr[iDataIndexToDataAddress + 2] = objArr[iDataIndexToDataAddress + 1];
            }
            Object[] objArr2 = this.slots;
            objArr2[iDataIndexToDataAddress + 1] = objArr2[iDataIndexToDataAddress];
        }
        SlotTableKt.addAux(this.groups, iGroupIndexToAddress);
        this.slots[iDataIndexToDataAddress] = obj;
        this.currentSlot++;
    }

    public final boolean isGroupEnd() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final boolean isNode() {
        int i10 = this.currentGroup;
        return i10 < this.currentGroupEnd && (this.groups[(groupIndexToAddress(i10) * 5) + 1] & BasicMeasure.EXACTLY) != 0;
    }

    public final void markGroup(int i10) {
        int iGroupIndexToAddress = groupIndexToAddress(i10);
        int[] iArr = this.groups;
        int i11 = (iGroupIndexToAddress * 5) + 1;
        if ((iArr[i11] & 134217728) != 0) {
            return;
        }
        SlotTableKt.updateMark(iArr, iGroupIndexToAddress, true);
        if ((this.groups[i11] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            return;
        }
        updateContainsMark(parent(i10));
    }

    public final List<Anchor> moveFrom(SlotTable slotTable, int i10, boolean z10) {
        if (!(this.insertCount > 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (i10 != 0 || this.currentGroup != 0 || this.table.getGroupsSize() != 0 || SlotTableKt.groupSize(slotTable.getGroups(), i10) != slotTable.getGroupsSize()) {
            SlotWriter slotWriterOpenWriter = slotTable.openWriter();
            try {
                List<Anchor> listMoveGroup = Companion.moveGroup(slotWriterOpenWriter, i10, this, true, true, z10);
                slotWriterOpenWriter.close(true);
                return listMoveGroup;
            } catch (Throwable th) {
                slotWriterOpenWriter.close(false);
                throw th;
            }
        }
        int[] iArr = this.groups;
        Object[] objArr = this.slots;
        ArrayList<Anchor> arrayList = this.anchors;
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
        int[] groups = slotTable.getGroups();
        int groupsSize = slotTable.getGroupsSize();
        Object[] slots = slotTable.getSlots();
        int slotsSize = slotTable.getSlotsSize();
        HashMap<Anchor, GroupSourceInformation> sourceInformationMap$runtime_release = slotTable.getSourceInformationMap$runtime_release();
        MutableIntObjectMap<MutableIntSet> calledByMap$runtime_release = slotTable.getCalledByMap$runtime_release();
        this.groups = groups;
        this.slots = slots;
        this.anchors = slotTable.getAnchors$runtime_release();
        this.groupGapStart = groupsSize;
        this.groupGapLen = (groups.length / 5) - groupsSize;
        this.slotsGapStart = slotsSize;
        this.slotsGapLen = slots.length - slotsSize;
        this.slotsGapOwner = groupsSize;
        this.sourceInformationMap = sourceInformationMap$runtime_release;
        this.calledByMap = calledByMap$runtime_release;
        slotTable.setTo$runtime_release(iArr, 0, objArr, 0, arrayList, map, mutableIntObjectMap);
        return this.anchors;
    }

    public final void moveGroup(int i10) {
        boolean z10 = true;
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot move a group while inserting");
        }
        if (!(i10 >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.currentGroup;
        int i12 = this.parent;
        int i13 = this.currentGroupEnd;
        int iGroupSize = i11;
        for (int i14 = i10; i14 > 0; i14--) {
            iGroupSize += SlotTableKt.groupSize(this.groups, groupIndexToAddress(iGroupSize));
            if (!(iGroupSize <= i13)) {
                ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
            }
        }
        int iGroupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress(iGroupSize));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int iDataIndex2 = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
        int i15 = iGroupSize + iGroupSize2;
        int iDataIndex3 = dataIndex(this.groups, groupIndexToAddress(i15));
        int i16 = iDataIndex3 - iDataIndex2;
        insertSlots(i16, Math.max(this.currentGroup - 1, 0));
        insertGroups(iGroupSize2);
        int[] iArr = this.groups;
        int iGroupIndexToAddress = groupIndexToAddress(i15) * 5;
        AbstractC8797p.m14647n(iArr, iArr, groupIndexToAddress(i11) * 5, iGroupIndexToAddress, (iGroupSize2 * 5) + iGroupIndexToAddress);
        if (i16 > 0) {
            Object[] objArr = this.slots;
            int iDataIndexToDataAddress = dataIndexToDataAddress(iDataIndex2 + i16);
            System.arraycopy(objArr, iDataIndexToDataAddress, objArr, iDataIndex, dataIndexToDataAddress(iDataIndex3 + i16) - iDataIndexToDataAddress);
        }
        int i17 = iDataIndex2 + i16;
        int i18 = i17 - iDataIndex;
        int i19 = this.slotsGapStart;
        int i20 = this.slotsGapLen;
        int length = this.slots.length;
        int i21 = this.slotsGapOwner;
        int i22 = i11 + iGroupSize2;
        int i23 = i11;
        while (i23 < i22) {
            boolean z11 = z10;
            int iGroupIndexToAddress2 = groupIndexToAddress(i23);
            int i24 = i23;
            int i25 = i18;
            updateDataIndex(iArr, iGroupIndexToAddress2, dataIndexToDataAnchor(dataIndex(iArr, iGroupIndexToAddress2) - i18, i21 < iGroupIndexToAddress2 ? 0 : i19, i20, length));
            i23 = i24 + 1;
            z10 = z11;
            i18 = i25;
        }
        moveAnchors(i15, i11, iGroupSize2);
        if (removeGroups(i15, iGroupSize2)) {
            ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
        }
        fixParentAnchorsFor(i12, this.currentGroupEnd, i11);
        if (i16 > 0) {
            removeSlots(i17, i16, i15 - 1);
        }
    }

    public final List<Anchor> moveIntoGroupFrom(int i10, SlotTable slotTable, int i11) {
        if (!(this.insertCount <= 0 && groupSize(this.currentGroup + i10) == 1)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int i12 = this.currentGroup;
        int i13 = this.currentSlot;
        int i14 = this.currentSlotEnd;
        advanceBy(i10);
        startGroup();
        beginInsert();
        SlotWriter slotWriterOpenWriter = slotTable.openWriter();
        try {
            List<Anchor> listMoveGroup$default = Companion.moveGroup$default(Companion, slotWriterOpenWriter, i11, this, false, true, false, 32, null);
            slotWriterOpenWriter.close(true);
            endInsert();
            endGroup();
            this.currentGroup = i12;
            this.currentSlot = i13;
            this.currentSlotEnd = i14;
            return listMoveGroup$default;
        } catch (Throwable th) {
            slotWriterOpenWriter.close(false);
            throw th;
        }
    }

    public final List<Anchor> moveTo(Anchor anchor, int i10, SlotWriter slotWriter) {
        if (!(slotWriter.insertCount > 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (!anchor.getValid()) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int iAnchorIndex = anchorIndex(anchor) + i10;
        int i11 = this.currentGroup;
        if (!(i11 <= iAnchorIndex && iAnchorIndex < this.currentGroupEnd)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int iParent = parent(iAnchorIndex);
        int iGroupSize = groupSize(iAnchorIndex);
        int iNodeCount = isNode(iAnchorIndex) ? 1 : nodeCount(iAnchorIndex);
        List<Anchor> listMoveGroup$default = Companion.moveGroup$default(Companion, this, iAnchorIndex, slotWriter, false, false, false, 32, null);
        updateContainsMark(iParent);
        boolean z10 = iNodeCount > 0;
        while (iParent >= i11) {
            int iGroupIndexToAddress = groupIndexToAddress(iParent);
            int[] iArr = this.groups;
            SlotTableKt.updateGroupSize(iArr, iGroupIndexToAddress, SlotTableKt.groupSize(iArr, iGroupIndexToAddress) - iGroupSize);
            if (z10) {
                int[] iArr2 = this.groups;
                int i12 = iArr2[(iGroupIndexToAddress * 5) + 1];
                if ((1073741824 & i12) != 0) {
                    z10 = false;
                } else {
                    SlotTableKt.updateNodeCount(iArr2, iGroupIndexToAddress, (i12 & RectListKt.Lower26Bits) - iNodeCount);
                }
            }
            iParent = parent(iParent);
        }
        if (z10) {
            if (!(this.nodeCount >= iNodeCount)) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            this.nodeCount -= iNodeCount;
        }
        return listMoveGroup$default;
    }

    public final Object node(int i10) {
        int iGroupIndexToAddress = groupIndexToAddress(i10);
        int[] iArr = this.groups;
        if ((iArr[(iGroupIndexToAddress * 5) + 1] & BasicMeasure.EXACTLY) != 0) {
            return this.slots[dataIndexToDataAddress(nodeIndex(iArr, iGroupIndexToAddress))];
        }
        return null;
    }

    public final int nodeCount(int i10) {
        return this.groups[(groupIndexToAddress(i10) * 5) + 1] & RectListKt.Lower26Bits;
    }

    public final int parent(int i10) {
        return parent(this.groups, i10);
    }

    public final void recordGroupSourceInformation(String str) {
        if (this.insertCount > 0) {
            groupSourceInformationFor(this.parent, str);
        }
    }

    public final void recordGrouplessCallSourceInformationEnd() {
        GroupSourceInformation groupSourceInformationGroupSourceInformationFor;
        if (this.insertCount <= 0 || (groupSourceInformationGroupSourceInformationFor = groupSourceInformationFor(this.parent, null)) == null) {
            return;
        }
        groupSourceInformationGroupSourceInformationFor.endGrouplessCall(getCurrentGroupSlotIndex());
    }

    public final void recordGrouplessCallSourceInformationStart(int i10, String str) {
        if (this.insertCount > 0) {
            MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
            if (mutableIntObjectMap != null) {
                SlotTableKt.add(mutableIntObjectMap, i10, groupKey(this.parent));
            }
            GroupSourceInformation groupSourceInformationGroupSourceInformationFor = groupSourceInformationFor(this.parent, null);
            if (groupSourceInformationGroupSourceInformationFor != null) {
                groupSourceInformationGroupSourceInformationFor.startGrouplessCall(i10, str, getCurrentGroupSlotIndex());
            }
        }
    }

    public final boolean removeGroup() {
        Anchor anchorTryAnchor$runtime_release;
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot remove group while inserting");
        }
        int i10 = this.currentGroup;
        int i11 = this.currentSlot;
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i10));
        int iSkipGroup = skipGroup();
        GroupSourceInformation groupSourceInformationSourceInformationOf = sourceInformationOf(this.parent);
        if (groupSourceInformationSourceInformationOf != null && (anchorTryAnchor$runtime_release = tryAnchor$runtime_release(i10)) != null) {
            groupSourceInformationSourceInformationOf.removeAnchor(anchorTryAnchor$runtime_release);
        }
        MutableIntList mutableIntList = this.pendingRecalculateMarks;
        if (mutableIntList != null) {
            while (PrioritySet.m23664isNotEmptyimpl(mutableIntList) && PrioritySet.m23665peekimpl(mutableIntList) >= i10) {
                PrioritySet.m23666takeMaximpl(mutableIntList);
            }
        }
        boolean zRemoveGroups = removeGroups(i10, this.currentGroup - i10);
        removeSlots(iDataIndex, this.currentSlot - iDataIndex, i10 - 1);
        this.currentGroup = i10;
        this.currentSlot = i11;
        this.nodeCount -= iSkipGroup;
        return zRemoveGroups;
    }

    public final void reset() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot reset when inserting");
        }
        recalculateMarks();
        this.currentGroup = 0;
        this.currentGroupEnd = getCapacity() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
    }

    public final void seek(Anchor anchor) {
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    public final void set(Object obj) {
        if (!(this.currentSlot <= this.currentSlotEnd)) {
            ComposerKt.composeImmediateRuntimeError("Writing to an invalid slot");
        }
        this.slots[dataIndexToDataAddress(this.currentSlot - 1)] = obj;
    }

    public final Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i10 = this.currentSlot;
        this.currentSlot = i10 + 1;
        return objArr[dataIndexToDataAddress(i10)];
    }

    public final int skipGroup() {
        int iGroupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int iGroupSize = this.currentGroup + SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
        this.currentGroup = iGroupSize;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
        int i10 = this.groups[(iGroupIndexToAddress * 5) + 1];
        if ((1073741824 & i10) != 0) {
            return 1;
        }
        return i10 & RectListKt.Lower26Bits;
    }

    public final void skipToGroupEnd() {
        int i10 = this.currentGroupEnd;
        this.currentGroup = i10;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i10));
    }

    public final Object slot(Anchor anchor, int i10) {
        return slot(anchorIndex(anchor), i10);
    }

    public final int slotIndexOfGroupSlotIndex(int i10, int i11) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(i10));
        int i12 = iSlotIndex + i11;
        if (!(i12 >= iSlotIndex && i12 < dataIndex(this.groups, groupIndexToAddress(i10 + 1)))) {
            ComposerKt.composeImmediateRuntimeError("Write to an invalid slot index " + i11 + " for group " + i10);
        }
        return i12;
    }

    public final int slotsEndAllIndex$runtime_release(int i10) {
        return dataIndex(this.groups, groupIndexToAddress(i10 + groupSize(i10)));
    }

    public final int slotsEndIndex$runtime_release(int i10) {
        return dataIndex(this.groups, groupIndexToAddress(i10 + 1));
    }

    public final int slotsStartIndex$runtime_release(int i10) {
        return slotIndex(this.groups, groupIndexToAddress(i10));
    }

    public final void startData(int i10, Object obj, Object obj2) {
        startGroup(i10, obj, false, obj2);
    }

    public final void startGroup() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Key must be supplied when inserting");
        }
        Composer.Companion companion = Composer.Companion;
        startGroup(0, companion.getEmpty(), false, companion.getEmpty());
    }

    public final void startNode(int i10, Object obj) {
        startGroup(i10, obj, true, Composer.Companion.getEmpty());
    }

    public final String toDebugString() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        AbstractC9133u.m16132f(sb, "append(...)");
        sb.append('\n');
        AbstractC9133u.m16132f(sb, "append(...)");
        sb.append("  parent:    " + this.parent);
        AbstractC9133u.m16132f(sb, "append(...)");
        sb.append('\n');
        AbstractC9133u.m16132f(sb, "append(...)");
        sb.append("  current:   " + this.currentGroup);
        AbstractC9133u.m16132f(sb, "append(...)");
        sb.append('\n');
        AbstractC9133u.m16132f(sb, "append(...)");
        sb.append("  group gap: " + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + '(' + this.groupGapLen + ')');
        AbstractC9133u.m16132f(sb, "append(...)");
        sb.append('\n');
        AbstractC9133u.m16132f(sb, "append(...)");
        sb.append("  slots gap: " + this.slotsGapStart + '-' + (this.slotsGapStart + this.slotsGapLen) + '(' + this.slotsGapLen + ')');
        AbstractC9133u.m16132f(sb, "append(...)");
        sb.append('\n');
        AbstractC9133u.m16132f(sb, "append(...)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("  gap owner: ");
        sb2.append(this.slotsGapOwner);
        sb.append(sb2.toString());
        AbstractC9133u.m16132f(sb, "append(...)");
        sb.append('\n');
        AbstractC9133u.m16132f(sb, "append(...)");
        int size$runtime_release = getSize$runtime_release();
        for (int i10 = 0; i10 < size$runtime_release; i10++) {
            groupAsString(sb, i10);
            sb.append('\n');
        }
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime_release() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    public final void trimTailSlots(int i10) {
        if (!(i10 > 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int i11 = this.parent;
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(i11));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i11 + 1)) - i10;
        if (!(iDataIndex >= iSlotIndex)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        removeSlots(iDataIndex, i10, i11);
        int i12 = this.currentSlot;
        if (i12 >= iSlotIndex) {
            this.currentSlot = i12 - i10;
        }
    }

    public final Anchor tryAnchor$runtime_release(int i10) {
        if (i10 < 0 || i10 >= getSize$runtime_release()) {
            return null;
        }
        return SlotTableKt.find(this.anchors, i10, getSize$runtime_release());
    }

    public final Object update(Object obj) {
        if (this.insertCount <= 0 || this.currentSlot == this.slotsGapStart) {
            return rawUpdate(obj);
        }
        MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
        AbstractC9126n abstractC9126n = null;
        int i10 = 1;
        int i11 = 0;
        if (mutableIntObjectMap == null) {
            mutableIntObjectMap = new MutableIntObjectMap<>(i11, i10, abstractC9126n);
        }
        this.deferredSlotWrites = mutableIntObjectMap;
        int i12 = this.parent;
        MutableObjectList<Object> mutableObjectList = mutableIntObjectMap.get(i12);
        if (mutableObjectList == null) {
            mutableObjectList = new MutableObjectList<>(i11, i10, abstractC9126n);
            mutableIntObjectMap.set(i12, mutableObjectList);
        }
        mutableObjectList.add(obj);
        return Composer.Companion.getEmpty();
    }

    public final void updateAux(Object obj) {
        int iGroupIndexToAddress = groupIndexToAddress(this.currentGroup);
        if (!((this.groups[(iGroupIndexToAddress * 5) + 1] & 268435456) != 0)) {
            ComposerKt.composeImmediateRuntimeError("Updating the data of a group that was not created with a data slot");
        }
        this.slots[dataIndexToDataAddress(auxIndex(this.groups, iGroupIndexToAddress))] = obj;
    }

    public final void updateNode(Object obj) {
        updateNodeOfGroup(this.currentGroup, obj);
    }

    public final void updateParentNode(Object obj) {
        updateNodeOfGroup(this.parent, obj);
    }

    public final void updateToTableMaps() {
        this.sourceInformationMap = this.table.getSourceInformationMap$runtime_release();
        this.calledByMap = this.table.getCalledByMap$runtime_release();
    }

    public final void verifyDataAnchors$runtime_release() {
        int i10 = this.slotsGapOwner;
        int length = this.slots.length - this.slotsGapLen;
        int size$runtime_release = getSize$runtime_release();
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        while (i11 < size$runtime_release) {
            int iGroupIndexToAddress = groupIndexToAddress(i11);
            int[] iArr = this.groups;
            int i13 = iArr[(iGroupIndexToAddress * 5) + 4];
            int iDataIndex = dataIndex(iArr, iGroupIndexToAddress);
            if (!(iDataIndex >= i12)) {
                PreconditionsKt.throwIllegalStateException("Data index out of order at " + i11 + ", previous = " + i12 + ", current = " + iDataIndex);
            }
            if (!(iDataIndex <= length)) {
                PreconditionsKt.throwIllegalStateException("Data index, " + iDataIndex + ", out of bound at " + i11);
            }
            if (i13 < 0 && !z10) {
                if (!(i10 == i11)) {
                    PreconditionsKt.throwIllegalStateException("Expected the slot gap owner to be " + i10 + " found gap at " + i11);
                }
                z10 = true;
            }
            i11++;
            i12 = iDataIndex;
        }
    }

    public final void verifyParentAnchors$runtime_release() {
        int i10 = this.groupGapStart;
        int i11 = this.groupGapLen;
        int capacity = getCapacity();
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                break;
            }
            if (!(this.groups[(i12 * 5) + 2] > -2)) {
                PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at " + i12);
            }
            i12++;
        }
        for (int i13 = i11 + i10; i13 < capacity; i13++) {
            int i14 = this.groups[(i13 * 5) + 2];
            if (parentAnchorToIndex(i14) < i10) {
                if (!(i14 > -2)) {
                    PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at " + i13);
                }
            } else if (!(i14 <= -2)) {
                PreconditionsKt.throwIllegalStateException("Expected an end relative anchor at " + i13);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int[] iArr, int i10) {
        return i10 >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(iArr[(i10 * 5) + 4], this.slotsGapLen, this.slots.length);
    }

    public final int parent(Anchor anchor) {
        if (anchor.getValid()) {
            return parent(this.groups, anchorIndex(anchor));
        }
        return -1;
    }

    public final Object slot(int i10, int i11) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(i10));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i10 + 1));
        int i12 = i11 + iSlotIndex;
        if (iSlotIndex > i12 || i12 >= iDataIndex) {
            return Composer.Companion.getEmpty();
        }
        return this.slots[dataIndexToDataAddress(i12)];
    }

    public final void startData(int i10, Object obj) {
        startGroup(i10, Composer.Companion.getEmpty(), false, obj);
    }

    public final void startNode(int i10, Object obj, Object obj2) {
        startGroup(i10, obj, true, obj2);
    }

    public final void updateNode(Anchor anchor, Object obj) {
        updateNodeOfGroup(anchor.toIndexFor(this), obj);
    }

    private final int parent(int[] iArr, int i10) {
        return parentAnchorToIndex(iArr[(groupIndexToAddress(i10) * 5) + 2]);
    }

    public final boolean isNode(int i10) {
        return (this.groups[(groupIndexToAddress(i10) * 5) + 1] & BasicMeasure.EXACTLY) != 0;
    }

    public final Object set(int i10, Object obj) {
        return set(getCurrentGroup(), i10, obj);
    }

    public final void startGroup(int i10) {
        Composer.Companion companion = Composer.Companion;
        startGroup(i10, companion.getEmpty(), false, companion.getEmpty());
    }

    public final Object node(Anchor anchor) {
        return node(anchor.toIndexFor(this));
    }

    public final Object set(int i10, int i11, Object obj) {
        int iDataIndexToDataAddress = dataIndexToDataAddress(slotIndexOfGroupSlotIndex(i10, i11));
        Object[] objArr = this.slots;
        Object obj2 = objArr[iDataIndexToDataAddress];
        objArr[iDataIndexToDataAddress] = obj;
        return obj2;
    }

    public final void startGroup(int i10, Object obj) {
        startGroup(i10, obj, false, Composer.Companion.getEmpty());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    private final void startGroup(int i10, Object obj, boolean z10, Object obj2) {
        int iGroupSize;
        GroupSourceInformation groupSourceInformationSourceInformationOf;
        int i11 = this.parent;
        Object[] objArr = this.insertCount > 0;
        this.nodeCountStack.push(this.nodeCount);
        if (objArr != false) {
            int i12 = this.currentGroup;
            int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i12));
            insertGroups(1);
            this.currentSlot = iDataIndex;
            this.currentSlotEnd = iDataIndex;
            int iGroupIndexToAddress = groupIndexToAddress(i12);
            Composer.Companion companion = Composer.Companion;
            ?? r12 = obj != companion.getEmpty() ? 1 : 0;
            ?? r13 = (z10 || obj2 == companion.getEmpty()) ? 0 : 1;
            int iDataIndexToDataAnchor = dataIndexToDataAnchor(iDataIndex, this.slotsGapStart, this.slotsGapLen, this.slots.length);
            if (iDataIndexToDataAnchor >= 0 && this.slotsGapOwner < i12) {
                iDataIndexToDataAnchor = -(((this.slots.length - this.slotsGapLen) - iDataIndexToDataAnchor) + 1);
            }
            SlotTableKt.initGroup(this.groups, iGroupIndexToAddress, i10, z10, r12, r13, this.parent, iDataIndexToDataAnchor);
            int i13 = (z10 ? 1 : 0) + r12 + r13;
            if (i13 > 0) {
                insertSlots(i13, i12);
                Object[] objArr2 = this.slots;
                int i14 = this.currentSlot;
                if (z10) {
                    objArr2[i14] = obj2;
                    i14++;
                }
                if (r12 != 0) {
                    objArr2[i14] = obj;
                    i14++;
                }
                if (r13 != 0) {
                    objArr2[i14] = obj2;
                    i14++;
                }
                this.currentSlot = i14;
            }
            this.nodeCount = 0;
            iGroupSize = i12 + 1;
            this.parent = i12;
            this.currentGroup = iGroupSize;
            if (i11 >= 0 && (groupSourceInformationSourceInformationOf = sourceInformationOf(i11)) != null) {
                groupSourceInformationSourceInformationOf.reportGroup(this, i12);
            }
        } else {
            this.startStack.push(i11);
            saveCurrentGroupEnd();
            int i15 = this.currentGroup;
            int iGroupIndexToAddress2 = groupIndexToAddress(i15);
            if (!AbstractC9133u.m16128b(obj2, Composer.Companion.getEmpty())) {
                if (z10) {
                    updateNode(obj2);
                } else {
                    updateAux(obj2);
                }
            }
            this.currentSlot = slotIndex(this.groups, iGroupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            int[] iArr = this.groups;
            this.nodeCount = iArr[(iGroupIndexToAddress2 * 5) + 1] & RectListKt.Lower26Bits;
            this.parent = i15;
            this.currentGroup = i15 + 1;
            iGroupSize = i15 + SlotTableKt.groupSize(iArr, iGroupIndexToAddress2);
        }
        this.currentGroupEnd = iGroupSize;
    }

    public final void ensureStarted(Anchor anchor) {
        ensureStarted(anchor.toIndexFor(this));
    }
}
