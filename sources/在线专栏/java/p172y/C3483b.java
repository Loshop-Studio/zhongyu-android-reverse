package p172y;

import android.os.CancellationSignal;

/* renamed from: y.b */
/* loaded from: classes.dex */
public final class C3483b {

    /* renamed from: a */
    private boolean f12151a;

    /* renamed from: b */
    private a f12152b;

    /* renamed from: c */
    private Object f12153c;

    /* renamed from: d */
    private boolean f12154d;

    /* renamed from: y.b$a */
    public interface a {
        /* renamed from: a */
        void mo2572a();
    }

    /* renamed from: d */
    private void m10554d() throws InterruptedException {
        while (this.f12154d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: a */
    public void m10555a() {
        synchronized (this) {
            if (this.f12151a) {
                return;
            }
            this.f12151a = true;
            this.f12154d = true;
            a aVar = this.f12152b;
            Object obj = this.f12153c;
            if (aVar != null) {
                try {
                    aVar.mo2572a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f12154d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.f12154d = false;
                notifyAll();
            }
        }
    }

    /* renamed from: b */
    public boolean m10556b() {
        boolean z3;
        synchronized (this) {
            z3 = this.f12151a;
        }
        return z3;
    }

    /* renamed from: c */
    public void m10557c(a aVar) {
        synchronized (this) {
            m10554d();
            if (this.f12152b == aVar) {
                return;
            }
            this.f12152b = aVar;
            if (this.f12151a && aVar != null) {
                aVar.mo2572a();
            }
        }
    }
}
