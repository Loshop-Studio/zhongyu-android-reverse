package p226q8;

import java.io.IOException;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RealConnection;
import p182m8.AbstractC9045d;
import p216p8.AbstractC9338a;
import p216p8.C9341d;
import p216p8.C9342e;
import p226q8.C9382e;
import p266u8.C9734j;

/* renamed from: q8.f */
/* loaded from: classes5.dex */
public final class C9383f {

    /* renamed from: f */
    public static final a f16350f = new a(null);

    /* renamed from: a */
    public final int f16351a;

    /* renamed from: b */
    public final long f16352b;

    /* renamed from: c */
    public final C9341d f16353c;

    /* renamed from: d */
    public final b f16354d;

    /* renamed from: e */
    public final ConcurrentLinkedQueue f16355e;

    /* renamed from: q8.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: q8.f$b */
    public static final class b extends AbstractC9338a {
        public b(String str) {
            super(str, false, 2, null);
        }

        @Override // p216p8.AbstractC9338a
        /* renamed from: f */
        public long mo15008f() {
            return C9383f.this.m15426b(System.nanoTime());
        }
    }

    public C9383f(C9342e taskRunner, int i9, long j9, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f16351a = i9;
        this.f16352b = timeUnit.toNanos(j9);
        this.f16353c = taskRunner.m15279i();
        this.f16354d = new b(AbstractC9045d.f15232i + " ConnectionPool");
        this.f16355e = new ConcurrentLinkedQueue();
        if (j9 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j9).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0033 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m15425a(p172l8.C8901a r4, p226q8.C9382e r5, java.util.List r6, boolean r7) {
        /*
            r3 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r3.f16355e
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RealConnection r1 = (okhttp3.internal.connection.RealConnection) r1
            java.lang.String r2 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            monitor-enter(r1)
            if (r7 == 0) goto L2d
            boolean r2 = r1.m14885v()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L39
            goto L2d
        L2b:
            r4 = move-exception
            goto L3d
        L2d:
            boolean r2 = r1.m14883t(r4, r6)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L39
            r5.m15398e(r1)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)
            r4 = 1
            return r4
        L39:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)
            goto L10
        L3d:
            monitor-exit(r1)
            throw r4
        L3f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p226q8.C9383f.m15425a(l8.a, q8.e, java.util.List, boolean):boolean");
    }

    /* renamed from: b */
    public final long m15426b(long j9) throws IOException {
        Iterator it = this.f16355e.iterator();
        int i9 = 0;
        long j10 = Long.MIN_VALUE;
        RealConnection realConnection = null;
        int i10 = 0;
        while (it.hasNext()) {
            RealConnection connection = (RealConnection) it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (m15428d(connection, j9) > 0) {
                    i10++;
                } else {
                    i9++;
                    long jM14878o = j9 - connection.m14878o();
                    if (jM14878o > j10) {
                        realConnection = connection;
                        j10 = jM14878o;
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        long j11 = this.f16352b;
        if (j10 < j11 && i9 <= this.f16351a) {
            if (i9 > 0) {
                return j11 - j10;
            }
            if (i10 > 0) {
                return j11;
            }
            return -1L;
        }
        Intrinsics.checkNotNull(realConnection);
        synchronized (realConnection) {
            if (!realConnection.m14877n().isEmpty()) {
                return 0L;
            }
            if (realConnection.m14878o() + j10 != j9) {
                return 0L;
            }
            realConnection.m14860C(true);
            this.f16355e.remove(realConnection);
            AbstractC9045d.m14498n(realConnection.m14861D());
            if (this.f16355e.isEmpty()) {
                this.f16353c.m15258a();
            }
            return 0L;
        }
    }

    /* renamed from: c */
    public final boolean m15427c(RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (AbstractC9045d.f15231h && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.m14879p() && this.f16351a != 0) {
            C9341d.m15257j(this.f16353c, this.f16354d, 0L, 2, null);
            return false;
        }
        connection.m14860C(true);
        this.f16355e.remove(connection);
        if (this.f16355e.isEmpty()) {
            this.f16353c.m15258a();
        }
        return true;
    }

    /* renamed from: d */
    public final int m15428d(RealConnection realConnection, long j9) {
        if (AbstractC9045d.f15231h && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
        List listM14877n = realConnection.m14877n();
        int i9 = 0;
        while (i9 < listM14877n.size()) {
            Reference reference = (Reference) listM14877n.get(i9);
            if (reference.get() != null) {
                i9++;
            } else {
                Intrinsics.checkNotNull(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                C9734j.f17200a.m16271g().mo16236l("A connection to " + realConnection.m14889z().m13845a().m13844l() + " was leaked. Did you forget to close a response body?", ((C9382e.b) reference).m15424a());
                listM14877n.remove(i9);
                realConnection.m14860C(true);
                if (listM14877n.isEmpty()) {
                    realConnection.m14859B(j9 - this.f16352b);
                    return 0;
                }
            }
        }
        return listM14877n.size();
    }

    /* renamed from: e */
    public final void m15429e(RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!AbstractC9045d.f15231h || Thread.holdsLock(connection)) {
            this.f16355e.add(connection);
            C9341d.m15257j(this.f16353c, this.f16354d, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }
}
