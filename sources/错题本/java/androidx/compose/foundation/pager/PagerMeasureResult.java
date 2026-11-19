package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.p011ui.layout.AlignmentLine;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BÁ\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u0004\u0018\u00010\u00002\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b-\u0010,R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b.\u0010,R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b2\u0010,R\u001a\u0010\r\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b3\u0010,R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0010\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b7\u0010,R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b;\u0010:R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010*\u001a\u0004\b?\u0010,R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u00104\u001a\u0004\b@\u00106R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010DR\u0017\u0010\u001a\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001a\u00104\u001a\u0004\bE\u00106R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\bF\u0010)R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010'\u001a\u0004\bG\u0010)R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010H\u001a\u0004\bI\u0010JR \u0010O\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\u00060K8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010,R'\u0010W\u001a\u0015\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020!\u0018\u00010R¢\u0006\u0002\bT8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bX\u0010,R\u001a\u0010]\u001a\u00020Z8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010_\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010,R\u0011\u0010a\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b`\u00106\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006b"}, m5110d2 = {"Landroidx/compose/foundation/pager/PagerMeasureResult;", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "", "Landroidx/compose/foundation/pager/MeasuredPage;", "visiblePagesInfo", "", "pageSize", "pageSpacing", "afterContentPadding", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "viewportStartOffset", "viewportEndOffset", "", "reverseLayout", "beyondViewportPageCount", "firstVisiblePage", "currentPage", "", "currentPageOffsetFraction", "firstVisiblePageScrollOffset", "canScrollForward", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "snapPosition", "measureResult", "remeasureNeeded", "extraPagesBefore", "extraPagesAfter", "Lkotlinx/coroutines/v;", "coroutineScope", "<init>", "(Ljava/util/List;IIILandroidx/compose/foundation/gestures/Orientation;IIZILandroidx/compose/foundation/pager/MeasuredPage;Landroidx/compose/foundation/pager/MeasuredPage;FIZLandroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/ui/layout/MeasureResult;ZLjava/util/List;Ljava/util/List;Lkotlinx/coroutines/v;)V", "Ld6/s;", "placeChildren", "()V", "delta", "copyWithScrollDeltaWithoutRemeasure", "(I)Landroidx/compose/foundation/pager/PagerMeasureResult;", "Ljava/util/List;", "getVisiblePagesInfo", "()Ljava/util/List;", "I", "getPageSize", "()I", "getPageSpacing", "getAfterContentPadding", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getViewportStartOffset", "getViewportEndOffset", "Z", "getReverseLayout", "()Z", "getBeyondViewportPageCount", "Landroidx/compose/foundation/pager/MeasuredPage;", "getFirstVisiblePage", "()Landroidx/compose/foundation/pager/MeasuredPage;", "getCurrentPage", "F", "getCurrentPageOffsetFraction", "()F", "getFirstVisiblePageScrollOffset", "getCanScrollForward", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "getSnapPosition", "()Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "Landroidx/compose/ui/layout/MeasureResult;", "getRemeasureNeeded", "getExtraPagesBefore", "getExtraPagesAfter", "Lkotlinx/coroutines/v;", "getCoroutineScope", "()Lkotlinx/coroutines/v;", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "getRulers", "()Lr6/c;", "rulers", "getWidth", "width", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "()J", "viewportSize", "getBeforeContentPadding", "beforeContentPadding", "getCanScrollBackward", "canScrollBackward", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPagerMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasureResult.kt\nandroidx/compose/foundation/pager/PagerMeasureResult\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,148:1\n30#2:149\n80#3:150\n34#4,6:151\n34#4,6:157\n34#4,6:163\n*S KotlinDebug\n*F\n+ 1 PagerMeasureResult.kt\nandroidx/compose/foundation/pager/PagerMeasureResult\n*L\n50#1:149\n50#1:150\n115#1:151,6\n116#1:157,6\n117#1:163,6\n*E\n"})
/* loaded from: classes.dex */
public final class PagerMeasureResult implements PagerLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final int beyondViewportPageCount;
    private final boolean canScrollForward;

    @NotNull
    private final InterfaceC6009v coroutineScope;

    @Nullable
    private final MeasuredPage currentPage;
    private final float currentPageOffsetFraction;

    @NotNull
    private final List<MeasuredPage> extraPagesAfter;

    @NotNull
    private final List<MeasuredPage> extraPagesBefore;

    @Nullable
    private final MeasuredPage firstVisiblePage;
    private final int firstVisiblePageScrollOffset;

    @NotNull
    private final MeasureResult measureResult;

    @NotNull
    private final Orientation orientation;
    private final int pageSize;
    private final int pageSpacing;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;

    @NotNull
    private final SnapPosition snapPosition;
    private final int viewportEndOffset;
    private final int viewportStartOffset;

    @NotNull
    private final List<MeasuredPage> visiblePagesInfo;

    public PagerMeasureResult(@NotNull List<MeasuredPage> list, int i, int i8, int i9, @NotNull Orientation orientation, int i10, int i11, boolean z8, int i12, @Nullable MeasuredPage measuredPage, @Nullable MeasuredPage measuredPage2, float f, int i13, boolean z9, @NotNull SnapPosition snapPosition, @NotNull MeasureResult measureResult, boolean z10, @NotNull List<MeasuredPage> list2, @NotNull List<MeasuredPage> list3, @NotNull InterfaceC6009v interfaceC6009v) {
        this.visiblePagesInfo = list;
        this.pageSize = i;
        this.pageSpacing = i8;
        this.afterContentPadding = i9;
        this.orientation = orientation;
        this.viewportStartOffset = i10;
        this.viewportEndOffset = i11;
        this.reverseLayout = z8;
        this.beyondViewportPageCount = i12;
        this.firstVisiblePage = measuredPage;
        this.currentPage = measuredPage2;
        this.currentPageOffsetFraction = f;
        this.firstVisiblePageScrollOffset = i13;
        this.canScrollForward = z9;
        this.snapPosition = snapPosition;
        this.measureResult = measureResult;
        this.remeasureNeeded = z10;
        this.extraPagesBefore = list2;
        this.extraPagesAfter = list3;
        this.coroutineScope = interfaceC6009v;
    }

    @Nullable
    public final PagerMeasureResult copyWithScrollDeltaWithoutRemeasure(int delta) {
        int i;
        int pageSpacing = getPageSpacing() + getPageSize();
        if (!this.remeasureNeeded && !getVisiblePagesInfo().isEmpty() && this.firstVisiblePage != null && (i = this.firstVisiblePageScrollOffset - delta) >= 0 && i < pageSpacing) {
            float f = pageSpacing != 0 ? delta / pageSpacing : 0.0f;
            float f7 = this.currentPageOffsetFraction - f;
            if (this.currentPage != null && f7 < 0.5f && f7 > -0.5f) {
                MeasuredPage measuredPage = (MeasuredPage) AbstractC5805t.m5228h0(getVisiblePagesInfo());
                MeasuredPage measuredPage2 = (MeasuredPage) AbstractC5805t.m5235o0(getVisiblePagesInfo());
                if (delta >= 0 ? Math.min(getViewportStartOffset() - measuredPage.getOffset(), getViewportEndOffset() - measuredPage2.getOffset()) > delta : Math.min((measuredPage.getOffset() + pageSpacing) - getViewportStartOffset(), (measuredPage2.getOffset() + pageSpacing) - getViewportEndOffset()) > (-delta)) {
                    List<MeasuredPage> visiblePagesInfo = getVisiblePagesInfo();
                    int size = visiblePagesInfo.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        visiblePagesInfo.get(i8).applyScrollDelta(delta);
                    }
                    List<MeasuredPage> list = this.extraPagesBefore;
                    int size2 = list.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        list.get(i9).applyScrollDelta(delta);
                    }
                    List<MeasuredPage> list2 = this.extraPagesAfter;
                    int size3 = list2.size();
                    for (int i10 = 0; i10 < size3; i10++) {
                        list2.get(i10).applyScrollDelta(delta);
                    }
                    return new PagerMeasureResult(getVisiblePagesInfo(), getPageSize(), getPageSpacing(), getAfterContentPadding(), getOrientation(), getViewportStartOffset(), getViewportEndOffset(), getReverseLayout(), getBeyondViewportPageCount(), this.firstVisiblePage, this.currentPage, this.currentPageOffsetFraction - f, this.firstVisiblePageScrollOffset - delta, this.canScrollForward || delta > 0, getSnapPosition(), this.measureResult, this.remeasureNeeded, this.extraPagesBefore, this.extraPagesAfter, this.coroutineScope);
                }
            }
        }
        return null;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.p011ui.layout.MeasureResult
    @NotNull
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

    @NotNull
    public final InterfaceC6009v getCoroutineScope() {
        return this.coroutineScope;
    }

    @Nullable
    public final MeasuredPage getCurrentPage() {
        return this.currentPage;
    }

    public final float getCurrentPageOffsetFraction() {
        return this.currentPageOffsetFraction;
    }

    @NotNull
    public final List<MeasuredPage> getExtraPagesAfter() {
        return this.extraPagesAfter;
    }

    @NotNull
    public final List<MeasuredPage> getExtraPagesBefore() {
        return this.extraPagesBefore;
    }

    @Nullable
    public final MeasuredPage getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    public final int getFirstVisiblePageScrollOffset() {
        return this.firstVisiblePageScrollOffset;
    }

    @Override // androidx.compose.p011ui.layout.MeasureResult
    /* renamed from: getHeight */
    public int get$height() {
        return this.measureResult.get$height();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    @NotNull
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

    @Override // androidx.compose.p011ui.layout.MeasureResult
    @Nullable
    /* renamed from: getRulers */
    public InterfaceC6471c get$rulers() {
        return this.measureResult.get$rulers();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    @NotNull
    public SnapPosition getSnapPosition() {
        return this.snapPosition;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo7512getViewportSizeYbymL2g() {
        return IntSize.m13471constructorimpl((get$height() & 4294967295L) | (get$width() << 32));
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    @NotNull
    public List<MeasuredPage> getVisiblePagesInfo() {
        return this.visiblePagesInfo;
    }

    @Override // androidx.compose.p011ui.layout.MeasureResult
    /* renamed from: getWidth */
    public int get$width() {
        return this.measureResult.get$width();
    }

    @Override // androidx.compose.p011ui.layout.MeasureResult
    public void placeChildren() {
        this.measureResult.placeChildren();
    }

    public PagerMeasureResult(List list, int i, int i8, int i9, Orientation orientation, int i10, int i11, boolean z8, int i12, MeasuredPage measuredPage, MeasuredPage measuredPage2, float f, int i13, boolean z9, SnapPosition snapPosition, MeasureResult measureResult, boolean z10, List list2, List list3, InterfaceC6009v interfaceC6009v, int i14, AbstractC5824e abstractC5824e) {
        this(list, i, i8, i9, orientation, i10, i11, z8, i12, measuredPage, measuredPage2, f, i13, z9, snapPosition, measureResult, z10, (i14 & 131072) != 0 ? EmptyList.INSTANCE : list2, (i14 & 262144) != 0 ? EmptyList.INSTANCE : list3, interfaceC6009v);
    }
}
