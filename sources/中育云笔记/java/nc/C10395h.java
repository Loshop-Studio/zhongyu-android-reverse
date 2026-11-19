package nc;

import java.lang.ref.WeakReference;

/* renamed from: nc.h */
/* loaded from: classes6.dex */
public class C10395h implements InterfaceC10388a, InterfaceC10393f {

    /* renamed from: a */
    public final WeakReference f24738a;

    /* renamed from: b */
    public InterfaceC10391d f24739b;

    public C10395h(InterfaceC10388a interfaceC10388a) {
        this.f24738a = new WeakReference(interfaceC10388a);
    }

    @Override // nc.InterfaceC10393f
    /* renamed from: a */
    public InterfaceC10388a mo21715a() {
        return (InterfaceC10388a) this.f24738a.get();
    }

    @Override // nc.InterfaceC10388a
    /* renamed from: b */
    public void mo18993b(Object obj) {
        InterfaceC10388a interfaceC10388a = (InterfaceC10388a) this.f24738a.get();
        if (interfaceC10388a != null) {
            interfaceC10388a.mo18993b(obj);
        } else {
            this.f24739b.cancel();
        }
    }

    /* renamed from: c */
    public void m21719c(InterfaceC10391d interfaceC10391d) {
        this.f24739b = interfaceC10391d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10395h)) {
            return false;
        }
        InterfaceC10388a interfaceC10388a = (InterfaceC10388a) this.f24738a.get();
        if (interfaceC10388a == null || interfaceC10388a != ((C10395h) obj).f24738a.get()) {
            return super.equals(obj);
        }
        return true;
    }

    public int hashCode() {
        InterfaceC10388a interfaceC10388a = (InterfaceC10388a) this.f24738a.get();
        return interfaceC10388a != null ? interfaceC10388a.hashCode() : super.hashCode();
    }
}
