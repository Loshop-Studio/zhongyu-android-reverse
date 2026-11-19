package androidx.room.paging;

import androidx.paging.PagingSource;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomRawQuery;
import androidx.room.TransactionScope;
import androidx.room.Transactor;
import androidx.room.paging.util.RoomPagingUtil;
import com.tencent.smtt.sdk.TbsListener;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes3.dex */
public final class CommonLimitOffsetImpl<Value> {
    public static final String BUG_LINK = "https://issuetracker.google.com/issues/new?component=413107&template=1096568";
    public static final Companion Companion = new Companion(null);
    private static final PagingSource.LoadResult.Invalid<Object, Object> INVALID = new PagingSource.LoadResult.Invalid<>();
    private final InterfaceC10575q convertRows;

    /* renamed from: db */
    private final RoomDatabase f1916db;
    private InterfaceC9212n invalidationFlowJob;
    private final AtomicBoolean invalidationFlowStarted;
    private final AtomicInteger itemCount;
    private final LimitOffsetPagingSource<Value> pagingSource;
    private final RoomRawQuery sourceQuery;
    private final String[] tables;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final PagingSource.LoadResult.Invalid<Object, Object> getINVALID() {
            return CommonLimitOffsetImpl.INVALID;
        }

        private Companion() {
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.paging.CommonLimitOffsetImpl$initialLoad$2", m17801f = "LimitOffsetPagingSource.kt", m17802l = {TbsListener.ErrorCode.THREAD_INIT_ERROR}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.paging.CommonLimitOffsetImpl$initialLoad$2 */
    public static final class C45802 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ PagingSource.LoadParams<Integer> $params;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CommonLimitOffsetImpl<Value> this$0;

        @InterfaceC9539d(m17800c = "androidx.room.paging.CommonLimitOffsetImpl$initialLoad$2$1", m17801f = "LimitOffsetPagingSource.kt", m17802l = {122, TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY}, m17803m = "invokeSuspend")
        /* renamed from: androidx.room.paging.CommonLimitOffsetImpl$initialLoad$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ PagingSource.LoadParams<Integer> $params;
            int label;
            final /* synthetic */ CommonLimitOffsetImpl<Value> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CommonLimitOffsetImpl<Value> commonLimitOffsetImpl, PagingSource.LoadParams<Integer> loadParams, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.this$0 = commonLimitOffsetImpl;
                this.$params = loadParams;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass1(this.this$0, this.$params, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(TransactionScope<PagingSource.LoadResult<Integer, Value>> transactionScope, InterfaceC9324c<? super PagingSource.LoadResult<Integer, Value>> interfaceC9324c) {
                return ((AnonymousClass1) create(transactionScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    RoomRawQuery roomRawQuery = ((CommonLimitOffsetImpl) this.this$0).sourceQuery;
                    RoomDatabase roomDatabase = ((CommonLimitOffsetImpl) this.this$0).f1916db;
                    this.label = 1;
                    obj = RoomPagingUtil.queryItemCount(roomRawQuery, roomDatabase, this);
                    if (obj != objM17291f) {
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    return obj;
                }
                AbstractC9079b.m15926b(obj);
                int iIntValue = ((Number) obj).intValue();
                this.this$0.getItemCount$room_paging_release().set(iIntValue);
                PagingSource.LoadParams<Integer> loadParams = this.$params;
                RoomRawQuery roomRawQuery2 = ((CommonLimitOffsetImpl) this.this$0).sourceQuery;
                InterfaceC10575q interfaceC10575q = ((CommonLimitOffsetImpl) this.this$0).convertRows;
                this.label = 2;
                Object objQueryDatabase = RoomPagingUtil.queryDatabase(loadParams, roomRawQuery2, iIntValue, interfaceC10575q, this);
                return objQueryDatabase == objM17291f ? objM17291f : objQueryDatabase;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45802(CommonLimitOffsetImpl<Value> commonLimitOffsetImpl, PagingSource.LoadParams<Integer> loadParams, InterfaceC9324c<? super C45802> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = commonLimitOffsetImpl;
            this.$params = loadParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C45802 c45802 = new C45802(this.this$0, this.$params, interfaceC9324c);
            c45802.L$0 = obj;
            return c45802;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(Transactor transactor, InterfaceC9324c<? super PagingSource.LoadResult<Integer, Value>> interfaceC9324c) {
            return ((C45802) create(transactor, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                return obj;
            }
            AbstractC9079b.m15926b(obj);
            Transactor transactor = (Transactor) this.L$0;
            Transactor.SQLiteTransactionType sQLiteTransactionType = Transactor.SQLiteTransactionType.DEFERRED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$params, null);
            this.label = 1;
            Object objWithTransaction = transactor.withTransaction(sQLiteTransactionType, anonymousClass1, this);
            return objWithTransaction == objM17291f ? objM17291f : objWithTransaction;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.paging.CommonLimitOffsetImpl", m17801f = "LimitOffsetPagingSource.kt", m17802l = {100, 102}, m17803m = "load")
    /* renamed from: androidx.room.paging.CommonLimitOffsetImpl$load$1 */
    public static final class C45811 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ CommonLimitOffsetImpl<Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45811(CommonLimitOffsetImpl<Value> commonLimitOffsetImpl, InterfaceC9324c<? super C45811> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = commonLimitOffsetImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.load(null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.paging.CommonLimitOffsetImpl$load$2", m17801f = "LimitOffsetPagingSource.kt", m17802l = {87}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.paging.CommonLimitOffsetImpl$load$2 */
    public static final class C45822 extends SuspendLambda implements InterfaceC10574p {
        int label;
        final /* synthetic */ CommonLimitOffsetImpl<Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45822(CommonLimitOffsetImpl<Value> commonLimitOffsetImpl, InterfaceC9324c<? super C45822> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = commonLimitOffsetImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C45822(this.this$0, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C45822) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InvalidationTracker invalidationTracker = ((CommonLimitOffsetImpl) this.this$0).f1916db.getInvalidationTracker();
                String[] strArr = ((CommonLimitOffsetImpl) this.this$0).tables;
                InterfaceC9266c interfaceC9266cCreateFlow = invalidationTracker.createFlow((String[]) Arrays.copyOf(strArr, strArr.length), false);
                final CommonLimitOffsetImpl<Value> commonLimitOffsetImpl = this.this$0;
                InterfaceC9267d interfaceC9267d = new InterfaceC9267d() { // from class: androidx.room.paging.CommonLimitOffsetImpl.load.2.1
                    @Override // p169l8.InterfaceC9267d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC9324c interfaceC9324c) {
                        return emit((Set<String>) obj2, (InterfaceC9324c<? super C8736p>) interfaceC9324c);
                    }

                    public final Object emit(Set<String> set, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                        if (((CommonLimitOffsetImpl) commonLimitOffsetImpl).pagingSource.getInvalid()) {
                            throw new CancellationException("PagingSource is invalid");
                        }
                        ((CommonLimitOffsetImpl) commonLimitOffsetImpl).pagingSource.invalidate();
                        return C8736p.f16368a;
                    }
                };
                this.label = 1;
                if (interfaceC9266cCreateFlow.collect(interfaceC9267d, this) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "androidx.room.paging.CommonLimitOffsetImpl", m17801f = "LimitOffsetPagingSource.kt", m17802l = {139, 147}, m17803m = "nonInitialLoad")
    /* renamed from: androidx.room.paging.CommonLimitOffsetImpl$nonInitialLoad$1 */
    public static final class C45831 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ CommonLimitOffsetImpl<Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45831(CommonLimitOffsetImpl<Value> commonLimitOffsetImpl, InterfaceC9324c<? super C45831> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = commonLimitOffsetImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.nonInitialLoad(null, 0, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.paging.CommonLimitOffsetImpl$nonInitialLoad$2", m17801f = "LimitOffsetPagingSource.kt", m17802l = {148}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.paging.CommonLimitOffsetImpl$nonInitialLoad$2 */
    public static final class C45842 extends SuspendLambda implements InterfaceC10574p {
        int label;
        final /* synthetic */ CommonLimitOffsetImpl<Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45842(CommonLimitOffsetImpl<Value> commonLimitOffsetImpl, InterfaceC9324c<? super C45842> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = commonLimitOffsetImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C45842(this.this$0, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C45842) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InvalidationTracker invalidationTracker = ((CommonLimitOffsetImpl) this.this$0).f1916db.getInvalidationTracker();
                String[] strArr = ((CommonLimitOffsetImpl) this.this$0).tables;
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                this.label = 1;
                obj = invalidationTracker.refresh(strArr2, this);
                if (obj == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                ((CommonLimitOffsetImpl) this.this$0).pagingSource.invalidate();
            }
            return C8736p.f16368a;
        }
    }

    public CommonLimitOffsetImpl(String[] tables, LimitOffsetPagingSource<Value> pagingSource, InterfaceC10575q convertRows) {
        AbstractC9133u.m16133g(tables, "tables");
        AbstractC9133u.m16133g(pagingSource, "pagingSource");
        AbstractC9133u.m16133g(convertRows, "convertRows");
        this.tables = tables;
        this.pagingSource = pagingSource;
        this.convertRows = convertRows;
        this.f1916db = pagingSource.getDb();
        this.sourceQuery = pagingSource.getSourceQuery();
        this.itemCount = new AtomicInteger(-1);
        this.invalidationFlowStarted = new AtomicBoolean(false);
        pagingSource.registerInvalidatedCallback(new InterfaceC10559a() { // from class: androidx.room.paging.a
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return CommonLimitOffsetImpl._init_$lambda$0(this.f1918a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p _init_$lambda$0(CommonLimitOffsetImpl commonLimitOffsetImpl) {
        InterfaceC9212n interfaceC9212n = commonLimitOffsetImpl.invalidationFlowJob;
        if (interfaceC9212n != null) {
            InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
        }
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initialLoad(PagingSource.LoadParams<Integer> loadParams, InterfaceC9324c<? super PagingSource.LoadResult<Integer, Value>> interfaceC9324c) {
        return RoomDatabaseKt.useReaderConnection(this.f1916db, new C45802(this, loadParams, null), interfaceC9324c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (p135i8.AbstractC8833f.m14848g(r8, r2, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object nonInitialLoad(androidx.paging.PagingSource.LoadParams<java.lang.Integer> r6, int r7, p179m7.InterfaceC9324c<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, Value>> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.room.paging.CommonLimitOffsetImpl.C45831
            if (r0 == 0) goto L13
            r0 = r8
            androidx.room.paging.CommonLimitOffsetImpl$nonInitialLoad$1 r0 = (androidx.room.paging.CommonLimitOffsetImpl.C45831) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
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
            kotlin.AbstractC9079b.m15926b(r8)
            goto L78
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.L$0
            androidx.room.paging.CommonLimitOffsetImpl r6 = (androidx.room.paging.CommonLimitOffsetImpl) r6
            kotlin.AbstractC9079b.m15926b(r8)
            r7 = r6
            goto L58
        L45:
            kotlin.AbstractC9079b.m15926b(r8)
            androidx.room.RoomRawQuery r8 = r5.sourceQuery
            x7.q r2 = r5.convertRows
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
            androidx.room.RoomDatabase r8 = r7.f1916db
            i8.b0 r8 = r8.getCoroutineScope()
            kotlin.coroutines.d r8 = r8.getCoroutineContext()
            androidx.room.paging.CommonLimitOffsetImpl$nonInitialLoad$2 r2 = new androidx.room.paging.CommonLimitOffsetImpl$nonInitialLoad$2
            r4 = 0
            r2.<init>(r7, r4)
            r0.L$0 = r7
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r8 = p135i8.AbstractC8833f.m14848g(r8, r2, r0)
            if (r8 != r1) goto L78
        L77:
            return r1
        L78:
            androidx.room.paging.LimitOffsetPagingSource<Value> r7 = r7.pagingSource
            boolean r7 = r7.getInvalid()
            if (r7 == 0) goto L87
            androidx.paging.PagingSource$LoadResult$Invalid<java.lang.Object, java.lang.Object> r6 = androidx.room.paging.CommonLimitOffsetImpl.INVALID
            java.lang.String r7 = "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Invalid<kotlin.Int, Value of androidx.room.paging.CommonLimitOffsetImpl>"
            kotlin.jvm.internal.AbstractC9133u.m16131e(r6, r7)
        L87:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.paging.CommonLimitOffsetImpl.nonInitialLoad(androidx.paging.PagingSource$LoadParams, int, m7.c):java.lang.Object");
    }

    public final AtomicInteger getItemCount$room_paging_release() {
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
    public final java.lang.Object load(androidx.paging.PagingSource.LoadParams<java.lang.Integer> r12, p179m7.InterfaceC9324c<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, Value>> r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof androidx.room.paging.CommonLimitOffsetImpl.C45811
            if (r0 == 0) goto L13
            r0 = r13
            androidx.room.paging.CommonLimitOffsetImpl$load$1 r0 = (androidx.room.paging.CommonLimitOffsetImpl.C45811) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.AbstractC9079b.m15926b(r13)     // Catch: java.lang.Exception -> L2c
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
            kotlin.AbstractC9079b.m15926b(r13)     // Catch: java.lang.Exception -> L2c
            goto L6f
        L3b:
            kotlin.AbstractC9079b.m15926b(r13)
            java.util.concurrent.atomic.AtomicBoolean r13 = r11.invalidationFlowStarted
            r2 = 0
            boolean r13 = r13.compareAndSet(r2, r4)
            if (r13 == 0) goto L5d
            androidx.room.RoomDatabase r13 = r11.f1916db
            i8.b0 r5 = r13.getCoroutineScope()
            androidx.room.paging.CommonLimitOffsetImpl$load$2 r8 = new androidx.room.paging.CommonLimitOffsetImpl$load$2
            r13 = 0
            r8.<init>(r11, r13)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            kotlinx.coroutines.n r13 = p135i8.AbstractC8833f.m14845d(r5, r6, r7, r8, r9, r10)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.paging.CommonLimitOffsetImpl.load(androidx.paging.PagingSource$LoadParams, m7.c):java.lang.Object");
    }
}
