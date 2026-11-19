package androidx.compose.foundation.relocation;

import androidx.compose.p013ui.geometry.Rect;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

/* loaded from: classes.dex */
public interface BringIntoViewRequester {
    static /* synthetic */ Object bringIntoView$default(BringIntoViewRequester bringIntoViewRequester, Rect rect, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
        }
        if ((i10 & 1) != 0) {
            rect = null;
        }
        return bringIntoViewRequester.bringIntoView(rect, interfaceC9324c);
    }

    Object bringIntoView(Rect rect, InterfaceC9324c<? super C8736p> interfaceC9324c);
}
