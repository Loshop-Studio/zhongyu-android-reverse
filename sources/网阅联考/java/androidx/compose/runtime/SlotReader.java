package androidx.compose.runtime;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u0015\n\u0002\b\u0010\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010;\u001a\u00020<2\b\b\u0002\u0010=\u001a\u00020\nJ\u0006\u0010>\u001a\u00020?J\u0006\u0010@\u001a\u00020?J\u000e\u0010A\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\nJ\u0006\u0010B\u001a\u00020?J\u0006\u0010C\u001a\u00020?J\f\u0010D\u001a\b\u0012\u0004\u0012\u00020F0EJO\u0010G\u001a\u00020?2\u0006\u0010H\u001a\u00020\n28\u0010I\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(=\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\bK\u0012\b\bL\u0012\u0004\b\b(M\u0012\u0004\u0012\u00020?0JH\u0000¢\u0006\u0002\bNJ\u0010\u0010O\u001a\u0004\u0018\u00010\u00012\u0006\u0010=\u001a\u00020\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010=\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010=\u001a\u00020\nJ\u0010\u0010P\u001a\u0004\u0018\u00010\u00012\u0006\u0010=\u001a\u00020\nJ\u0018\u0010P\u001a\u0004\u0018\u00010\u00012\u0006\u0010H\u001a\u00020\n2\u0006\u0010=\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010;\u001a\u00020<J\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010=\u001a\u00020\nJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010=\u001a\u00020\nJ\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010=\u001a\u00020\nJ\u000e\u0010Q\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\nJ\u000e\u0010R\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\nJ\u000e\u0010*\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\nJ\b\u0010S\u001a\u0004\u0018\u00010\u0001J\u0010\u0010T\u001a\u0004\u0018\u00010\u00012\u0006\u0010=\u001a\u00020\nJ\u000e\u0010+\u001a\u00020\n2\u0006\u0010=\u001a\u00020\nJ\u000e\u0010-\u001a\u00020\n2\u0006\u0010=\u001a\u00020\nJ\u000e\u0010U\u001a\u00020\n2\u0006\u0010=\u001a\u00020\nJ\u000e\u0010V\u001a\u00020?2\u0006\u0010=\u001a\u00020\nJ\u000e\u0010W\u001a\u00020?2\u0006\u0010=\u001a\u00020\nJ\u0006\u0010X\u001a\u00020\nJ\u0006\u0010Y\u001a\u00020?J\u0006\u0010Z\u001a\u00020?J\u0006\u0010[\u001a\u00020?J\b\u0010\\\u001a\u00020]H\u0016J\u0016\u0010^\u001a\u0004\u0018\u00010\u0001*\u00020%2\u0006\u0010=\u001a\u00020\nH\u0002J\u0016\u0010T\u001a\u0004\u0018\u00010\u0001*\u00020%2\u0006\u0010=\u001a\u00020\nH\u0002J\u0016\u0010_\u001a\u0004\u0018\u00010\u0001*\u00020%2\u0006\u0010=\u001a\u00020\nH\u0002R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\u0018\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\rR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u001e\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\rR\u0011\u0010 \u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b!\u0010\rR\u0011\u0010\"\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b#\u0010\rR\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010'\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b(\u0010\tR\u0011\u0010)\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b)\u0010\tR\u0011\u0010*\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b*\u0010\tR\u0011\u0010+\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b,\u0010\rR\u001e\u0010-\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\rR\u0011\u0010/\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b0\u0010\rR\u0011\u00101\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b2\u0010\rR\u0011\u00103\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b4\u0010\rR\u0018\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000106X\u0082\u0004¢\u0006\u0004\n\u0002\u00107R\u000e\u00108\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:¨\u0006`"}, m5175d2 = {"Landroidx/compose/runtime/SlotReader;", "", "table", "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "<set-?>", "", "closed", "getClosed", "()Z", "", "currentEnd", "getCurrentEnd", "()I", "currentGroup", "getCurrentGroup", "currentSlot", "currentSlotEnd", "emptyCount", "groupAux", "getGroupAux", "()Ljava/lang/Object;", "groupEnd", "getGroupEnd", "groupKey", "getGroupKey", "groupNode", "getGroupNode", "groupObjectKey", "getGroupObjectKey", "groupSize", "getGroupSize", "groupSlotCount", "getGroupSlotCount", "groupSlotIndex", "getGroupSlotIndex", "groups", "", "groupsSize", "inEmpty", "getInEmpty", "isGroupEnd", "isNode", "nodeCount", "getNodeCount", "parent", "getParent", "parentNodes", "getParentNodes", "size", "getSize", "slot", "getSlot", "slots", "", "[Ljava/lang/Object;", "slotsSize", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "anchor", "Landroidx/compose/runtime/Anchor;", "index", "beginEmpty", "", "close", "containsMark", "endEmpty", "endGroup", "extractKeys", "", "Landroidx/compose/runtime/KeyInfo;", "forEachData", "group", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "data", "forEachData$runtime_release", "get", "groupGet", "hasMark", "hasObjectKey", "next", "node", "parentOf", "reposition", "restoreParent", "skipGroup", "skipToGroupEnd", "startGroup", "startNode", "toString", "", "aux", "objectKey", "runtime_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n1#1,3443:1\n1#2:3444\n4492#3,5:3445\n4492#3,5:3450\n4492#3,5:3455\n4492#3,5:3460\n4492#3,5:3465\n3323#4,6:3470\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n*L\n949#1:3445,5\n959#1:3450,5\n967#1:3455,5\n986#1:3460,5\n1000#1:3465,5\n1051#1:3470,6\n*E\n"})
/* loaded from: classes.dex */
public final class SlotReader {
    private boolean closed;

    /* renamed from: currentEnd, reason: from kotlin metadata and from toString */
    private int end;

    /* renamed from: currentGroup, reason: from kotlin metadata and from toString */
    private int current;
    private int currentSlot;
    private int currentSlotEnd;
    private int emptyCount;
    private final int[] groups;
    private final int groupsSize;
    private int parent;
    private final Object[] slots;
    private final int slotsSize;
    private final SlotTable table;

    public SlotReader(SlotTable table) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.table = table;
        this.groups = table.getGroups();
        int groupsSize = table.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = table.getSlots();
        this.slotsSize = table.getSlotsSize();
        this.end = groupsSize;
        this.parent = -1;
    }

    public static /* synthetic */ Anchor anchor$default(SlotReader slotReader, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = slotReader.current;
        }
        return slotReader.anchor(i4);
    }

    private final Object aux(int[] iArr, int i4) {
        return SlotTableKt.hasAux(iArr, i4) ? this.slots[SlotTableKt.auxIndex(iArr, i4)] : Composer.INSTANCE.getEmpty();
    }

    private final Object objectKey(int[] iArr, int i4) {
        if (SlotTableKt.hasObjectKey(iArr, i4)) {
            return this.slots[SlotTableKt.objectKeyIndex(iArr, i4)];
        }
        return null;
    }

    public final Anchor anchor(int index) {
        ArrayList<Anchor> anchors$runtime_release = this.table.getAnchors$runtime_release();
        int iSearch = SlotTableKt.search(anchors$runtime_release, index, this.groupsSize);
        if (iSearch < 0) {
            Anchor anchor = new Anchor(index);
            anchors$runtime_release.add(-(iSearch + 1), anchor);
            return anchor;
        }
        Anchor anchor2 = anchors$runtime_release.get(iSearch);
        Intrinsics.checkNotNullExpressionValue(anchor2, "get(location)");
        return anchor2;
    }

    public final void beginEmpty() {
        this.emptyCount++;
    }

    public final void close() {
        this.closed = true;
        this.table.close$runtime_release(this);
    }

    public final boolean containsMark(int index) {
        return SlotTableKt.containsMark(this.groups, index);
    }

    public final void endEmpty() {
        int i4 = this.emptyCount;
        if (!(i4 > 0)) {
            throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
        }
        this.emptyCount = i4 - 1;
    }

    public final void endGroup() {
        if (this.emptyCount == 0) {
            if (!(this.current == this.end)) {
                ComposerKt.composeRuntimeError("endGroup() not called at the end of a group".toString());
                throw new KotlinNothingValueException();
            }
            int iParentAnchor = SlotTableKt.parentAnchor(this.groups, this.parent);
            this.parent = iParentAnchor;
            this.end = iParentAnchor < 0 ? this.groupsSize : iParentAnchor + SlotTableKt.groupSize(this.groups, iParentAnchor);
        }
    }

    public final List<KeyInfo> extractKeys() {
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount > 0) {
            return arrayList;
        }
        int iGroupSize = this.current;
        int i4 = 0;
        while (iGroupSize < this.end) {
            arrayList.add(new KeyInfo(SlotTableKt.key(this.groups, iGroupSize), objectKey(this.groups, iGroupSize), iGroupSize, SlotTableKt.isNode(this.groups, iGroupSize) ? 1 : SlotTableKt.nodeCount(this.groups, iGroupSize), i4));
            iGroupSize += SlotTableKt.groupSize(this.groups, iGroupSize);
            i4++;
        }
        return arrayList;
    }

    public final void forEachData$runtime_release(int group, Function2<? super Integer, Object, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, group);
        int i4 = group + 1;
        int iDataAnchor = i4 < this.table.getGroupsSize() ? SlotTableKt.dataAnchor(this.table.getGroups(), i4) : this.table.getSlotsSize();
        for (int i5 = iSlotAnchor; i5 < iDataAnchor; i5++) {
            block.invoke(Integer.valueOf(i5 - iSlotAnchor), this.slots[i5]);
        }
    }

    public final Object get(int index) {
        int i4 = this.currentSlot + index;
        return i4 < this.currentSlotEnd ? this.slots[i4] : Composer.INSTANCE.getEmpty();
    }

    public final boolean getClosed() {
        return this.closed;
    }

    /* renamed from: getCurrentEnd, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* renamed from: getCurrentGroup, reason: from getter */
    public final int getCurrent() {
        return this.current;
    }

    public final Object getGroupAux() {
        int i4 = this.current;
        if (i4 < this.end) {
            return aux(this.groups, i4);
        }
        return 0;
    }

    public final int getGroupEnd() {
        return this.end;
    }

    public final int getGroupKey() {
        int i4 = this.current;
        if (i4 < this.end) {
            return SlotTableKt.key(this.groups, i4);
        }
        return 0;
    }

    public final Object getGroupNode() {
        int i4 = this.current;
        if (i4 < this.end) {
            return node(this.groups, i4);
        }
        return null;
    }

    public final Object getGroupObjectKey() {
        int i4 = this.current;
        if (i4 < this.end) {
            return objectKey(this.groups, i4);
        }
        return null;
    }

    public final int getGroupSize() {
        return SlotTableKt.groupSize(this.groups, this.current);
    }

    public final int getGroupSlotCount() {
        int i4 = this.current;
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i4);
        int i5 = i4 + 1;
        return (i5 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i5) : this.slotsSize) - iSlotAnchor;
    }

    public final int getGroupSlotIndex() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    public final boolean getInEmpty() {
        return this.emptyCount > 0;
    }

    public final int getNodeCount() {
        return SlotTableKt.nodeCount(this.groups, this.current);
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getParentNodes() {
        int i4 = this.parent;
        if (i4 >= 0) {
            return SlotTableKt.nodeCount(this.groups, i4);
        }
        return 0;
    }

    /* renamed from: getSize, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final int getSlot() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    /* renamed from: getTable$runtime_release, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    public final Object groupAux(int index) {
        return aux(this.groups, index);
    }

    public final int groupEnd(int index) {
        return index + SlotTableKt.groupSize(this.groups, index);
    }

    public final Object groupGet(int index) {
        return groupGet(this.current, index);
    }

    public final int groupKey(int index) {
        return SlotTableKt.key(this.groups, index);
    }

    public final Object groupObjectKey(int index) {
        return objectKey(this.groups, index);
    }

    public final int groupSize(int index) {
        return SlotTableKt.groupSize(this.groups, index);
    }

    public final boolean hasMark(int index) {
        return SlotTableKt.hasMark(this.groups, index);
    }

    public final boolean hasObjectKey(int index) {
        return SlotTableKt.hasObjectKey(this.groups, index);
    }

    public final boolean isGroupEnd() {
        return getInEmpty() || this.current == this.end;
    }

    public final boolean isNode() {
        return SlotTableKt.isNode(this.groups, this.current);
    }

    public final Object next() {
        int i4;
        if (this.emptyCount > 0 || (i4 = this.currentSlot) >= this.currentSlotEnd) {
            return Composer.INSTANCE.getEmpty();
        }
        Object[] objArr = this.slots;
        this.currentSlot = i4 + 1;
        return objArr[i4];
    }

    public final Object node(int index) {
        if (SlotTableKt.isNode(this.groups, index)) {
            return node(this.groups, index);
        }
        return null;
    }

    public final int nodeCount(int index) {
        return SlotTableKt.nodeCount(this.groups, index);
    }

    public final int parent(int index) {
        return SlotTableKt.parentAnchor(this.groups, index);
    }

    public final int parentOf(int index) {
        if (index >= 0 && index < this.groupsSize) {
            return SlotTableKt.parentAnchor(this.groups, index);
        }
        throw new IllegalArgumentException(("Invalid group index " + index).toString());
    }

    public final void reposition(int index) {
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeRuntimeError("Cannot reposition while in an empty region".toString());
            throw new KotlinNothingValueException();
        }
        this.current = index;
        int iParentAnchor = index < this.groupsSize ? SlotTableKt.parentAnchor(this.groups, index) : -1;
        this.parent = iParentAnchor;
        if (iParentAnchor < 0) {
            this.end = this.groupsSize;
        } else {
            this.end = iParentAnchor + SlotTableKt.groupSize(this.groups, iParentAnchor);
        }
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void restoreParent(int index) {
        int iGroupSize = SlotTableKt.groupSize(this.groups, index) + index;
        int i4 = this.current;
        if (i4 >= index && i4 <= iGroupSize) {
            this.parent = index;
            this.end = iGroupSize;
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            return;
        }
        ComposerKt.composeRuntimeError(("Index " + index + " is not a parent of " + i4).toString());
        throw new KotlinNothingValueException();
    }

    public final int skipGroup() {
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeRuntimeError("Cannot skip while in an empty region".toString());
            throw new KotlinNothingValueException();
        }
        int iNodeCount = SlotTableKt.isNode(this.groups, this.current) ? 1 : SlotTableKt.nodeCount(this.groups, this.current);
        int i4 = this.current;
        this.current = i4 + SlotTableKt.groupSize(this.groups, i4);
        return iNodeCount;
    }

    public final void skipToGroupEnd() {
        if (this.emptyCount == 0) {
            this.current = this.end;
        } else {
            ComposerKt.composeRuntimeError("Cannot skip the enclosing group while in an empty region".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void startGroup() {
        if (this.emptyCount <= 0) {
            if (!(SlotTableKt.parentAnchor(this.groups, this.current) == this.parent)) {
                throw new IllegalArgumentException("Invalid slot table detected".toString());
            }
            int i4 = this.current;
            this.parent = i4;
            this.end = i4 + SlotTableKt.groupSize(this.groups, i4);
            int i5 = this.current;
            int i6 = i5 + 1;
            this.current = i6;
            this.currentSlot = SlotTableKt.slotAnchor(this.groups, i5);
            this.currentSlotEnd = i5 >= this.groupsSize - 1 ? this.slotsSize : SlotTableKt.dataAnchor(this.groups, i6);
        }
    }

    public final void startNode() {
        if (this.emptyCount <= 0) {
            if (!SlotTableKt.isNode(this.groups, this.current)) {
                throw new IllegalArgumentException("Expected a node group".toString());
            }
            startGroup();
        }
    }

    public String toString() {
        return "SlotReader(current=" + this.current + ", key=" + getGroupKey() + ", parent=" + this.parent + ", end=" + this.end + ')';
    }

    private final Object node(int[] iArr, int i4) {
        return SlotTableKt.isNode(iArr, i4) ? this.slots[SlotTableKt.nodeIndex(iArr, i4)] : Composer.INSTANCE.getEmpty();
    }

    public final Object groupGet(int group, int index) {
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, group);
        int i4 = group + 1;
        int i5 = iSlotAnchor + index;
        return i5 < (i4 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i4) : this.slotsSize) ? this.slots[i5] : Composer.INSTANCE.getEmpty();
    }

    public final int groupKey(Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (anchor.getValid()) {
            return SlotTableKt.key(this.groups, this.table.anchorIndex(anchor));
        }
        return 0;
    }

    public final boolean isNode(int index) {
        return SlotTableKt.isNode(this.groups, index);
    }
}
