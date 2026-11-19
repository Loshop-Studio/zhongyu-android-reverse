package androidx.room.driver;

import androidx.room.coroutines.ConnectionPool;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class SupportSQLiteConnectionPool implements ConnectionPool {
    private final SupportSQLiteDriver supportDriver;

    public SupportSQLiteConnectionPool(SupportSQLiteDriver supportDriver) {
        AbstractC9979u.m20294g(supportDriver, "supportDriver");
        this.supportDriver = supportDriver;
    }

    private final SupportSQLitePooledConnection getSupportConnection() {
        String databaseName = this.supportDriver.getOpenHelper().getDatabaseName();
        if (databaseName == null) {
            databaseName = ":memory:";
        }
        return new SupportSQLitePooledConnection(this.supportDriver.open(databaseName));
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public void close() {
        this.supportDriver.getOpenHelper().close();
    }

    public final SupportSQLiteDriver getSupportDriver$room_runtime_release() {
        return this.supportDriver;
    }

    @Override // androidx.room.coroutines.ConnectionPool
    public <R> Object useConnection(boolean z10, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super R> interfaceC11588c) {
        return interfaceC9544p.invoke(getSupportConnection(), interfaceC11588c);
    }
}
