package androidx.compose.foundation.relocation;

import androidx.compose.p014ui.geometry.Rect;
import p309qc.C10786q;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public interface BringIntoViewRequester {
    static /* synthetic */ Object bringIntoView$default(BringIntoViewRequester bringIntoViewRequester, Rect rect, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
        }
        if ((i10 & 1) != 0) {
            rect = null;
        }
        return bringIntoViewRequester.bringIntoView(rect, interfaceC11588c);
    }

    Object bringIntoView(Rect rect, InterfaceC11588c<? super C10786q> interfaceC11588c);
}
