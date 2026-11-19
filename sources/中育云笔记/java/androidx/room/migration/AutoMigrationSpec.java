package androidx.room.migration;

import androidx.room.driver.SupportSQLiteConnection;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.p019db.SupportSQLiteDatabase;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public interface AutoMigrationSpec {
    default void onPostMigrate(SupportSQLiteDatabase db2) {
        AbstractC9979u.m20294g(db2, "db");
    }

    default void onPostMigrate(SQLiteConnection connection) {
        AbstractC9979u.m20294g(connection, "connection");
        if (connection instanceof SupportSQLiteConnection) {
            onPostMigrate(((SupportSQLiteConnection) connection).getDb());
        }
    }
}
