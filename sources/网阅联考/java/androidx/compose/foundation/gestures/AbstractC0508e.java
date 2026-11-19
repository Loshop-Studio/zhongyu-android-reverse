package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.foundation.gestures.e */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0508e {
    /* renamed from: a */
    public static /* synthetic */ Object m183a(TransformableState transformableState, MutatePriority mutatePriority, Function2 function2, Continuation continuation, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transform");
        }
        if ((i4 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return transformableState.transform(mutatePriority, function2, continuation);
    }
}
