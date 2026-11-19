package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.p013ui.unit.Density;
import java.util.List;
import p077d8.AbstractC8323h;
import p134i7.AbstractC8778f0;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;

/* loaded from: classes2.dex */
final class ScrollableTabData {
    private final InterfaceC8822b0 coroutineScope;
    private final ScrollState scrollState;
    private Integer selectedTab;

    public ScrollableTabData(ScrollState scrollState, InterfaceC8822b0 interfaceC8822b0) {
        this.scrollState = scrollState;
        this.coroutineScope = interfaceC8822b0;
    }

    private final int calculateTabOffset(TabPosition tabPosition, Density density, int i10, List<TabPosition> list) {
        int iMo20491roundToPx0680j_4 = density.mo20491roundToPx0680j_4(((TabPosition) AbstractC8778f0.m14578x0(list)).m22590getRightD9Ej5fM()) + i10;
        int maxValue = iMo20491roundToPx0680j_4 - this.scrollState.getMaxValue();
        return AbstractC8323h.m13518m(density.mo20491roundToPx0680j_4(tabPosition.m22589getLeftD9Ej5fM()) - ((maxValue / 2) - (density.mo20491roundToPx0680j_4(tabPosition.m22591getWidthD9Ej5fM()) / 2)), 0, AbstractC8323h.m13510e(iMo20491roundToPx0680j_4 - maxValue, 0));
    }

    public final void onLaidOut(Density density, int i10, List<TabPosition> list, int i11) {
        int iCalculateTabOffset;
        Integer num = this.selectedTab;
        if (num != null && num.intValue() == i11) {
            return;
        }
        this.selectedTab = Integer.valueOf(i11);
        TabPosition tabPosition = (TabPosition) AbstractC8778f0.m14569o0(list, i11);
        if (tabPosition == null || this.scrollState.getValue() == (iCalculateTabOffset = calculateTabOffset(tabPosition, density, i10, list))) {
            return;
        }
        AbstractC8839h.m14861d(this.coroutineScope, null, null, new ScrollableTabData$onLaidOut$1$1(this, iCalculateTabOffset, null), 3, null);
    }
}
