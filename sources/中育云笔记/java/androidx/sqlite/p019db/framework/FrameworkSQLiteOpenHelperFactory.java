package androidx.sqlite.p019db.framework;

import androidx.sqlite.p019db.SupportSQLiteOpenHelper;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class FrameworkSQLiteOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        AbstractC9979u.m20294g(configuration, "configuration");
        return new FrameworkSQLiteOpenHelper(configuration.context, configuration.name, configuration.callback, configuration.useNoBackupDirectory, configuration.allowDataLossOnRecovery);
    }
}
