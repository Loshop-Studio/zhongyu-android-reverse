package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Stable;
import p309qc.C10786q;
import vc.InterfaceC11588c;

@Stable
/* loaded from: classes.dex */
public interface MutableInteractionSource extends InteractionSource {
    Object emit(Interaction interaction, InterfaceC11588c<? super C10786q> interfaceC11588c);

    boolean tryEmit(Interaction interaction);
}
