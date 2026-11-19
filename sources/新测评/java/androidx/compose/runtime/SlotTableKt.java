package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@Metadata(m13557d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u001a\u0011\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0082\b\u001a\b\u0010\u001f\u001a\u00020 H\u0000\u001a\"\u0010!\u001a\u00020 *\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0002\u001a\u0014\u0010%\u001a\u00020 *\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0002\u001a\u0014\u0010(\u001a\u00020\u0001*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0002\u001a\u0014\u0010)\u001a\u00020**\u00020+2\u0006\u0010,\u001a\u00020\u0001H\u0000\u001a\u0015\u0010-\u001a\u00020.*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001a\u0015\u0010/\u001a\u00020.*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001a\u0015\u00100\u001a\u00020\u0001*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001a\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u000102*\u00020&2\b\b\u0002\u00103\u001a\u00020\u0001H\u0002\u001a7\u00104\u001a\u00020\u0001\"\u0004\b\u0000\u00105*\u0012\u0012\u0004\u0012\u0002H506j\b\u0012\u0004\u0012\u0002H5`72\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u0002H5\u0012\u0004\u0012\u00020.09H\u0082\b\u001a>\u0010:\u001a\u0004\u0018\u0001H5\"\u0004\b\u0000\u00105*\u0012\u0012\u0004\u0012\u0002H506j\b\u0012\u0004\u0012\u0002H5`72\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u0002H5\u0012\u0004\u0012\u00020.09H\u0082\b¢\u0006\u0002\u0010;\u001a.\u0010<\u001a\u0004\u0018\u00010=*\u0012\u0012\u0004\u0012\u00020=06j\b\u0012\u0004\u0012\u00020=`72\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u0001H\u0002\u001a;\u0010@\u001a\u00020=*\u0012\u0012\u0004\u0012\u00020=06j\b\u0012\u0004\u0012\u00020=`72\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u00012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020=0BH\u0082\b\u001a\u0015\u0010C\u001a\u00020\u0001*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001a\u0014\u0010D\u001a\u00020\u0001*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0002\u001a\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000102*\u00020&2\b\b\u0002\u00103\u001a\u00020\u0001H\u0002\u001a\u0015\u0010F\u001a\u00020.*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001a\u0015\u0010G\u001a\u00020.*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001a\u0015\u0010H\u001a\u00020.*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001aD\u0010I\u001a\u00020 *\u00020&2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00012\u0006\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020.2\u0006\u0010L\u001a\u00020.2\u0006\u0010M\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u0001H\u0002\u001a\u0015\u0010J\u001a\u00020.*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001a\u0015\u0010$\u001a\u00020\u0001*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001a\u001c\u0010N\u001a\b\u0012\u0004\u0012\u00020\u000102*\u00020&2\b\b\u0002\u00103\u001a\u00020\u0001H\u0002\u001a,\u0010O\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020=06j\b\u0012\u0004\u0012\u00020=`72\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u0001H\u0002\u001a\u0015\u0010P\u001a\u00020\u0001*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001a\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u000102*\u00020&2\b\b\u0002\u00103\u001a\u00020\u0001H\u0002\u001a\u0015\u0010R\u001a\u00020\u0001*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001a\u0014\u0010S\u001a\u00020\u0001*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0002\u001a\u0015\u0010M\u001a\u00020\u0001*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0082\b\u001a\u001c\u0010T\u001a\b\u0012\u0004\u0012\u00020\u000102*\u00020&2\b\b\u0002\u00103\u001a\u00020\u0001H\u0002\u001a,\u0010U\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020=06j\b\u0012\u0004\u0012\u00020=`72\u0006\u0010V\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u0001H\u0002\u001a \u0010W\u001a\b\u0012\u0004\u0012\u00020\u000102*\u00020&2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00010YH\u0002\u001a\u0014\u0010Z\u001a\u00020\u0001*\u00020&2\u0006\u0010'\u001a\u00020\u0001H\u0002\u001a\u0014\u0010[\u001a\u00020\\*\u00020\\2\u0006\u0010]\u001a\u00020\u0001H\u0002\u001a\r\u0010^\u001a\u00020\u0001*\u00020.H\u0082\b\u001a\u001c\u0010_\u001a\u00020 *\u00020&2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020.H\u0002\u001a\u001d\u0010`\u001a\u00020 *\u00020&2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010a\u001a\u00020\u0001H\u0082\b\u001a\u001c\u0010b\u001a\u00020 *\u00020&2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u0001H\u0002\u001a\u001c\u0010c\u001a\u00020 *\u00020&2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0002\u001a\u001c\u0010d\u001a\u00020 *\u00020&2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020.H\u0002\u001a\u001c\u0010e\u001a\u00020 *\u00020&2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0002\u001a\u001d\u0010f\u001a\u00020 *\u00020&2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0019\u001a\u00020\u0001*\u00020\u001a8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006g"}, m13558d2 = {"Aux_Mask", "", "Aux_Shift", "ContainsMark_Mask", "ContainsMark_Shift", "DataAnchor_Offset", "EmptyLongArray", "", "GroupInfo_Offset", "Group_Fields_Size", "Key_Offset", "LIVE_EDIT_INVALID_KEY", "Mark_Mask", "Mark_Shift", "MinGroupGrowthSize", "MinSlotsGrowthSize", "NodeBit_Mask", "NodeBit_Shift", "NodeCount_Mask", "ObjectKey_Mask", "ObjectKey_Shift", "ParentAnchor_Offset", "Size_Offset", "Slots_Shift", "parentAnchorPivot", "firstBitSet", "", "getFirstBitSet", "(J)I", "countOneBits", "value", "throwConcurrentModificationException", "", "add", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "key", "addAux", "", "address", "auxIndex", "compositionGroupOf", "Landroidx/compose/runtime/tooling/CompositionGroup;", "Landroidx/compose/runtime/SlotTable;", "group", "containsAnyMark", "", "containsMark", "dataAnchor", "dataAnchors", "", "len", "fastIndexOf", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "predicate", "Lkotlin/Function1;", "fastLastOrNull", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "find", "Landroidx/compose/runtime/Anchor;", "index", "effectiveSize", "getOrAdd", "block", "Lkotlin/Function0;", "groupInfo", "groupSize", "groupSizes", "hasAux", "hasMark", "hasObjectKey", "initGroup", "isNode", "hasDataKey", "hasData", "parentAnchor", "keys", "locationOf", "nodeCount", "nodeCounts", "nodeIndex", "objectKeyIndex", "parentAnchors", "search", RequestParameters.SUBRESOURCE_LOCATION, "slice", "indices", "", "slotAnchor", "summarize", "", "size", "toBit", "updateContainsMark", "updateDataAnchor", "anchor", "updateGroupKey", "updateGroupSize", "updateMark", "updateNodeCount", "updateParentAnchor", "runtime_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3963:1\n3723#1:3965\n3810#1:3966\n3810#1:3967\n3723#1:3968\n3723#1:3969\n3810#1:3990\n3810#1:3991\n3810#1:3992\n1#2:3964\n4663#3:3970\n4658#3,4:3971\n4663#3:3985\n4658#3,4:3986\n81#4,3:3975\n33#4,6:3978\n84#4:3984\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n3677#1:3965\n3694#1:3966\n3704#1:3967\n3715#1:3968\n3720#1:3969\n3802#1:3990\n3803#1:3991\n3804#1:3992\n3736#1:3970\n3736#1:3971,4\n3759#1:3985\n3759#1:3986,4\n3742#1:3975,3\n3742#1:3978,6\n3742#1:3984\n*E\n"})
/* loaded from: classes2.dex */
public final class SlotTableKt {
    private static final int Aux_Mask = 268435456;
    private static final int Aux_Shift = 28;
    private static final int ContainsMark_Mask = 67108864;
    private static final int ContainsMark_Shift = 26;
    private static final int DataAnchor_Offset = 4;
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
    public static final void add(MutableIntObjectMap<MutableIntSet> mutableIntObjectMap, int i10, int i11) {
        MutableIntSet mutableIntSet = mutableIntObjectMap.get(i10);
        if (mutableIntSet == null) {
            mutableIntSet = new MutableIntSet(0, 1, null);
            mutableIntObjectMap.set(i10, mutableIntSet);
        }
        mutableIntSet.add(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addAux(int[] iArr, int i10) {
        int i11 = (i10 * 5) + 1;
        iArr[i11] = iArr[i11] | Aux_Mask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int auxIndex(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return i11 >= iArr.length ? iArr.length : iArr[i11 + 4] + Integer.bitCount(iArr[i11 + 1] >> 29);
    }

    public static final CompositionGroup compositionGroupOf(SlotTable slotTable, int i10) {
        return new SlotTableGroup(slotTable, i10, slotTable.getVersion());
    }

    private static final boolean containsAnyMark(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 201326592) != 0;
    }

    private static final boolean containsMark(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 67108864) != 0;
    }

    private static final int countOneBits(int i10) {
        return Integer.bitCount(i10);
    }

    private static final int dataAnchor(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> dataAnchors(int[] iArr, int i10) {
        return slice(iArr, RangesKt.step(RangesKt.until(4, i10), 5));
    }

    public static /* synthetic */ List dataAnchors$default(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return dataAnchors(iArr, i10);
    }

    private static final <T> int fastIndexOf(ArrayList<T> arrayList, Function1<? super T, Boolean> function1) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (function1.invoke(arrayList.get(i10)).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    private static final <T> T fastLastOrNull(ArrayList<T> arrayList, Function1<? super T, Boolean> function1) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            T t10 = arrayList.get(size);
            if (function1.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Anchor find(ArrayList<Anchor> arrayList, int i10, int i11) {
        int iSearch = search(arrayList, i10, i11);
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        return null;
    }

    private static final int getFirstBitSet(long j10) {
        return Long.numberOfTrailingZeros(j10);
    }

    private static final Anchor getOrAdd(ArrayList<Anchor> arrayList, int i10, int i11, Function0<Anchor> function0) {
        int iSearch = search(arrayList, i10, i11);
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        Anchor anchorInvoke = function0.invoke();
        arrayList.add(-(iSearch + 1), anchorInvoke);
        return anchorInvoke;
    }

    private static final int groupInfo(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int groupSize(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> groupSizes(int[] iArr, int i10) {
        return slice(iArr, RangesKt.step(RangesKt.until(3, i10), 5));
    }

    public static /* synthetic */ List groupSizes$default(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return groupSizes(iArr, i10);
    }

    private static final boolean hasAux(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & Aux_Mask) != 0;
    }

    private static final boolean hasMark(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & Mark_Mask) != 0;
    }

    private static final boolean hasObjectKey(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & ObjectKey_Mask) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initGroup(int[] iArr, int i10, int i11, boolean z9, boolean z10, boolean z11, int i12, int i13) {
        int i14 = i10 * 5;
        iArr[i14] = i11;
        iArr[i14 + 1] = ((z9 ? 1 : 0) << 30) | ((z10 ? 1 : 0) << 29) | ((z11 ? 1 : 0) << 28);
        iArr[i14 + 2] = i12;
        iArr[i14 + 3] = 0;
        iArr[i14 + 4] = i13;
    }

    private static final boolean isNode(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 1073741824) != 0;
    }

    private static final int key(int[] iArr, int i10) {
        return iArr[i10 * 5];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> keys(int[] iArr, int i10) {
        return slice(iArr, RangesKt.step(RangesKt.until(0, i10), 5));
    }

    public static /* synthetic */ List keys$default(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return keys(iArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int locationOf(ArrayList<Anchor> arrayList, int i10, int i11) {
        int iSearch = search(arrayList, i10, i11);
        return iSearch >= 0 ? iSearch : -(iSearch + 1);
    }

    private static final int nodeCount(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 1] & 67108863;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> nodeCounts(int[] iArr, int i10) {
        List<Integer> listSlice = slice(iArr, RangesKt.step(RangesKt.until(1, i10), 5));
        ArrayList arrayList = new ArrayList(listSlice.size());
        int size = listSlice.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(Integer.valueOf(listSlice.get(i11).intValue() & 67108863));
        }
        return arrayList;
    }

    public static /* synthetic */ List nodeCounts$default(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return nodeCounts(iArr, i10);
    }

    private static final int nodeIndex(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int objectKeyIndex(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return iArr[i11 + 4] + Integer.bitCount(iArr[i11 + 1] >> 30);
    }

    private static final int parentAnchor(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> parentAnchors(int[] iArr, int i10) {
        return slice(iArr, RangesKt.step(RangesKt.until(2, i10), 5));
    }

    public static /* synthetic */ List parentAnchors$default(int[] iArr, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = iArr.length;
        }
        return parentAnchors(iArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int search(ArrayList<Anchor> arrayList, int i10, int i11) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int location$runtime_release = arrayList.get(i13).getLocation();
            if (location$runtime_release < 0) {
                location$runtime_release += i11;
            }
            int iCompare = Intrinsics.compare(location$runtime_release, i10);
            if (iCompare < 0) {
                i12 = i13 + 1;
            } else {
                if (iCompare <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
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
    public static final int slotAnchor(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return iArr[i11 + 4] + Integer.bitCount(iArr[i11 + 1] >> 28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String summarize(String str, int i10) {
        String strReplace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(str, "androidx.", "a.", false, 4, (Object) null), "compose.", "c.", false, 4, (Object) null), "runtime.", "r.", false, 4, (Object) null), "internal.", "ι.", false, 4, (Object) null), "ui.", "u.", false, 4, (Object) null), "Modifier", "μ", false, 4, (Object) null), "material.", "m.", false, 4, (Object) null), "Function", "λ", false, 4, (Object) null), "OpaqueKey", "κ", false, 4, (Object) null), "MutableState", "σ", false, 4, (Object) null);
        String strSubstring = strReplace$default.substring(0, Math.min(i10, strReplace$default.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void throwConcurrentModificationException() {
        throw new ConcurrentModificationException();
    }

    private static final int toBit(boolean z9) {
        return z9 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateContainsMark(int[] iArr, int i10, boolean z9) {
        int i11 = (i10 * 5) + 1;
        iArr[i11] = ((z9 ? 1 : 0) << 26) | (iArr[i11] & (-67108865));
    }

    private static final void updateDataAnchor(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 4] = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateGroupKey(int[] iArr, int i10, int i11) {
        iArr[i10 * 5] = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateGroupSize(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 3] = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateMark(int[] iArr, int i10, boolean z9) {
        int i11 = (i10 * 5) + 1;
        iArr[i11] = ((z9 ? 1 : 0) << 27) | (iArr[i11] & (-134217729));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateNodeCount(int[] iArr, int i10, int i11) {
        if (i11 >= 0) {
        }
        int i12 = (i10 * 5) + 1;
        iArr[i12] = i11 | (iArr[i12] & (-67108864));
    }

    private static final void updateParentAnchor(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 2] = i11;
    }
}
