package p076d7;

import androidx.camera.view.AbstractC0949q;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.C8972a;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p244s6.AbstractC10049f;
import p277v6.C10249a;
import p277v6.InterfaceC10250b;

/* renamed from: d7.c */
/* loaded from: classes5.dex */
public final class C8312c extends AbstractC10049f {

    /* renamed from: d */
    public static final RxThreadFactory f15733d;

    /* renamed from: e */
    public static final RxThreadFactory f15734e;

    /* renamed from: h */
    public static final c f15737h;

    /* renamed from: i */
    public static final a f15738i;

    /* renamed from: b */
    public final ThreadFactory f15739b;

    /* renamed from: c */
    public final AtomicReference f15740c;

    /* renamed from: g */
    public static final TimeUnit f15736g = TimeUnit.SECONDS;

    /* renamed from: f */
    public static final long f15735f = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* renamed from: d7.c$a */
    public static final class a implements Runnable {

        /* renamed from: a */
        public final long f15741a;

        /* renamed from: b */
        public final ConcurrentLinkedQueue f15742b;

        /* renamed from: c */
        public final C10249a f15743c;

        /* renamed from: d */
        public final ScheduledExecutorService f15744d;

        /* renamed from: e */
        public final Future f15745e;

        /* renamed from: f */
        public final ThreadFactory f15746f;

        public a(long j10, TimeUnit timeUnit, ThreadFactory threadFactory) {
            a aVar;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j10) : 0L;
            this.f15741a = nanos;
            this.f15742b = new ConcurrentLinkedQueue();
            this.f15743c = new C10249a();
            this.f15746f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, C8312c.f15734e);
                aVar = this;
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(aVar, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                aVar = this;
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            aVar.f15744d = scheduledExecutorServiceNewScheduledThreadPool;
            aVar.f15745e = scheduledFutureScheduleWithFixedDelay;
        }

        /* renamed from: a */
        public void m13474a() {
            if (this.f15742b.isEmpty()) {
                return;
            }
            long jM13476c = m13476c();
            Iterator it = this.f15742b.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (cVar.m13479i() > jM13476c) {
                    return;
                }
                if (this.f15742b.remove(cVar)) {
                    this.f15743c.mo19202c(cVar);
                }
            }
        }

        /* renamed from: b */
        public c m13475b() {
            if (this.f15743c.isDisposed()) {
                return C8312c.f15737h;
            }
            while (!this.f15742b.isEmpty()) {
                c cVar = (c) this.f15742b.poll();
                if (cVar != null) {
                    return cVar;
                }
            }
            c cVar2 = new c(this.f15746f);
            this.f15743c.mo19201b(cVar2);
            return cVar2;
        }

        /* renamed from: c */
        public long m13476c() {
            return System.nanoTime();
        }

        /* renamed from: d */
        public void m13477d(c cVar) {
            cVar.m13480j(m13476c() + this.f15741a);
            this.f15742b.offer(cVar);
        }

        /* renamed from: e */
        public void m13478e() {
            this.f15743c.dispose();
            Future future = this.f15745e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f15744d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            m13474a();
        }
    }

    /* renamed from: d7.c$b */
    public static final class b extends AbstractC10049f.c {

        /* renamed from: b */
        public final a f15748b;

        /* renamed from: c */
        public final c f15749c;

        /* renamed from: d */
        public final AtomicBoolean f15750d = new AtomicBoolean();

        /* renamed from: a */
        public final C10249a f15747a = new C10249a();

        public b(a aVar) {
            this.f15748b = aVar;
            this.f15749c = aVar.m13475b();
        }

        @Override // p244s6.AbstractC10049f.c
        /* renamed from: c */
        public InterfaceC10250b mo13467c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f15747a.isDisposed() ? EmptyDisposable.INSTANCE : this.f15749c.m15564e(runnable, j10, timeUnit, this.f15747a);
        }

        @Override // p277v6.InterfaceC10250b
        public void dispose() {
            if (this.f15750d.compareAndSet(false, true)) {
                this.f15747a.dispose();
                this.f15748b.m13477d(this.f15749c);
            }
        }

        @Override // p277v6.InterfaceC10250b
        public boolean isDisposed() {
            return this.f15750d.get();
        }
    }

    /* renamed from: d7.c$c */
    public static final class c extends C8972a {

        /* renamed from: c */
        public long f15751c;

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f15751c = 0L;
        }

        /* renamed from: i */
        public long m13479i() {
            return this.f15751c;
        }

        /* renamed from: j */
        public void m13480j(long j10) {
            this.f15751c = j10;
        }
    }

    static {
        c cVar = new c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f15737h = cVar;
        cVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", iMax);
        f15733d = rxThreadFactory;
        f15734e = new RxThreadFactory("RxCachedWorkerPoolEvictor", iMax);
        a aVar = new a(0L, null, rxThreadFactory);
        f15738i = aVar;
        aVar.m13478e();
    }

    public C8312c() {
        this(f15733d);
    }

    @Override // p244s6.AbstractC10049f
    /* renamed from: a */
    public AbstractC10049f.c mo13462a() {
        return new b((a) this.f15740c.get());
    }

    /* renamed from: d */
    public void m13473d() {
        a aVar = new a(f15735f, f15736g, this.f15739b);
        if (AbstractC0949q.m807a(this.f15740c, f15738i, aVar)) {
            return;
        }
        aVar.m13478e();
    }

    public C8312c(ThreadFactory threadFactory) {
        this.f15739b = threadFactory;
        this.f15740c = new AtomicReference(f15738i);
        m13473d();
    }
}
