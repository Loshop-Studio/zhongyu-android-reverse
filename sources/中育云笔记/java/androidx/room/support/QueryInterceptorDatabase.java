package androidx.room.support;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.RoomDatabase;
import androidx.sqlite.p019db.SupportSQLiteDatabase;
import androidx.sqlite.p019db.SupportSQLiteQuery;
import androidx.sqlite.p019db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10968r;
import p325rc.AbstractC10978w;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class QueryInterceptorDatabase implements SupportSQLiteDatabase {
    private final SupportSQLiteDatabase delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final InterfaceC11122i0 queryCallbackScope;

    @InterfaceC11829d(m26210c = "androidx.room.support.QueryInterceptorDatabase$beginTransaction$1", m26211f = "QueryInterceptorDatabase.android.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$beginTransaction$1 */
    public static final class C45561 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C45561(InterfaceC11588c<? super C45561> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return QueryInterceptorDatabase.this.new C45561(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery("BEGIN EXCLUSIVE TRANSACTION", AbstractC10978w.m24136n());
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C45561) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.support.QueryInterceptorDatabase$beginTransactionNonExclusive$1", m26211f = "QueryInterceptorDatabase.android.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$beginTransactionNonExclusive$1 */
    public static final class C45571 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C45571(InterfaceC11588c<? super C45571> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return QueryInterceptorDatabase.this.new C45571(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery("BEGIN IMMEDIATE TRANSACTION", AbstractC10978w.m24136n());
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C45571) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListener$1", m26211f = "QueryInterceptorDatabase.android.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListener$1 */
    public static final class C45581 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C45581(InterfaceC11588c<? super C45581> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return QueryInterceptorDatabase.this.new C45581(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery("BEGIN EXCLUSIVE TRANSACTION", AbstractC10978w.m24136n());
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C45581) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListenerNonExclusive$1", m26211f = "QueryInterceptorDatabase.android.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$beginTransactionWithListenerNonExclusive$1 */
    public static final class C45591 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C45591(InterfaceC11588c<? super C45591> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return QueryInterceptorDatabase.this.new C45591(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery("BEGIN IMMEDIATE TRANSACTION", AbstractC10978w.m24136n());
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C45591) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.support.QueryInterceptorDatabase$endTransaction$1", m26211f = "QueryInterceptorDatabase.android.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$endTransaction$1 */
    public static final class C45601 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C45601(InterfaceC11588c<? super C45601> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return QueryInterceptorDatabase.this.new C45601(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery("END TRANSACTION", AbstractC10978w.m24136n());
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C45601) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.support.QueryInterceptorDatabase$execSQL$1", m26211f = "QueryInterceptorDatabase.android.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$execSQL$1 */
    public static final class C45611 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ String $sql;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45611(String str, InterfaceC11588c<? super C45611> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$sql = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return QueryInterceptorDatabase.this.new C45611(this.$sql, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery(this.$sql, AbstractC10978w.m24136n());
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C45611) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.support.QueryInterceptorDatabase$execSQL$2", m26211f = "QueryInterceptorDatabase.android.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$execSQL$2 */
    public static final class C45622 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ List<Object> $argsCopy;
        final /* synthetic */ String $sql;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45622(String str, List<? extends Object> list, InterfaceC11588c<? super C45622> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$sql = str;
            this.$argsCopy = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return QueryInterceptorDatabase.this.new C45622(this.$sql, this.$argsCopy, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery(this.$sql, this.$argsCopy);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C45622) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.support.QueryInterceptorDatabase$query$1", m26211f = "QueryInterceptorDatabase.android.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$query$1 */
    public static final class C45631 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ String $query;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45631(String str, InterfaceC11588c<? super C45631> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$query = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return QueryInterceptorDatabase.this.new C45631(this.$query, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery(this.$query, AbstractC10978w.m24136n());
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C45631) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.support.QueryInterceptorDatabase$query$2", m26211f = "QueryInterceptorDatabase.android.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$query$2 */
    public static final class C45642 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ List<Object> $argsCopy;
        final /* synthetic */ String $query;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45642(String str, List<? extends Object> list, InterfaceC11588c<? super C45642> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$query = str;
            this.$argsCopy = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return QueryInterceptorDatabase.this.new C45642(this.$query, this.$argsCopy, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery(this.$query, this.$argsCopy);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C45642) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.support.QueryInterceptorDatabase$query$3", m26211f = "QueryInterceptorDatabase.android.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$query$3 */
    public static final class C45653 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ SupportSQLiteQuery $query;
        final /* synthetic */ QueryInterceptorProgram $queryInterceptorProgram;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45653(SupportSQLiteQuery supportSQLiteQuery, QueryInterceptorProgram queryInterceptorProgram, InterfaceC11588c<? super C45653> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$query = supportSQLiteQuery;
            this.$queryInterceptorProgram = queryInterceptorProgram;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return QueryInterceptorDatabase.this.new C45653(this.$query, this.$queryInterceptorProgram, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery(this.$query.getSql(), this.$queryInterceptorProgram.getBindArgsCache$room_runtime_release());
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C45653) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.support.QueryInterceptorDatabase$query$4", m26211f = "QueryInterceptorDatabase.android.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$query$4 */
    public static final class C45664 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ SupportSQLiteQuery $query;
        final /* synthetic */ QueryInterceptorProgram $queryInterceptorProgram;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45664(SupportSQLiteQuery supportSQLiteQuery, QueryInterceptorProgram queryInterceptorProgram, InterfaceC11588c<? super C45664> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$query = supportSQLiteQuery;
            this.$queryInterceptorProgram = queryInterceptorProgram;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return QueryInterceptorDatabase.this.new C45664(this.$query, this.$queryInterceptorProgram, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery(this.$query.getSql(), this.$queryInterceptorProgram.getBindArgsCache$room_runtime_release());
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C45664) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.support.QueryInterceptorDatabase$setTransactionSuccessful$1", m26211f = "QueryInterceptorDatabase.android.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorDatabase$setTransactionSuccessful$1 */
    public static final class C45671 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C45671(InterfaceC11588c<? super C45671> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return QueryInterceptorDatabase.this.new C45671(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            QueryInterceptorDatabase.this.queryCallback.onQuery("TRANSACTION SUCCESSFUL", AbstractC10978w.m24136n());
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C45671) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public QueryInterceptorDatabase(SupportSQLiteDatabase delegate, InterfaceC11122i0 queryCallbackScope, RoomDatabase.QueryCallback queryCallback) {
        AbstractC9979u.m20294g(delegate, "delegate");
        AbstractC9979u.m20294g(queryCallbackScope, "queryCallbackScope");
        AbstractC9979u.m20294g(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.queryCallbackScope = queryCallbackScope;
        this.queryCallback = queryCallback;
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void beginTransaction() {
        AbstractC11117h.m24726d(this.queryCallbackScope, null, null, new C45561(null), 3, null);
        this.delegate.beginTransaction();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        AbstractC11117h.m24726d(this.queryCallbackScope, null, null, new C45571(null), 3, null);
        this.delegate.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void beginTransactionReadOnly() {
        this.delegate.beginTransactionReadOnly();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void beginTransactionWithListener(SQLiteTransactionListener transactionListener) {
        AbstractC9979u.m20294g(transactionListener, "transactionListener");
        AbstractC11117h.m24726d(this.queryCallbackScope, null, null, new C45581(null), 3, null);
        this.delegate.beginTransactionWithListener(transactionListener);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener transactionListener) {
        AbstractC9979u.m20294g(transactionListener, "transactionListener");
        AbstractC11117h.m24726d(this.queryCallbackScope, null, null, new C45591(null), 3, null);
        this.delegate.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void beginTransactionWithListenerReadOnly(SQLiteTransactionListener transactionListener) {
        AbstractC9979u.m20294g(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListenerReadOnly(transactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public SupportSQLiteStatement compileStatement(String sql) {
        AbstractC9979u.m20294g(sql, "sql");
        return new QueryInterceptorStatement(this.delegate.compileStatement(sql), sql, this.queryCallbackScope, this.queryCallback);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public int delete(String table, String str, Object[] objArr) {
        AbstractC9979u.m20294g(table, "table");
        return this.delegate.delete(table, str, objArr);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void disableWriteAheadLogging() {
        this.delegate.disableWriteAheadLogging();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public boolean enableWriteAheadLogging() {
        return this.delegate.enableWriteAheadLogging();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void endTransaction() {
        AbstractC11117h.m24726d(this.queryCallbackScope, null, null, new C45601(null), 3, null);
        this.delegate.endTransaction();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void execPerConnectionSQL(String sql, @SuppressLint({"ArrayReturn"}) Object[] objArr) {
        AbstractC9979u.m20294g(sql, "sql");
        this.delegate.execPerConnectionSQL(sql, objArr);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void execSQL(String sql) {
        AbstractC9979u.m20294g(sql, "sql");
        AbstractC11117h.m24726d(this.queryCallbackScope, null, null, new C45611(sql, null), 3, null);
        this.delegate.execSQL(sql);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public List<Pair<String, String>> getAttachedDbs() {
        return this.delegate.getAttachedDbs();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public long getMaximumSize() {
        return this.delegate.getMaximumSize();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public long getPageSize() {
        return this.delegate.getPageSize();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public String getPath() {
        return this.delegate.getPath();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public int getVersion() {
        return this.delegate.getVersion();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public boolean inTransaction() {
        return this.delegate.inTransaction();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public long insert(String table, int i10, ContentValues values) {
        AbstractC9979u.m20294g(table, "table");
        AbstractC9979u.m20294g(values, "values");
        return this.delegate.insert(table, i10, values);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        return this.delegate.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public boolean isExecPerConnectionSQLSupported() {
        return this.delegate.isExecPerConnectionSQLSupported();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public boolean isReadOnly() {
        return this.delegate.isReadOnly();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public boolean isWriteAheadLoggingEnabled() {
        return this.delegate.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public boolean needUpgrade(int i10) {
        return this.delegate.needUpgrade(i10);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public Cursor query(String query) {
        AbstractC9979u.m20294g(query, "query");
        AbstractC11117h.m24726d(this.queryCallbackScope, null, null, new C45631(query, null), 3, null);
        return this.delegate.query(query);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void setForeignKeyConstraintsEnabled(boolean z10) {
        this.delegate.setForeignKeyConstraintsEnabled(z10);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void setLocale(Locale locale) {
        AbstractC9979u.m20294g(locale, "locale");
        this.delegate.setLocale(locale);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void setMaxSqlCacheSize(int i10) {
        this.delegate.setMaxSqlCacheSize(i10);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public long setMaximumSize(long j10) {
        return this.delegate.setMaximumSize(j10);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void setPageSize(long j10) {
        this.delegate.setPageSize(j10);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        AbstractC11117h.m24726d(this.queryCallbackScope, null, null, new C45671(null), 3, null);
        this.delegate.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void setVersion(int i10) {
        this.delegate.setVersion(i10);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public int update(String table, int i10, ContentValues values, String str, Object[] objArr) {
        AbstractC9979u.m20294g(table, "table");
        AbstractC9979u.m20294g(values, "values");
        return this.delegate.update(table, i10, values, str, objArr);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
        return this.delegate.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely(long j10) {
        return this.delegate.yieldIfContendedSafely(j10);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void execSQL(String sql, Object[] bindArgs) {
        AbstractC9979u.m20294g(sql, "sql");
        AbstractC9979u.m20294g(bindArgs, "bindArgs");
        AbstractC11117h.m24726d(this.queryCallbackScope, null, null, new C45622(sql, AbstractC10968r.m24097p1(bindArgs), null), 3, null);
        this.delegate.execSQL(sql, bindArgs);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public Cursor query(String query, Object[] bindArgs) {
        AbstractC9979u.m20294g(query, "query");
        AbstractC9979u.m20294g(bindArgs, "bindArgs");
        AbstractC11117h.m24726d(this.queryCallbackScope, null, null, new C45642(query, AbstractC10968r.m24097p1(bindArgs), null), 3, null);
        return this.delegate.query(query, bindArgs);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public Cursor query(SupportSQLiteQuery query) {
        AbstractC9979u.m20294g(query, "query");
        QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        query.bindTo(queryInterceptorProgram);
        AbstractC11117h.m24726d(this.queryCallbackScope, null, null, new C45653(query, queryInterceptorProgram, null), 3, null);
        return this.delegate.query(query);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public Cursor query(SupportSQLiteQuery query, CancellationSignal cancellationSignal) {
        AbstractC9979u.m20294g(query, "query");
        QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        query.bindTo(queryInterceptorProgram);
        AbstractC11117h.m24726d(this.queryCallbackScope, null, null, new C45664(query, queryInterceptorProgram, null), 3, null);
        return this.delegate.query(query);
    }
}
