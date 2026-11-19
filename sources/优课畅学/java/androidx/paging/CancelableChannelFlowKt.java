package androidx.paging;

import androidx.annotation.RestrictTo;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9212n;
import kotlinx.coroutines.channels.InterfaceC9163f;
import p123h7.C8736p;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class CancelableChannelFlowKt {

    @InterfaceC9539d(m17800c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", m17801f = "CancelableChannelFlow.kt", m17802l = {33}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1 */
    public static final class C42921 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $block;
        final /* synthetic */ InterfaceC9212n $controller;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42921(InterfaceC9212n interfaceC9212n, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C42921> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$controller = interfaceC9212n;
            this.$block = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C42921 c42921 = new C42921(this.$controller, this.$block, interfaceC9324c);
            c42921.L$0 = obj;
            return c42921;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(SimpleProducerScope<T> simpleProducerScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C42921) create(simpleProducerScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                final SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
                this.$controller.mo16287k(new InterfaceC10570l() { // from class: androidx.paging.CancelableChannelFlowKt.cancelableChannelFlow.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Throwable) obj2);
                        return C8736p.f16368a;
                    }

                    public final void invoke(Throwable th) {
                        InterfaceC9163f.a.m16549a(simpleProducerScope, null, 1, null);
                    }
                });
                InterfaceC10574p interfaceC10574p = this.$block;
                this.label = 1;
                if (interfaceC10574p.invoke(simpleProducerScope, this) == objM17291f) {
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

    public static final <T> InterfaceC9266c cancelableChannelFlow(InterfaceC9212n controller, InterfaceC10574p block) {
        AbstractC9133u.m16133g(controller, "controller");
        AbstractC9133u.m16133g(block, "block");
        return SimpleChannelFlowKt.simpleChannelFlow(new C42921(controller, block, null));
    }
}
