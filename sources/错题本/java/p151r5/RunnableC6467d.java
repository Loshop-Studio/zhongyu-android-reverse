package p151r5;

import android.os.Handler;
import p159s5.InterfaceC6559b;
import p185v7.AbstractC6675d;

/* renamed from: r5.d */
/* loaded from: classes3.dex */
public final class RunnableC6467d implements Runnable, InterfaceC6559b {

    /* renamed from: a */
    public final Handler f10643a;

    /* renamed from: b */
    public final Runnable f10644b;

    public RunnableC6467d(Handler handler, Runnable runnable) {
        this.f10643a = handler;
        this.f10644b = runnable;
    }

    @Override // p159s5.InterfaceC6559b
    public final void dispose() {
        this.f10643a.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f10644b.run();
        } catch (Throwable th) {
            AbstractC6675d.m6351q(th);
        }
    }
}
