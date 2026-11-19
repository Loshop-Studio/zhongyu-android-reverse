package kotlin.jvm.internal;

import id.InterfaceC9624a;
import id.InterfaceC9625b;
import id.InterfaceC9626c;
import id.InterfaceC9627d;
import id.InterfaceC9628e;
import id.InterfaceC9629f;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9530b;
import p181hd.InterfaceC9531c;
import p181hd.InterfaceC9533e;
import p181hd.InterfaceC9534f;
import p181hd.InterfaceC9535g;
import p181hd.InterfaceC9536h;
import p181hd.InterfaceC9537i;
import p181hd.InterfaceC9538j;
import p181hd.InterfaceC9539k;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9541m;
import p181hd.InterfaceC9542n;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p181hd.InterfaceC9546r;
import p181hd.InterfaceC9547s;
import p181hd.InterfaceC9548t;
import p181hd.InterfaceC9549u;
import p181hd.InterfaceC9550v;
import p181hd.InterfaceC9551w;
import p309qc.InterfaceC10772c;

/* renamed from: kotlin.jvm.internal.d0 */
/* loaded from: classes6.dex */
public abstract class AbstractC9962d0 {
    /* renamed from: a */
    public static Collection m20250a(Object obj) {
        if ((obj instanceof InterfaceC9624a) && !(obj instanceof InterfaceC9625b)) {
            m20266q(obj, "kotlin.collections.MutableCollection");
        }
        return m20255f(obj);
    }

    /* renamed from: b */
    public static Iterable m20251b(Object obj) {
        if ((obj instanceof InterfaceC9624a) && !(obj instanceof InterfaceC9626c)) {
            m20266q(obj, "kotlin.collections.MutableIterable");
        }
        return m20256g(obj);
    }

    /* renamed from: c */
    public static List m20252c(Object obj) {
        if ((obj instanceof InterfaceC9624a) && !(obj instanceof InterfaceC9627d)) {
            m20266q(obj, "kotlin.collections.MutableList");
        }
        return m20257h(obj);
    }

    /* renamed from: d */
    public static Map m20253d(Object obj) {
        if ((obj instanceof InterfaceC9624a) && !(obj instanceof InterfaceC9628e)) {
            m20266q(obj, "kotlin.collections.MutableMap");
        }
        return m20258i(obj);
    }

    /* renamed from: e */
    public static Object m20254e(Object obj, int i10) {
        if (obj != null && !m20260k(obj, i10)) {
            m20266q(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    /* renamed from: f */
    public static Collection m20255f(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw m20265p(e10);
        }
    }

    /* renamed from: g */
    public static Iterable m20256g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw m20265p(e10);
        }
    }

    /* renamed from: h */
    public static List m20257h(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw m20265p(e10);
        }
    }

    /* renamed from: i */
    public static Map m20258i(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw m20265p(e10);
        }
    }

    /* renamed from: j */
    public static int m20259j(Object obj) {
        if (obj instanceof InterfaceC9976r) {
            return ((InterfaceC9976r) obj).getArity();
        }
        if (obj instanceof InterfaceC9529a) {
            return 0;
        }
        if (obj instanceof InterfaceC9540l) {
            return 1;
        }
        if (obj instanceof InterfaceC9544p) {
            return 2;
        }
        if (obj instanceof InterfaceC9545q) {
            return 3;
        }
        if (obj instanceof InterfaceC9546r) {
            return 4;
        }
        if (obj instanceof InterfaceC9547s) {
            return 5;
        }
        if (obj instanceof InterfaceC9548t) {
            return 6;
        }
        if (obj instanceof InterfaceC9549u) {
            return 7;
        }
        if (obj instanceof InterfaceC9550v) {
            return 8;
        }
        if (obj instanceof InterfaceC9551w) {
            return 9;
        }
        if (obj instanceof InterfaceC9530b) {
            return 10;
        }
        if (obj instanceof InterfaceC9531c) {
            return 11;
        }
        if (obj instanceof InterfaceC9533e) {
            return 13;
        }
        if (obj instanceof InterfaceC9534f) {
            return 14;
        }
        if (obj instanceof InterfaceC9535g) {
            return 15;
        }
        if (obj instanceof InterfaceC9536h) {
            return 16;
        }
        if (obj instanceof InterfaceC9537i) {
            return 17;
        }
        if (obj instanceof InterfaceC9538j) {
            return 18;
        }
        if (obj instanceof InterfaceC9539k) {
            return 19;
        }
        if (obj instanceof InterfaceC9541m) {
            return 20;
        }
        return obj instanceof InterfaceC9542n ? 21 : -1;
    }

    /* renamed from: k */
    public static boolean m20260k(Object obj, int i10) {
        return (obj instanceof InterfaceC10772c) && m20259j(obj) == i10;
    }

    /* renamed from: l */
    public static boolean m20261l(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof InterfaceC9624a) || (obj instanceof InterfaceC9627d);
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m20262m(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof InterfaceC9624a) || (obj instanceof InterfaceC9628e.a);
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m20263n(Object obj) {
        if (obj instanceof Set) {
            return !(obj instanceof InterfaceC9624a) || (obj instanceof InterfaceC9629f);
        }
        return false;
    }

    /* renamed from: o */
    public static Throwable m20264o(Throwable th) {
        return AbstractC9979u.m20302o(th, AbstractC9962d0.class.getName());
    }

    /* renamed from: p */
    public static ClassCastException m20265p(ClassCastException classCastException) {
        throw ((ClassCastException) m20264o(classCastException));
    }

    /* renamed from: q */
    public static void m20266q(Object obj, String str) {
        m20267r((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    /* renamed from: r */
    public static void m20267r(String str) {
        throw m20265p(new ClassCastException(str));
    }
}
