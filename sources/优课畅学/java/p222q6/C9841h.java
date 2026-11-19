package p222q6;

import java.lang.ref.WeakReference;

/* renamed from: q6.h */
/* loaded from: classes5.dex */
public class C9841h implements InterfaceC9834a, InterfaceC9839f {

    /* renamed from: a */
    public final WeakReference f19643a;

    /* renamed from: b */
    public InterfaceC9837d f19644b;

    public C9841h(InterfaceC9834a interfaceC9834a) {
        this.f19643a = new WeakReference(interfaceC9834a);
    }

    @Override // p222q6.InterfaceC9839f
    /* renamed from: a */
    public InterfaceC9834a mo18359a() {
        return (InterfaceC9834a) this.f19643a.get();
    }

    @Override // p222q6.InterfaceC9834a
    /* renamed from: b */
    public void mo15425b(Object obj) {
        InterfaceC9834a interfaceC9834a = (InterfaceC9834a) this.f19643a.get();
        if (interfaceC9834a != null) {
            interfaceC9834a.mo15425b(obj);
        } else {
            this.f19644b.cancel();
        }
    }

    /* renamed from: c */
    public void m18363c(InterfaceC9837d interfaceC9837d) {
        this.f19644b = interfaceC9837d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9841h)) {
            return false;
        }
        InterfaceC9834a interfaceC9834a = (InterfaceC9834a) this.f19643a.get();
        if (interfaceC9834a == null || interfaceC9834a != ((C9841h) obj).f19643a.get()) {
            return super.equals(obj);
        }
        return true;
    }

    public int hashCode() {
        InterfaceC9834a interfaceC9834a = (InterfaceC9834a) this.f19643a.get();
        return interfaceC9834a != null ? interfaceC9834a.hashCode() : super.hashCode();
    }
}
