package p090g1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: g1.i */
/* loaded from: classes.dex */
public class ExecutorC2637i implements Executor {

    /* renamed from: b */
    private final Executor f10421b;

    /* renamed from: d */
    private volatile Runnable f10423d;

    /* renamed from: a */
    private final ArrayDeque<a> f10420a = new ArrayDeque<>();

    /* renamed from: c */
    private final Object f10422c = new Object();

    /* renamed from: g1.i$a */
    static class a implements Runnable {

        /* renamed from: a */
        final ExecutorC2637i f10424a;

        /* renamed from: b */
        final Runnable f10425b;

        a(ExecutorC2637i executorC2637i, Runnable runnable) {
            this.f10424a = executorC2637i;
            this.f10425b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f10425b.run();
            } finally {
                this.f10424a.m8844b();
            }
        }
    }

    public ExecutorC2637i(Executor executor) {
        this.f10421b = executor;
    }

    /* renamed from: a */
    public boolean m8843a() {
        boolean z3;
        synchronized (this.f10422c) {
            z3 = !this.f10420a.isEmpty();
        }
        return z3;
    }

    /* renamed from: b */
    void m8844b() {
        synchronized (this.f10422c) {
            a aVarPoll = this.f10420a.poll();
            this.f10423d = aVarPoll;
            if (aVarPoll != null) {
                this.f10421b.execute(this.f10423d);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f10422c) {
            this.f10420a.add(new a(this, runnable));
            if (this.f10423d == null) {
                m8844b();
            }
        }
    }
}
