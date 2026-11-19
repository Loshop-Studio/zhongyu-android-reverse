package p162t;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: t.f */
/* loaded from: classes2.dex */
public final class C6576f {

    /* renamed from: c */
    public static final C6576f f10977c;

    /* renamed from: a */
    public final InterfaceC6573c f10978a;

    /* renamed from: b */
    public final InterfaceC6573c f10979b;

    static {
        C6572b c6572b = C6572b.f10975a;
        f10977c = new C6576f(c6572b, c6572b);
    }

    public C6576f(InterfaceC6573c interfaceC6573c, InterfaceC6573c interfaceC6573c2) {
        this.f10978a = interfaceC6573c;
        this.f10979b = interfaceC6573c2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6576f)) {
            return false;
        }
        C6576f c6576f = (C6576f) obj;
        return AbstractC5830k.m5325b(this.f10978a, c6576f.f10978a) && AbstractC5830k.m5325b(this.f10979b, c6576f.f10979b);
    }

    public final int hashCode() {
        return this.f10979b.hashCode() + (this.f10978a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f10978a + ", height=" + this.f10979b + ')';
    }
}
