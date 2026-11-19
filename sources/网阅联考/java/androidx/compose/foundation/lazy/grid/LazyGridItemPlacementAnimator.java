package androidx.compose.foundation.lazy.grid;

import androidx.compose.p006ui.unit.Constraints;
import androidx.compose.p006ui.unit.IntOffset;
import androidx.compose.p006ui.unit.IntOffsetKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m5174d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00162\b\b\u0002\u0010!\u001a\u00020\bH\u0002J;\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u001cø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J<\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u00020+J\u0018\u00105\u001a\u00020+2\u0006\u0010 \u001a\u00020\u00162\u0006\u00106\u001a\u00020\rH\u0002J\u0014\u00107\u001a\u00020\u0005*\u00020\r2\u0006\u00108\u001a\u00020\bH\u0002J\u001c\u00109\u001a\u00020\u001c*\u00020\bH\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010;R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u000fj\b\u0012\u0004\u0012\u00020\u0001`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0018\u001a\u00020\b*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\b*\u00020\u001c8BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, m5175d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "isVertical", "", "(Lkotlinx/coroutines/CoroutineScope;Z)V", "firstVisibleIndex", "", "keyToIndexMap", "", "keyToItemInfoMap", "", "Landroidx/compose/foundation/lazy/grid/ItemInfo;", "movingAwayKeys", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "movingAwayToEndBound", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "movingAwayToStartBound", "movingInFromEndBound", "Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "movingInFromStartBound", "line", "getLine", "(Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;)I", "mainAxis", "Landroidx/compose/ui/unit/IntOffset;", "getMainAxis--gyyYBs", "(J)I", "createItemInfo", "item", "mainAxisOffset", "getAnimatedOffset", "key", "placeableIndex", "minOffset", "maxOffset", "rawOffset", "getAnimatedOffset-YT5a7pE", "(Ljava/lang/Object;IIIJ)J", "onMeasured", "", "consumedScroll", "layoutWidth", "layoutHeight", "positionedItems", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "reset", "startAnimationsIfNeeded", "itemInfo", "isWithinBounds", "mainAxisLayoutSize", "toOffset", "toOffset-Bjo55l4", "(I)J", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyGridItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,412:1\n101#2,2:413\n33#2,6:415\n103#2:421\n33#2,4:422\n38#2:427\n33#2,6:430\n33#2,6:438\n101#2,2:445\n33#2,6:447\n103#2:453\n33#2,6:457\n33#2,6:465\n69#2,4:474\n74#2:480\n101#2,2:481\n33#2,4:483\n38#2:488\n103#2:489\n86#3:426\n86#3:471\n86#3:472\n79#3:473\n86#3:478\n79#3:479\n86#3:487\n1011#4,2:428\n1002#4,2:436\n1855#4:444\n1856#4:454\n1011#4,2:455\n1002#4,2:463\n*S KotlinDebug\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n77#1:413,2\n77#1:415,6\n77#1:421\n96#1:422,4\n96#1:427\n131#1:430,6\n149#1:438,6\n171#1:445,2\n171#1:447,6\n171#1:453\n199#1:457,6\n227#1:465,6\n338#1:474,4\n338#1:480\n376#1:481,2\n376#1:483,4\n376#1:488\n376#1:489\n116#1:426\n272#1:471\n273#1:472\n332#1:473\n339#1:478\n344#1:479\n377#1:487\n128#1:428,2\n148#1:436,2\n164#1:444\n164#1:454\n198#1:455,2\n226#1:463,2\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridItemPlacementAnimator {
    private int firstVisibleIndex;
    private final boolean isVertical;
    private Map<Object, Integer> keyToIndexMap;
    private final Map<Object, ItemInfo> keyToItemInfoMap;
    private final LinkedHashSet<Object> movingAwayKeys;
    private final List<LazyGridMeasuredItem> movingAwayToEndBound;
    private final List<LazyGridMeasuredItem> movingAwayToStartBound;
    private final List<LazyGridPositionedItem> movingInFromEndBound;
    private final List<LazyGridPositionedItem> movingInFromStartBound;
    private final CoroutineScope scope;

    public LazyGridItemPlacementAnimator(CoroutineScope scope, boolean z3) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        this.isVertical = z3;
        this.keyToItemInfoMap = new LinkedHashMap();
        this.keyToIndexMap = MapsKt__MapsKt.emptyMap();
        this.movingAwayKeys = new LinkedHashSet<>();
        this.movingInFromStartBound = new ArrayList();
        this.movingInFromEndBound = new ArrayList();
        this.movingAwayToStartBound = new ArrayList();
        this.movingAwayToEndBound = new ArrayList();
    }

    private final ItemInfo createItemInfo(LazyGridPositionedItem item, int mainAxisOffset) {
        ItemInfo itemInfo = new ItemInfo(item.getCrossAxisSize(), item.getCrossAxisOffset());
        long jM11639copyiSbpLlY$default = this.isVertical ? IntOffset.m11639copyiSbpLlY$default(item.getOffset(), 0, mainAxisOffset, 1, null) : IntOffset.m11639copyiSbpLlY$default(item.getOffset(), mainAxisOffset, 0, 2, null);
        int placeablesCount = item.getPlaceablesCount();
        for (int i4 = 0; i4 < placeablesCount; i4++) {
            itemInfo.getPlaceables().add(new PlaceableInfo(jM11639copyiSbpLlY$default, item.getMainAxisSize(i4), null));
        }
        return itemInfo;
    }

    public static /* synthetic */ ItemInfo createItemInfo$default(LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, LazyGridPositionedItem lazyGridPositionedItem, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = lazyGridItemPlacementAnimator.m7471getMainAxisgyyYBs(lazyGridPositionedItem.getOffset());
        }
        return lazyGridItemPlacementAnimator.createItemInfo(lazyGridPositionedItem, i4);
    }

    private final int getLine(LazyGridPositionedItem lazyGridPositionedItem) {
        return this.isVertical ? lazyGridPositionedItem.getRow() : lazyGridPositionedItem.getColumn();
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m7471getMainAxisgyyYBs(long j4) {
        return this.isVertical ? IntOffset.m11644getYimpl(j4) : IntOffset.m11643getXimpl(j4);
    }

    private final boolean isWithinBounds(ItemInfo itemInfo, int i4) {
        List<PlaceableInfo> placeables = itemInfo.getPlaceables();
        int size = placeables.size();
        for (int i5 = 0; i5 < size; i5++) {
            PlaceableInfo placeableInfo = placeables.get(i5);
            long targetOffset = placeableInfo.getTargetOffset();
            long notAnimatableDelta = itemInfo.getNotAnimatableDelta();
            long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(targetOffset) + IntOffset.m11643getXimpl(notAnimatableDelta), IntOffset.m11644getYimpl(targetOffset) + IntOffset.m11644getYimpl(notAnimatableDelta));
            if (m7471getMainAxisgyyYBs(jIntOffset) + placeableInfo.getMainAxisSize() > 0 && m7471getMainAxisgyyYBs(jIntOffset) < i4) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void startAnimationsIfNeeded(androidx.compose.foundation.lazy.grid.LazyGridPositionedItem r18, androidx.compose.foundation.lazy.grid.ItemInfo r19) {
        /*
            r17 = this;
            r0 = r18
        L2:
            java.util.List r1 = r19.getPlaceables()
            int r1 = r1.size()
            int r2 = r18.getPlaceablesCount()
            if (r1 <= r2) goto L18
            java.util.List r1 = r19.getPlaceables()
            kotlin.collections.CollectionsKt.removeLast(r1)
            goto L2
        L18:
            java.util.List r1 = r19.getPlaceables()
            int r1 = r1.size()
            int r2 = r18.getPlaceablesCount()
            r3 = 0
            if (r1 >= r2) goto L5e
            java.util.List r1 = r19.getPlaceables()
            int r1 = r1.size()
            long r4 = r18.getOffset()
            java.util.List r2 = r19.getPlaceables()
            androidx.compose.foundation.lazy.grid.PlaceableInfo r6 = new androidx.compose.foundation.lazy.grid.PlaceableInfo
            long r7 = r19.getNotAnimatableDelta()
            int r9 = androidx.compose.p006ui.unit.IntOffset.m11643getXimpl(r4)
            int r10 = androidx.compose.p006ui.unit.IntOffset.m11643getXimpl(r7)
            int r9 = r9 - r10
            int r4 = androidx.compose.p006ui.unit.IntOffset.m11644getYimpl(r4)
            int r5 = androidx.compose.p006ui.unit.IntOffset.m11644getYimpl(r7)
            int r4 = r4 - r5
            long r4 = androidx.compose.p006ui.unit.IntOffsetKt.IntOffset(r9, r4)
            int r1 = r0.getMainAxisSize(r1)
            r6.<init>(r4, r1, r3)
            r2.add(r6)
            goto L18
        L5e:
            java.util.List r1 = r19.getPlaceables()
            int r2 = r1.size()
            r4 = 0
        L67:
            if (r4 >= r2) goto Ldc
            java.lang.Object r5 = r1.get(r4)
            androidx.compose.foundation.lazy.grid.PlaceableInfo r5 = (androidx.compose.foundation.lazy.grid.PlaceableInfo) r5
            long r6 = r5.getTargetOffset()
            long r8 = r19.getNotAnimatableDelta()
            int r10 = androidx.compose.p006ui.unit.IntOffset.m11643getXimpl(r6)
            int r11 = androidx.compose.p006ui.unit.IntOffset.m11643getXimpl(r8)
            int r10 = r10 + r11
            int r6 = androidx.compose.p006ui.unit.IntOffset.m11644getYimpl(r6)
            int r7 = androidx.compose.p006ui.unit.IntOffset.m11644getYimpl(r8)
            int r6 = r6 + r7
            long r6 = androidx.compose.p006ui.unit.IntOffsetKt.IntOffset(r10, r6)
            long r8 = r18.getOffset()
            int r10 = r0.getMainAxisSize(r4)
            r5.setMainAxisSize(r10)
            androidx.compose.animation.core.FiniteAnimationSpec r10 = r0.getAnimationSpec(r4)
            boolean r6 = androidx.compose.p006ui.unit.IntOffset.m11642equalsimpl0(r6, r8)
            if (r6 != 0) goto Ld7
            long r6 = r19.getNotAnimatableDelta()
            int r11 = androidx.compose.p006ui.unit.IntOffset.m11643getXimpl(r8)
            int r12 = androidx.compose.p006ui.unit.IntOffset.m11643getXimpl(r6)
            int r11 = r11 - r12
            int r8 = androidx.compose.p006ui.unit.IntOffset.m11644getYimpl(r8)
            int r6 = androidx.compose.p006ui.unit.IntOffset.m11644getYimpl(r6)
            int r8 = r8 - r6
            long r6 = androidx.compose.p006ui.unit.IntOffsetKt.IntOffset(r11, r8)
            r5.m7510setTargetOffsetgyyYBs(r6)
            if (r10 == 0) goto Ld7
            r6 = 1
            r5.setInProgress(r6)
            r6 = r17
            kotlinx.coroutines.CoroutineScope r11 = r6.scope
            r12 = 0
            r13 = 0
            androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1 r14 = new androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1
            r14.<init>(r5, r10, r3)
            r15 = 3
            r16 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r11, r12, r13, r14, r15, r16)
            goto Ld9
        Ld7:
            r6 = r17
        Ld9:
            int r4 = r4 + 1
            goto L67
        Ldc:
            r6 = r17
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator.startAnimationsIfNeeded(androidx.compose.foundation.lazy.grid.LazyGridPositionedItem, androidx.compose.foundation.lazy.grid.ItemInfo):void");
    }

    /* renamed from: toOffset-Bjo55l4, reason: not valid java name */
    private final long m7472toOffsetBjo55l4(int i4) {
        boolean z3 = this.isVertical;
        int i5 = z3 ? 0 : i4;
        if (!z3) {
            i4 = 0;
        }
        return IntOffsetKt.IntOffset(i5, i4);
    }

    /* renamed from: getAnimatedOffset-YT5a7pE, reason: not valid java name */
    public final long m7473getAnimatedOffsetYT5a7pE(Object key, int placeableIndex, int minOffset, int maxOffset, long rawOffset) {
        Intrinsics.checkNotNullParameter(key, "key");
        ItemInfo itemInfo = this.keyToItemInfoMap.get(key);
        if (itemInfo == null) {
            return rawOffset;
        }
        PlaceableInfo placeableInfo = itemInfo.getPlaceables().get(placeableIndex);
        long packedValue = placeableInfo.getAnimatedOffset().getValue().getPackedValue();
        long notAnimatableDelta = itemInfo.getNotAnimatableDelta();
        long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(packedValue) + IntOffset.m11643getXimpl(notAnimatableDelta), IntOffset.m11644getYimpl(packedValue) + IntOffset.m11644getYimpl(notAnimatableDelta));
        long targetOffset = placeableInfo.getTargetOffset();
        long notAnimatableDelta2 = itemInfo.getNotAnimatableDelta();
        long jIntOffset2 = IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(targetOffset) + IntOffset.m11643getXimpl(notAnimatableDelta2), IntOffset.m11644getYimpl(targetOffset) + IntOffset.m11644getYimpl(notAnimatableDelta2));
        if (placeableInfo.getInProgress() && ((m7471getMainAxisgyyYBs(jIntOffset2) <= minOffset && m7471getMainAxisgyyYBs(jIntOffset) < minOffset) || (m7471getMainAxisgyyYBs(jIntOffset2) >= maxOffset && m7471getMainAxisgyyYBs(jIntOffset) > maxOffset))) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new LazyGridItemPlacementAnimator$getAnimatedOffset$1(placeableInfo, null), 3, null);
        }
        return jIntOffset;
    }

    public final void onMeasured(int consumedScroll, int layoutWidth, int layoutHeight, List<LazyGridPositionedItem> positionedItems, LazyMeasuredItemProvider itemProvider, LazyGridSpanLayoutProvider spanLayoutProvider) {
        boolean z3;
        boolean z4;
        int i4;
        Intrinsics.checkNotNullParameter(positionedItems, "positionedItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(spanLayoutProvider, "spanLayoutProvider");
        int size = positionedItems.size();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                z3 = false;
                break;
            } else {
                if (positionedItems.get(i6).getHasAnimations()) {
                    z3 = true;
                    break;
                }
                i6++;
            }
        }
        if (!z3 && this.keyToItemInfoMap.isEmpty()) {
            reset();
            return;
        }
        int i7 = this.firstVisibleIndex;
        LazyGridPositionedItem lazyGridPositionedItem = (LazyGridPositionedItem) CollectionsKt___CollectionsKt.firstOrNull((List) positionedItems);
        this.firstVisibleIndex = lazyGridPositionedItem != null ? lazyGridPositionedItem.getIndex() : 0;
        final Map<Object, Integer> map = this.keyToIndexMap;
        this.keyToIndexMap = itemProvider.getKeyToIndexMap();
        int i8 = this.isVertical ? layoutHeight : layoutWidth;
        long jM7472toOffsetBjo55l4 = m7472toOffsetBjo55l4(consumedScroll);
        this.movingAwayKeys.addAll(this.keyToItemInfoMap.keySet());
        int size2 = positionedItems.size();
        int i9 = 0;
        while (i9 < size2) {
            LazyGridPositionedItem lazyGridPositionedItem2 = positionedItems.get(i9);
            this.movingAwayKeys.remove(lazyGridPositionedItem2.getKey());
            if (lazyGridPositionedItem2.getHasAnimations()) {
                ItemInfo itemInfo = this.keyToItemInfoMap.get(lazyGridPositionedItem2.getKey());
                if (itemInfo == null) {
                    Integer num = map.get(lazyGridPositionedItem2.getKey());
                    if (num == null || lazyGridPositionedItem2.getIndex() == num.intValue()) {
                        i4 = i7;
                        this.keyToItemInfoMap.put(lazyGridPositionedItem2.getKey(), createItemInfo$default(this, lazyGridPositionedItem2, i5, 2, null));
                    } else {
                        if (num.intValue() < i7) {
                            this.movingInFromStartBound.add(lazyGridPositionedItem2);
                        } else {
                            this.movingInFromEndBound.add(lazyGridPositionedItem2);
                        }
                        i4 = i7;
                    }
                } else {
                    i4 = i7;
                    long notAnimatableDelta = itemInfo.getNotAnimatableDelta();
                    itemInfo.m7462setNotAnimatableDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(notAnimatableDelta) + IntOffset.m11643getXimpl(jM7472toOffsetBjo55l4), IntOffset.m11644getYimpl(notAnimatableDelta) + IntOffset.m11644getYimpl(jM7472toOffsetBjo55l4)));
                    itemInfo.setCrossAxisSize(lazyGridPositionedItem2.getCrossAxisSize());
                    itemInfo.setCrossAxisOffset(lazyGridPositionedItem2.getCrossAxisOffset());
                    startAnimationsIfNeeded(lazyGridPositionedItem2, itemInfo);
                }
            } else {
                i4 = i7;
                this.keyToItemInfoMap.remove(lazyGridPositionedItem2.getKey());
            }
            i9++;
            i7 = i4;
            i5 = 0;
        }
        List<LazyGridPositionedItem> list = this.movingInFromStartBound;
        if (list.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t3, T t4) {
                    return ComparisonsKt__ComparisonsKt.compareValues((Integer) map.get(((LazyGridPositionedItem) t4).getKey()), (Integer) map.get(((LazyGridPositionedItem) t3).getKey()));
                }
            });
        }
        List<LazyGridPositionedItem> list2 = this.movingInFromStartBound;
        int size3 = list2.size();
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        int mainAxisSize = 0;
        while (i12 < size3) {
            LazyGridPositionedItem lazyGridPositionedItem3 = list2.get(i12);
            int line = getLine(lazyGridPositionedItem3);
            if (line == i10 || line != i11) {
                i13 += mainAxisSize;
                mainAxisSize = lazyGridPositionedItem3.getMainAxisSize();
                i11 = line;
            } else {
                mainAxisSize = Math.max(mainAxisSize, lazyGridPositionedItem3.getMainAxisSize());
            }
            ItemInfo itemInfoCreateItemInfo = createItemInfo(lazyGridPositionedItem3, (0 - i13) - lazyGridPositionedItem3.getMainAxisSize());
            this.keyToItemInfoMap.put(lazyGridPositionedItem3.getKey(), itemInfoCreateItemInfo);
            startAnimationsIfNeeded(lazyGridPositionedItem3, itemInfoCreateItemInfo);
            i12++;
            i10 = -1;
        }
        List<LazyGridPositionedItem> list3 = this.movingInFromEndBound;
        if (list3.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list3, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t3, T t4) {
                    return ComparisonsKt__ComparisonsKt.compareValues((Integer) map.get(((LazyGridPositionedItem) t3).getKey()), (Integer) map.get(((LazyGridPositionedItem) t4).getKey()));
                }
            });
        }
        List<LazyGridPositionedItem> list4 = this.movingInFromEndBound;
        int size4 = list4.size();
        int i14 = -1;
        int i15 = 0;
        int mainAxisSize2 = 0;
        for (int i16 = 0; i16 < size4; i16++) {
            LazyGridPositionedItem lazyGridPositionedItem4 = list4.get(i16);
            int line2 = getLine(lazyGridPositionedItem4);
            if (line2 == -1 || line2 != i14) {
                i15 += mainAxisSize2;
                mainAxisSize2 = lazyGridPositionedItem4.getMainAxisSize();
                i14 = line2;
            } else {
                mainAxisSize2 = Math.max(mainAxisSize2, lazyGridPositionedItem4.getMainAxisSize());
            }
            ItemInfo itemInfoCreateItemInfo2 = createItemInfo(lazyGridPositionedItem4, i8 + i15);
            this.keyToItemInfoMap.put(lazyGridPositionedItem4.getKey(), itemInfoCreateItemInfo2);
            startAnimationsIfNeeded(lazyGridPositionedItem4, itemInfoCreateItemInfo2);
        }
        for (Object obj : this.movingAwayKeys) {
            ItemInfo itemInfo2 = (ItemInfo) MapsKt__MapsKt.getValue(this.keyToItemInfoMap, obj);
            Integer num2 = this.keyToIndexMap.get(obj);
            List<PlaceableInfo> placeables = itemInfo2.getPlaceables();
            int size5 = placeables.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size5) {
                    z4 = false;
                    break;
                } else {
                    if (placeables.get(i17).getInProgress()) {
                        z4 = true;
                        break;
                    }
                    i17++;
                }
            }
            if (itemInfo2.getPlaceables().isEmpty() || num2 == null || ((!z4 && Intrinsics.areEqual(num2, map.get(obj))) || !(z4 || isWithinBounds(itemInfo2, i8)))) {
                this.keyToItemInfoMap.remove(obj);
            } else {
                LazyGridMeasuredItem lazyGridMeasuredItemM7491getAndMeasureednRnyU$default = LazyMeasuredItemProvider.m7491getAndMeasureednRnyU$default(itemProvider, ItemIndex.m7450constructorimpl(num2.intValue()), 0, this.isVertical ? Constraints.INSTANCE.m11503fixedWidthOenEA2s(itemInfo2.getCrossAxisSize()) : Constraints.INSTANCE.m11502fixedHeightOenEA2s(itemInfo2.getCrossAxisSize()), 2, null);
                if (num2.intValue() < this.firstVisibleIndex) {
                    this.movingAwayToStartBound.add(lazyGridMeasuredItemM7491getAndMeasureednRnyU$default);
                } else {
                    this.movingAwayToEndBound.add(lazyGridMeasuredItemM7491getAndMeasureednRnyU$default);
                }
            }
        }
        List<LazyGridMeasuredItem> list5 = this.movingAwayToStartBound;
        if (list5.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list5, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t3, T t4) {
                    return ComparisonsKt__ComparisonsKt.compareValues((Integer) this.this$0.keyToIndexMap.get(((LazyGridMeasuredItem) t4).getKey()), (Integer) this.this$0.keyToIndexMap.get(((LazyGridMeasuredItem) t3).getKey()));
                }
            });
        }
        List<LazyGridMeasuredItem> list6 = this.movingAwayToStartBound;
        int size6 = list6.size();
        int i18 = 0;
        int mainAxisSize3 = 0;
        int i19 = -1;
        for (int i20 = 0; i20 < size6; i20++) {
            LazyGridMeasuredItem lazyGridMeasuredItem = list6.get(i20);
            int iM7489getLineIndexOfItem_Ze7BM = spanLayoutProvider.m7489getLineIndexOfItem_Ze7BM(lazyGridMeasuredItem.getIndex());
            if (iM7489getLineIndexOfItem_Ze7BM == -1 || iM7489getLineIndexOfItem_Ze7BM != i19) {
                i18 += mainAxisSize3;
                mainAxisSize3 = lazyGridMeasuredItem.getMainAxisSize();
                i19 = iM7489getLineIndexOfItem_Ze7BM;
            } else {
                mainAxisSize3 = Math.max(mainAxisSize3, lazyGridMeasuredItem.getMainAxisSize());
            }
            int mainAxisSize4 = (0 - i18) - lazyGridMeasuredItem.getMainAxisSize();
            ItemInfo itemInfo3 = (ItemInfo) MapsKt__MapsKt.getValue(this.keyToItemInfoMap, lazyGridMeasuredItem.getKey());
            LazyGridPositionedItem lazyGridPositionedItemPosition = lazyGridMeasuredItem.position(mainAxisSize4, itemInfo3.getCrossAxisOffset(), layoutWidth, layoutHeight, -1, -1);
            positionedItems.add(lazyGridPositionedItemPosition);
            startAnimationsIfNeeded(lazyGridPositionedItemPosition, itemInfo3);
        }
        List<LazyGridMeasuredItem> list7 = this.movingAwayToEndBound;
        if (list7.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list7, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t3, T t4) {
                    return ComparisonsKt__ComparisonsKt.compareValues((Integer) this.this$0.keyToIndexMap.get(((LazyGridMeasuredItem) t3).getKey()), (Integer) this.this$0.keyToIndexMap.get(((LazyGridMeasuredItem) t4).getKey()));
                }
            });
        }
        List<LazyGridMeasuredItem> list8 = this.movingAwayToEndBound;
        int size7 = list8.size();
        int i21 = -1;
        int mainAxisSize5 = 0;
        int i22 = 0;
        for (int i23 = 0; i23 < size7; i23++) {
            LazyGridMeasuredItem lazyGridMeasuredItem2 = list8.get(i23);
            int iM7489getLineIndexOfItem_Ze7BM2 = spanLayoutProvider.m7489getLineIndexOfItem_Ze7BM(lazyGridMeasuredItem2.getIndex());
            if (iM7489getLineIndexOfItem_Ze7BM2 == -1 || iM7489getLineIndexOfItem_Ze7BM2 != i21) {
                i22 += mainAxisSize5;
                mainAxisSize5 = lazyGridMeasuredItem2.getMainAxisSize();
                i21 = iM7489getLineIndexOfItem_Ze7BM2;
            } else {
                mainAxisSize5 = Math.max(mainAxisSize5, lazyGridMeasuredItem2.getMainAxisSize());
            }
            ItemInfo itemInfo4 = (ItemInfo) MapsKt__MapsKt.getValue(this.keyToItemInfoMap, lazyGridMeasuredItem2.getKey());
            LazyGridPositionedItem lazyGridPositionedItemPosition2 = lazyGridMeasuredItem2.position(i8 + i22, itemInfo4.getCrossAxisOffset(), layoutWidth, layoutHeight, -1, -1);
            positionedItems.add(lazyGridPositionedItemPosition2);
            startAnimationsIfNeeded(lazyGridPositionedItemPosition2, itemInfo4);
        }
        this.movingInFromStartBound.clear();
        this.movingInFromEndBound.clear();
        this.movingAwayToStartBound.clear();
        this.movingAwayToEndBound.clear();
        this.movingAwayKeys.clear();
    }

    public final void reset() {
        this.keyToItemInfoMap.clear();
        this.keyToIndexMap = MapsKt__MapsKt.emptyMap();
        this.firstVisibleIndex = -1;
    }
}
