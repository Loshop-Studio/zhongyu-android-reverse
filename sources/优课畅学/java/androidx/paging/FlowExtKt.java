package androidx.paging;

import androidx.annotation.RestrictTo;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.smtt.sdk.TbsListener;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC9212n;
import kotlinx.coroutines.JobKt__JobKt;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8878u;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;
import p300x7.InterfaceC10576r;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class FlowExtKt {
    private static final Object NULL = new Object();

    @InterfaceC9539d(m17800c = "androidx.paging.FlowExtKt$combineWithoutBatching$2", m17801f = "FlowExt.kt", m17802l = {161}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.FlowExtKt$combineWithoutBatching$2 */
    public static final class C42992 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC9266c $otherFlow;
        final /* synthetic */ InterfaceC9266c $this_combineWithoutBatching;
        final /* synthetic */ InterfaceC10576r $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* renamed from: androidx.paging.FlowExtKt$combineWithoutBatching$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends Lambda implements InterfaceC10559a {
            final /* synthetic */ InterfaceC8878u $parentJob;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC8878u interfaceC8878u) {
                super(0);
                this.$parentJob = interfaceC8878u;
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27204invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27204invoke() {
                InterfaceC9212n.a.m16777a(this.$parentJob, null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42992(InterfaceC9266c interfaceC9266c, InterfaceC9266c interfaceC9266c2, InterfaceC10576r interfaceC10576r, InterfaceC9324c<? super C42992> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$this_combineWithoutBatching = interfaceC9266c;
            this.$otherFlow = interfaceC9266c2;
            this.$transform = interfaceC10576r;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C42992 c42992 = new C42992(this.$this_combineWithoutBatching, this.$otherFlow, this.$transform, interfaceC9324c);
            c42992.L$0 = obj;
            return c42992;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(SimpleProducerScope<R> simpleProducerScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C42992) create(simpleProducerScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
                AtomicInteger atomicInteger = new AtomicInteger(2);
                UnbatchedFlowCombiner unbatchedFlowCombiner = new UnbatchedFlowCombiner(new FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(simpleProducerScope, this.$transform, null));
                InterfaceC8878u interfaceC8878uM16233b = JobKt__JobKt.m16233b(null, 1, null);
                int i11 = 0;
                InterfaceC9266c[] interfaceC9266cArr = {this.$this_combineWithoutBatching, this.$otherFlow};
                int i12 = 0;
                while (i12 < 2) {
                    SimpleProducerScope simpleProducerScope2 = simpleProducerScope;
                    simpleProducerScope = simpleProducerScope2;
                    AbstractC8839h.m14861d(simpleProducerScope, interfaceC8878uM16233b, null, new FlowExtKt$combineWithoutBatching$2$1$1(interfaceC9266cArr[i12], atomicInteger, simpleProducerScope2, unbatchedFlowCombiner, i11, null), 2, null);
                    i12++;
                    atomicInteger = atomicInteger;
                    i11++;
                    unbatchedFlowCombiner = unbatchedFlowCombiner;
                }
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(interfaceC8878uM16233b);
                this.label = 1;
                if (simpleProducerScope.awaitClose(anonymousClass2, this) == objM17291f) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
            AtomicInteger atomicInteger = new AtomicInteger(2);
            UnbatchedFlowCombiner unbatchedFlowCombiner = new UnbatchedFlowCombiner(new FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(simpleProducerScope, this.$transform, null));
            InterfaceC8878u interfaceC8878uM16233b = JobKt__JobKt.m16233b(null, 1, null);
            InterfaceC9266c[] interfaceC9266cArr = {this.$this_combineWithoutBatching, this.$otherFlow};
            int i10 = 0;
            int i11 = 0;
            while (i11 < 2) {
                int i12 = i10;
                InterfaceC9266c interfaceC9266c = interfaceC9266cArr[i11];
                int i13 = i12 + 1;
                int iIntValue = Integer.valueOf(i12).intValue();
                SimpleProducerScope simpleProducerScope2 = simpleProducerScope;
                simpleProducerScope = simpleProducerScope2;
                AtomicInteger atomicInteger2 = atomicInteger;
                AbstractC8839h.m14861d(simpleProducerScope, interfaceC8878uM16233b, null, new FlowExtKt$combineWithoutBatching$2$1$1(interfaceC9266c, atomicInteger, simpleProducerScope2, unbatchedFlowCombiner, iIntValue, null), 2, null);
                C8736p c8736p = C8736p.f16368a;
                i11++;
                atomicInteger = atomicInteger2;
                i10 = i13;
                unbatchedFlowCombiner = unbatchedFlowCombiner;
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(interfaceC8878uM16233b);
            AbstractC9131s.m16126c(0);
            simpleProducerScope.awaitClose(anonymousClass2, this);
            AbstractC9131s.m16126c(1);
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.FlowExtKt$simpleFlatMapLatest$1", m17801f = "FlowExt.kt", m17802l = {98, 98}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.FlowExtKt$simpleFlatMapLatest$1 */
    public static final class C43011 extends SuspendLambda implements InterfaceC10575q {
        final /* synthetic */ InterfaceC10574p $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43011(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C43011> interfaceC9324c) {
            super(3, interfaceC9324c);
            this.$transform = interfaceC10574p;
        }

        @Override // p300x7.InterfaceC10575q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC9267d) obj, (InterfaceC9267d) obj2, (InterfaceC9324c<? super C8736p>) obj3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (p169l8.AbstractC9268e.m17031u(r1, (p169l8.InterfaceC9266c) r6, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.AbstractC9079b.m15926b(r6)
                goto L47
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.L$0
                l8.d r1 = (p169l8.InterfaceC9267d) r1
                kotlin.AbstractC9079b.m15926b(r6)
                goto L39
            L22:
                kotlin.AbstractC9079b.m15926b(r6)
                java.lang.Object r6 = r5.L$0
                r1 = r6
                l8.d r1 = (p169l8.InterfaceC9267d) r1
                java.lang.Object r6 = r5.L$1
                x7.p r4 = r5.$transform
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                goto L46
            L39:
                l8.c r6 = (p169l8.InterfaceC9266c) r6
                r3 = 0
                r5.L$0 = r3
                r5.label = r2
                java.lang.Object r6 = p169l8.AbstractC9268e.m17031u(r1, r6, r5)
                if (r6 != r0) goto L47
            L46:
                return r0
            L47:
                h7.p r6 = p123h7.C8736p.f16368a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt.C43011.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            InterfaceC9267d interfaceC9267d = (InterfaceC9267d) this.L$0;
            InterfaceC9266c interfaceC9266c = (InterfaceC9266c) this.$transform.invoke(this.L$1, this);
            AbstractC9131s.m16126c(0);
            AbstractC9268e.m17031u(interfaceC9267d, interfaceC9266c, this);
            AbstractC9131s.m16126c(1);
            return C8736p.f16368a;
        }

        public final Object invoke(InterfaceC9267d interfaceC9267d, T t10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            C43011 c43011 = new C43011(this.$transform, interfaceC9324c);
            c43011.L$0 = interfaceC9267d;
            c43011.L$1 = t10;
            return c43011.invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.FlowExtKt$simpleMapLatest$1", m17801f = "FlowExt.kt", m17802l = {TbsListener.ErrorCode.DISK_FULL, TbsListener.ErrorCode.DISK_FULL}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.FlowExtKt$simpleMapLatest$1 */
    public static final class C43021 extends SuspendLambda implements InterfaceC10575q {
        final /* synthetic */ InterfaceC10574p $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43021(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C43021> interfaceC9324c) {
            super(3, interfaceC9324c);
            this.$transform = interfaceC10574p;
        }

        @Override // p300x7.InterfaceC10575q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC9267d) obj, (InterfaceC9267d) obj2, (InterfaceC9324c<? super C8736p>) obj3);
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
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.AbstractC9079b.m15926b(r6)
                goto L45
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.L$0
                l8.d r1 = (p169l8.InterfaceC9267d) r1
                kotlin.AbstractC9079b.m15926b(r6)
                goto L39
            L22:
                kotlin.AbstractC9079b.m15926b(r6)
                java.lang.Object r6 = r5.L$0
                r1 = r6
                l8.d r1 = (p169l8.InterfaceC9267d) r1
                java.lang.Object r6 = r5.L$1
                x7.p r4 = r5.$transform
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
                h7.p r6 = p123h7.C8736p.f16368a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt.C43021.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            InterfaceC9267d interfaceC9267d = (InterfaceC9267d) this.L$0;
            Object objInvoke = this.$transform.invoke(this.L$1, this);
            AbstractC9131s.m16126c(0);
            interfaceC9267d.emit(objInvoke, this);
            AbstractC9131s.m16126c(1);
            return C8736p.f16368a;
        }

        public final Object invoke(InterfaceC9267d interfaceC9267d, T t10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            C43021 c43021 = new C43021(this.$transform, interfaceC9324c);
            c43021.L$0 = interfaceC9267d;
            c43021.L$1 = t10;
            return c43021.invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", m17801f = "FlowExt.kt", m17802l = {68}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.FlowExtKt$simpleRunningReduce$1 */
    public static final class C43031 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10575q $operation;
        final /* synthetic */ InterfaceC9266c $this_simpleRunningReduce;
        private /* synthetic */ Object L$0;
        int label;

        /* renamed from: androidx.paging.FlowExtKt$simpleRunningReduce$1$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements InterfaceC9267d {
            final /* synthetic */ InterfaceC9267d $$this$flow;
            final /* synthetic */ Ref$ObjectRef<Object> $accumulator;
            final /* synthetic */ InterfaceC10575q $operation;

            public AnonymousClass1(Ref$ObjectRef<Object> ref$ObjectRef, InterfaceC10575q interfaceC10575q, InterfaceC9267d interfaceC9267d) {
                this.$accumulator = ref$ObjectRef;
                this.$operation = interfaceC10575q;
                this.$$this$flow = interfaceC9267d;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
            
                if (r8.emit(r9, r0) != r1) goto L27;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p169l8.InterfaceC9267d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, p179m7.InterfaceC9324c<? super p123h7.C8736p> r9) throws java.lang.Throwable {
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
                    java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L40
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.AbstractC9079b.m15926b(r9)
                    goto L7f
                L2c:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L34:
                    java.lang.Object r8 = r0.L$1
                    kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref$ObjectRef) r8
                    java.lang.Object r2 = r0.L$0
                    androidx.paging.FlowExtKt$simpleRunningReduce$1$1 r2 = (androidx.paging.FlowExtKt.C43031.AnonymousClass1) r2
                    kotlin.AbstractC9079b.m15926b(r9)
                    goto L66
                L40:
                    kotlin.AbstractC9079b.m15926b(r9)
                    kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r9 = r7.$accumulator
                    java.lang.Object r2 = r9.f17473a
                    java.lang.Object r5 = androidx.paging.FlowExtKt.access$getNULL$p()
                    if (r2 != r5) goto L4f
                    r2 = r7
                    goto L69
                L4f:
                    x7.q r2 = r7.$operation
                    kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r5 = r7.$accumulator
                    java.lang.Object r5 = r5.f17473a
                    r0.L$0 = r7
                    r0.L$1 = r9
                    r0.label = r4
                    java.lang.Object r8 = r2.invoke(r5, r8, r0)
                    if (r8 != r1) goto L62
                    goto L7e
                L62:
                    r2 = r9
                    r9 = r8
                    r8 = r2
                    r2 = r7
                L66:
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L69:
                    r9.f17473a = r8
                    l8.d r8 = r2.$$this$flow
                    kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r9 = r2.$accumulator
                    java.lang.Object r9 = r9.f17473a
                    r2 = 0
                    r0.L$0 = r2
                    r0.L$1 = r2
                    r0.label = r3
                    java.lang.Object r8 = r8.emit(r9, r0)
                    if (r8 != r1) goto L7f
                L7e:
                    return r1
                L7f:
                    h7.p r8 = p123h7.C8736p.f16368a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt.C43031.AnonymousClass1.emit(java.lang.Object, m7.c):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43031(InterfaceC9266c interfaceC9266c, InterfaceC10575q interfaceC10575q, InterfaceC9324c<? super C43031> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$this_simpleRunningReduce = interfaceC9266c;
            this.$operation = interfaceC10575q;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C43031 c43031 = new C43031(this.$this_simpleRunningReduce, this.$operation, interfaceC9324c);
            c43031.L$0 = obj;
            return c43031;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9267d interfaceC9267d = (InterfaceC9267d) this.L$0;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.f17473a = FlowExtKt.NULL;
                InterfaceC9266c interfaceC9266c = this.$this_simpleRunningReduce;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$ObjectRef, this.$operation, interfaceC9267d);
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
            return C8736p.f16368a;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC9267d interfaceC9267d, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C43031) create(interfaceC9267d, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.FlowExtKt$simpleScan$1", m17801f = "FlowExt.kt", m17802l = {54, 55}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.FlowExtKt$simpleScan$1 */
    public static final class C43041 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ R $initial;
        final /* synthetic */ InterfaceC10575q $operation;
        final /* synthetic */ InterfaceC9266c $this_simpleScan;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* renamed from: androidx.paging.FlowExtKt$simpleScan$1$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements InterfaceC9267d {
            final /* synthetic */ InterfaceC9267d $$this$flow;
            final /* synthetic */ Ref$ObjectRef<R> $accumulator;
            final /* synthetic */ InterfaceC10575q $operation;

            public AnonymousClass1(Ref$ObjectRef<R> ref$ObjectRef, InterfaceC10575q interfaceC10575q, InterfaceC9267d interfaceC9267d) {
                this.$accumulator = ref$ObjectRef;
                this.$operation = interfaceC10575q;
                this.$$this$flow = interfaceC9267d;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
            
                if (r7.emit(r8, r0) == r1) goto L22;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p169l8.InterfaceC9267d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r7, p179m7.InterfaceC9324c<? super p123h7.C8736p> r8) throws java.lang.Throwable {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof androidx.paging.FlowExtKt$simpleScan$1$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r8
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
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L40
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.AbstractC9079b.m15926b(r8)
                    goto L70
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.L$1
                    kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
                    java.lang.Object r2 = r0.L$0
                    androidx.paging.FlowExtKt$simpleScan$1$1 r2 = (androidx.paging.FlowExtKt.C43041.AnonymousClass1) r2
                    kotlin.AbstractC9079b.m15926b(r8)
                    goto L5a
                L40:
                    kotlin.AbstractC9079b.m15926b(r8)
                    kotlin.jvm.internal.Ref$ObjectRef<R> r8 = r6.$accumulator
                    x7.q r2 = r6.$operation
                    java.lang.Object r5 = r8.f17473a
                    r0.L$0 = r6
                    r0.L$1 = r8
                    r0.label = r4
                    java.lang.Object r7 = r2.invoke(r5, r7, r0)
                    if (r7 != r1) goto L56
                    goto L6f
                L56:
                    r2 = r8
                    r8 = r7
                    r7 = r2
                    r2 = r6
                L5a:
                    r7.f17473a = r8
                    l8.d r7 = r2.$$this$flow
                    kotlin.jvm.internal.Ref$ObjectRef<R> r8 = r2.$accumulator
                    java.lang.Object r8 = r8.f17473a
                    r2 = 0
                    r0.L$0 = r2
                    r0.L$1 = r2
                    r0.label = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L70
                L6f:
                    return r1
                L70:
                    h7.p r7 = p123h7.C8736p.f16368a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt.C43041.AnonymousClass1.emit(java.lang.Object, m7.c):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43041(R r10, InterfaceC9266c interfaceC9266c, InterfaceC10575q interfaceC10575q, InterfaceC9324c<? super C43041> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$initial = r10;
            this.$this_simpleScan = interfaceC9266c;
            this.$operation = interfaceC10575q;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C43041 c43041 = new C43041(this.$initial, this.$this_simpleScan, this.$operation, interfaceC9324c);
            c43041.L$0 = obj;
            return c43041;
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
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.AbstractC9079b.m15926b(r7)
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
                l8.d r3 = (p169l8.InterfaceC9267d) r3
                kotlin.AbstractC9079b.m15926b(r7)
                goto L44
            L26:
                kotlin.AbstractC9079b.m15926b(r7)
                java.lang.Object r7 = r6.L$0
                l8.d r7 = (p169l8.InterfaceC9267d) r7
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                R r4 = r6.$initial
                r1.f17473a = r4
                r6.L$0 = r7
                r6.L$1 = r1
                r6.label = r3
                java.lang.Object r3 = r7.emit(r4, r6)
                if (r3 != r0) goto L43
                goto L5a
            L43:
                r3 = r7
            L44:
                l8.c r7 = r6.$this_simpleScan
                androidx.paging.FlowExtKt$simpleScan$1$1 r4 = new androidx.paging.FlowExtKt$simpleScan$1$1
                x7.q r5 = r6.$operation
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
                h7.p r7 = p123h7.C8736p.f16368a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt.C43041.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC9267d interfaceC9267d, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C43041) create(interfaceC9267d, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.FlowExtKt$simpleTransformLatest$1", m17801f = "FlowExt.kt", m17802l = {IjkMediaMeta.FF_PROFILE_H264_EXTENDED}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.FlowExtKt$simpleTransformLatest$1 */
    public static final class C43051 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC9266c $this_simpleTransformLatest;
        final /* synthetic */ InterfaceC10575q $transform;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC9539d(m17800c = "androidx.paging.FlowExtKt$simpleTransformLatest$1$1", m17801f = "FlowExt.kt", m17802l = {89}, m17803m = "invokeSuspend")
        /* renamed from: androidx.paging.FlowExtKt$simpleTransformLatest$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ ChannelFlowCollector<R> $collector;
            final /* synthetic */ InterfaceC10575q $transform;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC10575q interfaceC10575q, ChannelFlowCollector<R> channelFlowCollector, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.$transform = interfaceC10575q;
                this.$collector = channelFlowCollector;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, this.$collector, interfaceC9324c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((AnonymousClass1) obj, (InterfaceC9324c<? super C8736p>) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    Object obj2 = this.L$0;
                    InterfaceC10575q interfaceC10575q = this.$transform;
                    Object obj3 = this.$collector;
                    this.label = 1;
                    if (interfaceC10575q.invoke(obj3, obj2, this) == objM17291f) {
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

            public final Object invoke(T t10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass1) create(t10, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43051(InterfaceC9266c interfaceC9266c, InterfaceC10575q interfaceC10575q, InterfaceC9324c<? super C43051> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$this_simpleTransformLatest = interfaceC9266c;
            this.$transform = interfaceC10575q;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C43051 c43051 = new C43051(this.$this_simpleTransformLatest, this.$transform, interfaceC9324c);
            c43051.L$0 = obj;
            return c43051;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(SimpleProducerScope<R> simpleProducerScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C43051) create(simpleProducerScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
                InterfaceC9266c interfaceC9266c = this.$this_simpleTransformLatest;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, new ChannelFlowCollector(simpleProducerScope), null);
                this.label = 1;
                if (AbstractC9268e.m17019i(interfaceC9266c, anonymousClass1, this) == objM17291f) {
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

    public static final <T1, T2, R> Object combineWithoutBatching(InterfaceC9266c interfaceC9266c, InterfaceC9266c interfaceC9266c2, InterfaceC10576r interfaceC10576r, InterfaceC9324c<? super InterfaceC9266c> interfaceC9324c) {
        return SimpleChannelFlowKt.simpleChannelFlow(new C42992(interfaceC9266c, interfaceC9266c2, interfaceC10576r, null));
    }

    public static final <T, R> InterfaceC9266c simpleFlatMapLatest(InterfaceC9266c interfaceC9266c, InterfaceC10574p transform) {
        AbstractC9133u.m16133g(interfaceC9266c, "<this>");
        AbstractC9133u.m16133g(transform, "transform");
        return simpleTransformLatest(interfaceC9266c, new C43011(transform, null));
    }

    public static final <T, R> InterfaceC9266c simpleMapLatest(InterfaceC9266c interfaceC9266c, InterfaceC10574p transform) {
        AbstractC9133u.m16133g(interfaceC9266c, "<this>");
        AbstractC9133u.m16133g(transform, "transform");
        return simpleTransformLatest(interfaceC9266c, new C43021(transform, null));
    }

    public static final <T> InterfaceC9266c simpleRunningReduce(InterfaceC9266c interfaceC9266c, InterfaceC10575q operation) {
        AbstractC9133u.m16133g(interfaceC9266c, "<this>");
        AbstractC9133u.m16133g(operation, "operation");
        return AbstractC9268e.m16990B(new C43031(interfaceC9266c, operation, null));
    }

    public static final <T, R> InterfaceC9266c simpleScan(InterfaceC9266c interfaceC9266c, R r10, InterfaceC10575q operation) {
        AbstractC9133u.m16133g(interfaceC9266c, "<this>");
        AbstractC9133u.m16133g(operation, "operation");
        return AbstractC9268e.m16990B(new C43041(r10, interfaceC9266c, operation, null));
    }

    public static final <T, R> InterfaceC9266c simpleTransformLatest(InterfaceC9266c interfaceC9266c, InterfaceC10575q transform) {
        AbstractC9133u.m16133g(interfaceC9266c, "<this>");
        AbstractC9133u.m16133g(transform, "transform");
        return SimpleChannelFlowKt.simpleChannelFlow(new C43051(interfaceC9266c, transform, null));
    }
}
