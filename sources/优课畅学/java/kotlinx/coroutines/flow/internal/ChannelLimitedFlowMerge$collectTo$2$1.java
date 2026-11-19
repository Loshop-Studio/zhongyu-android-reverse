package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p180m8.C9340m;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", m17801f = "Merge.kt", m17802l = {92}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ChannelLimitedFlowMerge$collectTo$2$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f18023a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC9266c f18024b;

    /* renamed from: c */
    public final /* synthetic */ C9340m f18025c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelLimitedFlowMerge$collectTo$2$1(InterfaceC9266c interfaceC9266c, C9340m c9340m, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f18024b = interfaceC9266c;
        this.f18025c = c9340m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ChannelLimitedFlowMerge$collectTo$2$1(this.f18024b, this.f18025c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ChannelLimitedFlowMerge$collectTo$2$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f18023a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9266c interfaceC9266c = this.f18024b;
            C9340m c9340m = this.f18025c;
            this.f18023a = 1;
            if (interfaceC9266c.collect(c9340m, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }
}
