package androidx.room.support;

import androidx.room.DelegatingOpenHelper;
import androidx.room.RoomDatabase;
import androidx.sqlite.p019db.SupportSQLiteDatabase;
import androidx.sqlite.p019db.SupportSQLiteOpenHelper;
import kotlin.jvm.internal.AbstractC9979u;
import sd.InterfaceC11122i0;

/* loaded from: classes3.dex */
public final class QueryInterceptorOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {
    private final SupportSQLiteOpenHelper delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final InterfaceC11122i0 queryCallbackScope;

    public QueryInterceptorOpenHelper(SupportSQLiteOpenHelper delegate, InterfaceC11122i0 queryCallbackScope, RoomDatabase.QueryCallback queryCallback) {
        AbstractC9979u.m20294g(delegate, "delegate");
        AbstractC9979u.m20294g(queryCallbackScope, "queryCallbackScope");
        AbstractC9979u.m20294g(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.queryCallbackScope = queryCallbackScope;
        this.queryCallback = queryCallback;
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return this.delegate.getDatabaseName();
    }

    @Override // androidx.room.DelegatingOpenHelper
    public SupportSQLiteOpenHelper getDelegate() {
        return this.delegate;
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getReadableDatabase() {
        return new QueryInterceptorDatabase(getDelegate().getReadableDatabase(), this.queryCallbackScope, this.queryCallback);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() {
        return new QueryInterceptorDatabase(getDelegate().getWritableDatabase(), this.queryCallbackScope, this.queryCallback);
    }

    @Override // androidx.sqlite.p019db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.delegate.setWriteAheadLoggingEnabled(z10);
    }
}
