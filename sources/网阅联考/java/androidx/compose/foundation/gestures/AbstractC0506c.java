package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.foundation.gestures.c */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0506c {
    /* renamed from: a */
    public static boolean m177a(ScrollableState scrollableState) {
        return true;
    }

    /* renamed from: b */
    public static boolean m178b(ScrollableState scrollableState) {
        return true;
    }

    /* renamed from: e */
    public static /* synthetic */ Object m181e(ScrollableState scrollableState, MutatePriority mutatePriority, Function2 function2, Continuation continuation, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if ((i4 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return scrollableState.scroll(mutatePriority, function2, continuation);
    }
}
