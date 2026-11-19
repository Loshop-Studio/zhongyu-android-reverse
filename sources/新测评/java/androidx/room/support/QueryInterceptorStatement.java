package androidx.room.support;

import androidx.room.RoomDatabase;
import androidx.sqlite.p017db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0011H\u0016J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0004H\u0016J\u0018\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u000fH\u0016J\u001a\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\rH\u0002J\t\u0010\"\u001a\u00020\u000fH\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m13558d2 = {"Landroidx/room/support/QueryInterceptorStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "delegate", "sqlStatement", "", "queryCallbackScope", "Lkotlinx/coroutines/CoroutineScope;", "queryCallback", "Landroidx/room/RoomDatabase$QueryCallback;", "<init>", "(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/String;Lkotlinx/coroutines/CoroutineScope;Landroidx/room/RoomDatabase$QueryCallback;)V", "bindArgsCache", "", "", "execute", "", "executeUpdateDelete", "", "executeInsert", "", "simpleQueryForLong", "simpleQueryForString", "bindNull", "index", "bindLong", "value", "bindDouble", "", "bindString", "bindBlob", "", "clearBindings", "saveArgsToCache", "bindIndex", "close", "room-runtime_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nQueryInterceptorStatement.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryInterceptorStatement.android.kt\nandroidx/room/support/QueryInterceptorStatement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
/* loaded from: classes3.dex */
public final class QueryInterceptorStatement implements SupportSQLiteStatement {
    private final List<Object> bindArgsCache;
    private final SupportSQLiteStatement delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final CoroutineScope queryCallbackScope;
    private final String sqlStatement;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.room.support.QueryInterceptorStatement$execute$1", m13596f = "QueryInterceptorStatement.android.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.room.support.QueryInterceptorStatement$execute$1 */
    public static final class C45341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Object> $argsCopy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45341(List<? extends Object> list, Continuation<? super C45341> continuation) {
            super(2, continuation);
            this.$argsCopy = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QueryInterceptorStatement.this.new C45341(this.$argsCopy, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            QueryInterceptorStatement.this.queryCallback.onQuery(QueryInterceptorStatement.this.sqlStatement, this.$argsCopy);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C45341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.room.support.QueryInterceptorStatement$executeInsert$1", m13596f = "QueryInterceptorStatement.android.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.room.support.QueryInterceptorStatement$executeInsert$1 */
    public static final class C45351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Object> $argsCopy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45351(List<? extends Object> list, Continuation<? super C45351> continuation) {
            super(2, continuation);
            this.$argsCopy = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QueryInterceptorStatement.this.new C45351(this.$argsCopy, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            QueryInterceptorStatement.this.queryCallback.onQuery(QueryInterceptorStatement.this.sqlStatement, this.$argsCopy);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C45351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.room.support.QueryInterceptorStatement$executeUpdateDelete$1", m13596f = "QueryInterceptorStatement.android.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.room.support.QueryInterceptorStatement$executeUpdateDelete$1 */
    public static final class C45361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Object> $argsCopy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45361(List<? extends Object> list, Continuation<? super C45361> continuation) {
            super(2, continuation);
            this.$argsCopy = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QueryInterceptorStatement.this.new C45361(this.$argsCopy, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            QueryInterceptorStatement.this.queryCallback.onQuery(QueryInterceptorStatement.this.sqlStatement, this.$argsCopy);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C45361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.room.support.QueryInterceptorStatement$simpleQueryForLong$1", m13596f = "QueryInterceptorStatement.android.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.room.support.QueryInterceptorStatement$simpleQueryForLong$1 */
    public static final class C45371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Object> $argsCopy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45371(List<? extends Object> list, Continuation<? super C45371> continuation) {
            super(2, continuation);
            this.$argsCopy = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QueryInterceptorStatement.this.new C45371(this.$argsCopy, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            QueryInterceptorStatement.this.queryCallback.onQuery(QueryInterceptorStatement.this.sqlStatement, this.$argsCopy);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C45371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.room.support.QueryInterceptorStatement$simpleQueryForString$1", m13596f = "QueryInterceptorStatement.android.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.room.support.QueryInterceptorStatement$simpleQueryForString$1 */
    public static final class C45381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Object> $argsCopy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45381(List<? extends Object> list, Continuation<? super C45381> continuation) {
            super(2, continuation);
            this.$argsCopy = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QueryInterceptorStatement.this.new C45381(this.$argsCopy, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            QueryInterceptorStatement.this.queryCallback.onQuery(QueryInterceptorStatement.this.sqlStatement, this.$argsCopy);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C45381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public QueryInterceptorStatement(SupportSQLiteStatement delegate, String sqlStatement, CoroutineScope queryCallbackScope, RoomDatabase.QueryCallback queryCallback) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(sqlStatement, "sqlStatement");
        Intrinsics.checkNotNullParameter(queryCallbackScope, "queryCallbackScope");
        Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.sqlStatement = sqlStatement;
        this.queryCallbackScope = queryCallbackScope;
        this.queryCallback = queryCallback;
        this.bindArgsCache = new ArrayList();
    }

    private final void saveArgsToCache(int bindIndex, Object value) {
        int i10 = bindIndex - 1;
        if (i10 >= this.bindArgsCache.size()) {
            int size = (i10 - this.bindArgsCache.size()) + 1;
            for (int i11 = 0; i11 < size; i11++) {
                this.bindArgsCache.add(null);
            }
        }
        this.bindArgsCache.set(i10, value);
    }

    @Override // androidx.sqlite.p017db.SupportSQLiteProgram
    public void bindBlob(int index, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        saveArgsToCache(index, value);
        this.delegate.bindBlob(index, value);
    }

    @Override // androidx.sqlite.p017db.SupportSQLiteProgram
    public void bindDouble(int index, double value) {
        saveArgsToCache(index, Double.valueOf(value));
        this.delegate.bindDouble(index, value);
    }

    @Override // androidx.sqlite.p017db.SupportSQLiteProgram
    public void bindLong(int index, long value) {
        saveArgsToCache(index, Long.valueOf(value));
        this.delegate.bindLong(index, value);
    }

    @Override // androidx.sqlite.p017db.SupportSQLiteProgram
    public void bindNull(int index) {
        saveArgsToCache(index, null);
        this.delegate.bindNull(index);
    }

    @Override // androidx.sqlite.p017db.SupportSQLiteProgram
    public void bindString(int index, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        saveArgsToCache(index, value);
        this.delegate.bindString(index, value);
    }

    @Override // androidx.sqlite.p017db.SupportSQLiteProgram
    public void clearBindings() {
        this.bindArgsCache.clear();
        this.delegate.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // androidx.sqlite.p017db.SupportSQLiteStatement
    public void execute() {
        BuildersKt__Builders_commonKt.launch$default(this.queryCallbackScope, null, null, new C45341(CollectionsKt.toList(this.bindArgsCache), null), 3, null);
        this.delegate.execute();
    }

    @Override // androidx.sqlite.p017db.SupportSQLiteStatement
    public long executeInsert() {
        BuildersKt__Builders_commonKt.launch$default(this.queryCallbackScope, null, null, new C45351(CollectionsKt.toList(this.bindArgsCache), null), 3, null);
        return this.delegate.executeInsert();
    }

    @Override // androidx.sqlite.p017db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        BuildersKt__Builders_commonKt.launch$default(this.queryCallbackScope, null, null, new C45361(CollectionsKt.toList(this.bindArgsCache), null), 3, null);
        return this.delegate.executeUpdateDelete();
    }

    @Override // androidx.sqlite.p017db.SupportSQLiteStatement
    public long simpleQueryForLong() {
        BuildersKt__Builders_commonKt.launch$default(this.queryCallbackScope, null, null, new C45371(CollectionsKt.toList(this.bindArgsCache), null), 3, null);
        return this.delegate.simpleQueryForLong();
    }

    @Override // androidx.sqlite.p017db.SupportSQLiteStatement
    public String simpleQueryForString() {
        BuildersKt__Builders_commonKt.launch$default(this.queryCallbackScope, null, null, new C45381(CollectionsKt.toList(this.bindArgsCache), null), 3, null);
        return this.delegate.simpleQueryForString();
    }
}
