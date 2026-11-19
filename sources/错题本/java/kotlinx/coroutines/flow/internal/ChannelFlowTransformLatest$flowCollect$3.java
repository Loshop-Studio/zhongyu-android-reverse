package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 1, 0})
@DebugMetadata(m5302c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", m5303f = "Merge.kt", m5304i = {}, m5305l = {23}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes4.dex */
final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ InterfaceC5912g $collector;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5926h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowTransformLatest$flowCollect$3(C5926h c5926h, InterfaceC5912g interfaceC5912g, InterfaceC5631c<? super ChannelFlowTransformLatest$flowCollect$3> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = c5926h;
        this.$collector = interfaceC5912g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.this$0, this.$collector, interfaceC5631c);
        channelFlowTransformLatest$flowCollect$3.L$0 = obj;
        return channelFlowTransformLatest$flowCollect$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            C5926h c5926h = this.this$0;
            InterfaceC5910f interfaceC5910f = c5926h.f9393d;
            C5925g c5925g = new C5925g(ref$ObjectRef, interfaceC6009v, c5926h, this.$collector);
            this.label = 1;
            if (interfaceC5910f.collect(c5925g, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((ChannelFlowTransformLatest$flowCollect$3) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
