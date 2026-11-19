package androidx.compose.foundation.gestures;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.node.TraversableNode;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ScrollableContainerNode extends Modifier.Node implements TraversableNode {
    private boolean enabled;
    private final Object traverseKey = TraverseKey;
    public static final TraverseKey TraverseKey = new TraverseKey(null);
    public static final int $stable = 8;

    public static final class TraverseKey {
        public /* synthetic */ TraverseKey(AbstractC9972n abstractC9972n) {
            this();
        }

        private TraverseKey() {
        }
    }

    public ScrollableContainerNode(boolean z10) {
        this.enabled = z10;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // androidx.compose.p014ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    public final void update(boolean z10) {
        this.enabled = z10;
    }
}
