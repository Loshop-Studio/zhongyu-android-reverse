package p401x4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p385w4.AbstractC11701e;
import p385w4.C11703g;
import p385w4.InterfaceC11698b;
import p385w4.InterfaceC11699c;
import p385w4.InterfaceC11700d;

/* renamed from: x4.d */
/* loaded from: classes5.dex */
public class C11794d extends AbstractC11701e {

    /* renamed from: b */
    public boolean f27981b;

    /* renamed from: c */
    public volatile boolean f27982c;

    /* renamed from: d */
    public Object f27983d;

    /* renamed from: e */
    public Exception f27984e;

    /* renamed from: a */
    public final Object f27980a = new Object();

    /* renamed from: f */
    public List f27985f = new ArrayList();

    @Override // p385w4.AbstractC11701e
    /* renamed from: a */
    public AbstractC11701e mo25867a(InterfaceC11699c interfaceC11699c) {
        return m26021f(new C11792b(C11703g.m25875a(), interfaceC11699c));
    }

    @Override // p385w4.AbstractC11701e
    /* renamed from: b */
    public Exception mo25868b() {
        Exception exc;
        synchronized (this.f27980a) {
            exc = this.f27984e;
        }
        return exc;
    }

    @Override // p385w4.AbstractC11701e
    /* renamed from: c */
    public Object mo25869c() {
        Object obj;
        synchronized (this.f27980a) {
            try {
                if (this.f27984e != null) {
                    throw new RuntimeException(this.f27984e);
                }
                obj = this.f27983d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // p385w4.AbstractC11701e
    /* renamed from: d */
    public boolean mo25870d() {
        boolean z10;
        synchronized (this.f27980a) {
            z10 = this.f27981b;
        }
        return z10;
    }

    @Override // p385w4.AbstractC11701e
    /* renamed from: e */
    public boolean mo25871e() {
        boolean z10;
        synchronized (this.f27980a) {
            try {
                z10 = this.f27981b && !this.f27982c && this.f27984e == null;
            } finally {
            }
        }
        return z10;
    }

    /* renamed from: f */
    public AbstractC11701e m26021f(InterfaceC11698b interfaceC11698b) {
        boolean zMo25870d;
        synchronized (this.f27980a) {
            try {
                zMo25870d = mo25870d();
                if (!zMo25870d) {
                    this.f27985f.add(interfaceC11698b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zMo25870d) {
            interfaceC11698b.mo25865a(this);
        }
        return this;
    }

    /* renamed from: g */
    public final void m26022g(Exception exc) {
        synchronized (this.f27980a) {
            try {
                if (!this.f27981b) {
                    this.f27981b = true;
                    this.f27984e = exc;
                    this.f27980a.notifyAll();
                    m26025j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: h */
    public final void m26023h(Object obj) {
        synchronized (this.f27980a) {
            try {
                if (!this.f27981b) {
                    this.f27981b = true;
                    this.f27983d = obj;
                    this.f27980a.notifyAll();
                    m26025j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: i */
    public AbstractC11701e m26024i(Executor executor, InterfaceC11700d interfaceC11700d) {
        return m26021f(new C11793c(executor, interfaceC11700d));
    }

    /* renamed from: j */
    public final void m26025j() {
        synchronized (this.f27980a) {
            Iterator it = this.f27985f.iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC11698b) it.next()).mo25865a(this);
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.f27985f = null;
        }
    }
}
