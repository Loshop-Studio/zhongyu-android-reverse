package androidx.room.coroutines;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.driver.AndroidSQLiteConnection;
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8724d;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class AndroidSQLiteDriverConnectionPool implements ConnectionPool {
    private final InterfaceC8724d androidConnection$delegate;
    private final SQLiteDriver driver;
    private final String fileName;

    public AndroidSQLiteDriverConnectionPool(SQLiteDriver driver, String fileName) {
        AbstractC9133u.m16133g(driver, "driver");
        AbstractC9133u.m16133g(fileName, "fileName");
        this.driver = driver;
        this.fileName = fileName;
        this.androidConnection$delegate = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: androidx.room.coroutines.a
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return AndroidSQLiteDriverConnectionPool.androidConnection_delegate$lambda$0(this.f1890a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidSQLiteDriverPooledConnection androidConnection_delegate$lambda$0(AndroidSQLiteDriverConnectionPool androidSQLiteDriverConnectionPool) {
        SQLiteConnection sQLiteConnectionOpen = androidSQLiteDriverConnectionPool.driver.open(androidSQLiteDriverConnectionPool.fileName);
        AbstractC9133u.m16131e(sQLiteConnectionOpen, "null cannot be cast to non-null type androidx.sqlite.driver.AndroidSQLiteConnection");
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
    public <R> Object useConnection(boolean z10, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super R> interfaceC9324c) {
        return interfaceC10574p.invoke(getAndroidConnection(), interfaceC9324c);
    }
}
