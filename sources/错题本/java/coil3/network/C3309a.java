package coil3.network;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: coil3.network.a */
/* loaded from: classes2.dex */
public final class C3309a {

    /* renamed from: a */
    public final C3324m f1999a;

    public C3309a(C3324m c3324m) {
        this.f1999a = c3324m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3309a)) {
            return false;
        }
        C3309a c3309a = (C3309a) obj;
        c3309a.getClass();
        return AbstractC5830k.m5325b(this.f1999a, c3309a.f1999a);
    }

    public final int hashCode() {
        C3324m c3324m = this.f1999a;
        if (c3324m != null) {
            return c3324m.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ReadResult(request=null, response=" + this.f1999a + ')';
    }
}
