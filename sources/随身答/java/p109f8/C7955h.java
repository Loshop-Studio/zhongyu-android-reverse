package p109f8;

import java.lang.ref.WeakReference;

/* renamed from: f8.h */
/* loaded from: classes5.dex */
public class C7955h implements InterfaceC7948a, InterfaceC7953f {

    /* renamed from: a */
    public final WeakReference f13411a;

    /* renamed from: b */
    public InterfaceC7951d f13412b;

    public C7955h(InterfaceC7948a interfaceC7948a) {
        this.f13411a = new WeakReference(interfaceC7948a);
    }

    @Override // p109f8.InterfaceC7953f
    /* renamed from: a */
    public InterfaceC7948a mo12497a() {
        return (InterfaceC7948a) this.f13411a.get();
    }

    @Override // p109f8.InterfaceC7948a
    /* renamed from: b */
    public void mo12363b(Object obj) {
        InterfaceC7948a interfaceC7948a = (InterfaceC7948a) this.f13411a.get();
        if (interfaceC7948a != null) {
            interfaceC7948a.mo12363b(obj);
        } else {
            this.f13412b.cancel();
        }
    }

    /* renamed from: c */
    public void m12501c(InterfaceC7951d interfaceC7951d) {
        this.f13412b = interfaceC7951d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7955h)) {
            return false;
        }
        InterfaceC7948a interfaceC7948a = (InterfaceC7948a) this.f13411a.get();
        if (interfaceC7948a == null || interfaceC7948a != ((C7955h) obj).f13411a.get()) {
            return super.equals(obj);
        }
        return true;
    }

    public int hashCode() {
        InterfaceC7948a interfaceC7948a = (InterfaceC7948a) this.f13411a.get();
        return interfaceC7948a != null ? interfaceC7948a.hashCode() : super.hashCode();
    }
}
