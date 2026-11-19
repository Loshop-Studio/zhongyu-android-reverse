package p006a5;

/* renamed from: a5.b */
/* loaded from: classes4.dex */
public final class C0013b implements InterfaceC0017f {

    /* renamed from: c */
    public static final Object f9c = new Object();

    /* renamed from: a */
    public volatile InterfaceC0017f f10a;

    /* renamed from: b */
    public volatile Object f11b = f9c;

    public C0013b(InterfaceC0017f interfaceC0017f) {
        this.f10a = interfaceC0017f;
    }

    /* renamed from: b */
    public static InterfaceC0017f m16b(InterfaceC0017f interfaceC0017f) {
        AbstractC0016e.m25b(interfaceC0017f);
        return interfaceC0017f instanceof C0013b ? interfaceC0017f : new C0013b(interfaceC0017f);
    }

    /* renamed from: c */
    public static Object m17c(Object obj, Object obj2) {
        if (obj == f9c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    /* renamed from: a */
    public final synchronized Object m18a() {
        Object obj;
        obj = this.f11b;
        if (obj == f9c) {
            obj = this.f10a.get();
            this.f11b = m17c(this.f11b, obj);
            this.f10a = null;
        }
        return obj;
    }

    @Override // javax.inject.Provider
    public Object get() {
        Object obj = this.f11b;
        return obj == f9c ? m18a() : obj;
    }
}
