package androidx.room.driver;

import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.p019db.SupportSQLiteDatabase;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC9979u;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class SupportSQLiteConnection implements SQLiteConnection {

    /* renamed from: db */
    private final SupportSQLiteDatabase f2016db;

    public SupportSQLiteConnection(SupportSQLiteDatabase db2) {
        AbstractC9979u.m20294g(db2, "db");
        this.f2016db = db2;
    }

    @Override // androidx.sqlite.SQLiteConnection, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f2016db.close();
    }

    public final SupportSQLiteDatabase getDb() {
        return this.f2016db;
    }

    @Override // androidx.sqlite.SQLiteConnection
    public SupportSQLiteStatement prepare(String sql) {
        AbstractC9979u.m20294g(sql, "sql");
        return SupportSQLiteStatement.Companion.create(this.f2016db, sql);
    }
}
