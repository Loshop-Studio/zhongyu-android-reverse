package androidx.compose.p013ui.input.rotary;

import androidx.compose.p013ui.node.DelegatableNode;

/* loaded from: classes2.dex */
public interface RotaryInputModifierNode extends DelegatableNode {
    boolean onPreRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent);

    boolean onRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent);
}
