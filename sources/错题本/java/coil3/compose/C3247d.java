package coil3.compose;

import coil3.InterfaceC3308n;
import kotlin.jvm.internal.AbstractC5830k;
import p154s.C6532f;

/* renamed from: coil3.compose.d */
/* loaded from: classes2.dex */
public final class C3247d {

    /* renamed from: a */
    public final InterfaceC3308n f1850a;

    /* renamed from: b */
    public final C6532f f1851b;

    /* renamed from: c */
    public final C3246c f1852c;

    public C3247d(InterfaceC3308n interfaceC3308n, C6532f c6532f, C3246c c3246c) {
        this.f1850a = interfaceC3308n;
        this.f1851b = c6532f;
        this.f1852c = c3246c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3247d)) {
            return false;
        }
        C3247d c3247d = (C3247d) obj;
        if (!AbstractC5830k.m5325b(this.f1850a, c3247d.f1850a)) {
            return false;
        }
        C3246c c3246c = c3247d.f1852c;
        C3246c c3246c2 = this.f1852c;
        return AbstractC5830k.m5325b(c3246c2, c3246c) && c3246c2.m2184a(this.f1851b, c3247d.f1851b);
    }

    public final int hashCode() {
        int iHashCode = this.f1850a.hashCode() * 31;
        C3246c c3246c = this.f1852c;
        return c3246c.m2185b(this.f1851b) + ((c3246c.hashCode() + iHashCode) * 31);
    }

    public final String toString() {
        return "Input(imageLoader=" + this.f1850a + ", request=" + this.f1851b + ", modelEqualityDelegate=" + this.f1852c + ")";
    }
}
