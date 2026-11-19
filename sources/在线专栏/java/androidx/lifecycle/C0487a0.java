package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC0496f;

/* renamed from: androidx.lifecycle.a0 */
/* loaded from: classes.dex */
public class C0487a0 {

    /* renamed from: a */
    private final C0506n f3389a;

    /* renamed from: b */
    private final Handler f3390b = new Handler();

    /* renamed from: c */
    private a f3391c;

    /* renamed from: androidx.lifecycle.a0$a */
    static class a implements Runnable {

        /* renamed from: a */
        private final C0506n f3392a;

        /* renamed from: b */
        final AbstractC0496f.b f3393b;

        /* renamed from: c */
        private boolean f3394c = false;

        a(C0506n c0506n, AbstractC0496f.b bVar) {
            this.f3392a = c0506n;
            this.f3393b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3394c) {
                return;
            }
            this.f3392a.m2891h(this.f3393b);
            this.f3394c = true;
        }
    }

    public C0487a0(InterfaceC0504l interfaceC0504l) {
        this.f3389a = new C0506n(interfaceC0504l);
    }

    /* renamed from: f */
    private void m2824f(AbstractC0496f.b bVar) {
        a aVar = this.f3391c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f3389a, bVar);
        this.f3391c = aVar2;
        this.f3390b.postAtFrontOfQueue(aVar2);
    }

    /* renamed from: a */
    public AbstractC0496f m2825a() {
        return this.f3389a;
    }

    /* renamed from: b */
    public void m2826b() {
        m2824f(AbstractC0496f.b.ON_START);
    }

    /* renamed from: c */
    public void m2827c() {
        m2824f(AbstractC0496f.b.ON_CREATE);
    }

    /* renamed from: d */
    public void m2828d() {
        m2824f(AbstractC0496f.b.ON_STOP);
        m2824f(AbstractC0496f.b.ON_DESTROY);
    }

    /* renamed from: e */
    public void m2829e() {
        m2824f(AbstractC0496f.b.ON_START);
    }
}
