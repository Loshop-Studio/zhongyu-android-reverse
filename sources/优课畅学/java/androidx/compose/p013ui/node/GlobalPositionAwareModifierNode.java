package androidx.compose.p013ui.node;

import androidx.compose.p013ui.layout.LayoutCoordinates;

/* loaded from: classes2.dex */
public interface GlobalPositionAwareModifierNode extends DelegatableNode {
    void onGloballyPositioned(LayoutCoordinates layoutCoordinates);
}
