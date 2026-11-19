package androidx.paging;

import androidx.paging.PageFetcher;
import com.tencent.ijk.media.player.IjkMediaMeta;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.InterfaceC9129q;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "androidx.paging.PageFetcher$flow$1", m17801f = "PageFetcher.kt", m17802l = {136}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PageFetcher$flow$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ RemoteMediator<Key, Value> $remoteMediator;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PageFetcher<Key, Value> this$0;

    @InterfaceC9539d(m17800c = "androidx.paging.PageFetcher$flow$1$1", m17801f = "PageFetcher.kt", m17802l = {63, 63}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcher$flow$1$1 */
    public static final class C43201 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ RemoteMediatorAccessor<Key, Value> $remoteMediatorAccessor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43201(RemoteMediatorAccessor<Key, Value> remoteMediatorAccessor, InterfaceC9324c<? super C43201> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$remoteMediatorAccessor = remoteMediatorAccessor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C43201 c43201 = new C43201(this.$remoteMediatorAccessor, interfaceC9324c);
            c43201.L$0 = obj;
            return c43201;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        
            if (r7 == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        
            if (r1.emit(r7, r6) != r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
        
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
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r6.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                kotlin.AbstractC9079b.m15926b(r7)
                goto L53
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                java.lang.Object r1 = r6.L$0
                l8.d r1 = (p169l8.InterfaceC9267d) r1
                kotlin.AbstractC9079b.m15926b(r7)
                goto L3a
            L23:
                kotlin.AbstractC9079b.m15926b(r7)
                java.lang.Object r7 = r6.L$0
                r1 = r7
                l8.d r1 = (p169l8.InterfaceC9267d) r1
                androidx.paging.RemoteMediatorAccessor<Key, Value> r7 = r6.$remoteMediatorAccessor
                if (r7 == 0) goto L3d
                r6.L$0 = r1
                r6.label = r4
                java.lang.Object r7 = r7.initialize(r6)
                if (r7 != r0) goto L3a
                goto L52
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
                java.lang.Boolean r7 = p201o7.AbstractC9536a.m17796a(r4)
                r6.L$0 = r2
                r6.label = r3
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L53
            L52:
                return r0
            L53:
                h7.p r7 = p123h7.C8736p.f16368a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher$flow$1.C43201.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC9267d interfaceC9267d, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C43201) create(interfaceC9267d, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.PageFetcher$flow$1$2", m17801f = "PageFetcher.kt", m17802l = {73, IjkMediaMeta.FF_PROFILE_H264_MAIN}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcher$flow$1$2 */
    public static final class C43212 extends SuspendLambda implements InterfaceC10575q {
        final /* synthetic */ RemoteMediatorAccessor<Key, Value> $remoteMediatorAccessor;
        /* synthetic */ Object L$0;
        Object L$1;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ PageFetcher<Key, Value> this$0;

        /* renamed from: androidx.paging.PageFetcher$flow$1$2$1, reason: invalid class name */
        public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements InterfaceC10559a {
            public AnonymousClass1(Object obj) {
                super(0, obj, PageFetcher.class, "refresh", "refresh()V", 0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27208invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27208invoke() {
                ((PageFetcher) this.receiver).refresh();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43212(RemoteMediatorAccessor<Key, Value> remoteMediatorAccessor, PageFetcher<Key, Value> pageFetcher, InterfaceC9324c<? super C43212> interfaceC9324c) {
            super(3, interfaceC9324c);
            this.$remoteMediatorAccessor = remoteMediatorAccessor;
            this.this$0 = pageFetcher;
        }

        public final Object invoke(PageFetcher.GenerationInfo<Key, Value> generationInfo, boolean z10, InterfaceC9324c<? super PageFetcher.GenerationInfo<Key, Value>> interfaceC9324c) {
            C43212 c43212 = new C43212(this.$remoteMediatorAccessor, this.this$0, interfaceC9324c);
            c43212.L$0 = generationInfo;
            c43212.Z$0 = z10;
            return c43212.invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x008a A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0103  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 308
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher$flow$1.C43212.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p300x7.InterfaceC10575q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((PageFetcher.GenerationInfo) obj, ((Boolean) obj2).booleanValue(), (InterfaceC9324c) obj3);
        }
    }

    /* renamed from: androidx.paging.PageFetcher$flow$1$4 */
    public /* synthetic */ class C43224 implements InterfaceC9267d, InterfaceC9129q {
        final /* synthetic */ SimpleProducerScope<PagingData<Value>> $tmp0;

        public C43224(SimpleProducerScope<PagingData<Value>> simpleProducerScope) {
            this.$tmp0 = simpleProducerScope;
        }

        public final Object emit(PagingData<Value> pagingData, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            Object objSend = this.$tmp0.send(pagingData, interfaceC9324c);
            return objSend == AbstractC9434a.m17291f() ? objSend : C8736p.f16368a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC9267d) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return new FunctionReferenceImpl(2, this.$tmp0, SimpleProducerScope.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // p169l8.InterfaceC9267d
        public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC9324c interfaceC9324c) {
            return emit((PagingData) obj, (InterfaceC9324c<? super C8736p>) interfaceC9324c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$flow$1(RemoteMediator<Key, Value> remoteMediator, PageFetcher<Key, Value> pageFetcher, InterfaceC9324c<? super PageFetcher$flow$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$remoteMediator = remoteMediator;
        this.this$0 = pageFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        PageFetcher$flow$1 pageFetcher$flow$1 = new PageFetcher$flow$1(this.$remoteMediator, this.this$0, interfaceC9324c);
        pageFetcher$flow$1.L$0 = obj;
        return pageFetcher$flow$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(SimpleProducerScope<PagingData<Value>> simpleProducerScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((PageFetcher$flow$1) create(simpleProducerScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
            RemoteMediator<Key, Value> remoteMediator = this.$remoteMediator;
            RemoteMediatorAccessor RemoteMediatorAccessor = remoteMediator != 0 ? RemoteMediatorAccessorKt.RemoteMediatorAccessor(simpleProducerScope, remoteMediator) : null;
            InterfaceC9266c interfaceC9266cSimpleTransformLatest = FlowExtKt.simpleTransformLatest(AbstractC9268e.m17033w(FlowExtKt.simpleScan(AbstractC9268e.m17001M(((PageFetcher) this.this$0).refreshEvents.getFlow(), new C43201(RemoteMediatorAccessor, null)), null, new C43212(RemoteMediatorAccessor, this.this$0, null))), new PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(null, this.this$0, RemoteMediatorAccessor));
            C43224 c43224 = new C43224(simpleProducerScope);
            this.label = 1;
            if (interfaceC9266cSimpleTransformLatest.collect(c43224, this) == objM17291f) {
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
