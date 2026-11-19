package p167l6;

/* renamed from: l6.b */
/* loaded from: classes5.dex */
public final class C9254b implements InterfaceC9258f {

    /* renamed from: c */
    public static final Object f18256c = new Object();

    /* renamed from: a */
    public volatile InterfaceC9258f f18257a;

    /* renamed from: b */
    public volatile Object f18258b = f18256c;

    public C9254b(InterfaceC9258f interfaceC9258f) {
        this.f18257a = interfaceC9258f;
    }

    /* renamed from: b */
    public static InterfaceC9258f m16963b(InterfaceC9258f interfaceC9258f) {
        AbstractC9257e.m16972b(interfaceC9258f);
        return interfaceC9258f instanceof C9254b ? interfaceC9258f : new C9254b(interfaceC9258f);
    }

    /* renamed from: c */
    public static Object m16964c(Object obj, Object obj2) {
        if (obj == f18256c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    /* renamed from: a */
    public final synchronized Object m16965a() {
        Object obj;
        obj = this.f18258b;
        if (obj == f18256c) {
            obj = this.f18257a.get();
            this.f18258b = m16964c(this.f18258b, obj);
            this.f18257a = null;
        }
        return obj;
    }

    @Override // javax.inject.Provider
    public Object get() {
        Object obj = this.f18258b;
        return obj == f18256c ? m16965a() : obj;
    }
}
