package coil3.compose;

import kotlin.jvm.internal.AbstractC5830k;
import p154s.C6532f;

/* renamed from: coil3.compose.c */
/* loaded from: classes2.dex */
public final class C3246c {

    /* renamed from: a */
    public static final C3246c f1849a = new C3246c();

    /* renamed from: a */
    public final boolean m2184a(Object obj, Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj instanceof C6532f) || !(obj2 instanceof C6532f)) {
            return AbstractC5830k.m5325b(obj, obj2);
        }
        C6532f c6532f = (C6532f) obj;
        C6532f c6532f2 = (C6532f) obj2;
        return AbstractC5830k.m5325b(c6532f.f10861a, c6532f2.f10861a) && c6532f.f10862b.equals(c6532f2.f10862b) && c6532f.f10864d.equals(c6532f2.f10864d) && AbstractC5830k.m5325b(c6532f.f10875o, c6532f2.f10875o) && c6532f.f10876p == c6532f2.f10876p && c6532f.f10877q == c6532f2.f10877q;
    }

    /* renamed from: b */
    public final int m2185b(Object obj) {
        if (!(obj instanceof C6532f)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        C6532f c6532f = (C6532f) obj;
        return c6532f.f10877q.hashCode() + ((c6532f.f10876p.hashCode() + ((c6532f.f10875o.hashCode() + ((c6532f.f10864d.hashCode() + ((c6532f.f10862b.hashCode() + (c6532f.f10861a.hashCode() * 31)) * 961)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }
}
