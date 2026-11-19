package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public interface Draggable2DState {
    static /* synthetic */ Object drag$default(Draggable2DState draggable2DState, MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
        }
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return draggable2DState.drag(mutatePriority, interfaceC9544p, interfaceC11588c);
    }

    /* renamed from: dispatchRawDelta-k-4lQ0M */
    void mo27134dispatchRawDeltak4lQ0M(long j10);

    Object drag(MutatePriority mutatePriority, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c);
}
