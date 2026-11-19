package androidx.compose.animation;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SkipToLookaheadElement extends ModifierNodeElement<SkipToLookaheadNode> {
    public static final int $stable = 0;
    private final InterfaceC9529a isEnabled;
    private final ScaleToBoundsImpl scaleToBounds;

    /* JADX WARN: Multi-variable type inference failed */
    public SkipToLookaheadElement() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SkipToLookaheadElement copy$default(SkipToLookaheadElement skipToLookaheadElement, ScaleToBoundsImpl scaleToBoundsImpl, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            scaleToBoundsImpl = skipToLookaheadElement.scaleToBounds;
        }
        if ((i10 & 2) != 0) {
            interfaceC9529a = skipToLookaheadElement.isEnabled;
        }
        return skipToLookaheadElement.copy(scaleToBoundsImpl, interfaceC9529a);
    }

    public final ScaleToBoundsImpl component1() {
        return this.scaleToBounds;
    }

    public final InterfaceC9529a component2() {
        return this.isEnabled;
    }

    public final SkipToLookaheadElement copy(ScaleToBoundsImpl scaleToBoundsImpl, InterfaceC9529a interfaceC9529a) {
        return new SkipToLookaheadElement(scaleToBoundsImpl, interfaceC9529a);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkipToLookaheadElement)) {
            return false;
        }
        SkipToLookaheadElement skipToLookaheadElement = (SkipToLookaheadElement) obj;
        return AbstractC9979u.m20289b(this.scaleToBounds, skipToLookaheadElement.scaleToBounds) && AbstractC9979u.m20289b(this.isEnabled, skipToLookaheadElement.isEnabled);
    }

    public final ScaleToBoundsImpl getScaleToBounds() {
        return this.scaleToBounds;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        ScaleToBoundsImpl scaleToBoundsImpl = this.scaleToBounds;
        return ((scaleToBoundsImpl == null ? 0 : scaleToBoundsImpl.hashCode()) * 31) + this.isEnabled.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("skipToLookahead");
        inspectorInfo.getProperties().set("scaleToBounds", this.scaleToBounds);
        inspectorInfo.getProperties().set("isEnabled", this.isEnabled);
    }

    public final InterfaceC9529a isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        return "SkipToLookaheadElement(scaleToBounds=" + this.scaleToBounds + ", isEnabled=" + this.isEnabled + ')';
    }

    public /* synthetic */ SkipToLookaheadElement(ScaleToBoundsImpl scaleToBoundsImpl, InterfaceC9529a interfaceC9529a, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : scaleToBoundsImpl, (i10 & 2) != 0 ? SkipToLookaheadNodeKt.DefaultEnabled : interfaceC9529a);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public SkipToLookaheadNode create() {
        return new SkipToLookaheadNode(this.scaleToBounds, this.isEnabled);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(SkipToLookaheadNode skipToLookaheadNode) {
        skipToLookaheadNode.setScaleToBounds(this.scaleToBounds);
        skipToLookaheadNode.setEnabled(this.isEnabled);
    }

    public SkipToLookaheadElement(ScaleToBoundsImpl scaleToBoundsImpl, InterfaceC9529a interfaceC9529a) {
        this.scaleToBounds = scaleToBoundsImpl;
        this.isEnabled = interfaceC9529a;
    }
}
