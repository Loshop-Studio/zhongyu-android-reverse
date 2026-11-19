package androidx.room.driver;

import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.p018db.SupportSQLiteDatabase;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC9133u;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class SupportSQLiteConnection implements SQLiteConnection {

    /* renamed from: db */
    private final SupportSQLiteDatabase f1902db;

    public SupportSQLiteConnection(SupportSQLiteDatabase db) {
        AbstractC9133u.m16133g(db, "db");
        this.f1902db = db;
    }

    @Override // androidx.sqlite.SQLiteConnection, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f1902db.close();
    }

    public final SupportSQLiteDatabase getDb() {
        return this.f1902db;
    }

    @Override // androidx.sqlite.SQLiteConnection
    public SupportSQLiteStatement prepare(String sql) {
        AbstractC9133u.m16133g(sql, "sql");
        return SupportSQLiteStatement.Companion.create(this.f1902db, sql);
    }
}
