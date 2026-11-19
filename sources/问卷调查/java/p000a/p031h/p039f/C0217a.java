package p000a.p031h.p039f;

/* renamed from: a.h.f.a */
/* loaded from: classes.dex */
public final class C0217a {

    /* renamed from: a */
    public boolean f1480a;

    /* renamed from: b */
    public a f1481b;

    /* renamed from: c */
    public boolean f1482c;

    /* renamed from: a.h.f.a$a */
    public interface a {
        /* renamed from: a */
        void mo790a();
    }

    /* renamed from: a */
    public void m788a() {
        synchronized (this) {
            if (this.f1480a) {
                return;
            }
            this.f1480a = true;
            this.f1482c = true;
            a aVar = this.f1481b;
            if (aVar != null) {
                try {
                    aVar.mo790a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f1482c = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.f1482c = false;
                notifyAll();
            }
        }
    }

    /* renamed from: b */
    public void m789b(a aVar) {
        synchronized (this) {
            while (this.f1482c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f1481b == aVar) {
                return;
            }
            this.f1481b = aVar;
            if (this.f1480a) {
                aVar.mo790a();
            }
        }
    }
}
