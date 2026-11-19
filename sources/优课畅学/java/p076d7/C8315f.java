package p076d7;

import io.reactivex.disposables.AbstractC8965a;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p100f7.AbstractC8462a;
import p244s6.AbstractC10049f;
import p277v6.InterfaceC10250b;
import p321z6.AbstractC10726b;

/* renamed from: d7.f */
/* loaded from: classes5.dex */
public final class C8315f extends AbstractC10049f {

    /* renamed from: b */
    public static final C8315f f15760b = new C8315f();

    /* renamed from: d7.f$a */
    public static final class a implements Runnable {

        /* renamed from: a */
        public final Runnable f15761a;

        /* renamed from: b */
        public final c f15762b;

        /* renamed from: c */
        public final long f15763c;

        public a(Runnable runnable, c cVar, long j10) {
            this.f15761a = runnable;
            this.f15762b = cVar;
            this.f15763c = j10;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            if (this.f15762b.f15771d) {
                return;
            }
            long jM18753a = this.f15762b.m18753a(TimeUnit.MILLISECONDS);
            long j10 = this.f15763c;
            if (j10 > jM18753a) {
                try {
                    Thread.sleep(j10 - jM18753a);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    AbstractC8462a.m13801k(e10);
                    return;
                }
            }
            if (this.f15762b.f15771d) {
                return;
            }
            this.f15761a.run();
        }
    }

    /* renamed from: d7.f$b */
    public static final class b implements Comparable {

        /* renamed from: a */
        public final Runnable f15764a;

        /* renamed from: b */
        public final long f15765b;

        /* renamed from: c */
        public final int f15766c;

        /* renamed from: d */
        public volatile boolean f15767d;

        public b(Runnable runnable, Long l10, int i10) {
            this.f15764a = runnable;
            this.f15765b = l10.longValue();
            this.f15766c = i10;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int iM20029b = AbstractC10726b.m20029b(this.f15765b, bVar.f15765b);
            return iM20029b == 0 ? AbstractC10726b.m20028a(this.f15766c, bVar.f15766c) : iM20029b;
        }
    }

    /* renamed from: d7.f$c */
    public static final class c extends AbstractC10049f.c implements InterfaceC10250b {

        /* renamed from: a */
        public final PriorityBlockingQueue f15768a = new PriorityBlockingQueue();

        /* renamed from: b */
        public final AtomicInteger f15769b = new AtomicInteger();

        /* renamed from: c */
        public final AtomicInteger f15770c = new AtomicInteger();

        /* renamed from: d */
        public volatile boolean f15771d;

        /* renamed from: d7.f$c$a */
        public final class a implements Runnable {

            /* renamed from: a */
            public final b f15772a;

            public a(b bVar) {
                this.f15772a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f15772a.f15767d = true;
                c.this.f15768a.remove(this.f15772a);
            }
        }

        @Override // p244s6.AbstractC10049f.c
        /* renamed from: b */
        public InterfaceC10250b mo13466b(Runnable runnable) {
            return m13488e(runnable, m18753a(TimeUnit.MILLISECONDS));
        }

        @Override // p244s6.AbstractC10049f.c
        /* renamed from: c */
        public InterfaceC10250b mo13467c(Runnable runnable, long j10, TimeUnit timeUnit) {
            long jM18753a = m18753a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j10);
            return m13488e(new a(runnable, this, jM18753a), jM18753a);
        }

        @Override // p277v6.InterfaceC10250b
        public void dispose() {
            this.f15771d = true;
        }

        /* renamed from: e */
        public InterfaceC10250b m13488e(Runnable runnable, long j10) {
            if (this.f15771d) {
                return EmptyDisposable.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j10), this.f15770c.incrementAndGet());
            this.f15768a.add(bVar);
            if (this.f15769b.getAndIncrement() != 0) {
                return AbstractC8965a.m15522b(new a(bVar));
            }
            int iAddAndGet = 1;
            while (!this.f15771d) {
                b bVar2 = (b) this.f15768a.poll();
                if (bVar2 == null) {
                    iAddAndGet = this.f15769b.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!bVar2.f15767d) {
                    bVar2.f15764a.run();
                }
            }
            this.f15768a.clear();
            return EmptyDisposable.INSTANCE;
        }

        @Override // p277v6.InterfaceC10250b
        public boolean isDisposed() {
            return this.f15771d;
        }
    }

    /* renamed from: d */
    public static C8315f m13486d() {
        return f15760b;
    }

    @Override // p244s6.AbstractC10049f
    /* renamed from: a */
    public AbstractC10049f.c mo13462a() {
        return new c();
    }

    @Override // p244s6.AbstractC10049f
    /* renamed from: b */
    public InterfaceC10250b mo13463b(Runnable runnable, long j10, TimeUnit timeUnit) throws InterruptedException {
        try {
            timeUnit.sleep(j10);
            AbstractC8462a.m13803m(runnable).run();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            AbstractC8462a.m13801k(e10);
        }
        return EmptyDisposable.INSTANCE;
    }
}
