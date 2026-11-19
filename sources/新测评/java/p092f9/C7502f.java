package p092f9;

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
import p028b9.AbstractC5070d;
import p081e9.AbstractC7416a;
import p081e9.C7419d;
import p081e9.C7420e;
import p092f9.C7501e;
import p136j9.C7828j;

/* renamed from: f9.f */
/* loaded from: classes5.dex */
public final class C7502f {

    /* renamed from: f */
    public static final a f12342f = new a(null);

    /* renamed from: a */
    public final int f12343a;

    /* renamed from: b */
    public final long f12344b;

    /* renamed from: c */
    public final C7419d f12345c;

    /* renamed from: d */
    public final b f12346d;

    /* renamed from: e */
    public final ConcurrentLinkedQueue f12347e;

    /* renamed from: f9.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: f9.f$b */
    public static final class b extends AbstractC7416a {
        public b(String str) {
            super(str, false, 2, null);
        }

        @Override // p081e9.AbstractC7416a
        /* renamed from: f */
        public long mo11916f() {
            return C7502f.this.m12194b(System.nanoTime());
        }
    }

    public C7502f(C7420e taskRunner, int i10, long j10, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f12343a = i10;
        this.f12344b = timeUnit.toNanos(j10);
        this.f12345c = taskRunner.m11943i();
        this.f12346d = new b(AbstractC5070d.f2641i + " ConnectionPool");
        this.f12347e = new ConcurrentLinkedQueue();
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
    public final boolean m12193a(p011a9.C0037a r4, p092f9.C7501e r5, java.util.List r6, boolean r7) {
        /*
            r3 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r3.f12347e
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
            boolean r2 = r1.m14451v()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L39
            goto L2d
        L2b:
            r4 = move-exception
            goto L3d
        L2d:
            boolean r2 = r1.m14449t(r4, r6)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L39
            r5.m12166d(r1)     // Catch: java.lang.Throwable -> L2b
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
        throw new UnsupportedOperationException("Method not decompiled: p092f9.C7502f.m12193a(a9.a, f9.e, java.util.List, boolean):boolean");
    }

    /* renamed from: b */
    public final long m12194b(long j10) throws IOException {
        Iterator it = this.f12347e.iterator();
        int i10 = 0;
        long j11 = Long.MIN_VALUE;
        RealConnection realConnection = null;
        int i11 = 0;
        while (it.hasNext()) {
            RealConnection connection = (RealConnection) it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (m12196d(connection, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long jM14444o = j10 - connection.m14444o();
                    if (jM14444o > j11) {
                        realConnection = connection;
                        j11 = jM14444o;
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        long j12 = this.f12344b;
        if (j11 < j12 && i10 <= this.f12343a) {
            if (i10 > 0) {
                return j12 - j11;
            }
            if (i11 > 0) {
                return j12;
            }
            return -1L;
        }
        Intrinsics.checkNotNull(realConnection);
        synchronized (realConnection) {
            if (!realConnection.m14443n().isEmpty()) {
                return 0L;
            }
            if (realConnection.m14444o() + j11 != j10) {
                return 0L;
            }
            realConnection.m14426C(true);
            this.f12347e.remove(realConnection);
            AbstractC5070d.m2649n(realConnection.m14427D());
            if (this.f12347e.isEmpty()) {
                this.f12345c.m11922a();
            }
            return 0L;
        }
    }

    /* renamed from: c */
    public final boolean m12195c(RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (AbstractC5070d.f2640h && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.m14445p() && this.f12343a != 0) {
            C7419d.m11921j(this.f12345c, this.f12346d, 0L, 2, null);
            return false;
        }
        connection.m14426C(true);
        this.f12347e.remove(connection);
        if (this.f12347e.isEmpty()) {
            this.f12345c.m11922a();
        }
        return true;
    }

    /* renamed from: d */
    public final int m12196d(RealConnection realConnection, long j10) {
        if (AbstractC5070d.f2640h && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection);
        }
        List listM14443n = realConnection.m14443n();
        int i10 = 0;
        while (i10 < listM14443n.size()) {
            Reference reference = (Reference) listM14443n.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                Intrinsics.checkNotNull(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                C7828j.f13560a.m13291g().mo13256l("A connection to " + realConnection.m14455z().m86a().m85l() + " was leaked. Did you forget to close a response body?", ((C7501e.b) reference).m12192a());
                listM14443n.remove(i10);
                realConnection.m14426C(true);
                if (listM14443n.isEmpty()) {
                    realConnection.m14425B(j10 - this.f12344b);
                    return 0;
                }
            }
        }
        return listM14443n.size();
    }

    /* renamed from: e */
    public final void m12197e(RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!AbstractC5070d.f2640h || Thread.holdsLock(connection)) {
            this.f12347e.add(connection);
            C7419d.m11921j(this.f12345c, this.f12346d, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }
}
