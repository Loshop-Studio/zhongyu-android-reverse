package androidx.compose.foundation;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableNode;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p014ui.node.DelegatableNode;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.node.ObserverModifierNode;
import androidx.compose.p014ui.node.ObserverModifierNodeKt;
import androidx.compose.p014ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

/* loaded from: classes.dex */
final class ScrollingContainerNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, ObserverModifierNode {
    private BringIntoViewSpec bringIntoViewSpec;
    private boolean enabled;
    private FlingBehavior flingBehavior;
    private MutableInteractionSource interactionSource;
    private OverscrollFactory localOverscrollFactory;
    private OverscrollEffect localOverscrollFactoryCreatedOverscrollEffect;
    private Orientation orientation;
    private DelegatableNode overscrollNode;
    private boolean reverseScrolling;
    private ScrollableNode scrollableNode;
    private final boolean shouldAutoInvalidate;
    private boolean shouldReverseDirection;
    private ScrollableState state;
    private boolean useLocalOverscrollFactory;
    private OverscrollEffect userProvidedOverscrollEffect;

    public ScrollingContainerNode(ScrollableState scrollableState, Orientation orientation, boolean z10, boolean z11, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec, boolean z12, OverscrollEffect overscrollEffect) {
        this.state = scrollableState;
        this.orientation = orientation;
        this.enabled = z10;
        this.reverseScrolling = z11;
        this.flingBehavior = flingBehavior;
        this.interactionSource = mutableInteractionSource;
        this.bringIntoViewSpec = bringIntoViewSpec;
        this.useLocalOverscrollFactory = z12;
        this.userProvidedOverscrollEffect = overscrollEffect;
    }

    private final void attachOverscrollNodeIfNeeded() {
        DelegatableNode delegatableNode = this.overscrollNode;
        if (delegatableNode != null) {
            if (delegatableNode == null || delegatableNode.getNode().isAttached()) {
                return;
            }
            delegate(delegatableNode);
            return;
        }
        if (this.useLocalOverscrollFactory) {
            ObserverModifierNodeKt.observeReads(this, new InterfaceC9529a() { // from class: androidx.compose.foundation.ScrollingContainerNode.attachOverscrollNodeIfNeeded.1
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m27047invoke();
                    return C10786q.f26013a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m27047invoke() {
                    ScrollingContainerNode scrollingContainerNode = ScrollingContainerNode.this;
                    scrollingContainerNode.localOverscrollFactory = (OverscrollFactory) CompositionLocalConsumerModifierNodeKt.currentValueOf(scrollingContainerNode, OverscrollKt.getLocalOverscrollFactory());
                    ScrollingContainerNode scrollingContainerNode2 = ScrollingContainerNode.this;
                    OverscrollFactory overscrollFactory = scrollingContainerNode2.localOverscrollFactory;
                    scrollingContainerNode2.localOverscrollFactoryCreatedOverscrollEffect = overscrollFactory != null ? overscrollFactory.createOverscrollEffect() : null;
                }
            });
        }
        OverscrollEffect overscrollEffect = getOverscrollEffect();
        if (overscrollEffect != null) {
            DelegatableNode node = overscrollEffect.getNode();
            if (node.getNode().isAttached()) {
                return;
            }
            this.overscrollNode = delegate(node);
        }
    }

    public final OverscrollEffect getOverscrollEffect() {
        return this.useLocalOverscrollFactory ? this.localOverscrollFactoryCreatedOverscrollEffect : this.userProvidedOverscrollEffect;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.shouldReverseDirection = shouldReverseDirection();
        attachOverscrollNodeIfNeeded();
        if (this.scrollableNode == null) {
            this.scrollableNode = (ScrollableNode) delegate(new ScrollableNode(this.state, getOverscrollEffect(), this.flingBehavior, this.orientation, this.enabled, this.shouldReverseDirection, this.interactionSource, this.bringIntoViewSpec));
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNode delegatableNode = this.overscrollNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
    }

    @Override // androidx.compose.p014ui.node.DelegatableNode
    public void onLayoutDirectionChange() {
        boolean zShouldReverseDirection = shouldReverseDirection();
        if (this.shouldReverseDirection != zShouldReverseDirection) {
            this.shouldReverseDirection = zShouldReverseDirection;
            update(this.state, this.orientation, this.useLocalOverscrollFactory, getOverscrollEffect(), this.enabled, this.reverseScrolling, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
        }
    }

    @Override // androidx.compose.p014ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        OverscrollFactory overscrollFactory = (OverscrollFactory) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, OverscrollKt.getLocalOverscrollFactory());
        if (AbstractC9979u.m20289b(overscrollFactory, this.localOverscrollFactory)) {
            return;
        }
        this.localOverscrollFactory = overscrollFactory;
        this.localOverscrollFactoryCreatedOverscrollEffect = null;
        DelegatableNode delegatableNode = this.overscrollNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.overscrollNode = null;
        attachOverscrollNodeIfNeeded();
        ScrollableNode scrollableNode = this.scrollableNode;
        if (scrollableNode != null) {
            scrollableNode.update(this.state, this.orientation, getOverscrollEffect(), this.enabled, this.shouldReverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
        }
    }

    public final boolean shouldReverseDirection() {
        LayoutDirection layoutDirectionRequireLayoutDirection = LayoutDirection.Ltr;
        if (isAttached()) {
            layoutDirectionRequireLayoutDirection = DelegatableNodeKt.requireLayoutDirection(this);
        }
        return ScrollableDefaults.INSTANCE.reverseDirection(layoutDirectionRequireLayoutDirection, this.orientation, this.reverseScrolling);
    }

    public final void update(ScrollableState scrollableState, Orientation orientation, boolean z10, OverscrollEffect overscrollEffect, boolean z11, boolean z12, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec) {
        boolean z13;
        this.state = scrollableState;
        this.orientation = orientation;
        boolean z14 = true;
        if (this.useLocalOverscrollFactory != z10) {
            this.useLocalOverscrollFactory = z10;
            z13 = true;
        } else {
            z13 = false;
        }
        if (AbstractC9979u.m20289b(this.userProvidedOverscrollEffect, overscrollEffect)) {
            z14 = false;
        } else {
            this.userProvidedOverscrollEffect = overscrollEffect;
        }
        if (z13 || (z14 && !z10)) {
            DelegatableNode delegatableNode = this.overscrollNode;
            if (delegatableNode != null) {
                undelegate(delegatableNode);
            }
            this.overscrollNode = null;
            attachOverscrollNodeIfNeeded();
        }
        this.enabled = z11;
        this.reverseScrolling = z12;
        this.flingBehavior = flingBehavior;
        this.interactionSource = mutableInteractionSource;
        this.bringIntoViewSpec = bringIntoViewSpec;
        this.shouldReverseDirection = shouldReverseDirection();
        ScrollableNode scrollableNode = this.scrollableNode;
        if (scrollableNode != null) {
            scrollableNode.update(scrollableState, orientation, getOverscrollEffect(), z11, this.shouldReverseDirection, flingBehavior, mutableInteractionSource, bringIntoViewSpec);
        }
    }
}
