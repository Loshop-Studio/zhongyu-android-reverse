package androidx.compose.foundation.lazy;

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
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u009f\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u0004\u0018\u00010\u00002\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u00102R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b4\u00102R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b5\u0010/R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\b:\u0010;R\u001d\u0010\u0013\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010<\u001a\u0004\b=\u0010>R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\u0016\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\bB\u0010,R\u001a\u0010\u0017\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010*\u001a\u0004\bC\u0010,R\u001a\u0010\u0018\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010*\u001a\u0004\bD\u0010,R\u001a\u0010\u0019\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010-\u001a\u0004\bE\u0010/R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010\u001c\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010*\u001a\u0004\bI\u0010,R\u001a\u0010\u001d\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010*\u001a\u0004\bJ\u0010,R \u0010O\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\u00050K8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010,R'\u0010W\u001a\u0015\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020 \u0018\u00010R¢\u0006\u0002\bT8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bX\u0010,R\u0011\u0010[\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bZ\u0010/R\u001a\u0010^\u001a\u00020\\8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b]\u0010>R\u0014\u0010`\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006a"}, m5110d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "firstVisibleItem", "", "firstVisibleItemScrollOffset", "", "canScrollForward", "", "consumedScroll", "measureResult", "scrollBackAmount", "remeasureNeeded", "Lkotlinx/coroutines/v;", "coroutineScope", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Constraints;", "childConstraints", "", "visibleItemsInfo", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "afterContentPadding", "mainAxisItemSpacing", "<init>", "(Landroidx/compose/foundation/lazy/LazyListMeasuredItem;IZFLandroidx/compose/ui/layout/MeasureResult;FZLkotlinx/coroutines/v;Landroidx/compose/ui/unit/Density;JLjava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;IILkotlin/jvm/internal/e;)V", "Ld6/s;", "placeChildren", "()V", "delta", "updateAnimations", "copyWithScrollDeltaWithoutRemeasure", "(IZ)Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "getFirstVisibleItem", "()Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "I", "getFirstVisibleItemScrollOffset", "()I", "Z", "getCanScrollForward", "()Z", "F", "getConsumedScroll", "()F", "Landroidx/compose/ui/layout/MeasureResult;", "getScrollBackAmount", "getRemeasureNeeded", "Lkotlinx/coroutines/v;", "getCoroutineScope", "()Lkotlinx/coroutines/v;", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "J", "getChildConstraints-msEJaDk", "()J", "Ljava/util/List;", "getVisibleItemsInfo", "()Ljava/util/List;", "getViewportStartOffset", "getViewportEndOffset", "getTotalItemsCount", "getReverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getAfterContentPadding", "getMainAxisItemSpacing", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "getRulers", "()Lr6/c;", "rulers", "getWidth", "width", "getCanScrollBackward", "canScrollBackward", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "viewportSize", "getBeforeContentPadding", "beforeContentPadding", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyListMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasureResult.kt\nandroidx/compose/foundation/lazy/LazyListMeasureResult\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,152:1\n30#2:153\n80#3:154\n34#4,6:155\n*S KotlinDebug\n*F\n+ 1 LazyListMeasureResult.kt\nandroidx/compose/foundation/lazy/LazyListMeasureResult\n*L\n73#1:153\n73#1:154\n124#1:155,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListMeasureResult implements LazyListLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final boolean canScrollForward;
    private final long childConstraints;
    private final float consumedScroll;

    @NotNull
    private final InterfaceC6009v coroutineScope;

    @NotNull
    private final Density density;

    @Nullable
    private final LazyListMeasuredItem firstVisibleItem;
    private final int firstVisibleItemScrollOffset;
    private final int mainAxisItemSpacing;

    @NotNull
    private final MeasureResult measureResult;

    @NotNull
    private final Orientation orientation;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final float scrollBackAmount;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final int viewportStartOffset;

    @NotNull
    private final List<LazyListMeasuredItem> visibleItemsInfo;

    public /* synthetic */ LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem, int i, boolean z8, float f, MeasureResult measureResult, float f7, boolean z9, InterfaceC6009v interfaceC6009v, Density density, long j7, List list, int i8, int i9, int i10, boolean z10, Orientation orientation, int i11, int i12, AbstractC5824e abstractC5824e) {
        this(lazyListMeasuredItem, i, z8, f, measureResult, f7, z9, interfaceC6009v, density, j7, list, i8, i9, i10, z10, orientation, i11, i12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (java.lang.Math.min((r2.getMainAxisSizeWithSpacings() + r2.getOffset()) - getViewportStartOffset(), (r4.getMainAxisSizeWithSpacings() + r4.getOffset()) - getViewportEndOffset()) > (-r28)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (java.lang.Math.min(getViewportStartOffset() - r2.getOffset(), getViewportEndOffset() - r4.getOffset()) > r28) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        r2 = getVisibleItemsInfo();
        r3 = r2.size();
        r4 = false;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        if (r5 >= r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        r2.get(r5).applyScrollDelta(r28, r29);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009c, code lost:
    
        r7 = r27.firstVisibleItem;
        r8 = r27.firstVisibleItemScrollOffset - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
    
        if (r27.canScrollForward != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
    
        if (r28 <= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e3, code lost:
    
        return new androidx.compose.foundation.lazy.LazyListMeasureResult(r7, r8, r4, r28, r27.measureResult, r27.scrollBackAmount, r27.remeasureNeeded, r27.coroutineScope, r27.density, r27.childConstraints, getVisibleItemsInfo(), getViewportStartOffset(), getViewportEndOffset(), getTotalItemsCount(), getReverseLayout(), getOrientation(), getAfterContentPadding(), getMainAxisItemSpacing(), null);
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.foundation.lazy.LazyListMeasureResult copyWithScrollDeltaWithoutRemeasure(int r28, boolean r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            boolean r2 = r0.remeasureNeeded
            r3 = 0
            if (r2 != 0) goto Le4
            java.util.List r2 = r0.getVisibleItemsInfo()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Le4
            androidx.compose.foundation.lazy.LazyListMeasuredItem r2 = r0.firstVisibleItem
            if (r2 == 0) goto Le4
            int r2 = r2.getMainAxisSizeWithSpacings()
            int r4 = r0.firstVisibleItemScrollOffset
            int r4 = r4 - r1
            if (r4 < 0) goto Le4
            if (r4 >= r2) goto Le4
            java.util.List r2 = r0.getVisibleItemsInfo()
            java.lang.Object r2 = kotlin.collections.AbstractC5805t.m5228h0(r2)
            androidx.compose.foundation.lazy.LazyListMeasuredItem r2 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r2
            java.util.List r4 = r0.getVisibleItemsInfo()
            java.lang.Object r4 = kotlin.collections.AbstractC5805t.m5235o0(r4)
            androidx.compose.foundation.lazy.LazyListMeasuredItem r4 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r4
            boolean r5 = r2.getNonScrollableItem()
            if (r5 != 0) goto Le4
            boolean r5 = r4.getNonScrollableItem()
            if (r5 == 0) goto L44
            goto Le4
        L44:
            if (r1 >= 0) goto L6a
            int r5 = r2.getOffset()
            int r2 = r2.getMainAxisSizeWithSpacings()
            int r2 = r2 + r5
            int r5 = r0.getViewportStartOffset()
            int r2 = r2 - r5
            int r5 = r4.getOffset()
            int r4 = r4.getMainAxisSizeWithSpacings()
            int r4 = r4 + r5
            int r5 = r0.getViewportEndOffset()
            int r4 = r4 - r5
            int r2 = java.lang.Math.min(r2, r4)
            int r4 = -r1
            if (r2 <= r4) goto Le4
            goto L82
        L6a:
            int r5 = r0.getViewportStartOffset()
            int r2 = r2.getOffset()
            int r5 = r5 - r2
            int r2 = r0.getViewportEndOffset()
            int r4 = r4.getOffset()
            int r2 = r2 - r4
            int r2 = java.lang.Math.min(r5, r2)
            if (r2 <= r1) goto Le4
        L82:
            java.util.List r2 = r0.getVisibleItemsInfo()
            int r3 = r2.size()
            r4 = 0
            r5 = r4
        L8c:
            if (r5 >= r3) goto L9c
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.foundation.lazy.LazyListMeasuredItem r6 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r6
            r7 = r29
            r6.applyScrollDelta(r1, r7)
            int r5 = r5 + 1
            goto L8c
        L9c:
            androidx.compose.foundation.lazy.LazyListMeasureResult r6 = new androidx.compose.foundation.lazy.LazyListMeasureResult
            androidx.compose.foundation.lazy.LazyListMeasuredItem r7 = r0.firstVisibleItem
            int r2 = r0.firstVisibleItemScrollOffset
            int r8 = r2 - r1
            boolean r2 = r0.canScrollForward
            if (r2 != 0) goto Lad
            if (r1 <= 0) goto Lab
            goto Lad
        Lab:
            r9 = r4
            goto Laf
        Lad:
            r4 = 1
            goto Lab
        Laf:
            float r10 = (float) r1
            androidx.compose.ui.layout.MeasureResult r11 = r0.measureResult
            float r12 = r0.scrollBackAmount
            boolean r13 = r0.remeasureNeeded
            kotlinx.coroutines.v r14 = r0.coroutineScope
            androidx.compose.ui.unit.Density r15 = r0.density
            long r1 = r0.childConstraints
            java.util.List r18 = r0.getVisibleItemsInfo()
            int r19 = r0.getViewportStartOffset()
            int r20 = r0.getViewportEndOffset()
            int r21 = r0.getTotalItemsCount()
            boolean r22 = r0.getReverseLayout()
            androidx.compose.foundation.gestures.Orientation r23 = r0.getOrientation()
            int r24 = r0.getAfterContentPadding()
            int r25 = r0.getMainAxisItemSpacing()
            r26 = 0
            r16 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r6
        Le4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListMeasureResult.copyWithScrollDeltaWithoutRemeasure(int, boolean):androidx.compose.foundation.lazy.LazyListMeasureResult");
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.p011ui.layout.MeasureResult
    @NotNull
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

    /* renamed from: getChildConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getChildConstraints() {
        return this.childConstraints;
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
    public final LazyListMeasuredItem getFirstVisibleItem() {
        return this.firstVisibleItem;
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.firstVisibleItemScrollOffset;
    }

    @Override // androidx.compose.p011ui.layout.MeasureResult
    /* renamed from: getHeight */
    public int get$height() {
        return this.measureResult.get$height();
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    @NotNull
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

    @Override // androidx.compose.p011ui.layout.MeasureResult
    @Nullable
    /* renamed from: getRulers */
    public InterfaceC6471c get$rulers() {
        return this.measureResult.get$rulers();
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
    public long mo7369getViewportSizeYbymL2g() {
        return IntSize.m13471constructorimpl((get$height() & 4294967295L) | (get$width() << 32));
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    @NotNull
    public List<LazyListMeasuredItem> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
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

    private LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem, int i, boolean z8, float f, MeasureResult measureResult, float f7, boolean z9, InterfaceC6009v interfaceC6009v, Density density, long j7, List<LazyListMeasuredItem> list, int i8, int i9, int i10, boolean z10, Orientation orientation, int i11, int i12) {
        this.firstVisibleItem = lazyListMeasuredItem;
        this.firstVisibleItemScrollOffset = i;
        this.canScrollForward = z8;
        this.consumedScroll = f;
        this.measureResult = measureResult;
        this.scrollBackAmount = f7;
        this.remeasureNeeded = z9;
        this.coroutineScope = interfaceC6009v;
        this.density = density;
        this.childConstraints = j7;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i8;
        this.viewportEndOffset = i9;
        this.totalItemsCount = i10;
        this.reverseLayout = z10;
        this.orientation = orientation;
        this.afterContentPadding = i11;
        this.mainAxisItemSpacing = i12;
    }
}
