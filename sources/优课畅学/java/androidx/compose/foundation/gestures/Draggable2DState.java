package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
public interface Draggable2DState {
    static /* synthetic */ Object drag$default(Draggable2DState draggable2DState, MutatePriority mutatePriority, InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
        }
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return draggable2DState.drag(mutatePriority, interfaceC10574p, interfaceC9324c);
    }

    /* renamed from: dispatchRawDelta-k-4lQ0M */
    void mo20532dispatchRawDeltak4lQ0M(long j10);

    Object drag(MutatePriority mutatePriority, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C8736p> interfaceC9324c);
}
