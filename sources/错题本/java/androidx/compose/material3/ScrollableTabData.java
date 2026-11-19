package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.p011ui.unit.Density;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017¨\u0006\u0018"}, m5110d2 = {"Landroidx/compose/material3/ScrollableTabData;", "", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Lkotlinx/coroutines/v;", "coroutineScope", "<init>", "(Landroidx/compose/foundation/ScrollState;Lkotlinx/coroutines/v;)V", "Landroidx/compose/material3/TabPosition;", "Landroidx/compose/ui/unit/Density;", "density", "", "edgeOffset", "", "tabPositions", "calculateTabOffset", "(Landroidx/compose/material3/TabPosition;Landroidx/compose/ui/unit/Density;ILjava/util/List;)I", "selectedTab", "Ld6/s;", "onLaidOut", "(Landroidx/compose/ui/unit/Density;ILjava/util/List;I)V", "Landroidx/compose/foundation/ScrollState;", "Lkotlinx/coroutines/v;", "Ljava/lang/Integer;", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class ScrollableTabData {

    @NotNull
    private final InterfaceC6009v coroutineScope;

    @NotNull
    private final ScrollState scrollState;

    @Nullable
    private Integer selectedTab;

    public ScrollableTabData(@NotNull ScrollState scrollState, @NotNull InterfaceC6009v interfaceC6009v) {
        this.scrollState = scrollState;
        this.coroutineScope = interfaceC6009v;
    }

    private final int calculateTabOffset(TabPosition tabPosition, Density density, int i, List<TabPosition> list) {
        int iMo6897roundToPx0680j_4 = density.mo6897roundToPx0680j_4(((TabPosition) AbstractC5805t.m5235o0(list)).m8996getRightD9Ej5fM()) + i;
        int maxValue = iMo6897roundToPx0680j_4 - this.scrollState.getMaxValue();
        int iMo6897roundToPx0680j_42 = density.mo6897roundToPx0680j_4(tabPosition.getLeft()) - ((maxValue / 2) - (density.mo6897roundToPx0680j_4(tabPosition.getWidth()) / 2));
        int i8 = iMo6897roundToPx0680j_4 - maxValue;
        if (i8 < 0) {
            i8 = 0;
        }
        return AbstractC5806u.m5274m(iMo6897roundToPx0680j_42, 0, i8);
    }

    public final void onLaidOut(@NotNull Density density, int edgeOffset, @NotNull List<TabPosition> tabPositions, int selectedTab) {
        int iCalculateTabOffset;
        Integer num = this.selectedTab;
        if (num != null && num.intValue() == selectedTab) {
            return;
        }
        this.selectedTab = Integer.valueOf(selectedTab);
        TabPosition tabPosition = (TabPosition) AbstractC5805t.m5230j0(selectedTab, tabPositions);
        if (tabPosition == null || this.scrollState.getValue() == (iCalculateTabOffset = calculateTabOffset(tabPosition, density, edgeOffset, tabPositions))) {
            return;
        }
        AbstractC6014x.m5651v(this.coroutineScope, null, null, new ScrollableTabData$onLaidOut$1$1(this, iCalculateTabOffset, null), 3);
    }
}
