package androidx.room.support;

import androidx.sqlite.p019db.SupportSQLiteOpenHelper;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class AutoClosingRoomOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {
    private final AutoCloser autoCloser;
    private final SupportSQLiteOpenHelper.Factory delegate;

    public AutoClosingRoomOpenHelperFactory(SupportSQLiteOpenHelper.Factory delegate, AutoCloser autoCloser) {
        AbstractC9979u.m20294g(delegate, "delegate");
        AbstractC9979u.m20294g(autoCloser, "autoCloser");
        this.delegate = delegate;
        this.autoCloser = autoCloser;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public AutoClosingRoomOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        AbstractC9979u.m20294g(configuration, "configuration");
        return new AutoClosingRoomOpenHelper(this.delegate.create(configuration), this.autoCloser);
    }
}
