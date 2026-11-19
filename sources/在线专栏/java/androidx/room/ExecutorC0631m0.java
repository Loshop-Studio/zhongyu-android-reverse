package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: androidx.room.m0 */
/* loaded from: classes.dex */
class ExecutorC0631m0 implements Executor {

    /* renamed from: a */
    private final Executor f4052a;

    /* renamed from: b */
    private final ArrayDeque<Runnable> f4053b = new ArrayDeque<>();

    /* renamed from: c */
    private Runnable f4054c;

    /* renamed from: androidx.room.m0$a */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f4055a;

        a(Runnable runnable) {
            this.f4055a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f4055a.run();
            } finally {
                ExecutorC0631m0.this.m3609a();
            }
        }
    }

    ExecutorC0631m0(Executor executor) {
        this.f4052a = executor;
    }

    /* renamed from: a */
    synchronized void m3609a() {
        Runnable runnablePoll = this.f4053b.poll();
        this.f4054c = runnablePoll;
        if (runnablePoll != null) {
            this.f4052a.execute(runnablePoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f4053b.offer(new a(runnable));
        if (this.f4054c == null) {
            m3609a();
        }
    }
}
