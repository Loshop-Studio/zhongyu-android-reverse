package p137w2;

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
import p004a3.C0021k;
import p117r2.C4495a;
import p121s2.AbstractC4550b;
import p133v2.AbstractC4631a;
import p133v2.C4634d;
import p133v2.C4635e;
import p137w2.C4645e;

/* renamed from: w2.g */
/* loaded from: classes2.dex */
public final class C4647g {

    /* renamed from: f */
    public static final a f5924f = new a(null);

    /* renamed from: a */
    public final long f5925a;

    /* renamed from: b */
    public final C4634d f5926b;

    /* renamed from: c */
    public final b f5927c;

    /* renamed from: d */
    public final ConcurrentLinkedQueue f5928d;

    /* renamed from: e */
    public final int f5929e;

    /* renamed from: w2.g$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: w2.g$b */
    public static final class b extends AbstractC4631a {
        public b(String str) {
            super(str, false, 2, null);
        }

        @Override // p133v2.AbstractC4631a
        /* renamed from: f */
        public long mo6424f() {
            return C4647g.this.m6536b(System.nanoTime());
        }
    }

    public C4647g(C4635e taskRunner, int i4, long j4, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f5929e = i4;
        this.f5925a = timeUnit.toNanos(j4);
        this.f5926b = taskRunner.m6451i();
        this.f5927c = new b(AbstractC4550b.f5709i + " ConnectionPool");
        this.f5928d = new ConcurrentLinkedQueue();
        if (j4 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j4).toString());
    }

    /* renamed from: a */
    public final boolean m6535a(C4495a address, C4645e call, List list, boolean z3) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f5928d.iterator();
        while (it.hasNext()) {
            RealConnection connection = (RealConnection) it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (z3) {
                    if (!connection.m5613v()) {
                    }
                    Unit unit = Unit.INSTANCE;
                }
                if (connection.m5611t(address, list)) {
                    call.m6506d(connection);
                    return true;
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final long m6536b(long j4) throws IOException {
        Iterator it = this.f5928d.iterator();
        int i4 = 0;
        long j5 = Long.MIN_VALUE;
        RealConnection realConnection = null;
        int i5 = 0;
        while (it.hasNext()) {
            RealConnection connection = (RealConnection) it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (m6538d(connection, j4) > 0) {
                    i5++;
                } else {
                    i4++;
                    long jM5606o = j4 - connection.m5606o();
                    if (jM5606o > j5) {
                        Unit unit = Unit.INSTANCE;
                        realConnection = connection;
                        j5 = jM5606o;
                    } else {
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            }
        }
        long j6 = this.f5925a;
        if (j5 < j6 && i4 <= this.f5929e) {
            if (i4 > 0) {
                return j6 - j5;
            }
            if (i5 > 0) {
                return j6;
            }
            return -1L;
        }
        Intrinsics.checkNotNull(realConnection);
        synchronized (realConnection) {
            if (!realConnection.m5605n().isEmpty()) {
                return 0L;
            }
            if (realConnection.m5606o() + j5 != j4) {
                return 0L;
            }
            realConnection.m5588C(true);
            this.f5928d.remove(realConnection);
            AbstractC4550b.m6229k(realConnection.m5589D());
            if (this.f5928d.isEmpty()) {
                this.f5926b.m6430a();
            }
            return 0L;
        }
    }

    /* renamed from: c */
    public final boolean m6537c(RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (AbstractC4550b.f5708h && !Thread.holdsLock(connection)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(connection);
            throw new AssertionError(sb.toString());
        }
        if (!connection.m5607p() && this.f5929e != 0) {
            C4634d.m6429j(this.f5926b, this.f5927c, 0L, 2, null);
            return false;
        }
        connection.m5588C(true);
        this.f5928d.remove(connection);
        if (this.f5928d.isEmpty()) {
            this.f5926b.m6430a();
        }
        return true;
    }

    /* renamed from: d */
    public final int m6538d(RealConnection realConnection, long j4) {
        if (AbstractC4550b.f5708h && !Thread.holdsLock(realConnection)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(realConnection);
            throw new AssertionError(sb.toString());
        }
        List listM5605n = realConnection.m5605n();
        int i4 = 0;
        while (i4 < listM5605n.size()) {
            Reference reference = (Reference) listM5605n.get(i4);
            if (reference.get() != null) {
                i4++;
            } else {
                C0021k.f39c.m71g().mo36l("A connection to " + realConnection.m5617z().m5847a().m5798l() + " was leaked. Did you forget to close a response body?", ((C4645e.b) reference).m6534a());
                listM5605n.remove(i4);
                realConnection.m5588C(true);
                if (listM5605n.isEmpty()) {
                    realConnection.m5587B(j4 - this.f5925a);
                    return 0;
                }
            }
        }
        return listM5605n.size();
    }

    /* renamed from: e */
    public final void m6539e(RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!AbstractC4550b.f5708h || Thread.holdsLock(connection)) {
            this.f5928d.add(connection);
            C4634d.m6429j(this.f5926b, this.f5927c, 0L, 2, null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(connection);
        throw new AssertionError(sb.toString());
    }
}
