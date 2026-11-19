package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.x */
/* loaded from: classes6.dex */
public final class C9982x implements InterfaceC9969k {

    /* renamed from: c */
    public final Class f23427c;

    /* renamed from: d */
    public final String f23428d;

    public C9982x(Class jClass, String moduleName) {
        AbstractC9979u.m20294g(jClass, "jClass");
        AbstractC9979u.m20294g(moduleName, "moduleName");
        this.f23427c = jClass;
        this.f23428d = moduleName;
    }

    @Override // kotlin.jvm.internal.InterfaceC9969k
    /* renamed from: b */
    public Class mo20273b() {
        return this.f23427c;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9982x) && AbstractC9979u.m20289b(mo20273b(), ((C9982x) obj).mo20273b());
    }

    public int hashCode() {
        return mo20273b().hashCode();
    }

    public String toString() {
        return mo20273b() + " (Kotlin reflection is not available)";
    }
}
