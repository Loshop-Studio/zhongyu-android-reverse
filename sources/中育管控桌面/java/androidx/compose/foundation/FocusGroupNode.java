package androidx.compose.foundation;

import androidx.compose.p009ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.p009ui.focus.Focusability;
import androidx.compose.p009ui.node.DelegatingNode;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m7880d2 = {"Landroidx/compose/foundation/FocusGroupNode;", "Landroidx/compose/ui/node/DelegatingNode;", "()V", "foundation_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes.dex */
final class FocusGroupNode extends DelegatingNode {
    public FocusGroupNode() {
        delegate(FocusTargetModifierNodeKt.m13576FocusTargetModifierNodePYyLHbc$default(Focusability.INSTANCE.m13595getNeverLCbbffg(), null, 2, null));
    }
}
