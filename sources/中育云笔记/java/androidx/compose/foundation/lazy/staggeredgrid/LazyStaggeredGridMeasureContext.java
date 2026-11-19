package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.p014ui.graphics.GraphicsContext;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import sd.InterfaceC11122i0;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureContext {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final LazyStaggeredGridLayoutInfo approachLayoutInfo;
    private final int beforeContentPadding;
    private final long constraints;
    private final long contentOffset;
    private final InterfaceC11122i0 coroutineScope;
    private final GraphicsContext graphicsContext;
    private final boolean isInLookaheadScope;
    private final boolean isLookingAhead;
    private final boolean isVertical;
    private final LazyStaggeredGridItemProvider itemProvider;
    private final int laneCount;
    private final LazyStaggeredGridLaneInfo laneInfo;
    private final int mainAxisAvailableSize;
    private final int mainAxisSpacing;
    private final LazyLayoutMeasureScope measureScope;
    private final LazyStaggeredGridMeasureProvider measuredItemProvider;
    private final List<Integer> pinnedItems;
    private final LazyStaggeredGridSlots resolvedSlots;
    private final boolean reverseLayout;
    private final LazyStaggeredGridState state;

    public /* synthetic */ LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, List list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j10, boolean z10, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i10, long j11, int i11, int i12, boolean z11, int i13, InterfaceC11122i0 interfaceC11122i0, boolean z12, boolean z13, LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, GraphicsContext graphicsContext, AbstractC9972n abstractC9972n) {
        this(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j10, z10, lazyLayoutMeasureScope, i10, j11, i11, i12, z11, i13, interfaceC11122i0, z12, z13, lazyStaggeredGridLayoutInfo, graphicsContext);
    }

    public final int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    public final LazyStaggeredGridLayoutInfo getApproachLayoutInfo() {
        return this.approachLayoutInfo;
    }

    public final int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m27670getConstraintsmsEJaDk() {
        return this.constraints;
    }

    /* renamed from: getContentOffset-nOcc-ac, reason: not valid java name */
    public final long m27671getContentOffsetnOccac() {
        return this.contentOffset;
    }

    public final InterfaceC11122i0 getCoroutineScope() {
        return this.coroutineScope;
    }

    public final GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    public final LazyStaggeredGridItemProvider getItemProvider() {
        return this.itemProvider;
    }

    public final int getLaneCount() {
        return this.laneCount;
    }

    public final LazyStaggeredGridLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    /* renamed from: getLaneInfo-SZVOQXA, reason: not valid java name */
    public final int m27672getLaneInfoSZVOQXA(long j10) {
        int i10 = (int) (4294967295L & j10);
        int i11 = (int) (j10 >> 32);
        if (i10 - i11 != 1) {
            return -2;
        }
        return i11;
    }

    public final int getMainAxisAvailableSize() {
        return this.mainAxisAvailableSize;
    }

    public final int getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    public final LazyLayoutMeasureScope getMeasureScope() {
        return this.measureScope;
    }

    public final LazyStaggeredGridMeasureProvider getMeasuredItemProvider() {
        return this.measuredItemProvider;
    }

    public final List<Integer> getPinnedItems() {
        return this.pinnedItems;
    }

    public final LazyStaggeredGridSlots getResolvedSlots() {
        return this.resolvedSlots;
    }

    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    /* renamed from: getSpanRange-lOCCd4c, reason: not valid java name */
    public final long m27673getSpanRangelOCCd4c(LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i10, int i11) {
        boolean zIsFullSpan = lazyStaggeredGridItemProvider.getSpanProvider().isFullSpan(i10);
        int i12 = zIsFullSpan ? this.laneCount : 1;
        if (zIsFullSpan) {
            i11 = 0;
        }
        return SpanRange.m27688constructorimpl(i11, i12);
    }

    public final LazyStaggeredGridState getState() {
        return this.state;
    }

    public final boolean isFullSpan(LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i10) {
        return lazyStaggeredGridItemProvider.getSpanProvider().isFullSpan(i10);
    }

    /* renamed from: isFullSpan-SZVOQXA, reason: not valid java name */
    public final boolean m27674isFullSpanSZVOQXA(long j10) {
        return ((int) (4294967295L & j10)) - ((int) (j10 >> 32)) != 1;
    }

    public final boolean isInLookaheadScope() {
        return this.isInLookaheadScope;
    }

    public final boolean isLookingAhead() {
        return this.isLookingAhead;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    private LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, List<Integer> list, final LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, final LazyStaggeredGridSlots lazyStaggeredGridSlots, long j10, final boolean z10, final LazyLayoutMeasureScope lazyLayoutMeasureScope, int i10, long j11, int i11, int i12, boolean z11, int i13, InterfaceC11122i0 interfaceC11122i0, boolean z12, boolean z13, LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, GraphicsContext graphicsContext) {
        this.state = lazyStaggeredGridState;
        this.pinnedItems = list;
        this.itemProvider = lazyStaggeredGridItemProvider;
        this.resolvedSlots = lazyStaggeredGridSlots;
        this.constraints = j10;
        this.isVertical = z10;
        this.measureScope = lazyLayoutMeasureScope;
        this.mainAxisAvailableSize = i10;
        this.contentOffset = j11;
        this.beforeContentPadding = i11;
        this.afterContentPadding = i12;
        this.reverseLayout = z11;
        this.mainAxisSpacing = i13;
        this.coroutineScope = interfaceC11122i0;
        this.isInLookaheadScope = z12;
        this.isLookingAhead = z13;
        this.approachLayoutInfo = lazyStaggeredGridLayoutInfo;
        this.graphicsContext = graphicsContext;
        this.measuredItemProvider = new LazyStaggeredGridMeasureProvider(z10, lazyStaggeredGridItemProvider, lazyLayoutMeasureScope, lazyStaggeredGridSlots) { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext$measuredItemProvider$1
            @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider
            /* renamed from: createItem-pitSLOA, reason: not valid java name */
            public LazyStaggeredGridMeasuredItem mo27675createItempitSLOA(int i14, int i15, int i16, Object obj, Object obj2, List<? extends Placeable> list2, long j12) {
                return new LazyStaggeredGridMeasuredItem(i14, obj, list2, this.this$0.isVertical(), this.this$0.getMainAxisSpacing(), i15, i16, this.this$0.getBeforeContentPadding(), this.this$0.getAfterContentPadding(), obj2, this.this$0.getState().getItemAnimator$foundation_release(), j12, null);
            }
        };
        this.laneInfo = lazyStaggeredGridState.getLaneInfo$foundation_release();
        this.laneCount = lazyStaggeredGridSlots.getSizes().length;
    }
}
