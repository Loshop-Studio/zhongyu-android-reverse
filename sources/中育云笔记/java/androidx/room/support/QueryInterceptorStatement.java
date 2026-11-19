package androidx.room.support;

import androidx.room.RoomDatabase;
import androidx.sqlite.p019db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class QueryInterceptorStatement implements SupportSQLiteStatement {
    private final List<Object> bindArgsCache;
    private final SupportSQLiteStatement delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final InterfaceC11122i0 queryCallbackScope;
    private final String sqlStatement;

    @InterfaceC11829d(m26210c = "androidx.room.support.QueryInterceptorStatement$execute$1", m26211f = "QueryInterceptorStatement.android.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorStatement$execute$1 */
    public static final class C45681 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ List<Object> $argsCopy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45681(List<? extends Object> list, InterfaceC11588c<? super C45681> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$argsCopy = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return QueryInterceptorStatement.this.new C45681(this.$argsCopy, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            QueryInterceptorStatement.this.queryCallback.onQuery(QueryInterceptorStatement.this.sqlStatement, this.$argsCopy);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C45681) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.support.QueryInterceptorStatement$executeInsert$1", m26211f = "QueryInterceptorStatement.android.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorStatement$executeInsert$1 */
    public static final class C45691 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ List<Object> $argsCopy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45691(List<? extends Object> list, InterfaceC11588c<? super C45691> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$argsCopy = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return QueryInterceptorStatement.this.new C45691(this.$argsCopy, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            QueryInterceptorStatement.this.queryCallback.onQuery(QueryInterceptorStatement.this.sqlStatement, this.$argsCopy);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C45691) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.support.QueryInterceptorStatement$executeUpdateDelete$1", m26211f = "QueryInterceptorStatement.android.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorStatement$executeUpdateDelete$1 */
    public static final class C45701 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ List<Object> $argsCopy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45701(List<? extends Object> list, InterfaceC11588c<? super C45701> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$argsCopy = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return QueryInterceptorStatement.this.new C45701(this.$argsCopy, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            QueryInterceptorStatement.this.queryCallback.onQuery(QueryInterceptorStatement.this.sqlStatement, this.$argsCopy);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C45701) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.support.QueryInterceptorStatement$simpleQueryForLong$1", m26211f = "QueryInterceptorStatement.android.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorStatement$simpleQueryForLong$1 */
    public static final class C45711 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ List<Object> $argsCopy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45711(List<? extends Object> list, InterfaceC11588c<? super C45711> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$argsCopy = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return QueryInterceptorStatement.this.new C45711(this.$argsCopy, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            QueryInterceptorStatement.this.queryCallback.onQuery(QueryInterceptorStatement.this.sqlStatement, this.$argsCopy);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C45711) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.support.QueryInterceptorStatement$simpleQueryForString$1", m26211f = "QueryInterceptorStatement.android.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.support.QueryInterceptorStatement$simpleQueryForString$1 */
    public static final class C45721 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ List<Object> $argsCopy;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45721(List<? extends Object> list, InterfaceC11588c<? super C45721> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$argsCopy = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return QueryInterceptorStatement.this.new C45721(this.$argsCopy, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            QueryInterceptorStatement.this.queryCallback.onQuery(QueryInterceptorStatement.this.sqlStatement, this.$argsCopy);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C45721) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public QueryInterceptorStatement(SupportSQLiteStatement delegate, String sqlStatement, InterfaceC11122i0 queryCallbackScope, RoomDatabase.QueryCallback queryCallback) {
        AbstractC9979u.m20294g(delegate, "delegate");
        AbstractC9979u.m20294g(sqlStatement, "sqlStatement");
        AbstractC9979u.m20294g(queryCallbackScope, "queryCallbackScope");
        AbstractC9979u.m20294g(queryCallback, "queryCallback");
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

    @Override // androidx.sqlite.p019db.SupportSQLiteProgram
    public void bindBlob(int i10, byte[] value) {
        AbstractC9979u.m20294g(value, "value");
        saveArgsToCache(i10, value);
        this.delegate.bindBlob(i10, value);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteProgram
    public void bindDouble(int i10, double d10) {
        saveArgsToCache(i10, Double.valueOf(d10));
        this.delegate.bindDouble(i10, d10);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteProgram
    public void bindLong(int i10, long j10) {
        saveArgsToCache(i10, Long.valueOf(j10));
        this.delegate.bindLong(i10, j10);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteProgram
    public void bindNull(int i10) {
        saveArgsToCache(i10, null);
        this.delegate.bindNull(i10);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteProgram
    public void bindString(int i10, String value) {
        AbstractC9979u.m20294g(value, "value");
        saveArgsToCache(i10, value);
        this.delegate.bindString(i10, value);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteProgram
    public void clearBindings() {
        this.bindArgsCache.clear();
        this.delegate.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteStatement
    public void execute() {
        AbstractC11117h.m24726d(this.queryCallbackScope, null, null, new C45681(AbstractC10947g0.m23922X0(this.bindArgsCache), null), 3, null);
        this.delegate.execute();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteStatement
    public long executeInsert() {
        AbstractC11117h.m24726d(this.queryCallbackScope, null, null, new C45691(AbstractC10947g0.m23922X0(this.bindArgsCache), null), 3, null);
        return this.delegate.executeInsert();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        AbstractC11117h.m24726d(this.queryCallbackScope, null, null, new C45701(AbstractC10947g0.m23922X0(this.bindArgsCache), null), 3, null);
        return this.delegate.executeUpdateDelete();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteStatement
    public long simpleQueryForLong() {
        AbstractC11117h.m24726d(this.queryCallbackScope, null, null, new C45711(AbstractC10947g0.m23922X0(this.bindArgsCache), null), 3, null);
        return this.delegate.simpleQueryForLong();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteStatement
    public String simpleQueryForString() {
        AbstractC11117h.m24726d(this.queryCallbackScope, null, null, new C45721(AbstractC10947g0.m23922X0(this.bindArgsCache), null), 3, null);
        return this.delegate.simpleQueryForString();
    }
}
