package p315z7;

/* renamed from: z7.g */
/* loaded from: classes5.dex */
public final class C10013g implements InterfaceC10012f {

    /* renamed from: c */
    public static final Object f18033c = new Object();

    /* renamed from: a */
    public volatile InterfaceC10012f f18034a;

    /* renamed from: b */
    public volatile Object f18035b = f18033c;

    public C10013g(InterfaceC10012f interfaceC10012f) {
        this.f18034a = interfaceC10012f;
    }

    /* renamed from: a */
    public static InterfaceC10012f m17384a(InterfaceC10012f interfaceC10012f) {
        return ((interfaceC10012f instanceof C10013g) || (interfaceC10012f instanceof C10008b)) ? interfaceC10012f : new C10013g((InterfaceC10012f) AbstractC10011e.m17382b(interfaceC10012f));
    }

    @Override // p130h8.InterfaceC8110a
    public Object get() {
        Object obj = this.f18035b;
        if (obj != f18033c) {
            return obj;
        }
        InterfaceC10012f interfaceC10012f = this.f18034a;
        if (interfaceC10012f == null) {
            return this.f18035b;
        }
        Object obj2 = interfaceC10012f.get();
        this.f18035b = obj2;
        this.f18034a = null;
        return obj2;
    }
}
