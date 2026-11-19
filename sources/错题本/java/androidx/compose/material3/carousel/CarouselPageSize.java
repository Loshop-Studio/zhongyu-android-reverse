package androidx.compose.material3.carousel;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6473e;
import p169t6.AbstractC6600a;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001BO\u00126\u0010\t\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0002\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012RD\u0010\t\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R+\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001a¨\u0006 "}, m5110d2 = {"Landroidx/compose/material3/carousel/CarouselPageSize;", "Landroidx/compose/foundation/pager/PageSize;", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "availableSpace", "itemSpacing", "Landroidx/compose/material3/carousel/KeylineList;", "keylineList", "beforeContentPadding", "afterContentPadding", "<init>", "(Lr6/e;FF)V", "Landroidx/compose/ui/unit/Density;", "", "pageSpacing", "calculateMainAxisPageSize", "(Landroidx/compose/ui/unit/Density;II)I", "Lr6/e;", "F", "Landroidx/compose/material3/carousel/Strategy;", "<set-?>", "strategyState$delegate", "Landroidx/compose/runtime/MutableState;", "getStrategyState", "()Landroidx/compose/material3/carousel/Strategy;", "setStrategyState", "(Landroidx/compose/material3/carousel/Strategy;)V", "strategyState", "getStrategy", "strategy", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCarousel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Carousel.kt\nandroidx/compose/material3/carousel/CarouselPageSize\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,693:1\n81#2:694\n107#2,2:695\n*S KotlinDebug\n*F\n+ 1 Carousel.kt\nandroidx/compose/material3/carousel/CarouselPageSize\n*L\n379#1:694\n379#1:695,2\n*E\n"})
/* loaded from: classes.dex */
public final class CarouselPageSize implements PageSize {
    public static final int $stable = 0;
    private final float afterContentPadding;
    private final float beforeContentPadding;

    @NotNull
    private final InterfaceC6473e keylineList;

    /* renamed from: strategyState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState strategyState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Strategy.INSTANCE.getEmpty(), null, 2, null);

    public CarouselPageSize(@NotNull InterfaceC6473e interfaceC6473e, float f, float f7) {
        this.keylineList = interfaceC6473e;
        this.beforeContentPadding = f;
        this.afterContentPadding = f7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Strategy getStrategyState() {
        return (Strategy) this.strategyState.getValue();
    }

    private final void setStrategyState(Strategy strategy) {
        this.strategyState.setValue(strategy);
    }

    @Override // androidx.compose.foundation.pager.PageSize
    public int calculateMainAxisPageSize(@NotNull Density density, int i, int i8) {
        float f = i;
        float f7 = i8;
        setStrategyState(new Strategy((KeylineList) this.keylineList.invoke(Float.valueOf(f), Float.valueOf(f7)), f, f7, this.beforeContentPadding, this.afterContentPadding));
        return getStrategy().getIsValid() ? AbstractC6600a.m6241q(getStrategy().getItemMainAxisSize()) : i;
    }

    @NotNull
    public final Strategy getStrategy() {
        return getStrategyState();
    }
}
