package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.p014ui.unit.Density;
import java.util.List;
import p265nd.AbstractC10410o;
import p325rc.AbstractC10947g0;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;

/* loaded from: classes2.dex */
final class ScrollableTabData {
    private final InterfaceC11122i0 coroutineScope;
    private final ScrollState scrollState;
    private Integer selectedTab;

    public ScrollableTabData(ScrollState scrollState, InterfaceC11122i0 interfaceC11122i0) {
        this.scrollState = scrollState;
        this.coroutineScope = interfaceC11122i0;
    }

    private final int calculateTabOffset(TabPosition tabPosition, Density density, int i10, List<TabPosition> list) {
        int iMo27093roundToPx0680j_4 = density.mo27093roundToPx0680j_4(((TabPosition) AbstractC10947g0.m23956y0(list)).m29192getRightD9Ej5fM()) + i10;
        int maxValue = iMo27093roundToPx0680j_4 - this.scrollState.getMaxValue();
        return AbstractC10410o.m21761n(density.mo27093roundToPx0680j_4(tabPosition.m29191getLeftD9Ej5fM()) - ((maxValue / 2) - (density.mo27093roundToPx0680j_4(tabPosition.m29193getWidthD9Ej5fM()) / 2)), 0, AbstractC10410o.m21752e(iMo27093roundToPx0680j_4 - maxValue, 0));
    }

    public final void onLaidOut(Density density, int i10, List<TabPosition> list, int i11) {
        int iCalculateTabOffset;
        Integer num = this.selectedTab;
        if (num != null && num.intValue() == i11) {
            return;
        }
        this.selectedTab = Integer.valueOf(i11);
        TabPosition tabPosition = (TabPosition) AbstractC10947g0.m23947p0(list, i11);
        if (tabPosition == null || this.scrollState.getValue() == (iCalculateTabOffset = calculateTabOffset(tabPosition, density, i10, list))) {
            return;
        }
        AbstractC11117h.m24726d(this.coroutineScope, null, null, new ScrollableTabData$onLaidOut$1$1(this, iCalculateTabOffset, null), 3, null);
    }
}
