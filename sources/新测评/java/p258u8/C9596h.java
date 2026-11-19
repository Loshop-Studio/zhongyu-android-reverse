package p258u8;

import java.lang.ref.WeakReference;

/* renamed from: u8.h */
/* loaded from: classes5.dex */
public class C9596h implements InterfaceC9589a, InterfaceC9594f {

    /* renamed from: a */
    public final WeakReference f16807a;

    /* renamed from: b */
    public InterfaceC9592d f16808b;

    public C9596h(InterfaceC9589a interfaceC9589a) {
        this.f16807a = new WeakReference(interfaceC9589a);
    }

    @Override // p258u8.InterfaceC9594f
    /* renamed from: a */
    public InterfaceC9589a mo15986a() {
        return (InterfaceC9589a) this.f16807a.get();
    }

    @Override // p258u8.InterfaceC9589a
    /* renamed from: b */
    public void mo13021b(Object obj) {
        InterfaceC9589a interfaceC9589a = (InterfaceC9589a) this.f16807a.get();
        if (interfaceC9589a != null) {
            interfaceC9589a.mo13021b(obj);
        } else {
            this.f16808b.cancel();
        }
    }

    /* renamed from: c */
    public void m15990c(InterfaceC9592d interfaceC9592d) {
        this.f16808b = interfaceC9592d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9596h)) {
            return false;
        }
        InterfaceC9589a interfaceC9589a = (InterfaceC9589a) this.f16807a.get();
        if (interfaceC9589a == null || interfaceC9589a != ((C9596h) obj).f16807a.get()) {
            return super.equals(obj);
        }
        return true;
    }

    public int hashCode() {
        InterfaceC9589a interfaceC9589a = (InterfaceC9589a) this.f16807a.get();
        return interfaceC9589a != null ? interfaceC9589a.hashCode() : super.hashCode();
    }
}
