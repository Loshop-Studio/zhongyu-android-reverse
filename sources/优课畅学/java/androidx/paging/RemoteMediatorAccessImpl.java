package androidx.paging;

import androidx.paging.AccessorState;
import androidx.paging.LoadState;
import androidx.paging.RemoteMediator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$BooleanRef;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9280q;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
final class RemoteMediatorAccessImpl<Key, Value> implements RemoteMediatorAccessor<Key, Value> {
    public static final Companion Companion = new Companion(null);
    private static final int PRIORITY_APPEND_PREPEND = 1;
    private static final int PRIORITY_REFRESH = 2;
    private final AccessorStateHolder<Key, Value> accessorState;
    private final SingleRunner isolationRunner;
    private final RemoteMediator<Key, Value> remoteMediator;
    private final InterfaceC8822b0 scope;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

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

    @InterfaceC9539d(m17800c = "androidx.paging.RemoteMediatorAccessImpl", m17801f = "RemoteMediatorAccessor.kt", m17802l = {445}, m17803m = "initialize")
    /* renamed from: androidx.paging.RemoteMediatorAccessImpl$initialize$1 */
    public static final class C43751 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43751(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, InterfaceC9324c<? super C43751> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = remoteMediatorAccessImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.initialize(this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1", m17801f = "RemoteMediatorAccessor.kt", m17802l = {386}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1 */
    public static final class C43761 extends SuspendLambda implements InterfaceC10574p {
        int label;
        final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

        @InterfaceC9539d(m17800c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1", m17801f = "RemoteMediatorAccessor.kt", m17802l = {393}, m17803m = "invokeSuspend")
        /* renamed from: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10570l {
            Object L$0;
            int label;
            final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(1, interfaceC9324c);
                this.this$0 = remoteMediatorAccessImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass1(this.this$0, interfaceC9324c);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004b -> B:16:0x004e). Please report as a decompilation issue!!! */
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
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r5.L$0
                    androidx.paging.LoadType r1 = (androidx.paging.LoadType) r1
                    kotlin.AbstractC9079b.m15926b(r6)
                    goto L4e
                L13:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1b:
                    kotlin.AbstractC9079b.m15926b(r6)
                L1e:
                    androidx.paging.RemoteMediatorAccessImpl<Key, Value> r6 = r5.this$0
                    androidx.paging.AccessorStateHolder r6 = androidx.paging.RemoteMediatorAccessImpl.access$getAccessorState$p(r6)
                    androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1 r1 = new p300x7.InterfaceC10570l() { // from class: androidx.paging.RemoteMediatorAccessImpl.launchBoundary.1.1.1
                        static {
                            /*
                                androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1 r0 = new androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1
                                r0.<init>()
                                
                                // error: 0x0005: SPUT (r0 I:androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1) androidx.paging.RemoteMediatorAccessImpl.launchBoundary.1.1.1.INSTANCE androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.C43761.AnonymousClass1.C107831.<clinit>():void");
                        }

                        {
                            /*
                                r1 = this;
                                r0 = 1
                                r1.<init>(r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.C43761.AnonymousClass1.C107831.<init>():void");
                        }

                        @Override // p300x7.InterfaceC10570l
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                            /*
                                r0 = this;
                                androidx.paging.AccessorState r1 = (androidx.paging.AccessorState) r1
                                kotlin.Pair r1 = r0.invoke(r1)
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.C43761.AnonymousClass1.C107831.invoke(java.lang.Object):java.lang.Object");
                        }

                        @Override // p300x7.InterfaceC10570l
                        public final kotlin.Pair<androidx.paging.LoadType, androidx.paging.PagingState<Key, Value>> invoke(androidx.paging.AccessorState<Key, Value> r2) {
                            /*
                                r1 = this;
                                java.lang.String r0 = "it"
                                kotlin.jvm.internal.AbstractC9133u.m16133g(r2, r0)
                                kotlin.Pair r2 = r2.getPendingBoundary()
                                return r2
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.C43761.AnonymousClass1.C107831.invoke(androidx.paging.AccessorState):kotlin.Pair");
                        }
                    }
                    java.lang.Object r6 = r6.use(r1)
                    kotlin.Pair r6 = (kotlin.Pair) r6
                    if (r6 != 0) goto L31
                    h7.p r6 = p123h7.C8736p.f16368a
                    return r6
                L31:
                    java.lang.Object r1 = r6.m15903a()
                    androidx.paging.LoadType r1 = (androidx.paging.LoadType) r1
                    java.lang.Object r6 = r6.m15904b()
                    androidx.paging.PagingState r6 = (androidx.paging.PagingState) r6
                    androidx.paging.RemoteMediatorAccessImpl<Key, Value> r3 = r5.this$0
                    androidx.paging.RemoteMediator r3 = androidx.paging.RemoteMediatorAccessImpl.access$getRemoteMediator$p(r3)
                    r5.L$0 = r1
                    r5.label = r2
                    java.lang.Object r6 = r3.load(r1, r6, r5)
                    if (r6 != r0) goto L4e
                    return r0
                L4e:
                    androidx.paging.RemoteMediator$MediatorResult r6 = (androidx.paging.RemoteMediator.MediatorResult) r6
                    boolean r3 = r6 instanceof androidx.paging.RemoteMediator.MediatorResult.Success
                    if (r3 == 0) goto L63
                    androidx.paging.RemoteMediatorAccessImpl<Key, Value> r3 = r5.this$0
                    androidx.paging.AccessorStateHolder r3 = androidx.paging.RemoteMediatorAccessImpl.access$getAccessorState$p(r3)
                    androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$2 r4 = new androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$2
                    r4.<init>()
                    r3.use(r4)
                    goto L1e
                L63:
                    boolean r3 = r6 instanceof androidx.paging.RemoteMediator.MediatorResult.Error
                    if (r3 == 0) goto L1e
                    androidx.paging.RemoteMediatorAccessImpl<Key, Value> r3 = r5.this$0
                    androidx.paging.AccessorStateHolder r3 = androidx.paging.RemoteMediatorAccessImpl.access$getAccessorState$p(r3)
                    androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$3 r4 = new androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$3
                    r4.<init>()
                    r3.use(r4)
                    goto L1e
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.C43761.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p300x7.InterfaceC10570l
            public final Object invoke(InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43761(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, InterfaceC9324c<? super C43761> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = remoteMediatorAccessImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C43761(this.this$0, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C43761) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                SingleRunner singleRunner = ((RemoteMediatorAccessImpl) this.this$0).isolationRunner;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (singleRunner.runInIsolation(1, anonymousClass1, this) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1", m17801f = "RemoteMediatorAccessor.kt", m17802l = {314}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1 */
    public static final class C43771 extends SuspendLambda implements InterfaceC10574p {
        Object L$0;
        int label;
        final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

        @InterfaceC9539d(m17800c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1", m17801f = "RemoteMediatorAccessor.kt", m17802l = {321}, m17803m = "invokeSuspend")
        /* renamed from: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10570l {
            final /* synthetic */ Ref$BooleanRef $launchAppendPrepend;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, Ref$BooleanRef ref$BooleanRef, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(1, interfaceC9324c);
                this.this$0 = remoteMediatorAccessImpl;
                this.$launchAppendPrepend = ref$BooleanRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass1(this.this$0, this.$launchAppendPrepend, interfaceC9324c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl;
                Ref$BooleanRef ref$BooleanRef;
                boolean zBooleanValue;
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    PagingState<Key, Value> pagingState = (PagingState) ((RemoteMediatorAccessImpl) this.this$0).accessorState.use(new InterfaceC10570l() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1$pendingPagingState$1
                        @Override // p300x7.InterfaceC10570l
                        public final PagingState<Key, Value> invoke(AccessorState<Key, Value> it) {
                            AbstractC9133u.m16133g(it, "it");
                            return it.getPendingRefresh();
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
                        if (obj == objM17291f) {
                            return objM17291f;
                        }
                        ref$BooleanRef = ref$BooleanRef2;
                    }
                    return C8736p.f16368a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$BooleanRef = (Ref$BooleanRef) this.L$1;
                remoteMediatorAccessImpl = (RemoteMediatorAccessImpl) this.L$0;
                AbstractC9079b.m15926b(obj);
                final RemoteMediator.MediatorResult mediatorResult = (RemoteMediator.MediatorResult) obj;
                if (mediatorResult instanceof RemoteMediator.MediatorResult.Success) {
                    zBooleanValue = ((Boolean) ((RemoteMediatorAccessImpl) remoteMediatorAccessImpl).accessorState.use(new InterfaceC10570l() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1$1$1
                        {
                            super(1);
                        }

                        @Override // p300x7.InterfaceC10570l
                        public final Boolean invoke(AccessorState<Key, Value> it) {
                            AbstractC9133u.m16133g(it, "it");
                            LoadType loadType2 = LoadType.REFRESH;
                            it.clearPendingRequest(loadType2);
                            if (((RemoteMediator.MediatorResult.Success) mediatorResult).endOfPaginationReached()) {
                                AccessorState.BlockState blockState = AccessorState.BlockState.COMPLETED;
                                it.setBlockState(loadType2, blockState);
                                it.setBlockState(LoadType.PREPEND, blockState);
                                it.setBlockState(LoadType.APPEND, blockState);
                                it.clearPendingRequests();
                            } else {
                                LoadType loadType3 = LoadType.PREPEND;
                                AccessorState.BlockState blockState2 = AccessorState.BlockState.UNBLOCKED;
                                it.setBlockState(loadType3, blockState2);
                                it.setBlockState(LoadType.APPEND, blockState2);
                            }
                            it.setError(LoadType.PREPEND, null);
                            it.setError(LoadType.APPEND, null);
                            return Boolean.valueOf(it.getPendingBoundary() != null);
                        }
                    })).booleanValue();
                } else {
                    if (!(mediatorResult instanceof RemoteMediator.MediatorResult.Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zBooleanValue = ((Boolean) ((RemoteMediatorAccessImpl) remoteMediatorAccessImpl).accessorState.use(new InterfaceC10570l() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1$1$2
                        {
                            super(1);
                        }

                        @Override // p300x7.InterfaceC10570l
                        public final Boolean invoke(AccessorState<Key, Value> it) {
                            AbstractC9133u.m16133g(it, "it");
                            LoadType loadType2 = LoadType.REFRESH;
                            it.clearPendingRequest(loadType2);
                            it.setError(loadType2, new LoadState.Error(((RemoteMediator.MediatorResult.Error) mediatorResult).getThrowable()));
                            return Boolean.valueOf(it.getPendingBoundary() != null);
                        }
                    })).booleanValue();
                }
                ref$BooleanRef.f17469a = zBooleanValue;
                return C8736p.f16368a;
            }

            @Override // p300x7.InterfaceC10570l
            public final Object invoke(InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43771(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, InterfaceC9324c<? super C43771> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = remoteMediatorAccessImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C43771(this.this$0, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C43771) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref$BooleanRef ref$BooleanRef;
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                SingleRunner singleRunner = ((RemoteMediatorAccessImpl) this.this$0).isolationRunner;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, ref$BooleanRef2, null);
                this.L$0 = ref$BooleanRef2;
                this.label = 1;
                if (singleRunner.runInIsolation(2, anonymousClass1, this) == objM17291f) {
                    return objM17291f;
                }
                ref$BooleanRef = ref$BooleanRef2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$BooleanRef = (Ref$BooleanRef) this.L$0;
                AbstractC9079b.m15926b(obj);
            }
            if (ref$BooleanRef.f17469a) {
                this.this$0.launchBoundary();
            }
            return C8736p.f16368a;
        }
    }

    public RemoteMediatorAccessImpl(InterfaceC8822b0 scope, RemoteMediator<Key, Value> remoteMediator) {
        AbstractC9133u.m16133g(scope, "scope");
        AbstractC9133u.m16133g(remoteMediator, "remoteMediator");
        this.scope = scope;
        this.remoteMediator = remoteMediator;
        this.accessorState = new AccessorStateHolder<>();
        this.isolationRunner = new SingleRunner(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchBoundary() {
        AbstractC8839h.m14861d(this.scope, null, null, new C43761(this, null), 3, null);
    }

    private final void launchRefresh() {
        AbstractC8839h.m14861d(this.scope, null, null, new C43771(this, null), 3, null);
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public void allowRefresh() {
        this.accessorState.use(new InterfaceC10570l() { // from class: androidx.paging.RemoteMediatorAccessImpl.allowRefresh.1
            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AccessorState) obj);
                return C8736p.f16368a;
            }

            public final void invoke(AccessorState<Key, Value> it) {
                AbstractC9133u.m16133g(it, "it");
                it.setRefreshAllowed(true);
            }
        });
    }

    @Override // androidx.paging.RemoteMediatorAccessor
    public InterfaceC9280q getState() {
        return this.accessorState.getLoadStates();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.paging.RemoteMediatorAccessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initialize(p179m7.InterfaceC9324c<? super androidx.paging.RemoteMediator.InitializeAction> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.paging.RemoteMediatorAccessImpl.C43751
            if (r0 == 0) goto L13
            r0 = r5
            androidx.paging.RemoteMediatorAccessImpl$initialize$1 r0 = (androidx.paging.RemoteMediatorAccessImpl.C43751) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.paging.RemoteMediatorAccessImpl r0 = (androidx.paging.RemoteMediatorAccessImpl) r0
            kotlin.AbstractC9079b.m15926b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.AbstractC9079b.m15926b(r5)
            androidx.paging.RemoteMediator<Key, Value> r5 = r4.remoteMediator
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.initialize(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            r1 = r5
            androidx.paging.RemoteMediator$InitializeAction r1 = (androidx.paging.RemoteMediator.InitializeAction) r1
            androidx.paging.RemoteMediator$InitializeAction r2 = androidx.paging.RemoteMediator.InitializeAction.LAUNCH_INITIAL_REFRESH
            if (r1 != r2) goto L54
            androidx.paging.AccessorStateHolder<Key, Value> r0 = r0.accessorState
            androidx.paging.RemoteMediatorAccessImpl$initialize$2$1 r1 = new p300x7.InterfaceC10570l() { // from class: androidx.paging.RemoteMediatorAccessImpl$initialize$2$1
                static {
                    /*
                        androidx.paging.RemoteMediatorAccessImpl$initialize$2$1 r0 = new androidx.paging.RemoteMediatorAccessImpl$initialize$2$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.paging.RemoteMediatorAccessImpl$initialize$2$1) androidx.paging.RemoteMediatorAccessImpl$initialize$2$1.INSTANCE androidx.paging.RemoteMediatorAccessImpl$initialize$2$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl$initialize$2$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl$initialize$2$1.<init>():void");
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                    /*
                        r0 = this;
                        androidx.paging.AccessorState r1 = (androidx.paging.AccessorState) r1
                        r0.invoke(r1)
                        h7.p r1 = p123h7.C8736p.f16368a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl$initialize$2$1.invoke(java.lang.Object):java.lang.Object");
                }

                public final void invoke(androidx.paging.AccessorState<Key, Value> r3) {
                    /*
                        r2 = this;
                        java.lang.String r0 = "it"
                        kotlin.jvm.internal.AbstractC9133u.m16133g(r3, r0)
                        androidx.paging.LoadType r0 = androidx.paging.LoadType.APPEND
                        androidx.paging.AccessorState$BlockState r1 = androidx.paging.AccessorState.BlockState.REQUIRES_REFRESH
                        r3.setBlockState(r0, r1)
                        androidx.paging.LoadType r0 = androidx.paging.LoadType.PREPEND
                        r3.setBlockState(r0, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl$initialize$2$1.invoke(androidx.paging.AccessorState):void");
                }
            }
            r0.use(r1)
        L54:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.initialize(m7.c):java.lang.Object");
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public void requestLoad(LoadType loadType, PagingState<Key, Value> pagingState) {
        AbstractC9133u.m16133g(loadType, "loadType");
        AbstractC9133u.m16133g(pagingState, "pagingState");
        requestLoad(this.accessorState, loadType, pagingState);
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public void requestRefreshIfAllowed(final PagingState<Key, Value> pagingState) {
        AbstractC9133u.m16133g(pagingState, "pagingState");
        this.accessorState.use(new InterfaceC10570l(this) { // from class: androidx.paging.RemoteMediatorAccessImpl.requestRefreshIfAllowed.1
            final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AccessorState) obj);
                return C8736p.f16368a;
            }

            public final void invoke(AccessorState<Key, Value> it) {
                AbstractC9133u.m16133g(it, "it");
                if (it.getRefreshAllowed()) {
                    it.setRefreshAllowed(false);
                    RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl = this.this$0;
                    remoteMediatorAccessImpl.requestLoad(((RemoteMediatorAccessImpl) remoteMediatorAccessImpl).accessorState, LoadType.REFRESH, pagingState);
                }
            }
        });
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public void retryFailed(PagingState<Key, Value> pagingState) {
        AbstractC9133u.m16133g(pagingState, "pagingState");
        final ArrayList arrayList = new ArrayList();
        this.accessorState.use(new InterfaceC10570l() { // from class: androidx.paging.RemoteMediatorAccessImpl.retryFailed.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AccessorState) obj);
                return C8736p.f16368a;
            }

            public final void invoke(AccessorState<Key, Value> accessorState) {
                AbstractC9133u.m16133g(accessorState, "accessorState");
                LoadStates loadStatesComputeLoadStates = accessorState.computeLoadStates();
                boolean z10 = loadStatesComputeLoadStates.getRefresh() instanceof LoadState.Error;
                accessorState.clearErrors();
                if (z10) {
                    List<LoadType> list = arrayList;
                    LoadType loadType = LoadType.REFRESH;
                    list.add(loadType);
                    accessorState.setBlockState(loadType, AccessorState.BlockState.UNBLOCKED);
                }
                if (loadStatesComputeLoadStates.getAppend() instanceof LoadState.Error) {
                    if (!z10) {
                        arrayList.add(LoadType.APPEND);
                    }
                    accessorState.clearPendingRequest(LoadType.APPEND);
                }
                if (loadStatesComputeLoadStates.getPrepend() instanceof LoadState.Error) {
                    if (!z10) {
                        arrayList.add(LoadType.PREPEND);
                    }
                    accessorState.clearPendingRequest(LoadType.PREPEND);
                }
            }
        });
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            requestLoad((LoadType) it.next(), pagingState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestLoad(AccessorStateHolder<Key, Value> accessorStateHolder, final LoadType loadType, final PagingState<Key, Value> pagingState) {
        if (((Boolean) accessorStateHolder.use(new InterfaceC10570l() { // from class: androidx.paging.RemoteMediatorAccessImpl$requestLoad$newRequest$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(AccessorState<Key, Value> it) {
                AbstractC9133u.m16133g(it, "it");
                return Boolean.valueOf(it.add(loadType, pagingState));
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
