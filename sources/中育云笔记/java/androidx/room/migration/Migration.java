package androidx.room.migration;

import androidx.room.driver.SupportSQLiteConnection;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.p019db.SupportSQLiteDatabase;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public abstract class Migration {
    public final int endVersion;
    public final int startVersion;

    public Migration(int i10, int i11) {
        this.startVersion = i10;
        this.endVersion = i11;
    }

    public void migrate(SupportSQLiteDatabase db2) {
        AbstractC9979u.m20294g(db2, "db");
        throw new NotImplementedError("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    public void migrate(SQLiteConnection connection) {
        AbstractC9979u.m20294g(connection, "connection");
        if (connection instanceof SupportSQLiteConnection) {
            migrate(((SupportSQLiteConnection) connection).getDb());
            return;
        }
        throw new NotImplementedError("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
    }
}
