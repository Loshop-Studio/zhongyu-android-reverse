package p086j5;

import androidx.compose.animation.core.AnimationKt;
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
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p065g5.AbstractC6424h;
import p065g5.AbstractC6427k;

/* renamed from: j5.d */
/* loaded from: classes4.dex */
public final class C6601d {

    /* renamed from: k */
    public static final b f8625k = new b(null);

    /* renamed from: l */
    public static final Logger f8626l;

    /* renamed from: m */
    public static final C6601d f8627m;

    /* renamed from: a */
    public final a f8628a;

    /* renamed from: b */
    public final Logger f8629b;

    /* renamed from: c */
    public int f8630c;

    /* renamed from: d */
    public boolean f8631d;

    /* renamed from: e */
    public long f8632e;

    /* renamed from: f */
    public int f8633f;

    /* renamed from: g */
    public int f8634g;

    /* renamed from: h */
    public final List f8635h;

    /* renamed from: i */
    public final List f8636i;

    /* renamed from: j */
    public final Runnable f8637j;

    /* renamed from: j5.d$a */
    public interface a {
        /* renamed from: a */
        BlockingQueue mo7560a(BlockingQueue blockingQueue);

        /* renamed from: b */
        void mo7561b(C6601d c6601d, long j6);

        /* renamed from: c */
        void mo7562c(C6601d c6601d);

        /* renamed from: d */
        void mo7563d(C6601d c6601d, Runnable runnable);

        /* renamed from: e */
        long mo7564e();
    }

    /* renamed from: j5.d$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    /* renamed from: j5.d$c */
    public static final class c implements a {

        /* renamed from: a */
        public final ThreadPoolExecutor f8638a;

        public c(ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.f8638a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // p086j5.C6601d.a
        /* renamed from: a */
        public BlockingQueue mo7560a(BlockingQueue queue) {
            Intrinsics.checkNotNullParameter(queue, "queue");
            return queue;
        }

        @Override // p086j5.C6601d.a
        /* renamed from: b */
        public void mo7561b(C6601d taskRunner, long j6) throws InterruptedException {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            if (AbstractC6427k.f8100b && !Thread.holdsLock(taskRunner)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + taskRunner);
            }
            if (j6 > 0) {
                long j7 = j6 / AnimationKt.MillisToNanos;
                long j8 = j6 - (AnimationKt.MillisToNanos * j7);
                if (j7 > 0 || j6 > 0) {
                    taskRunner.wait(j7, (int) j8);
                }
            }
        }

        @Override // p086j5.C6601d.a
        /* renamed from: c */
        public void mo7562c(C6601d taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // p086j5.C6601d.a
        /* renamed from: d */
        public void mo7563d(C6601d taskRunner, Runnable runnable) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f8638a.execute(runnable);
        }

        @Override // p086j5.C6601d.a
        /* renamed from: e */
        public long mo7564e() {
            return System.nanoTime();
        }
    }

    /* renamed from: j5.d$d */
    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC6598a abstractC6598aM7552e;
            long jMo7564e;
            AbstractC6598a abstractC6598aM7552e2;
            C6601d c6601d = C6601d.this;
            synchronized (c6601d) {
                c6601d.f8634g++;
                abstractC6598aM7552e = c6601d.m7552e();
            }
            if (abstractC6598aM7552e == null) {
                return;
            }
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            while (true) {
                try {
                    threadCurrentThread.setName(abstractC6598aM7552e.m7522b());
                    Logger loggerM7556i = C6601d.this.m7556i();
                    C6600c c6600cM7524d = abstractC6598aM7552e.m7524d();
                    Intrinsics.checkNotNull(c6600cM7524d);
                    boolean zIsLoggable = loggerM7556i.isLoggable(Level.FINE);
                    if (zIsLoggable) {
                        jMo7564e = c6600cM7524d.m7541j().m7555h().mo7564e();
                        AbstractC6599b.m7530c(loggerM7556i, abstractC6598aM7552e, c6600cM7524d, "starting");
                    } else {
                        jMo7564e = -1;
                    }
                    try {
                        long jMo7526f = abstractC6598aM7552e.mo7526f();
                        if (zIsLoggable) {
                            AbstractC6599b.m7530c(loggerM7556i, abstractC6598aM7552e, c6600cM7524d, "finished run in " + AbstractC6599b.m7529b(c6600cM7524d.m7541j().m7555h().mo7564e() - jMo7564e));
                        }
                        C6601d c6601d2 = C6601d.this;
                        synchronized (c6601d2) {
                            c6601d2.m7551d(abstractC6598aM7552e, jMo7526f, true);
                            abstractC6598aM7552e2 = c6601d2.m7552e();
                        }
                        if (abstractC6598aM7552e2 == null) {
                            threadCurrentThread.setName(name);
                            return;
                        }
                        abstractC6598aM7552e = abstractC6598aM7552e2;
                    } catch (Throwable th) {
                        if (zIsLoggable) {
                            AbstractC6599b.m7530c(loggerM7556i, abstractC6598aM7552e, c6600cM7524d, "failed a run in " + AbstractC6599b.m7529b(c6600cM7524d.m7541j().m7555h().mo7564e() - jMo7564e));
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        C6601d c6601d3 = C6601d.this;
                        synchronized (c6601d3) {
                            c6601d3.m7551d(abstractC6598aM7552e, -1L, false);
                            Unit unit = Unit.INSTANCE;
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
        Logger logger = Logger.getLogger(C6601d.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        f8626l = logger;
        f8627m = new C6601d(new c(AbstractC6427k.m7028p(AbstractC6427k.f8101c + " TaskRunner", true)), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }

    public C6601d(a backend, Logger logger) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f8628a = backend;
        this.f8629b = logger;
        this.f8630c = 10000;
        this.f8635h = new ArrayList();
        this.f8636i = new ArrayList();
        this.f8637j = new d();
    }

    /* renamed from: d */
    public final void m7551d(AbstractC6598a abstractC6598a, long j6, boolean z6) {
        if (AbstractC6427k.f8100b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        C6600c c6600cM7524d = abstractC6598a.m7524d();
        Intrinsics.checkNotNull(c6600cM7524d);
        if (c6600cM7524d.m7536e() != abstractC6598a) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zM7537f = c6600cM7524d.m7537f();
        c6600cM7524d.m7546p(false);
        c6600cM7524d.m7545o(null);
        this.f8635h.remove(c6600cM7524d);
        if (j6 != -1 && !zM7537f && !c6600cM7524d.m7540i()) {
            c6600cM7524d.m7544n(abstractC6598a, j6, true);
        }
        if (c6600cM7524d.m7538g().isEmpty()) {
            return;
        }
        this.f8636i.add(c6600cM7524d);
        if (z6) {
            return;
        }
        m7559l();
    }

    /* renamed from: e */
    public final AbstractC6598a m7552e() {
        boolean z6;
        if (AbstractC6427k.f8100b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f8636i.isEmpty()) {
            long jMo7564e = this.f8628a.mo7564e();
            Iterator it = this.f8636i.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC6598a abstractC6598a = null;
            while (true) {
                if (!it.hasNext()) {
                    z6 = false;
                    break;
                }
                AbstractC6598a abstractC6598a2 = (AbstractC6598a) ((C6600c) it.next()).m7538g().get(0);
                long jMax = Math.max(0L, abstractC6598a2.m7523c() - jMo7564e);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC6598a != null) {
                        z6 = true;
                        break;
                    }
                    abstractC6598a = abstractC6598a2;
                }
            }
            if (abstractC6598a != null) {
                m7553f(abstractC6598a);
                if (z6 || (!this.f8631d && !this.f8636i.isEmpty())) {
                    m7559l();
                }
                return abstractC6598a;
            }
            if (this.f8631d) {
                if (jMin < this.f8632e - jMo7564e) {
                    this.f8628a.mo7562c(this);
                }
                return null;
            }
            this.f8631d = true;
            this.f8632e = jMo7564e + jMin;
            try {
                try {
                    this.f8628a.mo7561b(this, jMin);
                } catch (InterruptedException unused) {
                    m7554g();
                }
            } finally {
                this.f8631d = false;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void m7553f(AbstractC6598a abstractC6598a) {
        if (AbstractC6427k.f8100b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        abstractC6598a.m7527g(-1L);
        C6600c c6600cM7524d = abstractC6598a.m7524d();
        Intrinsics.checkNotNull(c6600cM7524d);
        c6600cM7524d.m7538g().remove(abstractC6598a);
        this.f8636i.remove(c6600cM7524d);
        c6600cM7524d.m7545o(abstractC6598a);
        this.f8635h.add(c6600cM7524d);
    }

    /* renamed from: g */
    public final void m7554g() {
        if (AbstractC6427k.f8100b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        int size = this.f8635h.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((C6600c) this.f8635h.get(size)).m7534b();
            }
        }
        for (int size2 = this.f8636i.size() - 1; -1 < size2; size2--) {
            C6600c c6600c = (C6600c) this.f8636i.get(size2);
            c6600c.m7534b();
            if (c6600c.m7538g().isEmpty()) {
                this.f8636i.remove(size2);
            }
        }
    }

    /* renamed from: h */
    public final a m7555h() {
        return this.f8628a;
    }

    /* renamed from: i */
    public final Logger m7556i() {
        return this.f8629b;
    }

    /* renamed from: j */
    public final void m7557j(C6600c taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        if (AbstractC6427k.f8100b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.m7536e() == null) {
            if (taskQueue.m7538g().isEmpty()) {
                this.f8636i.remove(taskQueue);
            } else {
                AbstractC6424h.m6987a(this.f8636i, taskQueue);
            }
        }
        if (this.f8631d) {
            this.f8628a.mo7562c(this);
        } else {
            m7559l();
        }
    }

    /* renamed from: k */
    public final C6600c m7558k() {
        int i6;
        synchronized (this) {
            i6 = this.f8630c;
            this.f8630c = i6 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i6);
        return new C6600c(this, sb.toString());
    }

    /* renamed from: l */
    public final void m7559l() {
        if (!AbstractC6427k.f8100b || Thread.holdsLock(this)) {
            int i6 = this.f8633f;
            if (i6 > this.f8634g) {
                return;
            }
            this.f8633f = i6 + 1;
            this.f8628a.mo7563d(this, this.f8637j);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    public /* synthetic */ C6601d(a aVar, Logger logger, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i6 & 2) != 0 ? f8626l : logger);
    }
}
