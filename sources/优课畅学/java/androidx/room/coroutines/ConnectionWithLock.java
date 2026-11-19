package androidx.room.coroutines;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.Iterator;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;
import p123h7.AbstractC8722b;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p179m7.InterfaceC9324c;
import p224q8.InterfaceC9851g;
import p235r8.AbstractC9943b;
import p235r8.InterfaceC9942a;

/* loaded from: classes3.dex */
final class ConnectionWithLock implements SQLiteConnection, InterfaceC9942a {
    private InterfaceC9100d acquireCoroutineContext;
    private Throwable acquireThrowable;
    private final SQLiteConnection delegate;
    private final InterfaceC9942a lock;

    public ConnectionWithLock(SQLiteConnection delegate, InterfaceC9942a lock) {
        AbstractC9133u.m16133g(delegate, "delegate");
        AbstractC9133u.m16133g(lock, "lock");
        this.delegate = delegate;
        this.lock = lock;
    }

    @Override // androidx.sqlite.SQLiteConnection, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final void dump(StringBuilder builder) {
        AbstractC9133u.m16133g(builder, "builder");
        if (this.acquireCoroutineContext == null && this.acquireThrowable == null) {
            builder.append("\t\tStatus: Free connection");
            builder.append('\n');
            return;
        }
        builder.append("\t\tStatus: Acquired connection");
        builder.append('\n');
        InterfaceC9100d interfaceC9100d = this.acquireCoroutineContext;
        if (interfaceC9100d != null) {
            builder.append("\t\tCoroutine: " + interfaceC9100d);
            builder.append('\n');
        }
        Throwable th = this.acquireThrowable;
        if (th != null) {
            builder.append("\t\tAcquired:");
            builder.append('\n');
            Iterator it = AbstractC8778f0.m14560f0(AbstractC8661c0.m14000o0(AbstractC8722b.m14229b(th)), 1).iterator();
            while (it.hasNext()) {
                builder.append("\t\t" + ((String) it.next()));
                builder.append('\n');
            }
        }
    }

    @Override // p235r8.InterfaceC9942a
    public InterfaceC9851g getOnLock() {
        return this.lock.getOnLock();
    }

    @Override // p235r8.InterfaceC9942a
    public boolean holdsLock(Object owner) {
        AbstractC9133u.m16133g(owner, "owner");
        return this.lock.holdsLock(owner);
    }

    @Override // p235r8.InterfaceC9942a
    public boolean isLocked() {
        return this.lock.isLocked();
    }

    @Override // p235r8.InterfaceC9942a
    public Object lock(Object obj, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return this.lock.lock(obj, interfaceC9324c);
    }

    public final ConnectionWithLock markAcquired(InterfaceC9100d context) {
        AbstractC9133u.m16133g(context, "context");
        this.acquireCoroutineContext = context;
        this.acquireThrowable = new Throwable();
        return this;
    }

    public final ConnectionWithLock markReleased() {
        this.acquireCoroutineContext = null;
        this.acquireThrowable = null;
        return this;
    }

    @Override // androidx.sqlite.SQLiteConnection
    public SQLiteStatement prepare(String sql) {
        AbstractC9133u.m16133g(sql, "sql");
        return this.delegate.prepare(sql);
    }

    public String toString() {
        return this.delegate.toString();
    }

    @Override // p235r8.InterfaceC9942a
    public boolean tryLock(Object obj) {
        return this.lock.tryLock(obj);
    }

    @Override // p235r8.InterfaceC9942a
    public void unlock(Object obj) {
        this.lock.unlock(obj);
    }

    public /* synthetic */ ConnectionWithLock(SQLiteConnection sQLiteConnection, InterfaceC9942a interfaceC9942a, int i10, AbstractC9126n abstractC9126n) {
        this(sQLiteConnection, (i10 & 2) != 0 ? AbstractC9943b.m18571b(false, 1, null) : interfaceC9942a);
    }
}
