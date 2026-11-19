package p134i7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p123h7.C8728h;
import p123h7.C8730j;
import p123h7.C8732l;
import p123h7.C8735o;
import p123h7.C8736p;
import p156k7.AbstractC9064b;

/* renamed from: i7.o */
/* loaded from: classes5.dex */
public abstract class AbstractC8795o extends AbstractC8793n {
    /* renamed from: d */
    public static boolean m14607d(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = objArr[i10];
            Object obj2 = objArr2[i10];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!m14607d((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof C8728h) && (obj2 instanceof C8728h)) {
                    if (!AbstractC9064b.m15867c(((C8728h) obj).m14252p(), ((C8728h) obj2).m14252p())) {
                        return false;
                    }
                } else if ((obj instanceof C8735o) && (obj2 instanceof C8735o)) {
                    if (!AbstractC9064b.m15865a(((C8735o) obj).m14322p(), ((C8735o) obj2).m14322p())) {
                        return false;
                    }
                } else if ((obj instanceof C8730j) && (obj2 instanceof C8730j)) {
                    if (!AbstractC9064b.m15866b(((C8730j) obj).m14275p(), ((C8730j) obj2).m14275p())) {
                        return false;
                    }
                } else if ((obj instanceof C8732l) && (obj2 instanceof C8732l)) {
                    if (!AbstractC9064b.m15868d(((C8732l) obj).m14299p(), ((C8732l) obj2).m14299p())) {
                        return false;
                    }
                } else if (!AbstractC9133u.m16128b(obj, obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: e */
    public static String m14608e(Object[] objArr) {
        if (objArr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder((AbstractC8323h.m13513h(objArr.length, 429496729) * 5) + 2);
        m14609f(objArr, sb, new ArrayList());
        return sb.toString();
    }

    /* renamed from: f */
    public static final void m14609f(Object[] objArr, StringBuilder sb, List list) {
        if (list.contains(objArr)) {
            sb.append("[...]");
            return;
        }
        list.add(objArr);
        sb.append('[');
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb.append(", ");
            }
            Object obj = objArr[i10];
            if (obj == null) {
                sb.append("null");
            } else if (obj instanceof Object[]) {
                m14609f((Object[]) obj, sb, list);
                C8736p c8736p = C8736p.f16368a;
            } else if (obj instanceof byte[]) {
                String string = Arrays.toString((byte[]) obj);
                AbstractC9133u.m16132f(string, "toString(...)");
                sb.append(string);
            } else if (obj instanceof short[]) {
                String string2 = Arrays.toString((short[]) obj);
                AbstractC9133u.m16132f(string2, "toString(...)");
                sb.append(string2);
            } else if (obj instanceof int[]) {
                String string3 = Arrays.toString((int[]) obj);
                AbstractC9133u.m16132f(string3, "toString(...)");
                sb.append(string3);
            } else if (obj instanceof long[]) {
                String string4 = Arrays.toString((long[]) obj);
                AbstractC9133u.m16132f(string4, "toString(...)");
                sb.append(string4);
            } else if (obj instanceof float[]) {
                String string5 = Arrays.toString((float[]) obj);
                AbstractC9133u.m16132f(string5, "toString(...)");
                sb.append(string5);
            } else if (obj instanceof double[]) {
                String string6 = Arrays.toString((double[]) obj);
                AbstractC9133u.m16132f(string6, "toString(...)");
                sb.append(string6);
            } else if (obj instanceof char[]) {
                String string7 = Arrays.toString((char[]) obj);
                AbstractC9133u.m16132f(string7, "toString(...)");
                sb.append(string7);
            } else if (obj instanceof boolean[]) {
                String string8 = Arrays.toString((boolean[]) obj);
                AbstractC9133u.m16132f(string8, "toString(...)");
                sb.append(string8);
            } else if (obj instanceof C8728h) {
                sb.append(AbstractC9064b.m15869e(((C8728h) obj).m14252p()));
            } else if (obj instanceof C8735o) {
                sb.append(AbstractC9064b.m15871g(((C8735o) obj).m14322p()));
            } else if (obj instanceof C8730j) {
                sb.append(AbstractC9064b.m15870f(((C8730j) obj).m14275p()));
            } else if (obj instanceof C8732l) {
                sb.append(AbstractC9064b.m15872h(((C8732l) obj).m14299p()));
            } else {
                sb.append(obj.toString());
            }
        }
        sb.append(']');
        list.remove(AbstractC8809v.m14773p(list));
    }
}
