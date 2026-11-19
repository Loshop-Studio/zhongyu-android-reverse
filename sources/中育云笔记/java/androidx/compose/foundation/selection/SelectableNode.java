package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.node.SemanticsModifierNodeKt;
import androidx.compose.p014ui.semantics.Role;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
final class SelectableNode extends ClickableNode {
    private boolean selected;

    public /* synthetic */ SelectableNode(boolean z10, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, Role role, InterfaceC9529a interfaceC9529a, AbstractC9972n abstractC9972n) {
        this(z10, mutableInteractionSource, indicationNodeFactory, z11, role, interfaceC9529a);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, this.selected);
    }

    /* renamed from: update-QzZPfjk, reason: not valid java name */
    public final void m27725updateQzZPfjk(boolean z10, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, Role role, InterfaceC9529a interfaceC9529a) {
        if (this.selected != z10) {
            this.selected = z10;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        super.m26998updateQzZPfjk(mutableInteractionSource, indicationNodeFactory, z11, (String) null, role, interfaceC9529a);
    }

    private SelectableNode(boolean z10, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, Role role, InterfaceC9529a interfaceC9529a) {
        super(mutableInteractionSource, indicationNodeFactory, z11, null, role, interfaceC9529a, null);
        this.selected = z10;
    }
}
