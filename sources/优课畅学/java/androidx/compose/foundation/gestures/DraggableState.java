package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
public interface DraggableState {

    public static final class DefaultImpls {
    }

    static /* synthetic */ Object drag$default(DraggableState draggableState, MutatePriority mutatePriority, InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
        }
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return draggableState.drag(mutatePriority, interfaceC10574p, interfaceC9324c);
    }

    void dispatchRawDelta(float f10);

    Object drag(MutatePriority mutatePriority, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C8736p> interfaceC9324c);
}
