package androidx.room.driver;

import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.p019db.SupportSQLiteOpenHelper;
import kotlin.jvm.internal.AbstractC9979u;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class SupportSQLiteDriver implements SQLiteDriver {
    private final SupportSQLiteOpenHelper openHelper;

    public SupportSQLiteDriver(SupportSQLiteOpenHelper openHelper) {
        AbstractC9979u.m20294g(openHelper, "openHelper");
        this.openHelper = openHelper;
    }

    public final SupportSQLiteOpenHelper getOpenHelper() {
        return this.openHelper;
    }

    @Override // androidx.sqlite.SQLiteDriver
    public SupportSQLiteConnection open(String fileName) {
        AbstractC9979u.m20294g(fileName, "fileName");
        return new SupportSQLiteConnection(this.openHelper.getWritableDatabase());
    }
}
