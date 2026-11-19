package kotlinx.coroutines.flow.internal;

import androidx.databinding.library.baseAdapters.C3721BR;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p157k8.InterfaceC9071g;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", m17801f = "ChannelFlow.kt", m17802l = {C3721BR.userInfo}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ChannelFlow$collectToFun$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f17996a;

    /* renamed from: b */
    public /* synthetic */ Object f17997b;

    /* renamed from: c */
    public final /* synthetic */ ChannelFlow f17998c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collectToFun$1(ChannelFlow channelFlow, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f17998c = channelFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this.f17998c, interfaceC9324c);
        channelFlow$collectToFun$1.f17997b = obj;
        return channelFlow$collectToFun$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f17996a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9071g interfaceC9071g = (InterfaceC9071g) this.f17997b;
            ChannelFlow channelFlow = this.f17998c;
            this.f17996a = 1;
            if (channelFlow.mo16569i(interfaceC9071g, this) == objM17291f) {
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

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC9071g interfaceC9071g, InterfaceC9324c interfaceC9324c) {
        return ((ChannelFlow$collectToFun$1) create(interfaceC9071g, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }
}
