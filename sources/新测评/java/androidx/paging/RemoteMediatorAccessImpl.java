package androidx.paging;

import androidx.paging.AccessorState;
import androidx.paging.LoadState;
import androidx.paging.RemoteMediator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(m13557d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 !*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004:\u0001!B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0016J\u001c\u0010\u001f\u001a\u00020\u00142\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0016J\u001c\u0010 \u001a\u00020\u00142\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0016J4\u0010\u001a\u001a\u00020\u0014*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001eH\u0002R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\""}, m13558d2 = {"Landroidx/paging/RemoteMediatorAccessImpl;", "Key", "", "Value", "Landroidx/paging/RemoteMediatorAccessor;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "remoteMediator", "Landroidx/paging/RemoteMediator;", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/paging/RemoteMediator;)V", "accessorState", "Landroidx/paging/AccessorStateHolder;", "isolationRunner", "Landroidx/paging/SingleRunner;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/paging/LoadStates;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "allowRefresh", "", "initialize", "Landroidx/paging/RemoteMediator$InitializeAction;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchBoundary", "launchRefresh", "requestLoad", "loadType", "Landroidx/paging/LoadType;", "pagingState", "Landroidx/paging/PagingState;", "requestRefreshIfAllowed", "retryFailed", "Companion", "paging-common_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nRemoteMediatorAccessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteMediatorAccessor.kt\nandroidx/paging/RemoteMediatorAccessImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,460:1\n1855#2,2:461\n*S KotlinDebug\n*F\n+ 1 RemoteMediatorAccessor.kt\nandroidx/paging/RemoteMediatorAccessImpl\n*L\n439#1:461,2\n*E\n"})
/* loaded from: classes3.dex */
final class RemoteMediatorAccessImpl<Key, Value> implements RemoteMediatorAccessor<Key, Value> {
    private static final int PRIORITY_APPEND_PREPEND = 1;
    private static final int PRIORITY_REFRESH = 2;
    private final AccessorStateHolder<Key, Value> accessorState;
    private final SingleRunner isolationRunner;
    private final RemoteMediator<Key, Value> remoteMediator;
    private final CoroutineScope scope;

    @Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
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

    @Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.paging.RemoteMediatorAccessImpl", m13596f = "RemoteMediatorAccessor.kt", m13597i = {0}, m13598l = {445}, m13599m = "initialize", m13600n = {"this"}, m13601s = {"L$0"})
    /* renamed from: androidx.paging.RemoteMediatorAccessImpl$initialize$1 */
    public static final class C42891 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42891(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, Continuation<? super C42891> continuation) {
            super(continuation);
            this.this$0 = remoteMediatorAccessImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.initialize(this);
        }
    }

    @Metadata(m13557d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, m13558d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1", m13596f = "RemoteMediatorAccessor.kt", m13597i = {}, m13598l = {386}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1 */
    public static final class C42901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

        @Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\u008a@"}, m13558d2 = {"<anonymous>", "", "Key", "", "Value"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1", m13596f = "RemoteMediatorAccessor.kt", m13597i = {0}, m13598l = {393}, m13599m = "invokeSuspend", m13600n = {"loadType"}, m13601s = {"L$0"})
        /* renamed from: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = remoteMediatorAccessImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
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
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r5.label
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r5.L$0
                    androidx.paging.LoadType r1 = (androidx.paging.LoadType) r1
                    kotlin.ResultKt.throwOnFailure(r6)
                    goto L4e
                L13:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1b:
                    kotlin.ResultKt.throwOnFailure(r6)
                L1e:
                    androidx.paging.RemoteMediatorAccessImpl<Key, Value> r6 = r5.this$0
                    androidx.paging.AccessorStateHolder r6 = androidx.paging.RemoteMediatorAccessImpl.access$getAccessorState$p(r6)
                    androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1 r1 = new kotlin.jvm.functions.Function1<androidx.paging.AccessorState<Key, Value>, kotlin.Pair<? extends androidx.paging.LoadType, ? extends androidx.paging.PagingState<Key, Value>>>() { // from class: androidx.paging.RemoteMediatorAccessImpl.launchBoundary.1.1.1
                        static {
                            /*
                                androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1 r0 = new androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1
                                r0.<init>()
                                
                                // error: 0x0005: SPUT (r0 I:androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1) androidx.paging.RemoteMediatorAccessImpl.launchBoundary.1.1.1.INSTANCE androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.C42901.AnonymousClass1.C101251.<clinit>():void");
                        }

                        {
                            /*
                                r1 = this;
                                r0 = 1
                                r1.<init>(r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.C42901.AnonymousClass1.C101251.<init>():void");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                            /*
                                r0 = this;
                                androidx.paging.AccessorState r1 = (androidx.paging.AccessorState) r1
                                kotlin.Pair r1 = r0.invoke(r1)
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.C42901.AnonymousClass1.C101251.invoke(java.lang.Object):java.lang.Object");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final kotlin.Pair<androidx.paging.LoadType, androidx.paging.PagingState<Key, Value>> invoke(androidx.paging.AccessorState<Key, Value> r2) {
                            /*
                                r1 = this;
                                java.lang.String r0 = "it"
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                                kotlin.Pair r2 = r2.getPendingBoundary()
                                return r2
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.C42901.AnonymousClass1.C101251.invoke(androidx.paging.AccessorState):kotlin.Pair");
                        }
                    }
                    java.lang.Object r6 = r6.use(r1)
                    kotlin.Pair r6 = (kotlin.Pair) r6
                    if (r6 != 0) goto L31
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
                L31:
                    java.lang.Object r1 = r6.component1()
                    androidx.paging.LoadType r1 = (androidx.paging.LoadType) r1
                    java.lang.Object r6 = r6.component2()
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
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.C42901.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42901(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, Continuation<? super C42901> continuation) {
            super(2, continuation);
            this.this$0 = remoteMediatorAccessImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C42901(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SingleRunner singleRunner = ((RemoteMediatorAccessImpl) this.this$0).isolationRunner;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (singleRunner.runInIsolation(1, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C42901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13557d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, m13558d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1", m13596f = "RemoteMediatorAccessor.kt", m13597i = {0}, m13598l = {314}, m13599m = "invokeSuspend", m13600n = {"launchAppendPrepend"}, m13601s = {"L$0"})
    /* renamed from: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1 */
    public static final class C42911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

        @Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\u008a@"}, m13558d2 = {"<anonymous>", "", "Key", "", "Value"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1", m13596f = "RemoteMediatorAccessor.kt", m13597i = {}, m13598l = {321}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.BooleanRef $launchAppendPrepend;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, Ref.BooleanRef booleanRef, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.this$0 = remoteMediatorAccessImpl;
                this.$launchAppendPrepend = booleanRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$launchAppendPrepend, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl;
                Ref.BooleanRef booleanRef;
                boolean zBooleanValue;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PagingState<Key, Value> pagingState = (PagingState) ((RemoteMediatorAccessImpl) this.this$0).accessorState.use(new Function1<AccessorState<Key, Value>, PagingState<Key, Value>>() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1$pendingPagingState$1
                        @Override // kotlin.jvm.functions.Function1
                        public final PagingState<Key, Value> invoke(AccessorState<Key, Value> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return it.getPendingRefresh();
                        }
                    });
                    if (pagingState != null) {
                        remoteMediatorAccessImpl = this.this$0;
                        Ref.BooleanRef booleanRef2 = this.$launchAppendPrepend;
                        RemoteMediator remoteMediator = ((RemoteMediatorAccessImpl) remoteMediatorAccessImpl).remoteMediator;
                        LoadType loadType = LoadType.REFRESH;
                        this.L$0 = remoteMediatorAccessImpl;
                        this.L$1 = booleanRef2;
                        this.label = 1;
                        obj = remoteMediator.load(loadType, pagingState, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        booleanRef = booleanRef2;
                    }
                    return Unit.INSTANCE;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (Ref.BooleanRef) this.L$1;
                remoteMediatorAccessImpl = (RemoteMediatorAccessImpl) this.L$0;
                ResultKt.throwOnFailure(obj);
                final RemoteMediator.MediatorResult mediatorResult = (RemoteMediator.MediatorResult) obj;
                if (mediatorResult instanceof RemoteMediator.MediatorResult.Success) {
                    zBooleanValue = ((Boolean) ((RemoteMediatorAccessImpl) remoteMediatorAccessImpl).accessorState.use(new Function1<AccessorState<Key, Value>, Boolean>() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(AccessorState<Key, Value> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            LoadType loadType2 = LoadType.REFRESH;
                            it.clearPendingRequest(loadType2);
                            if (((RemoteMediator.MediatorResult.Success) mediatorResult).getEndOfPaginationReached()) {
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
                    zBooleanValue = ((Boolean) ((RemoteMediatorAccessImpl) remoteMediatorAccessImpl).accessorState.use(new Function1<AccessorState<Key, Value>, Boolean>() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1$1$2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(AccessorState<Key, Value> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            LoadType loadType2 = LoadType.REFRESH;
                            it.clearPendingRequest(loadType2);
                            it.setError(loadType2, new LoadState.Error(((RemoteMediator.MediatorResult.Error) mediatorResult).getThrowable()));
                            return Boolean.valueOf(it.getPendingBoundary() != null);
                        }
                    })).booleanValue();
                }
                booleanRef.element = zBooleanValue;
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42911(RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl, Continuation<? super C42911> continuation) {
            super(2, continuation);
            this.this$0 = remoteMediatorAccessImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C42911(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.BooleanRef booleanRef;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                SingleRunner singleRunner = ((RemoteMediatorAccessImpl) this.this$0).isolationRunner;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, booleanRef2, null);
                this.L$0 = booleanRef2;
                this.label = 1;
                if (singleRunner.runInIsolation(2, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef = booleanRef2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (Ref.BooleanRef) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            if (booleanRef.element) {
                this.this$0.launchBoundary();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C42911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public RemoteMediatorAccessImpl(CoroutineScope scope, RemoteMediator<Key, Value> remoteMediator) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(remoteMediator, "remoteMediator");
        this.scope = scope;
        this.remoteMediator = remoteMediator;
        this.accessorState = new AccessorStateHolder<>();
        this.isolationRunner = new SingleRunner(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchBoundary() {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C42901(this, null), 3, null);
    }

    private final void launchRefresh() {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C42911(this, null), 3, null);
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public void allowRefresh() {
        this.accessorState.use(new Function1<AccessorState<Key, Value>, Unit>() { // from class: androidx.paging.RemoteMediatorAccessImpl.allowRefresh.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((AccessorState) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(AccessorState<Key, Value> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.setRefreshAllowed(true);
            }
        });
    }

    @Override // androidx.paging.RemoteMediatorAccessor
    public StateFlow<LoadStates> getState() {
        return this.accessorState.getLoadStates();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.paging.RemoteMediatorAccessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initialize(kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.InitializeAction> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.paging.RemoteMediatorAccessImpl.C42891
            if (r0 == 0) goto L13
            r0 = r5
            androidx.paging.RemoteMediatorAccessImpl$initialize$1 r0 = (androidx.paging.RemoteMediatorAccessImpl.C42891) r0
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
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.paging.RemoteMediatorAccessImpl r0 = (androidx.paging.RemoteMediatorAccessImpl) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.ResultKt.throwOnFailure(r5)
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
            androidx.paging.RemoteMediatorAccessImpl$initialize$2$1 r1 = new kotlin.jvm.functions.Function1<androidx.paging.AccessorState<Key, Value>, kotlin.Unit>() { // from class: androidx.paging.RemoteMediatorAccessImpl$initialize$2$1
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

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object r1) {
                    /*
                        r0 = this;
                        androidx.paging.AccessorState r1 = (androidx.paging.AccessorState) r1
                        r0.invoke(r1)
                        kotlin.Unit r1 = kotlin.Unit.INSTANCE
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl$initialize$2$1.invoke(java.lang.Object):java.lang.Object");
                }

                public final void invoke(androidx.paging.AccessorState<Key, Value> r3) {
                    /*
                        r2 = this;
                        java.lang.String r0 = "it"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.initialize(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public void requestLoad(LoadType loadType, PagingState<Key, Value> pagingState) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(pagingState, "pagingState");
        requestLoad(this.accessorState, loadType, pagingState);
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public void requestRefreshIfAllowed(final PagingState<Key, Value> pagingState) {
        Intrinsics.checkNotNullParameter(pagingState, "pagingState");
        this.accessorState.use(new Function1<AccessorState<Key, Value>, Unit>(this) { // from class: androidx.paging.RemoteMediatorAccessImpl.requestRefreshIfAllowed.1
            final /* synthetic */ RemoteMediatorAccessImpl<Key, Value> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((AccessorState) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(AccessorState<Key, Value> it) {
                Intrinsics.checkNotNullParameter(it, "it");
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
        Intrinsics.checkNotNullParameter(pagingState, "pagingState");
        final ArrayList arrayList = new ArrayList();
        this.accessorState.use(new Function1<AccessorState<Key, Value>, Unit>() { // from class: androidx.paging.RemoteMediatorAccessImpl.retryFailed.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((AccessorState) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(AccessorState<Key, Value> accessorState) {
                Intrinsics.checkNotNullParameter(accessorState, "accessorState");
                LoadStates loadStatesComputeLoadStates = accessorState.computeLoadStates();
                boolean z9 = loadStatesComputeLoadStates.getRefresh() instanceof LoadState.Error;
                accessorState.clearErrors();
                if (z9) {
                    List<LoadType> list = arrayList;
                    LoadType loadType = LoadType.REFRESH;
                    list.add(loadType);
                    accessorState.setBlockState(loadType, AccessorState.BlockState.UNBLOCKED);
                }
                if (loadStatesComputeLoadStates.getAppend() instanceof LoadState.Error) {
                    if (!z9) {
                        arrayList.add(LoadType.APPEND);
                    }
                    accessorState.clearPendingRequest(LoadType.APPEND);
                }
                if (loadStatesComputeLoadStates.getPrepend() instanceof LoadState.Error) {
                    if (!z9) {
                        arrayList.add(LoadType.PREPEND);
                    }
                    accessorState.clearPendingRequest(LoadType.PREPEND);
                }
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestLoad(AccessorStateHolder<Key, Value> accessorStateHolder, final LoadType loadType, final PagingState<Key, Value> pagingState) {
        if (((Boolean) accessorStateHolder.use(new Function1<AccessorState<Key, Value>, Boolean>() { // from class: androidx.paging.RemoteMediatorAccessImpl$requestLoad$newRequest$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(AccessorState<Key, Value> it) {
                Intrinsics.checkNotNullParameter(it, "it");
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
