package ne;

import androidx.compose.animation.core.AnimationKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;

/* renamed from: ne.e */
/* loaded from: classes6.dex */
public final class C10415e {

    /* renamed from: h */
    public static final b f24783h = new b(null);

    /* renamed from: i */
    public static final C10415e f24784i = new C10415e(new c(AbstractC9920d.m20005M(AbstractC9920d.f23249i + " TaskRunner", true)));

    /* renamed from: j */
    public static final Logger f24785j;

    /* renamed from: a */
    public final a f24786a;

    /* renamed from: b */
    public int f24787b;

    /* renamed from: c */
    public boolean f24788c;

    /* renamed from: d */
    public long f24789d;

    /* renamed from: e */
    public final List f24790e;

    /* renamed from: f */
    public final List f24791f;

    /* renamed from: g */
    public final Runnable f24792g;

    /* renamed from: ne.e$a */
    public interface a {
        /* renamed from: a */
        void mo21803a(C10415e c10415e, long j10);

        /* renamed from: b */
        void mo21804b(C10415e c10415e);

        void execute(Runnable runnable);

        long nanoTime();
    }

    /* renamed from: ne.e$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final Logger m21805a() {
            return C10415e.f24785j;
        }

        public b() {
        }
    }

    /* renamed from: ne.e$c */
    public static final class c implements a {

        /* renamed from: a */
        public final ThreadPoolExecutor f24793a;

        public c(ThreadFactory threadFactory) {
            AbstractC9979u.m20294g(threadFactory, "threadFactory");
            this.f24793a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // ne.C10415e.a
        /* renamed from: a */
        public void mo21803a(C10415e taskRunner, long j10) throws InterruptedException {
            AbstractC9979u.m20294g(taskRunner, "taskRunner");
            long j11 = j10 / AnimationKt.MillisToNanos;
            long j12 = j10 - (AnimationKt.MillisToNanos * j11);
            if (j11 > 0 || j10 > 0) {
                taskRunner.wait(j11, (int) j12);
            }
        }

        @Override // ne.C10415e.a
        /* renamed from: b */
        public void mo21804b(C10415e taskRunner) {
            AbstractC9979u.m20294g(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // ne.C10415e.a
        public void execute(Runnable runnable) {
            AbstractC9979u.m20294g(runnable, "runnable");
            this.f24793a.execute(runnable);
        }

        @Override // ne.C10415e.a
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    /* renamed from: ne.e$d */
    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC10411a abstractC10411aM21796d;
            long jNanoTime;
            while (true) {
                C10415e c10415e = C10415e.this;
                synchronized (c10415e) {
                    abstractC10411aM21796d = c10415e.m21796d();
                }
                if (abstractC10411aM21796d == null) {
                    return;
                }
                C10414d c10414dM21772d = abstractC10411aM21796d.m21772d();
                AbstractC9979u.m20291d(c10414dM21772d);
                C10415e c10415e2 = C10415e.this;
                boolean zIsLoggable = C10415e.f24783h.m21805a().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jNanoTime = c10414dM21772d.m21787h().m21799g().nanoTime();
                    AbstractC10412b.m21778c(abstractC10411aM21796d, c10414dM21772d, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    try {
                        c10415e2.m21802j(abstractC10411aM21796d);
                        C10786q c10786q = C10786q.f26013a;
                        if (zIsLoggable) {
                            AbstractC10412b.m21778c(abstractC10411aM21796d, c10414dM21772d, "finished run in " + AbstractC10412b.m21777b(c10414dM21772d.m21787h().m21799g().nanoTime() - jNanoTime));
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        AbstractC10412b.m21778c(abstractC10411aM21796d, c10414dM21772d, "failed a run in " + AbstractC10412b.m21777b(c10414dM21772d.m21787h().m21799g().nanoTime() - jNanoTime));
                    }
                    throw th;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(C10415e.class.getName());
        AbstractC9979u.m20293f(logger, "getLogger(TaskRunner::class.java.name)");
        f24785j = logger;
    }

    public C10415e(a backend) {
        AbstractC9979u.m20294g(backend, "backend");
        this.f24786a = backend;
        this.f24787b = 10000;
        this.f24790e = new ArrayList();
        this.f24791f = new ArrayList();
        this.f24792g = new d();
    }

    /* renamed from: c */
    public final void m21795c(AbstractC10411a abstractC10411a, long j10) {
        if (AbstractC9920d.f23248h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        C10414d c10414dM21772d = abstractC10411a.m21772d();
        AbstractC9979u.m20291d(c10414dM21772d);
        if (c10414dM21772d.m21782c() != abstractC10411a) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zM21783d = c10414dM21772d.m21783d();
        c10414dM21772d.m21791m(false);
        c10414dM21772d.m21790l(null);
        this.f24790e.remove(c10414dM21772d);
        if (j10 != -1 && !zM21783d && !c10414dM21772d.m21786g()) {
            c10414dM21772d.m21789k(abstractC10411a, j10, true);
        }
        if (c10414dM21772d.m21784e().isEmpty()) {
            return;
        }
        this.f24791f.add(c10414dM21772d);
    }

    /* renamed from: d */
    public final AbstractC10411a m21796d() {
        boolean z10;
        if (AbstractC9920d.f23248h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f24791f.isEmpty()) {
            long jNanoTime = this.f24786a.nanoTime();
            Iterator it = this.f24791f.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC10411a abstractC10411a = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                AbstractC10411a abstractC10411a2 = (AbstractC10411a) ((C10414d) it.next()).m21784e().get(0);
                long jMax = Math.max(0L, abstractC10411a2.m21771c() - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC10411a != null) {
                        z10 = true;
                        break;
                    }
                    abstractC10411a = abstractC10411a2;
                }
            }
            if (abstractC10411a != null) {
                m21797e(abstractC10411a);
                if (z10 || (!this.f24788c && !this.f24791f.isEmpty())) {
                    this.f24786a.execute(this.f24792g);
                }
                return abstractC10411a;
            }
            if (this.f24788c) {
                if (jMin < this.f24789d - jNanoTime) {
                    this.f24786a.mo21804b(this);
                }
                return null;
            }
            this.f24788c = true;
            this.f24789d = jNanoTime + jMin;
            try {
                try {
                    this.f24786a.mo21803a(this, jMin);
                } catch (InterruptedException unused) {
                    m21798f();
                }
            } finally {
                this.f24788c = false;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m21797e(AbstractC10411a abstractC10411a) {
        if (AbstractC9920d.f23248h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        abstractC10411a.m21775g(-1L);
        C10414d c10414dM21772d = abstractC10411a.m21772d();
        AbstractC9979u.m20291d(c10414dM21772d);
        c10414dM21772d.m21784e().remove(abstractC10411a);
        this.f24791f.remove(c10414dM21772d);
        c10414dM21772d.m21790l(abstractC10411a);
        this.f24790e.add(c10414dM21772d);
    }

    /* renamed from: f */
    public final void m21798f() {
        int size = this.f24790e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((C10414d) this.f24790e.get(size)).m21781b();
            }
        }
        for (int size2 = this.f24791f.size() - 1; -1 < size2; size2--) {
            C10414d c10414d = (C10414d) this.f24791f.get(size2);
            c10414d.m21781b();
            if (c10414d.m21784e().isEmpty()) {
                this.f24791f.remove(size2);
            }
        }
    }

    /* renamed from: g */
    public final a m21799g() {
        return this.f24786a;
    }

    /* renamed from: h */
    public final void m21800h(C10414d taskQueue) {
        AbstractC9979u.m20294g(taskQueue, "taskQueue");
        if (AbstractC9920d.f23248h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.m21782c() == null) {
            if (taskQueue.m21784e().isEmpty()) {
                this.f24791f.remove(taskQueue);
            } else {
                AbstractC9920d.m20021c(this.f24791f, taskQueue);
            }
        }
        if (this.f24788c) {
            this.f24786a.mo21804b(this);
        } else {
            this.f24786a.execute(this.f24792g);
        }
    }

    /* renamed from: i */
    public final C10414d m21801i() {
        int i10;
        synchronized (this) {
            i10 = this.f24787b;
            this.f24787b = i10 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i10);
        return new C10414d(this, sb2.toString());
    }

    /* renamed from: j */
    public final void m21802j(AbstractC10411a abstractC10411a) {
        if (AbstractC9920d.f23248h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(abstractC10411a.m21770b());
        try {
            long jMo21774f = abstractC10411a.mo21774f();
            synchronized (this) {
                m21795c(abstractC10411a, jMo21774f);
                C10786q c10786q = C10786q.f26013a;
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                m21795c(abstractC10411a, -1L);
                C10786q c10786q2 = C10786q.f26013a;
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }
}
