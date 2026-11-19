package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.foundation.gestures.a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0504a {
    /* renamed from: a */
    public static /* synthetic */ Object m163a(DraggableState draggableState, MutatePriority mutatePriority, Function2 function2, Continuation continuation, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
        }
        if ((i4 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return draggableState.drag(mutatePriority, function2, continuation);
    }
}
