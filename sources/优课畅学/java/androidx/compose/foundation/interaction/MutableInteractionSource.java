package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Stable;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

@Stable
/* loaded from: classes.dex */
public interface MutableInteractionSource extends InteractionSource {
    Object emit(Interaction interaction, InterfaceC9324c<? super C8736p> interfaceC9324c);

    boolean tryEmit(Interaction interaction);
}
