package p247t;

import kotlin.Unit;
import p247t.InterfaceC9595d;

/* renamed from: t.f */
/* loaded from: classes3.dex */
public final class C9597f implements InterfaceC9595d {

    /* renamed from: a */
    public final InterfaceC9600i f16807a;

    /* renamed from: b */
    public final InterfaceC9601j f16808b;

    /* renamed from: c */
    public final Object f16809c = new Object();

    public C9597f(InterfaceC9600i interfaceC9600i, InterfaceC9601j interfaceC9601j) {
        this.f16807a = interfaceC9600i;
        this.f16808b = interfaceC9601j;
    }

    @Override // p247t.InterfaceC9595d
    /* renamed from: a */
    public InterfaceC9595d.c mo15794a(InterfaceC9595d.b bVar) {
        InterfaceC9595d.c cVarMo15787a;
        synchronized (this.f16809c) {
            try {
                cVarMo15787a = this.f16807a.mo15787a(bVar);
                if (cVarMo15787a == null) {
                    cVarMo15787a = this.f16808b.mo15791a(bVar);
                }
                if (cVarMo15787a != null && !cVarMo15787a.m15804b().mo12a()) {
                    m15813b(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVarMo15787a;
    }

    /* renamed from: b */
    public boolean m15813b(InterfaceC9595d.b bVar) {
        boolean z9;
        synchronized (this.f16809c) {
            z9 = this.f16807a.mo15788b(bVar) || this.f16808b.mo15792b(bVar);
        }
        return z9;
    }

    @Override // p247t.InterfaceC9595d
    public void clear() {
        synchronized (this.f16809c) {
            this.f16807a.clear();
            this.f16808b.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p247t.InterfaceC9595d
    /* renamed from: d */
    public void mo15795d(long j9) {
        synchronized (this.f16809c) {
            this.f16807a.mo15790d(j9);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p247t.InterfaceC9595d
    /* renamed from: e */
    public void mo15796e(InterfaceC9595d.b bVar, InterfaceC9595d.c cVar) {
        synchronized (this.f16809c) {
            long size = cVar.m15804b().getSize();
            if (size < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + size).toString());
            }
            this.f16807a.mo15789c(bVar, cVar.m15804b(), cVar.m15803a(), size);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p247t.InterfaceC9595d
    public long getSize() {
        long size;
        synchronized (this.f16809c) {
            size = this.f16807a.getSize();
        }
        return size;
    }
}
