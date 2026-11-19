package androidx.compose.material3.carousel;

import androidx.compose.foundation.pager.PageSize;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p300x7.InterfaceC10574p;
import p322z7.AbstractC10729c;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class CarouselPageSize implements PageSize {
    public static final int $stable = 0;
    private final float afterContentPadding;
    private final float beforeContentPadding;
    private final InterfaceC10574p keylineList;
    private final MutableState strategyState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Strategy.Companion.getEmpty(), null, 2, null);

    public CarouselPageSize(InterfaceC10574p interfaceC10574p, float f10, float f11) {
        this.keylineList = interfaceC10574p;
        this.beforeContentPadding = f10;
        this.afterContentPadding = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Strategy getStrategyState() {
        return (Strategy) this.strategyState$delegate.getValue();
    }

    private final void setStrategyState(Strategy strategy) {
        this.strategyState$delegate.setValue(strategy);
    }

    @Override // androidx.compose.foundation.pager.PageSize
    public int calculateMainAxisPageSize(Density density, int i10, int i11) {
        float f10 = i10;
        float f11 = i11;
        setStrategyState(new Strategy((KeylineList) this.keylineList.invoke(Float.valueOf(f10), Float.valueOf(f11)), f10, f11, this.beforeContentPadding, this.afterContentPadding));
        return getStrategy().isValid() ? AbstractC10729c.m20035d(getStrategy().getItemMainAxisSize()) : i10;
    }

    public final Strategy getStrategy() {
        return getStrategyState();
    }
}
