package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.channels.InterfaceC5886o;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 1, 0})
@DebugMetadata(m5302c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", m5303f = "ChannelFlow.kt", m5304i = {}, m5305l = {119}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes4.dex */
final class ChannelFlow$collect$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ InterfaceC5912g $collector;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC5922d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collect$2(InterfaceC5912g interfaceC5912g, AbstractC5922d abstractC5922d, InterfaceC5631c<? super ChannelFlow$collect$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$collector = interfaceC5912g;
        this.this$0 = abstractC5922d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        ChannelFlow$collect$2 channelFlow$collect$2 = new ChannelFlow$collect$2(this.$collector, this.this$0, interfaceC5631c);
        channelFlow$collect$2.L$0 = obj;
        return channelFlow$collect$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5443s c5443s = C5443s.f8405a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            return c5443s;
        }
        AbstractC5774b.m5119b(obj);
        InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
        InterfaceC5912g interfaceC5912g = this.$collector;
        InterfaceC5886o interfaceC5886oMo5525h = this.this$0.mo5525h(interfaceC6009v);
        this.label = 1;
        Object objM5553i = AbstractC5914h.m5553i(interfaceC5912g, interfaceC5886oMo5525h, true, this);
        if (objM5553i != coroutineSingletons) {
            objM5553i = c5443s;
        }
        return objM5553i == coroutineSingletons ? coroutineSingletons : c5443s;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((ChannelFlow$collect$2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
