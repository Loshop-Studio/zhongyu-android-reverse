package p181m9;

import androidx.compose.animation.core.AnimationKt;
import com.tencent.smtt.audio.core.utils.TbsDialogBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p147j9.AbstractC9038h;
import p147j9.AbstractC9041k;

/* renamed from: m9.d */
/* loaded from: classes5.dex */
public final class C9346d {

    /* renamed from: k */
    public static final b f18413k = new b(null);

    /* renamed from: l */
    public static final Logger f18414l;

    /* renamed from: m */
    public static final C9346d f18415m;

    /* renamed from: a */
    public final a f18416a;

    /* renamed from: b */
    public final Logger f18417b;

    /* renamed from: c */
    public int f18418c;

    /* renamed from: d */
    public boolean f18419d;

    /* renamed from: e */
    public long f18420e;

    /* renamed from: f */
    public int f18421f;

    /* renamed from: g */
    public int f18422g;

    /* renamed from: h */
    public final List f18423h;

    /* renamed from: i */
    public final List f18424i;

    /* renamed from: j */
    public final Runnable f18425j;

    /* renamed from: m9.d$a */
    public interface a {
        /* renamed from: a */
        void mo17210a(C9346d c9346d);

        /* renamed from: b */
        BlockingQueue mo17211b(BlockingQueue blockingQueue);

        /* renamed from: c */
        void mo17212c(C9346d c9346d, long j10);

        /* renamed from: d */
        void mo17213d(C9346d c9346d, Runnable runnable);

        /* renamed from: e */
        long mo17214e();
    }

    /* renamed from: m9.d$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        public b() {
        }
    }

    /* renamed from: m9.d$c */
    public static final class c implements a {

        /* renamed from: a */
        public final ThreadPoolExecutor f18426a;

        public c(ThreadFactory threadFactory) {
            AbstractC9133u.m16133g(threadFactory, "threadFactory");
            this.f18426a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // p181m9.C9346d.a
        /* renamed from: a */
        public void mo17210a(C9346d taskRunner) {
            AbstractC9133u.m16133g(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // p181m9.C9346d.a
        /* renamed from: b */
        public BlockingQueue mo17211b(BlockingQueue queue) {
            AbstractC9133u.m16133g(queue, "queue");
            return queue;
        }

        @Override // p181m9.C9346d.a
        /* renamed from: c */
        public void mo17212c(C9346d taskRunner, long j10) throws InterruptedException {
            AbstractC9133u.m16133g(taskRunner, "taskRunner");
            if (AbstractC9041k.f17265b && !Thread.holdsLock(taskRunner)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + taskRunner);
            }
            if (j10 > 0) {
                long j11 = j10 / AnimationKt.MillisToNanos;
                long j12 = j10 - (AnimationKt.MillisToNanos * j11);
                if (j11 > 0 || j10 > 0) {
                    taskRunner.wait(j11, (int) j12);
                }
            }
        }

        @Override // p181m9.C9346d.a
        /* renamed from: d */
        public void mo17213d(C9346d taskRunner, Runnable runnable) {
            AbstractC9133u.m16133g(taskRunner, "taskRunner");
            AbstractC9133u.m16133g(runnable, "runnable");
            this.f18426a.execute(runnable);
        }

        @Override // p181m9.C9346d.a
        /* renamed from: e */
        public long mo17214e() {
            return System.nanoTime();
        }
    }

    /* renamed from: m9.d$d */
    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC9343a abstractC9343aM17202e;
            long jMo17214e;
            AbstractC9343a abstractC9343aM17202e2;
            C9346d c9346d = C9346d.this;
            synchronized (c9346d) {
                c9346d.f18422g++;
                abstractC9343aM17202e = c9346d.m17202e();
            }
            if (abstractC9343aM17202e == null) {
                return;
            }
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            while (true) {
                try {
                    threadCurrentThread.setName(abstractC9343aM17202e.m17172b());
                    Logger loggerM17206i = C9346d.this.m17206i();
                    C9345c c9345cM17174d = abstractC9343aM17202e.m17174d();
                    AbstractC9133u.m16130d(c9345cM17174d);
                    boolean zIsLoggable = loggerM17206i.isLoggable(Level.FINE);
                    if (zIsLoggable) {
                        jMo17214e = c9345cM17174d.m17191j().m17205h().mo17214e();
                        AbstractC9344b.m17180c(loggerM17206i, abstractC9343aM17202e, c9345cM17174d, "starting");
                    } else {
                        jMo17214e = -1;
                    }
                    try {
                        long jMo17176f = abstractC9343aM17202e.mo17176f();
                        if (zIsLoggable) {
                            AbstractC9344b.m17180c(loggerM17206i, abstractC9343aM17202e, c9345cM17174d, "finished run in " + AbstractC9344b.m17179b(c9345cM17174d.m17191j().m17205h().mo17214e() - jMo17214e));
                        }
                        C9346d c9346d2 = C9346d.this;
                        synchronized (c9346d2) {
                            c9346d2.m17201d(abstractC9343aM17202e, jMo17176f, true);
                            abstractC9343aM17202e2 = c9346d2.m17202e();
                        }
                        if (abstractC9343aM17202e2 == null) {
                            threadCurrentThread.setName(name);
                            return;
                        }
                        abstractC9343aM17202e = abstractC9343aM17202e2;
                    } catch (Throwable th) {
                        if (zIsLoggable) {
                            AbstractC9344b.m17180c(loggerM17206i, abstractC9343aM17202e, c9345cM17174d, "failed a run in " + AbstractC9344b.m17179b(c9345cM17174d.m17191j().m17205h().mo17214e() - jMo17214e));
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        C9346d c9346d3 = C9346d.this;
                        synchronized (c9346d3) {
                            c9346d3.m17201d(abstractC9343aM17202e, -1L, false);
                            C8736p c8736p = C8736p.f16368a;
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        threadCurrentThread.setName(name);
                        throw th3;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Logger logger = Logger.getLogger(C9346d.class.getName());
        AbstractC9133u.m16132f(logger, "getLogger(...)");
        f18414l = logger;
        f18415m = new C9346d(new c(AbstractC9041k.m15786p(AbstractC9041k.f17266c + " TaskRunner", true)), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }

    public C9346d(a backend, Logger logger) {
        AbstractC9133u.m16133g(backend, "backend");
        AbstractC9133u.m16133g(logger, "logger");
        this.f18416a = backend;
        this.f18417b = logger;
        this.f18418c = TbsDialogBase.BTN_ID_POSITIVE;
        this.f18423h = new ArrayList();
        this.f18424i = new ArrayList();
        this.f18425j = new d();
    }

    /* renamed from: d */
    public final void m17201d(AbstractC9343a abstractC9343a, long j10, boolean z10) {
        if (AbstractC9041k.f17265b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        C9345c c9345cM17174d = abstractC9343a.m17174d();
        AbstractC9133u.m16130d(c9345cM17174d);
        if (c9345cM17174d.m17186e() != abstractC9343a) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zM17187f = c9345cM17174d.m17187f();
        c9345cM17174d.m17196p(false);
        c9345cM17174d.m17195o(null);
        this.f18423h.remove(c9345cM17174d);
        if (j10 != -1 && !zM17187f && !c9345cM17174d.m17190i()) {
            c9345cM17174d.m17194n(abstractC9343a, j10, true);
        }
        if (c9345cM17174d.m17188g().isEmpty()) {
            return;
        }
        this.f18424i.add(c9345cM17174d);
        if (z10) {
            return;
        }
        m17209l();
    }

    /* renamed from: e */
    public final AbstractC9343a m17202e() {
        boolean z10;
        if (AbstractC9041k.f17265b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f18424i.isEmpty()) {
            long jMo17214e = this.f18416a.mo17214e();
            Iterator it = this.f18424i.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC9343a abstractC9343a = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                AbstractC9343a abstractC9343a2 = (AbstractC9343a) ((C9345c) it.next()).m17188g().get(0);
                long jMax = Math.max(0L, abstractC9343a2.m17173c() - jMo17214e);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC9343a != null) {
                        z10 = true;
                        break;
                    }
                    abstractC9343a = abstractC9343a2;
                }
            }
            if (abstractC9343a != null) {
                m17203f(abstractC9343a);
                if (z10 || (!this.f18419d && !this.f18424i.isEmpty())) {
                    m17209l();
                }
                return abstractC9343a;
            }
            if (this.f18419d) {
                if (jMin < this.f18420e - jMo17214e) {
                    this.f18416a.mo17210a(this);
                }
                return null;
            }
            this.f18419d = true;
            this.f18420e = jMo17214e + jMin;
            try {
                try {
                    this.f18416a.mo17212c(this, jMin);
                } catch (InterruptedException unused) {
                    m17204g();
                }
            } finally {
                this.f18419d = false;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void m17203f(AbstractC9343a abstractC9343a) {
        if (AbstractC9041k.f17265b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        abstractC9343a.m17177g(-1L);
        C9345c c9345cM17174d = abstractC9343a.m17174d();
        AbstractC9133u.m16130d(c9345cM17174d);
        c9345cM17174d.m17188g().remove(abstractC9343a);
        this.f18424i.remove(c9345cM17174d);
        c9345cM17174d.m17195o(abstractC9343a);
        this.f18423h.add(c9345cM17174d);
    }

    /* renamed from: g */
    public final void m17204g() {
        if (AbstractC9041k.f17265b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        int size = this.f18423h.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((C9345c) this.f18423h.get(size)).m17184b();
            }
        }
        for (int size2 = this.f18424i.size() - 1; -1 < size2; size2--) {
            C9345c c9345c = (C9345c) this.f18424i.get(size2);
            c9345c.m17184b();
            if (c9345c.m17188g().isEmpty()) {
                this.f18424i.remove(size2);
            }
        }
    }

    /* renamed from: h */
    public final a m17205h() {
        return this.f18416a;
    }

    /* renamed from: i */
    public final Logger m17206i() {
        return this.f18417b;
    }

    /* renamed from: j */
    public final void m17207j(C9345c taskQueue) {
        AbstractC9133u.m16133g(taskQueue, "taskQueue");
        if (AbstractC9041k.f17265b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.m17186e() == null) {
            if (taskQueue.m17188g().isEmpty()) {
                this.f18424i.remove(taskQueue);
            } else {
                AbstractC9038h.m15745a(this.f18424i, taskQueue);
            }
        }
        if (this.f18419d) {
            this.f18416a.mo17210a(this);
        } else {
            m17209l();
        }
    }

    /* renamed from: k */
    public final C9345c m17208k() {
        int i10;
        synchronized (this) {
            i10 = this.f18418c;
            this.f18418c = i10 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i10);
        return new C9345c(this, sb.toString());
    }

    /* renamed from: l */
    public final void m17209l() {
        if (!AbstractC9041k.f17265b || Thread.holdsLock(this)) {
            int i10 = this.f18421f;
            if (i10 > this.f18422g) {
                return;
            }
            this.f18421f = i10 + 1;
            this.f18416a.mo17213d(this, this.f18425j);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    public /* synthetic */ C9346d(a aVar, Logger logger, int i10, AbstractC9126n abstractC9126n) {
        this(aVar, (i10 & 2) != 0 ? f18414l : logger);
    }
}
