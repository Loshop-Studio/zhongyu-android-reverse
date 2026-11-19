package androidx.compose.foundation;

import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.node.DelegatingNode;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m13558d2 = {"Landroidx/compose/foundation/IndicationModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "indicationNode", "Landroidx/compose/ui/node/DelegatableNode;", "(Landroidx/compose/ui/node/DelegatableNode;)V", "update", "", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
final class IndicationModifierNode extends DelegatingNode {
    private DelegatableNode indicationNode;

    public IndicationModifierNode(DelegatableNode delegatableNode) {
        this.indicationNode = delegatableNode;
        delegate(delegatableNode);
    }

    public final void update(DelegatableNode indicationNode) {
        undelegate(this.indicationNode);
        this.indicationNode = indicationNode;
        delegate(indicationNode);
    }
}
