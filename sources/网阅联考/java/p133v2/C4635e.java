package p133v2;

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
import p121s2.AbstractC4550b;

/* renamed from: v2.e */
/* loaded from: classes2.dex */
public final class C4635e {

    /* renamed from: i */
    public static final Logger f5850i;

    /* renamed from: a */
    public int f5852a;

    /* renamed from: b */
    public boolean f5853b;

    /* renamed from: c */
    public long f5854c;

    /* renamed from: d */
    public final List f5855d;

    /* renamed from: e */
    public final List f5856e;

    /* renamed from: f */
    public final Runnable f5857f;

    /* renamed from: g */
    public final a f5858g;

    /* renamed from: j */
    public static final b f5851j = new b(null);

    /* renamed from: h */
    public static final C4635e f5849h = new C4635e(new c(AbstractC4550b.m6206I(AbstractC4550b.f5709i + " TaskRunner", true)));

    /* renamed from: v2.e$a */
    public interface a {
        /* renamed from: a */
        void mo6453a(C4635e c4635e);

        /* renamed from: b */
        void mo6454b(C4635e c4635e, long j4);

        /* renamed from: c */
        long mo6455c();

        void execute(Runnable runnable);
    }

    /* renamed from: v2.e$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Logger m6456a() {
            return C4635e.f5850i;
        }
    }

    /* renamed from: v2.e$c */
    public static final class c implements a {

        /* renamed from: a */
        public final ThreadPoolExecutor f5859a;

        public c(ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.f5859a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // p133v2.C4635e.a
        /* renamed from: a */
        public void mo6453a(C4635e taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // p133v2.C4635e.a
        /* renamed from: b */
        public void mo6454b(C4635e taskRunner, long j4) throws InterruptedException {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j5 = j4 / AnimationKt.MillisToNanos;
            long j6 = j4 - (AnimationKt.MillisToNanos * j5);
            if (j5 > 0 || j4 > 0) {
                taskRunner.wait(j5, (int) j6);
            }
        }

        @Override // p133v2.C4635e.a
        /* renamed from: c */
        public long mo6455c() {
            return System.nanoTime();
        }

        @Override // p133v2.C4635e.a
        public void execute(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f5859a.execute(runnable);
        }
    }

    /* renamed from: v2.e$d */
    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4631a abstractC4631aM6446d;
            long jMo6455c;
            while (true) {
                synchronized (C4635e.this) {
                    abstractC4631aM6446d = C4635e.this.m6446d();
                }
                if (abstractC4631aM6446d == null) {
                    return;
                }
                C4634d c4634dM6422d = abstractC4631aM6446d.m6422d();
                Intrinsics.checkNotNull(c4634dM6422d);
                boolean zIsLoggable = C4635e.f5851j.m6456a().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jMo6455c = c4634dM6422d.m6437h().m6449g().mo6455c();
                    AbstractC4632b.m6428c(abstractC4631aM6446d, c4634dM6422d, "starting");
                } else {
                    jMo6455c = -1;
                }
                try {
                    try {
                        C4635e.this.m6452j(abstractC4631aM6446d);
                        Unit unit = Unit.INSTANCE;
                        if (zIsLoggable) {
                            AbstractC4632b.m6428c(abstractC4631aM6446d, c4634dM6422d, "finished run in " + AbstractC4632b.m6427b(c4634dM6422d.m6437h().m6449g().mo6455c() - jMo6455c));
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        AbstractC4632b.m6428c(abstractC4631aM6446d, c4634dM6422d, "failed a run in " + AbstractC4632b.m6427b(c4634dM6422d.m6437h().m6449g().mo6455c() - jMo6455c));
                    }
                    throw th;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(C4635e.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f5850i = logger;
    }

    public C4635e(a backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f5858g = backend;
        this.f5852a = 10000;
        this.f5855d = new ArrayList();
        this.f5856e = new ArrayList();
        this.f5857f = new d();
    }

    /* renamed from: c */
    public final void m6445c(AbstractC4631a abstractC4631a, long j4) {
        if (AbstractC4550b.f5708h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        C4634d c4634dM6422d = abstractC4631a.m6422d();
        Intrinsics.checkNotNull(c4634dM6422d);
        if (!(c4634dM6422d.m6432c() == abstractC4631a)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean zM6433d = c4634dM6422d.m6433d();
        c4634dM6422d.m6441m(false);
        c4634dM6422d.m6440l(null);
        this.f5855d.remove(c4634dM6422d);
        if (j4 != -1 && !zM6433d && !c4634dM6422d.m6436g()) {
            c4634dM6422d.m6439k(abstractC4631a, j4, true);
        }
        if (!c4634dM6422d.m6434e().isEmpty()) {
            this.f5856e.add(c4634dM6422d);
        }
    }

    /* renamed from: d */
    public final AbstractC4631a m6446d() {
        boolean z3;
        if (AbstractC4550b.f5708h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        while (!this.f5856e.isEmpty()) {
            long jMo6455c = this.f5858g.mo6455c();
            Iterator it = this.f5856e.iterator();
            long jMin = Long.MAX_VALUE;
            AbstractC4631a abstractC4631a = null;
            while (true) {
                if (!it.hasNext()) {
                    z3 = false;
                    break;
                }
                AbstractC4631a abstractC4631a2 = (AbstractC4631a) ((C4634d) it.next()).m6434e().get(0);
                long jMax = Math.max(0L, abstractC4631a2.m6421c() - jMo6455c);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC4631a != null) {
                        z3 = true;
                        break;
                    }
                    abstractC4631a = abstractC4631a2;
                }
            }
            if (abstractC4631a != null) {
                m6447e(abstractC4631a);
                if (z3 || (!this.f5853b && (!this.f5856e.isEmpty()))) {
                    this.f5858g.execute(this.f5857f);
                }
                return abstractC4631a;
            }
            if (this.f5853b) {
                if (jMin < this.f5854c - jMo6455c) {
                    this.f5858g.mo6453a(this);
                }
                return null;
            }
            this.f5853b = true;
            this.f5854c = jMo6455c + jMin;
            try {
                try {
                    this.f5858g.mo6454b(this, jMin);
                } catch (InterruptedException unused) {
                    m6448f();
                }
            } finally {
                this.f5853b = false;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m6447e(AbstractC4631a abstractC4631a) {
        if (!AbstractC4550b.f5708h || Thread.holdsLock(this)) {
            abstractC4631a.m6425g(-1L);
            C4634d c4634dM6422d = abstractC4631a.m6422d();
            Intrinsics.checkNotNull(c4634dM6422d);
            c4634dM6422d.m6434e().remove(abstractC4631a);
            this.f5856e.remove(c4634dM6422d);
            c4634dM6422d.m6440l(abstractC4631a);
            this.f5855d.add(c4634dM6422d);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: f */
    public final void m6448f() {
        for (int size = this.f5855d.size() - 1; size >= 0; size--) {
            ((C4634d) this.f5855d.get(size)).m6431b();
        }
        for (int size2 = this.f5856e.size() - 1; size2 >= 0; size2--) {
            C4634d c4634d = (C4634d) this.f5856e.get(size2);
            c4634d.m6431b();
            if (c4634d.m6434e().isEmpty()) {
                this.f5856e.remove(size2);
            }
        }
    }

    /* renamed from: g */
    public final a m6449g() {
        return this.f5858g;
    }

    /* renamed from: h */
    public final void m6450h(C4634d taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        if (AbstractC4550b.f5708h && !Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        if (taskQueue.m6432c() == null) {
            if (!taskQueue.m6434e().isEmpty()) {
                AbstractC4550b.m6219a(this.f5856e, taskQueue);
            } else {
                this.f5856e.remove(taskQueue);
            }
        }
        if (this.f5853b) {
            this.f5858g.mo6453a(this);
        } else {
            this.f5858g.execute(this.f5857f);
        }
    }

    /* renamed from: i */
    public final C4634d m6451i() {
        int i4;
        synchronized (this) {
            i4 = this.f5852a;
            this.f5852a = i4 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i4);
        return new C4634d(this, sb.toString());
    }

    /* renamed from: j */
    public final void m6452j(AbstractC4631a abstractC4631a) {
        if (AbstractC4550b.f5708h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(abstractC4631a.m6420b());
        try {
            long jMo6424f = abstractC4631a.mo6424f();
            synchronized (this) {
                m6445c(abstractC4631a, jMo6424f);
                Unit unit = Unit.INSTANCE;
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                m6445c(abstractC4631a, -1L);
                Unit unit2 = Unit.INSTANCE;
                currentThread.setName(name);
                throw th;
            }
        }
    }
}
