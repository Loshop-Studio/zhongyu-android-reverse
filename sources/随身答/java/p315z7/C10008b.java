package p315z7;

/* renamed from: z7.b */
/* loaded from: classes5.dex */
public final class C10008b implements InterfaceC10012f {

    /* renamed from: c */
    public static final Object f18028c = new Object();

    /* renamed from: a */
    public volatile InterfaceC10012f f18029a;

    /* renamed from: b */
    public volatile Object f18030b = f18028c;

    public C10008b(InterfaceC10012f interfaceC10012f) {
        this.f18029a = interfaceC10012f;
    }

    /* renamed from: b */
    public static InterfaceC10012f m17373b(InterfaceC10012f interfaceC10012f) {
        AbstractC10011e.m17382b(interfaceC10012f);
        return interfaceC10012f instanceof C10008b ? interfaceC10012f : new C10008b(interfaceC10012f);
    }

    /* renamed from: c */
    public static Object m17374c(Object obj, Object obj2) {
        if (obj == f18028c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    /* renamed from: a */
    public final synchronized Object m17375a() {
        Object obj;
        obj = this.f18030b;
        if (obj == f18028c) {
            obj = this.f18029a.get();
            this.f18030b = m17374c(this.f18030b, obj);
            this.f18029a = null;
        }
        return obj;
    }

    @Override // p130h8.InterfaceC8110a
    public Object get() {
        Object obj = this.f18030b;
        return obj == f18028c ? m17375a() : obj;
    }
}
