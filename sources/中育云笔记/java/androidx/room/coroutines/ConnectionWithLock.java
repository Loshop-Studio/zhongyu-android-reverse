package androidx.room.coroutines;

import ae.InterfaceC0112h;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import be.AbstractC5194f;
import be.InterfaceC5189a;
import java.util.Iterator;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.AbstractC10771b;
import p309qc.C10786q;
import p310qd.AbstractC10793c0;
import p325rc.AbstractC10947g0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
final class ConnectionWithLock implements SQLiteConnection, InterfaceC5189a {
    private InterfaceC9945d acquireCoroutineContext;
    private Throwable acquireThrowable;
    private final SQLiteConnection delegate;
    private final InterfaceC5189a lock;

    public ConnectionWithLock(SQLiteConnection delegate, InterfaceC5189a lock) {
        AbstractC9979u.m20294g(delegate, "delegate");
        AbstractC9979u.m20294g(lock, "lock");
        this.delegate = delegate;
        this.lock = lock;
    }

    @Override // androidx.sqlite.SQLiteConnection, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final void dump(StringBuilder builder) {
        AbstractC9979u.m20294g(builder, "builder");
        if (this.acquireCoroutineContext == null && this.acquireThrowable == null) {
            builder.append("\t\tStatus: Free connection");
            builder.append('\n');
            return;
        }
        builder.append("\t\tStatus: Acquired connection");
        builder.append('\n');
        InterfaceC9945d interfaceC9945d = this.acquireCoroutineContext;
        if (interfaceC9945d != null) {
            builder.append("\t\tCoroutine: " + interfaceC9945d);
            builder.append('\n');
        }
        Throwable th = this.acquireThrowable;
        if (th != null) {
            builder.append("\t\tAcquired:");
            builder.append('\n');
            Iterator it = AbstractC10947g0.m23936g0(AbstractC10793c0.m23139o0(AbstractC10771b.m22974b(th)), 1).iterator();
            while (it.hasNext()) {
                builder.append("\t\t" + ((String) it.next()));
                builder.append('\n');
            }
        }
    }

    @Override // be.InterfaceC5189a
    public InterfaceC0112h getOnLock() {
        return this.lock.getOnLock();
    }

    @Override // be.InterfaceC5189a
    public boolean holdsLock(Object owner) {
        AbstractC9979u.m20294g(owner, "owner");
        return this.lock.holdsLock(owner);
    }

    @Override // be.InterfaceC5189a
    public boolean isLocked() {
        return this.lock.isLocked();
    }

    @Override // be.InterfaceC5189a
    public Object lock(Object obj, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return this.lock.lock(obj, interfaceC11588c);
    }

    public final ConnectionWithLock markAcquired(InterfaceC9945d context) {
        AbstractC9979u.m20294g(context, "context");
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
        AbstractC9979u.m20294g(sql, "sql");
        return this.delegate.prepare(sql);
    }

    public String toString() {
        return this.delegate.toString();
    }

    @Override // be.InterfaceC5189a
    public boolean tryLock(Object obj) {
        return this.lock.tryLock(obj);
    }

    @Override // be.InterfaceC5189a
    public void unlock(Object obj) {
        this.lock.unlock(obj);
    }

    public /* synthetic */ ConnectionWithLock(SQLiteConnection sQLiteConnection, InterfaceC5189a interfaceC5189a, int i10, AbstractC9972n abstractC9972n) {
        this(sQLiteConnection, (i10 & 2) != 0 ? AbstractC5194f.m2745b(false, 1, null) : interfaceC5189a);
    }
}
