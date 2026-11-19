package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p013ui.node.DelegatableNode_androidKt;

/* loaded from: classes.dex */
public final class AndroidScrollable_androidKt {
    public static final ScrollConfig platformScrollConfig(CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        return new AndroidConfig(ViewConfiguration.get(DelegatableNode_androidKt.requireView(compositionLocalConsumerModifierNode).getContext()));
    }
}
