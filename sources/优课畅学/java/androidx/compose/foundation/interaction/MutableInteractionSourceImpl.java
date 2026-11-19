package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Stable;
import kotlinx.coroutines.channels.BufferOverflow;
import p123h7.C8736p;
import p169l8.AbstractC9276m;
import p169l8.InterfaceC9270g;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;

@Stable
/* loaded from: classes.dex */
final class MutableInteractionSourceImpl implements MutableInteractionSource {
    private final InterfaceC9270g interactions = AbstractC9276m.m17044b(0, 16, BufferOverflow.f17604b, 1, null);

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public Object emit(Interaction interaction, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objEmit = getInteractions().emit(interaction, interfaceC9324c);
        return objEmit == AbstractC9434a.m17291f() ? objEmit : C8736p.f16368a;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public boolean tryEmit(Interaction interaction) {
        return getInteractions().mo16670a(interaction);
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public InterfaceC9270g getInteractions() {
        return this.interactions;
    }
}
