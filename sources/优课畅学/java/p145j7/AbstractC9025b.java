package p145j7;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: j7.b */
/* loaded from: classes5.dex */
public abstract class AbstractC9025b {
    /* renamed from: d */
    public static final Object[] m15682d(int i10) {
        if (i10 >= 0) {
            return new Object[i10];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    /* renamed from: e */
    public static final Object[] m15683e(Object[] objArr, int i10) {
        AbstractC9133u.m16133g(objArr, "<this>");
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i10);
        AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    /* renamed from: f */
    public static final void m15684f(Object[] objArr, int i10) {
        AbstractC9133u.m16133g(objArr, "<this>");
        objArr[i10] = null;
    }

    /* renamed from: g */
    public static final void m15685g(Object[] objArr, int i10, int i11) {
        AbstractC9133u.m16133g(objArr, "<this>");
        while (i10 < i11) {
            m15684f(objArr, i10);
            i10++;
        }
    }

    /* renamed from: h */
    public static final boolean m15686h(Object[] objArr, int i10, int i11, List list) {
        if (i11 != list.size()) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!AbstractC9133u.m16128b(objArr[i10 + i12], list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    public static final int m15687i(Object[] objArr, int i10, int i11) {
        int iHashCode = 1;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = objArr[i10 + i12];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* renamed from: j */
    public static final String m15688j(Object[] objArr, int i10, int i11, Collection collection) {
        StringBuilder sb = new StringBuilder((i11 * 3) + 2);
        sb.append("[");
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i10 + i12];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }
}
