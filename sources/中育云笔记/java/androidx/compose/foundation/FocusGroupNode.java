package androidx.compose.foundation;

import androidx.compose.p014ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.p014ui.focus.Focusability;
import androidx.compose.p014ui.node.DelegatingNode;

/* loaded from: classes.dex */
final class FocusGroupNode extends DelegatingNode {
    public FocusGroupNode() {
        delegate(FocusTargetModifierNodeKt.m30552FocusTargetModifierNodePYyLHbc$default(Focusability.Companion.m30574getNeverLCbbffg(), null, 2, null));
    }
}
