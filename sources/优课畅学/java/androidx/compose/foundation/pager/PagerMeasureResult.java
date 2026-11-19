package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.p013ui.layout.AlignmentLine;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9126n;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p135i8.InterfaceC8822b0;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PagerMeasureResult implements PagerLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final int beyondViewportPageCount;
    private final boolean canScrollForward;
    private final InterfaceC8822b0 coroutineScope;
    private final MeasuredPage currentPage;
    private final float currentPageOffsetFraction;
    private final List<MeasuredPage> extraPagesAfter;
    private final List<MeasuredPage> extraPagesBefore;
    private final MeasuredPage firstVisiblePage;
    private final int firstVisiblePageScrollOffset;
    private final MeasureResult measureResult;
    private final Orientation orientation;
    private final int pageSize;
    private final int pageSpacing;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final SnapPosition snapPosition;
    private final int viewportEndOffset;
    private final int viewportStartOffset;
    private final List<MeasuredPage> visiblePagesInfo;

    public PagerMeasureResult(List<MeasuredPage> list, int i10, int i11, int i12, Orientation orientation, int i13, int i14, boolean z10, int i15, MeasuredPage measuredPage, MeasuredPage measuredPage2, float f10, int i16, boolean z11, SnapPosition snapPosition, MeasureResult measureResult, boolean z12, List<MeasuredPage> list2, List<MeasuredPage> list3, InterfaceC8822b0 interfaceC8822b0) {
        this.visiblePagesInfo = list;
        this.pageSize = i10;
        this.pageSpacing = i11;
        this.afterContentPadding = i12;
        this.orientation = orientation;
        this.viewportStartOffset = i13;
        this.viewportEndOffset = i14;
        this.reverseLayout = z10;
        this.beyondViewportPageCount = i15;
        this.firstVisiblePage = measuredPage;
        this.currentPage = measuredPage2;
        this.currentPageOffsetFraction = f10;
        this.firstVisiblePageScrollOffset = i16;
        this.canScrollForward = z11;
        this.snapPosition = snapPosition;
        this.measureResult = measureResult;
        this.remeasureNeeded = z12;
        this.extraPagesBefore = list2;
        this.extraPagesAfter = list3;
        this.coroutineScope = interfaceC8822b0;
    }

    public final PagerMeasureResult copyWithScrollDeltaWithoutRemeasure(int i10) {
        int i11;
        int pageSize = getPageSize() + getPageSpacing();
        if (!this.remeasureNeeded && !getVisiblePagesInfo().isEmpty() && this.firstVisiblePage != null && (i11 = this.firstVisiblePageScrollOffset - i10) >= 0 && i11 < pageSize) {
            float f10 = pageSize != 0 ? i10 / pageSize : 0.0f;
            float f11 = this.currentPageOffsetFraction - f10;
            if (this.currentPage != null && f11 < 0.5f && f11 > -0.5f) {
                MeasuredPage measuredPage = (MeasuredPage) AbstractC8778f0.m14566l0(getVisiblePagesInfo());
                MeasuredPage measuredPage2 = (MeasuredPage) AbstractC8778f0.m14578x0(getVisiblePagesInfo());
                if (i10 >= 0 ? Math.min(getViewportStartOffset() - measuredPage.getOffset(), getViewportEndOffset() - measuredPage2.getOffset()) > i10 : Math.min((measuredPage.getOffset() + pageSize) - getViewportStartOffset(), (measuredPage2.getOffset() + pageSize) - getViewportEndOffset()) > (-i10)) {
                    List<MeasuredPage> visiblePagesInfo = getVisiblePagesInfo();
                    int size = visiblePagesInfo.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        visiblePagesInfo.get(i12).applyScrollDelta(i10);
                    }
                    List<MeasuredPage> list = this.extraPagesBefore;
                    int size2 = list.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        list.get(i13).applyScrollDelta(i10);
                    }
                    List<MeasuredPage> list2 = this.extraPagesAfter;
                    int size3 = list2.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        list2.get(i14).applyScrollDelta(i10);
                    }
                    return new PagerMeasureResult(getVisiblePagesInfo(), getPageSize(), getPageSpacing(), getAfterContentPadding(), getOrientation(), getViewportStartOffset(), getViewportEndOffset(), getReverseLayout(), getBeyondViewportPageCount(), this.firstVisiblePage, this.currentPage, this.currentPageOffsetFraction - f10, this.firstVisiblePageScrollOffset - i10, this.canScrollForward || i10 > 0, getSnapPosition(), this.measureResult, this.remeasureNeeded, this.extraPagesBefore, this.extraPagesAfter, this.coroutineScope);
                }
            }
        }
        return null;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.p013ui.layout.MeasureResult
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.measureResult.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getBeyondViewportPageCount() {
        return this.beyondViewportPageCount;
    }

    public final boolean getCanScrollBackward() {
        MeasuredPage measuredPage = this.firstVisiblePage;
        return ((measuredPage != null ? measuredPage.getIndex() : 0) == 0 && this.firstVisiblePageScrollOffset == 0) ? false : true;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    public final InterfaceC8822b0 getCoroutineScope() {
        return this.coroutineScope;
    }

    public final MeasuredPage getCurrentPage() {
        return this.currentPage;
    }

    public final float getCurrentPageOffsetFraction() {
        return this.currentPageOffsetFraction;
    }

    public final List<MeasuredPage> getExtraPagesAfter() {
        return this.extraPagesAfter;
    }

    public final List<MeasuredPage> getExtraPagesBefore() {
        return this.extraPagesBefore;
    }

    public final MeasuredPage getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    public final int getFirstVisiblePageScrollOffset() {
        return this.firstVisiblePageScrollOffset;
    }

    @Override // androidx.compose.p013ui.layout.MeasureResult
    public int getHeight() {
        return this.measureResult.getHeight();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPageSize() {
        return this.pageSize;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPageSpacing() {
        return this.pageSpacing;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.p013ui.layout.MeasureResult
    public InterfaceC10570l getRulers() {
        return this.measureResult.getRulers();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public SnapPosition getSnapPosition() {
        return this.snapPosition;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo21106getViewportSizeYbymL2g() {
        return IntSize.m27065constructorimpl((getHeight() & 4294967295L) | (getWidth() << 32));
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public List<MeasuredPage> getVisiblePagesInfo() {
        return this.visiblePagesInfo;
    }

    @Override // androidx.compose.p013ui.layout.MeasureResult
    public int getWidth() {
        return this.measureResult.getWidth();
    }

    @Override // androidx.compose.p013ui.layout.MeasureResult
    public void placeChildren() {
        this.measureResult.placeChildren();
    }

    public /* synthetic */ PagerMeasureResult(List list, int i10, int i11, int i12, Orientation orientation, int i13, int i14, boolean z10, int i15, MeasuredPage measuredPage, MeasuredPage measuredPage2, float f10, int i16, boolean z11, SnapPosition snapPosition, MeasureResult measureResult, boolean z12, List list2, List list3, InterfaceC8822b0 interfaceC8822b0, int i17, AbstractC9126n abstractC9126n) {
        this(list, i10, i11, i12, orientation, i13, i14, z10, i15, measuredPage, measuredPage2, f10, i16, z11, snapPosition, measureResult, z12, (i17 & 131072) != 0 ? AbstractC8809v.m14771n() : list2, (i17 & 262144) != 0 ? AbstractC8809v.m14771n() : list3, interfaceC8822b0);
    }
}
