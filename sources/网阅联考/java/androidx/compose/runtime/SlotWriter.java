package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(m5174d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u001f\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\b8\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u009d\u00012\u00020\u0001:\u0002\u009d\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\n2\u0006\u00104\u001a\u00020\nJ\u000e\u00105\u001a\u0002022\u0006\u00104\u001a\u00020\nJ\u0010\u00106\u001a\u00020\u00072\b\b\u0002\u00107\u001a\u00020\nJ\u000e\u00108\u001a\u00020\n2\u0006\u00106\u001a\u00020\u0007J\r\u00109\u001a\u000202H\u0000¢\u0006\u0002\b:J\u0006\u0010;\u001a\u000202J\u0010\u0010<\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\nH\u0002J\u0006\u0010>\u001a\u000202J\u0010\u0010?\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\nH\u0002J\u0010\u0010@\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\nH\u0002J \u0010A\u001a\u00020\n2\u0006\u00106\u001a\u00020\n2\u0006\u0010B\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010C\u001a\u00020\n2\u0006\u00107\u001a\u00020\nH\u0002J\u0010\u0010D\u001a\u00020\n2\u0006\u0010C\u001a\u00020\nH\u0002J(\u0010E\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u0010F\u001a\u00020\n2\u0006\u0010B\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010G\u001a\u00020\nJ\u0006\u0010H\u001a\u000202J\u000e\u0010I\u001a\u0002022\u0006\u00106\u001a\u00020\u0007J\u000e\u0010I\u001a\u0002022\u0006\u00107\u001a\u00020\nJ \u0010J\u001a\u0002022\u0006\u0010\"\u001a\u00020\n2\u0006\u0010G\u001a\u00020\n2\u0006\u0010K\u001a\u00020\nH\u0002J\u0010\u0010L\u001a\u0004\u0018\u00010\u00012\u0006\u00107\u001a\u00020\nJ\u0010\u0010M\u001a\u00020\n2\u0006\u00107\u001a\u00020\nH\u0002J\u000e\u0010N\u001a\u00020\n2\u0006\u00107\u001a\u00020\nJ\u0010\u0010O\u001a\u0004\u0018\u00010\u00012\u0006\u00107\u001a\u00020\nJ\u000e\u0010P\u001a\u00020\n2\u0006\u00107\u001a\u00020\nJ\u000e\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010RJ\u0006\u0010S\u001a\u00020TJ\u000e\u0010U\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\nJ\u0016\u0010V\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\n2\u0006\u0010=\u001a\u00020\nJ\u000e\u0010W\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\nJ\u0010\u0010X\u001a\u0002022\b\u0010Y\u001a\u0004\u0018\u00010\u0001J\u0010\u0010Z\u001a\u0002022\u0006\u0010&\u001a\u00020\nH\u0002J\u000e\u0010[\u001a\u0002022\u0006\u0010\\\u001a\u00020\nJ\u0018\u0010]\u001a\u0002022\u0006\u0010&\u001a\u00020\n2\u0006\u0010=\u001a\u00020\nH\u0002J\u000e\u0010\u001f\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\nJ\u000e\u0010^\u001a\b\u0012\u0004\u0012\u00020\n0_H\u0002J\u0010\u0010`\u001a\u0002022\b\b\u0002\u0010=\u001a\u00020\nJ \u0010a\u001a\u0002022\u0006\u0010b\u001a\u00020\n2\u0006\u0010c\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nH\u0002J\u001c\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00070_2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00107\u001a\u00020\nJ\u000e\u0010e\u001a\u0002022\u0006\u0010f\u001a\u00020\nJ\u0010\u0010g\u001a\u0002022\u0006\u00107\u001a\u00020\nH\u0002J$\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00070_2\u0006\u0010f\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00107\u001a\u00020\nJ\u0018\u0010i\u001a\u0002022\u0006\u00107\u001a\u00020\n2\u0006\u0010=\u001a\u00020\nH\u0002J$\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00070_2\u0006\u00106\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\n2\u0006\u0010k\u001a\u00020\u0000J\u0010\u0010l\u001a\u0004\u0018\u00010\u00012\u0006\u00106\u001a\u00020\u0007J\u0010\u0010l\u001a\u0004\u0018\u00010\u00012\u0006\u00107\u001a\u00020\nJ\u000e\u0010 \u001a\u00020\n2\u0006\u00107\u001a\u00020\nJ\u000e\u0010\"\u001a\u00020\n2\u0006\u00106\u001a\u00020\u0007J\u000e\u0010\"\u001a\u00020\n2\u0006\u00107\u001a\u00020\nJ\u0010\u0010m\u001a\u00020\n2\u0006\u00107\u001a\u00020\nH\u0002J\u0018\u0010n\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u0010F\u001a\u00020\nH\u0002J\b\u0010o\u001a\u000202H\u0002J\u0018\u0010p\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nH\u0002J\u0006\u0010q\u001a\u00020\u000eJ\u0018\u0010r\u001a\u00020\u000e2\u0006\u0010s\u001a\u00020\n2\u0006\u0010t\u001a\u00020\nH\u0002J \u0010u\u001a\u0002022\u0006\u0010s\u001a\u00020\n2\u0006\u0010t\u001a\u00020\n2\u0006\u0010=\u001a\u00020\nH\u0002J\u0006\u0010v\u001a\u000202J\b\u0010w\u001a\u00020\nH\u0002J\b\u0010x\u001a\u000202H\u0002J\u000e\u0010y\u001a\u0002022\u0006\u00106\u001a\u00020\u0007J\u0010\u0010z\u001a\u0002022\b\u0010Y\u001a\u0004\u0018\u00010\u0001J\u001a\u0010z\u001a\u0004\u0018\u00010\u00012\u0006\u00107\u001a\u00020\n2\b\u0010Y\u001a\u0004\u0018\u00010\u0001J\b\u0010{\u001a\u0004\u0018\u00010\u0001J\u0006\u0010|\u001a\u00020\nJ\u0006\u0010}\u001a\u000202J\u0018\u0010~\u001a\u0004\u0018\u00010\u00012\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\nJ\u0018\u0010~\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u007f\u001a\u00020\n2\u0006\u00107\u001a\u00020\nJ\u001a\u0010\u0080\u0001\u001a\u0002022\u0006\u0010\\\u001a\u00020\n2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0001J%\u0010\u0080\u0001\u001a\u0002022\u0006\u0010\\\u001a\u00020\n2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00012\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0001J\u0007\u0010\u0083\u0001\u001a\u000202J\u000f\u0010\u0083\u0001\u001a\u0002022\u0006\u0010\\\u001a\u00020\nJ\u001a\u0010\u0083\u0001\u001a\u0002022\u0006\u0010\\\u001a\u00020\n2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0001J/\u0010\u0083\u0001\u001a\u0002022\u0006\u0010\\\u001a\u00020\n2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001f\u001a\u00020\u000e2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0001H\u0002J\u001a\u0010\u0085\u0001\u001a\u0002022\u0006\u0010\\\u001a\u00020\n2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0001J$\u0010\u0085\u0001\u001a\u0002022\u0006\u0010\\\u001a\u00020\n2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010l\u001a\u0004\u0018\u00010\u0001J\t\u0010\u0086\u0001\u001a\u00020TH\u0016J\u0013\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010Y\u001a\u0004\u0018\u00010\u0001J\u001b\u0010\u0088\u0001\u001a\u0002022\u0007\u0010\u0089\u0001\u001a\u00020\n2\u0007\u0010\u008a\u0001\u001a\u00020\nH\u0002J\u0011\u0010\u008b\u0001\u001a\u0002022\b\u0010Y\u001a\u0004\u0018\u00010\u0001J\u0011\u0010\u008c\u0001\u001a\u0002022\u0006\u0010=\u001a\u00020\nH\u0002J\u0019\u0010\u008d\u0001\u001a\u0002022\u0006\u0010=\u001a\u00020\n2\u0006\u0010z\u001a\u00020%H\u0002J\u0019\u0010\u008e\u0001\u001a\u0002022\u0006\u00106\u001a\u00020\u00072\b\u0010Y\u001a\u0004\u0018\u00010\u0001J\u0011\u0010\u008e\u0001\u001a\u0002022\b\u0010Y\u001a\u0004\u0018\u00010\u0001J\u001b\u0010\u008f\u0001\u001a\u0002022\u0006\u00107\u001a\u00020\n2\b\u0010Y\u001a\u0004\u0018\u00010\u0001H\u0002J\u0011\u0010\u0090\u0001\u001a\u0002022\b\u0010Y\u001a\u0004\u0018\u00010\u0001J\u000f\u0010\u0091\u0001\u001a\u000202H\u0000¢\u0006\u0003\b\u0092\u0001J\u000f\u0010\u0093\u0001\u001a\u000202H\u0000¢\u0006\u0003\b\u0094\u0001J\u0015\u0010\u0095\u0001\u001a\u00020\n*\u00020\u001c2\u0006\u00103\u001a\u00020\nH\u0002J\u0014\u0010C\u001a\u00020\n*\u00020\u001c2\u0006\u00103\u001a\u00020\nH\u0002J\u0013\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020\n0_*\u00020\u001cH\u0002J\u001b\u0010\u0097\u0001\u001a\u000202*\b0\u0098\u0001j\u0003`\u0099\u00012\u0006\u00107\u001a\u00020\nH\u0002J\u0015\u0010\u009a\u0001\u001a\u00020\n*\u00020\u001c2\u0006\u00103\u001a\u00020\nH\u0002J\u0014\u0010\"\u001a\u00020\n*\u00020\u001c2\u0006\u00107\u001a\u00020\nH\u0002J\u0015\u0010\u009b\u0001\u001a\u00020\n*\u00020\u001c2\u0006\u00103\u001a\u00020\nH\u0002J\u001d\u0010\u009c\u0001\u001a\u000202*\u00020\u001c2\u0006\u00103\u001a\u00020\n2\u0006\u0010C\u001a\u00020\nH\u0002R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011R\u0011\u0010\u001f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011R\u000e\u0010 \u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\fR\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\fR\u0018\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010)X\u0082\u000e¢\u0006\u0004\n\u0002\u0010*R\u000e\u0010+\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006\u009e\u0001"}, m5175d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "table", "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "anchors", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", "capacity", "", "getCapacity", "()I", "<set-?>", "", "closed", "getClosed", "()Z", "currentGroup", "getCurrentGroup", "currentGroupEnd", "currentSlot", "currentSlotEnd", "endStack", "Landroidx/compose/runtime/IntStack;", "groupGapLen", "groupGapStart", "groups", "", "insertCount", "isGroupEnd", "isNode", "nodeCount", "nodeCountStack", "parent", "getParent", "pendingRecalculateMarks", "Landroidx/compose/runtime/PrioritySet;", "size", "getSize$runtime_release", "slots", "", "[Ljava/lang/Object;", "slotsGapLen", "slotsGapOwner", "slotsGapStart", "startStack", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "addToGroupSizeAlongSpine", "", "address", "amount", "advanceBy", "anchor", "index", "anchorIndex", "bashGroup", "bashGroup$runtime_release", "beginInsert", "childContainsAnyMarks", "group", "close", "containsAnyGroupMarks", "containsGroupMark", "dataAnchorToDataIndex", "gapLen", "dataIndex", "dataIndexToDataAddress", "dataIndexToDataAnchor", "gapStart", "endGroup", "endInsert", "ensureStarted", "fixParentAnchorsFor", "firstChild", "groupAux", "groupIndexToAddress", "groupKey", "groupObjectKey", "groupSize", "groupSlots", "", "groupsAsString", "", "indexInCurrentGroup", "indexInGroup", "indexInParent", "insertAux", "value", "insertGroups", "insertParentGroup", "key", "insertSlots", "keys", "", "markGroup", "moveAnchors", "originalLocation", "newLocation", "moveFrom", "moveGroup", "offset", "moveGroupGapTo", "moveIntoGroupFrom", "moveSlotGapTo", "moveTo", "writer", "node", "parentAnchorToIndex", "parentIndexToAnchor", "recalculateMarks", "removeAnchors", "removeGroup", "removeGroups", "start", "len", "removeSlots", "reset", "restoreCurrentGroupEnd", "saveCurrentGroupEnd", "seek", "set", "skip", "skipGroup", "skipToGroupEnd", "slot", "groupIndex", "startData", "aux", "objectKey", "startGroup", "dataKey", "startNode", "toString", "update", "updateAnchors", "previousGapStart", "newGapStart", "updateAux", "updateContainsMark", "updateContainsMarkNow", "updateNode", "updateNodeOfGroup", "updateParentNode", "verifyDataAnchors", "verifyDataAnchors$runtime_release", "verifyParentAnchors", "verifyParentAnchors$runtime_release", "auxIndex", "dataIndexes", "groupAsString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "nodeIndex", "slotIndex", "updateDataIndex", "Companion", "runtime_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 6 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3443:1\n4492#2,5:3444\n4492#2,5:3449\n4492#2,5:3454\n4492#2,5:3459\n4492#2,5:3465\n4492#2,5:3470\n4492#2,5:3475\n4492#2,5:3480\n4492#2,5:3485\n4492#2,5:3490\n4492#2,5:3495\n4492#2,5:3500\n4492#2,5:3505\n4492#2,5:3510\n4492#2,5:3515\n4492#2,5:3520\n4492#2,5:3525\n4492#2,5:3530\n4492#2,5:3543\n4492#2,5:3562\n4492#2,5:3567\n4492#2,5:3572\n1#3:3464\n162#4,8:3535\n162#4,8:3548\n3323#5,6:3556\n33#6,6:3577\n82#6,3:3583\n33#6,4:3586\n85#6,2:3590\n38#6:3592\n87#6:3593\n231#6,3:3594\n64#6,4:3597\n234#6,2:3601\n69#6:3603\n236#6:3604\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n1346#1:3444,5\n1370#1:3449,5\n1383#1:3454,5\n1386#1:3459,5\n1426#1:3465,5\n1441#1:3470,5\n1488#1:3475,5\n1493#1:3480,5\n1533#1:3485,5\n1544#1:3490,5\n1671#1:3495,5\n1747#1:3500,5\n1752#1:3505,5\n1784#1:3510,5\n1827#1:3515,5\n1828#1:3520,5\n1841#1:3525,5\n1935#1:3530,5\n2210#1:3543,5\n2500#1:3562,5\n2512#1:3567,5\n2703#1:3572,5\n2193#1:3535,8\n2282#1:3548,8\n2302#1:3556,6\n2799#1:3577,6\n2969#1:3583,3\n2969#1:3586,4\n2969#1:3590,2\n2969#1:3592\n2969#1:3593\n2972#1:3594,3\n2972#1:3597,4\n2972#1:3601,2\n2972#1:3603\n2972#1:3604\n*E\n"})
/* loaded from: classes.dex */
public final class SlotWriter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private ArrayList<Anchor> anchors;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;
    private final IntStack endStack;
    private int groupGapLen;
    private int groupGapStart;
    private int[] groups;
    private int insertCount;
    private int nodeCount;
    private final IntStack nodeCountStack;
    private int parent;
    private PrioritySet pendingRecalculateMarks;
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;
    private final IntStack startStack;
    private final SlotTable table;

    @Metadata(m5174d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¨\u0006\u000e"}, m5175d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "()V", "moveGroup", "", "Landroidx/compose/runtime/Anchor;", "fromWriter", "Landroidx/compose/runtime/SlotWriter;", "fromIndex", "", "toWriter", "updateFromCursor", "", "updateToCursor", "runtime_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,3443:1\n1#2:3444\n4492#3,5:3445\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n*L\n2089#1:3445,5\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Anchor> moveGroup(SlotWriter fromWriter, int fromIndex, SlotWriter toWriter, boolean updateFromCursor, boolean updateToCursor) {
            List<Anchor> listEmptyList;
            boolean zRemoveGroup;
            int i4;
            int iGroupSize = fromWriter.groupSize(fromIndex);
            int i5 = fromIndex + iGroupSize;
            int iDataIndex = fromWriter.dataIndex(fromIndex);
            int iDataIndex2 = fromWriter.dataIndex(i5);
            int i6 = iDataIndex2 - iDataIndex;
            boolean zContainsAnyGroupMarks = fromWriter.containsAnyGroupMarks(fromIndex);
            toWriter.insertGroups(iGroupSize);
            toWriter.insertSlots(i6, toWriter.getCurrentGroup());
            if (fromWriter.groupGapStart < i5) {
                fromWriter.moveGroupGapTo(i5);
            }
            if (fromWriter.slotsGapStart < iDataIndex2) {
                fromWriter.moveSlotGapTo(iDataIndex2, i5);
            }
            int[] iArr = toWriter.groups;
            int currentGroup = toWriter.getCurrentGroup();
            ArraysKt___ArraysJvmKt.copyInto(fromWriter.groups, iArr, currentGroup * 5, fromIndex * 5, i5 * 5);
            Object[] objArr = toWriter.slots;
            int i7 = toWriter.currentSlot;
            ArraysKt___ArraysJvmKt.copyInto(fromWriter.slots, objArr, i7, iDataIndex, iDataIndex2);
            int parent = toWriter.getParent();
            SlotTableKt.updateParentAnchor(iArr, currentGroup, parent);
            int i8 = currentGroup - fromIndex;
            int i9 = currentGroup + iGroupSize;
            int iDataIndex3 = i7 - toWriter.dataIndex(iArr, currentGroup);
            int i10 = toWriter.slotsGapOwner;
            int i11 = toWriter.slotsGapLen;
            int length = objArr.length;
            int i12 = i10;
            int i13 = currentGroup;
            while (true) {
                if (i13 >= i9) {
                    break;
                }
                if (i13 != currentGroup) {
                    i4 = i9;
                    SlotTableKt.updateParentAnchor(iArr, i13, SlotTableKt.parentAnchor(iArr, i13) + i8);
                } else {
                    i4 = i9;
                }
                int i14 = iDataIndex3;
                SlotTableKt.updateDataAnchor(iArr, i13, toWriter.dataIndexToDataAnchor(toWriter.dataIndex(iArr, i13) + iDataIndex3, i12 >= i13 ? toWriter.slotsGapStart : 0, i11, length));
                if (i13 == i12) {
                    i12++;
                }
                i13++;
                iDataIndex3 = i14;
                i9 = i4;
            }
            int i15 = i9;
            toWriter.slotsGapOwner = i12;
            int iLocationOf = SlotTableKt.locationOf(fromWriter.anchors, fromIndex, fromWriter.getSize$runtime_release());
            int iLocationOf2 = SlotTableKt.locationOf(fromWriter.anchors, i5, fromWriter.getSize$runtime_release());
            if (iLocationOf < iLocationOf2) {
                ArrayList arrayList = fromWriter.anchors;
                ArrayList arrayList2 = new ArrayList(iLocationOf2 - iLocationOf);
                for (int i16 = iLocationOf; i16 < iLocationOf2; i16++) {
                    Object obj = arrayList.get(i16);
                    Intrinsics.checkNotNullExpressionValue(obj, "sourceAnchors[anchorIndex]");
                    Anchor anchor = (Anchor) obj;
                    anchor.setLocation$runtime_release(anchor.getLocation() + i8);
                    arrayList2.add(anchor);
                }
                toWriter.anchors.addAll(SlotTableKt.locationOf(toWriter.anchors, toWriter.getCurrentGroup(), toWriter.getSize$runtime_release()), arrayList2);
                arrayList.subList(iLocationOf, iLocationOf2).clear();
                listEmptyList = arrayList2;
            } else {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            int iParent = fromWriter.parent(fromIndex);
            if (updateFromCursor) {
                int i17 = iParent >= 0 ? 1 : 0;
                if (i17 != 0) {
                    fromWriter.startGroup();
                    fromWriter.advanceBy(iParent - fromWriter.getCurrentGroup());
                    fromWriter.startGroup();
                }
                fromWriter.advanceBy(fromIndex - fromWriter.getCurrentGroup());
                zRemoveGroup = fromWriter.removeGroup();
                if (i17 != 0) {
                    fromWriter.skipToGroupEnd();
                    fromWriter.endGroup();
                    fromWriter.skipToGroupEnd();
                    fromWriter.endGroup();
                }
            } else {
                boolean zRemoveGroups = fromWriter.removeGroups(fromIndex, iGroupSize);
                fromWriter.removeSlots(iDataIndex, i6, fromIndex - 1);
                zRemoveGroup = zRemoveGroups;
            }
            if (!(!zRemoveGroup)) {
                ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
                throw new KotlinNothingValueException();
            }
            toWriter.nodeCount += SlotTableKt.isNode(iArr, currentGroup) ? 1 : SlotTableKt.nodeCount(iArr, currentGroup);
            if (updateToCursor) {
                toWriter.currentGroup = i15;
                toWriter.currentSlot = i7 + i6;
            }
            if (zContainsAnyGroupMarks) {
                toWriter.updateContainsMark(parent);
            }
            return listEmptyList;
        }
    }

    @Metadata(m5174d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, m5175d2 = {"androidx/compose/runtime/SlotWriter$groupSlots$1", "", "", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "hasNext", "", "next", "runtime_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: androidx.compose.runtime.SlotWriter$groupSlots$1 */
    public static final class C11961 implements Iterator<Object>, KMappedMarker {
        final /* synthetic */ int $end;
        private int current;
        final /* synthetic */ SlotWriter this$0;

        public C11961(int i4, int i5, SlotWriter slotWriter) {
            this.$end = i5;
            this.this$0 = slotWriter;
            this.current = i4;
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
            int i4 = this.current;
            this.current = i4 + 1;
            return objArr[slotWriter.dataIndexToDataAddress(i4)];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setCurrent(int i4) {
            this.current = i4;
        }
    }

    public SlotWriter(SlotTable table) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.table = table;
        this.groups = table.getGroups();
        this.slots = table.getSlots();
        this.anchors = table.getAnchors$runtime_release();
        this.groupGapStart = table.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - table.getGroupsSize();
        this.currentGroupEnd = table.getGroupsSize();
        this.slotsGapStart = table.getSlotsSize();
        this.slotsGapLen = this.slots.length - table.getSlotsSize();
        this.slotsGapOwner = table.getGroupsSize();
        this.startStack = new IntStack();
        this.endStack = new IntStack();
        this.nodeCountStack = new IntStack();
        this.parent = -1;
    }

    public static /* synthetic */ Anchor anchor$default(SlotWriter slotWriter, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i4);
    }

    private final int auxIndex(int[] iArr, int i4) {
        return dataIndex(iArr, i4) + SlotTableKt.countOneBits(SlotTableKt.groupInfo(iArr, i4) >> 29);
    }

    private final boolean childContainsAnyMarks(int group) {
        int iGroupSize = group + 1;
        int iGroupSize2 = group + groupSize(group);
        while (iGroupSize < iGroupSize2) {
            if (SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(iGroupSize))) {
                return true;
            }
            iGroupSize += groupSize(iGroupSize);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean containsAnyGroupMarks(int group) {
        return group >= 0 && SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(group));
    }

    private final boolean containsGroupMark(int group) {
        return group >= 0 && SlotTableKt.containsMark(this.groups, groupIndexToAddress(group));
    }

    private final int dataAnchorToDataIndex(int anchor, int gapLen, int capacity) {
        return anchor < 0 ? (capacity - gapLen) + anchor + 1 : anchor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int index) {
        return dataIndex(this.groups, groupIndexToAddress(index));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAddress(int dataIndex) {
        return dataIndex < this.slotsGapStart ? dataIndex : dataIndex + this.slotsGapLen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAnchor(int index, int gapStart, int gapLen, int capacity) {
        return index > gapStart ? -(((capacity - gapLen) - index) + 1) : index;
    }

    private final List<Integer> dataIndexes(int[] iArr) {
        List listDataAnchors$default = SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
        List listPlus = CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt___CollectionsKt.slice(listDataAnchors$default, RangesKt___RangesKt.until(0, this.groupGapStart)), (Iterable) CollectionsKt___CollectionsKt.slice(listDataAnchors$default, RangesKt___RangesKt.until(this.groupGapStart + this.groupGapLen, iArr.length / 5)));
        ArrayList arrayList = new ArrayList(listPlus.size());
        int size = listPlus.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(Integer.valueOf(dataAnchorToDataIndex(((Number) listPlus.get(i4)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    private final void fixParentAnchorsFor(int parent, int endGroup, int firstChild) {
        int iParentIndexToAnchor = parentIndexToAnchor(parent, this.groupGapStart);
        while (firstChild < endGroup) {
            SlotTableKt.updateParentAnchor(this.groups, groupIndexToAddress(firstChild), iParentIndexToAnchor);
            int iGroupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(firstChild)) + firstChild;
            fixParentAnchorsFor(firstChild, iGroupSize, firstChild + 1);
            firstChild = iGroupSize;
        }
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    private final void groupAsString(StringBuilder sb, int i4) {
        int iGroupIndexToAddress = groupIndexToAddress(i4);
        sb.append("Group(");
        if (i4 < 10) {
            sb.append(' ');
        }
        if (i4 < 100) {
            sb.append(' ');
        }
        if (i4 < 1000) {
            sb.append(' ');
        }
        sb.append(i4);
        if (iGroupIndexToAddress != i4) {
            sb.append("(");
            sb.append(iGroupIndexToAddress);
            sb.append(")");
        }
        sb.append('#');
        sb.append(SlotTableKt.groupSize(this.groups, iGroupIndexToAddress));
        boolean zGroupAsString$isStarted = groupAsString$isStarted(this, i4);
        if (zGroupAsString$isStarted) {
            sb.append('?');
        }
        sb.append('^');
        sb.append(parentAnchorToIndex(SlotTableKt.parentAnchor(this.groups, iGroupIndexToAddress)));
        sb.append(": key=");
        sb.append(SlotTableKt.key(this.groups, iGroupIndexToAddress));
        sb.append(", nodes=");
        sb.append(SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress));
        if (zGroupAsString$isStarted) {
            sb.append('?');
        }
        sb.append(", dataAnchor=");
        sb.append(SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress));
        sb.append(", parentAnchor=");
        sb.append(SlotTableKt.parentAnchor(this.groups, iGroupIndexToAddress));
        if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
            sb.append(", node=" + this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))]);
        }
        int iSlotIndex = slotIndex(this.groups, iGroupIndexToAddress);
        int iDataIndex = dataIndex(this.groups, iGroupIndexToAddress + 1);
        if (iDataIndex > iSlotIndex) {
            sb.append(", [");
            for (int i5 = iSlotIndex; i5 < iDataIndex; i5++) {
                if (i5 != iSlotIndex) {
                    sb.append(", ");
                }
                sb.append(String.valueOf(this.slots[dataIndexToDataAddress(i5)]));
            }
            sb.append(']');
        }
        sb.append(")");
    }

    private static final boolean groupAsString$isStarted(SlotWriter slotWriter, int i4) {
        return i4 < slotWriter.currentGroup && (i4 == slotWriter.parent || slotWriter.startStack.indexOf(i4) >= 0 || groupAsString$isStarted(slotWriter, slotWriter.parent(i4)));
    }

    private final int groupIndexToAddress(int index) {
        return index < this.groupGapStart ? index : index + this.groupGapLen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertGroups(int size) {
        if (size > 0) {
            int i4 = this.currentGroup;
            moveGroupGapTo(i4);
            int i5 = this.groupGapStart;
            int i6 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i7 = length - i6;
            if (i6 < size) {
                int iMax = Math.max(Math.max(length * 2, i7 + size), 32);
                int[] iArr2 = new int[iMax * 5];
                int i8 = iMax - i7;
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, 0, 0, i5 * 5);
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, (i5 + i8) * 5, (i6 + i5) * 5, length * 5);
                this.groups = iArr2;
                i6 = i8;
            }
            int i9 = this.currentGroupEnd;
            if (i9 >= i5) {
                this.currentGroupEnd = i9 + size;
            }
            int i10 = i5 + size;
            this.groupGapStart = i10;
            this.groupGapLen = i6 - size;
            int iDataIndexToDataAnchor = dataIndexToDataAnchor(i7 > 0 ? dataIndex(i4 + size) : 0, this.slotsGapOwner >= i5 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i11 = i5; i11 < i10; i11++) {
                SlotTableKt.updateDataAnchor(this.groups, i11, iDataIndexToDataAnchor);
            }
            int i12 = this.slotsGapOwner;
            if (i12 >= i5) {
                this.slotsGapOwner = i12 + size;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertSlots(int size, int group) {
        if (size > 0) {
            moveSlotGapTo(this.currentSlot, group);
            int i4 = this.slotsGapStart;
            int i5 = this.slotsGapLen;
            if (i5 < size) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i6 = length - i5;
                int iMax = Math.max(Math.max(length * 2, i6 + size), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i7 = 0; i7 < iMax; i7++) {
                    objArr2[i7] = null;
                }
                int i8 = iMax - i6;
                int i9 = i5 + i4;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, 0, 0, i4);
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, i4 + i8, i9, length);
                this.slots = objArr2;
                i5 = i8;
            }
            int i10 = this.currentSlotEnd;
            if (i10 >= i4) {
                this.currentSlotEnd = i10 + size;
            }
            this.slotsGapStart = i4 + size;
            this.slotsGapLen = i5 - size;
        }
    }

    private final List<Integer> keys() {
        List listKeys$default = SlotTableKt.keys$default(this.groups, 0, 1, null);
        ArrayList arrayList = new ArrayList(listKeys$default.size());
        int size = listKeys$default.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = listKeys$default.get(i4);
            ((Number) obj).intValue();
            int i5 = this.groupGapStart;
            if (i4 < i5 || i4 >= i5 + this.groupGapLen) {
                arrayList.add(obj);
            }
            i4++;
        }
        return arrayList;
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = slotWriter.parent;
        }
        slotWriter.markGroup(i4);
    }

    private final void moveAnchors(int originalLocation, int newLocation, int size) {
        int i4 = size + originalLocation;
        int size$runtime_release = getSize$runtime_release();
        int iLocationOf = SlotTableKt.locationOf(this.anchors, originalLocation, size$runtime_release);
        ArrayList arrayList = new ArrayList();
        if (iLocationOf >= 0) {
            while (iLocationOf < this.anchors.size()) {
                Anchor anchor = this.anchors.get(iLocationOf);
                Intrinsics.checkNotNullExpressionValue(anchor, "anchors[index]");
                Anchor anchor2 = anchor;
                int iAnchorIndex = anchorIndex(anchor2);
                if (iAnchorIndex < originalLocation || iAnchorIndex >= i4) {
                    break;
                }
                arrayList.add(anchor2);
                this.anchors.remove(iLocationOf);
            }
        }
        int i5 = newLocation - originalLocation;
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            Anchor anchor3 = (Anchor) arrayList.get(i6);
            int iAnchorIndex2 = anchorIndex(anchor3) + i5;
            if (iAnchorIndex2 >= this.groupGapStart) {
                anchor3.setLocation$runtime_release(-(size$runtime_release - iAnchorIndex2));
            } else {
                anchor3.setLocation$runtime_release(iAnchorIndex2);
            }
            this.anchors.add(SlotTableKt.locationOf(this.anchors, iAnchorIndex2, size$runtime_release), anchor3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveGroupGapTo(int index) {
        int i4 = this.groupGapLen;
        int i5 = this.groupGapStart;
        if (i5 != index) {
            if (!this.anchors.isEmpty()) {
                updateAnchors(i5, index);
            }
            if (i4 > 0) {
                int[] iArr = this.groups;
                int i6 = index * 5;
                int i7 = i4 * 5;
                int i8 = i5 * 5;
                if (index < i5) {
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i7 + i6, i6, i8);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i8, i8 + i7, i6 + i7);
                }
            }
            if (index < i5) {
                i5 = index + i4;
            }
            int capacity = getCapacity();
            ComposerKt.runtimeCheck(i5 < capacity);
            while (i5 < capacity) {
                int iParentAnchor = SlotTableKt.parentAnchor(this.groups, i5);
                int iParentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(iParentAnchor), index);
                if (iParentIndexToAnchor != iParentAnchor) {
                    SlotTableKt.updateParentAnchor(this.groups, i5, iParentIndexToAnchor);
                }
                i5++;
                if (i5 == index) {
                    i5 += i4;
                }
            }
        }
        this.groupGapStart = index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveSlotGapTo(int index, int group) {
        int i4 = this.slotsGapLen;
        int i5 = this.slotsGapStart;
        int i6 = this.slotsGapOwner;
        if (i5 != index) {
            Object[] objArr = this.slots;
            if (index < i5) {
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, index + i4, index, i5);
            } else {
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i5, i5 + i4, index + i4);
            }
            ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, index, index + i4);
        }
        int iMin = Math.min(group + 1, getSize$runtime_release());
        if (i6 != iMin) {
            int length = this.slots.length - i4;
            if (iMin < i6) {
                int iGroupIndexToAddress = groupIndexToAddress(iMin);
                int iGroupIndexToAddress2 = groupIndexToAddress(i6);
                int i7 = this.groupGapStart;
                while (iGroupIndexToAddress < iGroupIndexToAddress2) {
                    int iDataAnchor = SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress);
                    if (!(iDataAnchor >= 0)) {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a positive anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                    SlotTableKt.updateDataAnchor(this.groups, iGroupIndexToAddress, -((length - iDataAnchor) + 1));
                    iGroupIndexToAddress++;
                    if (iGroupIndexToAddress == i7) {
                        iGroupIndexToAddress += this.groupGapLen;
                    }
                }
            } else {
                int iGroupIndexToAddress3 = groupIndexToAddress(i6);
                int iGroupIndexToAddress4 = groupIndexToAddress(iMin);
                while (iGroupIndexToAddress3 < iGroupIndexToAddress4) {
                    int iDataAnchor2 = SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress3);
                    if (!(iDataAnchor2 < 0)) {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a negative anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                    SlotTableKt.updateDataAnchor(this.groups, iGroupIndexToAddress3, iDataAnchor2 + length + 1);
                    iGroupIndexToAddress3++;
                    if (iGroupIndexToAddress3 == this.groupGapStart) {
                        iGroupIndexToAddress3 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = iMin;
        }
        this.slotsGapStart = index;
    }

    private final int nodeIndex(int[] iArr, int i4) {
        return dataIndex(iArr, i4);
    }

    private final int parentAnchorToIndex(int index) {
        return index > -2 ? index : getSize$runtime_release() + index + 2;
    }

    private final int parentIndexToAnchor(int index, int gapStart) {
        return index < gapStart ? index : -((getSize$runtime_release() - index) + 2);
    }

    private final void recalculateMarks() {
        PrioritySet prioritySet = this.pendingRecalculateMarks;
        if (prioritySet != null) {
            while (prioritySet.isNotEmpty()) {
                updateContainsMarkNow(prioritySet.takeMax(), prioritySet);
            }
        }
    }

    private final boolean removeAnchors(int gapStart, int size) {
        int i4 = size + gapStart;
        int iLocationOf = SlotTableKt.locationOf(this.anchors, i4, getCapacity() - this.groupGapLen);
        if (iLocationOf >= this.anchors.size()) {
            iLocationOf--;
        }
        int i5 = iLocationOf + 1;
        int i6 = 0;
        while (iLocationOf >= 0) {
            Anchor anchor = this.anchors.get(iLocationOf);
            Intrinsics.checkNotNullExpressionValue(anchor, "anchors[index]");
            Anchor anchor2 = anchor;
            int iAnchorIndex = anchorIndex(anchor2);
            if (iAnchorIndex < gapStart) {
                break;
            }
            if (iAnchorIndex < i4) {
                anchor2.setLocation$runtime_release(Integer.MIN_VALUE);
                if (i6 == 0) {
                    i6 = iLocationOf + 1;
                }
                i5 = iLocationOf;
            }
            iLocationOf--;
        }
        boolean z3 = i5 < i6;
        if (z3) {
            this.anchors.subList(i5, i6).clear();
        }
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeGroups(int start, int len) {
        if (len > 0) {
            ArrayList<Anchor> arrayList = this.anchors;
            moveGroupGapTo(start);
            zRemoveAnchors = arrayList.isEmpty() ^ true ? removeAnchors(start, len) : false;
            this.groupGapStart = start;
            this.groupGapLen += len;
            int i4 = this.slotsGapOwner;
            if (i4 > start) {
                this.slotsGapOwner = Math.max(start, i4 - len);
            }
            int i5 = this.currentGroupEnd;
            if (i5 >= this.groupGapStart) {
                this.currentGroupEnd = i5 - len;
            }
            if (containsGroupMark(this.parent)) {
                updateContainsMark(this.parent);
            }
        }
        return zRemoveAnchors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSlots(int start, int len, int group) {
        if (len > 0) {
            int i4 = this.slotsGapLen;
            int i5 = start + len;
            moveSlotGapTo(i5, group);
            this.slotsGapStart = start;
            this.slotsGapLen = i4 + len;
            ArraysKt___ArraysJvmKt.fill(this.slots, (Object) null, start, i5);
            int i6 = this.currentSlotEnd;
            if (i6 >= start) {
                this.currentSlotEnd = i6 - len;
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

    private final int slotIndex(int[] iArr, int i4) {
        return i4 >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(SlotTableKt.slotAnchor(iArr, i4), this.slotsGapLen, this.slots.length);
    }

    private final void updateAnchors(int previousGapStart, int newGapStart) {
        int i4;
        int capacity = getCapacity() - this.groupGapLen;
        if (previousGapStart >= newGapStart) {
            for (int iLocationOf = SlotTableKt.locationOf(this.anchors, newGapStart, capacity); iLocationOf < this.anchors.size(); iLocationOf++) {
                Anchor anchor = this.anchors.get(iLocationOf);
                Intrinsics.checkNotNullExpressionValue(anchor, "anchors[index]");
                Anchor anchor2 = anchor;
                int location = anchor2.getLocation();
                if (location < 0) {
                    return;
                }
                anchor2.setLocation$runtime_release(-(capacity - location));
            }
            return;
        }
        for (int iLocationOf2 = SlotTableKt.locationOf(this.anchors, previousGapStart, capacity); iLocationOf2 < this.anchors.size(); iLocationOf2++) {
            Anchor anchor3 = this.anchors.get(iLocationOf2);
            Intrinsics.checkNotNullExpressionValue(anchor3, "anchors[index]");
            Anchor anchor4 = anchor3;
            int location2 = anchor4.getLocation();
            if (location2 >= 0 || (i4 = location2 + capacity) >= newGapStart) {
                return;
            }
            anchor4.setLocation$runtime_release(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateContainsMark(int group) {
        if (group >= 0) {
            PrioritySet prioritySet = this.pendingRecalculateMarks;
            if (prioritySet == null) {
                prioritySet = new PrioritySet(null, 1, 0 == true ? 1 : 0);
                this.pendingRecalculateMarks = prioritySet;
            }
            prioritySet.add(group);
        }
    }

    private final void updateContainsMarkNow(int group, PrioritySet set) {
        int iGroupIndexToAddress = groupIndexToAddress(group);
        boolean zChildContainsAnyMarks = childContainsAnyMarks(group);
        if (SlotTableKt.containsMark(this.groups, iGroupIndexToAddress) != zChildContainsAnyMarks) {
            SlotTableKt.updateContainsMark(this.groups, iGroupIndexToAddress, zChildContainsAnyMarks);
            int iParent = parent(group);
            if (iParent >= 0) {
                set.add(iParent);
            }
        }
    }

    private final void updateDataIndex(int[] iArr, int i4, int i5) {
        SlotTableKt.updateDataAnchor(iArr, i4, dataIndexToDataAnchor(i5, this.slotsGapStart, this.slotsGapLen, this.slots.length));
    }

    private final void updateNodeOfGroup(int index, Object value) {
        int iGroupIndexToAddress = groupIndexToAddress(index);
        int[] iArr = this.groups;
        if (iGroupIndexToAddress < iArr.length && SlotTableKt.isNode(iArr, iGroupIndexToAddress)) {
            this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))] = value;
            return;
        }
        ComposerKt.composeRuntimeError(("Updating the node of a group at " + index + " that was not created with as a node group").toString());
        throw new KotlinNothingValueException();
    }

    public final void addToGroupSizeAlongSpine(int address, int amount) {
        while (address > 0) {
            int[] iArr = this.groups;
            SlotTableKt.updateGroupSize(iArr, address, SlotTableKt.groupSize(iArr, address) + amount);
            address = groupIndexToAddress(parentAnchorToIndex(SlotTableKt.parentAnchor(this.groups, address)));
        }
    }

    public final void advanceBy(int amount) {
        if (!(amount >= 0)) {
            ComposerKt.composeRuntimeError("Cannot seek backwards".toString());
            throw new KotlinNothingValueException();
        }
        if (!(this.insertCount <= 0)) {
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        if (amount == 0) {
            return;
        }
        int i4 = this.currentGroup + amount;
        if (i4 >= this.parent && i4 <= this.currentGroupEnd) {
            this.currentGroup = i4;
            int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i4));
            this.currentSlot = iDataIndex;
            this.currentSlotEnd = iDataIndex;
            return;
        }
        ComposerKt.composeRuntimeError(("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')').toString());
        throw new KotlinNothingValueException();
    }

    public final Anchor anchor(int index) {
        ArrayList<Anchor> arrayList = this.anchors;
        int iSearch = SlotTableKt.search(arrayList, index, getSize$runtime_release());
        if (iSearch >= 0) {
            Anchor anchor = arrayList.get(iSearch);
            Intrinsics.checkNotNullExpressionValue(anchor, "get(location)");
            return anchor;
        }
        if (index > this.groupGapStart) {
            index = -(getSize$runtime_release() - index);
        }
        Anchor anchor2 = new Anchor(index);
        arrayList.add(-(iSearch + 1), anchor2);
        return anchor2;
    }

    public final int anchorIndex(Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        int location = anchor.getLocation();
        return location < 0 ? location + getSize$runtime_release() : location;
    }

    public final void bashGroup$runtime_release() {
        startGroup();
        while (!isGroupEnd()) {
            insertParentGroup(-3);
            skipGroup();
        }
        endGroup();
    }

    public final void beginInsert() {
        int i4 = this.insertCount;
        this.insertCount = i4 + 1;
        if (i4 == 0) {
            saveCurrentGroupEnd();
        }
    }

    public final void close() {
        this.closed = true;
        if (this.startStack.isEmpty()) {
            moveGroupGapTo(getSize$runtime_release());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            recalculateMarks();
        }
        this.table.close$runtime_release(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors);
    }

    public final int endGroup() {
        boolean z3 = this.insertCount > 0;
        int i4 = this.currentGroup;
        int i5 = this.currentGroupEnd;
        int i6 = this.parent;
        int iGroupIndexToAddress = groupIndexToAddress(i6);
        int i7 = this.nodeCount;
        int i8 = i4 - i6;
        boolean zIsNode = SlotTableKt.isNode(this.groups, iGroupIndexToAddress);
        if (z3) {
            SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress, i8);
            SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i7);
            this.nodeCount = this.nodeCountStack.pop() + (zIsNode ? 1 : i7);
            this.parent = parent(this.groups, i6);
        } else {
            if ((i4 != i5 ? 0 : 1) == 0) {
                ComposerKt.composeRuntimeError("Expected to be at the end of a group".toString());
                throw new KotlinNothingValueException();
            }
            int iGroupSize = SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
            int iNodeCount = SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress);
            SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress, i8);
            SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i7);
            int iPop = this.startStack.pop();
            restoreCurrentGroupEnd();
            this.parent = iPop;
            int iParent = parent(this.groups, i6);
            int iPop2 = this.nodeCountStack.pop();
            this.nodeCount = iPop2;
            if (iParent == iPop) {
                this.nodeCount = iPop2 + (zIsNode ? 0 : i7 - iNodeCount);
            } else {
                int i9 = i8 - iGroupSize;
                int i10 = zIsNode ? 0 : i7 - iNodeCount;
                if (i9 != 0 || i10 != 0) {
                    while (iParent != 0 && iParent != iPop && (i10 != 0 || i9 != 0)) {
                        int iGroupIndexToAddress2 = groupIndexToAddress(iParent);
                        if (i9 != 0) {
                            SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress2, SlotTableKt.groupSize(this.groups, iGroupIndexToAddress2) + i9);
                        }
                        if (i10 != 0) {
                            int[] iArr = this.groups;
                            SlotTableKt.updateNodeCount(iArr, iGroupIndexToAddress2, SlotTableKt.nodeCount(iArr, iGroupIndexToAddress2) + i10);
                        }
                        if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress2)) {
                            i10 = 0;
                        }
                        iParent = parent(this.groups, iParent);
                    }
                }
                this.nodeCount += i10;
            }
        }
        return i7;
    }

    public final void endInsert() {
        int i4 = this.insertCount;
        if (!(i4 > 0)) {
            throw new IllegalStateException("Unbalanced begin/end insert".toString());
        }
        int i5 = i4 - 1;
        this.insertCount = i5;
        if (i5 == 0) {
            if (this.nodeCountStack.getTos() == this.startStack.getTos()) {
                restoreCurrentGroupEnd();
            } else {
                ComposerKt.composeRuntimeError("startGroup/endGroup mismatch while inserting".toString());
                throw new KotlinNothingValueException();
            }
        }
    }

    public final void ensureStarted(int index) {
        if (!(this.insertCount <= 0)) {
            ComposerKt.composeRuntimeError("Cannot call ensureStarted() while inserting".toString());
            throw new KotlinNothingValueException();
        }
        int i4 = this.parent;
        if (i4 != index) {
            if (!(index >= i4 && index < this.currentGroupEnd)) {
                ComposerKt.composeRuntimeError(("Started group at " + index + " must be a subgroup of the group at " + i4).toString());
                throw new KotlinNothingValueException();
            }
            int i5 = this.currentGroup;
            int i6 = this.currentSlot;
            int i7 = this.currentSlotEnd;
            this.currentGroup = index;
            startGroup();
            this.currentGroup = i5;
            this.currentSlot = i6;
            this.currentSlotEnd = i7;
        }
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getSize$runtime_release() {
        return getCapacity() - this.groupGapLen;
    }

    /* renamed from: getTable$runtime_release, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    public final Object groupAux(int index) {
        int iGroupIndexToAddress = groupIndexToAddress(index);
        return SlotTableKt.hasAux(this.groups, iGroupIndexToAddress) ? this.slots[auxIndex(this.groups, iGroupIndexToAddress)] : Composer.INSTANCE.getEmpty();
    }

    public final int groupKey(int index) {
        return SlotTableKt.key(this.groups, groupIndexToAddress(index));
    }

    public final Object groupObjectKey(int index) {
        int iGroupIndexToAddress = groupIndexToAddress(index);
        if (SlotTableKt.hasObjectKey(this.groups, iGroupIndexToAddress)) {
            return this.slots[SlotTableKt.objectKeyIndex(this.groups, iGroupIndexToAddress)];
        }
        return null;
    }

    public final int groupSize(int index) {
        return SlotTableKt.groupSize(this.groups, groupIndexToAddress(index));
    }

    public final Iterator<Object> groupSlots() {
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int[] iArr = this.groups;
        int i4 = this.currentGroup;
        return new C11961(iDataIndex, dataIndex(iArr, groupIndexToAddress(i4 + groupSize(i4))), this);
    }

    public final String groupsAsString() {
        StringBuilder sb = new StringBuilder();
        int size$runtime_release = getSize$runtime_release();
        for (int i4 = 0; i4 < size$runtime_release; i4++) {
            groupAsString(sb, i4);
            sb.append('\n');
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final boolean indexInCurrentGroup(int index) {
        return indexInGroup(index, this.currentGroup);
    }

    public final boolean indexInGroup(int index, int group) {
        int iIndexOf;
        int capacity;
        if (group == this.parent) {
            capacity = this.currentGroupEnd;
        } else if (group <= this.startStack.peekOr(0) && (iIndexOf = this.startStack.indexOf(group)) >= 0) {
            capacity = (getCapacity() - this.groupGapLen) - this.endStack.peek(iIndexOf);
        } else {
            int iGroupSize = groupSize(group);
            capacity = iGroupSize + group;
        }
        return index > group && index < capacity;
    }

    public final boolean indexInParent(int index) {
        int i4 = this.parent;
        return (index > i4 && index < this.currentGroupEnd) || (i4 == 0 && index == 0);
    }

    public final void insertAux(Object value) {
        if (!(this.insertCount >= 0)) {
            ComposerKt.composeRuntimeError("Cannot insert auxiliary data when not inserting".toString());
            throw new KotlinNothingValueException();
        }
        int i4 = this.parent;
        int iGroupIndexToAddress = groupIndexToAddress(i4);
        if (!(!SlotTableKt.hasAux(this.groups, iGroupIndexToAddress))) {
            ComposerKt.composeRuntimeError("Group already has auxiliary data".toString());
            throw new KotlinNothingValueException();
        }
        insertSlots(1, i4);
        int iAuxIndex = auxIndex(this.groups, iGroupIndexToAddress);
        int iDataIndexToDataAddress = dataIndexToDataAddress(iAuxIndex);
        int i5 = this.currentSlot;
        if (i5 > iAuxIndex) {
            int i6 = i5 - iAuxIndex;
            if (!(i6 < 3)) {
                throw new IllegalStateException("Moving more than two slot not supported".toString());
            }
            if (i6 > 1) {
                Object[] objArr = this.slots;
                objArr[iDataIndexToDataAddress + 2] = objArr[iDataIndexToDataAddress + 1];
            }
            Object[] objArr2 = this.slots;
            objArr2[iDataIndexToDataAddress + 1] = objArr2[iDataIndexToDataAddress];
        }
        SlotTableKt.addAux(this.groups, iGroupIndexToAddress);
        this.slots[iDataIndexToDataAddress] = value;
        this.currentSlot++;
    }

    public final void insertParentGroup(int key) {
        int iNodeCount = 0;
        if (!(this.insertCount == 0)) {
            ComposerKt.composeRuntimeError("Writer cannot be inserting".toString());
            throw new KotlinNothingValueException();
        }
        if (isGroupEnd()) {
            beginInsert();
            startGroup(key);
            endGroup();
            endInsert();
            return;
        }
        int i4 = this.currentGroup;
        int iParent = parent(this.groups, i4);
        int iGroupSize = iParent + groupSize(iParent);
        int i5 = iGroupSize - i4;
        int iGroupSize2 = i4;
        while (iGroupSize2 < iGroupSize) {
            int iGroupIndexToAddress = groupIndexToAddress(iGroupSize2);
            iNodeCount += SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress);
            iGroupSize2 += SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
        }
        int iDataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress(i4));
        beginInsert();
        insertGroups(1);
        endInsert();
        int iGroupIndexToAddress2 = groupIndexToAddress(i4);
        SlotTableKt.initGroup(this.groups, iGroupIndexToAddress2, key, false, false, false, iParent, iDataAnchor);
        SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress2, i5 + 1);
        SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress2, iNodeCount);
        addToGroupSizeAlongSpine(groupIndexToAddress(iParent), 1);
        fixParentAnchorsFor(iParent, iGroupSize, i4);
        this.currentGroup = iGroupSize;
    }

    public final boolean isGroupEnd() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final boolean isNode() {
        int i4 = this.currentGroup;
        return i4 < this.currentGroupEnd && SlotTableKt.isNode(this.groups, groupIndexToAddress(i4));
    }

    public final void markGroup(int group) {
        int iGroupIndexToAddress = groupIndexToAddress(group);
        if (SlotTableKt.hasMark(this.groups, iGroupIndexToAddress)) {
            return;
        }
        SlotTableKt.updateMark(this.groups, iGroupIndexToAddress, true);
        if (SlotTableKt.containsMark(this.groups, iGroupIndexToAddress)) {
            return;
        }
        updateContainsMark(parent(group));
    }

    public final List<Anchor> moveFrom(SlotTable table, int index) {
        Intrinsics.checkNotNullParameter(table, "table");
        ComposerKt.runtimeCheck(this.insertCount > 0);
        if (index != 0 || this.currentGroup != 0 || this.table.getGroupsSize() != 0) {
            SlotWriter slotWriterOpenWriter = table.openWriter();
            try {
                return INSTANCE.moveGroup(slotWriterOpenWriter, index, this, true, true);
            } finally {
                slotWriterOpenWriter.close();
            }
        }
        int[] iArr = this.groups;
        Object[] objArr = this.slots;
        ArrayList<Anchor> arrayList = this.anchors;
        int[] groups = table.getGroups();
        int groupsSize = table.getGroupsSize();
        Object[] slots = table.getSlots();
        int slotsSize = table.getSlotsSize();
        this.groups = groups;
        this.slots = slots;
        this.anchors = table.getAnchors$runtime_release();
        this.groupGapStart = groupsSize;
        this.groupGapLen = (groups.length / 5) - groupsSize;
        this.slotsGapStart = slotsSize;
        this.slotsGapLen = slots.length - slotsSize;
        this.slotsGapOwner = groupsSize;
        table.setTo$runtime_release(iArr, 0, objArr, 0, arrayList);
        return this.anchors;
    }

    public final void moveGroup(int offset) {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeRuntimeError("Cannot move a group while inserting".toString());
            throw new KotlinNothingValueException();
        }
        if (!(offset >= 0)) {
            ComposerKt.composeRuntimeError("Parameter offset is out of bounds".toString());
            throw new KotlinNothingValueException();
        }
        if (offset == 0) {
            return;
        }
        int i4 = this.currentGroup;
        int i5 = this.parent;
        int i6 = this.currentGroupEnd;
        int iGroupSize = i4;
        for (int i7 = offset; i7 > 0; i7--) {
            iGroupSize += SlotTableKt.groupSize(this.groups, groupIndexToAddress(iGroupSize));
            if (!(iGroupSize <= i6)) {
                ComposerKt.composeRuntimeError("Parameter offset is out of bounds".toString());
                throw new KotlinNothingValueException();
            }
        }
        int iGroupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress(iGroupSize));
        int i8 = this.currentSlot;
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
        int i9 = iGroupSize + iGroupSize2;
        int iDataIndex2 = dataIndex(this.groups, groupIndexToAddress(i9));
        int i10 = iDataIndex2 - iDataIndex;
        insertSlots(i10, Math.max(this.currentGroup - 1, 0));
        insertGroups(iGroupSize2);
        int[] iArr = this.groups;
        int iGroupIndexToAddress = groupIndexToAddress(i9) * 5;
        ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, groupIndexToAddress(i4) * 5, iGroupIndexToAddress, (iGroupSize2 * 5) + iGroupIndexToAddress);
        if (i10 > 0) {
            Object[] objArr = this.slots;
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i8, dataIndexToDataAddress(iDataIndex + i10), dataIndexToDataAddress(iDataIndex2 + i10));
        }
        int i11 = iDataIndex + i10;
        int i12 = i11 - i8;
        int i13 = this.slotsGapStart;
        int i14 = this.slotsGapLen;
        int length = this.slots.length;
        int i15 = this.slotsGapOwner;
        int i16 = i4 + iGroupSize2;
        int i17 = i4;
        while (i17 < i16) {
            int iGroupIndexToAddress2 = groupIndexToAddress(i17);
            int i18 = i13;
            int i19 = i12;
            updateDataIndex(iArr, iGroupIndexToAddress2, dataIndexToDataAnchor(dataIndex(iArr, iGroupIndexToAddress2) - i12, i15 < iGroupIndexToAddress2 ? 0 : i18, i14, length));
            i17++;
            i13 = i18;
            i12 = i19;
        }
        moveAnchors(i9, i4, iGroupSize2);
        if (!(!removeGroups(i9, iGroupSize2))) {
            ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
            throw new KotlinNothingValueException();
        }
        fixParentAnchorsFor(i5, this.currentGroupEnd, i4);
        if (i10 > 0) {
            removeSlots(i11, i10, i9 - 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<androidx.compose.runtime.Anchor> moveIntoGroupFrom(int r10, androidx.compose.runtime.SlotTable r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "table"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            int r0 = r9.insertCount
            if (r0 > 0) goto L15
            int r0 = r9.currentGroup
            int r0 = r0 + r10
            int r0 = r9.groupSize(r0)
            r1 = 1
            if (r0 != r1) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            androidx.compose.runtime.ComposerKt.runtimeCheck(r1)
            int r0 = r9.currentGroup
            int r1 = r9.currentSlot
            int r2 = r9.currentSlotEnd
            r9.advanceBy(r10)
            r9.startGroup()
            r9.beginInsert()
            androidx.compose.runtime.SlotWriter r10 = r11.openWriter()
            androidx.compose.runtime.SlotWriter$Companion r3 = androidx.compose.runtime.SlotWriter.INSTANCE     // Catch: java.lang.Throwable -> L47
            r7 = 0
            r8 = 1
            r4 = r10
            r5 = r12
            r6 = r9
            java.util.List r11 = androidx.compose.runtime.SlotWriter.Companion.access$moveGroup(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L47
            r10.close()
            r9.endInsert()
            r9.endGroup()
            r9.currentGroup = r0
            r9.currentSlot = r1
            r9.currentSlotEnd = r2
            return r11
        L47:
            r11 = move-exception
            r10.close()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.moveIntoGroupFrom(int, androidx.compose.runtime.SlotTable, int):java.util.List");
    }

    public final List<Anchor> moveTo(Anchor anchor, int offset, SlotWriter writer) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        Intrinsics.checkNotNullParameter(writer, "writer");
        ComposerKt.runtimeCheck(writer.insertCount > 0);
        ComposerKt.runtimeCheck(this.insertCount == 0);
        ComposerKt.runtimeCheck(anchor.getValid());
        int iAnchorIndex = anchorIndex(anchor) + offset;
        int i4 = this.currentGroup;
        ComposerKt.runtimeCheck(i4 <= iAnchorIndex && iAnchorIndex < this.currentGroupEnd);
        int iParent = parent(iAnchorIndex);
        int iGroupSize = groupSize(iAnchorIndex);
        int iNodeCount = isNode(iAnchorIndex) ? 1 : nodeCount(iAnchorIndex);
        List<Anchor> listMoveGroup = INSTANCE.moveGroup(this, iAnchorIndex, writer, false, false);
        updateContainsMark(iParent);
        boolean z3 = iNodeCount > 0;
        while (iParent >= i4) {
            int iGroupIndexToAddress = groupIndexToAddress(iParent);
            int[] iArr = this.groups;
            SlotTableKt.updateGroupSize(iArr, iGroupIndexToAddress, SlotTableKt.groupSize(iArr, iGroupIndexToAddress) - iGroupSize);
            if (z3) {
                if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
                    z3 = false;
                } else {
                    int[] iArr2 = this.groups;
                    SlotTableKt.updateNodeCount(iArr2, iGroupIndexToAddress, SlotTableKt.nodeCount(iArr2, iGroupIndexToAddress) - iNodeCount);
                }
            }
            iParent = parent(iParent);
        }
        if (z3) {
            ComposerKt.runtimeCheck(this.nodeCount >= iNodeCount);
            this.nodeCount -= iNodeCount;
        }
        return listMoveGroup;
    }

    public final Object node(int index) {
        int iGroupIndexToAddress = groupIndexToAddress(index);
        if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
            return this.slots[dataIndexToDataAddress(nodeIndex(this.groups, iGroupIndexToAddress))];
        }
        return null;
    }

    public final int nodeCount(int index) {
        return SlotTableKt.nodeCount(this.groups, groupIndexToAddress(index));
    }

    public final int parent(int index) {
        return parent(this.groups, index);
    }

    public final boolean removeGroup() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeRuntimeError("Cannot remove group while inserting".toString());
            throw new KotlinNothingValueException();
        }
        int i4 = this.currentGroup;
        int i5 = this.currentSlot;
        int iSkipGroup = skipGroup();
        PrioritySet prioritySet = this.pendingRecalculateMarks;
        if (prioritySet != null) {
            while (prioritySet.isNotEmpty() && prioritySet.peek() >= i4) {
                prioritySet.takeMax();
            }
        }
        boolean zRemoveGroups = removeGroups(i4, this.currentGroup - i4);
        removeSlots(i5, this.currentSlot - i5, i4 - 1);
        this.currentGroup = i4;
        this.currentSlot = i5;
        this.nodeCount -= iSkipGroup;
        return zRemoveGroups;
    }

    public final void reset() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeRuntimeError("Cannot reset when inserting".toString());
            throw new KotlinNothingValueException();
        }
        recalculateMarks();
        this.currentGroup = 0;
        this.currentGroupEnd = getCapacity() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
    }

    public final void seek(Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    public final void set(Object value) {
        int i4 = this.currentSlot;
        if (i4 <= this.currentSlotEnd) {
            this.slots[dataIndexToDataAddress(i4 - 1)] = value;
        } else {
            ComposerKt.composeRuntimeError("Writing to an invalid slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i4 = this.currentSlot;
        this.currentSlot = i4 + 1;
        return objArr[dataIndexToDataAddress(i4)];
    }

    public final int skipGroup() {
        int iGroupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int iGroupSize = this.currentGroup + SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
        this.currentGroup = iGroupSize;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
        if (SlotTableKt.isNode(this.groups, iGroupIndexToAddress)) {
            return 1;
        }
        return SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress);
    }

    public final void skipToGroupEnd() {
        int i4 = this.currentGroupEnd;
        this.currentGroup = i4;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i4));
    }

    public final Object slot(Anchor anchor, int index) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return slot(anchorIndex(anchor), index);
    }

    public final void startData(int key, Object objectKey, Object aux) {
        startGroup(key, objectKey, false, aux);
    }

    public final void startGroup() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeRuntimeError("Key must be supplied when inserting".toString());
            throw new KotlinNothingValueException();
        }
        Composer.Companion companion = Composer.INSTANCE;
        startGroup(0, companion.getEmpty(), false, companion.getEmpty());
    }

    public final void startNode(int key, Object objectKey) {
        startGroup(key, objectKey, true, Composer.INSTANCE.getEmpty());
    }

    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime_release() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    public final Object update(Object value) {
        Object objSkip = skip();
        set(value);
        return objSkip;
    }

    public final void updateAux(Object value) {
        int iGroupIndexToAddress = groupIndexToAddress(this.currentGroup);
        if (SlotTableKt.hasAux(this.groups, iGroupIndexToAddress)) {
            this.slots[dataIndexToDataAddress(auxIndex(this.groups, iGroupIndexToAddress))] = value;
        } else {
            ComposerKt.composeRuntimeError("Updating the data of a group that was not created with a data slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void updateNode(Object value) {
        updateNodeOfGroup(this.currentGroup, value);
    }

    public final void updateParentNode(Object value) {
        updateNodeOfGroup(this.parent, value);
    }

    public final void verifyDataAnchors$runtime_release() {
        int i4 = this.slotsGapOwner;
        int length = this.slots.length - this.slotsGapLen;
        int size$runtime_release = getSize$runtime_release();
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        while (i5 < size$runtime_release) {
            int iGroupIndexToAddress = groupIndexToAddress(i5);
            int iDataAnchor = SlotTableKt.dataAnchor(this.groups, iGroupIndexToAddress);
            int iDataIndex = dataIndex(this.groups, iGroupIndexToAddress);
            if (!(iDataIndex >= i6)) {
                throw new IllegalStateException(("Data index out of order at " + i5 + ", previous = " + i6 + ", current = " + iDataIndex).toString());
            }
            if (!(iDataIndex <= length)) {
                throw new IllegalStateException(("Data index, " + iDataIndex + ", out of bound at " + i5).toString());
            }
            if (iDataAnchor < 0 && !z3) {
                if (!(i4 == i5)) {
                    throw new IllegalStateException(("Expected the slot gap owner to be " + i4 + " found gap at " + i5).toString());
                }
                z3 = true;
            }
            i5++;
            i6 = iDataIndex;
        }
    }

    public final void verifyParentAnchors$runtime_release() {
        int i4 = this.groupGapStart;
        int i5 = this.groupGapLen;
        int capacity = getCapacity();
        int i6 = 0;
        while (true) {
            if (i6 >= i4) {
                for (int i7 = i5 + i4; i7 < capacity; i7++) {
                    int iParentAnchor = SlotTableKt.parentAnchor(this.groups, i7);
                    if (parentAnchorToIndex(iParentAnchor) < i4) {
                        if (!(iParentAnchor > -2)) {
                            throw new IllegalStateException(("Expected a start relative anchor at " + i7).toString());
                        }
                    } else {
                        if (!(iParentAnchor <= -2)) {
                            throw new IllegalStateException(("Expected an end relative anchor at " + i7).toString());
                        }
                    }
                }
                return;
            }
            if (!(SlotTableKt.parentAnchor(this.groups, i6) > -2)) {
                throw new IllegalStateException(("Expected a start relative anchor at " + i6).toString());
            }
            i6++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int[] iArr, int i4) {
        return i4 >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(SlotTableKt.dataAnchor(iArr, i4), this.slotsGapLen, this.slots.length);
    }

    public final boolean isNode(int index) {
        return SlotTableKt.isNode(this.groups, groupIndexToAddress(index));
    }

    public final int parent(Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (anchor.getValid()) {
            return parent(this.groups, anchorIndex(anchor));
        }
        return -1;
    }

    public final Object slot(int groupIndex, int index) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(groupIndex));
        int i4 = index + iSlotIndex;
        if (iSlotIndex <= i4 && i4 < dataIndex(this.groups, groupIndexToAddress(groupIndex + 1))) {
            return this.slots[dataIndexToDataAddress(i4)];
        }
        return Composer.INSTANCE.getEmpty();
    }

    public final void startData(int key, Object aux) {
        startGroup(key, Composer.INSTANCE.getEmpty(), false, aux);
    }

    public final void startNode(int key, Object objectKey, Object node) {
        startGroup(key, objectKey, true, node);
    }

    public final void updateNode(Anchor anchor, Object value) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        updateNodeOfGroup(anchor.toIndexFor(this), value);
    }

    private final int parent(int[] iArr, int i4) {
        return parentAnchorToIndex(SlotTableKt.parentAnchor(iArr, groupIndexToAddress(i4)));
    }

    public final Object node(Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return node(anchor.toIndexFor(this));
    }

    public final Object set(int index, Object value) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int i4 = iSlotIndex + index;
        if (i4 >= iSlotIndex && i4 < dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1))) {
            int iDataIndexToDataAddress = dataIndexToDataAddress(i4);
            Object[] objArr = this.slots;
            Object obj = objArr[iDataIndexToDataAddress];
            objArr[iDataIndexToDataAddress] = value;
            return obj;
        }
        ComposerKt.composeRuntimeError(("Write to an invalid slot index " + index + " for group " + this.currentGroup).toString());
        throw new KotlinNothingValueException();
    }

    public final void startGroup(int key) {
        Composer.Companion companion = Composer.INSTANCE;
        startGroup(key, companion.getEmpty(), false, companion.getEmpty());
    }

    public final void startGroup(int key, Object dataKey) {
        startGroup(key, dataKey, false, Composer.INSTANCE.getEmpty());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startGroup(int key, Object objectKey, boolean isNode, Object aux) {
        int iGroupSize;
        Object[] objArr = this.insertCount > 0;
        this.nodeCountStack.push(this.nodeCount);
        if (objArr != false) {
            insertGroups(1);
            int i4 = this.currentGroup;
            int iGroupIndexToAddress = groupIndexToAddress(i4);
            Composer.Companion companion = Composer.INSTANCE;
            int i5 = objectKey != companion.getEmpty() ? 1 : 0;
            int i6 = (isNode || aux == companion.getEmpty()) ? 0 : 1;
            SlotTableKt.initGroup(this.groups, iGroupIndexToAddress, key, isNode, i5, i6, this.parent, this.currentSlot);
            this.currentSlotEnd = this.currentSlot;
            int i7 = (isNode ? 1 : 0) + i5 + i6;
            if (i7 > 0) {
                insertSlots(i7, i4);
                Object[] objArr2 = this.slots;
                int i8 = this.currentSlot;
                if (isNode) {
                    objArr2[i8] = aux;
                    i8++;
                }
                if (i5 != 0) {
                    objArr2[i8] = objectKey;
                    i8++;
                }
                if (i6 != 0) {
                    objArr2[i8] = aux;
                    i8++;
                }
                this.currentSlot = i8;
            }
            this.nodeCount = 0;
            iGroupSize = i4 + 1;
            this.parent = i4;
            this.currentGroup = iGroupSize;
        } else {
            this.startStack.push(this.parent);
            saveCurrentGroupEnd();
            int i9 = this.currentGroup;
            int iGroupIndexToAddress2 = groupIndexToAddress(i9);
            if (!Intrinsics.areEqual(aux, Composer.INSTANCE.getEmpty())) {
                if (isNode) {
                    updateNode(aux);
                } else {
                    updateAux(aux);
                }
            }
            this.currentSlot = slotIndex(this.groups, iGroupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            this.nodeCount = SlotTableKt.nodeCount(this.groups, iGroupIndexToAddress2);
            this.parent = i9;
            this.currentGroup = i9 + 1;
            iGroupSize = i9 + SlotTableKt.groupSize(this.groups, iGroupIndexToAddress2);
        }
        this.currentGroupEnd = iGroupSize;
    }

    public final void ensureStarted(Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        ensureStarted(anchor.toIndexFor(this));
    }
}
