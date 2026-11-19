package androidx.compose.foundation.lazy;

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

@Metadata(m5174d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00162\b\b\u0002\u0010\u001e\u001a\u00020\bH\u0002J;\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u0019ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&J4\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\u0006\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u00020(J\u0018\u00100\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u00101\u001a\u00020\rH\u0002J\u0014\u00102\u001a\u00020\u0005*\u00020\r2\u0006\u00103\u001a\u00020\bH\u0002J\u001c\u00104\u001a\u00020\u0019*\u00020\bH\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u000fj\b\u0012\u0004\u0012\u00020\u0001`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\b*\u00020\u00198BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00067"}, m5175d2 = {"Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "isVertical", "", "(Lkotlinx/coroutines/CoroutineScope;Z)V", "firstVisibleIndex", "", "keyToIndexMap", "", "keyToItemInfoMap", "", "Landroidx/compose/foundation/lazy/ItemInfo;", "movingAwayKeys", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "movingAwayToEndBound", "", "Landroidx/compose/foundation/lazy/LazyMeasuredItem;", "movingAwayToStartBound", "movingInFromEndBound", "Landroidx/compose/foundation/lazy/LazyListPositionedItem;", "movingInFromStartBound", "mainAxis", "Landroidx/compose/ui/unit/IntOffset;", "getMainAxis--gyyYBs", "(J)I", "createItemInfo", "item", "mainAxisOffset", "getAnimatedOffset", "key", "placeableIndex", "minOffset", "maxOffset", "rawOffset", "getAnimatedOffset-YT5a7pE", "(Ljava/lang/Object;IIIJ)J", "onMeasured", "", "consumedScroll", "layoutWidth", "layoutHeight", "positionedItems", "itemProvider", "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;", "reset", "startAnimationsIfNeeded", "itemInfo", "isWithinBounds", "mainAxisLayoutSize", "toOffset", "toOffset-Bjo55l4", "(I)J", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyListItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,350:1\n101#2,2:351\n33#2,6:353\n103#2:359\n33#2,4:360\n38#2:365\n33#2,6:368\n33#2,6:376\n101#2,2:383\n33#2,6:385\n103#2:391\n33#2,6:395\n33#2,6:403\n69#2,4:414\n74#2:420\n101#2,2:421\n33#2,4:423\n38#2:428\n103#2:429\n86#3:364\n86#3:409\n86#3:410\n79#3:411\n86#3:412\n79#3:413\n86#3:418\n79#3:419\n86#3:427\n1011#4,2:366\n1002#4,2:374\n1855#4:382\n1856#4:392\n1011#4,2:393\n1002#4,2:401\n*S KotlinDebug\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n*L\n74#1:351,2\n74#1:353,6\n74#1:359\n93#1:360,4\n93#1:365\n124#1:368,6\n133#1:376,6\n148#1:383,2\n148#1:385,6\n148#1:391\n167#1:395,6\n178#1:403,6\n278#1:414,4\n278#1:420\n316#1:421,2\n316#1:423,4\n316#1:428\n316#1:429\n113#1:364\n208#1:409\n209#1:410\n251#1:411\n254#1:412\n272#1:413\n279#1:418\n284#1:419\n317#1:427\n123#1:366,2\n132#1:374,2\n141#1:382\n141#1:392\n166#1:393,2\n177#1:401,2\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListItemPlacementAnimator {
    private int firstVisibleIndex;
    private final boolean isVertical;
    private Map<Object, Integer> keyToIndexMap;
    private final Map<Object, ItemInfo> keyToItemInfoMap;
    private final LinkedHashSet<Object> movingAwayKeys;
    private final List<LazyMeasuredItem> movingAwayToEndBound;
    private final List<LazyMeasuredItem> movingAwayToStartBound;
    private final List<LazyListPositionedItem> movingInFromEndBound;
    private final List<LazyListPositionedItem> movingInFromStartBound;
    private final CoroutineScope scope;

    public LazyListItemPlacementAnimator(CoroutineScope scope, boolean z3) {
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

    private final ItemInfo createItemInfo(LazyListPositionedItem item, int mainAxisOffset) {
        ItemInfo itemInfo = new ItemInfo();
        long jM7428getOffsetBjo55l4 = item.m7428getOffsetBjo55l4(0);
        long jM11639copyiSbpLlY$default = this.isVertical ? IntOffset.m11639copyiSbpLlY$default(jM7428getOffsetBjo55l4, 0, mainAxisOffset, 1, null) : IntOffset.m11639copyiSbpLlY$default(jM7428getOffsetBjo55l4, mainAxisOffset, 0, 2, null);
        int placeablesCount = item.getPlaceablesCount();
        for (int i4 = 0; i4 < placeablesCount; i4++) {
            long jM7428getOffsetBjo55l42 = item.m7428getOffsetBjo55l4(i4);
            long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(jM7428getOffsetBjo55l42) - IntOffset.m11643getXimpl(jM7428getOffsetBjo55l4), IntOffset.m11644getYimpl(jM7428getOffsetBjo55l42) - IntOffset.m11644getYimpl(jM7428getOffsetBjo55l4));
            itemInfo.getPlaceables().add(new PlaceableInfo(IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(jM11639copyiSbpLlY$default) + IntOffset.m11643getXimpl(jIntOffset), IntOffset.m11644getYimpl(jM11639copyiSbpLlY$default) + IntOffset.m11644getYimpl(jIntOffset)), item.getMainAxisSize(i4), null));
        }
        return itemInfo;
    }

    public static /* synthetic */ ItemInfo createItemInfo$default(LazyListItemPlacementAnimator lazyListItemPlacementAnimator, LazyListPositionedItem lazyListPositionedItem, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = lazyListItemPlacementAnimator.m7418getMainAxisgyyYBs(lazyListPositionedItem.m7428getOffsetBjo55l4(0));
        }
        return lazyListItemPlacementAnimator.createItemInfo(lazyListPositionedItem, i4);
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m7418getMainAxisgyyYBs(long j4) {
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
            if (m7418getMainAxisgyyYBs(jIntOffset) + placeableInfo.getMainAxisSize() > 0 && m7418getMainAxisgyyYBs(jIntOffset) < i4) {
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
    private final void startAnimationsIfNeeded(androidx.compose.foundation.lazy.LazyListPositionedItem r18, androidx.compose.foundation.lazy.ItemInfo r19) {
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
            long r4 = r0.m7428getOffsetBjo55l4(r1)
            java.util.List r2 = r19.getPlaceables()
            androidx.compose.foundation.lazy.PlaceableInfo r6 = new androidx.compose.foundation.lazy.PlaceableInfo
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
            androidx.compose.foundation.lazy.PlaceableInfo r5 = (androidx.compose.foundation.lazy.PlaceableInfo) r5
            long r6 = r5.getTargetOffset()
            long r8 = r19.getNotAnimatableDelta()
            int r10 = androidx.compose.p006ui.unit.IntOffset.m11643getXimpl(r6)
            int r11 = androidx.compose.p006ui.unit.IntOffset.m11643getXimpl(r8)
            int r10 = r10 + r11
            int r6 = androidx.compose.p006ui.unit.IntOffset.m11644getYimpl(r6)
            int r7 = androidx.compose.p006ui.unit.IntOffset.m11644getYimpl(r8)
            int r6 = r6 + r7
            long r6 = androidx.compose.p006ui.unit.IntOffsetKt.IntOffset(r10, r6)
            long r8 = r0.m7428getOffsetBjo55l4(r4)
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
            r5.m7438setTargetOffsetgyyYBs(r6)
            if (r10 == 0) goto Ld7
            r6 = 1
            r5.setInProgress(r6)
            r6 = r17
            kotlinx.coroutines.CoroutineScope r11 = r6.scope
            r12 = 0
            r13 = 0
            androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1 r14 = new androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator.startAnimationsIfNeeded(androidx.compose.foundation.lazy.LazyListPositionedItem, androidx.compose.foundation.lazy.ItemInfo):void");
    }

    /* renamed from: toOffset-Bjo55l4, reason: not valid java name */
    private final long m7419toOffsetBjo55l4(int i4) {
        boolean z3 = this.isVertical;
        int i5 = z3 ? 0 : i4;
        if (!z3) {
            i4 = 0;
        }
        return IntOffsetKt.IntOffset(i5, i4);
    }

    /* renamed from: getAnimatedOffset-YT5a7pE, reason: not valid java name */
    public final long m7420getAnimatedOffsetYT5a7pE(Object key, int placeableIndex, int minOffset, int maxOffset, long rawOffset) {
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
        if (placeableInfo.getInProgress() && ((m7418getMainAxisgyyYBs(jIntOffset2) <= minOffset && m7418getMainAxisgyyYBs(jIntOffset) <= minOffset) || (m7418getMainAxisgyyYBs(jIntOffset2) >= maxOffset && m7418getMainAxisgyyYBs(jIntOffset) >= maxOffset))) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new LazyListItemPlacementAnimator$getAnimatedOffset$1(placeableInfo, null), 3, null);
        }
        return jIntOffset;
    }

    public final void onMeasured(int consumedScroll, int layoutWidth, int layoutHeight, List<LazyListPositionedItem> positionedItems, LazyMeasuredItemProvider itemProvider) {
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(positionedItems, "positionedItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        int size = positionedItems.size();
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
        LazyListPositionedItem lazyListPositionedItem = (LazyListPositionedItem) CollectionsKt___CollectionsKt.firstOrNull((List) positionedItems);
        this.firstVisibleIndex = lazyListPositionedItem != null ? lazyListPositionedItem.getIndex() : 0;
        final Map<Object, Integer> map = this.keyToIndexMap;
        this.keyToIndexMap = itemProvider.getKeyToIndexMap();
        int i8 = this.isVertical ? layoutHeight : layoutWidth;
        long jM7419toOffsetBjo55l4 = m7419toOffsetBjo55l4(consumedScroll);
        this.movingAwayKeys.addAll(this.keyToItemInfoMap.keySet());
        int size2 = positionedItems.size();
        int i9 = 0;
        while (i9 < size2) {
            LazyListPositionedItem lazyListPositionedItem2 = positionedItems.get(i9);
            this.movingAwayKeys.remove(lazyListPositionedItem2.getKey());
            if (lazyListPositionedItem2.getHasAnimations()) {
                ItemInfo itemInfo = this.keyToItemInfoMap.get(lazyListPositionedItem2.getKey());
                if (itemInfo == null) {
                    Integer num = map.get(lazyListPositionedItem2.getKey());
                    if (num == null || lazyListPositionedItem2.getIndex() == num.intValue()) {
                        i4 = i7;
                        i5 = size2;
                        this.keyToItemInfoMap.put(lazyListPositionedItem2.getKey(), createItemInfo$default(this, lazyListPositionedItem2, 0, 2, null));
                    } else {
                        if (num.intValue() < i7) {
                            this.movingInFromStartBound.add(lazyListPositionedItem2);
                        } else {
                            this.movingInFromEndBound.add(lazyListPositionedItem2);
                        }
                        i4 = i7;
                        i5 = size2;
                    }
                } else {
                    i4 = i7;
                    i5 = size2;
                    long notAnimatableDelta = itemInfo.getNotAnimatableDelta();
                    itemInfo.m7417setNotAnimatableDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(notAnimatableDelta) + IntOffset.m11643getXimpl(jM7419toOffsetBjo55l4), IntOffset.m11644getYimpl(notAnimatableDelta) + IntOffset.m11644getYimpl(jM7419toOffsetBjo55l4)));
                    startAnimationsIfNeeded(lazyListPositionedItem2, itemInfo);
                }
            } else {
                i4 = i7;
                i5 = size2;
                this.keyToItemInfoMap.remove(lazyListPositionedItem2.getKey());
            }
            i9++;
            size2 = i5;
            i7 = i4;
        }
        int size3 = 0;
        List<LazyListPositionedItem> list = this.movingInFromStartBound;
        if (list.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t3, T t4) {
                    return ComparisonsKt__ComparisonsKt.compareValues((Integer) map.get(((LazyListPositionedItem) t4).getKey()), (Integer) map.get(((LazyListPositionedItem) t3).getKey()));
                }
            });
        }
        List<LazyListPositionedItem> list2 = this.movingInFromStartBound;
        int size4 = list2.size();
        int size5 = 0;
        for (int i10 = 0; i10 < size4; i10++) {
            LazyListPositionedItem lazyListPositionedItem3 = list2.get(i10);
            int size6 = (0 - size5) - lazyListPositionedItem3.getSize();
            size5 += lazyListPositionedItem3.getSize();
            ItemInfo itemInfoCreateItemInfo = createItemInfo(lazyListPositionedItem3, size6);
            this.keyToItemInfoMap.put(lazyListPositionedItem3.getKey(), itemInfoCreateItemInfo);
            startAnimationsIfNeeded(lazyListPositionedItem3, itemInfoCreateItemInfo);
        }
        List<LazyListPositionedItem> list3 = this.movingInFromEndBound;
        if (list3.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list3, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t3, T t4) {
                    return ComparisonsKt__ComparisonsKt.compareValues((Integer) map.get(((LazyListPositionedItem) t3).getKey()), (Integer) map.get(((LazyListPositionedItem) t4).getKey()));
                }
            });
        }
        List<LazyListPositionedItem> list4 = this.movingInFromEndBound;
        int size7 = list4.size();
        int size8 = 0;
        for (int i11 = 0; i11 < size7; i11++) {
            LazyListPositionedItem lazyListPositionedItem4 = list4.get(i11);
            int i12 = i8 + size8;
            size8 += lazyListPositionedItem4.getSize();
            ItemInfo itemInfoCreateItemInfo2 = createItemInfo(lazyListPositionedItem4, i12);
            this.keyToItemInfoMap.put(lazyListPositionedItem4.getKey(), itemInfoCreateItemInfo2);
            startAnimationsIfNeeded(lazyListPositionedItem4, itemInfoCreateItemInfo2);
        }
        for (Object obj : this.movingAwayKeys) {
            ItemInfo itemInfo2 = (ItemInfo) MapsKt__MapsKt.getValue(this.keyToItemInfoMap, obj);
            Integer num2 = this.keyToIndexMap.get(obj);
            List<PlaceableInfo> placeables = itemInfo2.getPlaceables();
            int size9 = placeables.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size9) {
                    z4 = false;
                    break;
                } else {
                    if (placeables.get(i13).getInProgress()) {
                        z4 = true;
                        break;
                    }
                    i13++;
                }
            }
            if (itemInfo2.getPlaceables().isEmpty() || num2 == null || ((!z4 && Intrinsics.areEqual(num2, map.get(obj))) || !(z4 || isWithinBounds(itemInfo2, i8)))) {
                this.keyToItemInfoMap.remove(obj);
            } else {
                LazyMeasuredItem lazyMeasuredItemM7435getAndMeasureZjPyQlc = itemProvider.m7435getAndMeasureZjPyQlc(DataIndex.m7404constructorimpl(num2.intValue()));
                if (num2.intValue() < this.firstVisibleIndex) {
                    this.movingAwayToStartBound.add(lazyMeasuredItemM7435getAndMeasureZjPyQlc);
                } else {
                    this.movingAwayToEndBound.add(lazyMeasuredItemM7435getAndMeasureZjPyQlc);
                }
            }
        }
        List<LazyMeasuredItem> list5 = this.movingAwayToStartBound;
        if (list5.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list5, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t3, T t4) {
                    return ComparisonsKt__ComparisonsKt.compareValues((Integer) this.this$0.keyToIndexMap.get(((LazyMeasuredItem) t4).getKey()), (Integer) this.this$0.keyToIndexMap.get(((LazyMeasuredItem) t3).getKey()));
                }
            });
        }
        List<LazyMeasuredItem> list6 = this.movingAwayToStartBound;
        int size10 = list6.size();
        int size11 = 0;
        for (int i14 = 0; i14 < size10; i14++) {
            LazyMeasuredItem lazyMeasuredItem = list6.get(i14);
            int size12 = (0 - size11) - lazyMeasuredItem.getSize();
            size11 += lazyMeasuredItem.getSize();
            ItemInfo itemInfo3 = (ItemInfo) MapsKt__MapsKt.getValue(this.keyToItemInfoMap, lazyMeasuredItem.getKey());
            LazyListPositionedItem lazyListPositionedItemPosition = lazyMeasuredItem.position(size12, layoutWidth, layoutHeight);
            positionedItems.add(lazyListPositionedItemPosition);
            startAnimationsIfNeeded(lazyListPositionedItemPosition, itemInfo3);
        }
        List<LazyMeasuredItem> list7 = this.movingAwayToEndBound;
        if (list7.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list7, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t3, T t4) {
                    return ComparisonsKt__ComparisonsKt.compareValues((Integer) this.this$0.keyToIndexMap.get(((LazyMeasuredItem) t3).getKey()), (Integer) this.this$0.keyToIndexMap.get(((LazyMeasuredItem) t4).getKey()));
                }
            });
        }
        List<LazyMeasuredItem> list8 = this.movingAwayToEndBound;
        int size13 = list8.size();
        for (int i15 = 0; i15 < size13; i15++) {
            LazyMeasuredItem lazyMeasuredItem2 = list8.get(i15);
            int i16 = i8 + size3;
            size3 += lazyMeasuredItem2.getSize();
            ItemInfo itemInfo4 = (ItemInfo) MapsKt__MapsKt.getValue(this.keyToItemInfoMap, lazyMeasuredItem2.getKey());
            LazyListPositionedItem lazyListPositionedItemPosition2 = lazyMeasuredItem2.position(i16, layoutWidth, layoutHeight);
            positionedItems.add(lazyListPositionedItemPosition2);
            startAnimationsIfNeeded(lazyListPositionedItemPosition2, itemInfo4);
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
