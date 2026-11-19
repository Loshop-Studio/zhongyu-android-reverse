package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.l */
/* loaded from: classes2.dex */
public final class C5831l implements InterfaceC5822c {

    /* renamed from: a */
    public final Class f9222a;

    public C5831l(Class jClass) {
        AbstractC5830k.m5330g(jClass, "jClass");
        this.f9222a = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC5822c
    /* renamed from: c */
    public final Class mo5318c() {
        return this.f9222a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5831l) {
            return AbstractC5830k.m5325b(this.f9222a, ((C5831l) obj).f9222a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9222a.hashCode();
    }

    public final String toString() {
        return this.f9222a + " (Kotlin reflection is not available)";
    }
}
