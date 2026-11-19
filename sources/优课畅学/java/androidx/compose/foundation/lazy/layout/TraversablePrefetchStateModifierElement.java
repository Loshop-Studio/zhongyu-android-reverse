package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9133u;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
final class TraversablePrefetchStateModifierElement extends ModifierNodeElement<TraversablePrefetchStateNode> {
    private final LazyLayoutPrefetchState prefetchState;

    public TraversablePrefetchStateModifierElement(LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        this.prefetchState = lazyLayoutPrefetchState;
    }

    private final LazyLayoutPrefetchState component1() {
        return this.prefetchState;
    }

    public static /* synthetic */ TraversablePrefetchStateModifierElement copy$default(TraversablePrefetchStateModifierElement traversablePrefetchStateModifierElement, LazyLayoutPrefetchState lazyLayoutPrefetchState, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lazyLayoutPrefetchState = traversablePrefetchStateModifierElement.prefetchState;
        }
        return traversablePrefetchStateModifierElement.copy(lazyLayoutPrefetchState);
    }

    public final TraversablePrefetchStateModifierElement copy(LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        return new TraversablePrefetchStateModifierElement(lazyLayoutPrefetchState);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && AbstractC9133u.m16128b(this.prefetchState, ((TraversablePrefetchStateModifierElement) obj).prefetchState);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return this.prefetchState.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("traversablePrefetchState");
        inspectorInfo.setValue(this.prefetchState);
    }

    public String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.prefetchState + ')';
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public TraversablePrefetchStateNode create() {
        return new TraversablePrefetchStateNode(this.prefetchState);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(TraversablePrefetchStateNode traversablePrefetchStateNode) {
        traversablePrefetchStateNode.setPrefetchState(this.prefetchState);
    }
}
