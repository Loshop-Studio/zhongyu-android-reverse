package androidx.sqlite.p019db.framework;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.sqlite.p019db.SimpleSQLiteQuery;
import androidx.sqlite.p019db.SupportSQLiteDatabase;
import androidx.sqlite.p019db.SupportSQLiteQuery;
import androidx.sqlite.p019db.SupportSQLiteStatement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9546r;
import p309qc.InterfaceC10773d;

/* loaded from: classes3.dex */
public final class FrameworkSQLiteDatabase implements SupportSQLiteDatabase {
    private static final InterfaceC10773d beginTransactionMethod$delegate;
    private static final InterfaceC10773d getThreadSessionMethod$delegate;
    private final SQLiteDatabase delegate;
    public static final Companion Companion = new Companion(null);
    private static final String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] EMPTY_STRING_ARRAY = new String[0];

    @RequiresApi(30)
    public static final class Api30Impl {
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        public final void execPerConnectionSQL(SQLiteDatabase sQLiteDatabase, String sql, Object[] objArr) throws SQLException {
            AbstractC9979u.m20294g(sQLiteDatabase, "sQLiteDatabase");
            AbstractC9979u.m20294g(sql, "sql");
            sQLiteDatabase.execPerConnectionSQL(sql, objArr);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getBeginTransactionMethod() {
            return (Method) FrameworkSQLiteDatabase.beginTransactionMethod$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getGetThreadSessionMethod() {
            return (Method) FrameworkSQLiteDatabase.getThreadSessionMethod$delegate.getValue();
        }

        private Companion() {
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f23258e;
        getThreadSessionMethod$delegate = AbstractC9923a.m20069b(lazyThreadSafetyMode, new InterfaceC9529a() { // from class: androidx.sqlite.db.framework.d
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return FrameworkSQLiteDatabase.getThreadSessionMethod_delegate$lambda$7();
            }
        });
        beginTransactionMethod$delegate = AbstractC9923a.m20069b(lazyThreadSafetyMode, new InterfaceC9529a() { // from class: androidx.sqlite.db.framework.e
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return FrameworkSQLiteDatabase.beginTransactionMethod_delegate$lambda$8();
            }
        });
    }

    public FrameworkSQLiteDatabase(SQLiteDatabase delegate) {
        AbstractC9979u.m20294g(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method beginTransactionMethod_delegate$lambda$8() {
        Class<?> returnType;
        try {
            Method getThreadSessionMethod = Companion.getGetThreadSessionMethod();
            if (getThreadSessionMethod == null || (returnType = getThreadSessionMethod.getReturnType()) == null) {
                return null;
            }
            Class cls = Integer.TYPE;
            return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method getThreadSessionMethod_delegate$lambda$7() {
        try {
            Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    private final void internalBeginTransactionWithListenerReadOnly(SQLiteTransactionListener sQLiteTransactionListener) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Companion companion = Companion;
        if (companion.getBeginTransactionMethod() == null || companion.getGetThreadSessionMethod() == null) {
            if (sQLiteTransactionListener != null) {
                beginTransactionWithListener(sQLiteTransactionListener);
                return;
            } else {
                beginTransaction();
                return;
            }
        }
        Method beginTransactionMethod = companion.getBeginTransactionMethod();
        AbstractC9979u.m20291d(beginTransactionMethod);
        Method getThreadSessionMethod = companion.getGetThreadSessionMethod();
        AbstractC9979u.m20291d(getThreadSessionMethod);
        Object objInvoke = getThreadSessionMethod.invoke(this.delegate, null);
        if (objInvoke == null) {
            throw new IllegalStateException("Required value was null.");
        }
        beginTransactionMethod.invoke(objInvoke, 0, sQLiteTransactionListener, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SQLiteCursor query$lambda$0(SupportSQLiteQuery supportSQLiteQuery, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        AbstractC9979u.m20291d(sQLiteQuery);
        supportSQLiteQuery.bindTo(new FrameworkSQLiteProgram(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor query$lambda$1(InterfaceC9546r interfaceC9546r, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return (Cursor) interfaceC9546r.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor query$lambda$2(SupportSQLiteQuery supportSQLiteQuery, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        AbstractC9979u.m20291d(sQLiteQuery);
        supportSQLiteQuery.bindTo(new FrameworkSQLiteProgram(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void beginTransaction() {
        this.delegate.beginTransaction();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        this.delegate.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void beginTransactionReadOnly() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        internalBeginTransactionWithListenerReadOnly(null);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void beginTransactionWithListener(SQLiteTransactionListener transactionListener) {
        AbstractC9979u.m20294g(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListener(transactionListener);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener transactionListener) {
        AbstractC9979u.m20294g(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void beginTransactionWithListenerReadOnly(SQLiteTransactionListener transactionListener) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(transactionListener, "transactionListener");
        internalBeginTransactionWithListenerReadOnly(transactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public SupportSQLiteStatement compileStatement(String sql) throws SQLException {
        AbstractC9979u.m20294g(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.delegate.compileStatement(sql);
        AbstractC9979u.m20293f(sQLiteStatementCompileStatement, "compileStatement(...)");
        return new FrameworkSQLiteStatement(sQLiteStatementCompileStatement);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public int delete(String table, String str, Object[] objArr) throws SQLException {
        AbstractC9979u.m20294g(table, "table");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM ");
        sb2.append(table);
        if (str != null && str.length() != 0) {
            sb2.append(" WHERE ");
            sb2.append(str);
        }
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = compileStatement(sb2.toString());
        SimpleSQLiteQuery.Companion.bind(supportSQLiteStatementCompileStatement, objArr);
        return supportSQLiteStatementCompileStatement.executeUpdateDelete();
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
        this.delegate.endTransaction();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void execPerConnectionSQL(String sql, Object[] objArr) throws SQLException {
        AbstractC9979u.m20294g(sql, "sql");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            Api30Impl.INSTANCE.execPerConnectionSQL(this.delegate, sql, objArr);
            return;
        }
        throw new UnsupportedOperationException("execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: " + i10);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void execSQL(String sql) throws SQLException {
        AbstractC9979u.m20294g(sql, "sql");
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
        return this.delegate.insertWithOnConflict(table, null, values, i10);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        return this.delegate.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    public final boolean isDelegate(SQLiteDatabase sqLiteDatabase) {
        AbstractC9979u.m20294g(sqLiteDatabase, "sqLiteDatabase");
        return AbstractC9979u.m20289b(this.delegate, sqLiteDatabase);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public boolean isExecPerConnectionSQLSupported() {
        return Build.VERSION.SDK_INT >= 30;
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
        return query(new SimpleSQLiteQuery(query));
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

    /* renamed from: setMaximumSize, reason: collision with other method in class */
    public void m33950setMaximumSize(long j10) {
        this.delegate.setMaximumSize(j10);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void setPageSize(long j10) {
        this.delegate.setPageSize(j10);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        this.delegate.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void setVersion(int i10) {
        this.delegate.setVersion(i10);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public int update(String table, int i10, ContentValues values, String str, Object[] objArr) throws SQLException {
        AbstractC9979u.m20294g(table, "table");
        AbstractC9979u.m20294g(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE ");
        sb2.append(CONFLICT_VALUES[i10]);
        sb2.append(table);
        sb2.append(" SET ");
        int i11 = 0;
        for (String str2 : values.keySet()) {
            sb2.append(i11 > 0 ? "," : "");
            sb2.append(str2);
            objArr2[i11] = values.get(str2);
            sb2.append("=?");
            i11++;
        }
        if (objArr != null) {
            for (int i12 = size; i12 < length; i12++) {
                objArr2[i12] = objArr[i12 - size];
            }
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(" WHERE ");
            sb2.append(str);
        }
        SupportSQLiteStatement supportSQLiteStatementCompileStatement = compileStatement(sb2.toString());
        SimpleSQLiteQuery.Companion.bind(supportSQLiteStatementCompileStatement, objArr2);
        return supportSQLiteStatementCompileStatement.executeUpdateDelete();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
        return this.delegate.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public void execSQL(String sql, Object[] bindArgs) throws SQLException {
        AbstractC9979u.m20294g(sql, "sql");
        AbstractC9979u.m20294g(bindArgs, "bindArgs");
        this.delegate.execSQL(sql, bindArgs);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public Cursor query(String query, Object[] bindArgs) {
        AbstractC9979u.m20294g(query, "query");
        AbstractC9979u.m20294g(bindArgs, "bindArgs");
        return query(new SimpleSQLiteQuery(query, bindArgs));
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public long setMaximumSize(long j10) {
        this.delegate.setMaximumSize(j10);
        return this.delegate.getMaximumSize();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely(long j10) {
        return this.delegate.yieldIfContendedSafely(j10);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public Cursor query(final SupportSQLiteQuery query) {
        AbstractC9979u.m20294g(query, "query");
        final InterfaceC9546r interfaceC9546r = new InterfaceC9546r() { // from class: androidx.sqlite.db.framework.b
            @Override // p181hd.InterfaceC9546r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return FrameworkSQLiteDatabase.query$lambda$0(query, (SQLiteDatabase) obj, (SQLiteCursorDriver) obj2, (String) obj3, (SQLiteQuery) obj4);
            }
        };
        Cursor cursorRawQueryWithFactory = this.delegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.c
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return FrameworkSQLiteDatabase.query$lambda$1(interfaceC9546r, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.getSql(), EMPTY_STRING_ARRAY, null);
        AbstractC9979u.m20293f(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteDatabase
    public Cursor query(final SupportSQLiteQuery query, CancellationSignal cancellationSignal) {
        AbstractC9979u.m20294g(query, "query");
        SQLiteDatabase sQLiteDatabase = this.delegate;
        SQLiteDatabase.CursorFactory cursorFactory = new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return FrameworkSQLiteDatabase.query$lambda$2(query, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        };
        String sql = query.getSql();
        String[] strArr = EMPTY_STRING_ARRAY;
        AbstractC9979u.m20291d(cancellationSignal);
        Cursor cursorRawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, strArr, null, cancellationSignal);
        AbstractC9979u.m20293f(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }
}
