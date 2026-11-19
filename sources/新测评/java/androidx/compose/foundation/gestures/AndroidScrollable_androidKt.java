package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p013ui.node.DelegatableNode_androidKt;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m13558d2 = {"platformScrollConfig", "Landroidx/compose/foundation/gestures/ScrollConfig;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class AndroidScrollable_androidKt {
    public static final ScrollConfig platformScrollConfig(CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        return new AndroidConfig(ViewConfiguration.get(DelegatableNode_androidKt.requireView(compositionLocalConsumerModifierNode).getContext()));
    }
}
