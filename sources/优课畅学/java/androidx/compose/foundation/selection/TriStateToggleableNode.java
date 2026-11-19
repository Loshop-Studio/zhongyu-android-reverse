package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.node.SemanticsModifierNodeKt;
import androidx.compose.p013ui.semantics.Role;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.state.ToggleableState;
import kotlin.jvm.internal.AbstractC9126n;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
final class TriStateToggleableNode extends ClickableNode {
    private ToggleableState state;

    public /* synthetic */ TriStateToggleableNode(ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, Role role, InterfaceC10559a interfaceC10559a, AbstractC9126n abstractC9126n) {
        this(toggleableState, mutableInteractionSource, indicationNodeFactory, z10, role, interfaceC10559a);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, this.state);
    }

    /* renamed from: update-QzZPfjk, reason: not valid java name */
    public final void m21135updateQzZPfjk(ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, Role role, InterfaceC10559a interfaceC10559a) {
        if (this.state != toggleableState) {
            this.state = toggleableState;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        super.m20396updateQzZPfjk(mutableInteractionSource, indicationNodeFactory, z10, (String) null, role, interfaceC10559a);
    }

    private TriStateToggleableNode(ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, Role role, InterfaceC10559a interfaceC10559a) {
        super(mutableInteractionSource, indicationNodeFactory, z10, null, role, interfaceC10559a, null);
        this.state = toggleableState;
    }
}
