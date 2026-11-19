package androidx.room.coroutines;

import androidx.sqlite.SQLiteDriver;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class ConnectionPoolKt {
    public static final ConnectionPool newConnectionPool(SQLiteDriver driver, String fileName, int i10, int i11) {
        AbstractC9133u.m16133g(driver, "driver");
        AbstractC9133u.m16133g(fileName, "fileName");
        return new ConnectionPoolImpl(driver, fileName, i10, i11);
    }

    public static final ConnectionPool newSingleConnectionPool(SQLiteDriver driver, String fileName) {
        AbstractC9133u.m16133g(driver, "driver");
        AbstractC9133u.m16133g(fileName, "fileName");
        return new ConnectionPoolImpl(driver, fileName);
    }
}
