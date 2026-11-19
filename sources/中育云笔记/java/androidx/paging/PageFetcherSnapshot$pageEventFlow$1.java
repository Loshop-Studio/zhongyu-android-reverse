package androidx.paging;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.fastjson.asm.Opcodes;
import com.tendcloud.tenddata.C7843ab;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC10000a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", m26211f = "PageFetcherSnapshot.kt", m26212l = {694, Opcodes.GETSTATIC, TypedValues.TransitionType.TYPE_STAGGERED}, m26213m = "invokeSuspend", m26214v = 1)
/* loaded from: classes3.dex */
public final class PageFetcherSnapshot$pageEventFlow$1 extends SuspendLambda implements InterfaceC9544p {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

    @InterfaceC11829d(m26210c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", m26211f = "PageFetcherSnapshot.kt", m26212l = {C7843ab.b.API_MYNA_STOP}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2 */
    public static final class C42542 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ SimpleProducerScope<PageEvent<Value>> $$this$cancelableChannelFlow;
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42542(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, SimpleProducerScope<PageEvent<Value>> simpleProducerScope, InterfaceC11588c<? super C42542> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = pageFetcherSnapshot;
            this.$$this$cancelableChannelFlow = simpleProducerScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C42542(this.this$0, this.$$this$cancelableChannelFlow, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11594c interfaceC11594cM25562l = AbstractC11596e.m25562l(((PageFetcherSnapshot) this.this$0).pageEventCh);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$cancelableChannelFlow);
                this.label = 1;
                if (interfaceC11594cM25562l.collect(anonymousClass1, this) == objM25952f) {
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
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42542) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements InterfaceC11595d {
            final /* synthetic */ SimpleProducerScope<PageEvent<Value>> $$this$cancelableChannelFlow;

            public AnonymousClass1(SimpleProducerScope<PageEvent<Value>> simpleProducerScope) {
                this.$$this$cancelableChannelFlow = simpleProducerScope;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(androidx.paging.PageEvent<Value> r5, vc.InterfaceC11588c<? super p309qc.C10786q> r6) throws java.lang.Throwable {
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
                    java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.AbstractC9924b.m20071b(r6)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                    goto L3f
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.AbstractC9924b.m20071b(r6)
                    androidx.paging.SimpleProducerScope<androidx.paging.PageEvent<Value>> r6 = r4.$$this$cancelableChannelFlow     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                    r0.label = r3     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                    java.lang.Object r5 = r6.send(r5, r0)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L3f
                    if (r5 != r1) goto L3f
                    return r1
                L3f:
                    qc.q r5 = p309qc.C10786q.f26013a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$1.C42542.AnonymousClass1.emit(androidx.paging.PageEvent, vc.c):java.lang.Object");
            }

            @Override // p379vd.InterfaceC11595d
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC11588c interfaceC11588c) {
                return emit((PageEvent) obj, (InterfaceC11588c<? super C10786q>) interfaceC11588c);
            }
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", m26211f = "PageFetcherSnapshot.kt", m26212l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3 */
    public static final class C42553 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC10000a $retryChannel;
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42553(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC10000a interfaceC10000a, InterfaceC11588c<? super C42553> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = pageFetcherSnapshot;
            this.$retryChannel = interfaceC10000a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C42553(this.this$0, this.$retryChannel, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11594c interfaceC11594c = ((PageFetcherSnapshot) this.this$0).retryFlow;
                final InterfaceC10000a interfaceC10000a = this.$retryChannel;
                InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.paging.PageFetcherSnapshot.pageEventFlow.1.3.1
                    @Override // p379vd.InterfaceC11595d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC11588c interfaceC11588c) {
                        return emit((C10786q) obj2, (InterfaceC11588c<? super C10786q>) interfaceC11588c);
                    }

                    public final Object emit(C10786q c10786q, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        interfaceC10000a.mo33808trySendJP2dKIU(c10786q);
                        return C10786q.f26013a;
                    }
                };
                this.label = 1;
                if (interfaceC11594c.collect(interfaceC11595d, this) == objM25952f) {
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
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42553) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", m26211f = "PageFetcherSnapshot.kt", m26212l = {112}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4 */
    public static final class C42564 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC10000a $retryChannel;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements InterfaceC11595d {
            final /* synthetic */ InterfaceC11122i0 $$this$launch;
            final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

            /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1$WhenMappings */
            public static final /* synthetic */ class WhenMappings {
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

            public AnonymousClass1(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC11122i0 interfaceC11122i0) {
                this.this$0 = pageFetcherSnapshot;
                this.$$this$launch = interfaceC11122i0;
            }

            @Override // p379vd.InterfaceC11595d
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC11588c interfaceC11588c) {
                return emit((C10786q) obj, (InterfaceC11588c<? super C10786q>) interfaceC11588c);
            }

            /* JADX WARN: Code restructure failed: missing block: B:120:0x0403, code lost:
            
                if (r1.lock(null, r13) == r0) goto L167;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x021d, code lost:
            
                if (r1.lock(null, r13) == r0) goto L167;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x02ef, code lost:
            
                if (r1.lock(null, r13) == r0) goto L167;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:106:0x0386  */
            /* JADX WARN: Removed duplicated region for block: B:107:0x038a  */
            /* JADX WARN: Removed duplicated region for block: B:116:0x03e1  */
            /* JADX WARN: Removed duplicated region for block: B:119:0x03e9  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x042d A[PHI: r1 r4 r14
              0x042d: PHI (r1v53 androidx.paging.LoadStates) = (r1v28 androidx.paging.LoadStates), (r1v60 androidx.paging.LoadStates) binds: [B:88:0x0321, B:126:0x041f] A[DONT_GENERATE, DONT_INLINE]
              0x042d: PHI (r4v52 sd.i0) = (r4v26 sd.i0), (r4v55 sd.i0) binds: [B:88:0x0321, B:126:0x041f] A[DONT_GENERATE, DONT_INLINE]
              0x042d: PHI (r14v51 androidx.paging.PageFetcherSnapshot) = (r14v28 androidx.paging.PageFetcherSnapshot), (r14v52 androidx.paging.PageFetcherSnapshot) binds: [B:88:0x0321, B:126:0x041f] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:135:0x0437  */
            /* JADX WARN: Removed duplicated region for block: B:143:0x0475  */
            /* JADX WARN: Removed duplicated region for block: B:144:0x0477  */
            /* JADX WARN: Removed duplicated region for block: B:152:0x0493  */
            /* JADX WARN: Removed duplicated region for block: B:153:0x0497  */
            /* JADX WARN: Removed duplicated region for block: B:162:0x04ea  */
            /* JADX WARN: Removed duplicated region for block: B:165:0x04ef  */
            /* JADX WARN: Removed duplicated region for block: B:172:0x0522  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x0275  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0279  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x02ce  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x02d6  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x0323  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x0366  */
            /* JADX WARN: Removed duplicated region for block: B:98:0x0368  */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [be.a] */
            /* JADX WARN: Type inference failed for: r1v14, types: [be.a] */
            /* JADX WARN: Type inference failed for: r1v2, types: [be.a] */
            /* JADX WARN: Type inference failed for: r1v3, types: [be.a] */
            /* JADX WARN: Type inference failed for: r1v39, types: [be.a] */
            /* JADX WARN: Type inference failed for: r1v68, types: [be.a] */
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
            public final java.lang.Object emit(p309qc.C10786q r13, vc.InterfaceC11588c<? super p309qc.C10786q> r14) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 1374
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$1.C42564.AnonymousClass1.emit(qc.q, vc.c):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42564(InterfaceC10000a interfaceC10000a, PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC11588c<? super C42564> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$retryChannel = interfaceC10000a;
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C42564 c42564 = new C42564(this.$retryChannel, this.this$0, interfaceC11588c);
            c42564.L$0 = obj;
            return c42564;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                InterfaceC11594c interfaceC11594cM25562l = AbstractC11596e.m25562l(this.$retryChannel);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, interfaceC11122i0);
                this.label = 1;
                if (interfaceC11594cM25562l.collect(anonymousClass1, this) == objM25952f) {
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
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42564) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$pageEventFlow$1(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC11588c<? super PageFetcherSnapshot$pageEventFlow$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        PageFetcherSnapshot$pageEventFlow$1 pageFetcherSnapshot$pageEventFlow$1 = new PageFetcherSnapshot$pageEventFlow$1(this.this$0, interfaceC11588c);
        pageFetcherSnapshot$pageEventFlow$1.L$0 = obj;
        return pageFetcherSnapshot$pageEventFlow$1;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(SimpleProducerScope<PageEvent<Value>> simpleProducerScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((PageFetcherSnapshot$pageEventFlow$1) create(simpleProducerScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
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
}
