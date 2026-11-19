package androidx.room.coroutines;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.driver.AndroidSQLiteConnection;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.InterfaceC10773d;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class AndroidSQLiteDriverConnectionPool implements ConnectionPool {
    private final InterfaceC10773d androidConnection$delegate;
    private final SQLiteDriver driver;
    private final String fileName;

    public AndroidSQLiteDriverConnectionPool(SQLiteDriver driver, String fileName) {
        AbstractC9979u.m20294g(driver, "driver");
        AbstractC9979u.m20294g(fileName, "fileName");
        this.driver = driver;
        this.fileName = fileName;
        this.androidConnection$delegate = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: androidx.room.coroutines.a
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return AndroidSQLiteDriverConnectionPool.androidConnection_delegate$lambda$0(this.f2004c);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidSQLiteDriverPooledConnection androidConnection_delegate$lambda$0(AndroidSQLiteDriverConnectionPool androidSQLiteDriverConnectionPool) {
        SQLiteConnection sQLiteConnectionOpen = androidSQLiteDriverConnectionPool.driver.open(androidSQLiteDriverConnectionPool.fileName);
        AbstractC9979u.m20292e(sQLiteConnectionOpen, "null cannot be cast to non-null type androidx.sqlite.driver.AndroidSQLiteConnection");
        return new AndroidSQLiteDriverPooledConnection((AndroidSQLiteConnection) sQLiteConnectionOpen);
    }

    private final AndroidSQLiteDriverPooledConnection getAndroidConnection() {
        return (AndroidSQLiteDriverPooledConnection) this.androidConnection$delegate.getValue();
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public void close() {
        getAndroidConnection().getDelegate().close();
    }

    @Override // androidx.room.coroutines.ConnectionPool
    public <R> Object useConnection(boolean z10, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super R> interfaceC11588c) {
        return interfaceC9544p.invoke(getAndroidConnection(), interfaceC11588c);
    }
}
