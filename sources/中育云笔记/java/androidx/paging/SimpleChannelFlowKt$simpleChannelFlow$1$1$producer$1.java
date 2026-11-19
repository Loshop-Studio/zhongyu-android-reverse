package androidx.paging;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.channels.InterfaceC10000a;
import kotlinx.coroutines.channels.InterfaceC10005f;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1", m26211f = "SimpleChannelFlow.kt", m26212l = {52}, m26213m = "invokeSuspend", m26214v = 1)
/* loaded from: classes3.dex */
public final class SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ InterfaceC9544p $block;
    final /* synthetic */ InterfaceC10000a $channel;
    int label;

    @InterfaceC11829d(m26210c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1", m26211f = "SimpleChannelFlow.kt", m26212l = {55}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1 */
    public static final class C42901 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        final /* synthetic */ InterfaceC10000a $channel;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42901(InterfaceC10000a interfaceC10000a, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C42901> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$channel = interfaceC10000a;
            this.$block = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C42901 c42901 = new C42901(this.$channel, this.$block, interfaceC11588c);
            c42901.L$0 = obj;
            return c42901;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                SimpleProducerScopeImpl simpleProducerScopeImpl = new SimpleProducerScopeImpl((InterfaceC11122i0) this.L$0, this.$channel);
                InterfaceC9544p interfaceC9544p = this.$block;
                this.label = 1;
                if (interfaceC9544p.invoke(simpleProducerScopeImpl, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42901) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1(InterfaceC10000a interfaceC10000a, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$channel = interfaceC10000a;
        this.$block = interfaceC9544p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1(this.$channel, this.$block, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                C42901 c42901 = new C42901(this.$channel, this.$block, null);
                this.label = 1;
                if (AbstractC10006d.m20748e(c42901, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            InterfaceC10005f.a.m20742a(this.$channel, null, 1, null);
        } catch (Throwable th) {
            this.$channel.close(th);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
