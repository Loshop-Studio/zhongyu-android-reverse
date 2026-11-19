package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC9158a;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2", m17801f = "MouseWheelScrollable.kt", m17802l = {TbsListener.ErrorCode.HOST_CONTEXT_IS_NULL}, m17803m = "invokeSuspend")
/* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 */
/* loaded from: classes.dex */
public final class C1295x7147264f extends SuspendLambda implements InterfaceC10574p {
    int label;
    final /* synthetic */ MouseWheelScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1295x7147264f(MouseWheelScrollingLogic mouseWheelScrollingLogic, InterfaceC9324c<? super C1295x7147264f> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = mouseWheelScrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new C1295x7147264f(this.this$0, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super MouseWheelScrollingLogic.MouseWheelScrollDelta> interfaceC9324c) {
        return ((C1295x7147264f) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return obj;
        }
        AbstractC9079b.m15926b(obj);
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.this$0;
        InterfaceC9158a interfaceC9158a = mouseWheelScrollingLogic.channel;
        this.label = 1;
        Object objBusyReceive = mouseWheelScrollingLogic.busyReceive(interfaceC9158a, this);
        return objBusyReceive == objM17291f ? objM17291f : objBusyReceive;
    }
}
