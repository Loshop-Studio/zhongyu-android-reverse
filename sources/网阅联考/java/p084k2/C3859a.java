package p084k2;

import p096m2.InterfaceC4366a;

/* renamed from: k2.a */
/* loaded from: classes2.dex */
public final class C3859a implements InterfaceC4366a {

    /* renamed from: c */
    public static final Object f4781c = new Object();

    /* renamed from: a */
    public volatile InterfaceC4366a f4782a;

    /* renamed from: b */
    public volatile Object f4783b = f4781c;

    public C3859a(InterfaceC4366a interfaceC4366a) {
        this.f4782a = interfaceC4366a;
    }

    /* renamed from: a */
    public static InterfaceC4366a m5165a(InterfaceC4366a interfaceC4366a) {
        AbstractC3860b.m5168b(interfaceC4366a);
        return interfaceC4366a instanceof C3859a ? interfaceC4366a : new C3859a(interfaceC4366a);
    }

    /* renamed from: b */
    public static Object m5166b(Object obj, Object obj2) {
        if (!(obj != f4781c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p096m2.InterfaceC4366a
    public Object get() {
        Object obj = this.f4783b;
        Object obj2 = f4781c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f4783b;
                if (obj == obj2) {
                    obj = this.f4782a.get();
                    this.f4783b = m5166b(this.f4783b, obj);
                    this.f4782a = null;
                }
            }
        }
        return obj;
    }
}
