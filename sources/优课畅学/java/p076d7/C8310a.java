package p076d7;

import androidx.camera.view.AbstractC0949q;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.C8972a;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p244s6.AbstractC10049f;
import p277v6.C10249a;
import p277v6.InterfaceC10250b;
import p310y6.C10667b;

/* renamed from: d7.a */
/* loaded from: classes5.dex */
public final class C8310a extends AbstractC10049f {

    /* renamed from: d */
    public static final b f15713d;

    /* renamed from: e */
    public static final RxThreadFactory f15714e;

    /* renamed from: f */
    public static final int f15715f = m13461d(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: g */
    public static final c f15716g;

    /* renamed from: b */
    public final ThreadFactory f15717b;

    /* renamed from: c */
    public final AtomicReference f15718c;

    /* renamed from: d7.a$a */
    public static final class a extends AbstractC10049f.c {

        /* renamed from: a */
        public final C10667b f15719a;

        /* renamed from: b */
        public final C10249a f15720b;

        /* renamed from: c */
        public final C10667b f15721c;

        /* renamed from: d */
        public final c f15722d;

        /* renamed from: e */
        public volatile boolean f15723e;

        public a(c cVar) {
            this.f15722d = cVar;
            C10667b c10667b = new C10667b();
            this.f15719a = c10667b;
            C10249a c10249a = new C10249a();
            this.f15720b = c10249a;
            C10667b c10667b2 = new C10667b();
            this.f15721c = c10667b2;
            c10667b2.mo19201b(c10667b);
            c10667b2.mo19201b(c10249a);
        }

        @Override // p244s6.AbstractC10049f.c
        /* renamed from: b */
        public InterfaceC10250b mo13466b(Runnable runnable) {
            return this.f15723e ? EmptyDisposable.INSTANCE : this.f15722d.m15564e(runnable, 0L, TimeUnit.MILLISECONDS, this.f15719a);
        }

        @Override // p244s6.AbstractC10049f.c
        /* renamed from: c */
        public InterfaceC10250b mo13467c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f15723e ? EmptyDisposable.INSTANCE : this.f15722d.m15564e(runnable, j10, timeUnit, this.f15720b);
        }

        @Override // p277v6.InterfaceC10250b
        public void dispose() {
            if (this.f15723e) {
                return;
            }
            this.f15723e = true;
            this.f15721c.dispose();
        }

        @Override // p277v6.InterfaceC10250b
        public boolean isDisposed() {
            return this.f15723e;
        }
    }

    /* renamed from: d7.a$b */
    public static final class b {

        /* renamed from: a */
        public final int f15724a;

        /* renamed from: b */
        public final c[] f15725b;

        /* renamed from: c */
        public long f15726c;

        public b(int i10, ThreadFactory threadFactory) {
            this.f15724a = i10;
            this.f15725b = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                this.f15725b[i11] = new c(threadFactory);
            }
        }

        /* renamed from: a */
        public c m13468a() {
            int i10 = this.f15724a;
            if (i10 == 0) {
                return C8310a.f15716g;
            }
            c[] cVarArr = this.f15725b;
            long j10 = this.f15726c;
            this.f15726c = 1 + j10;
            return cVarArr[(int) (j10 % i10)];
        }

        /* renamed from: b */
        public void m13469b() {
            for (c cVar : this.f15725b) {
                cVar.dispose();
            }
        }
    }

    /* renamed from: d7.a$c */
    public static final class c extends C8972a {
        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new RxThreadFactory("RxComputationShutdown"));
        f15716g = cVar;
        cVar.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f15714e = rxThreadFactory;
        b bVar = new b(0, rxThreadFactory);
        f15713d = bVar;
        bVar.m13469b();
    }

    public C8310a() {
        this(f15714e);
    }

    /* renamed from: d */
    public static int m13461d(int i10, int i11) {
        return (i11 <= 0 || i11 > i10) ? i10 : i11;
    }

    @Override // p244s6.AbstractC10049f
    /* renamed from: a */
    public AbstractC10049f.c mo13462a() {
        return new a(((b) this.f15718c.get()).m13468a());
    }

    @Override // p244s6.AbstractC10049f
    /* renamed from: b */
    public InterfaceC10250b mo13463b(Runnable runnable, long j10, TimeUnit timeUnit) {
        return ((b) this.f15718c.get()).m13468a().m15565f(runnable, j10, timeUnit);
    }

    @Override // p244s6.AbstractC10049f
    /* renamed from: c */
    public InterfaceC10250b mo13464c(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return ((b) this.f15718c.get()).m13468a().m15566g(runnable, j10, j11, timeUnit);
    }

    /* renamed from: e */
    public void m13465e() {
        b bVar = new b(f15715f, this.f15717b);
        if (AbstractC0949q.m807a(this.f15718c, f15713d, bVar)) {
            return;
        }
        bVar.m13469b();
    }

    public C8310a(ThreadFactory threadFactory) {
        this.f15717b = threadFactory;
        this.f15718c = new AtomicReference(f15713d);
        m13465e();
    }
}
