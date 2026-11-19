package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.node.TraversableNode;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
final class TraversablePrefetchStateNode extends Modifier.Node implements TraversableNode {
    private LazyLayoutPrefetchState prefetchState;
    private final String traverseKey = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode";

    public TraversablePrefetchStateNode(LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        this.prefetchState = lazyLayoutPrefetchState;
    }

    public final LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    public final void setPrefetchState(LazyLayoutPrefetchState lazyLayoutPrefetchState) {
        this.prefetchState = lazyLayoutPrefetchState;
    }

    @Override // androidx.compose.p014ui.node.TraversableNode
    public String getTraverseKey() {
        return this.traverseKey;
    }
}
