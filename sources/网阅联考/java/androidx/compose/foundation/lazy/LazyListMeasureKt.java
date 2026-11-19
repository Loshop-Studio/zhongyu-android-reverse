package androidx.compose.foundation.lazy;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(m5174d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008c\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bH\u0002\u001aL\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020'H\u0002\u001aS\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020'H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,\u001aø\u0001\u0010-\u001a\u00020.2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020#2\u0006\u0010 \u001a\u00020!2\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00022\u0006\u00103\u001a\u00020*2\u0006\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u0010\u0014\u001a\u00020\u00042\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020;2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020'2/\u0010<\u001a+\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020@0>¢\u0006\u0002\bA\u0012\u0004\u0012\u00020B0=H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010D\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006E"}, m5175d2 = {"EmptyRange", "Lkotlin/Pair;", "", "notInEmptyRange", "", "getNotInEmptyRange", "(I)Z", "calculateItemsOffsets", "", "Landroidx/compose/foundation/lazy/LazyListPositionedItem;", "items", "", "Landroidx/compose/foundation/lazy/LazyMeasuredItem;", "extraItemsBefore", "extraItemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", "isVertical", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "reverseLayout", "density", "Landroidx/compose/ui/unit/Density;", "createItemsAfterList", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "visibleItems", "measuredItemProvider", "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemsCount", "beyondBoundsItemCount", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "createItemsBeforeList", "currentFirstItemIndex", "Landroidx/compose/foundation/lazy/DataIndex;", "createItemsBeforeList-tv8sHfA", "(Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;ILandroidx/compose/foundation/lazy/LazyMeasuredItemProvider;Landroidx/compose/foundation/lazy/LazyListItemProvider;IILandroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;)Ljava/util/List;", "measureLazyList", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenItems", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "scrollToBeConsumed", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "headerIndexes", "placementAnimator", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "layout", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measureLazyList-Hh3qtAg", "(ILandroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;IIIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;ILandroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n+ 2 DataIndex.kt\nandroidx/compose/foundation/lazy/DataIndex\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n*L\n1#1,515:1\n30#2:516\n25#2:521\n27#2:523\n25#2:524\n30#2:525\n33#3,4:517\n38#3:522\n33#3,6:526\n33#3,6:532\n33#3,4:541\n38#3:547\n33#3,6:549\n33#3,6:555\n33#3,6:561\n33#3,6:567\n33#3,6:573\n36#4,3:538\n39#4,2:545\n41#4:548\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n*L\n127#1:516\n152#1:521\n169#1:523\n176#1:524\n186#1:525\n151#1:517,4\n151#1:522\n248#1:526,6\n264#1:532,6\n330#1:541,4\n330#1:547\n376#1:549,6\n419#1:555,6\n494#1:561,6\n500#1:567,6\n505#1:573,6\n330#1:538,3\n330#1:545,2\n330#1:548\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListMeasureKt {
    private static final Pair<Integer, Integer> EmptyRange = TuplesKt.m5182to(Integer.MIN_VALUE, Integer.MIN_VALUE);

    private static final List<LazyListPositionedItem> calculateItemsOffsets(List<LazyMeasuredItem> list, List<LazyMeasuredItem> list2, List<LazyMeasuredItem> list3, int i4, int i5, int i6, int i7, int i8, boolean z3, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z4, Density density) {
        int i9 = z3 ? i5 : i4;
        boolean z5 = i6 < Math.min(i9, i7);
        if (z5) {
            if (!(i8 == 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z5) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int size = list.size();
            int[] iArr = new int[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = list.get(calculateItemsOffsets$reverseAware(i10, z4, size)).getSize();
            }
            int[] iArr2 = new int[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr2[i11] = 0;
            }
            if (z3) {
                if (vertical == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                vertical.arrange(density, i9, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                horizontal.arrange(density, i9, iArr, LayoutDirection.Ltr, iArr2);
            }
            IntProgression indices = ArraysKt___ArraysKt.getIndices(iArr2);
            if (z4) {
                indices = RangesKt___RangesKt.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int size2 = iArr2[first];
                    LazyMeasuredItem lazyMeasuredItem = list.get(calculateItemsOffsets$reverseAware(first, z4, size));
                    if (z4) {
                        size2 = (i9 - size2) - lazyMeasuredItem.getSize();
                    }
                    arrayList.add(lazyMeasuredItem.position(size2, i4, i5));
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size();
            int sizeWithSpacings = i8;
            for (int i12 = 0; i12 < size3; i12++) {
                LazyMeasuredItem lazyMeasuredItem2 = list2.get(i12);
                sizeWithSpacings -= lazyMeasuredItem2.getSizeWithSpacings();
                arrayList.add(lazyMeasuredItem2.position(sizeWithSpacings, i4, i5));
            }
            int size4 = list.size();
            int sizeWithSpacings2 = i8;
            for (int i13 = 0; i13 < size4; i13++) {
                LazyMeasuredItem lazyMeasuredItem3 = list.get(i13);
                arrayList.add(lazyMeasuredItem3.position(sizeWithSpacings2, i4, i5));
                sizeWithSpacings2 += lazyMeasuredItem3.getSizeWithSpacings();
            }
            int size5 = list3.size();
            for (int i14 = 0; i14 < size5; i14++) {
                LazyMeasuredItem lazyMeasuredItem4 = list3.get(i14);
                arrayList.add(lazyMeasuredItem4.position(sizeWithSpacings2, i4, i5));
                sizeWithSpacings2 += lazyMeasuredItem4.getSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i4, boolean z3, int i5) {
        return !z3 ? i4 : (i5 - i4) - 1;
    }

    private static final List<LazyMeasuredItem> createItemsAfterList(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, List<LazyMeasuredItem> list, LazyMeasuredItemProvider lazyMeasuredItemProvider, LazyListItemProvider lazyListItemProvider, int i4, int i5, LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        int index = ((LazyMeasuredItem) CollectionsKt___CollectionsKt.last((List) list)).getIndex();
        if (lazyListBeyondBoundsInfo.hasIntervals()) {
            index = Math.max(createItemsAfterList$endIndex(lazyListBeyondBoundsInfo, i4), index);
        }
        int iMin = Math.min(index + i5, i4 - 1);
        int index2 = ((LazyMeasuredItem) CollectionsKt___CollectionsKt.last((List) list)).getIndex() + 1;
        if (index2 <= iMin) {
            while (true) {
                createItemsAfterList$addItem(objectRef, lazyMeasuredItemProvider, index2);
                if (index2 == iMin) {
                    break;
                }
                index2++;
            }
        }
        int size = lazyLayoutPinnedItemList.size();
        for (int i6 = 0; i6 < size; i6++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = lazyLayoutPinnedItemList.get(i6);
            int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyListItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            if (iFindIndexByKey > iMin && iFindIndexByKey < i4) {
                createItemsAfterList$addItem(objectRef, lazyMeasuredItemProvider, iFindIndexByKey);
            }
        }
        List<LazyMeasuredItem> list2 = (List) objectRef.element;
        return list2 == null ? CollectionsKt__CollectionsKt.emptyList() : list2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.ArrayList] */
    private static final void createItemsAfterList$addItem(Ref.ObjectRef<List<LazyMeasuredItem>> objectRef, LazyMeasuredItemProvider lazyMeasuredItemProvider, int i4) {
        if (objectRef.element == null) {
            objectRef.element = new ArrayList();
        }
        List<LazyMeasuredItem> list = objectRef.element;
        if (list == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        list.add(lazyMeasuredItemProvider.m7435getAndMeasureZjPyQlc(DataIndex.m7404constructorimpl(i4)));
    }

    private static final int createItemsAfterList$endIndex(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, int i4) {
        return Math.min(lazyListBeyondBoundsInfo.getEnd(), i4 - 1);
    }

    /* renamed from: createItemsBeforeList-tv8sHfA, reason: not valid java name */
    private static final List<LazyMeasuredItem> m7424createItemsBeforeListtv8sHfA(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, int i4, LazyMeasuredItemProvider lazyMeasuredItemProvider, LazyListItemProvider lazyListItemProvider, int i5, int i6, LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        int iMin = lazyListBeyondBoundsInfo.hasIntervals() ? Math.min(createItemsBeforeList_tv8sHfA$startIndex(lazyListBeyondBoundsInfo, i5), i4) : i4;
        int iMax = Math.max(0, iMin - i6);
        int i7 = i4 - 1;
        if (iMax <= i7) {
            while (true) {
                createItemsBeforeList_tv8sHfA$addItem$5(objectRef, lazyMeasuredItemProvider, i7);
                if (i7 == iMax) {
                    break;
                }
                i7--;
            }
        }
        int size = lazyLayoutPinnedItemList.size();
        for (int i8 = 0; i8 < size; i8++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = lazyLayoutPinnedItemList.get(i8);
            int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyListItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            if (iFindIndexByKey < iMax) {
                createItemsBeforeList_tv8sHfA$addItem$5(objectRef, lazyMeasuredItemProvider, iFindIndexByKey);
            }
        }
        List<LazyMeasuredItem> list = (List) objectRef.element;
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.ArrayList] */
    private static final void createItemsBeforeList_tv8sHfA$addItem$5(Ref.ObjectRef<List<LazyMeasuredItem>> objectRef, LazyMeasuredItemProvider lazyMeasuredItemProvider, int i4) {
        if (objectRef.element == null) {
            objectRef.element = new ArrayList();
        }
        List<LazyMeasuredItem> list = objectRef.element;
        if (list == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        list.add(lazyMeasuredItemProvider.m7435getAndMeasureZjPyQlc(DataIndex.m7404constructorimpl(i4)));
    }

    private static final int createItemsBeforeList_tv8sHfA$startIndex(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, int i4) {
        return Math.min(lazyListBeyondBoundsInfo.getStart(), i4 - 1);
    }

    private static final boolean getNotInEmptyRange(int i4) {
        return i4 != Integer.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c6 A[PHI: r2 r5 r6 r17 r20
      0x01c6: PHI (r2v9 int) = (r2v8 int), (r2v31 int) binds: [B:55:0x0187, B:62:0x01bb] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r5v7 int) = (r5v6 int), (r5v19 int) binds: [B:55:0x0187, B:62:0x01bb] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r6v4 int) = (r6v3 int), (r6v20 int) binds: [B:55:0x0187, B:62:0x01bb] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r17v3 int) = (r17v2 int), (r17v7 int) binds: [B:55:0x0187, B:62:0x01bb] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r20v4 int) = (r20v3 int), (r20v7 int) binds: [B:55:0x0187, B:62:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: measureLazyList-Hh3qtAg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.lazy.LazyListMeasureResult m7425measureLazyListHh3qtAg(int r32, androidx.compose.foundation.lazy.LazyListItemProvider r33, androidx.compose.foundation.lazy.LazyMeasuredItemProvider r34, int r35, int r36, int r37, int r38, int r39, int r40, float r41, long r42, boolean r44, java.util.List<java.lang.Integer> r45, androidx.compose.foundation.layout.Arrangement.Vertical r46, androidx.compose.foundation.layout.Arrangement.Horizontal r47, boolean r48, androidx.compose.p006ui.unit.Density r49, androidx.compose.foundation.lazy.LazyListItemPlacementAnimator r50, androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo r51, int r52, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList r53, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>, ? extends androidx.compose.p006ui.layout.MeasureResult> r54) {
        /*
            Method dump skipped, instructions count: 951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListMeasureKt.m7425measureLazyListHh3qtAg(int, androidx.compose.foundation.lazy.LazyListItemProvider, androidx.compose.foundation.lazy.LazyMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, java.util.List, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.LazyListItemPlacementAnimator, androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo, int, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList, kotlin.jvm.functions.Function3):androidx.compose.foundation.lazy.LazyListMeasureResult");
    }
}
