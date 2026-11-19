package androidx.sqlite.driver;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.RestrictTo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9133u;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class AndroidSQLiteConnection implements SQLiteConnection {

    /* renamed from: db */
    private final SQLiteDatabase f1963db;

    public AndroidSQLiteConnection(SQLiteDatabase db) {
        AbstractC9133u.m16133g(db, "db");
        this.f1963db = db;
    }

    @Override // androidx.sqlite.SQLiteConnection, java.lang.AutoCloseable
    public void close() {
        this.f1963db.close();
    }

    public final SQLiteDatabase getDb() {
        return this.f1963db;
    }

    @Override // androidx.sqlite.SQLiteConnection
    public SQLiteStatement prepare(String sql) {
        AbstractC9133u.m16133g(sql, "sql");
        if (this.f1963db.isOpen()) {
            return AndroidSQLiteStatement.Companion.create(this.f1963db, sql);
        }
        SQLite.throwSQLiteException(21, "connection is closed");
        throw new KotlinNothingValueException();
    }
}
