package androidx.compose.material3.pulltorefresh;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0006*\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010 \u001a\u00020\u000bHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJK\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b\u0004\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b1\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\u001dR\u001d\u0010\f\u001a\u00020\u000b8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u0010\u001f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00066"}, m5110d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode;", "", "isRefreshing", "Lkotlin/Function0;", "Ld6/s;", "onRefresh", "enabled", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "state", "Landroidx/compose/ui/unit/Dp;", "threshold", "<init>", "(ZLr6/a;ZLandroidx/compose/material3/pulltorefresh/PullToRefreshState;FLkotlin/jvm/internal/e;)V", "create", "()Landroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode;", "node", "update", "(Landroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Z", "component2", "()Lr6/a;", "component3", "component4", "()Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "component5-D9Ej5fM", "()F", "component5", "copy-M2VBTUQ", "(ZLr6/a;ZLandroidx/compose/material3/pulltorefresh/PullToRefreshState;F)Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Lr6/a;", "getOnRefresh", "getEnabled", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "getState", "F", "getThreshold-D9Ej5fM", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class PullToRefreshElement extends ModifierNodeElement<PullToRefreshModifierNode> {
    public static final int $stable = 0;
    private final boolean enabled;
    private final boolean isRefreshing;

    @NotNull
    private final InterfaceC6469a onRefresh;

    @NotNull
    private final PullToRefreshState state;
    private final float threshold;

    public /* synthetic */ PullToRefreshElement(boolean z8, InterfaceC6469a interfaceC6469a, boolean z9, PullToRefreshState pullToRefreshState, float f, AbstractC5824e abstractC5824e) {
        this(z8, interfaceC6469a, z9, pullToRefreshState, f);
    }

    /* renamed from: copy-M2VBTUQ$default, reason: not valid java name */
    public static /* synthetic */ PullToRefreshElement m9405copyM2VBTUQ$default(PullToRefreshElement pullToRefreshElement, boolean z8, InterfaceC6469a interfaceC6469a, boolean z9, PullToRefreshState pullToRefreshState, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = pullToRefreshElement.isRefreshing;
        }
        if ((i & 2) != 0) {
            interfaceC6469a = pullToRefreshElement.onRefresh;
        }
        if ((i & 4) != 0) {
            z9 = pullToRefreshElement.enabled;
        }
        if ((i & 8) != 0) {
            pullToRefreshState = pullToRefreshElement.state;
        }
        if ((i & 16) != 0) {
            f = pullToRefreshElement.threshold;
        }
        float f7 = f;
        boolean z10 = z9;
        return pullToRefreshElement.m9407copyM2VBTUQ(z8, interfaceC6469a, z10, pullToRefreshState, f7);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsRefreshing() {
        return this.isRefreshing;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final InterfaceC6469a getOnRefresh() {
        return this.onRefresh;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final PullToRefreshState getState() {
        return this.state;
    }

    /* renamed from: component5-D9Ej5fM, reason: not valid java name and from getter */
    public final float getThreshold() {
        return this.threshold;
    }

    @NotNull
    /* renamed from: copy-M2VBTUQ, reason: not valid java name */
    public final PullToRefreshElement m9407copyM2VBTUQ(boolean isRefreshing, @NotNull InterfaceC6469a onRefresh, boolean enabled, @NotNull PullToRefreshState state, float threshold) {
        return new PullToRefreshElement(isRefreshing, onRefresh, enabled, state, threshold, null);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PullToRefreshElement)) {
            return false;
        }
        PullToRefreshElement pullToRefreshElement = (PullToRefreshElement) other;
        return this.isRefreshing == pullToRefreshElement.isRefreshing && AbstractC5830k.m5325b(this.onRefresh, pullToRefreshElement.onRefresh) && this.enabled == pullToRefreshElement.enabled && AbstractC5830k.m5325b(this.state, pullToRefreshElement.state) && C2331Dp.m13310equalsimpl0(this.threshold, pullToRefreshElement.threshold);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final InterfaceC6469a getOnRefresh() {
        return this.onRefresh;
    }

    @NotNull
    public final PullToRefreshState getState() {
        return this.state;
    }

    /* renamed from: getThreshold-D9Ej5fM, reason: not valid java name */
    public final float m9408getThresholdD9Ej5fM() {
        return this.threshold;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public int hashCode() {
        return C2331Dp.m13311hashCodeimpl(this.threshold) + ((this.state.hashCode() + AbstractC0584a.m908i(this.enabled, (this.onRefresh.hashCode() + (Boolean.hashCode(this.isRefreshing) * 31)) * 31, 31)) * 31);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
        inspectorInfo.setName("PullToRefreshModifierNode");
        AbstractC0584a.m910k(this.isRefreshing, inspectorInfo.getProperties(), "isRefreshing", inspectorInfo).set("onRefresh", this.onRefresh);
        AbstractC0584a.m910k(this.enabled, inspectorInfo.getProperties(), "enabled", inspectorInfo).set("state", this.state);
        inspectorInfo.getProperties().set("threshold", C2331Dp.m13303boximpl(this.threshold));
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    @NotNull
    public String toString() {
        return "PullToRefreshElement(isRefreshing=" + this.isRefreshing + ", onRefresh=" + this.onRefresh + ", enabled=" + this.enabled + ", state=" + this.state + ", threshold=" + ((Object) C2331Dp.m13316toStringimpl(this.threshold)) + ')';
    }

    private PullToRefreshElement(boolean z8, InterfaceC6469a interfaceC6469a, boolean z9, PullToRefreshState pullToRefreshState, float f) {
        this.isRefreshing = z8;
        this.onRefresh = interfaceC6469a;
        this.enabled = z9;
        this.state = pullToRefreshState;
        this.threshold = f;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    @NotNull
    /* renamed from: create */
    public PullToRefreshModifierNode getNode() {
        return new PullToRefreshModifierNode(this.isRefreshing, this.onRefresh, this.enabled, this.state, this.threshold, null);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(@NotNull PullToRefreshModifierNode node) {
        node.setOnRefresh(this.onRefresh);
        node.setEnabled(this.enabled);
        node.setState(this.state);
        node.m9421setThreshold0680j_4(this.threshold);
        boolean isRefreshing = node.getIsRefreshing();
        boolean z8 = this.isRefreshing;
        if (isRefreshing != z8) {
            node.setRefreshing(z8);
            node.update();
        }
    }
}
