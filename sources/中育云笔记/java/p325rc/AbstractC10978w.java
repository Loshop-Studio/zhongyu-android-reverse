package p325rc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p265nd.C10405j;
import p364uc.AbstractC11382b;

/* renamed from: rc.w */
/* loaded from: classes6.dex */
public abstract class AbstractC10978w extends AbstractC10976v {
    /* renamed from: g */
    public static ArrayList m24129g(Object... elements) {
        AbstractC9979u.m20294g(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(m24130h(elements, true));
    }

    /* renamed from: h */
    public static final Collection m24130h(Object[] objArr, boolean z10) {
        AbstractC9979u.m20294g(objArr, "<this>");
        return new C10956l(objArr, z10);
    }

    /* renamed from: i */
    public static /* synthetic */ Collection m24131i(Object[] objArr, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m24130h(objArr, z10);
    }

    /* renamed from: j */
    public static int m24132j(List list, int i10, int i11, InterfaceC9540l comparison) {
        AbstractC9979u.m20294g(list, "<this>");
        AbstractC9979u.m20294g(comparison, "comparison");
        m24143u(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iIntValue = ((Number) comparison.invoke(list.get(i13))).intValue();
            if (iIntValue < 0) {
                i10 = i13 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* renamed from: k */
    public static final int m24133k(List list, Comparable comparable, int i10, int i11) {
        AbstractC9979u.m20294g(list, "<this>");
        m24143u(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iM25330d = AbstractC11382b.m25330d((Comparable) list.get(i13), comparable);
            if (iM25330d < 0) {
                i10 = i13 + 1;
            } else {
                if (iM25330d <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* renamed from: l */
    public static /* synthetic */ int m24134l(List list, int i10, int i11, InterfaceC9540l interfaceC9540l, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = list.size();
        }
        return m24132j(list, i10, i11, interfaceC9540l);
    }

    /* renamed from: m */
    public static /* synthetic */ int m24135m(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return m24133k(list, comparable, i10, i11);
    }

    /* renamed from: n */
    public static List m24136n() {
        return EmptyList.f23280c;
    }

    /* renamed from: o */
    public static C10405j m24137o(Collection collection) {
        AbstractC9979u.m20294g(collection, "<this>");
        return new C10405j(0, collection.size() - 1);
    }

    /* renamed from: p */
    public static int m24138p(List list) {
        AbstractC9979u.m20294g(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: q */
    public static List m24139q(Object... elements) {
        AbstractC9979u.m20294g(elements, "elements");
        return elements.length > 0 ? AbstractC10964p.m24014g(elements) : m24136n();
    }

    /* renamed from: r */
    public static List m24140r(Object... elements) {
        AbstractC9979u.m20294g(elements, "elements");
        return AbstractC10968r.m24098q0(elements);
    }

    /* renamed from: s */
    public static List m24141s(Object... elements) {
        AbstractC9979u.m20294g(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(m24130h(elements, true));
    }

    /* renamed from: t */
    public static final List m24142t(List list) {
        AbstractC9979u.m20294g(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : AbstractC10976v.m24126e(list.get(0)) : m24136n();
    }

    /* renamed from: u */
    public static final void m24143u(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        }
        if (i12 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
    }

    /* renamed from: v */
    public static void m24144v() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: w */
    public static void m24145w() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
