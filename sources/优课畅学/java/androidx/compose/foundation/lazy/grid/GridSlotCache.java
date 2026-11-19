package androidx.compose.foundation.lazy.grid;

import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.p013ui.unit.Density;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
final class GridSlotCache implements LazyGridSlotsProvider {
    private long cachedConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private float cachedDensity;
    private LazyGridSlots cachedSizes;
    private final InterfaceC10574p calculation;

    public GridSlotCache(InterfaceC10574p interfaceC10574p) {
        this.calculation = interfaceC10574p;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider
    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public LazyGridSlots mo20985invoke0kLqBqw(Density density, long j10) {
        if (this.cachedSizes != null && Constraints.m26845equalsimpl0(this.cachedConstraints, j10) && this.cachedDensity == density.getDensity()) {
            LazyGridSlots lazyGridSlots = this.cachedSizes;
            AbstractC9133u.m16130d(lazyGridSlots);
            return lazyGridSlots;
        }
        this.cachedConstraints = j10;
        this.cachedDensity = density.getDensity();
        LazyGridSlots lazyGridSlots2 = (LazyGridSlots) this.calculation.invoke(density, Constraints.m26839boximpl(j10));
        this.cachedSizes = lazyGridSlots2;
        return lazyGridSlots2;
    }
}
