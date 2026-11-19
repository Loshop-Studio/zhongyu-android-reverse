package androidx.paging;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC9163f;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", m17801f = "FlowExt.kt", m17802l = {147}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FlowExtKt$combineWithoutBatching$2$1$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ SimpleProducerScope<R> $$this$simpleChannelFlow;
    final /* synthetic */ InterfaceC9266c $flow;
    final /* synthetic */ AtomicInteger $incompleteFlows;
    final /* synthetic */ int $index;
    final /* synthetic */ UnbatchedFlowCombiner<T1, T2> $unbatchedFlowCombiner;
    int label;

    /* renamed from: androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1 */
    public static final class C43001<T> implements InterfaceC9267d {
        final /* synthetic */ int $index;
        final /* synthetic */ UnbatchedFlowCombiner<T1, T2> $unbatchedFlowCombiner;

        public C43001(UnbatchedFlowCombiner<T1, T2> unbatchedFlowCombiner, int i10) {
            this.$unbatchedFlowCombiner = unbatchedFlowCombiner;
            this.$index = i10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
        
            if (p135i8.AbstractC8820a2.m14803a(r0) == r1) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p169l8.InterfaceC9267d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, p179m7.InterfaceC9324c<? super p123h7.C8736p> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r7
                androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1 r0 = (androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1 r0 = new androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.AbstractC9079b.m15926b(r7)
                goto L51
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                kotlin.AbstractC9079b.m15926b(r7)
                goto L48
            L38:
                kotlin.AbstractC9079b.m15926b(r7)
                androidx.paging.UnbatchedFlowCombiner<T1, T2> r7 = r5.$unbatchedFlowCombiner
                int r2 = r5.$index
                r0.label = r4
                java.lang.Object r6 = r7.onNext(r2, r6, r0)
                if (r6 != r1) goto L48
                goto L50
            L48:
                r0.label = r3
                java.lang.Object r6 = p135i8.AbstractC8820a2.m14803a(r0)
                if (r6 != r1) goto L51
            L50:
                return r1
            L51:
                h7.p r6 = p123h7.C8736p.f16368a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1.C43001.emit(java.lang.Object, m7.c):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$combineWithoutBatching$2$1$1(InterfaceC9266c interfaceC9266c, AtomicInteger atomicInteger, SimpleProducerScope<R> simpleProducerScope, UnbatchedFlowCombiner<T1, T2> unbatchedFlowCombiner, int i10, InterfaceC9324c<? super FlowExtKt$combineWithoutBatching$2$1$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$flow = interfaceC9266c;
        this.$incompleteFlows = atomicInteger;
        this.$$this$simpleChannelFlow = simpleProducerScope;
        this.$unbatchedFlowCombiner = unbatchedFlowCombiner;
        this.$index = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new FlowExtKt$combineWithoutBatching$2$1$1(this.$flow, this.$incompleteFlows, this.$$this$simpleChannelFlow, this.$unbatchedFlowCombiner, this.$index, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((FlowExtKt$combineWithoutBatching$2$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AtomicInteger atomicInteger;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9266c interfaceC9266c = this.$flow;
                C43001 c43001 = new C43001(this.$unbatchedFlowCombiner, this.$index);
                this.label = 1;
                if (interfaceC9266c.collect(c43001, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                InterfaceC9163f.a.m16549a(this.$$this$simpleChannelFlow, null, 1, null);
            }
            return C8736p.f16368a;
        } finally {
            if (this.$incompleteFlows.decrementAndGet() == 0) {
                InterfaceC9163f.a.m16549a(this.$$this$simpleChannelFlow, null, 1, null);
            }
        }
    }
}
