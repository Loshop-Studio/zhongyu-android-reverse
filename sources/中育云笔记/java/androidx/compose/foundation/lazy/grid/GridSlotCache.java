package androidx.compose.foundation.lazy.grid;

import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.Density;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;

/* loaded from: classes.dex */
final class GridSlotCache implements LazyGridSlotsProvider {
    private long cachedConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private float cachedDensity;
    private LazyGridSlots cachedSizes;
    private final InterfaceC9544p calculation;

    public GridSlotCache(InterfaceC9544p interfaceC9544p) {
        this.calculation = interfaceC9544p;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public LazyGridSlots mo27587invoke0kLqBqw(Density density, long j10) {
        if (this.cachedSizes != null && Constraints.m33447equalsimpl0(this.cachedConstraints, j10) && this.cachedDensity == density.getDensity()) {
            LazyGridSlots lazyGridSlots = this.cachedSizes;
            AbstractC9979u.m20291d(lazyGridSlots);
            return lazyGridSlots;
        }
        this.cachedConstraints = j10;
        this.cachedDensity = density.getDensity();
        LazyGridSlots lazyGridSlots2 = (LazyGridSlots) this.calculation.invoke(density, Constraints.m33441boximpl(j10));
        this.cachedSizes = lazyGridSlots2;
        return lazyGridSlots2;
    }
}
