package androidx.room.paging;

import androidx.paging.PagingSource;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomRawQuery;
import androidx.room.TransactionScope;
import androidx.room.Transactor;
import androidx.room.paging.util.RoomPagingUtil;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(m13557d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 (*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0001(BU\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012.\u0010\b\u001a*\b\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\"H\u0086@¢\u0006\u0002\u0010#J(\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\"H\u0082@¢\u0006\u0002\u0010#J0\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\"2\u0006\u0010&\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010'R\u0018\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R8\u0010\b\u001a*\b\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0015\u001a\u00060\u0016j\u0002`\u0017X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00060\u001bj\u0002`\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m13558d2 = {"Landroidx/room/paging/CommonLimitOffsetImpl;", "Value", "", "tables", "", "", "pagingSource", "Landroidx/room/paging/LimitOffsetPagingSource;", "convertRows", "Lkotlin/Function3;", "Landroidx/room/RoomRawQuery;", "", "Lkotlin/coroutines/Continuation;", "", "<init>", "([Ljava/lang/String;Landroidx/room/paging/LimitOffsetPagingSource;Lkotlin/jvm/functions/Function3;)V", "[Ljava/lang/String;", "Lkotlin/jvm/functions/Function3;", "db", "Landroidx/room/RoomDatabase;", "sourceQuery", "itemCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/room/concurrent/AtomicInt;", "getItemCount$room_paging_release", "()Ljava/util/concurrent/atomic/AtomicInteger;", "invalidationFlowStarted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/AtomicBoolean;", "invalidationFlowJob", "Lkotlinx/coroutines/Job;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initialLoad", "nonInitialLoad", "tempCount", "(Landroidx/paging/PagingSource$LoadParams;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "room-paging_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class CommonLimitOffsetImpl<Value> {
    public static final String BUG_LINK = "https://issuetracker.google.com/issues/new?component=413107&template=1096568";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final PagingSource.LoadResult.Invalid<Object, Object> INVALID = new PagingSource.LoadResult.Invalid<>();
    private final Function3<RoomRawQuery, Integer, Continuation<? super List<? extends Value>>, Object> convertRows;
    private final RoomDatabase db;
    private Job invalidationFlowJob;
    private final AtomicBoolean invalidationFlowStarted;
    private final AtomicInteger itemCount;
    private final LimitOffsetPagingSource<Value> pagingSource;
    private final RoomRawQuery sourceQuery;
    private final String[] tables;

    @Metadata(m13557d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m13558d2 = {"Landroidx/room/paging/CommonLimitOffsetImpl$Companion;", "", "<init>", "()V", "INVALID", "Landroidx/paging/PagingSource$LoadResult$Invalid;", "getINVALID", "()Landroidx/paging/PagingSource$LoadResult$Invalid;", "BUG_LINK", "", "room-paging_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PagingSource.LoadResult.Invalid<Object, Object> getINVALID() {
            return CommonLimitOffsetImpl.INVALID;
        }

        private Companion() {
        }
    }

    @Metadata(m13557d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m13558d2 = {"<anonymous>", "Landroidx/paging/PagingSource$LoadResult;", "", "Value", "", "connection", "Landroidx/room/Transactor;"}, m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.room.paging.CommonLimitOffsetImpl$initialLoad$2", m13596f = "LimitOffsetPagingSource.kt", m13597i = {}, m13598l = {121}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.room.paging.CommonLimitOffsetImpl$initialLoad$2 */
    public static final class C44942 extends SuspendLambda implements Function2<Transactor, Continuation<? super PagingSource.LoadResult<Integer, Value>>, Object> {
        final /* synthetic */ PagingSource.LoadParams<Integer> $params;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CommonLimitOffsetImpl<Value> this$0;

        @Metadata(m13557d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u00010\u0005H\n"}, m13558d2 = {"<anonymous>", "Landroidx/paging/PagingSource$LoadResult;", "", "Value", "", "Landroidx/room/TransactionScope;"}, m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.room.paging.CommonLimitOffsetImpl$initialLoad$2$1", m13596f = "LimitOffsetPagingSource.kt", m13597i = {}, m13598l = {122, 124}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.room.paging.CommonLimitOffsetImpl$initialLoad$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<TransactionScope<PagingSource.LoadResult<Integer, Value>>, Continuation<? super PagingSource.LoadResult<Integer, Value>>, Object> {
            final /* synthetic */ PagingSource.LoadParams<Integer> $params;
            int label;
            final /* synthetic */ CommonLimitOffsetImpl<Value> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CommonLimitOffsetImpl<Value> commonLimitOffsetImpl, PagingSource.LoadParams<Integer> loadParams, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = commonLimitOffsetImpl;
                this.$params = loadParams;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$params, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(TransactionScope<PagingSource.LoadResult<Integer, Value>> transactionScope, Continuation<? super PagingSource.LoadResult<Integer, Value>> continuation) {
                return ((AnonymousClass1) create(transactionScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    RoomRawQuery roomRawQuery = ((CommonLimitOffsetImpl) this.this$0).sourceQuery;
                    RoomDatabase roomDatabase = ((CommonLimitOffsetImpl) this.this$0).db;
                    this.label = 1;
                    obj = RoomPagingUtil.queryItemCount(roomRawQuery, roomDatabase, this);
                    if (obj != coroutine_suspended) {
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                int iIntValue = ((Number) obj).intValue();
                this.this$0.getItemCount().set(iIntValue);
                PagingSource.LoadParams<Integer> loadParams = this.$params;
                RoomRawQuery roomRawQuery2 = ((CommonLimitOffsetImpl) this.this$0).sourceQuery;
                Function3 function3 = ((CommonLimitOffsetImpl) this.this$0).convertRows;
                this.label = 2;
                Object objQueryDatabase = RoomPagingUtil.queryDatabase(loadParams, roomRawQuery2, iIntValue, function3, this);
                return objQueryDatabase == coroutine_suspended ? coroutine_suspended : objQueryDatabase;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44942(CommonLimitOffsetImpl<Value> commonLimitOffsetImpl, PagingSource.LoadParams<Integer> loadParams, Continuation<? super C44942> continuation) {
            super(2, continuation);
            this.this$0 = commonLimitOffsetImpl;
            this.$params = loadParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C44942 c44942 = new C44942(this.this$0, this.$params, continuation);
            c44942.L$0 = obj;
            return c44942;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Transactor transactor, Continuation<? super PagingSource.LoadResult<Integer, Value>> continuation) {
            return ((C44942) create(transactor, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Transactor transactor = (Transactor) this.L$0;
            Transactor.SQLiteTransactionType sQLiteTransactionType = Transactor.SQLiteTransactionType.DEFERRED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$params, null);
            this.label = 1;
            Object objWithTransaction = transactor.withTransaction(sQLiteTransactionType, anonymousClass1, this);
            return objWithTransaction == coroutine_suspended ? coroutine_suspended : objWithTransaction;
        }
    }

    @Metadata(m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.room.paging.CommonLimitOffsetImpl", m13596f = "LimitOffsetPagingSource.kt", m13597i = {}, m13598l = {100, 102}, m13599m = "load", m13600n = {}, m13601s = {})
    /* renamed from: androidx.room.paging.CommonLimitOffsetImpl$load$1 */
    public static final class C44951 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ CommonLimitOffsetImpl<Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44951(CommonLimitOffsetImpl<Value> commonLimitOffsetImpl, Continuation<? super C44951> continuation) {
            super(continuation);
            this.this$0 = commonLimitOffsetImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.load(null, this);
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.room.paging.CommonLimitOffsetImpl$load$2", m13596f = "LimitOffsetPagingSource.kt", m13597i = {}, m13598l = {87}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.room.paging.CommonLimitOffsetImpl$load$2 */
    public static final class C44962 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ CommonLimitOffsetImpl<Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44962(CommonLimitOffsetImpl<Value> commonLimitOffsetImpl, Continuation<? super C44962> continuation) {
            super(2, continuation);
            this.this$0 = commonLimitOffsetImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C44962(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InvalidationTracker invalidationTracker = ((CommonLimitOffsetImpl) this.this$0).db.getInvalidationTracker();
                String[] strArr = ((CommonLimitOffsetImpl) this.this$0).tables;
                Flow<Set<String>> flowCreateFlow = invalidationTracker.createFlow((String[]) Arrays.copyOf(strArr, strArr.length), false);
                final CommonLimitOffsetImpl<Value> commonLimitOffsetImpl = this.this$0;
                FlowCollector<? super Set<String>> flowCollector = new FlowCollector() { // from class: androidx.room.paging.CommonLimitOffsetImpl.load.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Set<String>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Set<String> set, Continuation<? super Unit> continuation) {
                        if (((CommonLimitOffsetImpl) commonLimitOffsetImpl).pagingSource.getInvalid()) {
                            throw new CancellationException("PagingSource is invalid");
                        }
                        ((CommonLimitOffsetImpl) commonLimitOffsetImpl).pagingSource.invalidate();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowCreateFlow.collect(flowCollector, this) == coroutine_suspended) {
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
            return ((C44962) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.room.paging.CommonLimitOffsetImpl", m13596f = "LimitOffsetPagingSource.kt", m13597i = {0, 1, 1}, m13598l = {139, 147}, m13599m = "nonInitialLoad", m13600n = {"this", "this", "loadResult"}, m13601s = {"L$0", "L$0", "L$1"})
    /* renamed from: androidx.room.paging.CommonLimitOffsetImpl$nonInitialLoad$1 */
    public static final class C44971 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ CommonLimitOffsetImpl<Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44971(CommonLimitOffsetImpl<Value> commonLimitOffsetImpl, Continuation<? super C44971> continuation) {
            super(continuation);
            this.this$0 = commonLimitOffsetImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.nonInitialLoad(null, 0, this);
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.room.paging.CommonLimitOffsetImpl$nonInitialLoad$2", m13596f = "LimitOffsetPagingSource.kt", m13597i = {}, m13598l = {148}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.room.paging.CommonLimitOffsetImpl$nonInitialLoad$2 */
    public static final class C44982 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ CommonLimitOffsetImpl<Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44982(CommonLimitOffsetImpl<Value> commonLimitOffsetImpl, Continuation<? super C44982> continuation) {
            super(2, continuation);
            this.this$0 = commonLimitOffsetImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C44982(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InvalidationTracker invalidationTracker = ((CommonLimitOffsetImpl) this.this$0).db.getInvalidationTracker();
                String[] strArr = ((CommonLimitOffsetImpl) this.this$0).tables;
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                this.label = 1;
                obj = invalidationTracker.refresh(strArr2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                ((CommonLimitOffsetImpl) this.this$0).pagingSource.invalidate();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C44982) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommonLimitOffsetImpl(String[] tables, LimitOffsetPagingSource<Value> pagingSource, Function3<? super RoomRawQuery, ? super Integer, ? super Continuation<? super List<? extends Value>>, ? extends Object> convertRows) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
        Intrinsics.checkNotNullParameter(convertRows, "convertRows");
        this.tables = tables;
        this.pagingSource = pagingSource;
        this.convertRows = convertRows;
        this.db = pagingSource.getDb();
        this.sourceQuery = pagingSource.getSourceQuery();
        this.itemCount = new AtomicInteger(-1);
        this.invalidationFlowStarted = new AtomicBoolean(false);
        pagingSource.registerInvalidatedCallback(new Function0() { // from class: androidx.room.paging.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommonLimitOffsetImpl._init_$lambda$0(this.f2158a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(CommonLimitOffsetImpl commonLimitOffsetImpl) {
        Job job = commonLimitOffsetImpl.invalidationFlowJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initialLoad(PagingSource.LoadParams<Integer> loadParams, Continuation<? super PagingSource.LoadResult<Integer, Value>> continuation) {
        return RoomDatabaseKt.useReaderConnection(this.db, new C44942(this, loadParams, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r8, r2, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object nonInitialLoad(androidx.paging.PagingSource.LoadParams<java.lang.Integer> r6, int r7, kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, Value>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.room.paging.CommonLimitOffsetImpl.C44971
            if (r0 == 0) goto L13
            r0 = r8
            androidx.room.paging.CommonLimitOffsetImpl$nonInitialLoad$1 r0 = (androidx.room.paging.CommonLimitOffsetImpl.C44971) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.paging.CommonLimitOffsetImpl$nonInitialLoad$1 r0 = new androidx.room.paging.CommonLimitOffsetImpl$nonInitialLoad$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.L$1
            androidx.paging.PagingSource$LoadResult r6 = (androidx.paging.PagingSource.LoadResult) r6
            java.lang.Object r7 = r0.L$0
            androidx.room.paging.CommonLimitOffsetImpl r7 = (androidx.room.paging.CommonLimitOffsetImpl) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L78
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.L$0
            androidx.room.paging.CommonLimitOffsetImpl r6 = (androidx.room.paging.CommonLimitOffsetImpl) r6
            kotlin.ResultKt.throwOnFailure(r8)
            r7 = r6
            goto L58
        L45:
            kotlin.ResultKt.throwOnFailure(r8)
            androidx.room.RoomRawQuery r8 = r5.sourceQuery
            kotlin.jvm.functions.Function3<androidx.room.RoomRawQuery, java.lang.Integer, kotlin.coroutines.Continuation<? super java.util.List<? extends Value>>, java.lang.Object> r2 = r5.convertRows
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r8 = androidx.room.paging.util.RoomPagingUtil.queryDatabase(r6, r8, r7, r2, r0)
            if (r8 != r1) goto L57
            goto L77
        L57:
            r7 = r5
        L58:
            r6 = r8
            androidx.paging.PagingSource$LoadResult r6 = (androidx.paging.PagingSource.LoadResult) r6
            androidx.room.RoomDatabase r8 = r7.db
            kotlinx.coroutines.CoroutineScope r8 = r8.getCoroutineScope()
            kotlin.coroutines.CoroutineContext r8 = r8.getCoroutineContext()
            androidx.room.paging.CommonLimitOffsetImpl$nonInitialLoad$2 r2 = new androidx.room.paging.CommonLimitOffsetImpl$nonInitialLoad$2
            r4 = 0
            r2.<init>(r7, r4)
            r0.L$0 = r7
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r2, r0)
            if (r8 != r1) goto L78
        L77:
            return r1
        L78:
            androidx.room.paging.LimitOffsetPagingSource<Value> r7 = r7.pagingSource
            boolean r7 = r7.getInvalid()
            if (r7 == 0) goto L87
            androidx.paging.PagingSource$LoadResult$Invalid<java.lang.Object, java.lang.Object> r6 = androidx.room.paging.CommonLimitOffsetImpl.INVALID
            java.lang.String r7 = "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Invalid<kotlin.Int, Value of androidx.room.paging.CommonLimitOffsetImpl>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r7)
        L87:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.paging.CommonLimitOffsetImpl.nonInitialLoad(androidx.paging.PagingSource$LoadParams, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: getItemCount$room_paging_release, reason: from getter */
    public final AtomicInteger getItemCount() {
        return this.itemCount;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if (r13 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object load(androidx.paging.PagingSource.LoadParams<java.lang.Integer> r12, kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, Value>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof androidx.room.paging.CommonLimitOffsetImpl.C44951
            if (r0 == 0) goto L13
            r0 = r13
            androidx.room.paging.CommonLimitOffsetImpl$load$1 r0 = (androidx.room.paging.CommonLimitOffsetImpl.C44951) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.paging.CommonLimitOffsetImpl$load$1 r0 = new androidx.room.paging.CommonLimitOffsetImpl$load$1
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Exception -> L2c
            goto L7b
        L2c:
            r0 = move-exception
            r12 = r0
            goto L7e
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Exception -> L2c
            goto L6f
        L3b:
            kotlin.ResultKt.throwOnFailure(r13)
            java.util.concurrent.atomic.AtomicBoolean r13 = r11.invalidationFlowStarted
            r2 = 0
            boolean r13 = r13.compareAndSet(r2, r4)
            if (r13 == 0) goto L5d
            androidx.room.RoomDatabase r13 = r11.db
            kotlinx.coroutines.CoroutineScope r5 = r13.getCoroutineScope()
            androidx.room.paging.CommonLimitOffsetImpl$load$2 r8 = new androidx.room.paging.CommonLimitOffsetImpl$load$2
            r13 = 0
            r8.<init>(r11, r13)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            kotlinx.coroutines.Job r13 = kotlinx.coroutines.BuildersKt.launch$default(r5, r6, r7, r8, r9, r10)
            r11.invalidationFlowJob = r13
        L5d:
            java.util.concurrent.atomic.AtomicInteger r13 = r11.itemCount
            int r13 = r13.get()
            r2 = -1
            if (r13 != r2) goto L72
            r0.label = r4     // Catch: java.lang.Exception -> L2c
            java.lang.Object r13 = r11.initialLoad(r12, r0)     // Catch: java.lang.Exception -> L2c
            if (r13 != r1) goto L6f
            goto L7a
        L6f:
            androidx.paging.PagingSource$LoadResult r13 = (androidx.paging.PagingSource.LoadResult) r13     // Catch: java.lang.Exception -> L2c
            return r13
        L72:
            r0.label = r3     // Catch: java.lang.Exception -> L2c
            java.lang.Object r13 = r11.nonInitialLoad(r12, r13, r0)     // Catch: java.lang.Exception -> L2c
            if (r13 != r1) goto L7b
        L7a:
            return r1
        L7b:
            androidx.paging.PagingSource$LoadResult r13 = (androidx.paging.PagingSource.LoadResult) r13     // Catch: java.lang.Exception -> L2c
            return r13
        L7e:
            androidx.paging.PagingSource$LoadResult$Error r13 = new androidx.paging.PagingSource$LoadResult$Error
            r13.<init>(r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.paging.CommonLimitOffsetImpl.load(androidx.paging.PagingSource$LoadParams, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
