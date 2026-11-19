package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, m5110d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "", "sizes", "", "positions", "([I[I)V", "getPositions", "()[I", "getSizes", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class LazyGridSlots {
    public static final int $stable = 8;

    @NotNull
    private final int[] positions;

    @NotNull
    private final int[] sizes;

    public LazyGridSlots(@NotNull int[] iArr, @NotNull int[] iArr2) {
        this.sizes = iArr;
        this.positions = iArr2;
    }

    @NotNull
    public final int[] getPositions() {
        return this.positions;
    }

    @NotNull
    public final int[] getSizes() {
        return this.sizes;
    }
}
