package p192n9;

import com.blankj.utilcode.util.AbstractC5379p;
import java.io.IOException;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.internal.platform.AbstractC9570c;
import p123h7.C8736p;
import p136i9.C8896a;
import p147j9.AbstractC9041k;
import p181m9.AbstractC9343a;
import p181m9.C9345c;
import p181m9.C9346d;
import p192n9.C9487n;
import p300x7.InterfaceC10575q;

/* renamed from: n9.p */
/* loaded from: classes5.dex */
public final class C9489p {

    /* renamed from: j */
    public static final a f18802j = new a(null);

    /* renamed from: k */
    public static AtomicReferenceFieldUpdater f18803k = AtomicReferenceFieldUpdater.newUpdater(C9489p.class, Map.class, "f");

    /* renamed from: a */
    public final C9346d f18804a;

    /* renamed from: b */
    public final int f18805b;

    /* renamed from: c */
    public final AbstractC9479f f18806c;

    /* renamed from: d */
    public final InterfaceC10575q f18807d;

    /* renamed from: e */
    public final long f18808e;

    /* renamed from: f */
    public volatile Map f18809f;

    /* renamed from: g */
    public final C9345c f18810g;

    /* renamed from: h */
    public final b f18811h;

    /* renamed from: i */
    public final ConcurrentLinkedQueue f18812i;

    /* renamed from: n9.p$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: n9.p$b */
    public static final class b extends AbstractC9343a {
        public b(String str) {
            super(str, false, 2, null);
        }

        @Override // p181m9.AbstractC9343a
        /* renamed from: f */
        public long mo17176f() {
            return C9489p.this.m17568b(System.nanoTime());
        }
    }

    public C9489p(C9346d taskRunner, int i10, long j10, TimeUnit timeUnit, AbstractC9479f connectionListener, InterfaceC10575q exchangeFinderFactory) {
        AbstractC9133u.m16133g(taskRunner, "taskRunner");
        AbstractC9133u.m16133g(timeUnit, "timeUnit");
        AbstractC9133u.m16133g(connectionListener, "connectionListener");
        AbstractC9133u.m16133g(exchangeFinderFactory, "exchangeFinderFactory");
        this.f18804a = taskRunner;
        this.f18805b = i10;
        this.f18806c = connectionListener;
        this.f18807d = exchangeFinderFactory;
        this.f18808e = timeUnit.toNanos(j10);
        this.f18809f = AbstractC9080a.m15943h();
        this.f18810g = taskRunner.m17208k();
        this.f18811h = new b(AbstractC9041k.f17266c + " ConnectionPool connection closer");
        this.f18812i = new ConcurrentLinkedQueue();
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j10).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:9:0x0029, B:14:0x0032, B:17:0x0039), top: B:38:0x0029 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p192n9.C9488o m17567a(boolean r6, p136i9.C8896a r7, p192n9.InterfaceC9480g r8, java.util.List r9, boolean r10) throws java.io.IOException {
        /*
            r5 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.AbstractC9133u.m16133g(r7, r0)
            java.lang.String r0 = "connectionUser"
            kotlin.jvm.internal.AbstractC9133u.m16133g(r8, r0)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r5.f18812i
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r0, r1)
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r0.next()
            n9.o r1 = (p192n9.C9488o) r1
            kotlin.jvm.internal.AbstractC9133u.m16130d(r1)
            monitor-enter(r1)
            r2 = 1
            r3 = 0
            if (r10 == 0) goto L32
            boolean r4 = r1.m17557q()     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L32
            goto L3d
        L30:
            r6 = move-exception
            goto L6a
        L32:
            boolean r4 = r1.m17555o(r7, r9)     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L39
            goto L3d
        L39:
            r8.mo17422i(r1)     // Catch: java.lang.Throwable -> L30
            r3 = r2
        L3d:
            monitor-exit(r1)
            if (r3 == 0) goto L15
            boolean r3 = r1.m17556p(r6)
            if (r3 == 0) goto L47
            return r1
        L47:
            monitor-enter(r1)
            boolean r3 = r1.m17551k()     // Catch: java.lang.Throwable -> L67
            r1.m17563w(r2)     // Catch: java.lang.Throwable -> L67
            java.net.Socket r2 = r8.mo17432s()     // Catch: java.lang.Throwable -> L67
            monitor-exit(r1)
            if (r2 == 0) goto L5f
            p147j9.AbstractC9041k.m15778h(r2)
            n9.f r2 = r5.f18806c
            r2.m17463f(r1)
            goto L15
        L5f:
            if (r3 != 0) goto L15
            n9.f r2 = r5.f18806c
            r2.m17465h(r1)
            goto L15
        L67:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        L6a:
            monitor-exit(r1)
            throw r6
        L6c:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p192n9.C9489p.m17567a(boolean, i9.a, n9.g, java.util.List, boolean):n9.o");
    }

    /* renamed from: b */
    public final long m17568b(long j10) throws IOException {
        Map map = this.f18809f;
        Iterator it = map.values().iterator();
        C9488o c9488o = null;
        if (it.hasNext()) {
            AbstractC5379p.m2596a(it.next());
            throw null;
        }
        Iterator it2 = this.f18812i.iterator();
        AbstractC9133u.m16132f(it2, "iterator(...)");
        while (it2.hasNext()) {
            AbstractC5379p.m2596a(map.get(((C9488o) it2.next()).mo17446d().m15174a()));
        }
        long j11 = (j10 - this.f18808e) + 1;
        Iterator it3 = this.f18812i.iterator();
        AbstractC9133u.m16132f(it3, "iterator(...)");
        int i10 = 0;
        C9488o c9488o2 = null;
        C9488o c9488o3 = null;
        long j12 = Long.MAX_VALUE;
        int i11 = 0;
        while (it3.hasNext()) {
            C9488o c9488o4 = (C9488o) it3.next();
            AbstractC9133u.m16130d(c9488o4);
            synchronized (c9488o4) {
                if (m17572f(c9488o4, j10) > 0) {
                    i11++;
                } else {
                    long jM17550j = c9488o4.m17550j();
                    if (jM17550j < j11) {
                        c9488o2 = c9488o4;
                        j11 = jM17550j;
                    }
                    if (m17571e(map, c9488o4)) {
                        i10++;
                        if (jM17550j < j12) {
                            c9488o3 = c9488o4;
                            j12 = jM17550j;
                        }
                    }
                }
                C8736p c8736p = C8736p.f16368a;
            }
        }
        if (c9488o2 != null) {
            c9488o = c9488o2;
        } else if (i10 > this.f18805b) {
            j11 = j12;
            c9488o = c9488o3;
        } else {
            j11 = -1;
        }
        if (c9488o == null) {
            if (c9488o3 != null) {
                return (j12 + this.f18808e) - j10;
            }
            if (i11 > 0) {
                return this.f18808e;
            }
            return -1L;
        }
        synchronized (c9488o) {
            if (!c9488o.m17548h().isEmpty()) {
                return 0L;
            }
            if (c9488o.m17550j() != j11) {
                return 0L;
            }
            c9488o.m17563w(true);
            this.f18812i.remove(c9488o);
            AbstractC5379p.m2596a(map.get(c9488o.mo17446d().m15174a()));
            AbstractC9041k.m15778h(c9488o.m17564x());
            this.f18806c.m17463f(c9488o);
            if (this.f18812i.isEmpty()) {
                this.f18810g.m17183a();
            }
            return 0L;
        }
    }

    /* renamed from: c */
    public final boolean m17569c(C9488o connection) {
        AbstractC9133u.m16133g(connection, "connection");
        if (AbstractC9041k.f17265b && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.m17551k() && this.f18805b != 0) {
            m17574h();
            return false;
        }
        connection.m17563w(true);
        this.f18812i.remove(connection);
        if (this.f18812i.isEmpty()) {
            this.f18810g.m17183a();
        }
        m17575i(connection.mo17446d().m15174a());
        return true;
    }

    /* renamed from: d */
    public final AbstractC9479f m17570d() {
        return this.f18806c;
    }

    /* renamed from: e */
    public final boolean m17571e(Map map, C9488o c9488o) {
        AbstractC5379p.m2596a(map.get(c9488o.mo17446d().m15174a()));
        return true;
    }

    /* renamed from: f */
    public final int m17572f(C9488o c9488o, long j10) {
        if (AbstractC9041k.f17265b && !Thread.holdsLock(c9488o)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c9488o);
        }
        List listM17548h = c9488o.m17548h();
        int i10 = 0;
        while (i10 < listM17548h.size()) {
            Reference reference = (Reference) listM17548h.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                AbstractC9133u.m16131e(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                AbstractC9570c.f19216a.m18112e().mo18094m("A connection to " + c9488o.m17560t().m15174a().m14950l() + " was leaked. Did you forget to close a response body?", ((C9487n.b) reference).m17542a());
                listM17548h.remove(i10);
                if (listM17548h.isEmpty()) {
                    c9488o.m17562v(j10 - this.f18808e);
                    return 0;
                }
            }
        }
        return listM17548h.size();
    }

    /* renamed from: g */
    public final void m17573g(C9488o connection) {
        AbstractC9133u.m16133g(connection, "connection");
        if (!AbstractC9041k.f17265b || Thread.holdsLock(connection)) {
            this.f18812i.add(connection);
            m17574h();
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    /* renamed from: h */
    public final void m17574h() {
        C9345c.m17182m(this.f18810g, this.f18811h, 0L, 2, null);
    }

    /* renamed from: i */
    public final void m17575i(C8896a address) {
        AbstractC9133u.m16133g(address, "address");
        AbstractC5379p.m2596a(this.f18809f.get(address));
    }
}
