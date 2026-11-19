package p192o8;

/* renamed from: o8.b */
/* loaded from: classes5.dex */
public final class C8723b implements InterfaceC8727f {

    /* renamed from: c */
    public static final Object f14502c = new Object();

    /* renamed from: a */
    public volatile InterfaceC8727f f14503a;

    /* renamed from: b */
    public volatile Object f14504b = f14502c;

    public C8723b(InterfaceC8727f interfaceC8727f) {
        this.f14503a = interfaceC8727f;
    }

    /* renamed from: b */
    public static InterfaceC8727f m14356b(InterfaceC8727f interfaceC8727f) {
        AbstractC8726e.m14365b(interfaceC8727f);
        return interfaceC8727f instanceof C8723b ? interfaceC8727f : new C8723b(interfaceC8727f);
    }

    /* renamed from: c */
    public static Object m14357c(Object obj, Object obj2) {
        if (obj == f14502c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    /* renamed from: a */
    public final synchronized Object m14358a() {
        Object obj;
        obj = this.f14504b;
        if (obj == f14502c) {
            obj = this.f14503a.get();
            this.f14504b = m14357c(this.f14504b, obj);
            this.f14503a = null;
        }
        return obj;
    }

    @Override // p279w8.InterfaceC9823a
    public Object get() {
        Object obj = this.f14504b;
        return obj == f14502c ? m14358a() : obj;
    }
}
