package p244s6;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.schedulers.C8972a;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;
import p100f7.AbstractC8462a;
import p277v6.InterfaceC10250b;
import p288w6.AbstractC10359a;

/* renamed from: s6.f */
/* loaded from: classes5.dex */
public abstract class AbstractC10049f {

    /* renamed from: a */
    public static final long f20090a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: s6.f$a */
    public static final class a implements InterfaceC10250b, Runnable {

        /* renamed from: a */
        public final Runnable f20091a;

        /* renamed from: b */
        public final c f20092b;

        /* renamed from: c */
        public Thread f20093c;

        public a(Runnable runnable, c cVar) {
            this.f20091a = runnable;
            this.f20092b = cVar;
        }

        @Override // p277v6.InterfaceC10250b
        public void dispose() {
            if (this.f20093c == Thread.currentThread()) {
                c cVar = this.f20092b;
                if (cVar instanceof C8972a) {
                    ((C8972a) cVar).m15567h();
                    return;
                }
            }
            this.f20092b.dispose();
        }

        @Override // p277v6.InterfaceC10250b
        public boolean isDisposed() {
            return this.f20092b.isDisposed();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20093c = Thread.currentThread();
            try {
                this.f20091a.run();
            } finally {
                dispose();
                this.f20093c = null;
            }
        }
    }

    /* renamed from: s6.f$b */
    public static final class b implements InterfaceC10250b, Runnable {

        /* renamed from: a */
        public final Runnable f20094a;

        /* renamed from: b */
        public final c f20095b;

        /* renamed from: c */
        public volatile boolean f20096c;

        public b(Runnable runnable, c cVar) {
            this.f20094a = runnable;
            this.f20095b = cVar;
        }

        @Override // p277v6.InterfaceC10250b
        public void dispose() {
            this.f20096c = true;
            this.f20095b.dispose();
        }

        @Override // p277v6.InterfaceC10250b
        public boolean isDisposed() {
            return this.f20096c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f20096c) {
                return;
            }
            try {
                this.f20094a.run();
            } catch (Throwable th) {
                AbstractC10359a.m19297b(th);
                this.f20095b.dispose();
                throw ExceptionHelper.m15580c(th);
            }
        }
    }

    /* renamed from: s6.f$c */
    public static abstract class c implements InterfaceC10250b {

        /* renamed from: s6.f$c$a */
        public final class a implements Runnable {

            /* renamed from: a */
            public final Runnable f20097a;

            /* renamed from: b */
            public final SequentialDisposable f20098b;

            /* renamed from: c */
            public final long f20099c;

            /* renamed from: d */
            public long f20100d;

            /* renamed from: e */
            public long f20101e;

            /* renamed from: f */
            public long f20102f;

            public a(long j10, Runnable runnable, long j11, SequentialDisposable sequentialDisposable, long j12) {
                this.f20097a = runnable;
                this.f20098b = sequentialDisposable;
                this.f20099c = j12;
                this.f20101e = j11;
                this.f20102f = j10;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    r12 = this;
                    java.lang.Runnable r0 = r12.f20097a
                    r0.run()
                    io.reactivex.internal.disposables.SequentialDisposable r0 = r12.f20098b
                    boolean r0 = r0.isDisposed()
                    if (r0 != 0) goto L51
                    s6.f$c r0 = p244s6.AbstractC10049f.c.this
                    java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
                    long r2 = r0.m18753a(r1)
                    long r4 = p244s6.AbstractC10049f.f20090a
                    long r6 = r2 + r4
                    long r8 = r12.f20101e
                    int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    r6 = 1
                    if (r0 < 0) goto L34
                    long r10 = r12.f20099c
                    long r8 = r8 + r10
                    long r8 = r8 + r4
                    int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                    if (r0 < 0) goto L2a
                    goto L34
                L2a:
                    long r4 = r12.f20102f
                    long r8 = r12.f20100d
                    long r8 = r8 + r6
                    r12.f20100d = r8
                    long r8 = r8 * r10
                    long r4 = r4 + r8
                    goto L43
                L34:
                    long r4 = r12.f20099c
                    long r8 = r2 + r4
                    long r10 = r12.f20100d
                    long r10 = r10 + r6
                    r12.f20100d = r10
                    long r4 = r4 * r10
                    long r4 = r8 - r4
                    r12.f20102f = r4
                    r4 = r8
                L43:
                    r12.f20101e = r2
                    long r4 = r4 - r2
                    io.reactivex.internal.disposables.SequentialDisposable r0 = r12.f20098b
                    s6.f$c r2 = p244s6.AbstractC10049f.c.this
                    v6.b r1 = r2.mo13467c(r12, r4, r1)
                    r0.m15535a(r1)
                L51:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p244s6.AbstractC10049f.c.a.run():void");
            }
        }

        /* renamed from: a */
        public long m18753a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        /* renamed from: b */
        public InterfaceC10250b mo13466b(Runnable runnable) {
            return mo13467c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        /* renamed from: c */
        public abstract InterfaceC10250b mo13467c(Runnable runnable, long j10, TimeUnit timeUnit);

        /* renamed from: d */
        public InterfaceC10250b m18754d(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            Runnable runnableM13803m = AbstractC8462a.m13803m(runnable);
            long nanos = timeUnit.toNanos(j11);
            long jM18753a = m18753a(TimeUnit.NANOSECONDS);
            InterfaceC10250b interfaceC10250bMo13467c = mo13467c(new a(jM18753a + timeUnit.toNanos(j10), runnableM13803m, jM18753a, sequentialDisposable2, nanos), j10, timeUnit);
            if (interfaceC10250bMo13467c == EmptyDisposable.INSTANCE) {
                return interfaceC10250bMo13467c;
            }
            sequentialDisposable.m15535a(interfaceC10250bMo13467c);
            return sequentialDisposable2;
        }
    }

    /* renamed from: a */
    public abstract c mo13462a();

    /* renamed from: b */
    public InterfaceC10250b mo13463b(Runnable runnable, long j10, TimeUnit timeUnit) {
        c cVarMo13462a = mo13462a();
        a aVar = new a(AbstractC8462a.m13803m(runnable), cVarMo13462a);
        cVarMo13462a.mo13467c(aVar, j10, timeUnit);
        return aVar;
    }

    /* renamed from: c */
    public InterfaceC10250b mo13464c(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        c cVarMo13462a = mo13462a();
        b bVar = new b(AbstractC8462a.m13803m(runnable), cVarMo13462a);
        InterfaceC10250b interfaceC10250bM18754d = cVarMo13462a.m18754d(bVar, j10, j11, timeUnit);
        return interfaceC10250bM18754d == EmptyDisposable.INSTANCE ? interfaceC10250bM18754d : bVar;
    }
}
