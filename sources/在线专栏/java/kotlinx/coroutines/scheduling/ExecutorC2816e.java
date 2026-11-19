package kotlinx.coroutines.scheduling;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087f3.AbstractC2546e1;
import p142q2.InterfaceC3015g;

/* renamed from: kotlinx.coroutines.scheduling.e */
/* loaded from: classes.dex */
final class ExecutorC2816e extends AbstractC2546e1 implements InterfaceC2821j, Executor {

    /* renamed from: h */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10831h = AtomicIntegerFieldUpdater.newUpdater(ExecutorC2816e.class, "inFlightTasks");

    /* renamed from: c */
    @NotNull
    private final C2814c f10832c;

    /* renamed from: d */
    private final int f10833d;

    /* renamed from: e */
    @Nullable
    private final String f10834e;

    /* renamed from: f */
    private final int f10835f;

    /* renamed from: g */
    @NotNull
    private final ConcurrentLinkedQueue<Runnable> f10836g = new ConcurrentLinkedQueue<>();

    @NotNull
    private volatile /* synthetic */ int inFlightTasks = 0;

    public ExecutorC2816e(@NotNull C2814c c2814c, int i4, @Nullable String str, int i5) {
        this.f10832c = c2814c;
        this.f10833d = i4;
        this.f10834e = str;
        this.f10835f = i5;
    }

    /* renamed from: L */
    private final void m9418L(Runnable runnable, boolean z3) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10831h;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f10833d) {
                this.f10832c.m9417M(runnable, this, z3);
                return;
            }
            this.f10836g.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f10833d) {
                return;
            } else {
                runnable = this.f10836g.poll();
            }
        } while (runnable != null);
    }

    @Override // kotlinx.coroutines.scheduling.InterfaceC2821j
    /* renamed from: I */
    public int mo9419I() {
        return this.f10835f;
    }

    @Override // p087f3.AbstractC2545e0
    /* renamed from: J */
    public void mo2905J(@NotNull InterfaceC3015g interfaceC3015g, @NotNull Runnable runnable) {
        m9418L(runnable, false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        m9418L(runnable, false);
    }

    @Override // kotlinx.coroutines.scheduling.InterfaceC2821j
    /* renamed from: q */
    public void mo9420q() {
        Runnable runnablePoll = this.f10836g.poll();
        if (runnablePoll != null) {
            this.f10832c.m9417M(runnablePoll, this, true);
            return;
        }
        f10831h.decrementAndGet(this);
        Runnable runnablePoll2 = this.f10836g.poll();
        if (runnablePoll2 == null) {
            return;
        }
        m9418L(runnablePoll2, true);
    }

    @Override // p087f3.AbstractC2545e0
    @NotNull
    public String toString() {
        String str = this.f10834e;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f10832c + ']';
    }
}
