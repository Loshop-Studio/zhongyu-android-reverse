package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.LayoutAwareModifierNode;
import androidx.compose.p013ui.unit.IntSize;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class OnSizeChangedNode extends Modifier.Node implements LayoutAwareModifierNode {
    private InterfaceC10570l onSizeChanged;
    private long previousSize;
    private final boolean shouldAutoInvalidate = true;

    public OnSizeChangedNode(InterfaceC10570l interfaceC10570l) {
        this.onSizeChanged = interfaceC10570l;
        long j10 = Integer.MIN_VALUE;
        this.previousSize = IntSize.m27065constructorimpl((j10 & 4294967295L) | (j10 << 32));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.p013ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo20485onRemeasuredozmzZPI(long j10) {
        if (IntSize.m27068equalsimpl0(this.previousSize, j10)) {
            return;
        }
        this.onSizeChanged.invoke(IntSize.m27062boximpl(j10));
        this.previousSize = j10;
    }

    public final void update(InterfaceC10570l interfaceC10570l) {
        this.onSizeChanged = interfaceC10570l;
        long j10 = Integer.MIN_VALUE;
        this.previousSize = IntSize.m27065constructorimpl((j10 & 4294967295L) | (j10 << 32));
    }
}
