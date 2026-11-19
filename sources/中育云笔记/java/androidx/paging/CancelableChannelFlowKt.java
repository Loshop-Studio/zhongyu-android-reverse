package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.CancelableChannelFlowKt;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.InterfaceC10045g;
import kotlinx.coroutines.channels.InterfaceC10005f;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class CancelableChannelFlowKt {

    @InterfaceC11829d(m26210c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", m26211f = "CancelableChannelFlow.kt", m26212l = {31}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1 */
    public static final class C42171 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        final /* synthetic */ InterfaceC10045g $controller;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42171(InterfaceC10045g interfaceC10045g, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C42171> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$controller = interfaceC10045g;
            this.$block = interfaceC9544p;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C10786q invokeSuspend$lambda$0(SimpleProducerScope simpleProducerScope, Throwable th) {
            InterfaceC10005f.a.m20742a(simpleProducerScope, null, 1, null);
            return C10786q.f26013a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C42171 c42171 = new C42171(this.$controller, this.$block, interfaceC11588c);
            c42171.L$0 = obj;
            return c42171;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SimpleProducerScope<T> simpleProducerScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42171) create(simpleProducerScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
                this.$controller.mo20404A(new InterfaceC9540l() { // from class: androidx.paging.h
                    @Override // p181hd.InterfaceC9540l
                    public final Object invoke(Object obj2) {
                        return CancelableChannelFlowKt.C42171.invokeSuspend$lambda$0(simpleProducerScope, (Throwable) obj2);
                    }
                });
                InterfaceC9544p interfaceC9544p = this.$block;
                this.label = 1;
                if (interfaceC9544p.invoke(simpleProducerScope, this) == objM25952f) {
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
    }

    public static final <T> InterfaceC11594c cancelableChannelFlow(InterfaceC10045g controller, InterfaceC9544p block) {
        AbstractC9979u.m20294g(controller, "controller");
        AbstractC9979u.m20294g(block, "block");
        return SimpleChannelFlowKt.simpleChannelFlow(new C42171(controller, block, null));
    }
}
