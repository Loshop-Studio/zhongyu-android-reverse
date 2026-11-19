package p081e9;

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
import p028b9.AbstractC5070d;

/* renamed from: e9.e */
/* loaded from: classes5.dex */
public final class C7420e {

    /* renamed from: h */
    public static final b f12104h = new b(null);

    /* renamed from: i */
    public static final C7420e f12105i = new C7420e(new c(AbstractC5070d.m2622M(AbstractC5070d.f2641i + " TaskRunner", true)));

    /* renamed from: j */
    public static final Logger f12106j;

    /* renamed from: a */
    public final a f12107a;

    /* renamed from: b */
    public int f12108b;

    /* renamed from: c */
    public boolean f12109c;

    /* renamed from: d */
    public long f12110d;

    /* renamed from: e */
    public final List f12111e;

    /* renamed from: f */
    public final List f12112f;

    /* renamed from: g */
    public final Runnable f12113g;

    /* renamed from: e9.e$a */
    public interface a {
        /* renamed from: a */
        void mo11945a(C7420e c7420e);

        /* renamed from: b */
        void mo11946b(C7420e c7420e, long j10);

        /* renamed from: c */
        long mo11947c();

        void execute(Runnable runnable);
    }

    /* renamed from: e9.e$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Logger m11948a() {
            return C7420e.f12106j;
        }

        public b() {
        }
    }

    /* renamed from: e9.e$c */
    public static final class c implements a {

        /* renamed from: a */
        public final ThreadPoolExecutor f12114a;

        public c(ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.f12114a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // p081e9.C7420e.a
        /* renamed from: a */
        public void mo11945a(C7420e taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // p081e9.C7420e.a
        /* renamed from: b */
        public void mo11946b(C7420e taskRunner, long j10) throws InterruptedException {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j11 = j10 / AnimationKt.MillisToNanos;
            long j12 = j10 - (AnimationKt.MillisToNanos * j11);
            if (j11 > 0 || j10 > 0) {
                taskRunner.wait(j11, (int) j12);
            }
        }

        @Override // p081e9.C7420e.a
        /* renamed from: c */
        public long mo11947c() {
            return System.nanoTime();
        }

        @Override // p081e9.C7420e.a
        public void execute(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f12114a.execute(runnable);
        }
    }

    /* renamed from: e9.e$d */
    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC7416a abstractC7416aM11938d;
            long jMo11947c;
            while (true) {
                C7420e c7420e = C7420e.this;
                synchronized (c7420e) {
                    abstractC7416aM11938d = c7420e.m11938d();
                }
                if (abstractC7416aM11938d == null) {
                    return;
                }
                C7419d c7419dM11914d = abstractC7416aM11938d.m11914d();
                Intrinsics.checkNotNull(c7419dM11914d);
                C7420e c7420e2 = C7420e.this;
                boolean zIsLoggable = C7420e.f12104h.m11948a().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jMo11947c = c7419dM11914d.m11929h().m11941g().mo11947c();
                    AbstractC7417b.m11920c(abstractC7416aM11938d, c7419dM11914d, "starting");
                } else {
                    jMo11947c = -1;
                }
                try {
                    try {
                        c7420e2.m11944j(abstractC7416aM11938d);
                        Unit unit = Unit.INSTANCE;
                        if (zIsLoggable) {
                            AbstractC7417b.m11920c(abstractC7416aM11938d, c7419dM11914d, "finished run in " + AbstractC7417b.m11919b(c7419dM11914d.m11929h().m11941g().mo11947c() - jMo11947c));
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        AbstractC7417b.m11920c(abstractC7416aM11938d, c7419dM11914d, "failed a run in " + AbstractC7417b.m11919b(c7419dM11914d.m11929h().m11941g().mo11947c() - jMo11947c));
                    }
                    throw th;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(C7420e.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
        f12106j = logger;
    }

    public C7420e(a backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f12107a = backend;
        this.f12108b = 10000;
        this.f12111e = new ArrayList();
        this.f12112f = new ArrayList();
        this.f12113g = new d();
    }

    /* renamed from: c */
    public final void m11937c(AbstractC7416a abstractC7416a, long j10) {
        if (AbstractC5070d.f2640h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        C7419d c7419dM11914d = abstractC7416a.m11914d();
        Intrinsics.checkNotNull(c7419dM11914d);
        if (c7419dM11914d.m11924c() != abstractC7416a) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zM11925d = c7419dM11914d.m11925d();
        c7419dM11914d.m11933m(false);
        c7419dM11914d.m11932l(null);
        this.f12111e.remove(c7419dM11914d);
        if (j10 != -1 && !zM11925d && !c7419dM11914d.m11928g()) {
            c7419dM11914d.m11931k(abstractC7416a, j10, true);
        }
        if (c7419dM11914d.m11926e().isEmpty()) {
            return;
        }
        this.f12112f.add(c7419dM11914d);
    }

    /* renamed from: d */
    public final AbstractC7416a m11938d() {
        boolean z9;
        if (AbstractC5070d.f2640h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f12112f.isEmpty()) {
            long jMo11947c = this.f12107a.mo11947c();
            Iterator it = this.f12112f.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC7416a abstractC7416a = null;
            while (true) {
                if (!it.hasNext()) {
                    z9 = false;
                    break;
                }
                AbstractC7416a abstractC7416a2 = (AbstractC7416a) ((C7419d) it.next()).m11926e().get(0);
                long jMax = Math.max(0L, abstractC7416a2.m11913c() - jMo11947c);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC7416a != null) {
                        z9 = true;
                        break;
                    }
                    abstractC7416a = abstractC7416a2;
                }
            }
            if (abstractC7416a != null) {
                m11939e(abstractC7416a);
                if (z9 || (!this.f12109c && !this.f12112f.isEmpty())) {
                    this.f12107a.execute(this.f12113g);
                }
                return abstractC7416a;
            }
            if (this.f12109c) {
                if (jMin < this.f12110d - jMo11947c) {
                    this.f12107a.mo11945a(this);
                }
                return null;
            }
            this.f12109c = true;
            this.f12110d = jMo11947c + jMin;
            try {
                try {
                    this.f12107a.mo11946b(this, jMin);
                } catch (InterruptedException unused) {
                    m11940f();
                }
            } finally {
                this.f12109c = false;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m11939e(AbstractC7416a abstractC7416a) {
        if (AbstractC5070d.f2640h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        abstractC7416a.m11917g(-1L);
        C7419d c7419dM11914d = abstractC7416a.m11914d();
        Intrinsics.checkNotNull(c7419dM11914d);
        c7419dM11914d.m11926e().remove(abstractC7416a);
        this.f12112f.remove(c7419dM11914d);
        c7419dM11914d.m11932l(abstractC7416a);
        this.f12111e.add(c7419dM11914d);
    }

    /* renamed from: f */
    public final void m11940f() {
        int size = this.f12111e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((C7419d) this.f12111e.get(size)).m11923b();
            }
        }
        for (int size2 = this.f12112f.size() - 1; -1 < size2; size2--) {
            C7419d c7419d = (C7419d) this.f12112f.get(size2);
            c7419d.m11923b();
            if (c7419d.m11926e().isEmpty()) {
                this.f12112f.remove(size2);
            }
        }
    }

    /* renamed from: g */
    public final a m11941g() {
        return this.f12107a;
    }

    /* renamed from: h */
    public final void m11942h(C7419d taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        if (AbstractC5070d.f2640h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.m11924c() == null) {
            if (taskQueue.m11926e().isEmpty()) {
                this.f12112f.remove(taskQueue);
            } else {
                AbstractC5070d.m2638c(this.f12112f, taskQueue);
            }
        }
        if (this.f12109c) {
            this.f12107a.mo11945a(this);
        } else {
            this.f12107a.execute(this.f12113g);
        }
    }

    /* renamed from: i */
    public final C7419d m11943i() {
        int i10;
        synchronized (this) {
            i10 = this.f12108b;
            this.f12108b = i10 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i10);
        return new C7419d(this, sb.toString());
    }

    /* renamed from: j */
    public final void m11944j(AbstractC7416a abstractC7416a) {
        if (AbstractC5070d.f2640h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(abstractC7416a.m11912b());
        try {
            long jMo11916f = abstractC7416a.mo11916f();
            synchronized (this) {
                m11937c(abstractC7416a, jMo11916f);
                Unit unit = Unit.INSTANCE;
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                m11937c(abstractC7416a, -1L);
                Unit unit2 = Unit.INSTANCE;
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }
}
