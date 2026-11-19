package androidx.compose.p011ui.layout;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.node.LayoutAwareModifierNode;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\b¨\u0006\u0010"}, m5110d2 = {"Landroidx/compose/ui/layout/OnPlacedNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Ld6/s;", "callback", "<init>", "(Lr6/c;)V", "coordinates", "onPlaced", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Lr6/c;", "getCallback", "()Lr6/c;", "setCallback", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
final class OnPlacedNode extends Modifier.Node implements LayoutAwareModifierNode {

    @NotNull
    private InterfaceC6471c callback;

    public OnPlacedNode(@NotNull InterfaceC6471c interfaceC6471c) {
        this.callback = interfaceC6471c;
    }

    @NotNull
    public final InterfaceC6471c getCallback() {
        return this.callback;
    }

    @Override // androidx.compose.p011ui.node.LayoutAwareModifierNode
    public void onPlaced(@NotNull LayoutCoordinates coordinates) {
        this.callback.invoke(coordinates);
    }

    public final void setCallback(@NotNull InterfaceC6471c interfaceC6471c) {
        this.callback = interfaceC6471c;
    }
}
