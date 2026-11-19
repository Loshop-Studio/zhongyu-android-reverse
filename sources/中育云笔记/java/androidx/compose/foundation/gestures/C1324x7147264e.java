package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", m26211f = "MouseWheelScrollable.kt", m26212l = {227}, m26213m = "dispatchMouseWheelScroll$waitNextScrollDelta")
/* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 */
/* loaded from: classes.dex */
public final class C1324x7147264e extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public C1324x7147264e(InterfaceC11588c<? super C1324x7147264e> interfaceC11588c) {
        super(interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MouseWheelScrollingLogic.dispatchMouseWheelScroll$waitNextScrollDelta(null, null, null, null, null, 0L, this);
    }
}
