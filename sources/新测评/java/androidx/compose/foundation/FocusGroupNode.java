package androidx.compose.foundation;

import androidx.compose.p013ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.p013ui.focus.Focusability;
import androidx.compose.p013ui.node.DelegatingNode;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13558d2 = {"Landroidx/compose/foundation/FocusGroupNode;", "Landroidx/compose/ui/node/DelegatingNode;", "()V", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
final class FocusGroupNode extends DelegatingNode {
    public FocusGroupNode() {
        delegate(FocusTargetModifierNodeKt.m20653FocusTargetModifierNodePYyLHbc$default(Focusability.INSTANCE.m20672getNeverLCbbffg(), null, 2, null));
    }
}
