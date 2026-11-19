package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public interface DraggableState {

    public static final class DefaultImpls {
    }

    static /* synthetic */ Object drag$default(DraggableState draggableState, MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
        }
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return draggableState.drag(mutatePriority, interfaceC9544p, interfaceC11588c);
    }

    void dispatchRawDelta(float f10);

    Object drag(MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c);
}
