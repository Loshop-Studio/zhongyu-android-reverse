package androidx.sqlite.driver;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9979u;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class AndroidSQLiteConnection implements SQLiteConnection {

    /* renamed from: db */
    private final SQLiteDatabase f2077db;

    public AndroidSQLiteConnection(SQLiteDatabase db2) {
        AbstractC9979u.m20294g(db2, "db");
        this.f2077db = db2;
    }

    @Override // androidx.sqlite.SQLiteConnection, java.lang.AutoCloseable
    public void close() {
        this.f2077db.close();
    }

    public final SQLiteDatabase getDb() {
        return this.f2077db;
    }

    @Override // androidx.sqlite.SQLiteConnection
    public SQLiteStatement prepare(String sql) {
        AbstractC9979u.m20294g(sql, "sql");
        if (this.f2077db.isOpen()) {
            return AndroidSQLiteStatement.Companion.create(this.f2077db, sql);
        }
        SQLite.throwSQLiteException(21, "connection is closed");
        throw new KotlinNothingValueException();
    }
}
