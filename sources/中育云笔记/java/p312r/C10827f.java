package p312r;

import p309qc.C10786q;
import p312r.InterfaceC10825d;

/* renamed from: r.f */
/* loaded from: classes3.dex */
public final class C10827f implements InterfaceC10825d {

    /* renamed from: a */
    public final InterfaceC10830i f26127a;

    /* renamed from: b */
    public final InterfaceC10831j f26128b;

    /* renamed from: c */
    public final Object f26129c = new Object();

    public C10827f(InterfaceC10830i interfaceC10830i, InterfaceC10831j interfaceC10831j) {
        this.f26127a = interfaceC10830i;
        this.f26128b = interfaceC10831j;
    }

    @Override // p312r.InterfaceC10825d
    /* renamed from: a */
    public InterfaceC10825d.c mo23283a(InterfaceC10825d.b bVar) {
        InterfaceC10825d.c cVarMo23274a;
        synchronized (this.f26129c) {
            try {
                cVarMo23274a = this.f26127a.mo23274a(bVar);
                if (cVarMo23274a == null) {
                    cVarMo23274a = this.f26128b.mo23280a(bVar);
                }
                if (cVarMo23274a != null && !cVarMo23274a.m23295b().mo19675a()) {
                    m23304d(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVarMo23274a;
    }

    @Override // p312r.InterfaceC10825d
    /* renamed from: b */
    public void mo23284b(long j10) {
        synchronized (this.f26129c) {
            this.f26127a.mo23275b(j10);
            C10786q c10786q = C10786q.f26013a;
        }
    }

    @Override // p312r.InterfaceC10825d
    /* renamed from: c */
    public long mo23285c() {
        long jMo23276c;
        synchronized (this.f26129c) {
            jMo23276c = this.f26127a.mo23276c();
        }
        return jMo23276c;
    }

    @Override // p312r.InterfaceC10825d
    public void clear() {
        synchronized (this.f26129c) {
            this.f26127a.clear();
            this.f26128b.clear();
            C10786q c10786q = C10786q.f26013a;
        }
    }

    /* renamed from: d */
    public boolean m23304d(InterfaceC10825d.b bVar) {
        boolean z10;
        synchronized (this.f26129c) {
            z10 = this.f26127a.mo23279f(bVar) || this.f26128b.mo23282f(bVar);
        }
        return z10;
    }

    @Override // p312r.InterfaceC10825d
    /* renamed from: e */
    public void mo23286e(long j10) {
        synchronized (this.f26129c) {
            this.f26127a.mo23278e(j10);
            C10786q c10786q = C10786q.f26013a;
        }
    }

    @Override // p312r.InterfaceC10825d
    /* renamed from: f */
    public void mo23287f(InterfaceC10825d.b bVar, InterfaceC10825d.c cVar) {
        synchronized (this.f26129c) {
            long size = cVar.m23295b().getSize();
            if (size < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + size).toString());
            }
            this.f26127a.mo23277d(bVar, cVar.m23295b(), cVar.m23294a(), size);
            C10786q c10786q = C10786q.f26013a;
        }
    }

    @Override // p312r.InterfaceC10825d
    public long getSize() {
        long size;
        synchronized (this.f26129c) {
            size = this.f26127a.getSize();
        }
        return size;
    }
}
