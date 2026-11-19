package p168e.p169q.p171d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p070b.p071a.p072a.p073a.C0561a;
import p070b.p113c.p114a.C0787a;
import p160d.p162f.p164b.C1011d;
import p168e.p169q.C1045b;
import p168e.p169q.ThreadFactoryC1044a;

/* renamed from: e.q.d.c */
/* loaded from: classes.dex */
public final class C1049c {

    /* renamed from: h */
    public static final C1049c f5589h;

    /* renamed from: i */
    public static final Logger f5590i;

    /* renamed from: j */
    public static final C1049c f5591j = null;

    /* renamed from: a */
    public int f5592a;

    /* renamed from: b */
    public boolean f5593b;

    /* renamed from: c */
    public long f5594c;

    /* renamed from: d */
    public final List<C1048b> f5595d;

    /* renamed from: e */
    public final List<C1048b> f5596e;

    /* renamed from: f */
    public final Runnable f5597f;

    /* renamed from: g */
    public final a f5598g;

    /* renamed from: e.q.d.c$a */
    public interface a {
        /* renamed from: a */
        void mo2846a(C1049c c1049c);

        /* renamed from: b */
        void mo2847b(C1049c c1049c, long j);

        /* renamed from: c */
        void mo2848c(Runnable runnable);

        /* renamed from: d */
        long mo2849d();
    }

    /* renamed from: e.q.d.c$b */
    public static final class b implements a {

        /* renamed from: a */
        public final ThreadPoolExecutor f5599a;

        public b(ThreadFactory threadFactory) {
            C1011d.m2809e(threadFactory, "threadFactory");
            this.f5599a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // p168e.p169q.p171d.C1049c.a
        /* renamed from: a */
        public void mo2846a(C1049c c1049c) {
            C1011d.m2809e(c1049c, "taskRunner");
            c1049c.notify();
        }

        @Override // p168e.p169q.p171d.C1049c.a
        /* renamed from: b */
        public void mo2847b(C1049c c1049c, long j) throws InterruptedException {
            C1011d.m2809e(c1049c, "taskRunner");
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                c1049c.wait(j2, (int) j3);
            }
        }

        @Override // p168e.p169q.p171d.C1049c.a
        /* renamed from: c */
        public void mo2848c(Runnable runnable) {
            C1011d.m2809e(runnable, "runnable");
            this.f5599a.execute(runnable);
        }

        @Override // p168e.p169q.p171d.C1049c.a
        /* renamed from: d */
        public long mo2849d() {
            return System.nanoTime();
        }
    }

    /* renamed from: e.q.d.c$c */
    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1047a abstractC1047aM2844c;
            while (true) {
                synchronized (C1049c.this) {
                    abstractC1047aM2844c = C1049c.this.m2844c();
                }
                if (abstractC1047aM2844c == null) {
                    return;
                }
                C1048b c1048b = abstractC1047aM2844c.f5580a;
                C1011d.m2807c(c1048b);
                long jMo2849d = -1;
                C1049c c1049c = C1049c.f5591j;
                boolean zIsLoggable = C1049c.f5590i.isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jMo2849d = c1048b.f5587d.f5598g.mo2849d();
                    C0787a.m2467a(abstractC1047aM2844c, c1048b, "starting");
                }
                try {
                    C1049c.m2842a(C1049c.this, abstractC1047aM2844c);
                    if (zIsLoggable) {
                        long jMo2849d2 = c1048b.f5587d.f5598g.mo2849d() - jMo2849d;
                        StringBuilder sbM2079g = C0561a.m2079g("finished run in ");
                        sbM2079g.append(C0787a.m2476j(jMo2849d2));
                        C0787a.m2467a(abstractC1047aM2844c, c1048b, sbM2079g.toString());
                    }
                } finally {
                }
            }
        }
    }

    static {
        String str = C1045b.f5578c + " TaskRunner";
        C1011d.m2809e(str, "name");
        f5589h = new C1049c(new b(new ThreadFactoryC1044a(str, true)));
        Logger logger = Logger.getLogger(C1049c.class.getName());
        C1011d.m2808d(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f5590i = logger;
    }

    public C1049c(a aVar) {
        C1011d.m2809e(aVar, "backend");
        this.f5598g = aVar;
        this.f5592a = 10000;
        this.f5595d = new ArrayList();
        this.f5596e = new ArrayList();
        this.f5597f = new c();
    }

    /* renamed from: a */
    public static final void m2842a(C1049c c1049c, AbstractC1047a abstractC1047a) {
        Objects.requireNonNull(c1049c);
        byte[] bArr = C1045b.f5576a;
        Thread threadCurrentThread = Thread.currentThread();
        C1011d.m2808d(threadCurrentThread, "currentThread");
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(abstractC1047a.f5582c);
        try {
            long jM2840a = abstractC1047a.m2840a();
            synchronized (c1049c) {
                c1049c.m2843b(abstractC1047a, jM2840a);
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (c1049c) {
                c1049c.m2843b(abstractC1047a, -1L);
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b5 A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2843b(p168e.p169q.p171d.AbstractC1047a r12, long r13) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p168e.p169q.p171d.C1049c.m2843b(e.q.d.a, long):void");
    }

    /* renamed from: c */
    public final AbstractC1047a m2844c() {
        boolean z;
        byte[] bArr = C1045b.f5576a;
        while (!this.f5596e.isEmpty()) {
            long jMo2849d = this.f5598g.mo2849d();
            long jMin = Long.MAX_VALUE;
            Iterator<C1048b> it = this.f5596e.iterator();
            AbstractC1047a abstractC1047a = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                AbstractC1047a abstractC1047a2 = it.next().f5585b.get(0);
                long jMax = Math.max(0L, abstractC1047a2.f5581b - jMo2849d);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC1047a != null) {
                        z = true;
                        break;
                    }
                    abstractC1047a = abstractC1047a2;
                }
            }
            if (abstractC1047a != null) {
                byte[] bArr2 = C1045b.f5576a;
                abstractC1047a.f5581b = -1L;
                C1048b c1048b = abstractC1047a.f5580a;
                C1011d.m2807c(c1048b);
                c1048b.f5585b.remove(abstractC1047a);
                this.f5596e.remove(c1048b);
                c1048b.f5584a = abstractC1047a;
                this.f5595d.add(c1048b);
                if (z || (!this.f5593b && (!this.f5596e.isEmpty()))) {
                    this.f5598g.mo2848c(this.f5597f);
                }
                return abstractC1047a;
            }
            if (this.f5593b) {
                if (jMin < this.f5594c - jMo2849d) {
                    this.f5598g.mo2846a(this);
                }
                return null;
            }
            this.f5593b = true;
            this.f5594c = jMo2849d + jMin;
            try {
                try {
                    this.f5598g.mo2847b(this, jMin);
                } catch (InterruptedException unused) {
                    m2845d();
                }
            } finally {
                this.f5593b = false;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void m2845d() {
        for (int size = this.f5595d.size() - 1; size >= 0; size--) {
            this.f5595d.get(size).m2841a();
        }
        for (int size2 = this.f5596e.size() - 1; size2 >= 0; size2--) {
            C1048b c1048b = this.f5596e.get(size2);
            c1048b.m2841a();
            if (c1048b.f5585b.isEmpty()) {
                this.f5596e.remove(size2);
            }
        }
    }
}
