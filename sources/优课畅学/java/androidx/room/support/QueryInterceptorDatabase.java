package androidx.room.support;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.RoomDatabase;
import androidx.sqlite.p018db.SupportSQLiteDatabase;
import androidx.sqlite.p018db.SupportSQLiteQuery;
import androidx.sqlite.p018db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8809v;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class QueryInterceptorDatabase implements SupportSQLiteDatabase {
    private final SupportSQLiteDatabase delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final InterfaceC8822b0 queryCallbackScope;

    @InterfaceC9539d(m17800c = "androidx.room.support.QueryInterceptorDatabase$beginTransaction$1", m17801f = "QueryInterceptorDatabase.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$beginTransaction$1 */
    public static final class C46081 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C46081(InterfaceC9324c<? super C46081> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return QueryInterceptorDatabase.this.new C46081(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C46081) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery("BEGIN EXCLUSIVE TRANSACTION", AbstractC8809v.m14771n());
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.support.QueryInterceptorDatabase$beginTransactionNonExclusive$1", m17801f = "QueryInterceptorDatabase.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$beginTransactionNonExclusive$1 */
    public static final class C46091 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C46091(InterfaceC9324c<? super C46091> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return QueryInterceptorDatabase.this.new C46091(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C46091) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery("BEGIN IMMEDIATE TRANSACTION", AbstractC8809v.m14771n());
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListener$1", m17801f = "QueryInterceptorDatabase.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListener$1 */
    public static final class C46101 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C46101(InterfaceC9324c<? super C46101> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return QueryInterceptorDatabase.this.new C46101(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C46101) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery("BEGIN EXCLUSIVE TRANSACTION", AbstractC8809v.m14771n());
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListenerNonExclusive$1", m17801f = "QueryInterceptorDatabase.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListenerNonExclusive$1 */
    public static final class C46111 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C46111(InterfaceC9324c<? super C46111> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return QueryInterceptorDatabase.this.new C46111(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C46111) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery("BEGIN IMMEDIATE TRANSACTION", AbstractC8809v.m14771n());
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.support.QueryInterceptorDatabase$endTransaction$1", m17801f = "QueryInterceptorDatabase.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$endTransaction$1 */
    public static final class C46121 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C46121(InterfaceC9324c<? super C46121> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return QueryInterceptorDatabase.this.new C46121(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C46121) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery("END TRANSACTION", AbstractC8809v.m14771n());
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.support.QueryInterceptorDatabase$execSQL$1", m17801f = "QueryInterceptorDatabase.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$execSQL$1 */
    public static final class C46131 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ String $sql;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46131(String str, InterfaceC9324c<? super C46131> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$sql = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return QueryInterceptorDatabase.this.new C46131(this.$sql, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C46131) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery(this.$sql, AbstractC8809v.m14771n());
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.support.QueryInterceptorDatabase$execSQL$2", m17801f = "QueryInterceptorDatabase.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$execSQL$2 */
    public static final class C46142 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ List<Object> $argsCopy;
        final /* synthetic */ String $sql;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46142(String str, List<? extends Object> list, InterfaceC9324c<? super C46142> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$sql = str;
            this.$argsCopy = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return QueryInterceptorDatabase.this.new C46142(this.$sql, this.$argsCopy, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C46142) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery(this.$sql, this.$argsCopy);
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.support.QueryInterceptorDatabase$query$1", m17801f = "QueryInterceptorDatabase.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$query$1 */
    public static final class C46151 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ String $query;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46151(String str, InterfaceC9324c<? super C46151> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$query = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return QueryInterceptorDatabase.this.new C46151(this.$query, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C46151) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery(this.$query, AbstractC8809v.m14771n());
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.support.QueryInterceptorDatabase$query$2", m17801f = "QueryInterceptorDatabase.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$query$2 */
    public static final class C46162 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ List<Object> $argsCopy;
        final /* synthetic */ String $query;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46162(String str, List<? extends Object> list, InterfaceC9324c<? super C46162> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$query = str;
            this.$argsCopy = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return QueryInterceptorDatabase.this.new C46162(this.$query, this.$argsCopy, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C46162) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery(this.$query, this.$argsCopy);
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.support.QueryInterceptorDatabase$query$3", m17801f = "QueryInterceptorDatabase.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$query$3 */
    public static final class C46173 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ SupportSQLiteQuery $query;
        final /* synthetic */ QueryInterceptorProgram $queryInterceptorProgram;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46173(SupportSQLiteQuery supportSQLiteQuery, QueryInterceptorProgram queryInterceptorProgram, InterfaceC9324c<? super C46173> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$query = supportSQLiteQuery;
            this.$queryInterceptorProgram = queryInterceptorProgram;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return QueryInterceptorDatabase.this.new C46173(this.$query, this.$queryInterceptorProgram, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C46173) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery(this.$query.getSql(), this.$queryInterceptorProgram.getBindArgsCache$room_runtime_release());
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.support.QueryInterceptorDatabase$query$4", m17801f = "QueryInterceptorDatabase.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$query$4 */
    public static final class C46184 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ SupportSQLiteQuery $query;
        final /* synthetic */ QueryInterceptorProgram $queryInterceptorProgram;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46184(SupportSQLiteQuery supportSQLiteQuery, QueryInterceptorProgram queryInterceptorProgram, InterfaceC9324c<? super C46184> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$query = supportSQLiteQuery;
            this.$queryInterceptorProgram = queryInterceptorProgram;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return QueryInterceptorDatabase.this.new C46184(this.$query, this.$queryInterceptorProgram, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C46184) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery(this.$query.getSql(), this.$queryInterceptorProgram.getBindArgsCache$room_runtime_release());
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.support.QueryInterceptorDatabase$setTransactionSuccessful$1", m17801f = "QueryInterceptorDatabase.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$setTransactionSuccessful$1 */
    public static final class C46191 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C46191(InterfaceC9324c<? super C46191> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return QueryInterceptorDatabase.this.new C46191(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C46191) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery("TRANSACTION SUCCESSFUL", AbstractC8809v.m14771n());
            return C8736p.f16368a;
        }
    }

    public QueryInterceptorDatabase(SupportSQLiteDatabase delegate, InterfaceC8822b0 queryCallbackScope, RoomDatabase.QueryCallback queryCallback) {
        AbstractC9133u.m16133g(delegate, "delegate");
        AbstractC9133u.m16133g(queryCallbackScope, "queryCallbackScope");
        AbstractC9133u.m16133g(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.queryCallbackScope = queryCallbackScope;
        this.queryCallback = queryCallback;
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public void beginTransaction() {
        AbstractC8839h.m14861d(this.queryCallbackScope, null, null, new C46081(null), 3, null);
        this.delegate.beginTransaction();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        AbstractC8839h.m14861d(this.queryCallbackScope, null, null, new C46091(null), 3, null);
        this.delegate.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public void beginTransactionReadOnly() {
        this.delegate.beginTransactionReadOnly();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public void beginTransactionWithListener(SQLiteTransactionListener transactionListener) {
        AbstractC9133u.m16133g(transactionListener, "transactionListener");
        AbstractC8839h.m14861d(this.queryCallbackScope, null, null, new C46101(null), 3, null);
        this.delegate.beginTransactionWithListener(transactionListener);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener transactionListener) {
        AbstractC9133u.m16133g(transactionListener, "transactionListener");
        AbstractC8839h.m14861d(this.queryCallbackScope, null, null, new C46111(null), 3, null);
        this.delegate.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public void beginTransactionWithListenerReadOnly(SQLiteTransactionListener transactionListener) {
        AbstractC9133u.m16133g(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListenerReadOnly(transactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public SupportSQLiteStatement compileStatement(String sql) {
        AbstractC9133u.m16133g(sql, "sql");
        return new QueryInterceptorStatement(this.delegate.compileStatement(sql), sql, this.queryCallbackScope, this.queryCallback);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public int delete(String table, String str, Object[] objArr) {
        AbstractC9133u.m16133g(table, "table");
        return this.delegate.delete(table, str, objArr);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public void disableWriteAheadLogging() {
        this.delegate.disableWriteAheadLogging();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public boolean enableWriteAheadLogging() {
        return this.delegate.enableWriteAheadLogging();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public void endTransaction() {
        AbstractC8839h.m14861d(this.queryCallbackScope, null, null, new C46121(null), 3, null);
        this.delegate.endTransaction();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public void execPerConnectionSQL(String sql, @SuppressLint({"ArrayReturn"}) Object[] objArr) {
        AbstractC9133u.m16133g(sql, "sql");
        this.delegate.execPerConnectionSQL(sql, objArr);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public void execSQL(String sql) {
        AbstractC9133u.m16133g(sql, "sql");
        AbstractC8839h.m14861d(this.queryCallbackScope, null, null, new C46131(sql, null), 3, null);
        this.delegate.execSQL(sql);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public List<Pair<String, String>> getAttachedDbs() {
        return this.delegate.getAttachedDbs();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public long getMaximumSize() {
        return this.delegate.getMaximumSize();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public long getPageSize() {
        return this.delegate.getPageSize();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public String getPath() {
        return this.delegate.getPath();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public int getVersion() {
        return this.delegate.getVersion();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public boolean inTransaction() {
        return this.delegate.inTransaction();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public long insert(String table, int i10, ContentValues values) {
        AbstractC9133u.m16133g(table, "table");
        AbstractC9133u.m16133g(values, "values");
        return this.delegate.insert(table, i10, values);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        return this.delegate.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public boolean isExecPerConnectionSQLSupported() {
        return this.delegate.isExecPerConnectionSQLSupported();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public boolean isReadOnly() {
        return this.delegate.isReadOnly();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public boolean isWriteAheadLoggingEnabled() {
        return this.delegate.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public boolean needUpgrade(int i10) {
        return this.delegate.needUpgrade(i10);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public Cursor query(String query) {
        AbstractC9133u.m16133g(query, "query");
        AbstractC8839h.m14861d(this.queryCallbackScope, null, null, new C46151(query, null), 3, null);
        return this.delegate.query(query);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public void setForeignKeyConstraintsEnabled(boolean z10) {
        this.delegate.setForeignKeyConstraintsEnabled(z10);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public void setLocale(Locale locale) {
        AbstractC9133u.m16133g(locale, "locale");
        this.delegate.setLocale(locale);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public void setMaxSqlCacheSize(int i10) {
        this.delegate.setMaxSqlCacheSize(i10);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public long setMaximumSize(long j10) {
        return this.delegate.setMaximumSize(j10);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public void setPageSize(long j10) {
        this.delegate.setPageSize(j10);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        AbstractC8839h.m14861d(this.queryCallbackScope, null, null, new C46191(null), 3, null);
        this.delegate.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public void setVersion(int i10) {
        this.delegate.setVersion(i10);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public int update(String table, int i10, ContentValues values, String str, Object[] objArr) {
        AbstractC9133u.m16133g(table, "table");
        AbstractC9133u.m16133g(values, "values");
        return this.delegate.update(table, i10, values, str, objArr);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
        return this.delegate.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely(long j10) {
        return this.delegate.yieldIfContendedSafely(j10);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public void execSQL(String sql, Object[] bindArgs) {
        AbstractC9133u.m16133g(sql, "sql");
        AbstractC9133u.m16133g(bindArgs, "bindArgs");
        AbstractC8839h.m14861d(this.queryCallbackScope, null, null, new C46142(sql, AbstractC8801r.m14736u1(bindArgs), null), 3, null);
        this.delegate.execSQL(sql, bindArgs);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public Cursor query(String query, Object[] bindArgs) {
        AbstractC9133u.m16133g(query, "query");
        AbstractC9133u.m16133g(bindArgs, "bindArgs");
        AbstractC8839h.m14861d(this.queryCallbackScope, null, null, new C46162(query, AbstractC8801r.m14736u1(bindArgs), null), 3, null);
        return this.delegate.query(query, bindArgs);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public Cursor query(SupportSQLiteQuery query) {
        AbstractC9133u.m16133g(query, "query");
        QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        query.bindTo(queryInterceptorProgram);
        AbstractC8839h.m14861d(this.queryCallbackScope, null, null, new C46173(query, queryInterceptorProgram, null), 3, null);
        return this.delegate.query(query);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteDatabase
    public Cursor query(SupportSQLiteQuery query, CancellationSignal cancellationSignal) {
        AbstractC9133u.m16133g(query, "query");
        QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        query.bindTo(queryInterceptorProgram);
        AbstractC8839h.m14861d(this.queryCallbackScope, null, null, new C46184(query, queryInterceptorProgram, null), 3, null);
        return this.delegate.query(query);
    }
}
