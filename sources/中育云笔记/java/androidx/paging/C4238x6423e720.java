package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import com.alibaba.fastjson.asm.Opcodes;
import com.taobao.sophix.PatchStatus;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC9924b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC10045g;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.InterfaceC10005f;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9546r;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import sd.InterfaceC11168v;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1", m26211f = "PageFetcher.kt", m26212l = {146}, m26213m = "invokeSuspend", m26214v = 1)
/* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1 */
/* loaded from: classes3.dex */
public final class C4238x6423e720 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ InterfaceC11594c $otherFlow;
    final /* synthetic */ MutableLoadStateCollection $sourceStates$inlined;
    final /* synthetic */ InterfaceC11594c $this_combineWithoutBatching;
    private /* synthetic */ Object L$0;
    int label;

    @InterfaceC11829d(m26210c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1", m26211f = "PageFetcher.kt", m26212l = {Opcodes.IAND}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9546r {
        final /* synthetic */ SimpleProducerScope<PageEvent<Value>> $$this$simpleChannelFlow;
        final /* synthetic */ MutableLoadStateCollection $sourceStates$inlined;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SimpleProducerScope simpleProducerScope, InterfaceC11588c interfaceC11588c, MutableLoadStateCollection mutableLoadStateCollection) {
            super(4, interfaceC11588c);
            this.$sourceStates$inlined = mutableLoadStateCollection;
            this.$$this$simpleChannelFlow = simpleProducerScope;
        }

        public final Object invoke(LoadStates loadStates, PageEvent<Value> pageEvent, CombineSource combineSource, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$simpleChannelFlow, interfaceC11588c, this.$sourceStates$inlined);
            anonymousClass1.L$0 = loadStates;
            anonymousClass1.L$1 = pageEvent;
            anonymousClass1.L$2 = combineSource;
            return anonymousClass1.invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                Object obj2 = this.L$0;
                Object obj3 = this.L$1;
                CombineSource combineSource = (CombineSource) this.L$2;
                InterfaceC10005f interfaceC10005f = this.$$this$simpleChannelFlow;
                Object loadStateUpdate = (PageEvent) obj3;
                LoadStates loadStates = (LoadStates) obj2;
                if (combineSource == CombineSource.RECEIVER) {
                    loadStateUpdate = new PageEvent.LoadStateUpdate(this.$sourceStates$inlined.snapshot(), loadStates);
                } else if (loadStateUpdate instanceof PageEvent.Insert) {
                    PageEvent.Insert insert = (PageEvent.Insert) loadStateUpdate;
                    this.$sourceStates$inlined.set(insert.getSourceLoadStates());
                    loadStateUpdate = PageEvent.Insert.copy$default(insert, null, null, 0, 0, insert.getSourceLoadStates(), loadStates, 15, null);
                } else if (loadStateUpdate instanceof PageEvent.Drop) {
                    this.$sourceStates$inlined.set(((PageEvent.Drop) loadStateUpdate).getLoadType(), LoadState.NotLoading.Companion.getIncomplete$paging_common());
                } else {
                    if (!(loadStateUpdate instanceof PageEvent.LoadStateUpdate)) {
                        if (loadStateUpdate instanceof PageEvent.StaticList) {
                            throw new IllegalStateException("Paging generated an event to display a static list that\n originated from a paginated source. If you see this\n exception, it is most likely a bug in the library.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    PageEvent.LoadStateUpdate loadStateUpdate2 = (PageEvent.LoadStateUpdate) loadStateUpdate;
                    this.$sourceStates$inlined.set(loadStateUpdate2.getSource());
                    loadStateUpdate = new PageEvent.LoadStateUpdate(loadStateUpdate2.getSource(), loadStates);
                }
                this.label = 1;
                if (interfaceC10005f.send(loadStateUpdate, this) == objM25952f) {
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

        @Override // p181hd.InterfaceC9546r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((LoadStates) obj, obj2, (CombineSource) obj3, (InterfaceC11588c<? super C10786q>) obj4);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", m26211f = "FlowExt.kt", m26212l = {PatchStatus.CODE_LOAD_LIB_CPUABIS}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ SimpleProducerScope<PageEvent<Value>> $$this$simpleChannelFlow;
        final /* synthetic */ InterfaceC11594c $flow;
        final /* synthetic */ AtomicInteger $incompleteFlows;
        final /* synthetic */ int $index;
        final /* synthetic */ UnbatchedFlowCombiner $unbatchedFlowCombiner;
        int label;

        /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements InterfaceC11595d {
            final /* synthetic */ int $index;
            final /* synthetic */ UnbatchedFlowCombiner $unbatchedFlowCombiner;

            /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C120911 extends ContinuationImpl {
                int label;
                /* synthetic */ Object result;

                public C120911(InterfaceC11588c interfaceC11588c) {
                    super(interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return AnonymousClass1.this.emit(null, this);
                }
            }

            public AnonymousClass1(UnbatchedFlowCombiner unbatchedFlowCombiner, int i10) {
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
                    boolean r0 = r7 instanceof androidx.paging.C4238x6423e720.AnonymousClass2.AnonymousClass1.C120911
                    if (r0 == 0) goto L13
                    r0 = r7
                    androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1$1 r0 = (androidx.paging.C4238x6423e720.AnonymousClass2.AnonymousClass1.C120911) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1$1 r0 = new androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1$1
                    r0.<init>(r7)
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
                    androidx.paging.UnbatchedFlowCombiner r7 = r5.$unbatchedFlowCombiner
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
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C4238x6423e720.AnonymousClass2.AnonymousClass1.emit(java.lang.Object, vc.c):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC11594c interfaceC11594c, AtomicInteger atomicInteger, SimpleProducerScope simpleProducerScope, UnbatchedFlowCombiner unbatchedFlowCombiner, int i10, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$flow = interfaceC11594c;
            this.$incompleteFlows = atomicInteger;
            this.$unbatchedFlowCombiner = unbatchedFlowCombiner;
            this.$index = i10;
            this.$$this$simpleChannelFlow = simpleProducerScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new AnonymousClass2(this.$flow, this.$incompleteFlows, this.$$this$simpleChannelFlow, this.$unbatchedFlowCombiner, this.$index, interfaceC11588c);
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
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$unbatchedFlowCombiner, this.$index);
                    this.label = 1;
                    if (interfaceC11594c.collect(anonymousClass1, this) == objM25952f) {
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
            return ((AnonymousClass2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4238x6423e720(InterfaceC11594c interfaceC11594c, InterfaceC11594c interfaceC11594c2, InterfaceC11588c interfaceC11588c, MutableLoadStateCollection mutableLoadStateCollection) {
        super(2, interfaceC11588c);
        this.$this_combineWithoutBatching = interfaceC11594c;
        this.$otherFlow = interfaceC11594c2;
        this.$sourceStates$inlined = mutableLoadStateCollection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        C4238x6423e720 c4238x6423e720 = new C4238x6423e720(this.$this_combineWithoutBatching, this.$otherFlow, interfaceC11588c, this.$sourceStates$inlined);
        c4238x6423e720.L$0 = obj;
        return c4238x6423e720;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(SimpleProducerScope<PageEvent<Value>> simpleProducerScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((C4238x6423e720) create(simpleProducerScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
            AtomicInteger atomicInteger = new AtomicInteger(2);
            UnbatchedFlowCombiner unbatchedFlowCombiner = new UnbatchedFlowCombiner(new AnonymousClass1(simpleProducerScope, null, this.$sourceStates$inlined));
            final InterfaceC11168v interfaceC11168vM20385b = JobKt__JobKt.m20385b(null, 1, null);
            int i11 = 0;
            InterfaceC11594c[] interfaceC11594cArr = {this.$this_combineWithoutBatching, this.$otherFlow};
            int i12 = 0;
            while (i12 < 2) {
                SimpleProducerScope simpleProducerScope2 = simpleProducerScope;
                simpleProducerScope = simpleProducerScope2;
                AbstractC11117h.m24726d(simpleProducerScope, interfaceC11168vM20385b, null, new AnonymousClass2(interfaceC11594cArr[i12], atomicInteger, simpleProducerScope2, unbatchedFlowCombiner, i11, null), 2, null);
                i12++;
                atomicInteger = atomicInteger;
                i11++;
                unbatchedFlowCombiner = unbatchedFlowCombiner;
            }
            InterfaceC9529a interfaceC9529a = new InterfaceC9529a() { // from class: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.3
                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m33803invoke();
                    return C10786q.f26013a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m33803invoke() {
                    InterfaceC10045g.a.m20900a(interfaceC11168vM20385b, null, 1, null);
                }
            };
            this.label = 1;
            if (simpleProducerScope.awaitClose(interfaceC9529a, this) == objM25952f) {
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
