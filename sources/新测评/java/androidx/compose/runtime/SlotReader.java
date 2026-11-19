package androidx.compose.runtime;

import androidx.compose.p013ui.spatial.RectListKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0015\n\u0002\b\u0016\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010H\u001a\u00020C2\b\b\u0002\u0010I\u001a\u00020\nJ\u0006\u0010J\u001a\u00020KJ\u0006\u0010L\u001a\u00020KJ\u000e\u0010M\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\nJ\u0006\u0010N\u001a\u00020KJ\u0006\u0010O\u001a\u00020KJ\f\u0010P\u001a\b\u0012\u0004\u0012\u00020R0QJ\u0010\u0010S\u001a\u0004\u0018\u00010\u00012\u0006\u0010I\u001a\u00020\nJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010I\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nJ\u0010\u0010T\u001a\u0004\u0018\u00010\u00012\u0006\u0010I\u001a\u00020\nJ\u0018\u0010T\u001a\u0004\u0018\u00010\u00012\u0006\u0010U\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nJ\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010H\u001a\u00020CJ\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0006\u0010I\u001a\u00020\nJ\u000e\u0010 \u001a\u00020\n2\u0006\u0010I\u001a\u00020\nJ\u000e\u0010V\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\nJ\u000e\u0010+\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\nJ\u000e\u00100\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\nJ\b\u0010W\u001a\u0004\u0018\u00010\u0001J\u0010\u0010X\u001a\u0004\u0018\u00010\u00012\u0006\u0010I\u001a\u00020\nJ\u000e\u00101\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nJ\u000e\u00103\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nJ\u000e\u0010Y\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nJ\u000e\u0010Z\u001a\u00020K2\u0006\u0010I\u001a\u00020\nJ\u000e\u0010[\u001a\u00020K2\u0006\u0010I\u001a\u00020\nJ\u0006\u0010\\\u001a\u00020\nJ\u0006\u0010]\u001a\u00020KJ\u0006\u0010^\u001a\u00020KJ\u0006\u0010_\u001a\u00020KJ\b\u0010`\u001a\u00020aH\u0016J\u0016\u0010b\u001a\u0004\u0018\u00010\u0001*\u00020'2\u0006\u0010I\u001a\u00020\nH\u0002J\u0016\u0010X\u001a\u0004\u0018\u00010\u0001*\u00020'2\u0006\u0010I\u001a\u00020\nH\u0002J\u0016\u0010c\u001a\u0004\u0018\u00010\u0001*\u00020'2\u0006\u0010I\u001a\u00020\nH\u0002R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\rR\u0011\u0010\u001a\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\rR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010 \u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b!\u0010\rR\u0011\u0010\"\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b#\u0010\rR\u0011\u0010$\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b%\u0010\rR\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010)\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\tR\u0011\u0010+\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b,\u0010\tR\u0011\u0010-\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b.\u0010\tR\u0011\u0010/\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b/\u0010\tR\u0011\u00100\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b0\u0010\tR\u0011\u00101\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b2\u0010\rR\u001e\u00103\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\rR\u0011\u00105\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b6\u0010\rR\u0011\u00107\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b8\u0010\rR\u0011\u00109\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b:\u0010\rR\u0011\u0010;\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b<\u0010\rR\u0018\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010>X\u0082\u0004¢\u0006\u0004\n\u0002\u0010?R\u000e\u0010@\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010A\u001a\"\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D\u0018\u00010Bj\u0010\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D\u0018\u0001`EX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010G¨\u0006d"}, m13558d2 = {"Landroidx/compose/runtime/SlotReader;", "", "table", "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "<set-?>", "", "closed", "getClosed", "()Z", "", "currentEnd", "getCurrentEnd", "()I", "currentGroup", "getCurrentGroup", "currentSlot", "currentSlotEnd", "currentSlotStack", "Landroidx/compose/runtime/IntStack;", "emptyCount", "groupAux", "getGroupAux", "()Ljava/lang/Object;", "groupEnd", "getGroupEnd", "groupKey", "getGroupKey", "groupNode", "getGroupNode", "groupObjectKey", "getGroupObjectKey", "groupSize", "getGroupSize", "groupSlotCount", "getGroupSlotCount", "groupSlotIndex", "getGroupSlotIndex", "groups", "", "groupsSize", "hadNext", "getHadNext", "hasObjectKey", "getHasObjectKey", "inEmpty", "getInEmpty", "isGroupEnd", "isNode", "nodeCount", "getNodeCount", "parent", "getParent", "parentNodes", "getParentNodes", "remainingSlots", "getRemainingSlots", "size", "getSize", "slot", "getSlot", "slots", "", "[Ljava/lang/Object;", "slotsSize", "sourceInformationMap", "Ljava/util/HashMap;", "Landroidx/compose/runtime/Anchor;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "anchor", "index", "beginEmpty", "", "close", "containsMark", "endEmpty", "endGroup", "extractKeys", "", "Landroidx/compose/runtime/KeyInfo;", "get", "groupGet", "group", "hasMark", "next", "node", "parentOf", "reposition", "restoreParent", "skipGroup", "skipToGroupEnd", "startGroup", "startNode", "toString", "", "aux", "objectKey", "runtime_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3963:1\n3746#2:3964\n3666#2:3965\n3666#2:3966\n3732#2:3967\n3732#2:3968\n3666#2:3969\n3726#2:3970\n3726#2:3971\n3672#2:3972\n3672#2:3973\n3726#2:3974\n3689#2:3975\n3698#2:3976\n3732#2:3977\n3746#2:3983\n3777#2:3984\n3777#2:3985\n3746#2:3991\n3777#2:3997\n3666#2:3998\n3666#2:4009\n3732#2:4010\n3746#2:4021\n3746#2:4032\n3777#2:4033\n3726#2:4034\n3666#2:4035\n3732#2:4036\n3825#2,6:4037\n3666#2:4043\n3669#2:4044\n3681#2:4045\n3672#2:4046\n33#3,5:3978\n33#3,5:3986\n33#3,5:3992\n33#3,5:3999\n4643#4,5:4004\n4643#4,5:4011\n4643#4,5:4016\n4643#4,5:4022\n4643#4,5:4027\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n*L\n873#1:3964\n877#1:3965\n880#1:3966\n887#1:3967\n890#1:3968\n893#1:3969\n924#1:3970\n928#1:3971\n938#1:3972\n941#1:3973\n962#1:3974\n965#1:3975\n971#1:3976\n975#1:3977\n985#1:3983\n994#1:3984\n1011#1:3985\n1062#1:3991\n1080#1:3997\n1087#1:3998\n1095#1:4009\n1095#1:4010\n1112#1:4021\n1140#1:4032\n1151#1:4033\n1168#1:4034\n1171#1:4035\n1171#1:4036\n1185#1:4037,6\n1188#1:4043\n1189#1:4044\n1193#1:4045\n1198#1:4046\n984#1:3978,5\n1044#1:3986,5\n1062#1:3992,5\n1087#1:3999,5\n1094#1:4004,5\n1102#1:4011,5\n1110#1:4016,5\n1125#1:4022,5\n1137#1:4027,5\n*E\n"})
/* loaded from: classes2.dex */
public final class SlotReader {
    public static final int $stable = 8;
    private boolean closed;

    /* renamed from: currentEnd, reason: from kotlin metadata and from toString */
    private int end;

    /* renamed from: currentGroup, reason: from kotlin metadata and from toString */
    private int current;
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
        this.end = groupsSize;
        this.parent = -1;
        this.currentSlotStack = new IntStack();
    }

    public static /* synthetic */ Anchor anchor$default(SlotReader slotReader, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = slotReader.current;
        }
        return slotReader.anchor(i10);
    }

    private final Object aux(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 268435456) != 0 ? this.slots[SlotTableKt.auxIndex(iArr, i10)] : Composer.INSTANCE.getEmpty();
    }

    private final Object objectKey(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 536870912) != 0) {
            return this.slots[SlotTableKt.objectKeyIndex(iArr, i10)];
        }
        return null;
    }

    public final Anchor anchor(int index) {
        ArrayList<Anchor> anchors$runtime_release = this.table.getAnchors$runtime_release();
        int iSearch = SlotTableKt.search(anchors$runtime_release, index, this.groupsSize);
        if (iSearch >= 0) {
            return anchors$runtime_release.get(iSearch);
        }
        Anchor anchor = new Anchor(index);
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

    public final boolean containsMark(int index) {
        return (this.groups[(index * 5) + 1] & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0;
    }

    public final void endEmpty() {
        if (!(this.emptyCount > 0)) {
            PreconditionsKt.throwIllegalArgumentException("Unbalanced begin/end empty");
        }
        this.emptyCount--;
    }

    public final void endGroup() {
        if (this.emptyCount == 0) {
            if (!(this.current == this.end)) {
                ComposerKt.composeImmediateRuntimeError("endGroup() not called at the end of a group");
            }
            int[] iArr = this.groups;
            int i10 = iArr[(this.parent * 5) + 2];
            this.parent = i10;
            this.end = i10 < 0 ? this.groupsSize : SlotTableKt.groupSize(iArr, i10) + i10;
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
            int iGroupSize = this.current;
            while (true) {
                int i11 = i10;
                if (iGroupSize >= this.end) {
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

    public final Object get(int index) {
        int i10 = this.currentSlot + index;
        return i10 < this.currentSlotEnd ? this.slots[i10] : Composer.INSTANCE.getEmpty();
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
        int i10 = this.current;
        if (i10 < this.end) {
            return aux(this.groups, i10);
        }
        return 0;
    }

    public final int getGroupEnd() {
        return this.end;
    }

    public final int getGroupKey() {
        int i10 = this.current;
        if (i10 < this.end) {
            return this.groups[i10 * 5];
        }
        return 0;
    }

    public final Object getGroupNode() {
        int i10 = this.current;
        if (i10 < this.end) {
            return node(this.groups, i10);
        }
        return null;
    }

    public final Object getGroupObjectKey() {
        int i10 = this.current;
        if (i10 < this.end) {
            return objectKey(this.groups, i10);
        }
        return null;
    }

    public final int getGroupSize() {
        return SlotTableKt.groupSize(this.groups, this.current);
    }

    public final int getGroupSlotCount() {
        int i10 = this.current;
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
        int i10 = this.current;
        return i10 < this.end && (this.groups[(i10 * 5) + 1] & 536870912) != 0;
    }

    public final boolean getInEmpty() {
        return this.emptyCount > 0;
    }

    public final int getNodeCount() {
        return this.groups[(this.current * 5) + 1] & RectListKt.Lower26Bits;
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
        return this.groups[index * 5];
    }

    public final Object groupObjectKey(int index) {
        return objectKey(this.groups, index);
    }

    public final int groupSize(int index) {
        return SlotTableKt.groupSize(this.groups, index);
    }

    public final boolean hasMark(int index) {
        return (this.groups[(index * 5) + 1] & 134217728) != 0;
    }

    public final boolean hasObjectKey(int index) {
        return (this.groups[(index * 5) + 1] & 536870912) != 0;
    }

    public final boolean isGroupEnd() {
        return getInEmpty() || this.current == this.end;
    }

    public final boolean isNode() {
        return (this.groups[(this.current * 5) + 1] & 1073741824) != 0;
    }

    public final Object next() {
        int i10;
        if (this.emptyCount > 0 || (i10 = this.currentSlot) >= this.currentSlotEnd) {
            this.hadNext = false;
            return Composer.INSTANCE.getEmpty();
        }
        this.hadNext = true;
        Object[] objArr = this.slots;
        this.currentSlot = i10 + 1;
        return objArr[i10];
    }

    public final Object node(int index) {
        int[] iArr = this.groups;
        if ((iArr[(index * 5) + 1] & 1073741824) != 0) {
            return node(iArr, index);
        }
        return null;
    }

    public final int nodeCount(int index) {
        return this.groups[(index * 5) + 1] & RectListKt.Lower26Bits;
    }

    public final int parent(int index) {
        return this.groups[(index * 5) + 2];
    }

    public final int parentOf(int index) {
        if (!(index >= 0 && index < this.groupsSize)) {
            PreconditionsKt.throwIllegalArgumentException("Invalid group index " + index);
        }
        return this.groups[(index * 5) + 2];
    }

    public final void reposition(int index) {
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot reposition while in an empty region");
        }
        this.current = index;
        int i10 = this.groupsSize;
        int i11 = index < i10 ? this.groups[(index * 5) + 2] : -1;
        this.parent = i11;
        if (i11 < 0) {
            this.end = i10;
        } else {
            this.end = i11 + SlotTableKt.groupSize(this.groups, i11);
        }
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void restoreParent(int index) {
        int iGroupSize = SlotTableKt.groupSize(this.groups, index) + index;
        int i10 = this.current;
        if (!(i10 >= index && i10 <= iGroupSize)) {
            ComposerKt.composeImmediateRuntimeError("Index " + index + " is not a parent of " + i10);
        }
        this.parent = index;
        this.end = iGroupSize;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final int skipGroup() {
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot skip while in an empty region");
        }
        int[] iArr = this.groups;
        int i10 = this.current;
        int i11 = (iArr[(i10 * 5) + 1] & 1073741824) == 0 ? iArr[(i10 * 5) + 1] & RectListKt.Lower26Bits : 1;
        this.current = i10 + SlotTableKt.groupSize(iArr, i10);
        return i11;
    }

    public final void skipToGroupEnd() {
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot skip the enclosing group while in an empty region");
        }
        this.current = this.end;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void startGroup() {
        GroupSourceInformation groupSourceInformation;
        if (this.emptyCount <= 0) {
            int i10 = this.parent;
            int i11 = this.current;
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
            this.end = SlotTableKt.groupSize(this.groups, i11) + i11;
            int i14 = i11 + 1;
            this.current = i14;
            this.currentSlot = SlotTableKt.slotAnchor(this.groups, i11);
            this.currentSlotEnd = i11 >= this.groupsSize - 1 ? this.slotsSize : this.groups[(i14 * 5) + 4];
        }
    }

    public final void startNode() {
        if (this.emptyCount <= 0) {
            if (!((this.groups[(this.current * 5) + 1] & 1073741824) != 0)) {
                PreconditionsKt.throwIllegalArgumentException("Expected a node group");
            }
            startGroup();
        }
    }

    public String toString() {
        return "SlotReader(current=" + this.current + ", key=" + getGroupKey() + ", parent=" + this.parent + ", end=" + this.end + ')';
    }

    public final Object groupGet(int group, int index) {
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, group);
        int i10 = group + 1;
        int i11 = iSlotAnchor + index;
        return i11 < (i10 < this.groupsSize ? this.groups[(i10 * 5) + 4] : this.slotsSize) ? this.slots[i11] : Composer.INSTANCE.getEmpty();
    }

    public final int groupKey(Anchor anchor) {
        if (anchor.getValid()) {
            return this.groups[this.table.anchorIndex(anchor) * 5];
        }
        return 0;
    }

    public final boolean isNode(int index) {
        return (this.groups[(index * 5) + 1] & 1073741824) != 0;
    }

    private final Object node(int[] iArr, int i10) {
        int i11 = i10 * 5;
        if ((iArr[i11 + 1] & 1073741824) != 0) {
            return this.slots[iArr[i11 + 4]];
        }
        return Composer.INSTANCE.getEmpty();
    }
}
