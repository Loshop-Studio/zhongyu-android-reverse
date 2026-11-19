package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.node.SemanticsModifierNodeKt;
import androidx.compose.p014ui.semantics.Role;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.state.ToggleableStateKt;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
final class ToggleableNode extends ClickableNode {
    private final InterfaceC9529a _onClick;
    private InterfaceC9540l onValueChange;
    private boolean value;

    public /* synthetic */ ToggleableNode(boolean z10, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, Role role, InterfaceC9540l interfaceC9540l, AbstractC9972n abstractC9972n) {
        this(z10, mutableInteractionSource, indicationNodeFactory, z11, role, interfaceC9540l);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, ToggleableStateKt.ToggleableState(this.value));
    }

    public final InterfaceC9529a get_onClick() {
        return this._onClick;
    }

    /* renamed from: update-QzZPfjk, reason: not valid java name */
    public final void m27734updateQzZPfjk(boolean z10, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, Role role, InterfaceC9540l interfaceC9540l) {
        if (this.value != z10) {
            this.value = z10;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        this.onValueChange = interfaceC9540l;
        super.m26998updateQzZPfjk(mutableInteractionSource, indicationNodeFactory, z11, (String) null, role, this._onClick);
    }

    private ToggleableNode(final boolean z10, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, Role role, final InterfaceC9540l interfaceC9540l) {
        super(mutableInteractionSource, indicationNodeFactory, z11, null, role, new InterfaceC9529a() { // from class: androidx.compose.foundation.selection.ToggleableNode.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27735invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27735invoke() {
                interfaceC9540l.invoke(Boolean.valueOf(!z10));
            }
        }, null);
        this.value = z10;
        this.onValueChange = interfaceC9540l;
        this._onClick = new InterfaceC9529a() { // from class: androidx.compose.foundation.selection.ToggleableNode$_onClick$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27736invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27736invoke() {
                this.this$0.onValueChange.invoke(Boolean.valueOf(!this.this$0.value));
            }
        };
    }
}
