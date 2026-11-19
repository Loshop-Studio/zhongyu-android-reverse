package kotlin.jvm.internal;

import java.util.List;
import p128o2.InterfaceC2910c;
import p171x2.InterfaceC3459a;
import p171x2.InterfaceC3460b;
import p171x2.InterfaceC3461c;
import p171x2.InterfaceC3462d;
import p171x2.InterfaceC3463e;
import p171x2.InterfaceC3464f;
import p171x2.InterfaceC3465g;
import p171x2.InterfaceC3466h;
import p171x2.InterfaceC3467i;
import p171x2.InterfaceC3468j;
import p171x2.InterfaceC3469k;
import p171x2.InterfaceC3470l;
import p171x2.InterfaceC3471m;
import p171x2.InterfaceC3472n;
import p171x2.InterfaceC3473o;
import p171x2.InterfaceC3474p;
import p171x2.InterfaceC3475q;
import p171x2.InterfaceC3476r;
import p171x2.InterfaceC3477s;
import p171x2.InterfaceC3478t;
import p171x2.InterfaceC3479u;
import p171x2.InterfaceC3480v;
import p171x2.InterfaceC3481w;
import p175y2.InterfaceC3498a;

/* renamed from: kotlin.jvm.internal.b0 */
/* loaded from: classes.dex */
public class C2759b0 {
    /* renamed from: a */
    public static List m9221a(Object obj) {
        if (obj instanceof InterfaceC3498a) {
            m9228h(obj, "kotlin.collections.MutableList");
        }
        return m9223c(obj);
    }

    /* renamed from: b */
    public static Object m9222b(Object obj, int i4) {
        if (obj != null && !m9225e(obj, i4)) {
            m9228h(obj, "kotlin.jvm.functions.Function" + i4);
        }
        return obj;
    }

    /* renamed from: c */
    public static List m9223c(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e4) {
            throw m9227g(e4);
        }
    }

    /* renamed from: d */
    public static int m9224d(Object obj) {
        if (obj instanceof InterfaceC2765h) {
            return ((InterfaceC2765h) obj).getArity();
        }
        if (obj instanceof InterfaceC3459a) {
            return 0;
        }
        if (obj instanceof InterfaceC3470l) {
            return 1;
        }
        if (obj instanceof InterfaceC3474p) {
            return 2;
        }
        if (obj instanceof InterfaceC3475q) {
            return 3;
        }
        if (obj instanceof InterfaceC3476r) {
            return 4;
        }
        if (obj instanceof InterfaceC3477s) {
            return 5;
        }
        if (obj instanceof InterfaceC3478t) {
            return 6;
        }
        if (obj instanceof InterfaceC3479u) {
            return 7;
        }
        if (obj instanceof InterfaceC3480v) {
            return 8;
        }
        if (obj instanceof InterfaceC3481w) {
            return 9;
        }
        if (obj instanceof InterfaceC3460b) {
            return 10;
        }
        if (obj instanceof InterfaceC3461c) {
            return 11;
        }
        if (obj instanceof InterfaceC3462d) {
            return 12;
        }
        if (obj instanceof InterfaceC3463e) {
            return 13;
        }
        if (obj instanceof InterfaceC3464f) {
            return 14;
        }
        if (obj instanceof InterfaceC3465g) {
            return 15;
        }
        if (obj instanceof InterfaceC3466h) {
            return 16;
        }
        if (obj instanceof InterfaceC3467i) {
            return 17;
        }
        if (obj instanceof InterfaceC3468j) {
            return 18;
        }
        if (obj instanceof InterfaceC3469k) {
            return 19;
        }
        if (obj instanceof InterfaceC3471m) {
            return 20;
        }
        if (obj instanceof InterfaceC3472n) {
            return 21;
        }
        return obj instanceof InterfaceC3473o ? 22 : -1;
    }

    /* renamed from: e */
    public static boolean m9225e(Object obj, int i4) {
        return (obj instanceof InterfaceC2910c) && m9224d(obj) == i4;
    }

    /* renamed from: f */
    private static <T extends Throwable> T m9226f(T t3) {
        return (T) C2769l.m9247k(t3, C2759b0.class.getName());
    }

    /* renamed from: g */
    public static ClassCastException m9227g(ClassCastException classCastException) {
        throw ((ClassCastException) m9226f(classCastException));
    }

    /* renamed from: h */
    public static void m9228h(Object obj, String str) {
        m9229i((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    /* renamed from: i */
    public static void m9229i(String str) {
        throw m9227g(new ClassCastException(str));
    }
}
