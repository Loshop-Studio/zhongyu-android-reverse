package p076d7;

import androidx.camera.view.AbstractC0949q;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p100f7.AbstractC8462a;
import p277v6.InterfaceC10250b;
import p321z6.AbstractC10725a;

/* renamed from: d7.b */
/* loaded from: classes5.dex */
public final class CallableC8311b implements Callable, InterfaceC10250b {

    /* renamed from: f */
    public static final FutureTask f15727f = new FutureTask(AbstractC10725a.f21269b, null);

    /* renamed from: a */
    public final Runnable f15728a;

    /* renamed from: d */
    public final ExecutorService f15731d;

    /* renamed from: e */
    public Thread f15732e;

    /* renamed from: c */
    public final AtomicReference f15730c = new AtomicReference();

    /* renamed from: b */
    public final AtomicReference f15729b = new AtomicReference();

    public CallableC8311b(Runnable runnable, ExecutorService executorService) {
        this.f15728a = runnable;
        this.f15731d = executorService;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void call() {
        this.f15732e = Thread.currentThread();
        try {
            this.f15728a.run();
            m13472c(this.f15731d.submit(this));
            this.f15732e = null;
        } catch (Throwable th) {
            this.f15732e = null;
            AbstractC8462a.m13801k(th);
        }
        return null;
    }

    /* renamed from: b */
    public void m13471b(Future future) {
        Future future2;
        do {
            future2 = (Future) this.f15730c.get();
            if (future2 == f15727f) {
                future.cancel(this.f15732e != Thread.currentThread());
                return;
            }
        } while (!AbstractC0949q.m807a(this.f15730c, future2, future));
    }

    /* renamed from: c */
    public void m13472c(Future future) {
        Future future2;
        do {
            future2 = (Future) this.f15729b.get();
            if (future2 == f15727f) {
                future.cancel(this.f15732e != Thread.currentThread());
                return;
            }
        } while (!AbstractC0949q.m807a(this.f15729b, future2, future));
    }

    @Override // p277v6.InterfaceC10250b
    public void dispose() {
        AtomicReference atomicReference = this.f15730c;
        FutureTask futureTask = f15727f;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        if (future != null && future != futureTask) {
            future.cancel(this.f15732e != Thread.currentThread());
        }
        Future future2 = (Future) this.f15729b.getAndSet(futureTask);
        if (future2 == null || future2 == futureTask) {
            return;
        }
        future2.cancel(this.f15732e != Thread.currentThread());
    }

    @Override // p277v6.InterfaceC10250b
    public boolean isDisposed() {
        return this.f15730c.get() == f15727f;
    }
}
