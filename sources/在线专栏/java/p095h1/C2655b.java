package p095h1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p090g1.ExecutorC2637i;

/* renamed from: h1.b */
/* loaded from: classes.dex */
public class C2655b implements InterfaceC2654a {

    /* renamed from: a */
    private final ExecutorC2637i f10548a;

    /* renamed from: b */
    private final Handler f10549b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final Executor f10550c = new a();

    /* renamed from: h1.b$a */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C2655b.this.m8916d(runnable);
        }
    }

    public C2655b(Executor executor) {
        this.f10548a = new ExecutorC2637i(executor);
    }

    @Override // p095h1.InterfaceC2654a
    /* renamed from: a */
    public Executor mo8913a() {
        return this.f10550c;
    }

    @Override // p095h1.InterfaceC2654a
    /* renamed from: b */
    public void mo8914b(Runnable runnable) {
        this.f10548a.execute(runnable);
    }

    @Override // p095h1.InterfaceC2654a
    /* renamed from: c */
    public ExecutorC2637i mo8915c() {
        return this.f10548a;
    }

    /* renamed from: d */
    public void m8916d(Runnable runnable) {
        this.f10549b.post(runnable);
    }
}
