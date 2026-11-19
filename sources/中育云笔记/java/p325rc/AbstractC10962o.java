package p325rc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;
import p309qc.C10778i;
import p309qc.C10780k;
import p309qc.C10782m;
import p309qc.C10785p;
import p309qc.C10786q;
import tc.AbstractC11269b;

/* renamed from: rc.o */
/* loaded from: classes6.dex */
public abstract class AbstractC10962o extends AbstractC10960n {
    /* renamed from: d */
    public static boolean m23983d(Object[] objArr, Object[] objArr2) {
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
                    if (!m23983d((Object[]) obj, (Object[]) obj2)) {
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
                } else if ((obj instanceof C10778i) && (obj2 instanceof C10778i)) {
                    if (!AbstractC11269b.m25193c(((C10778i) obj).m22997p(), ((C10778i) obj2).m22997p())) {
                        return false;
                    }
                } else if ((obj instanceof C10785p) && (obj2 instanceof C10785p)) {
                    if (!AbstractC11269b.m25191a(((C10785p) obj).m23067p(), ((C10785p) obj2).m23067p())) {
                        return false;
                    }
                } else if ((obj instanceof C10780k) && (obj2 instanceof C10780k)) {
                    if (!AbstractC11269b.m25192b(((C10780k) obj).m23020p(), ((C10780k) obj2).m23020p())) {
                        return false;
                    }
                } else if ((obj instanceof C10782m) && (obj2 instanceof C10782m)) {
                    if (!AbstractC11269b.m25194d(((C10782m) obj).m23044p(), ((C10782m) obj2).m23044p())) {
                        return false;
                    }
                } else if (!AbstractC9979u.m20289b(obj, obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: e */
    public static String m23984e(Object[] objArr) {
        if (objArr == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder((AbstractC10410o.m21756i(objArr.length, 429496729) * 5) + 2);
        m23985f(objArr, sb2, new ArrayList());
        return sb2.toString();
    }

    /* renamed from: f */
    public static final void m23985f(Object[] objArr, StringBuilder sb2, List list) {
        if (list.contains(objArr)) {
            sb2.append("[...]");
            return;
        }
        list.add(objArr);
        sb2.append('[');
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i10];
            if (obj == null) {
                sb2.append("null");
            } else if (obj instanceof Object[]) {
                m23985f((Object[]) obj, sb2, list);
                C10786q c10786q = C10786q.f26013a;
            } else if (obj instanceof byte[]) {
                String string = Arrays.toString((byte[]) obj);
                AbstractC9979u.m20293f(string, "toString(...)");
                sb2.append(string);
            } else if (obj instanceof short[]) {
                String string2 = Arrays.toString((short[]) obj);
                AbstractC9979u.m20293f(string2, "toString(...)");
                sb2.append(string2);
            } else if (obj instanceof int[]) {
                String string3 = Arrays.toString((int[]) obj);
                AbstractC9979u.m20293f(string3, "toString(...)");
                sb2.append(string3);
            } else if (obj instanceof long[]) {
                String string4 = Arrays.toString((long[]) obj);
                AbstractC9979u.m20293f(string4, "toString(...)");
                sb2.append(string4);
            } else if (obj instanceof float[]) {
                String string5 = Arrays.toString((float[]) obj);
                AbstractC9979u.m20293f(string5, "toString(...)");
                sb2.append(string5);
            } else if (obj instanceof double[]) {
                String string6 = Arrays.toString((double[]) obj);
                AbstractC9979u.m20293f(string6, "toString(...)");
                sb2.append(string6);
            } else if (obj instanceof char[]) {
                String string7 = Arrays.toString((char[]) obj);
                AbstractC9979u.m20293f(string7, "toString(...)");
                sb2.append(string7);
            } else if (obj instanceof boolean[]) {
                String string8 = Arrays.toString((boolean[]) obj);
                AbstractC9979u.m20293f(string8, "toString(...)");
                sb2.append(string8);
            } else if (obj instanceof C10778i) {
                sb2.append(AbstractC11269b.m25195e(((C10778i) obj).m22997p()));
            } else if (obj instanceof C10785p) {
                sb2.append(AbstractC11269b.m25197g(((C10785p) obj).m23067p()));
            } else if (obj instanceof C10780k) {
                sb2.append(AbstractC11269b.m25196f(((C10780k) obj).m23020p()));
            } else if (obj instanceof C10782m) {
                sb2.append(AbstractC11269b.m25198h(((C10782m) obj).m23044p()));
            } else {
                sb2.append(obj.toString());
            }
        }
        sb2.append(']');
        list.remove(AbstractC10978w.m24138p(list));
    }
}
