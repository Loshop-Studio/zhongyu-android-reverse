package androidx.paging;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC9158a;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", m17801f = "PageFetcherSnapshot.kt", m17802l = {646, 168, 657}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PageFetcherSnapshot$pageEventFlow$1 extends SuspendLambda implements InterfaceC10574p {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

    @InterfaceC9539d(m17800c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", m17801f = "PageFetcherSnapshot.kt", m17802l = {TbsListener.ErrorCode.DISK_FULL}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3 */
    public static final class C43363 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC9158a $retryChannel;
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43363(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC9158a interfaceC9158a, InterfaceC9324c<? super C43363> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = pageFetcherSnapshot;
            this.$retryChannel = interfaceC9158a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C43363(this.this$0, this.$retryChannel, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C43363) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9266c interfaceC9266c = ((PageFetcherSnapshot) this.this$0).retryFlow;
                final InterfaceC9158a interfaceC9158a = this.$retryChannel;
                InterfaceC9267d interfaceC9267d = new InterfaceC9267d() { // from class: androidx.paging.PageFetcherSnapshot.pageEventFlow.1.3.1
                    public final Object emit(C8736p c8736p, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                        interfaceC9158a.mo27213trySendJP2dKIU(c8736p);
                        return C8736p.f16368a;
                    }

                    @Override // p169l8.InterfaceC9267d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC9324c interfaceC9324c) {
                        return emit((C8736p) obj2, (InterfaceC9324c<? super C8736p>) interfaceC9324c);
                    }
                };
                this.label = 1;
                if (interfaceC9266c.collect(interfaceC9267d, this) == objM17291f) {
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
    public PageFetcherSnapshot$pageEventFlow$1(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC9324c<? super PageFetcherSnapshot$pageEventFlow$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        PageFetcherSnapshot$pageEventFlow$1 pageFetcherSnapshot$pageEventFlow$1 = new PageFetcherSnapshot$pageEventFlow$1(this.this$0, interfaceC9324c);
        pageFetcherSnapshot$pageEventFlow$1.L$0 = obj;
        return pageFetcherSnapshot$pageEventFlow$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(SimpleProducerScope<PageEvent<Value>> simpleProducerScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((PageFetcherSnapshot$pageEventFlow$1) create(simpleProducerScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @InterfaceC9539d(m17800c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", m17801f = "PageFetcherSnapshot.kt", m17802l = {91}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2 */
    public static final class C43352 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ SimpleProducerScope<PageEvent<Value>> $$this$cancelableChannelFlow;
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43352(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, SimpleProducerScope<PageEvent<Value>> simpleProducerScope, InterfaceC9324c<? super C43352> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = pageFetcherSnapshot;
            this.$$this$cancelableChannelFlow = simpleProducerScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C43352(this.this$0, this.$$this$cancelableChannelFlow, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C43352) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9266c interfaceC9266cM17023m = AbstractC9268e.m17023m(((PageFetcherSnapshot) this.this$0).pageEventCh);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$cancelableChannelFlow);
                this.label = 1;
                if (interfaceC9266cM17023m.collect(anonymousClass1, this) == objM17291f) {
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

        /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements InterfaceC9267d {
            final /* synthetic */ SimpleProducerScope<PageEvent<Value>> $$this$cancelableChannelFlow;

            public AnonymousClass1(SimpleProducerScope<PageEvent<Value>> simpleProducerScope) {
                this.$$this$cancelableChannelFlow = simpleProducerScope;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(androidx.paging.PageEvent<Value> r5, p179m7.InterfaceC9324c<? super p123h7.C8736p> r6) throws java.lang.Throwable {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r6
                    androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 r0 = (androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 r0 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.AbstractC9079b.m15926b(r6)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                    goto L3f
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.AbstractC9079b.m15926b(r6)
                    androidx.paging.SimpleProducerScope<androidx.paging.PageEvent<Value>> r6 = r4.$$this$cancelableChannelFlow     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                    r0.label = r3     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                    java.lang.Object r5 = r6.send(r5, r0)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                    if (r5 != r1) goto L3f
                    return r1
                L3f:
                    h7.p r5 = p123h7.C8736p.f16368a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$1.C43352.AnonymousClass1.emit(androidx.paging.PageEvent, m7.c):java.lang.Object");
            }

            @Override // p169l8.InterfaceC9267d
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC9324c interfaceC9324c) {
                return emit((PageEvent) obj, (InterfaceC9324c<? super C8736p>) interfaceC9324c);
            }
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", m17801f = "PageFetcherSnapshot.kt", m17802l = {110}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4 */
    public static final class C43374 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC9158a $retryChannel;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43374(InterfaceC9158a interfaceC9158a, PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC9324c<? super C43374> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$retryChannel = interfaceC9158a;
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C43374 c43374 = new C43374(this.$retryChannel, this.this$0, interfaceC9324c);
            c43374.L$0 = obj;
            return c43374;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C43374) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
                InterfaceC9266c interfaceC9266cM17023m = AbstractC9268e.m17023m(this.$retryChannel);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, interfaceC8822b0);
                this.label = 1;
                if (interfaceC9266cM17023m.collect(anonymousClass1, this) == objM17291f) {
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

        /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements InterfaceC9267d {
            final /* synthetic */ InterfaceC8822b0 $$this$launch;
            final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

            /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LoadType.values().length];
                    try {
                        iArr[LoadType.REFRESH.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public AnonymousClass1(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC8822b0 interfaceC8822b0) {
                this.this$0 = pageFetcherSnapshot;
                this.$$this$launch = interfaceC8822b0;
            }

            /* JADX WARN: Code restructure failed: missing block: B:121:0x040a, code lost:
            
                if (r1.lock(null, r13) == r0) goto L168;
             */
            /* JADX WARN: Code restructure failed: missing block: B:75:0x02f6, code lost:
            
                if (r1.lock(null, r13) == r0) goto L168;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:107:0x038d  */
            /* JADX WARN: Removed duplicated region for block: B:108:0x0391  */
            /* JADX WARN: Removed duplicated region for block: B:117:0x03e8  */
            /* JADX WARN: Removed duplicated region for block: B:120:0x03f0  */
            /* JADX WARN: Removed duplicated region for block: B:134:0x0434 A[PHI: r1 r4 r14
              0x0434: PHI (r1v53 androidx.paging.LoadStates) = (r1v28 androidx.paging.LoadStates), (r1v60 androidx.paging.LoadStates) binds: [B:89:0x0328, B:127:0x0426] A[DONT_GENERATE, DONT_INLINE]
              0x0434: PHI (r4v52 i8.b0) = (r4v26 i8.b0), (r4v55 i8.b0) binds: [B:89:0x0328, B:127:0x0426] A[DONT_GENERATE, DONT_INLINE]
              0x0434: PHI (r14v51 androidx.paging.PageFetcherSnapshot) = (r14v28 androidx.paging.PageFetcherSnapshot), (r14v52 androidx.paging.PageFetcherSnapshot) binds: [B:89:0x0328, B:127:0x0426] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:136:0x043e  */
            /* JADX WARN: Removed duplicated region for block: B:144:0x047c  */
            /* JADX WARN: Removed duplicated region for block: B:145:0x047e  */
            /* JADX WARN: Removed duplicated region for block: B:153:0x049a  */
            /* JADX WARN: Removed duplicated region for block: B:154:0x049e  */
            /* JADX WARN: Removed duplicated region for block: B:163:0x04f1  */
            /* JADX WARN: Removed duplicated region for block: B:166:0x04f6  */
            /* JADX WARN: Removed duplicated region for block: B:173:0x0529  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x025b  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x026e  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x027c  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0280  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x02d5  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x02dd  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x032a  */
            /* JADX WARN: Removed duplicated region for block: B:98:0x036d  */
            /* JADX WARN: Removed duplicated region for block: B:99:0x036f  */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [r8.a] */
            /* JADX WARN: Type inference failed for: r1v14, types: [r8.a] */
            /* JADX WARN: Type inference failed for: r1v2, types: [r8.a] */
            /* JADX WARN: Type inference failed for: r1v3, types: [r8.a] */
            /* JADX WARN: Type inference failed for: r1v39, types: [r8.a] */
            /* JADX WARN: Type inference failed for: r1v68, types: [r8.a] */
            /* JADX WARN: Type inference failed for: r1v86 */
            /* JADX WARN: Type inference failed for: r1v87 */
            /* JADX WARN: Type inference failed for: r1v89 */
            /* JADX WARN: Type inference failed for: r1v90 */
            /* JADX WARN: Type inference failed for: r1v92 */
            /* JADX WARN: Type inference failed for: r1v93 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(p123h7.C8736p r13, p179m7.InterfaceC9324c<? super p123h7.C8736p> r14) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 1382
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$1.C43374.AnonymousClass1.emit(h7.p, m7.c):java.lang.Object");
            }

            @Override // p169l8.InterfaceC9267d
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC9324c interfaceC9324c) {
                return emit((C8736p) obj, (InterfaceC9324c<? super C8736p>) interfaceC9324c);
            }
        }
    }
}
