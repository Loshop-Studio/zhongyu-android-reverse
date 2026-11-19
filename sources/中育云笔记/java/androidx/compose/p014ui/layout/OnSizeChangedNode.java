package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.node.LayoutAwareModifierNode;
import androidx.compose.p014ui.unit.IntSize;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class OnSizeChangedNode extends Modifier.Node implements LayoutAwareModifierNode {
    private InterfaceC9540l onSizeChanged;
    private long previousSize;
    private final boolean shouldAutoInvalidate = true;

    public OnSizeChangedNode(InterfaceC9540l interfaceC9540l) {
        this.onSizeChanged = interfaceC9540l;
        long j10 = Integer.MIN_VALUE;
        this.previousSize = IntSize.m33667constructorimpl((j10 & 4294967295L) | (j10 << 32));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.p014ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo27087onRemeasuredozmzZPI(long j10) {
        if (IntSize.m33670equalsimpl0(this.previousSize, j10)) {
            return;
        }
        this.onSizeChanged.invoke(IntSize.m33664boximpl(j10));
        this.previousSize = j10;
    }

    public final void update(InterfaceC9540l interfaceC9540l) {
        this.onSizeChanged = interfaceC9540l;
        long j10 = Integer.MIN_VALUE;
        this.previousSize = IntSize.m33667constructorimpl((j10 & 4294967295L) | (j10 << 32));
    }
}
