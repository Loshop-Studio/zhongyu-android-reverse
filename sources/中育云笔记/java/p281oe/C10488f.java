package p281oe;

import java.io.IOException;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import ne.AbstractC10411a;
import ne.C10414d;
import ne.C10415e;
import okhttp3.internal.connection.RealConnection;
import p281oe.C10487e;
import p309qc.C10786q;
import se.C11192j;

/* renamed from: oe.f */
/* loaded from: classes6.dex */
public final class C10488f {

    /* renamed from: f */
    public static final a f24923f = new a(null);

    /* renamed from: a */
    public final int f24924a;

    /* renamed from: b */
    public final long f24925b;

    /* renamed from: c */
    public final C10414d f24926c;

    /* renamed from: d */
    public final b f24927d;

    /* renamed from: e */
    public final ConcurrentLinkedQueue f24928e;

    /* renamed from: oe.f$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: oe.f$b */
    public static final class b extends AbstractC10411a {
        public b(String str) {
            super(str, false, 2, null);
        }

        @Override // ne.AbstractC10411a
        /* renamed from: f */
        public long mo21774f() {
            return C10488f.this.m21920b(System.nanoTime());
        }
    }

    public C10488f(C10415e taskRunner, int i10, long j10, TimeUnit timeUnit) {
        AbstractC9979u.m20294g(taskRunner, "taskRunner");
        AbstractC9979u.m20294g(timeUnit, "timeUnit");
        this.f24924a = i10;
        this.f24925b = timeUnit.toNanos(j10);
        this.f24926c = taskRunner.m21801i();
        this.f24927d = new b(AbstractC9920d.f23249i + " ConnectionPool");
        this.f24928e = new ConcurrentLinkedQueue();
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j10).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0033 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m21919a(je.C9720a r4, p281oe.C10487e r5, java.util.List r6, boolean r7) {
        /*
            r3 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r4, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r5, r0)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r3.f24928e
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RealConnection r1 = (okhttp3.internal.connection.RealConnection) r1
            java.lang.String r2 = "connection"
            kotlin.jvm.internal.AbstractC9979u.m20293f(r1, r2)
            monitor-enter(r1)
            if (r7 == 0) goto L2d
            boolean r2 = r1.m22012w()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L39
            goto L2d
        L2b:
            r4 = move-exception
            goto L3d
        L2d:
            boolean r2 = r1.m22010u(r4, r6)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L39
            r5.m21891e(r1)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)
            r4 = 1
            return r4
        L39:
            qc.q r2 = p309qc.C10786q.f26013a     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)
            goto L10
        L3d:
            monitor-exit(r1)
            throw r4
        L3f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p281oe.C10488f.m21919a(je.a, oe.e, java.util.List, boolean):boolean");
    }

    /* renamed from: b */
    public final long m21920b(long j10) throws IOException {
        Iterator it = this.f24928e.iterator();
        int i10 = 0;
        long j11 = Long.MIN_VALUE;
        RealConnection realConnection = null;
        int i11 = 0;
        while (it.hasNext()) {
            RealConnection connection = (RealConnection) it.next();
            AbstractC9979u.m20293f(connection, "connection");
            synchronized (connection) {
                if (m21922d(connection, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long jM22005p = j10 - connection.m22005p();
                    if (jM22005p > j11) {
                        realConnection = connection;
                        j11 = jM22005p;
                    }
                    C10786q c10786q = C10786q.f26013a;
                }
            }
        }
        long j12 = this.f24925b;
        if (j11 < j12 && i10 <= this.f24924a) {
            if (i10 > 0) {
                return j12 - j11;
            }
            if (i11 > 0) {
                return j12;
            }
            return -1L;
        }
        AbstractC9979u.m20291d(realConnection);
        synchronized (realConnection) {
            if (!realConnection.m22004o().isEmpty()) {
                return 0L;
            }
            if (realConnection.m22005p() + j11 != j10) {
                return 0L;
            }
            realConnection.m21987D(true);
            this.f24928e.remove(realConnection);
            AbstractC9920d.m20032n(realConnection.m21988E());
            if (this.f24928e.isEmpty()) {
                this.f24926c.m21780a();
            }
            return 0L;
        }
    }

    /* renamed from: c */
    public final boolean m21921c(RealConnection connection) {
        AbstractC9979u.m20294g(connection, "connection");
        if (AbstractC9920d.f23248h && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.m22006q() && this.f24924a != 0) {
            C10414d.m21779j(this.f24926c, this.f24927d, 0L, 2, null);
            return false;
        }
        connection.m21987D(true);
        this.f24928e.remove(connection);
        if (this.f24928e.isEmpty()) {
            this.f24926c.m21780a();
        }
        return true;
    }

    /* renamed from: d */
    public final int m21922d(RealConnection realConnection, long j10) {
        if (AbstractC9920d.f23248h && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
        List listM22004o = realConnection.m22004o();
        int i10 = 0;
        while (i10 < listM22004o.size()) {
            Reference reference = (Reference) listM22004o.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                AbstractC9979u.m20292e(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                C11192j.f26882a.m24899g().mo24864l("A connection to " + realConnection.m21984A().m19297a().m19296l() + " was leaked. Did you forget to close a response body?", ((C10487e.b) reference).m21918a());
                listM22004o.remove(i10);
                realConnection.m21987D(true);
                if (listM22004o.isEmpty()) {
                    realConnection.m21986C(j10 - this.f24925b);
                    return 0;
                }
            }
        }
        return listM22004o.size();
    }

    /* renamed from: e */
    public final void m21923e(RealConnection connection) {
        AbstractC9979u.m20294g(connection, "connection");
        if (!AbstractC9920d.f23248h || Thread.holdsLock(connection)) {
            this.f24928e.add(connection);
            C10414d.m21779j(this.f24926c, this.f24927d, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }
}
