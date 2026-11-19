package androidx.compose.material3.pulltorefresh;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class PullToRefreshElement extends ModifierNodeElement<PullToRefreshModifierNode> {
    public static final int $stable = 0;
    private final boolean enabled;
    private final boolean isRefreshing;
    private final InterfaceC10559a onRefresh;
    private final PullToRefreshState state;
    private final float threshold;

    public /* synthetic */ PullToRefreshElement(boolean z10, InterfaceC10559a interfaceC10559a, boolean z11, PullToRefreshState pullToRefreshState, float f10, AbstractC9126n abstractC9126n) {
        this(z10, interfaceC10559a, z11, pullToRefreshState, f10);
    }

    /* renamed from: copy-M2VBTUQ$default, reason: not valid java name */
    public static /* synthetic */ PullToRefreshElement m22999copyM2VBTUQ$default(PullToRefreshElement pullToRefreshElement, boolean z10, InterfaceC10559a interfaceC10559a, boolean z11, PullToRefreshState pullToRefreshState, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = pullToRefreshElement.isRefreshing;
        }
        if ((i10 & 2) != 0) {
            interfaceC10559a = pullToRefreshElement.onRefresh;
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
        return pullToRefreshElement.m23001copyM2VBTUQ(z10, interfaceC10559a, z12, pullToRefreshState, f11);
    }

    public final boolean component1() {
        return this.isRefreshing;
    }

    public final InterfaceC10559a component2() {
        return this.onRefresh;
    }

    public final boolean component3() {
        return this.enabled;
    }

    public final PullToRefreshState component4() {
        return this.state;
    }

    /* renamed from: component5-D9Ej5fM, reason: not valid java name */
    public final float m23000component5D9Ej5fM() {
        return this.threshold;
    }

    /* renamed from: copy-M2VBTUQ, reason: not valid java name */
    public final PullToRefreshElement m23001copyM2VBTUQ(boolean z10, InterfaceC10559a interfaceC10559a, boolean z11, PullToRefreshState pullToRefreshState, float f10) {
        return new PullToRefreshElement(z10, interfaceC10559a, z11, pullToRefreshState, f10, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullToRefreshElement)) {
            return false;
        }
        PullToRefreshElement pullToRefreshElement = (PullToRefreshElement) obj;
        return this.isRefreshing == pullToRefreshElement.isRefreshing && AbstractC9133u.m16128b(this.onRefresh, pullToRefreshElement.onRefresh) && this.enabled == pullToRefreshElement.enabled && AbstractC9133u.m16128b(this.state, pullToRefreshElement.state) && C3156Dp.m26904equalsimpl0(this.threshold, pullToRefreshElement.threshold);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final InterfaceC10559a getOnRefresh() {
        return this.onRefresh;
    }

    public final PullToRefreshState getState() {
        return this.state;
    }

    /* renamed from: getThreshold-D9Ej5fM, reason: not valid java name */
    public final float m23002getThresholdD9Ej5fM() {
        return this.threshold;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((Boolean.hashCode(this.isRefreshing) * 31) + this.onRefresh.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.state.hashCode()) * 31) + C3156Dp.m26905hashCodeimpl(this.threshold);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("PullToRefreshModifierNode");
        inspectorInfo.getProperties().set("isRefreshing", Boolean.valueOf(this.isRefreshing));
        inspectorInfo.getProperties().set("onRefresh", this.onRefresh);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("state", this.state);
        inspectorInfo.getProperties().set("threshold", C3156Dp.m26897boximpl(this.threshold));
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    public String toString() {
        return "PullToRefreshElement(isRefreshing=" + this.isRefreshing + ", onRefresh=" + this.onRefresh + ", enabled=" + this.enabled + ", state=" + this.state + ", threshold=" + ((Object) C3156Dp.m26910toStringimpl(this.threshold)) + ')';
    }

    private PullToRefreshElement(boolean z10, InterfaceC10559a interfaceC10559a, boolean z11, PullToRefreshState pullToRefreshState, float f10) {
        this.isRefreshing = z10;
        this.onRefresh = interfaceC10559a;
        this.enabled = z11;
        this.state = pullToRefreshState;
        this.threshold = f10;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public PullToRefreshModifierNode create() {
        return new PullToRefreshModifierNode(this.isRefreshing, this.onRefresh, this.enabled, this.state, this.threshold, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(PullToRefreshModifierNode pullToRefreshModifierNode) {
        pullToRefreshModifierNode.setOnRefresh(this.onRefresh);
        pullToRefreshModifierNode.setEnabled(this.enabled);
        pullToRefreshModifierNode.setState(this.state);
        pullToRefreshModifierNode.m23015setThreshold0680j_4(this.threshold);
        boolean zIsRefreshing = pullToRefreshModifierNode.isRefreshing();
        boolean z10 = this.isRefreshing;
        if (zIsRefreshing != z10) {
            pullToRefreshModifierNode.setRefreshing(z10);
            pullToRefreshModifierNode.update();
        }
    }
}
