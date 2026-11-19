package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.x */
/* loaded from: classes5.dex */
public final class C9136x implements InterfaceC9123k {

    /* renamed from: a */
    public final Class f17498a;

    /* renamed from: b */
    public final String f17499b;

    public C9136x(Class jClass, String moduleName) {
        AbstractC9133u.m16133g(jClass, "jClass");
        AbstractC9133u.m16133g(moduleName, "moduleName");
        this.f17498a = jClass;
        this.f17499b = moduleName;
    }

    @Override // kotlin.jvm.internal.InterfaceC9123k
    /* renamed from: d */
    public Class mo16115d() {
        return this.f17498a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9136x) && AbstractC9133u.m16128b(mo16115d(), ((C9136x) obj).mo16115d());
    }

    public int hashCode() {
        return mo16115d().hashCode();
    }

    public String toString() {
        return mo16115d() + " (Kotlin reflection is not available)";
    }
}
