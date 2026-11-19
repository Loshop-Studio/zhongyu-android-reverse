package androidx.paging;

import com.taobao.sophix.PatchStatus;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC10005f;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", m26211f = "FlowExt.kt", m26212l = {PatchStatus.CODE_LOAD_LIB_CPUABIS}, m26213m = "invokeSuspend", m26214v = 1)
/* loaded from: classes3.dex */
public final class FlowExtKt$combineWithoutBatching$2$1$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ SimpleProducerScope<R> $$this$simpleChannelFlow;
    final /* synthetic */ InterfaceC11594c $flow;
    final /* synthetic */ AtomicInteger $incompleteFlows;
    final /* synthetic */ int $index;
    final /* synthetic */ UnbatchedFlowCombiner<T1, T2> $unbatchedFlowCombiner;
    int label;

    /* renamed from: androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1 */
    public static final class C42241<T> implements InterfaceC11595d {
        final /* synthetic */ int $index;
        final /* synthetic */ UnbatchedFlowCombiner<T1, T2> $unbatchedFlowCombiner;

        public C42241(UnbatchedFlowCombiner<T1, T2> unbatchedFlowCombiner, int i10) {
            this.$unbatchedFlowCombiner = unbatchedFlowCombiner;
            this.$index = i10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
        
            if (sd.AbstractC11152p2.m24789a(r0) == r1) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p379vd.InterfaceC11595d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, vc.InterfaceC11588c<? super p309qc.C10786q> r7) throws java.lang.Throwable {
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
                java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.AbstractC9924b.m20071b(r7)
                goto L51
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                kotlin.AbstractC9924b.m20071b(r7)
                goto L48
            L38:
                kotlin.AbstractC9924b.m20071b(r7)
                androidx.paging.UnbatchedFlowCombiner<T1, T2> r7 = r5.$unbatchedFlowCombiner
                int r2 = r5.$index
                r0.label = r4
                java.lang.Object r6 = r7.onNext(r2, r6, r0)
                if (r6 != r1) goto L48
                goto L50
            L48:
                r0.label = r3
                java.lang.Object r6 = sd.AbstractC11152p2.m24789a(r0)
                if (r6 != r1) goto L51
            L50:
                return r1
            L51:
                qc.q r6 = p309qc.C10786q.f26013a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1.C42241.emit(java.lang.Object, vc.c):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$combineWithoutBatching$2$1$1(InterfaceC11594c interfaceC11594c, AtomicInteger atomicInteger, SimpleProducerScope<R> simpleProducerScope, UnbatchedFlowCombiner<T1, T2> unbatchedFlowCombiner, int i10, InterfaceC11588c<? super FlowExtKt$combineWithoutBatching$2$1$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$flow = interfaceC11594c;
        this.$incompleteFlows = atomicInteger;
        this.$$this$simpleChannelFlow = simpleProducerScope;
        this.$unbatchedFlowCombiner = unbatchedFlowCombiner;
        this.$index = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new FlowExtKt$combineWithoutBatching$2$1$1(this.$flow, this.$incompleteFlows, this.$$this$simpleChannelFlow, this.$unbatchedFlowCombiner, this.$index, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AtomicInteger atomicInteger;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11594c interfaceC11594c = this.$flow;
                C42241 c42241 = new C42241(this.$unbatchedFlowCombiner, this.$index);
                this.label = 1;
                if (interfaceC11594c.collect(c42241, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                InterfaceC10005f.a.m20742a(this.$$this$simpleChannelFlow, null, 1, null);
            }
            return C10786q.f26013a;
        } finally {
            if (this.$incompleteFlows.decrementAndGet() == 0) {
                InterfaceC10005f.a.m20742a(this.$$this$simpleChannelFlow, null, 1, null);
            }
        }
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((FlowExtKt$combineWithoutBatching$2$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
