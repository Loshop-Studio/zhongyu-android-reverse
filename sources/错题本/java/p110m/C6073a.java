package p110m;

import coil3.InterfaceC3308n;
import coil3.compose.C3246c;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: m.a */
/* loaded from: classes2.dex */
public final class C6073a {

    /* renamed from: a */
    public final Object f9670a;

    /* renamed from: b */
    public final C3246c f9671b;

    /* renamed from: c */
    public final InterfaceC3308n f9672c;

    public C6073a(Object obj, C3246c c3246c, InterfaceC3308n interfaceC3308n) {
        this.f9670a = obj;
        this.f9671b = c3246c;
        this.f9672c = interfaceC3308n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6073a)) {
            return false;
        }
        C6073a c6073a = (C6073a) obj;
        C3246c c3246c = c6073a.f9671b;
        C3246c c3246c2 = this.f9671b;
        return AbstractC5830k.m5325b(c3246c2, c3246c) && c3246c2.m2184a(this.f9670a, c6073a.f9670a) && AbstractC5830k.m5325b(this.f9672c, c6073a.f9672c);
    }

    public final int hashCode() {
        C3246c c3246c = this.f9671b;
        return this.f9672c.hashCode() + ((c3246c.m2185b(this.f9670a) + (c3246c.hashCode() * 31)) * 31);
    }
}
