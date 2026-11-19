package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.Density;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;

/* loaded from: classes.dex */
final class LazyStaggeredGridSlotCache implements LazyGridStaggeredGridSlotsProvider {
    private long cachedConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private float cachedDensity;
    private LazyStaggeredGridSlots cachedSizes;
    private final InterfaceC9544p calculation;

    public LazyStaggeredGridSlotCache(InterfaceC9544p interfaceC9544p) {
        this.calculation = interfaceC9544p;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider
    /* renamed from: invoke-0kLqBqw */
    public LazyStaggeredGridSlots mo27659invoke0kLqBqw(Density density, long j10) {
        if (this.cachedSizes != null && Constraints.m33447equalsimpl0(this.cachedConstraints, j10) && this.cachedDensity == density.getDensity()) {
            LazyStaggeredGridSlots lazyStaggeredGridSlots = this.cachedSizes;
            AbstractC9979u.m20291d(lazyStaggeredGridSlots);
            return lazyStaggeredGridSlots;
        }
        this.cachedConstraints = j10;
        this.cachedDensity = density.getDensity();
        LazyStaggeredGridSlots lazyStaggeredGridSlots2 = (LazyStaggeredGridSlots) this.calculation.invoke(density, Constraints.m33441boximpl(j10));
        this.cachedSizes = lazyStaggeredGridSlots2;
        return lazyStaggeredGridSlots2;
    }
}
