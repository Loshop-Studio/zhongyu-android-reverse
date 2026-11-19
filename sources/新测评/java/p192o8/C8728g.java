package p192o8;

/* renamed from: o8.g */
/* loaded from: classes5.dex */
public final class C8728g implements InterfaceC8727f {

    /* renamed from: c */
    public static final Object f14507c = new Object();

    /* renamed from: a */
    public volatile InterfaceC8727f f14508a;

    /* renamed from: b */
    public volatile Object f14509b = f14507c;

    public C8728g(InterfaceC8727f interfaceC8727f) {
        this.f14508a = interfaceC8727f;
    }

    /* renamed from: a */
    public static InterfaceC8727f m14367a(InterfaceC8727f interfaceC8727f) {
        return ((interfaceC8727f instanceof C8728g) || (interfaceC8727f instanceof C8723b)) ? interfaceC8727f : new C8728g((InterfaceC8727f) AbstractC8726e.m14365b(interfaceC8727f));
    }

    @Override // p279w8.InterfaceC9823a
    public Object get() {
        Object obj = this.f14509b;
        if (obj != f14507c) {
            return obj;
        }
        InterfaceC8727f interfaceC8727f = this.f14508a;
        if (interfaceC8727f == null) {
            return this.f14509b;
        }
        Object obj2 = interfaceC8727f.get();
        this.f14509b = obj2;
        this.f14508a = null;
        return obj2;
    }
}
