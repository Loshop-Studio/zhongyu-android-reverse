package p238t;

import kotlin.Unit;
import p238t.InterfaceC9363d;

/* renamed from: t.f */
/* loaded from: classes3.dex */
public final class C9365f implements InterfaceC9363d {

    /* renamed from: a */
    public final InterfaceC9368i f16240a;

    /* renamed from: b */
    public final InterfaceC9369j f16241b;

    /* renamed from: c */
    public final Object f16242c = new Object();

    public C9365f(InterfaceC9368i interfaceC9368i, InterfaceC9369j interfaceC9369j) {
        this.f16240a = interfaceC9368i;
        this.f16241b = interfaceC9369j;
    }

    @Override // p238t.InterfaceC9363d
    /* renamed from: a */
    public InterfaceC9363d.c mo15620a(InterfaceC9363d.b bVar) {
        InterfaceC9363d.c cVarMo15611a;
        synchronized (this.f16242c) {
            try {
                cVarMo15611a = this.f16240a.mo15611a(bVar);
                if (cVarMo15611a == null) {
                    cVarMo15611a = this.f16241b.mo15617a(bVar);
                }
                if (cVarMo15611a != null && !cVarMo15611a.m15632b().mo13296a()) {
                    m15641c(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVarMo15611a;
    }

    @Override // p238t.InterfaceC9363d
    /* renamed from: b */
    public void mo15621b(long j10) {
        synchronized (this.f16242c) {
            this.f16240a.mo15612b(j10);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: c */
    public boolean m15641c(InterfaceC9363d.b bVar) {
        boolean z9;
        synchronized (this.f16242c) {
            z9 = this.f16240a.mo15613c(bVar) || this.f16241b.mo15618c(bVar);
        }
        return z9;
    }

    @Override // p238t.InterfaceC9363d
    public void clear() {
        synchronized (this.f16242c) {
            this.f16240a.clear();
            this.f16241b.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p238t.InterfaceC9363d
    /* renamed from: d */
    public long mo15622d() {
        long jMo15614d;
        synchronized (this.f16242c) {
            jMo15614d = this.f16240a.mo15614d();
        }
        return jMo15614d;
    }

    @Override // p238t.InterfaceC9363d
    /* renamed from: f */
    public void mo15623f(long j10) {
        synchronized (this.f16242c) {
            this.f16240a.mo15616f(j10);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p238t.InterfaceC9363d
    /* renamed from: g */
    public void mo15624g(InterfaceC9363d.b bVar, InterfaceC9363d.c cVar) {
        synchronized (this.f16242c) {
            long size = cVar.m15632b().getSize();
            if (size < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + size).toString());
            }
            this.f16240a.mo15615e(bVar, cVar.m15632b(), cVar.m15631a(), size);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p238t.InterfaceC9363d
    public long getSize() {
        long size;
        synchronized (this.f16242c) {
            size = this.f16240a.getSize();
        }
        return size;
    }
}
