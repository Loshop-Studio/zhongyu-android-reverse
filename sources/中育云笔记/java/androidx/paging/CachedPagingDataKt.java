package androidx.paging;

import androidx.annotation.CheckResult;
import androidx.paging.ActiveFlowTracker;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.flow.InterfaceC10040a;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class CachedPagingDataKt {

    @InterfaceC11829d(m26210c = "androidx.paging.CachedPagingDataKt$cachedIn$2", m26211f = "CachedPagingData.kt", m26212l = {99}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.CachedPagingDataKt$cachedIn$2 */
    public static final class C42142 extends SuspendLambda implements InterfaceC9545q {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C42142(InterfaceC11588c<? super C42142> interfaceC11588c) {
            super(3, interfaceC11588c);
        }

        @Override // p181hd.InterfaceC9545q
        public final Object invoke(MulticastedPagingData<T> multicastedPagingData, MulticastedPagingData<T> multicastedPagingData2, InterfaceC11588c<? super MulticastedPagingData<T>> interfaceC11588c) {
            C42142 c42142 = new C42142(interfaceC11588c);
            c42142.L$0 = multicastedPagingData;
            c42142.L$1 = multicastedPagingData2;
            return c42142.invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                MulticastedPagingData multicastedPagingData = (MulticastedPagingData) this.L$0;
                AbstractC9924b.m20071b(obj);
                return multicastedPagingData;
            }
            AbstractC9924b.m20071b(obj);
            MulticastedPagingData multicastedPagingData2 = (MulticastedPagingData) this.L$0;
            MulticastedPagingData multicastedPagingData3 = (MulticastedPagingData) this.L$1;
            this.L$0 = multicastedPagingData3;
            this.label = 1;
            return multicastedPagingData2.close(this) == objM25952f ? objM25952f : multicastedPagingData3;
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.CachedPagingDataKt$cachedIn$4", m26211f = "CachedPagingData.kt", m26212l = {103}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.CachedPagingDataKt$cachedIn$4 */
    public static final class C42154 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ ActiveFlowTracker $tracker;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42154(ActiveFlowTracker activeFlowTracker, InterfaceC11588c<? super C42154> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$tracker = activeFlowTracker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C42154(this.$tracker, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                ActiveFlowTracker activeFlowTracker = this.$tracker;
                if (activeFlowTracker != null) {
                    ActiveFlowTracker.FlowType flowType = ActiveFlowTracker.FlowType.PAGED_DATA_FLOW;
                    this.label = 1;
                    if (activeFlowTracker.onStart(flowType, this) == objM25952f) {
                        return objM25952f;
                    }
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
        public final Object invoke(InterfaceC11595d interfaceC11595d, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42154) create(interfaceC11595d, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.CachedPagingDataKt$cachedIn$5", m26211f = "CachedPagingData.kt", m26212l = {104}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.CachedPagingDataKt$cachedIn$5 */
    public static final class C42165 extends SuspendLambda implements InterfaceC9545q {
        final /* synthetic */ ActiveFlowTracker $tracker;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42165(ActiveFlowTracker activeFlowTracker, InterfaceC11588c<? super C42165> interfaceC11588c) {
            super(3, interfaceC11588c);
            this.$tracker = activeFlowTracker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                ActiveFlowTracker activeFlowTracker = this.$tracker;
                if (activeFlowTracker != null) {
                    ActiveFlowTracker.FlowType flowType = ActiveFlowTracker.FlowType.PAGED_DATA_FLOW;
                    this.label = 1;
                    if (activeFlowTracker.onComplete(flowType, this) == objM25952f) {
                        return objM25952f;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9545q
        public final Object invoke(InterfaceC11595d interfaceC11595d, Throwable th, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return new C42165(this.$tracker, interfaceC11588c).invokeSuspend(C10786q.f26013a);
        }
    }

    @CheckResult
    public static final <T> InterfaceC11594c cachedIn(InterfaceC11594c interfaceC11594c, InterfaceC11122i0 scope) {
        AbstractC9979u.m20294g(interfaceC11594c, "<this>");
        AbstractC9979u.m20294g(scope, "scope");
        return cachedIn(interfaceC11594c, scope, null);
    }

    public static /* synthetic */ InterfaceC11594c cachedIn$default(InterfaceC11594c interfaceC11594c, InterfaceC11122i0 interfaceC11122i0, ActiveFlowTracker activeFlowTracker, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            activeFlowTracker = null;
        }
        return cachedIn(interfaceC11594c, interfaceC11122i0, activeFlowTracker);
    }

    public static final <T> InterfaceC11594c cachedIn(InterfaceC11594c interfaceC11594c, InterfaceC11122i0 scope, ActiveFlowTracker activeFlowTracker) {
        AbstractC9979u.m20294g(interfaceC11594c, "<this>");
        AbstractC9979u.m20294g(scope, "scope");
        final InterfaceC11594c interfaceC11594cSimpleRunningReduce = FlowExtKt.simpleRunningReduce(FlowExtKt.simpleTransformLatest(interfaceC11594c, new CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1(null, scope, activeFlowTracker)), new C42142(null));
        return AbstractC11596e.m25545P(AbstractC11596e.m25539J(AbstractC11596e.m25541L(new InterfaceC11594c() { // from class: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1

            /* renamed from: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2 */
            public static final class C42132<T> implements InterfaceC11595d {
                final /* synthetic */ InterfaceC11595d $this_unsafeFlow;

                @InterfaceC11829d(m26210c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2", m26211f = "CachedPagingData.kt", m26212l = {50}, m26213m = "emit", m26214v = 1)
                /* renamed from: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC11588c interfaceC11588c) {
                        super(interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C42132.this.emit(null, this);
                    }
                }

                public C42132(InterfaceC11595d interfaceC11595d) {
                    this.$this_unsafeFlow = interfaceC11595d;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p379vd.InterfaceC11595d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, vc.InterfaceC11588c r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.C42132.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1 r0 = (androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.C42132.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1 r0 = new androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.AbstractC9924b.m20071b(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.AbstractC9924b.m20071b(r6)
                        vd.d r6 = r4.$this_unsafeFlow
                        androidx.paging.MulticastedPagingData r5 = (androidx.paging.MulticastedPagingData) r5
                        androidx.paging.PagingData r5 = r5.asPagingData()
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        qc.q r5 = p309qc.C10786q.f26013a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1.C42132.emit(java.lang.Object, vc.c):java.lang.Object");
                }
            }

            @Override // p379vd.InterfaceC11594c
            public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
                Object objCollect = interfaceC11594cSimpleRunningReduce.collect(new C42132(interfaceC11595d), interfaceC11588c);
                return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
            }
        }, new C42154(activeFlowTracker, null)), new C42165(activeFlowTracker, null)), scope, InterfaceC10040a.f23896a.m20878d(), 1);
    }
}
