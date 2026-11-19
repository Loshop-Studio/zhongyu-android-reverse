package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.node.SemanticsModifierNodeKt;
import androidx.compose.p013ui.semantics.Role;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.internal.AbstractC9126n;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
final class SelectableNode extends ClickableNode {
    private boolean selected;

    public /* synthetic */ SelectableNode(boolean z10, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, Role role, InterfaceC10559a interfaceC10559a, AbstractC9126n abstractC9126n) {
        this(z10, mutableInteractionSource, indicationNodeFactory, z11, role, interfaceC10559a);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, this.selected);
    }

    /* renamed from: update-QzZPfjk, reason: not valid java name */
    public final void m21123updateQzZPfjk(boolean z10, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, Role role, InterfaceC10559a interfaceC10559a) {
        if (this.selected != z10) {
            this.selected = z10;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        super.m20396updateQzZPfjk(mutableInteractionSource, indicationNodeFactory, z11, (String) null, role, interfaceC10559a);
    }

    private SelectableNode(boolean z10, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, Role role, InterfaceC10559a interfaceC10559a) {
        super(mutableInteractionSource, indicationNodeFactory, z11, null, role, interfaceC10559a, null);
        this.selected = z10;
    }
}
