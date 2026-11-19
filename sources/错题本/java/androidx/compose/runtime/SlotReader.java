package androidx.compose.runtime;

import android.support.v4.media.AbstractC0037f;
import androidx.compose.p011ui.spatial.RectListKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b \b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\tJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\tJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\tJ\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\fJ\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\fJ\u0015\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\tJ\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u000fJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u000fJ\u001f\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\"¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\"¢\u0006\u0004\b&\u0010$J\r\u0010'\u001a\u00020\"¢\u0006\u0004\b'\u0010$J\r\u0010(\u001a\u00020\"¢\u0006\u0004\b(\u0010$J\r\u0010)\u001a\u00020\u0006¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\"¢\u0006\u0004\b+\u0010$J\u0015\u0010,\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b.\u0010-J\r\u0010/\u001a\u00020\"¢\u0006\u0004\b/\u0010$J\u0013\u00102\u001a\b\u0012\u0004\u0012\u00020100¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0017\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u00107J\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u0002082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u00109J\u001d\u0010:\u001a\u0004\u0018\u00010\u0001*\u0002082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b:\u00109J\u001d\u0010;\u001a\u0004\u0018\u00010\u0001*\u0002082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b;\u00109R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010?\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001c\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010BR6\u0010J\u001a\"\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020H\u0018\u00010Gj\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020H\u0018\u0001`I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR$\u0010M\u001a\u00020\n2\u0006\u0010L\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR$\u0010Q\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bQ\u0010B\u001a\u0004\bR\u0010*R$\u0010S\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bS\u0010B\u001a\u0004\bT\u0010*R$\u0010\b\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bU\u0010*R\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010BR\u0016\u0010Z\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010BR\u0016\u0010[\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010BR$\u0010\\\u001a\u00020\n2\u0006\u0010L\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\\\u0010N\u001a\u0004\b]\u0010PR\u0011\u0010_\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b^\u0010*R\u0011\u0010a\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b`\u0010*R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010PR\u0011\u0010\r\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bb\u0010*R\u0011\u0010c\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bc\u0010PR\u0011\u0010e\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bd\u0010PR\u0011\u0010\u0010\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bf\u0010*R\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bg\u0010*R\u0011\u0010\u0012\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bh\u0010*R\u0011\u0010j\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bi\u0010*R\u0011\u0010\u0013\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bk\u0010PR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bl\u0010!R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bm\u0010!R\u0013\u0010o\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bn\u0010!R\u0011\u0010q\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bp\u0010*R\u0011\u0010s\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\br\u0010*R\u0011\u0010u\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bt\u0010*¨\u0006v"}, m5110d2 = {"Landroidx/compose/runtime/SlotReader;", "", "Landroidx/compose/runtime/SlotTable;", "table", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "", "index", "parent", "(I)I", "", "isNode", "(I)Z", "nodeCount", "node", "(I)Ljava/lang/Object;", "groupSize", "groupEnd", "groupKey", "hasObjectKey", "groupObjectKey", "groupAux", "Landroidx/compose/runtime/Anchor;", "anchor", "(Landroidx/compose/runtime/Anchor;)I", "hasMark", "containsMark", "parentOf", "get", "groupGet", "group", "(II)Ljava/lang/Object;", "next", "()Ljava/lang/Object;", "Ld6/s;", "beginEmpty", "()V", "endEmpty", "close", "startGroup", "startNode", "skipGroup", "()I", "skipToGroupEnd", "reposition", "(I)V", "restoreParent", "endGroup", "", "Landroidx/compose/runtime/KeyInfo;", "extractKeys", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "(I)Landroidx/compose/runtime/Anchor;", "", "([II)Ljava/lang/Object;", "aux", "objectKey", "Landroidx/compose/runtime/SlotTable;", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "groups", "[I", "groupsSize", "I", "", "slots", "[Ljava/lang/Object;", "slotsSize", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "Ljava/util/HashMap;", "<set-?>", "closed", "Z", "getClosed", "()Z", "currentGroup", "getCurrentGroup", "currentEnd", "getCurrentEnd", "getParent", "Landroidx/compose/runtime/IntStack;", "currentSlotStack", "Landroidx/compose/runtime/IntStack;", "emptyCount", "currentSlot", "currentSlotEnd", "hadNext", "getHadNext", "getSize", "size", "getSlot", "slot", "getNodeCount", "isGroupEnd", "getInEmpty", "inEmpty", "getGroupSize", "getGroupEnd", "getGroupKey", "getGroupSlotIndex", "groupSlotIndex", "getHasObjectKey", "getGroupObjectKey", "getGroupAux", "getGroupNode", "groupNode", "getParentNodes", "parentNodes", "getRemainingSlots", "remainingSlots", "getGroupSlotCount", "groupSlotCount", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3963:1\n3746#2:3964\n3666#2:3965\n3666#2:3966\n3732#2:3967\n3732#2:3968\n3666#2:3969\n3726#2:3970\n3726#2:3971\n3672#2:3972\n3672#2:3973\n3726#2:3974\n3689#2:3975\n3698#2:3976\n3732#2:3977\n3746#2:3983\n3777#2:3984\n3777#2:3985\n3746#2:3991\n3777#2:3997\n3666#2:3998\n3666#2:4009\n3732#2:4010\n3746#2:4021\n3746#2:4032\n3777#2:4033\n3726#2:4034\n3666#2:4035\n3732#2:4036\n3825#2,6:4037\n3666#2:4043\n3669#2:4044\n3681#2:4045\n3672#2:4046\n33#3,5:3978\n33#3,5:3986\n33#3,5:3992\n33#3,5:3999\n4643#4,5:4004\n4643#4,5:4011\n4643#4,5:4016\n4643#4,5:4022\n4643#4,5:4027\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n*L\n873#1:3964\n877#1:3965\n880#1:3966\n887#1:3967\n890#1:3968\n893#1:3969\n924#1:3970\n928#1:3971\n938#1:3972\n941#1:3973\n962#1:3974\n965#1:3975\n971#1:3976\n975#1:3977\n985#1:3983\n994#1:3984\n1011#1:3985\n1062#1:3991\n1080#1:3997\n1087#1:3998\n1095#1:4009\n1095#1:4010\n1112#1:4021\n1140#1:4032\n1151#1:4033\n1168#1:4034\n1171#1:4035\n1171#1:4036\n1185#1:4037,6\n1188#1:4043\n1189#1:4044\n1193#1:4045\n1198#1:4046\n984#1:3978,5\n1044#1:3986,5\n1062#1:3992,5\n1087#1:3999,5\n1094#1:4004,5\n1102#1:4011,5\n1110#1:4016,5\n1125#1:4022,5\n1137#1:4027,5\n*E\n"})
/* loaded from: classes.dex */
public final class SlotReader {
    public static final int $stable = 8;
    private boolean closed;
    private int currentEnd;
    private int currentGroup;
    private int currentSlot;
    private int currentSlotEnd;

    @NotNull
    private final IntStack currentSlotStack;
    private int emptyCount;

    @NotNull
    private final int[] groups;
    private final int groupsSize;
    private boolean hadNext;
    private int parent;

    @NotNull
    private final Object[] slots;
    private final int slotsSize;

    @Nullable
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;

    @NotNull
    private final SlotTable table;

    public SlotReader(@NotNull SlotTable slotTable) {
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

    public static /* synthetic */ Anchor anchor$default(SlotReader slotReader, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = slotReader.currentGroup;
        }
        return slotReader.anchor(i);
    }

    private final Object aux(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 268435456) != 0 ? this.slots[SlotTableKt.auxIndex(iArr, i)] : Composer.INSTANCE.getEmpty();
    }

    private final Object objectKey(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & 536870912) != 0) {
            return this.slots[SlotTableKt.objectKeyIndex(iArr, i)];
        }
        return null;
    }

    @NotNull
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
            if (!(this.currentGroup == this.currentEnd)) {
                ComposerKt.composeImmediateRuntimeError("endGroup() not called at the end of a group");
            }
            int[] iArr = this.groups;
            int i = iArr[(this.parent * 5) + 2];
            this.parent = i;
            this.currentEnd = i < 0 ? this.groupsSize : SlotTableKt.groupSize(iArr, i) + i;
            int iPop = this.currentSlotStack.pop();
            if (iPop < 0) {
                this.currentSlot = 0;
                this.currentSlotEnd = 0;
            } else {
                this.currentSlot = iPop;
                this.currentSlotEnd = i >= this.groupsSize - 1 ? this.slotsSize : this.groups[((i + 1) * 5) + 4];
            }
        }
    }

    @NotNull
    public final List<KeyInfo> extractKeys() {
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount <= 0) {
            int i = 0;
            int iGroupSize = this.currentGroup;
            while (true) {
                int i8 = i;
                if (iGroupSize >= this.currentEnd) {
                    break;
                }
                int[] iArr = this.groups;
                int i9 = iGroupSize * 5;
                int i10 = iArr[i9];
                Object objObjectKey = objectKey(iArr, iGroupSize);
                int i11 = 1;
                int i12 = this.groups[i9 + 1];
                if ((1073741824 & i12) == 0) {
                    i11 = i12 & RectListKt.Lower26Bits;
                }
                i = i8 + 1;
                arrayList.add(new KeyInfo(i10, objObjectKey, iGroupSize, i11, i8));
                iGroupSize += SlotTableKt.groupSize(this.groups, iGroupSize);
            }
        }
        return arrayList;
    }

    @Nullable
    public final Object get(int index) {
        int i = this.currentSlot + index;
        return i < this.currentSlotEnd ? this.slots[i] : Composer.INSTANCE.getEmpty();
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

    @Nullable
    public final Object getGroupAux() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return aux(this.groups, i);
        }
        return 0;
    }

    public final int getGroupEnd() {
        return this.currentEnd;
    }

    public final int getGroupKey() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return this.groups[i * 5];
        }
        return 0;
    }

    @Nullable
    public final Object getGroupNode() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return node(this.groups, i);
        }
        return null;
    }

    @Nullable
    public final Object getGroupObjectKey() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return objectKey(this.groups, i);
        }
        return null;
    }

    public final int getGroupSize() {
        return SlotTableKt.groupSize(this.groups, this.currentGroup);
    }

    public final int getGroupSlotCount() {
        int i = this.currentGroup;
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, i);
        int i8 = i + 1;
        return (i8 < this.groupsSize ? this.groups[(i8 * 5) + 4] : this.slotsSize) - iSlotAnchor;
    }

    public final int getGroupSlotIndex() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    public final boolean getHadNext() {
        return this.hadNext;
    }

    public final boolean getHasObjectKey() {
        int i = this.currentGroup;
        return i < this.currentEnd && (this.groups[(i * 5) + 1] & 536870912) != 0;
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
        int i = this.parent;
        if (i >= 0) {
            return this.groups[(i * 5) + 1] & RectListKt.Lower26Bits;
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

    @NotNull
    /* renamed from: getTable$runtime_release, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    @Nullable
    public final Object groupAux(int index) {
        return aux(this.groups, index);
    }

    public final int groupEnd(int index) {
        return SlotTableKt.groupSize(this.groups, index) + index;
    }

    @Nullable
    public final Object groupGet(int index) {
        return groupGet(this.currentGroup, index);
    }

    public final int groupKey(int index) {
        return this.groups[index * 5];
    }

    @Nullable
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
        return getInEmpty() || this.currentGroup == this.currentEnd;
    }

    public final boolean isNode() {
        return (this.groups[(this.currentGroup * 5) + 1] & BasicMeasure.EXACTLY) != 0;
    }

    @Nullable
    public final Object next() {
        int i;
        if (this.emptyCount > 0 || (i = this.currentSlot) >= this.currentSlotEnd) {
            this.hadNext = false;
            return Composer.INSTANCE.getEmpty();
        }
        this.hadNext = true;
        Object[] objArr = this.slots;
        this.currentSlot = i + 1;
        return objArr[i];
    }

    @Nullable
    public final Object node(int index) {
        int[] iArr = this.groups;
        if ((iArr[(index * 5) + 1] & BasicMeasure.EXACTLY) != 0) {
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
        this.currentGroup = index;
        int i = this.groupsSize;
        int i8 = index < i ? this.groups[(index * 5) + 2] : -1;
        this.parent = i8;
        if (i8 < 0) {
            this.currentEnd = i;
        } else {
            this.currentEnd = SlotTableKt.groupSize(this.groups, i8) + i8;
        }
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void restoreParent(int index) {
        int iGroupSize = SlotTableKt.groupSize(this.groups, index) + index;
        int i = this.currentGroup;
        if (!(i >= index && i <= iGroupSize)) {
            ComposerKt.composeImmediateRuntimeError("Index " + index + " is not a parent of " + i);
        }
        this.parent = index;
        this.currentEnd = iGroupSize;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final int skipGroup() {
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot skip while in an empty region");
        }
        int[] iArr = this.groups;
        int i = this.currentGroup;
        int i8 = (iArr[(i * 5) + 1] & BasicMeasure.EXACTLY) == 0 ? iArr[(i * 5) + 1] & RectListKt.Lower26Bits : 1;
        this.currentGroup = SlotTableKt.groupSize(iArr, i) + i;
        return i8;
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
            int i = this.parent;
            int i8 = this.currentGroup;
            if (!(this.groups[(i8 * 5) + 2] == i)) {
                PreconditionsKt.throwIllegalArgumentException("Invalid slot table detected");
            }
            HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
            if (map != null && (groupSourceInformation = map.get(anchor(i))) != null) {
                groupSourceInformation.reportGroup(this.table, i8);
            }
            IntStack intStack = this.currentSlotStack;
            int i9 = this.currentSlot;
            int i10 = this.currentSlotEnd;
            if (i9 == 0 && i10 == 0) {
                intStack.push(-1);
            } else {
                intStack.push(i9);
            }
            this.parent = i8;
            this.currentEnd = SlotTableKt.groupSize(this.groups, i8) + i8;
            int i11 = i8 + 1;
            this.currentGroup = i11;
            this.currentSlot = SlotTableKt.slotAnchor(this.groups, i8);
            this.currentSlotEnd = i8 >= this.groupsSize - 1 ? this.slotsSize : this.groups[(i11 * 5) + 4];
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

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.currentGroup);
        sb.append(", key=");
        sb.append(getGroupKey());
        sb.append(", parent=");
        sb.append(this.parent);
        sb.append(", end=");
        return AbstractC0037f.m88m(sb, this.currentEnd, ')');
    }

    @Nullable
    public final Object groupGet(int group, int index) {
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, group);
        int i = group + 1;
        int i8 = iSlotAnchor + index;
        return i8 < (i < this.groupsSize ? this.groups[(i * 5) + 4] : this.slotsSize) ? this.slots[i8] : Composer.INSTANCE.getEmpty();
    }

    public final int groupKey(@NotNull Anchor anchor) {
        if (anchor.getValid()) {
            return this.groups[this.table.anchorIndex(anchor) * 5];
        }
        return 0;
    }

    public final boolean isNode(int index) {
        return (this.groups[(index * 5) + 1] & BasicMeasure.EXACTLY) != 0;
    }

    private final Object node(int[] iArr, int i) {
        int i8 = i * 5;
        if ((iArr[i8 + 1] & BasicMeasure.EXACTLY) != 0) {
            return this.slots[iArr[i8 + 4]];
        }
        return Composer.INSTANCE.getEmpty();
    }
}
