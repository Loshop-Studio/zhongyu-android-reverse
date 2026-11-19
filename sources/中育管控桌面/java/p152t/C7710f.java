package p152t;

import kotlin.Unit;
import p152t.InterfaceC7708d;

/* renamed from: t.f */
/* loaded from: classes3.dex */
public final class C7710f implements InterfaceC7708d {

    /* renamed from: a */
    public final InterfaceC7713i f10178a;

    /* renamed from: b */
    public final InterfaceC7714j f10179b;

    /* renamed from: c */
    public final Object f10180c = new Object();

    public C7710f(InterfaceC7713i interfaceC7713i, InterfaceC7714j interfaceC7714j) {
        this.f10178a = interfaceC7713i;
        this.f10179b = interfaceC7714j;
    }

    @Override // p152t.InterfaceC7708d
    /* renamed from: a */
    public InterfaceC7708d.c mo9169a(InterfaceC7708d.b bVar) {
        InterfaceC7708d.c cVarMo9160a;
        synchronized (this.f10180c) {
            try {
                cVarMo9160a = this.f10178a.mo9160a(bVar);
                if (cVarMo9160a == null) {
                    cVarMo9160a = this.f10179b.mo9166a(bVar);
                }
                if (cVarMo9160a != null && !cVarMo9160a.m9181b().mo7565a()) {
                    m9190c(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVarMo9160a;
    }

    @Override // p152t.InterfaceC7708d
    /* renamed from: b */
    public void mo9170b(long j6) {
        synchronized (this.f10180c) {
            this.f10178a.mo9161b(j6);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: c */
    public boolean m9190c(InterfaceC7708d.b bVar) {
        boolean z6;
        synchronized (this.f10180c) {
            z6 = this.f10178a.mo9162c(bVar) || this.f10179b.mo9167c(bVar);
        }
        return z6;
    }

    @Override // p152t.InterfaceC7708d
    public void clear() {
        synchronized (this.f10180c) {
            this.f10178a.clear();
            this.f10179b.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p152t.InterfaceC7708d
    /* renamed from: d */
    public long mo9171d() {
        long jMo9163d;
        synchronized (this.f10180c) {
            jMo9163d = this.f10178a.mo9163d();
        }
        return jMo9163d;
    }

    @Override // p152t.InterfaceC7708d
    /* renamed from: f */
    public void mo9172f(long j6) {
        synchronized (this.f10180c) {
            this.f10178a.mo9165f(j6);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p152t.InterfaceC7708d
    /* renamed from: g */
    public void mo9173g(InterfaceC7708d.b bVar, InterfaceC7708d.c cVar) {
        synchronized (this.f10180c) {
            long size = cVar.m9181b().getSize();
            if (size < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + size).toString());
            }
            this.f10178a.mo9164e(bVar, cVar.m9181b(), cVar.m9180a(), size);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p152t.InterfaceC7708d
    public long getSize() {
        long size;
        synchronized (this.f10180c) {
            size = this.f10178a.getSize();
        }
        return size;
    }
}
