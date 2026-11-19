package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.node.SemanticsModifierNodeKt;
import androidx.compose.p013ui.semantics.Role;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.state.ToggleableStateKt;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class ToggleableNode extends ClickableNode {
    private final InterfaceC10559a _onClick;
    private InterfaceC10570l onValueChange;
    private boolean value;

    public /* synthetic */ ToggleableNode(boolean z10, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, Role role, InterfaceC10570l interfaceC10570l, AbstractC9126n abstractC9126n) {
        this(z10, mutableInteractionSource, indicationNodeFactory, z11, role, interfaceC10570l);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, ToggleableStateKt.ToggleableState(this.value));
    }

    public final InterfaceC10559a get_onClick() {
        return this._onClick;
    }

    /* renamed from: update-QzZPfjk, reason: not valid java name */
    public final void m21132updateQzZPfjk(boolean z10, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, Role role, InterfaceC10570l interfaceC10570l) {
        if (this.value != z10) {
            this.value = z10;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        this.onValueChange = interfaceC10570l;
        super.m20396updateQzZPfjk(mutableInteractionSource, indicationNodeFactory, z11, (String) null, role, this._onClick);
    }

    private ToggleableNode(final boolean z10, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, Role role, final InterfaceC10570l interfaceC10570l) {
        super(mutableInteractionSource, indicationNodeFactory, z11, null, role, new InterfaceC10559a() { // from class: androidx.compose.foundation.selection.ToggleableNode.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m21133invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m21133invoke() {
                interfaceC10570l.invoke(Boolean.valueOf(!z10));
            }
        }, null);
        this.value = z10;
        this.onValueChange = interfaceC10570l;
        this._onClick = new InterfaceC10559a() { // from class: androidx.compose.foundation.selection.ToggleableNode$_onClick$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m21134invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m21134invoke() {
                this.this$0.onValueChange.invoke(Boolean.valueOf(!this.this$0.value));
            }
        };
    }
}
