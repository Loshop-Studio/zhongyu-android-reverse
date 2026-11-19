package coil3.network;

import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: coil3.network.b */
/* loaded from: classes2.dex */
public final class C3310b {

    /* renamed from: a */
    public final C3324m f2000a;

    public C3310b(C3324m c3324m) {
        this.f2000a = c3324m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3310b) {
            return AbstractC5830k.m5325b(this.f2000a, ((C3310b) obj).f2000a);
        }
        return false;
    }

    public final int hashCode() {
        C3324m c3324m = this.f2000a;
        if (c3324m != null) {
            return c3324m.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.f2000a + ')';
    }
}
