package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p123h7.InterfaceC8723c;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10560b;
import p300x7.InterfaceC10561c;
import p300x7.InterfaceC10563e;
import p300x7.InterfaceC10564f;
import p300x7.InterfaceC10565g;
import p300x7.InterfaceC10566h;
import p300x7.InterfaceC10567i;
import p300x7.InterfaceC10568j;
import p300x7.InterfaceC10569k;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10571m;
import p300x7.InterfaceC10572n;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;
import p300x7.InterfaceC10576r;
import p300x7.InterfaceC10577s;
import p300x7.InterfaceC10578t;
import p300x7.InterfaceC10579u;
import p300x7.InterfaceC10580v;
import p300x7.InterfaceC10581w;
import p311y7.InterfaceC10668a;
import p311y7.InterfaceC10669b;
import p311y7.InterfaceC10670c;
import p311y7.InterfaceC10671d;
import p311y7.InterfaceC10672e;
import p311y7.InterfaceC10673f;

/* renamed from: kotlin.jvm.internal.d0 */
/* loaded from: classes5.dex */
public abstract class AbstractC9116d0 {
    /* renamed from: a */
    public static Collection m16092a(Object obj) {
        if ((obj instanceof InterfaceC10668a) && !(obj instanceof InterfaceC10669b)) {
            m16108q(obj, "kotlin.collections.MutableCollection");
        }
        return m16097f(obj);
    }

    /* renamed from: b */
    public static Iterable m16093b(Object obj) {
        if ((obj instanceof InterfaceC10668a) && !(obj instanceof InterfaceC10670c)) {
            m16108q(obj, "kotlin.collections.MutableIterable");
        }
        return m16098g(obj);
    }

    /* renamed from: c */
    public static List m16094c(Object obj) {
        if ((obj instanceof InterfaceC10668a) && !(obj instanceof InterfaceC10671d)) {
            m16108q(obj, "kotlin.collections.MutableList");
        }
        return m16099h(obj);
    }

    /* renamed from: d */
    public static Map m16095d(Object obj) {
        if ((obj instanceof InterfaceC10668a) && !(obj instanceof InterfaceC10672e)) {
            m16108q(obj, "kotlin.collections.MutableMap");
        }
        return m16100i(obj);
    }

    /* renamed from: e */
    public static Object m16096e(Object obj, int i10) {
        if (obj != null && !m16102k(obj, i10)) {
            m16108q(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    /* renamed from: f */
    public static Collection m16097f(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw m16107p(e10);
        }
    }

    /* renamed from: g */
    public static Iterable m16098g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw m16107p(e10);
        }
    }

    /* renamed from: h */
    public static List m16099h(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw m16107p(e10);
        }
    }

    /* renamed from: i */
    public static Map m16100i(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw m16107p(e10);
        }
    }

    /* renamed from: j */
    public static int m16101j(Object obj) {
        if (obj instanceof InterfaceC9130r) {
            return ((InterfaceC9130r) obj).getArity();
        }
        if (obj instanceof InterfaceC10559a) {
            return 0;
        }
        if (obj instanceof InterfaceC10570l) {
            return 1;
        }
        if (obj instanceof InterfaceC10574p) {
            return 2;
        }
        if (obj instanceof InterfaceC10575q) {
            return 3;
        }
        if (obj instanceof InterfaceC10576r) {
            return 4;
        }
        if (obj instanceof InterfaceC10577s) {
            return 5;
        }
        if (obj instanceof InterfaceC10578t) {
            return 6;
        }
        if (obj instanceof InterfaceC10579u) {
            return 7;
        }
        if (obj instanceof InterfaceC10580v) {
            return 8;
        }
        if (obj instanceof InterfaceC10581w) {
            return 9;
        }
        if (obj instanceof InterfaceC10560b) {
            return 10;
        }
        if (obj instanceof InterfaceC10561c) {
            return 11;
        }
        if (obj instanceof InterfaceC10563e) {
            return 13;
        }
        if (obj instanceof InterfaceC10564f) {
            return 14;
        }
        if (obj instanceof InterfaceC10565g) {
            return 15;
        }
        if (obj instanceof InterfaceC10566h) {
            return 16;
        }
        if (obj instanceof InterfaceC10567i) {
            return 17;
        }
        if (obj instanceof InterfaceC10568j) {
            return 18;
        }
        if (obj instanceof InterfaceC10569k) {
            return 19;
        }
        if (obj instanceof InterfaceC10571m) {
            return 20;
        }
        return obj instanceof InterfaceC10572n ? 21 : -1;
    }

    /* renamed from: k */
    public static boolean m16102k(Object obj, int i10) {
        return (obj instanceof InterfaceC8723c) && m16101j(obj) == i10;
    }

    /* renamed from: l */
    public static boolean m16103l(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof InterfaceC10668a) || (obj instanceof InterfaceC10671d);
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m16104m(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof InterfaceC10668a) || (obj instanceof InterfaceC10672e.a);
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m16105n(Object obj) {
        if (obj instanceof Set) {
            return !(obj instanceof InterfaceC10668a) || (obj instanceof InterfaceC10673f);
        }
        return false;
    }

    /* renamed from: o */
    public static Throwable m16106o(Throwable th) {
        return AbstractC9133u.m16141o(th, AbstractC9116d0.class.getName());
    }

    /* renamed from: p */
    public static ClassCastException m16107p(ClassCastException classCastException) {
        throw ((ClassCastException) m16106o(classCastException));
    }

    /* renamed from: q */
    public static void m16108q(Object obj, String str) {
        m16109r((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    /* renamed from: r */
    public static void m16109r(String str) {
        throw m16107p(new ClassCastException(str));
    }
}
