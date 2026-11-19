package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC9079b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC9212n;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.InterfaceC9163f;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p135i8.InterfaceC8878u;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10576r;

@InterfaceC9539d(m17800c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1", m17801f = "PageFetcher.kt", m17802l = {161}, m17803m = "invokeSuspend")
/* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1 */
/* loaded from: classes3.dex */
public final class C4319x6423e720 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ InterfaceC9266c $otherFlow;
    final /* synthetic */ MutableLoadStateCollection $sourceStates$inlined;
    final /* synthetic */ InterfaceC9266c $this_combineWithoutBatching;
    private /* synthetic */ Object L$0;
    int label;

    @InterfaceC9539d(m17800c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1", m17801f = "PageFetcher.kt", m17802l = {141}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10576r {
        final /* synthetic */ SimpleProducerScope<PageEvent<Value>> $$this$simpleChannelFlow;
        final /* synthetic */ MutableLoadStateCollection $sourceStates$inlined;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SimpleProducerScope simpleProducerScope, InterfaceC9324c interfaceC9324c, MutableLoadStateCollection mutableLoadStateCollection) {
            super(4, interfaceC9324c);
            this.$sourceStates$inlined = mutableLoadStateCollection;
            this.$$this$simpleChannelFlow = simpleProducerScope;
        }

        public final Object invoke(LoadStates loadStates, PageEvent<Value> pageEvent, CombineSource combineSource, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$simpleChannelFlow, interfaceC9324c, this.$sourceStates$inlined);
            anonymousClass1.L$0 = loadStates;
            anonymousClass1.L$1 = pageEvent;
            anonymousClass1.L$2 = combineSource;
            return anonymousClass1.invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                Object obj2 = this.L$0;
                Object obj3 = this.L$1;
                CombineSource combineSource = (CombineSource) this.L$2;
                InterfaceC9163f interfaceC9163f = this.$$this$simpleChannelFlow;
                Object loadStateUpdate = (PageEvent) obj3;
                LoadStates loadStates = (LoadStates) obj2;
                if (combineSource == CombineSource.RECEIVER) {
                    loadStateUpdate = new PageEvent.LoadStateUpdate(this.$sourceStates$inlined.snapshot(), loadStates);
                } else if (loadStateUpdate instanceof PageEvent.Insert) {
                    PageEvent.Insert insert = (PageEvent.Insert) loadStateUpdate;
                    this.$sourceStates$inlined.set(insert.getSourceLoadStates());
                    loadStateUpdate = PageEvent.Insert.copy$default(insert, null, null, 0, 0, insert.getSourceLoadStates(), loadStates, 15, null);
                } else if (loadStateUpdate instanceof PageEvent.Drop) {
                    this.$sourceStates$inlined.set(((PageEvent.Drop) loadStateUpdate).getLoadType(), LoadState.NotLoading.Companion.getIncomplete$paging_common_release());
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
                if (interfaceC9163f.send(loadStateUpdate, this) == objM17291f) {
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

        @Override // p300x7.InterfaceC10576r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((LoadStates) obj, obj2, (CombineSource) obj3, (InterfaceC9324c<? super C8736p>) obj4);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", m17801f = "FlowExt.kt", m17802l = {147}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ SimpleProducerScope<PageEvent<Value>> $$this$simpleChannelFlow;
        final /* synthetic */ InterfaceC9266c $flow;
        final /* synthetic */ AtomicInteger $incompleteFlows;
        final /* synthetic */ int $index;
        final /* synthetic */ UnbatchedFlowCombiner $unbatchedFlowCombiner;
        int label;

        /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements InterfaceC9267d {
            final /* synthetic */ int $index;
            final /* synthetic */ UnbatchedFlowCombiner $unbatchedFlowCombiner;

            /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C107821 extends ContinuationImpl {
                int label;
                /* synthetic */ Object result;

                public C107821(InterfaceC9324c interfaceC9324c) {
                    super(interfaceC9324c);
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
                    boolean r0 = r7 instanceof androidx.paging.C4319x6423e720.AnonymousClass2.AnonymousClass1.C107821
                    if (r0 == 0) goto L13
                    r0 = r7
                    androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1$1 r0 = (androidx.paging.C4319x6423e720.AnonymousClass2.AnonymousClass1.C107821) r0
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
                    androidx.paging.UnbatchedFlowCombiner r7 = r5.$unbatchedFlowCombiner
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
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C4319x6423e720.AnonymousClass2.AnonymousClass1.emit(java.lang.Object, m7.c):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC9266c interfaceC9266c, AtomicInteger atomicInteger, SimpleProducerScope simpleProducerScope, UnbatchedFlowCombiner unbatchedFlowCombiner, int i10, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$flow = interfaceC9266c;
            this.$incompleteFlows = atomicInteger;
            this.$unbatchedFlowCombiner = unbatchedFlowCombiner;
            this.$index = i10;
            this.$$this$simpleChannelFlow = simpleProducerScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new AnonymousClass2(this.$flow, this.$incompleteFlows, this.$$this$simpleChannelFlow, this.$unbatchedFlowCombiner, this.$index, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$unbatchedFlowCombiner, this.$index);
                    this.label = 1;
                    if (interfaceC9266c.collect(anonymousClass1, this) == objM17291f) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4319x6423e720(InterfaceC9266c interfaceC9266c, InterfaceC9266c interfaceC9266c2, InterfaceC9324c interfaceC9324c, MutableLoadStateCollection mutableLoadStateCollection) {
        super(2, interfaceC9324c);
        this.$this_combineWithoutBatching = interfaceC9266c;
        this.$otherFlow = interfaceC9266c2;
        this.$sourceStates$inlined = mutableLoadStateCollection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        C4319x6423e720 c4319x6423e720 = new C4319x6423e720(this.$this_combineWithoutBatching, this.$otherFlow, interfaceC9324c, this.$sourceStates$inlined);
        c4319x6423e720.L$0 = obj;
        return c4319x6423e720;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(SimpleProducerScope<PageEvent<Value>> simpleProducerScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((C4319x6423e720) create(simpleProducerScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
            AtomicInteger atomicInteger = new AtomicInteger(2);
            UnbatchedFlowCombiner unbatchedFlowCombiner = new UnbatchedFlowCombiner(new AnonymousClass1(simpleProducerScope, null, this.$sourceStates$inlined));
            final InterfaceC8878u interfaceC8878uM16233b = JobKt__JobKt.m16233b(null, 1, null);
            int i11 = 0;
            InterfaceC9266c[] interfaceC9266cArr = {this.$this_combineWithoutBatching, this.$otherFlow};
            int i12 = 0;
            while (i12 < 2) {
                SimpleProducerScope simpleProducerScope2 = simpleProducerScope;
                simpleProducerScope = simpleProducerScope2;
                AbstractC8839h.m14861d(simpleProducerScope, interfaceC8878uM16233b, null, new AnonymousClass2(interfaceC9266cArr[i12], atomicInteger, simpleProducerScope2, unbatchedFlowCombiner, i11, null), 2, null);
                i12++;
                atomicInteger = atomicInteger;
                i11++;
                unbatchedFlowCombiner = unbatchedFlowCombiner;
            }
            InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1.3
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m27207invoke();
                    return C8736p.f16368a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m27207invoke() {
                    InterfaceC9212n.a.m16777a(interfaceC8878uM16233b, null, 1, null);
                }
            };
            this.label = 1;
            if (simpleProducerScope.awaitClose(interfaceC10559a, this) == objM17291f) {
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
