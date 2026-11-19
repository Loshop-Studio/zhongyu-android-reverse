package androidx.compose.foundation;

import androidx.compose.p013ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.p013ui.focus.Focusability;
import androidx.compose.p013ui.node.DelegatingNode;

/* loaded from: classes.dex */
final class FocusGroupNode extends DelegatingNode {
    public FocusGroupNode() {
        delegate(FocusTargetModifierNodeKt.m23950FocusTargetModifierNodePYyLHbc$default(Focusability.Companion.m23972getNeverLCbbffg(), null, 2, null));
    }
}
