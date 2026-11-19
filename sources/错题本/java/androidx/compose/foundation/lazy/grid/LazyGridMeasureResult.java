package androidx.compose.foundation.lazy.grid;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p011ui.layout.AlignmentLine;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BÔ\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u00123\u0010\u001a\u001a/\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\u00180\u00170\u0013\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010#\u001a\u00020\u0005\u0012\u0006\u0010$\u001a\u00020\u0005¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'H\u0096\u0001¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u0004\u0018\u00010\u00002\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u00103R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u00106R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u00109R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b;\u00109R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b<\u00106R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u00101\u001a\u0004\bC\u00103RD\u0010\u001a\u001a/\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\u00180\u00170\u00138\u0006¢\u0006\f\n\u0004\b\u001a\u0010D\u001a\u0004\bE\u0010FR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010\u001d\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u00101\u001a\u0004\bJ\u00103R\u001a\u0010\u001e\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u00101\u001a\u0004\bK\u00103R\u001a\u0010\u001f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u00101\u001a\u0004\bL\u00103R\u001a\u0010 \u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u00104\u001a\u0004\bM\u00106R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010#\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u00101\u001a\u0004\bQ\u00103R\u001a\u0010$\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u00101\u001a\u0004\bR\u00103R \u0010W\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\u00050S8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bX\u00103R'\u0010]\u001a\u0015\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020'\u0018\u00010\u0013¢\u0006\u0002\b[8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\\\u0010FR\u0014\u0010_\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b^\u00103R\u0011\u0010a\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b`\u00106R\u001a\u0010e\u001a\u00020b8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010g\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u00103R\u0014\u0010i\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006j"}, m5110d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "firstVisibleLine", "", "firstVisibleLineScrollOffset", "", "canScrollForward", "", "consumedScroll", "measureResult", "scrollBackAmount", "remeasureNeeded", "Lkotlinx/coroutines/v;", "coroutineScope", "Landroidx/compose/ui/unit/Density;", "density", "slotsPerLine", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "line", "", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/Constraints;", "prefetchInfoRetriever", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "visibleItemsInfo", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "afterContentPadding", "mainAxisItemSpacing", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;IZFLandroidx/compose/ui/layout/MeasureResult;FZLkotlinx/coroutines/v;Landroidx/compose/ui/unit/Density;ILr6/c;Ljava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;II)V", "Ld6/s;", "placeChildren", "()V", "delta", "updateAnimations", "copyWithScrollDeltaWithoutRemeasure", "(IZ)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "getFirstVisibleLine", "()Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "I", "getFirstVisibleLineScrollOffset", "()I", "Z", "getCanScrollForward", "()Z", "F", "getConsumedScroll", "()F", "Landroidx/compose/ui/layout/MeasureResult;", "getScrollBackAmount", "getRemeasureNeeded", "Lkotlinx/coroutines/v;", "getCoroutineScope", "()Lkotlinx/coroutines/v;", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "getSlotsPerLine", "Lr6/c;", "getPrefetchInfoRetriever", "()Lr6/c;", "Ljava/util/List;", "getVisibleItemsInfo", "()Ljava/util/List;", "getViewportStartOffset", "getViewportEndOffset", "getTotalItemsCount", "getReverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getAfterContentPadding", "getMainAxisItemSpacing", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "getRulers", "rulers", "getWidth", "width", "getCanScrollBackward", "canScrollBackward", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "()J", "viewportSize", "getBeforeContentPadding", "beforeContentPadding", "getMaxSpan", "maxSpan", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyGridMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasureResult.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureResult\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,162:1\n30#2:163\n80#3:164\n34#4,6:165\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasureResult.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureResult\n*L\n76#1:163\n76#1:164\n133#1:165,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridMeasureResult implements LazyGridLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final boolean canScrollForward;
    private final float consumedScroll;

    @NotNull
    private final InterfaceC6009v coroutineScope;

    @NotNull
    private final Density density;

    @Nullable
    private final LazyGridMeasuredLine firstVisibleLine;
    private final int firstVisibleLineScrollOffset;
    private final int mainAxisItemSpacing;

    @NotNull
    private final MeasureResult measureResult;

    @NotNull
    private final Orientation orientation;

    @NotNull
    private final InterfaceC6471c prefetchInfoRetriever;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final float scrollBackAmount;
    private final int slotsPerLine;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final int viewportStartOffset;

    @NotNull
    private final List<LazyGridMeasuredItem> visibleItemsInfo;

    public LazyGridMeasureResult(@Nullable LazyGridMeasuredLine lazyGridMeasuredLine, int i, boolean z8, float f, @NotNull MeasureResult measureResult, float f7, boolean z9, @NotNull InterfaceC6009v interfaceC6009v, @NotNull Density density, int i8, @NotNull InterfaceC6471c interfaceC6471c, @NotNull List<LazyGridMeasuredItem> list, int i9, int i10, int i11, boolean z10, @NotNull Orientation orientation, int i12, int i13) {
        this.firstVisibleLine = lazyGridMeasuredLine;
        this.firstVisibleLineScrollOffset = i;
        this.canScrollForward = z8;
        this.consumedScroll = f;
        this.measureResult = measureResult;
        this.scrollBackAmount = f7;
        this.remeasureNeeded = z9;
        this.coroutineScope = interfaceC6009v;
        this.density = density;
        this.slotsPerLine = i8;
        this.prefetchInfoRetriever = interfaceC6471c;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i9;
        this.viewportEndOffset = i10;
        this.totalItemsCount = i11;
        this.reverseLayout = z10;
        this.orientation = orientation;
        this.afterContentPadding = i12;
        this.mainAxisItemSpacing = i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if (java.lang.Math.min((r2.getMainAxisSizeWithSpacings() + androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(r2, getOrientation())) - getViewportStartOffset(), (r4.getMainAxisSizeWithSpacings() + androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(r4, getOrientation())) - getViewportEndOffset()) > (-r27)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
    
        if (java.lang.Math.min(getViewportStartOffset() - androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(r2, getOrientation()), getViewportEndOffset() - androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(r4, getOrientation())) > r27) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        r2 = getVisibleItemsInfo();
        r3 = r2.size();
        r4 = false;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        if (r5 >= r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        r2.get(r5).applyScrollDelta(r27, r28);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        r7 = r26.firstVisibleLine;
        r8 = r26.firstVisibleLineScrollOffset - r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        if (r26.canScrollForward != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        if (r27 <= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bb, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f5, code lost:
    
        return new androidx.compose.foundation.lazy.grid.LazyGridMeasureResult(r7, r8, r4, r27, r26.measureResult, r26.scrollBackAmount, r26.remeasureNeeded, r26.coroutineScope, r26.density, r26.slotsPerLine, r26.prefetchInfoRetriever, getVisibleItemsInfo(), getViewportStartOffset(), getViewportEndOffset(), getTotalItemsCount(), getReverseLayout(), getOrientation(), getAfterContentPadding(), getMainAxisItemSpacing());
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.foundation.lazy.grid.LazyGridMeasureResult copyWithScrollDeltaWithoutRemeasure(int r27, boolean r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            boolean r2 = r0.remeasureNeeded
            r3 = 0
            if (r2 != 0) goto Lf6
            java.util.List r2 = r0.getVisibleItemsInfo()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lf6
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r2 = r0.firstVisibleLine
            if (r2 == 0) goto Lf6
            int r2 = r2.getMainAxisSizeWithSpacings()
            int r4 = r0.firstVisibleLineScrollOffset
            int r4 = r4 - r1
            if (r4 < 0) goto Lf6
            if (r4 >= r2) goto Lf6
            java.util.List r2 = r0.getVisibleItemsInfo()
            java.lang.Object r2 = kotlin.collections.AbstractC5805t.m5228h0(r2)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r2 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) r2
            java.util.List r4 = r0.getVisibleItemsInfo()
            java.lang.Object r4 = kotlin.collections.AbstractC5805t.m5235o0(r4)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r4 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) r4
            boolean r5 = r2.getNonScrollableItem()
            if (r5 != 0) goto Lf6
            boolean r5 = r4.getNonScrollableItem()
            if (r5 == 0) goto L44
            goto Lf6
        L44:
            if (r1 >= 0) goto L72
            androidx.compose.foundation.gestures.Orientation r5 = r0.getOrientation()
            int r5 = androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(r2, r5)
            int r2 = r2.getMainAxisSizeWithSpacings()
            int r2 = r2 + r5
            int r5 = r0.getViewportStartOffset()
            int r2 = r2 - r5
            androidx.compose.foundation.gestures.Orientation r5 = r0.getOrientation()
            int r5 = androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(r4, r5)
            int r4 = r4.getMainAxisSizeWithSpacings()
            int r4 = r4 + r5
            int r5 = r0.getViewportEndOffset()
            int r4 = r4 - r5
            int r2 = java.lang.Math.min(r2, r4)
            int r4 = -r1
            if (r2 <= r4) goto Lf6
            goto L92
        L72:
            int r5 = r0.getViewportStartOffset()
            androidx.compose.foundation.gestures.Orientation r6 = r0.getOrientation()
            int r2 = androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(r2, r6)
            int r5 = r5 - r2
            int r2 = r0.getViewportEndOffset()
            androidx.compose.foundation.gestures.Orientation r6 = r0.getOrientation()
            int r4 = androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(r4, r6)
            int r2 = r2 - r4
            int r2 = java.lang.Math.min(r5, r2)
            if (r2 <= r1) goto Lf6
        L92:
            java.util.List r2 = r0.getVisibleItemsInfo()
            int r3 = r2.size()
            r4 = 0
            r5 = r4
        L9c:
            if (r5 >= r3) goto Lac
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem r6 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) r6
            r7 = r28
            r6.applyScrollDelta(r1, r7)
            int r5 = r5 + 1
            goto L9c
        Lac:
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r7 = r0.firstVisibleLine
            int r2 = r0.firstVisibleLineScrollOffset
            int r8 = r2 - r1
            boolean r2 = r0.canScrollForward
            if (r2 != 0) goto Lbb
            if (r1 <= 0) goto Lb9
            goto Lbb
        Lb9:
            r9 = r4
            goto Lbd
        Lbb:
            r4 = 1
            goto Lb9
        Lbd:
            float r10 = (float) r1
            float r12 = r0.scrollBackAmount
            androidx.compose.ui.layout.MeasureResult r11 = r0.measureResult
            boolean r13 = r0.remeasureNeeded
            kotlinx.coroutines.v r14 = r0.coroutineScope
            androidx.compose.ui.unit.Density r15 = r0.density
            int r1 = r0.slotsPerLine
            r6.c r2 = r0.prefetchInfoRetriever
            java.util.List r18 = r0.getVisibleItemsInfo()
            int r19 = r0.getViewportStartOffset()
            int r20 = r0.getViewportEndOffset()
            int r21 = r0.getTotalItemsCount()
            boolean r22 = r0.getReverseLayout()
            androidx.compose.foundation.gestures.Orientation r23 = r0.getOrientation()
            int r24 = r0.getAfterContentPadding()
            int r25 = r0.getMainAxisItemSpacing()
            androidx.compose.foundation.lazy.grid.LazyGridMeasureResult r6 = new androidx.compose.foundation.lazy.grid.LazyGridMeasureResult
            r16 = r1
            r17 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r6
        Lf6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridMeasureResult.copyWithScrollDeltaWithoutRemeasure(int, boolean):androidx.compose.foundation.lazy.grid.LazyGridMeasureResult");
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.p011ui.layout.MeasureResult
    @NotNull
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.measureResult.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    public final boolean getCanScrollBackward() {
        LazyGridMeasuredLine lazyGridMeasuredLine = this.firstVisibleLine;
        return ((lazyGridMeasuredLine != null ? lazyGridMeasuredLine.getIndex() : 0) == 0 && this.firstVisibleLineScrollOffset == 0) ? false : true;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    @NotNull
    public final InterfaceC6009v getCoroutineScope() {
        return this.coroutineScope;
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    @Nullable
    public final LazyGridMeasuredLine getFirstVisibleLine() {
        return this.firstVisibleLine;
    }

    public final int getFirstVisibleLineScrollOffset() {
        return this.firstVisibleLineScrollOffset;
    }

    @Override // androidx.compose.p011ui.layout.MeasureResult
    /* renamed from: getHeight */
    public int getF906$h() {
        return this.measureResult.getF906$h();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* renamed from: getMaxSpan, reason: from getter */
    public int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    @NotNull
    public Orientation getOrientation() {
        return this.orientation;
    }

    @NotNull
    public final InterfaceC6471c getPrefetchInfoRetriever() {
        return this.prefetchInfoRetriever;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.p011ui.layout.MeasureResult
    @Nullable
    /* renamed from: getRulers */
    public InterfaceC6471c get$rulers() {
        return this.measureResult.get$rulers();
    }

    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }

    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo7405getViewportSizeYbymL2g() {
        return IntSize.m13471constructorimpl((getF906$h() & 4294967295L) | (getF907$w() << 32));
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    @NotNull
    public List<LazyGridMeasuredItem> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.p011ui.layout.MeasureResult
    /* renamed from: getWidth */
    public int getF907$w() {
        return this.measureResult.getF907$w();
    }

    @Override // androidx.compose.p011ui.layout.MeasureResult
    public void placeChildren() {
        this.measureResult.placeChildren();
    }
}
