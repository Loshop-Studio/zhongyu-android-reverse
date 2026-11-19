package p191n8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InterfaceC9203g;
import p135i8.AbstractC8818a0;
import p135i8.AbstractC8828d0;
import p135i8.InterfaceC8845j;
import p135i8.InterfaceC8849k0;

/* renamed from: n8.m */
/* loaded from: classes5.dex */
public final class C9459m extends CoroutineDispatcher implements InterfaceC9203g {

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18667f = AtomicIntegerFieldUpdater.newUpdater(C9459m.class, "runningWorkers$volatile");

    /* renamed from: a */
    public final CoroutineDispatcher f18668a;

    /* renamed from: b */
    public final int f18669b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC9203g f18670c;

    /* renamed from: d */
    public final C9464q f18671d;

    /* renamed from: e */
    public final Object f18672e;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* renamed from: n8.m$a */
    public final class a implements Runnable {

        /* renamed from: a */
        public Runnable f18673a;

        public a(Runnable runnable) {
            this.f18673a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f18673a.run();
                } catch (Throwable th) {
                    AbstractC8818a0.m14797a(EmptyCoroutineContext.f17438a, th);
                }
                Runnable runnableM17376q = C9459m.this.m17376q();
                if (runnableM17376q == null) {
                    return;
                }
                this.f18673a = runnableM17376q;
                i10++;
                if (i10 >= 16 && C9459m.this.f18668a.isDispatchNeeded(C9459m.this)) {
                    C9459m.this.f18668a.dispatch(C9459m.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9459m(CoroutineDispatcher coroutineDispatcher, int i10) {
        this.f18668a = coroutineDispatcher;
        this.f18669b = i10;
        InterfaceC9203g interfaceC9203g = coroutineDispatcher instanceof InterfaceC9203g ? (InterfaceC9203g) coroutineDispatcher : null;
        this.f18670c = interfaceC9203g == null ? AbstractC8828d0.m14827a() : interfaceC9203g;
        this.f18671d = new C9464q(false);
        this.f18672e = new Object();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(InterfaceC9100d interfaceC9100d, Runnable runnable) {
        Runnable runnableM17376q;
        this.f18671d.m17383a(runnable);
        if (f18667f.get(this) >= this.f18669b || !m17377r() || (runnableM17376q = m17376q()) == null) {
            return;
        }
        this.f18668a.dispatch(this, new a(runnableM17376q));
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(InterfaceC9100d interfaceC9100d, Runnable runnable) {
        Runnable runnableM17376q;
        this.f18671d.m17383a(runnable);
        if (f18667f.get(this) >= this.f18669b || !m17377r() || (runnableM17376q = m17376q()) == null) {
            return;
        }
        this.f18668a.dispatchYield(this, new a(runnableM17376q));
    }

    @Override // kotlinx.coroutines.InterfaceC9203g
    /* renamed from: f */
    public InterfaceC8849k0 mo16335f(long j10, Runnable runnable, InterfaceC9100d interfaceC9100d) {
        return this.f18670c.mo16335f(j10, runnable, interfaceC9100d);
    }

    @Override // kotlinx.coroutines.InterfaceC9203g
    /* renamed from: g */
    public void mo16336g(long j10, InterfaceC8845j interfaceC8845j) {
        this.f18670c.mo16336g(j10, interfaceC8845j);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i10) {
        AbstractC9461n.m17380a(i10);
        return i10 >= this.f18669b ? this : super.limitedParallelism(i10);
    }

    /* renamed from: q */
    public final Runnable m17376q() {
        while (true) {
            Runnable runnable = (Runnable) this.f18671d.m17386e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f18672e) {
                f18667f.decrementAndGet(this);
                if (this.f18671d.m17385c() == 0) {
                    return null;
                }
                f18667f.incrementAndGet(this);
            }
        }
    }

    /* renamed from: r */
    public final boolean m17377r() {
        synchronized (this.f18672e) {
            if (f18667f.get(this) >= this.f18669b) {
                return false;
            }
            f18667f.incrementAndGet(this);
            return true;
        }
    }
}
