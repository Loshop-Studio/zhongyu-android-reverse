package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p014ui.layout.AlignmentLine;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;
import p325rc.AbstractC10947g0;
import sd.InterfaceC11122i0;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyListMeasureResult implements LazyListLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final boolean canScrollForward;
    private final long childConstraints;
    private final float consumedScroll;
    private final InterfaceC11122i0 coroutineScope;
    private final Density density;
    private final LazyListMeasuredItem firstVisibleItem;
    private final int firstVisibleItemScrollOffset;
    private final int mainAxisItemSpacing;
    private final MeasureResult measureResult;
    private final Orientation orientation;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final float scrollBackAmount;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final int viewportStartOffset;
    private final List<LazyListMeasuredItem> visibleItemsInfo;

    public /* synthetic */ LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem, int i10, boolean z10, float f10, MeasureResult measureResult, float f11, boolean z11, InterfaceC11122i0 interfaceC11122i0, Density density, long j10, List list, int i11, int i12, int i13, boolean z12, Orientation orientation, int i14, int i15, AbstractC9972n abstractC9972n) {
        this(lazyListMeasuredItem, i10, z10, f10, measureResult, f11, z11, interfaceC11122i0, density, j10, list, i11, i12, i13, z12, orientation, i14, i15);
    }

    public final LazyListMeasureResult copyWithScrollDeltaWithoutRemeasure(int i10, boolean z10) {
        LazyListMeasuredItem lazyListMeasuredItem;
        if (!this.remeasureNeeded && !getVisibleItemsInfo().isEmpty() && (lazyListMeasuredItem = this.firstVisibleItem) != null) {
            int mainAxisSizeWithSpacings = lazyListMeasuredItem.getMainAxisSizeWithSpacings();
            int i11 = this.firstVisibleItemScrollOffset - i10;
            if (i11 >= 0 && i11 < mainAxisSizeWithSpacings) {
                LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) AbstractC10947g0.m23944m0(getVisibleItemsInfo());
                LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) AbstractC10947g0.m23956y0(getVisibleItemsInfo());
                if (!lazyListMeasuredItem2.getNonScrollableItem() && !lazyListMeasuredItem3.getNonScrollableItem() && (i10 >= 0 ? Math.min(getViewportStartOffset() - lazyListMeasuredItem2.getOffset(), getViewportEndOffset() - lazyListMeasuredItem3.getOffset()) > i10 : Math.min((lazyListMeasuredItem2.getOffset() + lazyListMeasuredItem2.getMainAxisSizeWithSpacings()) - getViewportStartOffset(), (lazyListMeasuredItem3.getOffset() + lazyListMeasuredItem3.getMainAxisSizeWithSpacings()) - getViewportEndOffset()) > (-i10))) {
                    List<LazyListMeasuredItem> visibleItemsInfo = getVisibleItemsInfo();
                    int size = visibleItemsInfo.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        visibleItemsInfo.get(i12).applyScrollDelta(i10, z10);
                    }
                    return new LazyListMeasureResult(this.firstVisibleItem, this.firstVisibleItemScrollOffset - i10, this.canScrollForward || i10 > 0, i10, this.measureResult, this.scrollBackAmount, this.remeasureNeeded, this.coroutineScope, this.density, this.childConstraints, getVisibleItemsInfo(), getViewportStartOffset(), getViewportEndOffset(), getTotalItemsCount(), getReverseLayout(), getOrientation(), getAfterContentPadding(), getMainAxisItemSpacing(), null);
                }
            }
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.p014ui.layout.MeasureResult
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.measureResult.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    public final boolean getCanScrollBackward() {
        LazyListMeasuredItem lazyListMeasuredItem = this.firstVisibleItem;
        return ((lazyListMeasuredItem != null ? lazyListMeasuredItem.getIndex() : 0) == 0 && this.firstVisibleItemScrollOffset == 0) ? false : true;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* renamed from: getChildConstraints-msEJaDk, reason: not valid java name */
    public final long m27568getChildConstraintsmsEJaDk() {
        return this.childConstraints;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    public final InterfaceC11122i0 getCoroutineScope() {
        return this.coroutineScope;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final LazyListMeasuredItem getFirstVisibleItem() {
        return this.firstVisibleItem;
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.firstVisibleItemScrollOffset;
    }

    @Override // androidx.compose.p014ui.layout.MeasureResult
    public int getHeight() {
        return this.measureResult.getHeight();
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public Orientation getOrientation() {
        return this.orientation;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.p014ui.layout.MeasureResult
    public InterfaceC9540l getRulers() {
        return this.measureResult.getRulers();
    }

    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo27565getViewportSizeYbymL2g() {
        return IntSize.m33667constructorimpl((getHeight() & 4294967295L) | (getWidth() << 32));
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public List<LazyListMeasuredItem> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.p014ui.layout.MeasureResult
    public int getWidth() {
        return this.measureResult.getWidth();
    }

    @Override // androidx.compose.p014ui.layout.MeasureResult
    public void placeChildren() {
        this.measureResult.placeChildren();
    }

    private LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem, int i10, boolean z10, float f10, MeasureResult measureResult, float f11, boolean z11, InterfaceC11122i0 interfaceC11122i0, Density density, long j10, List<LazyListMeasuredItem> list, int i11, int i12, int i13, boolean z12, Orientation orientation, int i14, int i15) {
        this.firstVisibleItem = lazyListMeasuredItem;
        this.firstVisibleItemScrollOffset = i10;
        this.canScrollForward = z10;
        this.consumedScroll = f10;
        this.measureResult = measureResult;
        this.scrollBackAmount = f11;
        this.remeasureNeeded = z11;
        this.coroutineScope = interfaceC11122i0;
        this.density = density;
        this.childConstraints = j10;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i11;
        this.viewportEndOffset = i12;
        this.totalItemsCount = i13;
        this.reverseLayout = z12;
        this.orientation = orientation;
        this.afterContentPadding = i14;
        this.mainAxisItemSpacing = i15;
    }
}
