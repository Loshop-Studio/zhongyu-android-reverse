package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Stable;
import kotlinx.coroutines.channels.BufferOverflow;
import p309qc.C10786q;
import p379vd.AbstractC11608q;
import p379vd.InterfaceC11602k;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

@Stable
/* loaded from: classes.dex */
final class MutableInteractionSourceImpl implements MutableInteractionSource {
    private final InterfaceC11602k interactions = AbstractC11608q.m25592b(0, 16, BufferOverflow.f23520d, 1, null);

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public Object emit(Interaction interaction, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objEmit = getInteractions().emit(interaction, interfaceC11588c);
        return objEmit == AbstractC11725a.m25952f() ? objEmit : C10786q.f26013a;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public boolean tryEmit(Interaction interaction) {
        return getInteractions().mo20854a(interaction);
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public InterfaceC11602k getInteractions() {
        return this.interactions;
    }
}
