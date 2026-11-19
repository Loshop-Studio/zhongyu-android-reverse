package androidx.sqlite.p018db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public interface SupportSQLiteDatabase extends Closeable {
    void beginTransaction();

    void beginTransactionNonExclusive();

    default void beginTransactionReadOnly() {
        beginTransaction();
    }

    void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener);

    void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener);

    default void beginTransactionWithListenerReadOnly(SQLiteTransactionListener transactionListener) {
        AbstractC9133u.m16133g(transactionListener, "transactionListener");
        beginTransactionWithListener(transactionListener);
    }

    SupportSQLiteStatement compileStatement(String str);

    int delete(String str, String str2, Object[] objArr);

    void disableWriteAheadLogging();

    boolean enableWriteAheadLogging();

    void endTransaction();

    default void execPerConnectionSQL(String sql, @SuppressLint({"ArrayReturn"}) Object[] objArr) {
        AbstractC9133u.m16133g(sql, "sql");
        throw new UnsupportedOperationException();
    }

    void execSQL(String str);

    void execSQL(String str, Object[] objArr);

    List<Pair<String, String>> getAttachedDbs();

    long getMaximumSize();

    long getPageSize();

    String getPath();

    int getVersion();

    boolean inTransaction();

    long insert(String str, int i10, ContentValues contentValues);

    boolean isDatabaseIntegrityOk();

    boolean isDbLockedByCurrentThread();

    default boolean isExecPerConnectionSQLSupported() {
        return false;
    }

    boolean isOpen();

    boolean isReadOnly();

    boolean isWriteAheadLoggingEnabled();

    boolean needUpgrade(int i10);

    Cursor query(SupportSQLiteQuery supportSQLiteQuery);

    Cursor query(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal);

    Cursor query(String str);

    Cursor query(String str, Object[] objArr);

    void setForeignKeyConstraintsEnabled(boolean z10);

    void setLocale(Locale locale);

    void setMaxSqlCacheSize(int i10);

    long setMaximumSize(long j10);

    void setPageSize(long j10);

    void setTransactionSuccessful();

    void setVersion(int i10);

    int update(String str, int i10, ContentValues contentValues, String str2, Object[] objArr);

    boolean yieldIfContendedSafely();

    boolean yieldIfContendedSafely(long j10);
}
