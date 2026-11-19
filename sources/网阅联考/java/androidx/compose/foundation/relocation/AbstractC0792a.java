package androidx.compose.foundation.relocation;

import androidx.compose.p006ui.geometry.Rect;
import kotlin.coroutines.Continuation;

/* renamed from: androidx.compose.foundation.relocation.a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0792a {
    /* renamed from: a */
    public static /* synthetic */ Object m259a(BringIntoViewRequester bringIntoViewRequester, Rect rect, Continuation continuation, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
        }
        if ((i4 & 1) != 0) {
            rect = null;
        }
        return bringIntoViewRequester.bringIntoView(rect, continuation);
    }
}
