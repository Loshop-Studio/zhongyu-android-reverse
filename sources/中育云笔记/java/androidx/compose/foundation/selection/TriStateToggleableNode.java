package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.node.SemanticsModifierNodeKt;
import androidx.compose.p014ui.semantics.Role;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.state.ToggleableState;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
final class TriStateToggleableNode extends ClickableNode {
    private ToggleableState state;

    public /* synthetic */ TriStateToggleableNode(ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, Role role, InterfaceC9529a interfaceC9529a, AbstractC9972n abstractC9972n) {
        this(toggleableState, mutableInteractionSource, indicationNodeFactory, z10, role, interfaceC9529a);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, this.state);
    }

    /* renamed from: update-QzZPfjk, reason: not valid java name */
    public final void m27737updateQzZPfjk(ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, Role role, InterfaceC9529a interfaceC9529a) {
        if (this.state != toggleableState) {
            this.state = toggleableState;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        super.m26998updateQzZPfjk(mutableInteractionSource, indicationNodeFactory, z10, (String) null, role, interfaceC9529a);
    }

    private TriStateToggleableNode(ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, Role role, InterfaceC9529a interfaceC9529a) {
        super(mutableInteractionSource, indicationNodeFactory, z10, null, role, interfaceC9529a, null);
        this.state = toggleableState;
    }
}
