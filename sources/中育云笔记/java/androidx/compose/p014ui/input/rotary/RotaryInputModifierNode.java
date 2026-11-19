package androidx.compose.p014ui.input.rotary;

import androidx.compose.p014ui.node.DelegatableNode;

/* loaded from: classes2.dex */
public interface RotaryInputModifierNode extends DelegatableNode {
    boolean onPreRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent);

    boolean onRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent);
}
