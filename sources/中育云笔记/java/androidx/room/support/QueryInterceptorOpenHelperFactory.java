package androidx.room.support;

import androidx.room.RoomDatabase;
import androidx.sqlite.p019db.SupportSQLiteOpenHelper;
import kotlin.jvm.internal.AbstractC9979u;
import sd.InterfaceC11122i0;

/* loaded from: classes3.dex */
public final class QueryInterceptorOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {
    private final SupportSQLiteOpenHelper.Factory delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final InterfaceC11122i0 queryCallbackScope;

    public QueryInterceptorOpenHelperFactory(SupportSQLiteOpenHelper.Factory delegate, InterfaceC11122i0 queryCallbackScope, RoomDatabase.QueryCallback queryCallback) {
        AbstractC9979u.m20294g(delegate, "delegate");
        AbstractC9979u.m20294g(queryCallbackScope, "queryCallbackScope");
        AbstractC9979u.m20294g(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.queryCallbackScope = queryCallbackScope;
        this.queryCallback = queryCallback;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        AbstractC9979u.m20294g(configuration, "configuration");
        return new QueryInterceptorOpenHelper(this.delegate.create(configuration), this.queryCallbackScope, this.queryCallback);
    }
}
