package androidx.paging;

import androidx.databinding.library.baseAdapters.C3721BR;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC9165e;
import kotlinx.coroutines.channels.InterfaceC9158a;
import kotlinx.coroutines.channels.InterfaceC9163f;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1", m17801f = "SimpleChannelFlow.kt", m17802l = {55}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ InterfaceC10574p $block;
    final /* synthetic */ InterfaceC9158a $channel;
    int label;

    @InterfaceC9539d(m17800c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1", m17801f = "SimpleChannelFlow.kt", m17802l = {C3721BR.webViewControlViewModel}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1 */
    public static final class C43871 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $block;
        final /* synthetic */ InterfaceC9158a $channel;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43871(InterfaceC9158a interfaceC9158a, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C43871> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$channel = interfaceC9158a;
            this.$block = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C43871 c43871 = new C43871(this.$channel, this.$block, interfaceC9324c);
            c43871.L$0 = obj;
            return c43871;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C43871) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                SimpleProducerScopeImpl simpleProducerScopeImpl = new SimpleProducerScopeImpl((InterfaceC8822b0) this.L$0, this.$channel);
                InterfaceC10574p interfaceC10574p = this.$block;
                this.label = 1;
                if (interfaceC10574p.invoke(simpleProducerScopeImpl, this) == objM17291f) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1(InterfaceC9158a interfaceC9158a, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$channel = interfaceC9158a;
        this.$block = interfaceC10574p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1(this.$channel, this.$block, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                C43871 c43871 = new C43871(this.$channel, this.$block, null);
                this.label = 1;
                if (AbstractC9165e.m16556e(c43871, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            InterfaceC9163f.a.m16549a(this.$channel, null, 1, null);
        } catch (Throwable th) {
            this.$channel.close(th);
        }
        return C8736p.f16368a;
    }
}
