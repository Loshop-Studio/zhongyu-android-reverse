package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.p013ui.unit.Density;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
final class LazyStaggeredGridSlotCache implements LazyGridStaggeredGridSlotsProvider {
    private long cachedConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private float cachedDensity;
    private LazyStaggeredGridSlots cachedSizes;
    private final InterfaceC10574p calculation;

    public LazyStaggeredGridSlotCache(InterfaceC10574p interfaceC10574p) {
        this.calculation = interfaceC10574p;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider
    /* renamed from: invoke-0kLqBqw */
    public LazyStaggeredGridSlots mo21057invoke0kLqBqw(Density density, long j10) {
        if (this.cachedSizes != null && Constraints.m26845equalsimpl0(this.cachedConstraints, j10) && this.cachedDensity == density.getDensity()) {
            LazyStaggeredGridSlots lazyStaggeredGridSlots = this.cachedSizes;
            AbstractC9133u.m16130d(lazyStaggeredGridSlots);
            return lazyStaggeredGridSlots;
        }
        this.cachedConstraints = j10;
        this.cachedDensity = density.getDensity();
        LazyStaggeredGridSlots lazyStaggeredGridSlots2 = (LazyStaggeredGridSlots) this.calculation.invoke(density, Constraints.m26839boximpl(j10));
        this.cachedSizes = lazyStaggeredGridSlots2;
        return lazyStaggeredGridSlots2;
    }
}
