package sc;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: sc.b */
/* loaded from: classes6.dex */
public abstract class AbstractC11088b {
    /* renamed from: d */
    public static final Object[] m24667d(int i10) {
        if (i10 >= 0) {
            return new Object[i10];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    /* renamed from: e */
    public static final Object[] m24668e(Object[] objArr, int i10) {
        AbstractC9979u.m20294g(objArr, "<this>");
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i10);
        AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    /* renamed from: f */
    public static final void m24669f(Object[] objArr, int i10) {
        AbstractC9979u.m20294g(objArr, "<this>");
        objArr[i10] = null;
    }

    /* renamed from: g */
    public static final void m24670g(Object[] objArr, int i10, int i11) {
        AbstractC9979u.m20294g(objArr, "<this>");
        while (i10 < i11) {
            m24669f(objArr, i10);
            i10++;
        }
    }

    /* renamed from: h */
    public static final boolean m24671h(Object[] objArr, int i10, int i11, List list) {
        if (i11 != list.size()) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!AbstractC9979u.m20289b(objArr[i10 + i12], list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    public static final int m24672i(Object[] objArr, int i10, int i11) {
        int iHashCode = 1;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = objArr[i10 + i12];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* renamed from: j */
    public static final String m24673j(Object[] objArr, int i10, int i11, Collection collection) {
        StringBuilder sb2 = new StringBuilder((i11 * 3) + 2);
        sb2.append("[");
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i10 + i12];
            if (obj == collection) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }
}
