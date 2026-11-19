package androidx.room.support;

import androidx.room.RoomDatabase;
import androidx.sqlite.p018db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class QueryInterceptorStatement implements SupportSQLiteStatement {
    private final List<Object> bindArgsCache;
    private final SupportSQLiteStatement delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final InterfaceC8822b0 queryCallbackScope;
    private final String sqlStatement;

    @InterfaceC9539d(m17800c = "androidx.room.support.QueryInterceptorStatement$execute$1", m17801f = "QueryInterceptorStatement.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorStatement$execute$1 */
    public static final class C46201 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ List<Object> $argsCopy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46201(List<? extends Object> list, InterfaceC9324c<? super C46201> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$argsCopy = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return QueryInterceptorStatement.this.new C46201(this.$argsCopy, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C46201) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            QueryInterceptorStatement.this.queryCallback.onQuery(QueryInterceptorStatement.this.sqlStatement, this.$argsCopy);
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.support.QueryInterceptorStatement$executeInsert$1", m17801f = "QueryInterceptorStatement.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorStatement$executeInsert$1 */
    public static final class C46211 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ List<Object> $argsCopy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46211(List<? extends Object> list, InterfaceC9324c<? super C46211> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$argsCopy = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return QueryInterceptorStatement.this.new C46211(this.$argsCopy, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C46211) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            QueryInterceptorStatement.this.queryCallback.onQuery(QueryInterceptorStatement.this.sqlStatement, this.$argsCopy);
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.support.QueryInterceptorStatement$executeUpdateDelete$1", m17801f = "QueryInterceptorStatement.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorStatement$executeUpdateDelete$1 */
    public static final class C46221 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ List<Object> $argsCopy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46221(List<? extends Object> list, InterfaceC9324c<? super C46221> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$argsCopy = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return QueryInterceptorStatement.this.new C46221(this.$argsCopy, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C46221) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            QueryInterceptorStatement.this.queryCallback.onQuery(QueryInterceptorStatement.this.sqlStatement, this.$argsCopy);
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.support.QueryInterceptorStatement$simpleQueryForLong$1", m17801f = "QueryInterceptorStatement.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorStatement$simpleQueryForLong$1 */
    public static final class C46231 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ List<Object> $argsCopy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46231(List<? extends Object> list, InterfaceC9324c<? super C46231> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$argsCopy = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return QueryInterceptorStatement.this.new C46231(this.$argsCopy, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C46231) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            QueryInterceptorStatement.this.queryCallback.onQuery(QueryInterceptorStatement.this.sqlStatement, this.$argsCopy);
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.support.QueryInterceptorStatement$simpleQueryForString$1", m17801f = "QueryInterceptorStatement.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorStatement$simpleQueryForString$1 */
    public static final class C46241 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ List<Object> $argsCopy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46241(List<? extends Object> list, InterfaceC9324c<? super C46241> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$argsCopy = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return QueryInterceptorStatement.this.new C46241(this.$argsCopy, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C46241) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            QueryInterceptorStatement.this.queryCallback.onQuery(QueryInterceptorStatement.this.sqlStatement, this.$argsCopy);
            return C8736p.f16368a;
        }
    }

    public QueryInterceptorStatement(SupportSQLiteStatement delegate, String sqlStatement, InterfaceC8822b0 queryCallbackScope, RoomDatabase.QueryCallback queryCallback) {
        AbstractC9133u.m16133g(delegate, "delegate");
        AbstractC9133u.m16133g(sqlStatement, "sqlStatement");
        AbstractC9133u.m16133g(queryCallbackScope, "queryCallbackScope");
        AbstractC9133u.m16133g(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.sqlStatement = sqlStatement;
        this.queryCallbackScope = queryCallbackScope;
        this.queryCallback = queryCallback;
        this.bindArgsCache = new ArrayList();
    }

    private final void saveArgsToCache(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 >= this.bindArgsCache.size()) {
            int size = (i11 - this.bindArgsCache.size()) + 1;
            for (int i12 = 0; i12 < size; i12++) {
                this.bindArgsCache.add(null);
            }
        }
        this.bindArgsCache.set(i11, obj);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    public void bindBlob(int i10, byte[] value) {
        AbstractC9133u.m16133g(value, "value");
        saveArgsToCache(i10, value);
        this.delegate.bindBlob(i10, value);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    public void bindDouble(int i10, double d10) {
        saveArgsToCache(i10, Double.valueOf(d10));
        this.delegate.bindDouble(i10, d10);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    public void bindLong(int i10, long j10) {
        saveArgsToCache(i10, Long.valueOf(j10));
        this.delegate.bindLong(i10, j10);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    public void bindNull(int i10) {
        saveArgsToCache(i10, null);
        this.delegate.bindNull(i10);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    public void bindString(int i10, String value) {
        AbstractC9133u.m16133g(value, "value");
        saveArgsToCache(i10, value);
        this.delegate.bindString(i10, value);
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteProgram
    public void clearBindings() {
        this.bindArgsCache.clear();
        this.delegate.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteStatement
    public void execute() {
        AbstractC8839h.m14861d(this.queryCallbackScope, null, null, new C46201(AbstractC8778f0.m14544U0(this.bindArgsCache), null), 3, null);
        this.delegate.execute();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteStatement
    public long executeInsert() {
        AbstractC8839h.m14861d(this.queryCallbackScope, null, null, new C46211(AbstractC8778f0.m14544U0(this.bindArgsCache), null), 3, null);
        return this.delegate.executeInsert();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        AbstractC8839h.m14861d(this.queryCallbackScope, null, null, new C46221(AbstractC8778f0.m14544U0(this.bindArgsCache), null), 3, null);
        return this.delegate.executeUpdateDelete();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteStatement
    public long simpleQueryForLong() {
        AbstractC8839h.m14861d(this.queryCallbackScope, null, null, new C46231(AbstractC8778f0.m14544U0(this.bindArgsCache), null), 3, null);
        return this.delegate.simpleQueryForLong();
    }

    @Override // androidx.sqlite.p018db.SupportSQLiteStatement
    public String simpleQueryForString() {
        AbstractC8839h.m14861d(this.queryCallbackScope, null, null, new C46241(AbstractC8778f0.m14544U0(this.bindArgsCache), null), 3, null);
        return this.delegate.simpleQueryForString();
    }
}
