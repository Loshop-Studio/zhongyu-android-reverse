package p093k5;

import java.io.IOException;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.AbstractC7536c;
import p058f5.C6355a;
import p065g5.AbstractC6427k;
import p086j5.AbstractC6598a;
import p086j5.C6600c;
import p086j5.C6601d;
import p087k.AbstractC6619r;
import p093k5.C6691n;

/* renamed from: k5.p */
/* loaded from: classes4.dex */
public final class C6693p {

    /* renamed from: j */
    public static final a f8932j = new a(null);

    /* renamed from: k */
    public static AtomicReferenceFieldUpdater f8933k = AtomicReferenceFieldUpdater.newUpdater(C6693p.class, Map.class, "f");

    /* renamed from: a */
    public final C6601d f8934a;

    /* renamed from: b */
    public final int f8935b;

    /* renamed from: c */
    public final AbstractC6683f f8936c;

    /* renamed from: d */
    public final Function3 f8937d;

    /* renamed from: e */
    public final long f8938e;

    /* renamed from: f */
    public volatile Map f8939f;

    /* renamed from: g */
    public final C6600c f8940g;

    /* renamed from: h */
    public final b f8941h;

    /* renamed from: i */
    public final ConcurrentLinkedQueue f8942i;

    /* renamed from: k5.p$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: k5.p$b */
    public static final class b extends AbstractC6598a {
        public b(String str) {
            super(str, false, 2, null);
        }

        @Override // p086j5.AbstractC6598a
        /* renamed from: f */
        public long mo7526f() {
            return C6693p.this.m7835b(System.nanoTime());
        }
    }

    public C6693p(C6601d taskRunner, int i6, long j6, TimeUnit timeUnit, AbstractC6683f connectionListener, Function3 exchangeFinderFactory) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(connectionListener, "connectionListener");
        Intrinsics.checkNotNullParameter(exchangeFinderFactory, "exchangeFinderFactory");
        this.f8934a = taskRunner;
        this.f8935b = i6;
        this.f8936c = connectionListener;
        this.f8937d = exchangeFinderFactory;
        this.f8938e = timeUnit.toNanos(j6);
        this.f8939f = MapsKt.emptyMap();
        this.f8940g = taskRunner.m7558k();
        this.f8941h = new b(AbstractC6427k.f8101c + " ConnectionPool connection closer");
        this.f8942i = new ConcurrentLinkedQueue();
        if (j6 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j6).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:9:0x0029, B:14:0x0032, B:17:0x0039), top: B:38:0x0029 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p093k5.C6692o m7834a(boolean r6, p058f5.C6355a r7, p093k5.InterfaceC6684g r8, java.util.List r9, boolean r10) throws java.io.IOException {
        /*
            r5 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "connectionUser"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r5.f8942i
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r0.next()
            k5.o r1 = (p093k5.C6692o) r1
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            monitor-enter(r1)
            r2 = 1
            r3 = 0
            if (r10 == 0) goto L32
            boolean r4 = r1.m7824q()     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L32
            goto L3d
        L30:
            r6 = move-exception
            goto L6a
        L32:
            boolean r4 = r1.m7822o(r7, r9)     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L39
            goto L3d
        L39:
            r8.mo7703w(r1)     // Catch: java.lang.Throwable -> L30
            r3 = r2
        L3d:
            monitor-exit(r1)
            if (r3 == 0) goto L15
            boolean r3 = r1.m7823p(r6)
            if (r3 == 0) goto L47
            return r1
        L47:
            monitor-enter(r1)
            boolean r3 = r1.m7818k()     // Catch: java.lang.Throwable -> L67
            r1.m7830w(r2)     // Catch: java.lang.Throwable -> L67
            java.net.Socket r2 = r8.mo7698r()     // Catch: java.lang.Throwable -> L67
            monitor-exit(r1)
            if (r2 == 0) goto L5f
            p065g5.AbstractC6427k.m7020h(r2)
            k5.f r2 = r5.f8936c
            r2.m7730f(r1)
            goto L15
        L5f:
            if (r3 != 0) goto L15
            k5.f r2 = r5.f8936c
            r2.m7732h(r1)
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
        throw new UnsupportedOperationException("Method not decompiled: p093k5.C6693p.m7834a(boolean, f5.a, k5.g, java.util.List, boolean):k5.o");
    }

    /* renamed from: b */
    public final long m7835b(long j6) throws IOException {
        Map map = this.f8939f;
        Iterator it = map.values().iterator();
        C6692o c6692o = null;
        if (it.hasNext()) {
            AbstractC6619r.m7572a(it.next());
            throw null;
        }
        Iterator it2 = this.f8942i.iterator();
        Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
        while (it2.hasNext()) {
            AbstractC6619r.m7572a(map.get(((C6692o) it2.next()).mo7714e().m6713a()));
        }
        long j7 = (j6 - this.f8938e) + 1;
        Iterator it3 = this.f8942i.iterator();
        Intrinsics.checkNotNullExpressionValue(it3, "iterator(...)");
        int i6 = 0;
        C6692o c6692o2 = null;
        C6692o c6692o3 = null;
        long j8 = Long.MAX_VALUE;
        int i7 = 0;
        while (it3.hasNext()) {
            C6692o c6692o4 = (C6692o) it3.next();
            Intrinsics.checkNotNull(c6692o4);
            synchronized (c6692o4) {
                if (m7839f(c6692o4, j6) > 0) {
                    i7++;
                } else {
                    long jM7817j = c6692o4.m7817j();
                    if (jM7817j < j7) {
                        c6692o2 = c6692o4;
                        j7 = jM7817j;
                    }
                    if (m7838e(map, c6692o4)) {
                        i6++;
                        if (jM7817j < j8) {
                            c6692o3 = c6692o4;
                            j8 = jM7817j;
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        if (c6692o2 != null) {
            c6692o = c6692o2;
        } else if (i6 > this.f8935b) {
            j7 = j8;
            c6692o = c6692o3;
        } else {
            j7 = -1;
        }
        if (c6692o == null) {
            if (c6692o3 != null) {
                return (j8 + this.f8938e) - j6;
            }
            if (i7 > 0) {
                return this.f8938e;
            }
            return -1L;
        }
        synchronized (c6692o) {
            if (!c6692o.m7815h().isEmpty()) {
                return 0L;
            }
            if (c6692o.m7817j() != j7) {
                return 0L;
            }
            c6692o.m7830w(true);
            this.f8942i.remove(c6692o);
            AbstractC6619r.m7572a(map.get(c6692o.mo7714e().m6713a()));
            AbstractC6427k.m7020h(c6692o.m7831x());
            this.f8936c.m7730f(c6692o);
            if (this.f8942i.isEmpty()) {
                this.f8940g.m7533a();
            }
            return 0L;
        }
    }

    /* renamed from: c */
    public final boolean m7836c(C6692o connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (AbstractC6427k.f8100b && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.m7818k() && this.f8935b != 0) {
            m7841h();
            return false;
        }
        connection.m7830w(true);
        this.f8942i.remove(connection);
        if (this.f8942i.isEmpty()) {
            this.f8940g.m7533a();
        }
        m7842i(connection.mo7714e().m6713a());
        return true;
    }

    /* renamed from: d */
    public final AbstractC6683f m7837d() {
        return this.f8936c;
    }

    /* renamed from: e */
    public final boolean m7838e(Map map, C6692o c6692o) {
        AbstractC6619r.m7572a(map.get(c6692o.mo7714e().m6713a()));
        return true;
    }

    /* renamed from: f */
    public final int m7839f(C6692o c6692o, long j6) {
        if (AbstractC6427k.f8100b && !Thread.holdsLock(c6692o)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + c6692o);
        }
        List listM7815h = c6692o.m7815h();
        int i6 = 0;
        while (i6 < listM7815h.size()) {
            Reference reference = (Reference) listM7815h.get(i6);
            if (reference.get() != null) {
                i6++;
            } else {
                Intrinsics.checkNotNull(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                AbstractC7536c.f9994a.m8931e().mo8913m("A connection to " + c6692o.m7827t().m6713a().m6486l() + " was leaked. Did you forget to close a response body?", ((C6691n.b) reference).m7809a());
                listM7815h.remove(i6);
                if (listM7815h.isEmpty()) {
                    c6692o.m7829v(j6 - this.f8938e);
                    return 0;
                }
            }
        }
        return listM7815h.size();
    }

    /* renamed from: g */
    public final void m7840g(C6692o connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!AbstractC6427k.f8100b || Thread.holdsLock(connection)) {
            this.f8942i.add(connection);
            m7841h();
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    /* renamed from: h */
    public final void m7841h() {
        C6600c.m7532m(this.f8940g, this.f8941h, 0L, 2, null);
    }

    /* renamed from: i */
    public final void m7842i(C6355a address) {
        Intrinsics.checkNotNullParameter(address, "address");
        AbstractC6619r.m7572a(this.f8939f.get(address));
    }
}
