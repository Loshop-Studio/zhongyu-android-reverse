package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes.dex */
public interface IndicationNodeFactory extends Indication {
    DelegatableNode create(InteractionSource interactionSource);

    boolean equals(Object obj);

    int hashCode();
}
