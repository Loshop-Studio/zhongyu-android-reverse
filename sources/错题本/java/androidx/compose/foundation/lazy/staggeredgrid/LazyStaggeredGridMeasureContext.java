package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.p011ui.graphics.GraphicsContext;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\r\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\r*\u00020\u00072\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$J'\u0010)\u001a\u00020&*\u00020\u00072\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u00102R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u00105R\u001d\u0010\f\u001a\u00020\u000b8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b\u000e\u0010:R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\b?\u0010@R\u001d\u0010\u0013\u001a\u00020\u00128\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\bA\u00108R\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\bB\u0010@R\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010>\u001a\u0004\bC\u0010@R\u0017\u0010\u0016\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0016\u00109\u001a\u0004\bD\u0010:R\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010>\u001a\u0004\bE\u0010@R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u001a\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001a\u00109\u001a\u0004\b\u001a\u0010:R\u0017\u0010\u001b\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001b\u00109\u001a\u0004\b\u001b\u0010:R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010P\u001a\u00020O8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010U\u001a\u00020T8\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010Y\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bY\u0010>\u001a\u0004\bZ\u0010@R\u0016\u0010#\u001a\u00020\r*\u00020&8Æ\u0002¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0016\u0010U\u001a\u00020\u0005*\u00020&8Æ\u0002¢\u0006\u0006\u001a\u0004\b]\u0010^\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006_"}, m5110d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "", "", "pinnedItems", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "resolvedSlots", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "measureScope", "mainAxisAvailableSize", "Landroidx/compose/ui/unit/IntOffset;", "contentOffset", "beforeContentPadding", "afterContentPadding", "reverseLayout", "mainAxisSpacing", "Lkotlinx/coroutines/v;", "coroutineScope", "isInLookaheadScope", "isLookingAhead", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "approachLayoutInfo", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "<init>", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZLandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJIIZILkotlinx/coroutines/v;ZZLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/internal/e;)V", "itemIndex", "isFullSpan", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;I)Z", "lane", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "getSpanRange-lOCCd4c", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J", "getSpanRange", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "getState", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Ljava/util/List;", "getPinnedItems", "()Ljava/util/List;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "getItemProvider", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "getResolvedSlots", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "J", "getConstraints-msEJaDk", "()J", "Z", "()Z", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "getMeasureScope", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "I", "getMainAxisAvailableSize", "()I", "getContentOffset-nOcc-ac", "getBeforeContentPadding", "getAfterContentPadding", "getReverseLayout", "getMainAxisSpacing", "Lkotlinx/coroutines/v;", "getCoroutineScope", "()Lkotlinx/coroutines/v;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "getApproachLayoutInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "Landroidx/compose/ui/graphics/GraphicsContext;", "getGraphicsContext", "()Landroidx/compose/ui/graphics/GraphicsContext;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "getMeasuredItemProvider", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "laneInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "getLaneInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "laneCount", "getLaneCount", "isFullSpan-SZVOQXA", "(J)Z", "getLaneInfo-SZVOQXA", "(J)I", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1475:1\n261#1:1481\n1135#2:1476\n1132#2:1477\n1129#2:1479\n1135#2:1482\n1132#2:1483\n1129#2:1485\n90#3:1478\n85#3:1480\n90#3:1484\n85#3:1486\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n*L\n264#1:1481\n261#1:1476\n261#1:1477\n261#1:1479\n264#1:1482\n264#1:1483\n264#1:1485\n261#1:1478\n261#1:1480\n264#1:1484\n264#1:1486\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureContext {
    public static final int $stable = 8;
    private final int afterContentPadding;

    @Nullable
    private final LazyStaggeredGridLayoutInfo approachLayoutInfo;
    private final int beforeContentPadding;
    private final long constraints;
    private final long contentOffset;

    @NotNull
    private final InterfaceC6009v coroutineScope;

    @NotNull
    private final GraphicsContext graphicsContext;
    private final boolean isInLookaheadScope;
    private final boolean isLookingAhead;
    private final boolean isVertical;

    @NotNull
    private final LazyStaggeredGridItemProvider itemProvider;
    private final int laneCount;

    @NotNull
    private final LazyStaggeredGridLaneInfo laneInfo;
    private final int mainAxisAvailableSize;
    private final int mainAxisSpacing;

    @NotNull
    private final LazyLayoutMeasureScope measureScope;

    @NotNull
    private final LazyStaggeredGridMeasureProvider measuredItemProvider;

    @NotNull
    private final List<Integer> pinnedItems;

    @NotNull
    private final LazyStaggeredGridSlots resolvedSlots;
    private final boolean reverseLayout;

    @NotNull
    private final LazyStaggeredGridState state;

    public /* synthetic */ LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, List list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j7, boolean z8, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, long j8, int i8, int i9, boolean z9, int i10, InterfaceC6009v interfaceC6009v, boolean z10, boolean z11, LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, GraphicsContext graphicsContext, AbstractC5824e abstractC5824e) {
        this(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j7, z8, lazyLayoutMeasureScope, i, j8, i8, i9, z9, i10, interfaceC6009v, z10, z11, lazyStaggeredGridLayoutInfo, graphicsContext);
    }

    public final int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Nullable
    public final LazyStaggeredGridLayoutInfo getApproachLayoutInfo() {
        return this.approachLayoutInfo;
    }

    public final int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    /* renamed from: getContentOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getContentOffset() {
        return this.contentOffset;
    }

    @NotNull
    public final InterfaceC6009v getCoroutineScope() {
        return this.coroutineScope;
    }

    @NotNull
    public final GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    @NotNull
    public final LazyStaggeredGridItemProvider getItemProvider() {
        return this.itemProvider;
    }

    public final int getLaneCount() {
        return this.laneCount;
    }

    @NotNull
    public final LazyStaggeredGridLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    /* renamed from: getLaneInfo-SZVOQXA, reason: not valid java name */
    public final int m7476getLaneInfoSZVOQXA(long j7) {
        int i = (int) (4294967295L & j7);
        int i8 = (int) (j7 >> 32);
        if (i - i8 != 1) {
            return -2;
        }
        return i8;
    }

    public final int getMainAxisAvailableSize() {
        return this.mainAxisAvailableSize;
    }

    public final int getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    @NotNull
    public final LazyLayoutMeasureScope getMeasureScope() {
        return this.measureScope;
    }

    @NotNull
    public final LazyStaggeredGridMeasureProvider getMeasuredItemProvider() {
        return this.measuredItemProvider;
    }

    @NotNull
    public final List<Integer> getPinnedItems() {
        return this.pinnedItems;
    }

    @NotNull
    public final LazyStaggeredGridSlots getResolvedSlots() {
        return this.resolvedSlots;
    }

    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    /* renamed from: getSpanRange-lOCCd4c, reason: not valid java name */
    public final long m7477getSpanRangelOCCd4c(@NotNull LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i, int i8) {
        boolean zIsFullSpan = lazyStaggeredGridItemProvider.getSpanProvider().isFullSpan(i);
        int i9 = zIsFullSpan ? this.laneCount : 1;
        if (zIsFullSpan) {
            i8 = 0;
        }
        return SpanRange.m7492constructorimpl(i8, i9);
    }

    @NotNull
    public final LazyStaggeredGridState getState() {
        return this.state;
    }

    public final boolean isFullSpan(@NotNull LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i) {
        return lazyStaggeredGridItemProvider.getSpanProvider().isFullSpan(i);
    }

    /* renamed from: isFullSpan-SZVOQXA, reason: not valid java name */
    public final boolean m7478isFullSpanSZVOQXA(long j7) {
        return ((int) (4294967295L & j7)) - ((int) (j7 >> 32)) != 1;
    }

    /* renamed from: isInLookaheadScope, reason: from getter */
    public final boolean getIsInLookaheadScope() {
        return this.isInLookaheadScope;
    }

    /* renamed from: isLookingAhead, reason: from getter */
    public final boolean getIsLookingAhead() {
        return this.isLookingAhead;
    }

    /* renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    private LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, List<Integer> list, final LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, final LazyStaggeredGridSlots lazyStaggeredGridSlots, long j7, final boolean z8, final LazyLayoutMeasureScope lazyLayoutMeasureScope, int i, long j8, int i8, int i9, boolean z9, int i10, InterfaceC6009v interfaceC6009v, boolean z10, boolean z11, LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, GraphicsContext graphicsContext) {
        this.state = lazyStaggeredGridState;
        this.pinnedItems = list;
        this.itemProvider = lazyStaggeredGridItemProvider;
        this.resolvedSlots = lazyStaggeredGridSlots;
        this.constraints = j7;
        this.isVertical = z8;
        this.measureScope = lazyLayoutMeasureScope;
        this.mainAxisAvailableSize = i;
        this.contentOffset = j8;
        this.beforeContentPadding = i8;
        this.afterContentPadding = i9;
        this.reverseLayout = z9;
        this.mainAxisSpacing = i10;
        this.coroutineScope = interfaceC6009v;
        this.isInLookaheadScope = z10;
        this.isLookingAhead = z11;
        this.approachLayoutInfo = lazyStaggeredGridLayoutInfo;
        this.graphicsContext = graphicsContext;
        this.measuredItemProvider = new LazyStaggeredGridMeasureProvider(z8, lazyStaggeredGridItemProvider, lazyLayoutMeasureScope, lazyStaggeredGridSlots) { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext$measuredItemProvider$1
            @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider
            /* renamed from: createItem-pitSLOA, reason: not valid java name */
            public LazyStaggeredGridMeasuredItem mo7479createItempitSLOA(int index, int lane, int span, Object key, Object contentType, List<? extends Placeable> placeables, long constraints) {
                return new LazyStaggeredGridMeasuredItem(index, key, placeables, this.this$0.getIsVertical(), this.this$0.getMainAxisSpacing(), lane, span, this.this$0.getBeforeContentPadding(), this.this$0.getAfterContentPadding(), contentType, this.this$0.getState().getItemAnimator$foundation_release(), constraints, null);
            }
        };
        this.laneInfo = lazyStaggeredGridState.getLaneInfo();
        this.laneCount = lazyStaggeredGridSlots.getSizes().length;
    }
}
