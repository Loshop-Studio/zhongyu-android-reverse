package coil3.decode;

import android.support.v4.media.AbstractC0037f;
import coil3.InterfaceC3305k;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: coil3.decode.g */
/* loaded from: classes2.dex */
public final class C3266g {

    /* renamed from: a */
    public final InterfaceC3305k f1901a;

    /* renamed from: b */
    public final boolean f1902b;

    public C3266g(InterfaceC3305k interfaceC3305k, boolean z8) {
        this.f1901a = interfaceC3305k;
        this.f1902b = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3266g)) {
            return false;
        }
        C3266g c3266g = (C3266g) obj;
        return AbstractC5830k.m5325b(this.f1901a, c3266g.f1901a) && this.f1902b == c3266g.f1902b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1902b) + (this.f1901a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecodeResult(image=");
        sb.append(this.f1901a);
        sb.append(", isSampled=");
        return AbstractC0037f.m93r(sb, this.f1902b, ')');
    }
}
