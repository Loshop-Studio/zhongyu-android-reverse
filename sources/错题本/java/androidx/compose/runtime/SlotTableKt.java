package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5862w;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u001c\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0019\n\u0002\u0010\t\n\u0002\b\u0004\u001a@\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0082\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a>\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0082\b¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\r\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001c\u0010\u0016\u001a\u00020\b*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0082\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001c\u0010\u0018\u001a\u00020\u0004*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0082\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001c\u0010\u001a\u001a\u00020\b*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0082\b¢\u0006\u0004\b\u001a\u0010\u0017\u001a\u001c\u0010\u001b\u001a\u00020\u0004*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0082\b¢\u0006\u0004\b\u001b\u0010\u0019\u001a\u001b\u0010\u001c\u001a\u00020\b*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u0017\u001a\u001c\u0010\u001d\u001a\u00020\u0004*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0082\b¢\u0006\u0004\b\u001d\u0010\u0019\u001a\u001b\u0010\u001f\u001a\u00020\u001e*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u001c\u0010!\u001a\u00020\u0004*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0082\b¢\u0006\u0004\b!\u0010\u0019\u001a#\u0010#\u001a\u00020\u001e*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$\u001a\u001c\u0010%\u001a\u00020\u0004*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0082\b¢\u0006\u0004\b%\u0010\u0019\u001a#\u0010&\u001a\u00020\u001e*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010$\u001a\u001c\u0010'\u001a\u00020\u0004*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0082\b¢\u0006\u0004\b'\u0010\u0019\u001a\u001b\u0010(\u001a\u00020\b*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010\u0017\u001a\u001b\u0010)\u001a\u00020\b*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010\u0017\u001a\u0018\u0010*\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0082\b¢\u0006\u0004\b*\u0010+\u001a\u001c\u0010,\u001a\u00020\b*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0082\b¢\u0006\u0004\b,\u0010\u0017\u001a#\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0.*\u00020\u00142\b\b\u0002\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b/\u00100\u001a\u001c\u00101\u001a\u00020\b*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0082\b¢\u0006\u0004\b1\u0010\u0017\u001a#\u00102\u001a\u00020\u001e*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u00103\u001a#\u00104\u001a\b\u0012\u0004\u0012\u00020\b0.*\u00020\u00142\b\b\u0002\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b4\u00100\u001a\u001c\u00105\u001a\u00020\b*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0082\b¢\u0006\u0004\b5\u0010\u0017\u001a$\u00106\u001a\u00020\u001e*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0082\b¢\u0006\u0004\b6\u00103\u001a#\u00107\u001a\b\u0012\u0004\u0012\u00020\b0.*\u00020\u00142\b\b\u0002\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b7\u00100\u001a\u001b\u00108\u001a\u00020\b*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b8\u0010\u0017\u001a#\u00109\u001a\u00020\u001e*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b9\u00103\u001a'\u0010<\u001a\b\u0012\u0004\u0012\u00020\b0.*\u00020\u00142\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\b0:H\u0002¢\u0006\u0004\b<\u0010=\u001a#\u0010>\u001a\b\u0012\u0004\u0012\u00020\b0.*\u00020\u00142\b\b\u0002\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b>\u00100\u001a\u001c\u0010?\u001a\u00020\b*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bH\u0082\b¢\u0006\u0004\b?\u0010\u0017\u001a$\u0010A\u001a\u00020\u001e*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010@\u001a\u00020\bH\u0082\b¢\u0006\u0004\bA\u00103\u001a#\u0010B\u001a\b\u0012\u0004\u0012\u00020\b0.*\u00020\u00142\b\b\u0002\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\bB\u00100\u001aK\u0010E\u001a\u00020\u001e*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u00042\u0006\u00105\u001a\u00020\b2\u0006\u0010?\u001a\u00020\bH\u0002¢\u0006\u0004\bE\u0010F\u001a\u0014\u0010G\u001a\u00020\b*\u00020\u0004H\u0082\b¢\u0006\u0004\bG\u0010H\u001a#\u0010I\u001a\u00020\u001e*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010,\u001a\u00020\bH\u0002¢\u0006\u0004\bI\u00103\u001aB\u0010O\u001a\u00020J*\u0012\u0012\u0004\u0012\u00020J0\u0001j\b\u0012\u0004\u0012\u00020J`\u00022\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020J0MH\u0082\b¢\u0006\u0004\bO\u0010P\u001a5\u0010Q\u001a\u0004\u0018\u00010J*\u0012\u0012\u0004\u0012\u00020J0\u0001j\b\u0012\u0004\u0012\u00020J`\u00022\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\bH\u0002¢\u0006\u0004\bQ\u0010R\u001a3\u0010T\u001a\u00020\b*\u0012\u0012\u0004\u0012\u00020J0\u0001j\b\u0012\u0004\u0012\u00020J`\u00022\u0006\u0010S\u001a\u00020\b2\u0006\u0010L\u001a\u00020\bH\u0002¢\u0006\u0004\bT\u0010U\u001a3\u0010V\u001a\u00020\b*\u0012\u0012\u0004\u0012\u00020J0\u0001j\b\u0012\u0004\u0012\u00020J`\u00022\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\bH\u0002¢\u0006\u0004\bV\u0010U\u001a)\u0010Y\u001a\u00020\u001e*\b\u0012\u0004\u0012\u00020X0W2\u0006\u0010,\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\bY\u0010Z\u001a\u000f\u0010[\u001a\u00020\u001eH\u0000¢\u0006\u0004\b[\u0010\\\"\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_\"\u0014\u0010`\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b`\u0010a\"\u0014\u0010b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bb\u0010a\"\u0014\u0010c\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bc\u0010a\"\u0014\u0010d\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bd\u0010a\"\u0014\u0010e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\be\u0010a\"\u0014\u0010f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bf\u0010a\"\u0014\u0010g\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bg\u0010a\"\u0014\u0010h\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bh\u0010a\"\u0014\u0010i\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bi\u0010a\"\u0014\u0010j\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bj\u0010a\"\u0014\u0010k\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bk\u0010a\"\u0014\u0010l\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bl\u0010a\"\u0014\u0010m\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bm\u0010a\"\u0014\u0010n\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bn\u0010a\"\u0014\u0010o\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bo\u0010a\"\u0014\u0010p\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bp\u0010a\"\u0014\u0010q\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bq\u0010a\"\u0014\u0010r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\br\u0010a\"\u0014\u0010s\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bs\u0010a\"\u0014\u0010t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bt\u0010a\"\u0014\u0010u\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bu\u0010a\"\u0014\u0010v\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bv\u0010a\"\u0019\u0010z\u001a\u00020\b*\u00020w8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bx\u0010y¨\u0006{"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lkotlin/Function1;", "", "predicate", "fastLastOrNull", "(Ljava/util/ArrayList;Lr6/c;)Ljava/lang/Object;", "", "fastIndexOf", "(Ljava/util/ArrayList;Lr6/c;)I", "", "size", "summarize", "(Ljava/lang/String;I)Ljava/lang/String;", "Landroidx/compose/runtime/SlotTable;", "group", "Landroidx/compose/runtime/tooling/CompositionGroup;", "compositionGroupOf", "(Landroidx/compose/runtime/SlotTable;I)Landroidx/compose/runtime/tooling/CompositionGroup;", "", "address", "groupInfo", "([II)I", "isNode", "([II)Z", "nodeIndex", "hasObjectKey", "objectKeyIndex", "hasAux", "Ld6/s;", "addAux", "([II)V", "hasMark", "value", "updateMark", "([IIZ)V", "containsMark", "updateContainsMark", "containsAnyMark", "auxIndex", "slotAnchor", "countOneBits", "(I)I", "key", "len", "", "keys", "([II)Ljava/util/List;", "nodeCount", "updateNodeCount", "([III)V", "nodeCounts", "parentAnchor", "updateParentAnchor", "parentAnchors", "groupSize", "updateGroupSize", "", "indices", "slice", "([ILjava/lang/Iterable;)Ljava/util/List;", "groupSizes", "dataAnchor", "anchor", "updateDataAnchor", "dataAnchors", "hasDataKey", "hasData", "initGroup", "([IIIZZZII)V", "toBit", "(Z)I", "updateGroupKey", "Landroidx/compose/runtime/Anchor;", "index", "effectiveSize", "Lkotlin/Function0;", "block", "getOrAdd", "(Ljava/util/ArrayList;IILr6/a;)Landroidx/compose/runtime/Anchor;", "find", "(Ljava/util/ArrayList;II)Landroidx/compose/runtime/Anchor;", RequestParameters.SUBRESOURCE_LOCATION, "search", "(Ljava/util/ArrayList;II)I", "locationOf", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "add", "(Landroidx/collection/MutableIntObjectMap;II)V", "throwConcurrentModificationException", "()V", "", "EmptyLongArray", "[J", "parentAnchorPivot", "I", "Key_Offset", "GroupInfo_Offset", "ParentAnchor_Offset", "Size_Offset", "DataAnchor_Offset", "Group_Fields_Size", "NodeBit_Mask", "NodeBit_Shift", "ObjectKey_Mask", "ObjectKey_Shift", "Aux_Mask", "Aux_Shift", "Mark_Mask", "Mark_Shift", "ContainsMark_Mask", "ContainsMark_Shift", "Slots_Shift", "NodeCount_Mask", "MinGroupGrowthSize", "MinSlotsGrowthSize", "LIVE_EDIT_INVALID_KEY", "", "getFirstBitSet", "(J)I", "firstBitSet", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3963:1\n3723#1:3965\n3810#1:3966\n3810#1:3967\n3723#1:3968\n3723#1:3969\n3810#1:3990\n3810#1:3991\n3810#1:3992\n1#2:3964\n4663#3:3970\n4658#3,4:3971\n4663#3:3985\n4658#3,4:3986\n81#4,3:3975\n33#4,6:3978\n84#4:3984\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n3677#1:3965\n3694#1:3966\n3704#1:3967\n3715#1:3968\n3720#1:3969\n3802#1:3990\n3803#1:3991\n3804#1:3992\n3736#1:3970\n3736#1:3971,4\n3759#1:3985\n3759#1:3986,4\n3742#1:3975,3\n3742#1:3978,6\n3742#1:3984\n*E\n"})
/* loaded from: classes.dex */
public final class SlotTableKt {
    private static final int Aux_Mask = 268435456;
    private static final int Aux_Shift = 28;
    private static final int ContainsMark_Mask = 67108864;
    private static final int ContainsMark_Shift = 26;
    private static final int DataAnchor_Offset = 4;

    @NotNull
    private static final long[] EmptyLongArray = new long[0];
    private static final int GroupInfo_Offset = 1;
    private static final int Group_Fields_Size = 5;
    private static final int Key_Offset = 0;
    private static final int LIVE_EDIT_INVALID_KEY = -3;
    private static final int Mark_Mask = 134217728;
    private static final int Mark_Shift = 27;
    private static final int MinGroupGrowthSize = 32;
    private static final int MinSlotsGrowthSize = 32;
    private static final int NodeBit_Mask = 1073741824;
    private static final int NodeBit_Shift = 30;
    private static final int NodeCount_Mask = 67108863;
    private static final int ObjectKey_Mask = 536870912;
    private static final int ObjectKey_Shift = 29;
    private static final int ParentAnchor_Offset = 2;
    private static final int Size_Offset = 3;
    private static final int Slots_Shift = 28;
    private static final int parentAnchorPivot = -2;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void add(MutableIntObjectMap<MutableIntSet> mutableIntObjectMap, int i, int i8) {
        MutableIntSet mutableIntSet = mutableIntObjectMap.get(i);
        if (mutableIntSet == null) {
            mutableIntSet = new MutableIntSet(0, 1, null);
            mutableIntObjectMap.set(i, mutableIntSet);
        }
        mutableIntSet.add(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addAux(int[] iArr, int i) {
        int i8 = (i * 5) + 1;
        iArr[i8] = iArr[i8] | Aux_Mask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int auxIndex(int[] iArr, int i) {
        int i8 = i * 5;
        if (i8 >= iArr.length) {
            return iArr.length;
        }
        return Integer.bitCount(iArr[i8 + 1] >> 29) + iArr[i8 + 4];
    }

    @NotNull
    public static final CompositionGroup compositionGroupOf(@NotNull SlotTable slotTable, int i) {
        return new SlotTableGroup(slotTable, i, slotTable.getVersion());
    }

    private static final boolean containsAnyMark(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 201326592) != 0;
    }

    private static final boolean containsMark(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 67108864) != 0;
    }

    private static final int countOneBits(int i) {
        return Integer.bitCount(i);
    }

    private static final int dataAnchor(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> dataAnchors(int[] iArr, int i) {
        return slice(iArr, AbstractC5806u.m5256J(AbstractC5806u.m5260N(4, i), 5));
    }

    public static /* synthetic */ List dataAnchors$default(int[] iArr, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = iArr.length;
        }
        return dataAnchors(iArr, i);
    }

    private static final <T> int fastIndexOf(ArrayList<T> arrayList, InterfaceC6471c interfaceC6471c) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((Boolean) interfaceC6471c.invoke(arrayList.get(i))).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    private static final <T> T fastLastOrNull(ArrayList<T> arrayList, InterfaceC6471c interfaceC6471c) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            T t8 = arrayList.get(size);
            if (((Boolean) interfaceC6471c.invoke(t8)).booleanValue()) {
                return t8;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Anchor find(ArrayList<Anchor> arrayList, int i, int i8) {
        int iSearch = search(arrayList, i, i8);
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        return null;
    }

    private static final int getFirstBitSet(long j7) {
        return Long.numberOfTrailingZeros(j7);
    }

    private static final Anchor getOrAdd(ArrayList<Anchor> arrayList, int i, int i8, InterfaceC6469a interfaceC6469a) {
        int iSearch = search(arrayList, i, i8);
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        Anchor anchor = (Anchor) interfaceC6469a.invoke();
        arrayList.add(-(iSearch + 1), anchor);
        return anchor;
    }

    private static final int groupInfo(int[] iArr, int i) {
        return iArr[(i * 5) + 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int groupSize(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> groupSizes(int[] iArr, int i) {
        return slice(iArr, AbstractC5806u.m5256J(AbstractC5806u.m5260N(3, i), 5));
    }

    public static /* synthetic */ List groupSizes$default(int[] iArr, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = iArr.length;
        }
        return groupSizes(iArr, i);
    }

    private static final boolean hasAux(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & Aux_Mask) != 0;
    }

    private static final boolean hasMark(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & Mark_Mask) != 0;
    }

    private static final boolean hasObjectKey(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & ObjectKey_Mask) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initGroup(int[] iArr, int i, int i8, boolean z8, boolean z9, boolean z10, int i9, int i10) {
        int i11 = i * 5;
        iArr[i11] = i8;
        iArr[i11 + 1] = ((z8 ? 1 : 0) << 30) | ((z9 ? 1 : 0) << 29) | ((z10 ? 1 : 0) << 28);
        iArr[i11 + 2] = i9;
        iArr[i11 + 3] = 0;
        iArr[i11 + 4] = i10;
    }

    private static final boolean isNode(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 1073741824) != 0;
    }

    private static final int key(int[] iArr, int i) {
        return iArr[i * 5];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> keys(int[] iArr, int i) {
        return slice(iArr, AbstractC5806u.m5256J(AbstractC5806u.m5260N(0, i), 5));
    }

    public static /* synthetic */ List keys$default(int[] iArr, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = iArr.length;
        }
        return keys(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int locationOf(ArrayList<Anchor> arrayList, int i, int i8) {
        int iSearch = search(arrayList, i, i8);
        return iSearch >= 0 ? iSearch : -(iSearch + 1);
    }

    private static final int nodeCount(int[] iArr, int i) {
        return iArr[(i * 5) + 1] & 67108863;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> nodeCounts(int[] iArr, int i) {
        List<Integer> listSlice = slice(iArr, AbstractC5806u.m5256J(AbstractC5806u.m5260N(1, i), 5));
        ArrayList arrayList = new ArrayList(listSlice.size());
        int size = listSlice.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(Integer.valueOf(listSlice.get(i8).intValue() & 67108863));
        }
        return arrayList;
    }

    public static /* synthetic */ List nodeCounts$default(int[] iArr, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = iArr.length;
        }
        return nodeCounts(iArr, i);
    }

    private static final int nodeIndex(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int objectKeyIndex(int[] iArr, int i) {
        int i8 = i * 5;
        return Integer.bitCount(iArr[i8 + 1] >> 30) + iArr[i8 + 4];
    }

    private static final int parentAnchor(int[] iArr, int i) {
        return iArr[(i * 5) + 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> parentAnchors(int[] iArr, int i) {
        return slice(iArr, AbstractC5806u.m5256J(AbstractC5806u.m5260N(2, i), 5));
    }

    public static /* synthetic */ List parentAnchors$default(int[] iArr, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = iArr.length;
        }
        return parentAnchors(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int search(ArrayList<Anchor> arrayList, int i, int i8) {
        int size = arrayList.size() - 1;
        int i9 = 0;
        while (i9 <= size) {
            int i10 = (i9 + size) >>> 1;
            int location$runtime_release = arrayList.get(i10).getLocation();
            if (location$runtime_release < 0) {
                location$runtime_release += i8;
            }
            int iM5332i = AbstractC5830k.m5332i(location$runtime_release, i);
            if (iM5332i < 0) {
                i9 = i10 + 1;
            } else {
                if (iM5332i <= 0) {
                    return i10;
                }
                size = i10 - 1;
            }
        }
        return -(i9 + 1);
    }

    private static final List<Integer> slice(int[] iArr, Iterable<Integer> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int slotAnchor(int[] iArr, int i) {
        int i8 = i * 5;
        return Integer.bitCount(iArr[i8 + 1] >> 28) + iArr[i8 + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String summarize(String str, int i) {
        String strM5407A = AbstractC5862w.m5407A(AbstractC5862w.m5407A(AbstractC5862w.m5407A(AbstractC5862w.m5407A(AbstractC5862w.m5407A(AbstractC5862w.m5407A(AbstractC5862w.m5407A(AbstractC5862w.m5407A(AbstractC5862w.m5407A(AbstractC5862w.m5407A(str, "androidx.", "a."), "compose.", "c."), "runtime.", "r."), "internal.", "ι."), "ui.", "u."), "Modifier", "μ"), "material.", "m."), "Function", "λ"), "OpaqueKey", "κ"), "MutableState", "σ");
        String strSubstring = strM5407A.substring(0, Math.min(i, strM5407A.length()));
        AbstractC5830k.m5329f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void throwConcurrentModificationException() {
        throw new ConcurrentModificationException();
    }

    private static final int toBit(boolean z8) {
        return z8 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateContainsMark(int[] iArr, int i, boolean z8) {
        int i8 = (i * 5) + 1;
        iArr[i8] = ((z8 ? 1 : 0) << 26) | (iArr[i8] & (-67108865));
    }

    private static final void updateDataAnchor(int[] iArr, int i, int i8) {
        iArr[(i * 5) + 4] = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateGroupKey(int[] iArr, int i, int i8) {
        iArr[i * 5] = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateGroupSize(int[] iArr, int i, int i8) {
        iArr[(i * 5) + 3] = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateMark(int[] iArr, int i, boolean z8) {
        int i8 = (i * 5) + 1;
        iArr[i8] = ((z8 ? 1 : 0) << 27) | (iArr[i8] & (-134217729));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateNodeCount(int[] iArr, int i, int i8) {
        if (i8 >= 0) {
        }
        int i9 = (i * 5) + 1;
        iArr[i9] = i8 | (iArr[i9] & (-67108864));
    }

    private static final void updateParentAnchor(int[] iArr, int i, int i8) {
        iArr[(i * 5) + 2] = i8;
    }
}
