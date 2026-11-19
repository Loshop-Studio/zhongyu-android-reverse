package androidx.paging;

import androidx.annotation.RestrictTo;
import com.taobao.sophix.PatchStatus;
import com.tendcloud.tenddata.C7843ab;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC10045g;
import kotlinx.coroutines.JobKt__JobKt;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p181hd.InterfaceC9546r;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11168v;
import vc.InterfaceC11588c;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class FlowExtKt {
    private static final Object NULL = new Object();

    @InterfaceC11829d(m26210c = "androidx.paging.FlowExtKt$combineWithoutBatching$2", m26211f = "FlowExt.kt", m26212l = {146}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.FlowExtKt$combineWithoutBatching$2 */
    public static final class C42232 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC11594c $otherFlow;
        final /* synthetic */ InterfaceC11594c $this_combineWithoutBatching;
        final /* synthetic */ InterfaceC9546r $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* renamed from: androidx.paging.FlowExtKt$combineWithoutBatching$2$2, reason: invalid class name */
        public static final class AnonymousClass2 implements InterfaceC9529a {
            final /* synthetic */ InterfaceC11168v $parentJob;

            public AnonymousClass2(InterfaceC11168v interfaceC11168v) {
                this.$parentJob = interfaceC11168v;
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33802invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33802invoke() {
                InterfaceC10045g.a.m20900a(this.$parentJob, null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42232(InterfaceC11594c interfaceC11594c, InterfaceC11594c interfaceC11594c2, InterfaceC9546r interfaceC9546r, InterfaceC11588c<? super C42232> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$this_combineWithoutBatching = interfaceC11594c;
            this.$otherFlow = interfaceC11594c2;
            this.$transform = interfaceC9546r;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C42232 c42232 = new C42232(this.$this_combineWithoutBatching, this.$otherFlow, this.$transform, interfaceC11588c);
            c42232.L$0 = obj;
            return c42232;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SimpleProducerScope<R> simpleProducerScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42232) create(simpleProducerScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
                AtomicInteger atomicInteger = new AtomicInteger(2);
                UnbatchedFlowCombiner unbatchedFlowCombiner = new UnbatchedFlowCombiner(new FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(simpleProducerScope, this.$transform, null));
                InterfaceC11168v interfaceC11168vM20385b = JobKt__JobKt.m20385b(null, 1, null);
                int i11 = 0;
                InterfaceC11594c[] interfaceC11594cArr = {this.$this_combineWithoutBatching, this.$otherFlow};
                int i12 = 0;
                while (i12 < 2) {
                    SimpleProducerScope simpleProducerScope2 = simpleProducerScope;
                    simpleProducerScope = simpleProducerScope2;
                    AbstractC11117h.m24726d(simpleProducerScope, interfaceC11168vM20385b, null, new FlowExtKt$combineWithoutBatching$2$1$1(interfaceC11594cArr[i12], atomicInteger, simpleProducerScope2, unbatchedFlowCombiner, i11, null), 2, null);
                    i12++;
                    atomicInteger = atomicInteger;
                    i11++;
                    unbatchedFlowCombiner = unbatchedFlowCombiner;
                }
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(interfaceC11168vM20385b);
                this.label = 1;
                if (simpleProducerScope.awaitClose(anonymousClass2, this) == objM25952f) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
            AbstractC9977s.m20287c(10);
            AtomicInteger atomicInteger = new AtomicInteger(2);
            UnbatchedFlowCombiner unbatchedFlowCombiner = new UnbatchedFlowCombiner(new FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(simpleProducerScope, this.$transform, null));
            InterfaceC11168v interfaceC11168vM20385b = JobKt__JobKt.m20385b(null, 1, null);
            InterfaceC11594c[] interfaceC11594cArr = {this.$this_combineWithoutBatching, this.$otherFlow};
            int i10 = 0;
            int i11 = 0;
            while (i11 < 2) {
                int i12 = i10;
                InterfaceC11594c interfaceC11594c = interfaceC11594cArr[i11];
                int i13 = i12 + 1;
                int iIntValue = Integer.valueOf(i12).intValue();
                SimpleProducerScope simpleProducerScope2 = simpleProducerScope;
                simpleProducerScope = simpleProducerScope2;
                AtomicInteger atomicInteger2 = atomicInteger;
                AbstractC11117h.m24726d(simpleProducerScope, interfaceC11168vM20385b, null, new FlowExtKt$combineWithoutBatching$2$1$1(interfaceC11594c, atomicInteger, simpleProducerScope2, unbatchedFlowCombiner, iIntValue, null), 2, null);
                C10786q c10786q = C10786q.f26013a;
                i11++;
                atomicInteger = atomicInteger2;
                i10 = i13;
                unbatchedFlowCombiner = unbatchedFlowCombiner;
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(interfaceC11168vM20385b);
            AbstractC9977s.m20287c(0);
            simpleProducerScope.awaitClose(anonymousClass2, this);
            AbstractC9977s.m20287c(1);
            return C10786q.f26013a;
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.FlowExtKt$simpleFlatMapLatest$1", m26211f = "FlowExt.kt", m26212l = {PatchStatus.CODE_LOAD_ILLEGAL_ACCESS, PatchStatus.CODE_LOAD_ILLEGAL_ACCESS}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.FlowExtKt$simpleFlatMapLatest$1 */
    public static final class C42251 extends SuspendLambda implements InterfaceC9545q {
        final /* synthetic */ InterfaceC9544p $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42251(InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C42251> interfaceC11588c) {
            super(3, interfaceC11588c);
            this.$transform = interfaceC9544p;
        }

        @Override // p181hd.InterfaceC9545q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC11595d) obj, (InterfaceC11595d) obj2, (InterfaceC11588c<? super C10786q>) obj3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (p379vd.AbstractC11596e.m25570t(r1, (p379vd.InterfaceC11594c) r6, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.AbstractC9924b.m20071b(r6)
                goto L47
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.L$0
                vd.d r1 = (p379vd.InterfaceC11595d) r1
                kotlin.AbstractC9924b.m20071b(r6)
                goto L39
            L22:
                kotlin.AbstractC9924b.m20071b(r6)
                java.lang.Object r6 = r5.L$0
                r1 = r6
                vd.d r1 = (p379vd.InterfaceC11595d) r1
                java.lang.Object r6 = r5.L$1
                hd.p r4 = r5.$transform
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                goto L46
            L39:
                vd.c r6 = (p379vd.InterfaceC11594c) r6
                r3 = 0
                r5.L$0 = r3
                r5.label = r2
                java.lang.Object r6 = p379vd.AbstractC11596e.m25570t(r1, r6, r5)
                if (r6 != r0) goto L47
            L46:
                return r0
            L47:
                qc.q r6 = p309qc.C10786q.f26013a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt.C42251.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            InterfaceC11595d interfaceC11595d = (InterfaceC11595d) this.L$0;
            AbstractC9977s.m20287c(10);
            Object obj2 = this.L$1;
            AbstractC9977s.m20287c(10);
            InterfaceC11594c interfaceC11594c = (InterfaceC11594c) this.$transform.invoke(obj2, this);
            AbstractC9977s.m20287c(0);
            AbstractC11596e.m25570t(interfaceC11595d, interfaceC11594c, this);
            AbstractC9977s.m20287c(1);
            return C10786q.f26013a;
        }

        public final Object invoke(InterfaceC11595d interfaceC11595d, T t10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            C42251 c42251 = new C42251(this.$transform, interfaceC11588c);
            c42251.L$0 = interfaceC11595d;
            c42251.L$1 = t10;
            return c42251.invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.FlowExtKt$simpleMapLatest$1", m26211f = "FlowExt.kt", m26212l = {C7843ab.b.API_MYNA_START, C7843ab.b.API_MYNA_START}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.FlowExtKt$simpleMapLatest$1 */
    public static final class C42261 extends SuspendLambda implements InterfaceC9545q {
        final /* synthetic */ InterfaceC9544p $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42261(InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C42261> interfaceC11588c) {
            super(3, interfaceC11588c);
            this.$transform = interfaceC9544p;
        }

        @Override // p181hd.InterfaceC9545q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC11595d) obj, (InterfaceC11595d) obj2, (InterfaceC11588c<? super C10786q>) obj3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.AbstractC9924b.m20071b(r6)
                goto L45
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.L$0
                vd.d r1 = (p379vd.InterfaceC11595d) r1
                kotlin.AbstractC9924b.m20071b(r6)
                goto L39
            L22:
                kotlin.AbstractC9924b.m20071b(r6)
                java.lang.Object r6 = r5.L$0
                r1 = r6
                vd.d r1 = (p379vd.InterfaceC11595d) r1
                java.lang.Object r6 = r5.L$1
                hd.p r4 = r5.$transform
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                goto L44
            L39:
                r3 = 0
                r5.L$0 = r3
                r5.label = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L45
            L44:
                return r0
            L45:
                qc.q r6 = p309qc.C10786q.f26013a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt.C42261.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            InterfaceC11595d interfaceC11595d = (InterfaceC11595d) this.L$0;
            AbstractC9977s.m20287c(10);
            Object obj2 = this.L$1;
            AbstractC9977s.m20287c(10);
            Object objInvoke = this.$transform.invoke(obj2, this);
            AbstractC9977s.m20287c(0);
            interfaceC11595d.emit(objInvoke, this);
            AbstractC9977s.m20287c(1);
            return C10786q.f26013a;
        }

        public final Object invoke(InterfaceC11595d interfaceC11595d, T t10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            C42261 c42261 = new C42261(this.$transform, interfaceC11588c);
            c42261.L$0 = interfaceC11595d;
            c42261.L$1 = t10;
            return c42261.invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", m26211f = "FlowExt.kt", m26212l = {63}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.FlowExtKt$simpleRunningReduce$1 */
    public static final class C42271 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9545q $operation;
        final /* synthetic */ InterfaceC11594c $this_simpleRunningReduce;
        private /* synthetic */ Object L$0;
        int label;

        /* renamed from: androidx.paging.FlowExtKt$simpleRunningReduce$1$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements InterfaceC11595d {
            final /* synthetic */ InterfaceC11595d $$this$flow;
            final /* synthetic */ Ref$ObjectRef<Object> $accumulator;
            final /* synthetic */ InterfaceC9545q $operation;

            public AnonymousClass1(Ref$ObjectRef<Object> ref$ObjectRef, InterfaceC9545q interfaceC9545q, InterfaceC11595d interfaceC11595d) {
                this.$accumulator = ref$ObjectRef;
                this.$operation = interfaceC9545q;
                this.$$this$flow = interfaceC11595d;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
            
                if (r8.emit(r9, r0) != r1) goto L27;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p379vd.InterfaceC11595d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, vc.InterfaceC11588c<? super p309qc.C10786q> r9) throws java.lang.Throwable {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof androidx.paging.FlowExtKt$simpleRunningReduce$1$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r9
                    androidx.paging.FlowExtKt$simpleRunningReduce$1$1$emit$1 r0 = (androidx.paging.FlowExtKt$simpleRunningReduce$1$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.paging.FlowExtKt$simpleRunningReduce$1$1$emit$1 r0 = new androidx.paging.FlowExtKt$simpleRunningReduce$1$1$emit$1
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.result
                    java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.AbstractC9924b.m20071b(r9)
                    goto L75
                L2c:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L34:
                    java.lang.Object r8 = r0.L$0
                    kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref$ObjectRef) r8
                    kotlin.AbstractC9924b.m20071b(r9)
                    goto L5e
                L3c:
                    kotlin.AbstractC9924b.m20071b(r9)
                    kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r9 = r7.$accumulator
                    java.lang.Object r2 = r9.f23402c
                    java.lang.Object r5 = androidx.paging.FlowExtKt.access$getNULL$p()
                    if (r2 != r5) goto L4a
                    goto L61
                L4a:
                    hd.q r2 = r7.$operation
                    kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r5 = r7.$accumulator
                    java.lang.Object r5 = r5.f23402c
                    r0.L$0 = r9
                    r0.label = r4
                    java.lang.Object r8 = r2.invoke(r5, r8, r0)
                    if (r8 != r1) goto L5b
                    goto L74
                L5b:
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L5e:
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L61:
                    r9.f23402c = r8
                    vd.d r8 = r7.$$this$flow
                    kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r9 = r7.$accumulator
                    java.lang.Object r9 = r9.f23402c
                    r2 = 0
                    r0.L$0 = r2
                    r0.label = r3
                    java.lang.Object r8 = r8.emit(r9, r0)
                    if (r8 != r1) goto L75
                L74:
                    return r1
                L75:
                    qc.q r8 = p309qc.C10786q.f26013a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt.C42271.AnonymousClass1.emit(java.lang.Object, vc.c):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42271(InterfaceC11594c interfaceC11594c, InterfaceC9545q interfaceC9545q, InterfaceC11588c<? super C42271> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$this_simpleRunningReduce = interfaceC11594c;
            this.$operation = interfaceC9545q;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C42271 c42271 = new C42271(this.$this_simpleRunningReduce, this.$operation, interfaceC11588c);
            c42271.L$0 = obj;
            return c42271;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11595d interfaceC11595d = (InterfaceC11595d) this.L$0;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.f23402c = FlowExtKt.NULL;
                InterfaceC11594c interfaceC11594c = this.$this_simpleRunningReduce;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$ObjectRef, this.$operation, interfaceC11595d);
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
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11595d interfaceC11595d, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42271) create(interfaceC11595d, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.FlowExtKt$simpleScan$1", m26211f = "FlowExt.kt", m26212l = {51, 52}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.FlowExtKt$simpleScan$1 */
    public static final class C42281 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ R $initial;
        final /* synthetic */ InterfaceC9545q $operation;
        final /* synthetic */ InterfaceC11594c $this_simpleScan;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* renamed from: androidx.paging.FlowExtKt$simpleScan$1$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements InterfaceC11595d {
            final /* synthetic */ InterfaceC11595d $$this$flow;
            final /* synthetic */ Ref$ObjectRef<R> $accumulator;
            final /* synthetic */ InterfaceC9545q $operation;

            public AnonymousClass1(Ref$ObjectRef<R> ref$ObjectRef, InterfaceC9545q interfaceC9545q, InterfaceC11595d interfaceC11595d) {
                this.$accumulator = ref$ObjectRef;
                this.$operation = interfaceC9545q;
                this.$$this$flow = interfaceC11595d;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
            
                if (r8.emit(r9, r0) == r1) goto L22;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p379vd.InterfaceC11595d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, vc.InterfaceC11588c<? super p309qc.C10786q> r9) throws java.lang.Throwable {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof androidx.paging.FlowExtKt$simpleScan$1$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r9
                    androidx.paging.FlowExtKt$simpleScan$1$1$emit$1 r0 = (androidx.paging.FlowExtKt$simpleScan$1$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.paging.FlowExtKt$simpleScan$1$1$emit$1 r0 = new androidx.paging.FlowExtKt$simpleScan$1$1$emit$1
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.result
                    java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.AbstractC9924b.m20071b(r9)
                    goto L67
                L2c:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L34:
                    java.lang.Object r8 = r0.L$0
                    kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref$ObjectRef) r8
                    kotlin.AbstractC9924b.m20071b(r9)
                    goto L53
                L3c:
                    kotlin.AbstractC9924b.m20071b(r9)
                    kotlin.jvm.internal.Ref$ObjectRef<R> r9 = r7.$accumulator
                    hd.q r2 = r7.$operation
                    java.lang.Object r5 = r9.f23402c
                    r0.L$0 = r9
                    r0.label = r4
                    java.lang.Object r8 = r2.invoke(r5, r8, r0)
                    if (r8 != r1) goto L50
                    goto L66
                L50:
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L53:
                    r8.f23402c = r9
                    vd.d r8 = r7.$$this$flow
                    kotlin.jvm.internal.Ref$ObjectRef<R> r9 = r7.$accumulator
                    java.lang.Object r9 = r9.f23402c
                    r2 = 0
                    r0.L$0 = r2
                    r0.label = r3
                    java.lang.Object r8 = r8.emit(r9, r0)
                    if (r8 != r1) goto L67
                L66:
                    return r1
                L67:
                    qc.q r8 = p309qc.C10786q.f26013a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt.C42281.AnonymousClass1.emit(java.lang.Object, vc.c):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42281(R r10, InterfaceC11594c interfaceC11594c, InterfaceC9545q interfaceC9545q, InterfaceC11588c<? super C42281> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$initial = r10;
            this.$this_simpleScan = interfaceC11594c;
            this.$operation = interfaceC9545q;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C42281 c42281 = new C42281(this.$initial, this.$this_simpleScan, this.$operation, interfaceC11588c);
            c42281.L$0 = obj;
            return c42281;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
        
            if (r7.collect(r4, r6) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.AbstractC9924b.m20071b(r7)
                goto L5b
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.L$1
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                java.lang.Object r3 = r6.L$0
                vd.d r3 = (p379vd.InterfaceC11595d) r3
                kotlin.AbstractC9924b.m20071b(r7)
                goto L44
            L26:
                kotlin.AbstractC9924b.m20071b(r7)
                java.lang.Object r7 = r6.L$0
                vd.d r7 = (p379vd.InterfaceC11595d) r7
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                R r4 = r6.$initial
                r1.f23402c = r4
                r6.L$0 = r7
                r6.L$1 = r1
                r6.label = r3
                java.lang.Object r3 = r7.emit(r4, r6)
                if (r3 != r0) goto L43
                goto L5a
            L43:
                r3 = r7
            L44:
                vd.c r7 = r6.$this_simpleScan
                androidx.paging.FlowExtKt$simpleScan$1$1 r4 = new androidx.paging.FlowExtKt$simpleScan$1$1
                hd.q r5 = r6.$operation
                r4.<init>(r1, r5, r3)
                r1 = 0
                r6.L$0 = r1
                r6.L$1 = r1
                r6.label = r2
                java.lang.Object r7 = r7.collect(r4, r6)
                if (r7 != r0) goto L5b
            L5a:
                return r0
            L5b:
                qc.q r7 = p309qc.C10786q.f26013a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt.C42281.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11595d interfaceC11595d, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42281) create(interfaceC11595d, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.FlowExtKt$simpleTransformLatest$1", m26211f = "FlowExt.kt", m26212l = {80}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.FlowExtKt$simpleTransformLatest$1 */
    public static final class C42291 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC11594c $this_simpleTransformLatest;
        final /* synthetic */ InterfaceC9545q $transform;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC11829d(m26210c = "androidx.paging.FlowExtKt$simpleTransformLatest$1$1", m26211f = "FlowExt.kt", m26212l = {80}, m26213m = "invokeSuspend", m26214v = 1)
        /* renamed from: androidx.paging.FlowExtKt$simpleTransformLatest$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ ChannelFlowCollector<R> $collector;
            final /* synthetic */ InterfaceC9545q $transform;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC9545q interfaceC9545q, ChannelFlowCollector<R> channelFlowCollector, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$transform = interfaceC9545q;
                this.$collector = channelFlowCollector;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, this.$collector, interfaceC11588c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((AnonymousClass1) obj, (InterfaceC11588c<? super C10786q>) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    Object obj2 = this.L$0;
                    InterfaceC9545q interfaceC9545q = this.$transform;
                    Object obj3 = this.$collector;
                    this.label = 1;
                    if (interfaceC9545q.invoke(obj3, obj2, this) == objM25952f) {
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

            public final Object invoke(T t10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(t10, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42291(InterfaceC11594c interfaceC11594c, InterfaceC9545q interfaceC9545q, InterfaceC11588c<? super C42291> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$this_simpleTransformLatest = interfaceC11594c;
            this.$transform = interfaceC9545q;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C42291 c42291 = new C42291(this.$this_simpleTransformLatest, this.$transform, interfaceC11588c);
            c42291.L$0 = obj;
            return c42291;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SimpleProducerScope<R> simpleProducerScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42291) create(simpleProducerScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
                InterfaceC11594c interfaceC11594c = this.$this_simpleTransformLatest;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, new ChannelFlowCollector(simpleProducerScope), null);
                this.label = 1;
                if (AbstractC11596e.m25559i(interfaceC11594c, anonymousClass1, this) == objM25952f) {
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

    public static final <T1, T2, R> Object combineWithoutBatching(InterfaceC11594c interfaceC11594c, InterfaceC11594c interfaceC11594c2, InterfaceC9546r interfaceC9546r, InterfaceC11588c<? super InterfaceC11594c> interfaceC11588c) {
        return SimpleChannelFlowKt.simpleChannelFlow(new C42232(interfaceC11594c, interfaceC11594c2, interfaceC9546r, null));
    }

    public static final <T, R> InterfaceC11594c simpleFlatMapLatest(InterfaceC11594c interfaceC11594c, InterfaceC9544p transform) {
        AbstractC9979u.m20294g(interfaceC11594c, "<this>");
        AbstractC9979u.m20294g(transform, "transform");
        return simpleTransformLatest(interfaceC11594c, new C42251(transform, null));
    }

    public static final <T, R> InterfaceC11594c simpleMapLatest(InterfaceC11594c interfaceC11594c, InterfaceC9544p transform) {
        AbstractC9979u.m20294g(interfaceC11594c, "<this>");
        AbstractC9979u.m20294g(transform, "transform");
        return simpleTransformLatest(interfaceC11594c, new C42261(transform, null));
    }

    public static final <T> InterfaceC11594c simpleRunningReduce(InterfaceC11594c interfaceC11594c, InterfaceC9545q operation) {
        AbstractC9979u.m20294g(interfaceC11594c, "<this>");
        AbstractC9979u.m20294g(operation, "operation");
        return AbstractC11596e.m25531B(new C42271(interfaceC11594c, operation, null));
    }

    public static final <T, R> InterfaceC11594c simpleScan(InterfaceC11594c interfaceC11594c, R r10, InterfaceC9545q operation) {
        AbstractC9979u.m20294g(interfaceC11594c, "<this>");
        AbstractC9979u.m20294g(operation, "operation");
        return AbstractC11596e.m25531B(new C42281(r10, interfaceC11594c, operation, null));
    }

    public static final <T, R> InterfaceC11594c simpleTransformLatest(InterfaceC11594c interfaceC11594c, InterfaceC9545q transform) {
        AbstractC9979u.m20294g(interfaceC11594c, "<this>");
        AbstractC9979u.m20294g(transform, "transform");
        return SimpleChannelFlowKt.simpleChannelFlow(new C42291(interfaceC11594c, transform, null));
    }
}
