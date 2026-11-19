package androidx.sqlite.driver;

import android.database.sqlite.SQLiteDatabase;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class AndroidSQLiteDriver implements SQLiteDriver {
    @Override // androidx.sqlite.SQLiteDriver
    public SQLiteConnection open(String fileName) {
        AbstractC9133u.m16133g(fileName, "fileName");
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(fileName, (SQLiteDatabase.CursorFactory) null);
        AbstractC9133u.m16130d(sQLiteDatabaseOpenOrCreateDatabase);
        return new AndroidSQLiteConnection(sQLiteDatabaseOpenOrCreateDatabase);
    }
}
