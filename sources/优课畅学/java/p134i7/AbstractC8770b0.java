package p134i7;

import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.C8321f;

/* renamed from: i7.b0 */
/* loaded from: classes5.dex */
public abstract class AbstractC8770b0 extends AbstractC8768a0 {
    /* renamed from: V */
    public static List m14502V(List list) {
        AbstractC9133u.m16133g(list, "<this>");
        return new C8806t0(list);
    }

    /* renamed from: W */
    public static final int m14503W(List list, int i10) {
        if (i10 >= 0 && i10 <= AbstractC8809v.m14773p(list)) {
            return AbstractC8809v.m14773p(list) - i10;
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new C8321f(0, AbstractC8809v.m14773p(list)) + "].");
    }

    /* renamed from: X */
    public static final int m14504X(List list, int i10) {
        return AbstractC8809v.m14773p(list) - i10;
    }

    /* renamed from: Y */
    public static final int m14505Y(List list, int i10) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new C8321f(0, list.size()) + "].");
    }
}
