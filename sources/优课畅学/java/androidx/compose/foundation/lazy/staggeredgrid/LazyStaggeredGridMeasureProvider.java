package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import p077d8.AbstractC8323h;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class LazyStaggeredGridMeasureProvider implements LazyLayoutMeasuredItemProvider<LazyStaggeredGridMeasuredItem> {
    public static final int $stable = 8;
    private final boolean isVertical;
    private final LazyStaggeredGridItemProvider itemProvider;
    private final LazyLayoutMeasureScope measureScope;
    private final LazyStaggeredGridSlots resolvedSlots;

    public LazyStaggeredGridMeasureProvider(boolean z10, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridSlots lazyStaggeredGridSlots) {
        this.isVertical = z10;
        this.itemProvider = lazyStaggeredGridItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.resolvedSlots = lazyStaggeredGridSlots;
    }

    /* renamed from: childConstraints-JhjzzOo, reason: not valid java name */
    private final long m21079childConstraintsJhjzzOo(int i10, int i11) {
        int i12;
        if (i11 == 1) {
            i12 = this.resolvedSlots.getSizes()[i10];
        } else {
            int i13 = this.resolvedSlots.getPositions()[i10];
            int i14 = (i10 + i11) - 1;
            i12 = (this.resolvedSlots.getPositions()[i14] + this.resolvedSlots.getSizes()[i14]) - i13;
        }
        return this.isVertical ? Constraints.Companion.m26864fixedWidthOenEA2s(i12) : Constraints.Companion.m26863fixedHeightOenEA2s(i12);
    }

    /* renamed from: createItem-pitSLOA */
    public abstract LazyStaggeredGridMeasuredItem mo21073createItempitSLOA(int i10, int i11, int i12, Object obj, Object obj2, List<? extends Placeable> list, long j10);

    /* renamed from: getAndMeasure-jy6DScQ, reason: not valid java name */
    public final LazyStaggeredGridMeasuredItem m21080getAndMeasurejy6DScQ(int i10, long j10) {
        Object key = this.itemProvider.getKey(i10);
        Object contentType = this.itemProvider.getContentType(i10);
        int length = this.resolvedSlots.getSizes().length;
        int i11 = (int) (j10 >> 32);
        int iM13513h = AbstractC8323h.m13513h(i11, length - 1);
        int iM13513h2 = AbstractC8323h.m13513h(((int) (j10 & 4294967295L)) - i11, length - iM13513h);
        long jM21079childConstraintsJhjzzOo = m21079childConstraintsJhjzzOo(iM13513h, iM13513h2);
        return mo21073createItempitSLOA(i10, iM13513h, iM13513h2, key, contentType, this.measureScope.mo21032measure0kLqBqw(i10, jM21079childConstraintsJhjzzOo), jM21079childConstraintsJhjzzOo);
    }

    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.itemProvider.getKeyIndexMap();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    /* renamed from: getAndMeasure--hBUhpc */
    public LazyStaggeredGridMeasuredItem mo20972getAndMeasurehBUhpc(int i10, int i11, int i12, long j10) {
        return mo21073createItempitSLOA(i10, i11, i12, this.itemProvider.getKey(i10), this.itemProvider.getContentType(i10), this.measureScope.mo21032measure0kLqBqw(i10, j10), j10);
    }
}
