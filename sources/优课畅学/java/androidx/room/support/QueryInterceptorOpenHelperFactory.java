package androidx.room.support;

import androidx.room.RoomDatabase;
import androidx.sqlite.p018db.SupportSQLiteOpenHelper;
import kotlin.jvm.internal.AbstractC9133u;
import p135i8.InterfaceC8822b0;

/* loaded from: classes3.dex */
public final class QueryInterceptorOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {
    private final SupportSQLiteOpenHelper.Factory delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final InterfaceC8822b0 queryCallbackScope;

    public QueryInterceptorOpenHelperFactory(SupportSQLiteOpenHelper.Factory delegate, InterfaceC8822b0 queryCallbackScope, RoomDatabase.QueryCallback queryCallback) {
        AbstractC9133u.m16133g(delegate, "delegate");
        AbstractC9133u.m16133g(queryCallbackScope, "queryCallbackScope");
        AbstractC9133u.m16133g(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.queryCallbackScope = queryCallbackScope;
        this.queryCallback = queryCallback;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        AbstractC9133u.m16133g(configuration, "configuration");
        return new QueryInterceptorOpenHelper(this.delegate.create(configuration), this.queryCallbackScope, this.queryCallback);
    }
}
