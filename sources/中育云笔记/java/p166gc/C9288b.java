package p166gc;

/* renamed from: gc.b */
/* loaded from: classes6.dex */
public final class C9288b implements InterfaceC9292f {

    /* renamed from: c */
    public static final Object f21664c = new Object();

    /* renamed from: a */
    public volatile InterfaceC9292f f21665a;

    /* renamed from: b */
    public volatile Object f21666b = f21664c;

    public C9288b(InterfaceC9292f interfaceC9292f) {
        this.f21665a = interfaceC9292f;
    }

    /* renamed from: b */
    public static InterfaceC9292f m18313b(InterfaceC9292f interfaceC9292f) {
        AbstractC9291e.m18322b(interfaceC9292f);
        return interfaceC9292f instanceof C9288b ? interfaceC9292f : new C9288b(interfaceC9292f);
    }

    /* renamed from: c */
    public static Object m18314c(Object obj, Object obj2) {
        if (obj == f21664c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    /* renamed from: a */
    public final synchronized Object m18315a() {
        Object obj;
        obj = this.f21666b;
        if (obj == f21664c) {
            obj = this.f21665a.get();
            this.f21666b = m18314c(this.f21666b, obj);
            this.f21665a = null;
        }
        return obj;
    }

    @Override // p295pc.InterfaceC10652a
    public Object get() {
        Object obj = this.f21666b;
        return obj == f21664c ? m18315a() : obj;
    }
}
