package p140q;

import coil3.InterfaceC3305k;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5830k;
import p169t6.AbstractC6600a;

/* renamed from: q.b */
/* loaded from: classes2.dex */
public final class C6398b {

    /* renamed from: a */
    public final InterfaceC3305k f10496a;

    /* renamed from: b */
    public final Map f10497b;

    public C6398b(InterfaceC3305k interfaceC3305k, Map map) {
        this.f10496a = interfaceC3305k;
        this.f10497b = AbstractC6600a.m6246x(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6398b)) {
            return false;
        }
        C6398b c6398b = (C6398b) obj;
        return AbstractC5830k.m5325b(this.f10496a, c6398b.f10496a) && AbstractC5830k.m5325b(this.f10497b, c6398b.f10497b);
    }

    public final int hashCode() {
        return this.f10497b.hashCode() + (this.f10496a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(image=" + this.f10496a + ", extras=" + this.f10497b + ')';
    }
}
