package androidx.compose.material3.pulltorefresh;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class PullToRefreshElement extends ModifierNodeElement<PullToRefreshModifierNode> {
    public static final int $stable = 0;
    private final boolean enabled;
    private final boolean isRefreshing;
    private final InterfaceC9529a onRefresh;
    private final PullToRefreshState state;
    private final float threshold;

    public /* synthetic */ PullToRefreshElement(boolean z10, InterfaceC9529a interfaceC9529a, boolean z11, PullToRefreshState pullToRefreshState, float f10, AbstractC9972n abstractC9972n) {
        this(z10, interfaceC9529a, z11, pullToRefreshState, f10);
    }

    /* renamed from: copy-M2VBTUQ$default, reason: not valid java name */
    public static /* synthetic */ PullToRefreshElement m29601copyM2VBTUQ$default(PullToRefreshElement pullToRefreshElement, boolean z10, InterfaceC9529a interfaceC9529a, boolean z11, PullToRefreshState pullToRefreshState, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = pullToRefreshElement.isRefreshing;
        }
        if ((i10 & 2) != 0) {
            interfaceC9529a = pullToRefreshElement.onRefresh;
        }
        if ((i10 & 4) != 0) {
            z11 = pullToRefreshElement.enabled;
        }
        if ((i10 & 8) != 0) {
            pullToRefreshState = pullToRefreshElement.state;
        }
        if ((i10 & 16) != 0) {
            f10 = pullToRefreshElement.threshold;
        }
        float f11 = f10;
        boolean z12 = z11;
        return pullToRefreshElement.m29603copyM2VBTUQ(z10, interfaceC9529a, z12, pullToRefreshState, f11);
    }

    public final boolean component1() {
        return this.isRefreshing;
    }

    public final InterfaceC9529a component2() {
        return this.onRefresh;
    }

    public final boolean component3() {
        return this.enabled;
    }

    public final PullToRefreshState component4() {
        return this.state;
    }

    /* renamed from: component5-D9Ej5fM, reason: not valid java name */
    public final float m29602component5D9Ej5fM() {
        return this.threshold;
    }

    /* renamed from: copy-M2VBTUQ, reason: not valid java name */
    public final PullToRefreshElement m29603copyM2VBTUQ(boolean z10, InterfaceC9529a interfaceC9529a, boolean z11, PullToRefreshState pullToRefreshState, float f10) {
        return new PullToRefreshElement(z10, interfaceC9529a, z11, pullToRefreshState, f10, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullToRefreshElement)) {
            return false;
        }
        PullToRefreshElement pullToRefreshElement = (PullToRefreshElement) obj;
        return this.isRefreshing == pullToRefreshElement.isRefreshing && AbstractC9979u.m20289b(this.onRefresh, pullToRefreshElement.onRefresh) && this.enabled == pullToRefreshElement.enabled && AbstractC9979u.m20289b(this.state, pullToRefreshElement.state) && C3186Dp.m33506equalsimpl0(this.threshold, pullToRefreshElement.threshold);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final InterfaceC9529a getOnRefresh() {
        return this.onRefresh;
    }

    public final PullToRefreshState getState() {
        return this.state;
    }

    /* renamed from: getThreshold-D9Ej5fM, reason: not valid java name */
    public final float m29604getThresholdD9Ej5fM() {
        return this.threshold;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((Boolean.hashCode(this.isRefreshing) * 31) + this.onRefresh.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.state.hashCode()) * 31) + C3186Dp.m33507hashCodeimpl(this.threshold);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("PullToRefreshModifierNode");
        inspectorInfo.getProperties().set("isRefreshing", Boolean.valueOf(this.isRefreshing));
        inspectorInfo.getProperties().set("onRefresh", this.onRefresh);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("state", this.state);
        inspectorInfo.getProperties().set("threshold", C3186Dp.m33499boximpl(this.threshold));
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    public String toString() {
        return "PullToRefreshElement(isRefreshing=" + this.isRefreshing + ", onRefresh=" + this.onRefresh + ", enabled=" + this.enabled + ", state=" + this.state + ", threshold=" + ((Object) C3186Dp.m33512toStringimpl(this.threshold)) + ')';
    }

    private PullToRefreshElement(boolean z10, InterfaceC9529a interfaceC9529a, boolean z11, PullToRefreshState pullToRefreshState, float f10) {
        this.isRefreshing = z10;
        this.onRefresh = interfaceC9529a;
        this.enabled = z11;
        this.state = pullToRefreshState;
        this.threshold = f10;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public PullToRefreshModifierNode create() {
        return new PullToRefreshModifierNode(this.isRefreshing, this.onRefresh, this.enabled, this.state, this.threshold, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(PullToRefreshModifierNode pullToRefreshModifierNode) {
        pullToRefreshModifierNode.setOnRefresh(this.onRefresh);
        pullToRefreshModifierNode.setEnabled(this.enabled);
        pullToRefreshModifierNode.setState(this.state);
        pullToRefreshModifierNode.m29617setThreshold0680j_4(this.threshold);
        boolean zIsRefreshing = pullToRefreshModifierNode.isRefreshing();
        boolean z10 = this.isRefreshing;
        if (zIsRefreshing != z10) {
            pullToRefreshModifierNode.setRefreshing(z10);
            pullToRefreshModifierNode.update();
        }
    }
}
