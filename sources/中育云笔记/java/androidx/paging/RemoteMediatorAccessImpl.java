package androidx.paging;

import androidx.paging.AccessorState;
import androidx.paging.LoadState;
import androidx.paging.RemoteMediator;
import androidx.paging.RemoteMediatorAccessImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$BooleanRef;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11612u;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
final class RemoteMediatorAccessImpl<Key, Value> implements RemoteMediatorAccessor<Key, Value> {
    public static final Companion Companion = new Companion(null);
    private static final int PRIORITY_APPEND_PREPEND = 1;
    private static final int PRIORITY_REFRESH = 2;
    private final AccessorStateHolder<Key, Value> accessorState;
    private final SingleRunner isolationRunner;
    private final RemoteMediator<Key, Value> remoteMediator;
    private final InterfaceC11122i0 scope;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

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

    @InterfaceC11829d(m26210c = "androidx.paging.RemoteMediatorAccessImpl", m26211f = "RemoteMediatorAccessor.kt", m26212l = {417}, m26213m = "initialize", m26214v = 1)
    /* renamed from: androidx.paging.RemoteMediatorAccessImpl$initialize$1 */
    public static final class C42811 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42811(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, InterfaceC11588c<? super C42811> interfaceC11588c) {
            super(interfaceC11588c);
            this.this$0 = remoteMediatorAccessImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.initialize(this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1", m26211f = "RemoteMediatorAccessor.kt", m26212l = {363}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1 */
    public static final class C42821 extends SuspendLambda implements InterfaceC9544p {
        int label;
        final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

        @InterfaceC11829d(m26210c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1", m26211f = "RemoteMediatorAccessor.kt", m26212l = {367}, m26213m = "invokeSuspend", m26214v = 1)
        /* renamed from: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9540l {
            Object L$0;
            int label;
            final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(1, interfaceC11588c);
                this.this$0 = remoteMediatorAccessImpl;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C10786q invokeSuspend$lambda$1(LoadType loadType, RemoteMediator.MediatorResult mediatorResult, AccessorState accessorState) {
                accessorState.clearPendingRequest(loadType);
                if (((RemoteMediator.MediatorResult.Success) mediatorResult).endOfPaginationReached()) {
                    accessorState.setBlockState(loadType, AccessorState.BlockState.COMPLETED);
                }
                return C10786q.f26013a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C10786q invokeSuspend$lambda$2(LoadType loadType, RemoteMediator.MediatorResult mediatorResult, AccessorState accessorState) {
                accessorState.clearPendingRequest(loadType);
                accessorState.setError(loadType, new LoadState.Error(((RemoteMediator.MediatorResult.Error) mediatorResult).getThrowable()));
                return C10786q.f26013a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass1(this.this$0, interfaceC11588c);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004e -> B:16:0x0051). Please report as a decompilation issue!!! */
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
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r5.L$0
                    androidx.paging.LoadType r1 = (androidx.paging.LoadType) r1
                    kotlin.AbstractC9924b.m20071b(r6)
                    goto L51
                L13:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1b:
                    kotlin.AbstractC9924b.m20071b(r6)
                L1e:
                    androidx.paging.RemoteMediatorAccessImpl<Key, Value> r6 = r5.this$0
                    androidx.paging.AccessorStateHolder r6 = androidx.paging.RemoteMediatorAccessImpl.access$getAccessorState$p(r6)
                    androidx.paging.i1 r1 = new androidx.paging.i1
                    r1.<init>()
                    java.lang.Object r6 = r6.use(r1)
                    kotlin.Pair r6 = (kotlin.Pair) r6
                    if (r6 != 0) goto L34
                    qc.q r6 = p309qc.C10786q.f26013a
                    return r6
                L34:
                    java.lang.Object r1 = r6.m20048a()
                    androidx.paging.LoadType r1 = (androidx.paging.LoadType) r1
                    java.lang.Object r6 = r6.m20049c()
                    androidx.paging.PagingState r6 = (androidx.paging.PagingState) r6
                    androidx.paging.RemoteMediatorAccessImpl<Key, Value> r3 = r5.this$0
                    androidx.paging.RemoteMediator r3 = androidx.paging.RemoteMediatorAccessImpl.access$getRemoteMediator$p(r3)
                    r5.L$0 = r1
                    r5.label = r2
                    java.lang.Object r6 = r3.load(r1, r6, r5)
                    if (r6 != r0) goto L51
                    return r0
                L51:
                    androidx.paging.RemoteMediator$MediatorResult r6 = (androidx.paging.RemoteMediator.MediatorResult) r6
                    boolean r3 = r6 instanceof androidx.paging.RemoteMediator.MediatorResult.Success
                    if (r3 == 0) goto L66
                    androidx.paging.RemoteMediatorAccessImpl<Key, Value> r3 = r5.this$0
                    androidx.paging.AccessorStateHolder r3 = androidx.paging.RemoteMediatorAccessImpl.access$getAccessorState$p(r3)
                    androidx.paging.j1 r4 = new androidx.paging.j1
                    r4.<init>()
                    r3.use(r4)
                    goto L1e
                L66:
                    boolean r3 = r6 instanceof androidx.paging.RemoteMediator.MediatorResult.Error
                    if (r3 == 0) goto L79
                    androidx.paging.RemoteMediatorAccessImpl<Key, Value> r3 = r5.this$0
                    androidx.paging.AccessorStateHolder r3 = androidx.paging.RemoteMediatorAccessImpl.access$getAccessorState$p(r3)
                    androidx.paging.k1 r4 = new androidx.paging.k1
                    r4.<init>()
                    r3.use(r4)
                    goto L1e
                L79:
                    kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                    r6.<init>()
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.C42821.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p181hd.InterfaceC9540l
            public final Object invoke(InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42821(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, InterfaceC11588c<? super C42821> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = remoteMediatorAccessImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C42821(this.this$0, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                SingleRunner singleRunner = ((RemoteMediatorAccessImpl) this.this$0).isolationRunner;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (singleRunner.runInIsolation(1, anonymousClass1, this) == objM25952f) {
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
            return ((C42821) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1", m26211f = "RemoteMediatorAccessor.kt", m26212l = {288}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1 */
    public static final class C42831 extends SuspendLambda implements InterfaceC9544p {
        Object L$0;
        int label;
        final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

        @InterfaceC11829d(m26210c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1", m26211f = "RemoteMediatorAccessor.kt", m26212l = {291}, m26213m = "invokeSuspend", m26214v = 1)
        /* renamed from: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9540l {
            final /* synthetic */ Ref$BooleanRef $launchAppendPrepend;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, Ref$BooleanRef ref$BooleanRef, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(1, interfaceC11588c);
                this.this$0 = remoteMediatorAccessImpl;
                this.$launchAppendPrepend = ref$BooleanRef;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$1$0(RemoteMediator.MediatorResult mediatorResult, AccessorState accessorState) {
                LoadType loadType = LoadType.REFRESH;
                accessorState.clearPendingRequest(loadType);
                if (((RemoteMediator.MediatorResult.Success) mediatorResult).endOfPaginationReached()) {
                    AccessorState.BlockState blockState = AccessorState.BlockState.COMPLETED;
                    accessorState.setBlockState(loadType, blockState);
                    accessorState.setBlockState(LoadType.PREPEND, blockState);
                    accessorState.setBlockState(LoadType.APPEND, blockState);
                    accessorState.clearPendingRequests();
                } else {
                    LoadType loadType2 = LoadType.PREPEND;
                    AccessorState.BlockState blockState2 = AccessorState.BlockState.UNBLOCKED;
                    accessorState.setBlockState(loadType2, blockState2);
                    accessorState.setBlockState(LoadType.APPEND, blockState2);
                }
                accessorState.setError(LoadType.PREPEND, null);
                accessorState.setError(LoadType.APPEND, null);
                return accessorState.getPendingBoundary() != null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$1$1(RemoteMediator.MediatorResult mediatorResult, AccessorState accessorState) {
                LoadType loadType = LoadType.REFRESH;
                accessorState.clearPendingRequest(loadType);
                accessorState.setError(loadType, new LoadState.Error(((RemoteMediator.MediatorResult.Error) mediatorResult).getThrowable()));
                return accessorState.getPendingBoundary() != null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass1(this.this$0, this.$launchAppendPrepend, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl;
                Ref$BooleanRef ref$BooleanRef;
                boolean zBooleanValue;
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    PagingState<Key, Value> pagingState = (PagingState) ((RemoteMediatorAccessImpl) this.this$0).accessorState.use(new InterfaceC9540l() { // from class: androidx.paging.l1
                        @Override // p181hd.InterfaceC9540l
                        public final Object invoke(Object obj2) {
                            return ((AccessorState) obj2).getPendingRefresh();
                        }
                    });
                    if (pagingState != null) {
                        remoteMediatorAccessImpl = this.this$0;
                        Ref$BooleanRef ref$BooleanRef2 = this.$launchAppendPrepend;
                        RemoteMediator remoteMediator = ((RemoteMediatorAccessImpl) remoteMediatorAccessImpl).remoteMediator;
                        LoadType loadType = LoadType.REFRESH;
                        this.L$0 = remoteMediatorAccessImpl;
                        this.L$1 = ref$BooleanRef2;
                        this.label = 1;
                        obj = remoteMediator.load(loadType, pagingState, this);
                        if (obj == objM25952f) {
                            return objM25952f;
                        }
                        ref$BooleanRef = ref$BooleanRef2;
                    }
                    return C10786q.f26013a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$BooleanRef = (Ref$BooleanRef) this.L$1;
                remoteMediatorAccessImpl = (RemoteMediatorAccessImpl) this.L$0;
                AbstractC9924b.m20071b(obj);
                final RemoteMediator.MediatorResult mediatorResult = (RemoteMediator.MediatorResult) obj;
                if (mediatorResult instanceof RemoteMediator.MediatorResult.Success) {
                    zBooleanValue = ((Boolean) ((RemoteMediatorAccessImpl) remoteMediatorAccessImpl).accessorState.use(new InterfaceC9540l() { // from class: androidx.paging.m1
                        @Override // p181hd.InterfaceC9540l
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(RemoteMediatorAccessImpl.C42831.AnonymousClass1.invokeSuspend$lambda$1$0(mediatorResult, (AccessorState) obj2));
                        }
                    })).booleanValue();
                } else {
                    if (!(mediatorResult instanceof RemoteMediator.MediatorResult.Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zBooleanValue = ((Boolean) ((RemoteMediatorAccessImpl) remoteMediatorAccessImpl).accessorState.use(new InterfaceC9540l() { // from class: androidx.paging.n1
                        @Override // p181hd.InterfaceC9540l
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(RemoteMediatorAccessImpl.C42831.AnonymousClass1.invokeSuspend$lambda$1$1(mediatorResult, (AccessorState) obj2));
                        }
                    })).booleanValue();
                }
                ref$BooleanRef.f23398c = zBooleanValue;
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9540l
            public final Object invoke(InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42831(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, InterfaceC11588c<? super C42831> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = remoteMediatorAccessImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C42831(this.this$0, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref$BooleanRef ref$BooleanRef;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                SingleRunner singleRunner = ((RemoteMediatorAccessImpl) this.this$0).isolationRunner;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, ref$BooleanRef2, null);
                this.L$0 = ref$BooleanRef2;
                this.label = 1;
                if (singleRunner.runInIsolation(2, anonymousClass1, this) == objM25952f) {
                    return objM25952f;
                }
                ref$BooleanRef = ref$BooleanRef2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$BooleanRef = (Ref$BooleanRef) this.L$0;
                AbstractC9924b.m20071b(obj);
            }
            if (ref$BooleanRef.f23398c) {
                this.this$0.launchBoundary();
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42831) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public RemoteMediatorAccessImpl(InterfaceC11122i0 scope, RemoteMediator<Key, Value> remoteMediator) {
        AbstractC9979u.m20294g(scope, "scope");
        AbstractC9979u.m20294g(remoteMediator, "remoteMediator");
        this.scope = scope;
        this.remoteMediator = remoteMediator;
        this.accessorState = new AccessorStateHolder<>();
        this.isolationRunner = new SingleRunner(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q allowRefresh$lambda$0(AccessorState it) {
        AbstractC9979u.m20294g(it, "it");
        it.setRefreshAllowed(true);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q initialize$lambda$0$0(AccessorState it) {
        AbstractC9979u.m20294g(it, "it");
        LoadType loadType = LoadType.APPEND;
        AccessorState.BlockState blockState = AccessorState.BlockState.REQUIRES_REFRESH;
        it.setBlockState(loadType, blockState);
        it.setBlockState(LoadType.PREPEND, blockState);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchBoundary() {
        AbstractC11117h.m24726d(this.scope, null, null, new C42821(this, null), 3, null);
    }

    private final void launchRefresh() {
        AbstractC11117h.m24726d(this.scope, null, null, new C42831(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean requestLoad$lambda$0(LoadType loadType, PagingState pagingState, AccessorState it) {
        AbstractC9979u.m20294g(it, "it");
        return it.add(loadType, pagingState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q requestRefreshIfAllowed$lambda$0(RemoteMediatorAccessImpl remoteMediatorAccessImpl, PagingState pagingState, AccessorState it) {
        AbstractC9979u.m20294g(it, "it");
        if (it.getRefreshAllowed()) {
            it.setRefreshAllowed(false);
            remoteMediatorAccessImpl.requestLoad(remoteMediatorAccessImpl.accessorState, LoadType.REFRESH, pagingState);
        }
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q retryFailed$lambda$0(List list, AccessorState accessorState) {
        AbstractC9979u.m20294g(accessorState, "accessorState");
        LoadStates loadStatesComputeLoadStates = accessorState.computeLoadStates();
        boolean z10 = loadStatesComputeLoadStates.getRefresh() instanceof LoadState.Error;
        accessorState.clearErrors();
        if (z10) {
            LoadType loadType = LoadType.REFRESH;
            list.add(loadType);
            accessorState.setBlockState(loadType, AccessorState.BlockState.UNBLOCKED);
        }
        if (loadStatesComputeLoadStates.getAppend() instanceof LoadState.Error) {
            if (!z10) {
                list.add(LoadType.APPEND);
            }
            accessorState.clearPendingRequest(LoadType.APPEND);
        }
        if (loadStatesComputeLoadStates.getPrepend() instanceof LoadState.Error) {
            if (!z10) {
                list.add(LoadType.PREPEND);
            }
            accessorState.clearPendingRequest(LoadType.PREPEND);
        }
        return C10786q.f26013a;
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public void allowRefresh() {
        this.accessorState.use(new InterfaceC9540l() { // from class: androidx.paging.g1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return RemoteMediatorAccessImpl.allowRefresh$lambda$0((AccessorState) obj);
            }
        });
    }

    @Override // androidx.paging.RemoteMediatorAccessor
    public InterfaceC11612u getState() {
        return this.accessorState.getLoadStates();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.paging.RemoteMediatorAccessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initialize(vc.InterfaceC11588c<? super androidx.paging.RemoteMediator.InitializeAction> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.paging.RemoteMediatorAccessImpl.C42811
            if (r0 == 0) goto L13
            r0 = r5
            androidx.paging.RemoteMediatorAccessImpl$initialize$1 r0 = (androidx.paging.RemoteMediatorAccessImpl.C42811) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.RemoteMediatorAccessImpl$initialize$1 r0 = new androidx.paging.RemoteMediatorAccessImpl$initialize$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9924b.m20071b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.AbstractC9924b.m20071b(r5)
            androidx.paging.RemoteMediator<Key, Value> r5 = r4.remoteMediator
            r0.label = r3
            java.lang.Object r5 = r5.initialize(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            r0 = r5
            androidx.paging.RemoteMediator$InitializeAction r0 = (androidx.paging.RemoteMediator.InitializeAction) r0
            androidx.paging.RemoteMediator$InitializeAction r1 = androidx.paging.RemoteMediator.InitializeAction.LAUNCH_INITIAL_REFRESH
            if (r0 != r1) goto L50
            androidx.paging.AccessorStateHolder<Key, Value> r0 = r4.accessorState
            androidx.paging.e1 r1 = new androidx.paging.e1
            r1.<init>()
            r0.use(r1)
        L50:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.initialize(vc.c):java.lang.Object");
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public void requestLoad(LoadType loadType, PagingState<Key, Value> pagingState) {
        AbstractC9979u.m20294g(loadType, "loadType");
        AbstractC9979u.m20294g(pagingState, "pagingState");
        requestLoad(this.accessorState, loadType, pagingState);
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public void requestRefreshIfAllowed(final PagingState<Key, Value> pagingState) {
        AbstractC9979u.m20294g(pagingState, "pagingState");
        this.accessorState.use(new InterfaceC9540l() { // from class: androidx.paging.f1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return RemoteMediatorAccessImpl.requestRefreshIfAllowed$lambda$0(this.f1920c, pagingState, (AccessorState) obj);
            }
        });
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public void retryFailed(PagingState<Key, Value> pagingState) {
        AbstractC9979u.m20294g(pagingState, "pagingState");
        final ArrayList arrayList = new ArrayList();
        this.accessorState.use(new InterfaceC9540l() { // from class: androidx.paging.h1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return RemoteMediatorAccessImpl.retryFailed$lambda$0(arrayList, (AccessorState) obj);
            }
        });
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            requestLoad((LoadType) obj, pagingState);
        }
    }

    private final void requestLoad(AccessorStateHolder<Key, Value> accessorStateHolder, final LoadType loadType, final PagingState<Key, Value> pagingState) {
        if (((Boolean) accessorStateHolder.use(new InterfaceC9540l() { // from class: androidx.paging.d1
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(RemoteMediatorAccessImpl.requestLoad$lambda$0(loadType, pagingState, (AccessorState) obj));
            }
        })).booleanValue()) {
            if (WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] == 1) {
                launchRefresh();
            } else {
                launchBoundary();
            }
        }
    }
}
