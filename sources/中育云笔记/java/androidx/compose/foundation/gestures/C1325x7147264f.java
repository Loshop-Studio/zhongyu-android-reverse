package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC10000a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2", m26211f = "MouseWheelScrollable.kt", m26212l = {227}, m26213m = "invokeSuspend")
/* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 */
/* loaded from: classes.dex */
public final class C1325x7147264f extends SuspendLambda implements InterfaceC9544p {
    int label;
    final /* synthetic */ MouseWheelScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1325x7147264f(MouseWheelScrollingLogic mouseWheelScrollingLogic, InterfaceC11588c<? super C1325x7147264f> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = mouseWheelScrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new C1325x7147264f(this.this$0, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return obj;
        }
        AbstractC9924b.m20071b(obj);
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.this$0;
        InterfaceC10000a interfaceC10000a = mouseWheelScrollingLogic.channel;
        this.label = 1;
        Object objBusyReceive = mouseWheelScrollingLogic.busyReceive(interfaceC10000a, this);
        return objBusyReceive == objM25952f ? objM25952f : objBusyReceive;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super MouseWheelScrollingLogic.MouseWheelScrollDelta> interfaceC11588c) {
        return ((C1325x7147264f) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
