package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u001d\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R+\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0010R+\u0010\b\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u0010R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, m5110d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;", "", "", "initialIndex", "initialScrollOffset", "<init>", "(II)V", "index", "scrollOffset", "Ld6/s;", "update", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureResult", "updateFromMeasureResult", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;)V", "updateScrollOffset", "(I)V", "requestPositionAndForgetLastKnownKey", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "updateScrollPositionIfTheFirstItemWasMoved", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;I)I", "<set-?>", "index$delegate", "Landroidx/compose/runtime/MutableIntState;", "getIndex", "()I", "setIndex", "scrollOffset$delegate", "getScrollOffset", "setScrollOffset", "", "hadFirstNotEmptyLayout", "Z", "lastKnownFirstItemKey", "Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "nearestRangeState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyGridScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridScrollPosition.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,126:1\n78#2:127\n107#2,2:128\n78#2:130\n107#2,2:131\n50#3,5:133\n50#3,5:138\n96#3,5:143\n*S KotlinDebug\n*F\n+ 1 LazyGridScrollPosition.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollPosition\n*L\n33#1:127\n33#1:128,2\n36#1:130\n36#1:131,2\n60#1:133,5\n70#1:138,5\n111#1:143,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridScrollPosition {
    public static final int $stable = 8;
    private boolean hadFirstNotEmptyLayout;

    /* renamed from: index$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableIntState index;

    @Nullable
    private Object lastKnownFirstItemKey;

    @NotNull
    private final LazyLayoutNearestRangeState nearestRangeState;

    /* renamed from: scrollOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableIntState scrollOffset;

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyGridScrollPosition() {
        int i = 0;
        this(i, i, 3, null);
    }

    private final void setIndex(int i) {
        this.index.setIntValue(i);
    }

    private final void setScrollOffset(int i) {
        this.scrollOffset.setIntValue(i);
    }

    private final void update(int index, int scrollOffset) {
        if (!(((float) index) >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Index should be non-negative");
        }
        setIndex(index);
        this.nearestRangeState.update(index);
        setScrollOffset(scrollOffset);
    }

    public final int getIndex() {
        return this.index.getIntValue();
    }

    @NotNull
    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int getScrollOffset() {
        return this.scrollOffset.getIntValue();
    }

    public final void requestPositionAndForgetLastKnownKey(int index, int scrollOffset) {
        update(index, scrollOffset);
        this.lastKnownFirstItemKey = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateFromMeasureResult(@org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.grid.LazyGridMeasureResult r6) {
        /*
            r5 = this;
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r0 = r6.getFirstVisibleLine()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L1c
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] r0 = r0.getItems()
            if (r0 == 0) goto L1c
            int r3 = r0.length
            if (r3 != 0) goto L13
            r0 = r1
            goto L15
        L13:
            r0 = r0[r2]
        L15:
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r0.getKey()
            goto L1d
        L1c:
            r0 = r1
        L1d:
            r5.lastKnownFirstItemKey = r0
            boolean r0 = r5.hadFirstNotEmptyLayout
            if (r0 != 0) goto L2b
            int r0 = r6.getTotalItemsCount()
            if (r0 <= 0) goto L2a
            goto L2b
        L2a:
            return
        L2b:
            r0 = 1
            r5.hadFirstNotEmptyLayout = r0
            int r0 = r6.getFirstVisibleLineScrollOffset()
            float r3 = (float) r0
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 < 0) goto L39
            goto L50
        L39:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "scrollOffset should be non-negative ("
            r3.<init>(r4)
            r3.append(r0)
            r4 = 41
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException(r3)
        L50:
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredLine r6 = r6.getFirstVisibleLine()
            if (r6 == 0) goto L68
            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem[] r6 = r6.getItems()
            if (r6 == 0) goto L68
            int r3 = r6.length
            if (r3 != 0) goto L60
            goto L62
        L60:
            r1 = r6[r2]
        L62:
            if (r1 == 0) goto L68
            int r2 = r1.getIndex()
        L68:
            r5.update(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridScrollPosition.updateFromMeasureResult(androidx.compose.foundation.lazy.grid.LazyGridMeasureResult):void");
    }

    public final void updateScrollOffset(int scrollOffset) {
        if (!(((float) scrollOffset) >= 0.0f)) {
            InlineClassHelperKt.throwIllegalStateException("scrollOffset should be non-negative");
        }
        setScrollOffset(scrollOffset);
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved(@NotNull LazyGridItemProvider itemProvider, int index) {
        int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(itemProvider, this.lastKnownFirstItemKey, index);
        if (index != iFindIndexByKey) {
            setIndex(iFindIndexByKey);
            this.nearestRangeState.update(index);
        }
        return iFindIndexByKey;
    }

    public LazyGridScrollPosition(int i, int i8) {
        this.index = SnapshotIntStateKt.mutableIntStateOf(i);
        this.scrollOffset = SnapshotIntStateKt.mutableIntStateOf(i8);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i, 90, 200);
    }

    public /* synthetic */ LazyGridScrollPosition(int i, int i8, int i9, AbstractC5824e abstractC5824e) {
        this((i9 & 1) != 0 ? 0 : i, (i9 & 2) != 0 ? 0 : i8);
    }
}
