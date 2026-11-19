package p325rc;

import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.C10405j;

/* renamed from: rc.c0 */
/* loaded from: classes6.dex */
public abstract class AbstractC10939c0 extends AbstractC10937b0 {
    /* renamed from: V */
    public static List m23880V(List list) {
        AbstractC9979u.m20294g(list, "<this>");
        return new C10977v0(list);
    }

    /* renamed from: W */
    public static List m23881W(List list) {
        AbstractC9979u.m20294g(list, "<this>");
        return new C10975u0(list);
    }

    /* renamed from: X */
    public static final int m23882X(List list, int i10) {
        if (i10 >= 0 && i10 <= AbstractC10978w.m24138p(list)) {
            return AbstractC10978w.m24138p(list) - i10;
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new C10405j(0, AbstractC10978w.m24138p(list)) + "].");
    }

    /* renamed from: Y */
    public static final int m23883Y(List list, int i10) {
        return AbstractC10978w.m24138p(list) - i10;
    }

    /* renamed from: Z */
    public static final int m23884Z(List list, int i10) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new C10405j(0, list.size()) + "].");
    }
}
