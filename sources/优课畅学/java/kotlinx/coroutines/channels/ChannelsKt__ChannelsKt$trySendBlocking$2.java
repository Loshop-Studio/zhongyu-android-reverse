package kotlinx.coroutines.channels;

import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", m17801f = "Channels.kt", m17802l = {39}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ChannelsKt__ChannelsKt$trySendBlocking$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f17661a;

    /* renamed from: b */
    public /* synthetic */ Object f17662b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC9163f f17663c;

    /* renamed from: d */
    public final /* synthetic */ Object f17664d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__ChannelsKt$trySendBlocking$2(InterfaceC9163f interfaceC9163f, Object obj, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f17663c = interfaceC9163f;
        this.f17664d = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        ChannelsKt__ChannelsKt$trySendBlocking$2 channelsKt__ChannelsKt$trySendBlocking$2 = new ChannelsKt__ChannelsKt$trySendBlocking$2(this.f17663c, this.f17664d, interfaceC9324c);
        channelsKt__ChannelsKt$trySendBlocking$2.f17662b = obj;
        return channelsKt__ChannelsKt$trySendBlocking$2;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ChannelsKt__ChannelsKt$trySendBlocking$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM15909b;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f17661a;
        try {
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9163f interfaceC9163f = this.f17663c;
                Object obj2 = this.f17664d;
                Result.C9076a c9076a = Result.f17350b;
                this.f17661a = 1;
                if (interfaceC9163f.send(obj2, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            objM15909b = Result.m15909b(C8736p.f16368a);
        } catch (Throwable th) {
            Result.C9076a c9076a2 = Result.f17350b;
            objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
        }
        return C9160c.m16531b(Result.m15914h(objM15909b) ? C9160c.f17673b.m16544c(C8736p.f16368a) : C9160c.f17673b.m16542a(Result.m15911d(objM15909b)));
    }
}
