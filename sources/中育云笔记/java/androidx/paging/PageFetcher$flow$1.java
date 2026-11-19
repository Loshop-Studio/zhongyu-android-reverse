package androidx.paging;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.paging.PageFetcher;
import com.alibaba.fastjson.asm.Opcodes;
import com.tendcloud.tenddata.C7843ab;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.InterfaceC9975q;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.PageFetcher$flow$1", m26211f = "PageFetcher.kt", m26212l = {234}, m26213m = "invokeSuspend", m26214v = 1)
/* loaded from: classes3.dex */
public final class PageFetcher$flow$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ RemoteMediator<Key, Value> $remoteMediator;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PageFetcher<Key, Value> this$0;

    @InterfaceC11829d(m26210c = "androidx.paging.PageFetcher$flow$1$1", m26211f = "PageFetcher.kt", m26212l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT, 63}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.PageFetcher$flow$1$1 */
    public static final class C42391 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ RemoteMediatorAccessor<Key, Value> $remoteMediatorAccessor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42391(RemoteMediatorAccessor<Key, Value> remoteMediatorAccessor, InterfaceC11588c<? super C42391> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$remoteMediatorAccessor = remoteMediatorAccessor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C42391 c42391 = new C42391(this.$remoteMediatorAccessor, interfaceC11588c);
            c42391.L$0 = obj;
            return c42391;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        
            if (r7 == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        
            if (r1.emit(r5, r6) != r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
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
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                kotlin.AbstractC9924b.m20071b(r7)
                goto L56
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                java.lang.Object r1 = r6.L$0
                vd.d r1 = (p379vd.InterfaceC11595d) r1
                kotlin.AbstractC9924b.m20071b(r7)
                goto L3a
            L23:
                kotlin.AbstractC9924b.m20071b(r7)
                java.lang.Object r7 = r6.L$0
                r1 = r7
                vd.d r1 = (p379vd.InterfaceC11595d) r1
                androidx.paging.RemoteMediatorAccessor<Key, Value> r7 = r6.$remoteMediatorAccessor
                if (r7 == 0) goto L3d
                r6.L$0 = r1
                r6.label = r4
                java.lang.Object r7 = r7.initialize(r6)
                if (r7 != r0) goto L3a
                goto L55
            L3a:
                androidx.paging.RemoteMediator$InitializeAction r7 = (androidx.paging.RemoteMediator.InitializeAction) r7
                goto L3e
            L3d:
                r7 = r2
            L3e:
                androidx.paging.RemoteMediator$InitializeAction r5 = androidx.paging.RemoteMediator.InitializeAction.LAUNCH_INITIAL_REFRESH
                if (r7 != r5) goto L43
                goto L44
            L43:
                r4 = 0
            L44:
                androidx.paging.PageFetcher$RefreshType$Initial r7 = androidx.paging.PageFetcher.RefreshType.Initial.INSTANCE
                androidx.paging.PageFetcher$LoadRequest$Refresh r5 = new androidx.paging.PageFetcher$LoadRequest$Refresh
                r5.<init>(r4, r7)
                r6.L$0 = r2
                r6.label = r3
                java.lang.Object r7 = r1.emit(r5, r6)
                if (r7 != r0) goto L56
            L55:
                return r0
            L56:
                qc.q r7 = p309qc.C10786q.f26013a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher$flow$1.C42391.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11595d interfaceC11595d, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42391) create(interfaceC11595d, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.PageFetcher$flow$1$2", m26211f = "PageFetcher.kt", m26212l = {C7843ab.b.API_MYNA_INIT, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 112, Opcodes.IF_ICMPGE, 168, 211}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.PageFetcher$flow$1$2 */
    public static final class C42402 extends SuspendLambda implements InterfaceC9545q {
        final /* synthetic */ RemoteMediatorAccessor<Key, Value> $remoteMediatorAccessor;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ PageFetcher<Key, Value> this$0;

        /* renamed from: androidx.paging.PageFetcher$flow$1$2$1, reason: invalid class name */
        public static final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements InterfaceC9529a {
            public AnonymousClass1(Object obj) {
                super(0, obj, PageFetcher.class, "refresh", "refresh(Ljava/lang/Object;)V", 0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33804invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33804invoke() {
                PageFetcher.refresh$default((PageFetcher) this.receiver, null, 1, null);
            }
        }

        /* renamed from: androidx.paging.PageFetcher$flow$1$2$7, reason: invalid class name */
        public static final /* synthetic */ class AnonymousClass7 extends AdaptedFunctionReference implements InterfaceC9529a {
            public AnonymousClass7(Object obj) {
                super(0, obj, PageFetcher.class, "refresh", "refresh(Ljava/lang/Object;)V", 0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33805invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33805invoke() {
                PageFetcher.refresh$default((PageFetcher) this.receiver, null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42402(RemoteMediatorAccessor<Key, Value> remoteMediatorAccessor, PageFetcher<Key, Value> pageFetcher, InterfaceC11588c<? super C42402> interfaceC11588c) {
            super(3, interfaceC11588c);
            this.$remoteMediatorAccessor = remoteMediatorAccessor;
            this.this$0 = pageFetcher;
        }

        @Override // p181hd.InterfaceC9545q
        public final Object invoke(PageFetcher.GenerationInfo<Key, Value> generationInfo, PageFetcher.LoadRequest loadRequest, InterfaceC11588c<? super PageFetcher.GenerationInfo<Key, Value>> interfaceC11588c) {
            C42402 c42402 = new C42402(this.$remoteMediatorAccessor, this.this$0, interfaceC11588c);
            c42402.L$0 = generationInfo;
            c42402.L$1 = loadRequest;
            return c42402.invokeSuspend(C10786q.f26013a);
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x0327  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0248  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x02b2  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x02f2 A[LOOP:0: B:95:0x02ec->B:97:0x02f2, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 980
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher$flow$1.C42402.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: androidx.paging.PageFetcher$flow$1$4 */
    public static final /* synthetic */ class C42414 implements InterfaceC11595d, InterfaceC9975q {
        final /* synthetic */ SimpleProducerScope<PagingData<Value>> $tmp0;

        public C42414(SimpleProducerScope<PagingData<Value>> simpleProducerScope) {
            this.$tmp0 = simpleProducerScope;
        }

        public final Object emit(PagingData<Value> pagingData, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            Object objSend = this.$tmp0.send(pagingData, interfaceC11588c);
            return objSend == AbstractC11725a.m25952f() ? objSend : C10786q.f26013a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC11595d) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
            return new FunctionReferenceImpl(2, this.$tmp0, SimpleProducerScope.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // p379vd.InterfaceC11595d
        public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC11588c interfaceC11588c) {
            return emit((PagingData) obj, (InterfaceC11588c<? super C10786q>) interfaceC11588c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$flow$1(RemoteMediator<Key, Value> remoteMediator, PageFetcher<Key, Value> pageFetcher, InterfaceC11588c<? super PageFetcher$flow$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$remoteMediator = remoteMediator;
        this.this$0 = pageFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        PageFetcher$flow$1 pageFetcher$flow$1 = new PageFetcher$flow$1(this.$remoteMediator, this.this$0, interfaceC11588c);
        pageFetcher$flow$1.L$0 = obj;
        return pageFetcher$flow$1;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(SimpleProducerScope<PagingData<Value>> simpleProducerScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((PageFetcher$flow$1) create(simpleProducerScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
            RemoteMediator<Key, Value> remoteMediator = this.$remoteMediator;
            RemoteMediatorAccessor RemoteMediatorAccessor = remoteMediator != 0 ? RemoteMediatorAccessorKt.RemoteMediatorAccessor(simpleProducerScope, remoteMediator) : null;
            InterfaceC11594c interfaceC11594cSimpleTransformLatest = FlowExtKt.simpleTransformLatest(AbstractC11596e.m25564n(AbstractC11596e.m25572v(FlowExtKt.simpleScan(AbstractC11596e.m25541L(((PageFetcher) this.this$0).loadRequests.getFlow(), new C42391(RemoteMediatorAccessor, null)), null, new C42402(RemoteMediatorAccessor, this.this$0, null)))), new PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(null, this.this$0, RemoteMediatorAccessor));
            C42414 c42414 = new C42414(simpleProducerScope);
            this.label = 1;
            if (interfaceC11594cSimpleTransformLatest.collect(c42414, this) == objM25952f) {
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
