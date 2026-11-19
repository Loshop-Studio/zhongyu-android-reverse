package androidx.compose.p014ui.node;

import androidx.compose.p014ui.layout.LayoutCoordinates;

/* loaded from: classes2.dex */
public interface GlobalPositionAwareModifierNode extends DelegatableNode {
    void onGloballyPositioned(LayoutCoordinates layoutCoordinates);
}
