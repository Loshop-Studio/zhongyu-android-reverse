package androidx.room.coroutines;

import androidx.sqlite.SQLiteDriver;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class ConnectionPoolKt {
    public static final ConnectionPool newConnectionPool(SQLiteDriver driver, String fileName, int i10, int i11) {
        AbstractC9979u.m20294g(driver, "driver");
        AbstractC9979u.m20294g(fileName, "fileName");
        return new ConnectionPoolImpl(driver, fileName, i10, i11);
    }

    public static final ConnectionPool newSingleConnectionPool(SQLiteDriver driver, String fileName) {
        AbstractC9979u.m20294g(driver, "driver");
        AbstractC9979u.m20294g(fileName, "fileName");
        return new ConnectionPoolImpl(driver, fileName);
    }
}
