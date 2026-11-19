package p216p8;

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
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p182m8.AbstractC9045d;

/* renamed from: p8.e */
/* loaded from: classes5.dex */
public final class C9342e {

    /* renamed from: h */
    public static final b f16226h = new b(null);

    /* renamed from: i */
    public static final C9342e f16227i = new C9342e(new c(AbstractC9045d.m14471M(AbstractC9045d.f15232i + " TaskRunner", true)));

    /* renamed from: j */
    public static final Logger f16228j;

    /* renamed from: a */
    public final a f16229a;

    /* renamed from: b */
    public int f16230b;

    /* renamed from: c */
    public boolean f16231c;

    /* renamed from: d */
    public long f16232d;

    /* renamed from: e */
    public final List f16233e;

    /* renamed from: f */
    public final List f16234f;

    /* renamed from: g */
    public final Runnable f16235g;

    /* renamed from: p8.e$a */
    public interface a {
        /* renamed from: a */
        void mo15281a(C9342e c9342e, long j9);

        /* renamed from: b */
        void mo15282b(C9342e c9342e);

        /* renamed from: c */
        long mo15283c();

        void execute(Runnable runnable);
    }

    /* renamed from: p8.e$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Logger m15284a() {
            return C9342e.f16228j;
        }

        public b() {
        }
    }

    /* renamed from: p8.e$c */
    public static final class c implements a {

        /* renamed from: a */
        public final ThreadPoolExecutor f16236a;

        public c(ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.f16236a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // p216p8.C9342e.a
        /* renamed from: a */
        public void mo15281a(C9342e taskRunner, long j9) throws InterruptedException {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j10 = j9 / AnimationKt.MillisToNanos;
            long j11 = j9 - (AnimationKt.MillisToNanos * j10);
            if (j10 > 0 || j9 > 0) {
                taskRunner.wait(j10, (int) j11);
            }
        }

        @Override // p216p8.C9342e.a
        /* renamed from: b */
        public void mo15282b(C9342e taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // p216p8.C9342e.a
        /* renamed from: c */
        public long mo15283c() {
            return System.nanoTime();
        }

        @Override // p216p8.C9342e.a
        public void execute(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f16236a.execute(runnable);
        }
    }

    /* renamed from: p8.e$d */
    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC9338a abstractC9338aM15274d;
            long jMo15283c;
            while (true) {
                C9342e c9342e = C9342e.this;
                synchronized (c9342e) {
                    abstractC9338aM15274d = c9342e.m15274d();
                }
                if (abstractC9338aM15274d == null) {
                    return;
                }
                C9341d c9341dM15251d = abstractC9338aM15274d.m15251d();
                Intrinsics.checkNotNull(c9341dM15251d);
                C9342e c9342e2 = C9342e.this;
                boolean zIsLoggable = C9342e.f16226h.m15284a().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jMo15283c = c9341dM15251d.m15265h().m15277g().mo15283c();
                    AbstractC9339b.m15256c(abstractC9338aM15274d, c9341dM15251d, "starting");
                } else {
                    jMo15283c = -1;
                }
                try {
                    try {
                        c9342e2.m15280j(abstractC9338aM15274d);
                        Unit unit = Unit.INSTANCE;
                        if (zIsLoggable) {
                            AbstractC9339b.m15256c(abstractC9338aM15274d, c9341dM15251d, "finished run in " + AbstractC9339b.m15255b(c9341dM15251d.m15265h().m15277g().mo15283c() - jMo15283c));
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        AbstractC9339b.m15256c(abstractC9338aM15274d, c9341dM15251d, "failed a run in " + AbstractC9339b.m15255b(c9341dM15251d.m15265h().m15277g().mo15283c() - jMo15283c));
                    }
                    throw th;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(C9342e.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
        f16228j = logger;
    }

    public C9342e(a backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f16229a = backend;
        this.f16230b = 10000;
        this.f16233e = new ArrayList();
        this.f16234f = new ArrayList();
        this.f16235g = new d();
    }

    /* renamed from: c */
    public final void m15273c(AbstractC9338a abstractC9338a, long j9) {
        if (AbstractC9045d.f15231h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        C9341d c9341dM15251d = abstractC9338a.m15251d();
        Intrinsics.checkNotNull(c9341dM15251d);
        if (c9341dM15251d.m15260c() != abstractC9338a) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zM15261d = c9341dM15251d.m15261d();
        c9341dM15251d.m15269m(false);
        c9341dM15251d.m15268l(null);
        this.f16233e.remove(c9341dM15251d);
        if (j9 != -1 && !zM15261d && !c9341dM15251d.m15264g()) {
            c9341dM15251d.m15267k(abstractC9338a, j9, true);
        }
        if (c9341dM15251d.m15262e().isEmpty()) {
            return;
        }
        this.f16234f.add(c9341dM15251d);
    }

    /* renamed from: d */
    public final AbstractC9338a m15274d() {
        boolean z9;
        if (AbstractC9045d.f15231h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f16234f.isEmpty()) {
            long jMo15283c = this.f16229a.mo15283c();
            Iterator it = this.f16234f.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC9338a abstractC9338a = null;
            while (true) {
                if (!it.hasNext()) {
                    z9 = false;
                    break;
                }
                AbstractC9338a abstractC9338a2 = (AbstractC9338a) ((C9341d) it.next()).m15262e().get(0);
                long jMax = Math.max(0L, abstractC9338a2.m15250c() - jMo15283c);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC9338a != null) {
                        z9 = true;
                        break;
                    }
                    abstractC9338a = abstractC9338a2;
                }
            }
            if (abstractC9338a != null) {
                m15275e(abstractC9338a);
                if (z9 || (!this.f16231c && !this.f16234f.isEmpty())) {
                    this.f16229a.execute(this.f16235g);
                }
                return abstractC9338a;
            }
            if (this.f16231c) {
                if (jMin < this.f16232d - jMo15283c) {
                    this.f16229a.mo15282b(this);
                }
                return null;
            }
            this.f16231c = true;
            this.f16232d = jMo15283c + jMin;
            try {
                try {
                    this.f16229a.mo15281a(this, jMin);
                } catch (InterruptedException unused) {
                    m15276f();
                }
            } finally {
                this.f16231c = false;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m15275e(AbstractC9338a abstractC9338a) {
        if (AbstractC9045d.f15231h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        abstractC9338a.m15253g(-1L);
        C9341d c9341dM15251d = abstractC9338a.m15251d();
        Intrinsics.checkNotNull(c9341dM15251d);
        c9341dM15251d.m15262e().remove(abstractC9338a);
        this.f16234f.remove(c9341dM15251d);
        c9341dM15251d.m15268l(abstractC9338a);
        this.f16233e.add(c9341dM15251d);
    }

    /* renamed from: f */
    public final void m15276f() {
        int size = this.f16233e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((C9341d) this.f16233e.get(size)).m15259b();
            }
        }
        for (int size2 = this.f16234f.size() - 1; -1 < size2; size2--) {
            C9341d c9341d = (C9341d) this.f16234f.get(size2);
            c9341d.m15259b();
            if (c9341d.m15262e().isEmpty()) {
                this.f16234f.remove(size2);
            }
        }
    }

    /* renamed from: g */
    public final a m15277g() {
        return this.f16229a;
    }

    /* renamed from: h */
    public final void m15278h(C9341d taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        if (AbstractC9045d.f15231h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.m15260c() == null) {
            if (taskQueue.m15262e().isEmpty()) {
                this.f16234f.remove(taskQueue);
            } else {
                AbstractC9045d.m14487c(this.f16234f, taskQueue);
            }
        }
        if (this.f16231c) {
            this.f16229a.mo15282b(this);
        } else {
            this.f16229a.execute(this.f16235g);
        }
    }

    /* renamed from: i */
    public final C9341d m15279i() {
        int i9;
        synchronized (this) {
            i9 = this.f16230b;
            this.f16230b = i9 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i9);
        return new C9341d(this, sb.toString());
    }

    /* renamed from: j */
    public final void m15280j(AbstractC9338a abstractC9338a) {
        if (AbstractC9045d.f15231h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(abstractC9338a.m15249b());
        try {
            long jMo15008f = abstractC9338a.mo15008f();
            synchronized (this) {
                m15273c(abstractC9338a, jMo15008f);
                Unit unit = Unit.INSTANCE;
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                m15273c(abstractC9338a, -1L);
                Unit unit2 = Unit.INSTANCE;
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }
}
