package p134i7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.C8321f;
import p168l7.AbstractC9260b;
import p300x7.InterfaceC10570l;

/* renamed from: i7.v */
/* loaded from: classes5.dex */
public abstract class AbstractC8809v extends AbstractC8807u {
    /* renamed from: g */
    public static ArrayList m14764g(Object... elements) {
        AbstractC9133u.m16133g(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(m14765h(elements, true));
    }

    /* renamed from: h */
    public static final Collection m14765h(Object[] objArr, boolean z10) {
        AbstractC9133u.m16133g(objArr, "<this>");
        return new C8789l(objArr, z10);
    }

    /* renamed from: i */
    public static /* synthetic */ Collection m14766i(Object[] objArr, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m14765h(objArr, z10);
    }

    /* renamed from: j */
    public static int m14767j(List list, int i10, int i11, InterfaceC10570l comparison) {
        AbstractC9133u.m16133g(list, "<this>");
        AbstractC9133u.m16133g(comparison, "comparison");
        m14778u(list.size(), i10, i11);
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
    public static final int m14768k(List list, Comparable comparable, int i10, int i11) {
        AbstractC9133u.m16133g(list, "<this>");
        m14778u(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iM16977d = AbstractC9260b.m16977d((Comparable) list.get(i13), comparable);
            if (iM16977d < 0) {
                i10 = i13 + 1;
            } else {
                if (iM16977d <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* renamed from: l */
    public static /* synthetic */ int m14769l(List list, int i10, int i11, InterfaceC10570l interfaceC10570l, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = list.size();
        }
        return m14767j(list, i10, i11, interfaceC10570l);
    }

    /* renamed from: m */
    public static /* synthetic */ int m14770m(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return m14768k(list, comparable, i10, i11);
    }

    /* renamed from: n */
    public static List m14771n() {
        return EmptyList.f17367a;
    }

    /* renamed from: o */
    public static C8321f m14772o(Collection collection) {
        AbstractC9133u.m16133g(collection, "<this>");
        return new C8321f(0, collection.size() - 1);
    }

    /* renamed from: p */
    public static int m14773p(List list) {
        AbstractC9133u.m16133g(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: q */
    public static List m14774q(Object... elements) {
        AbstractC9133u.m16133g(elements, "elements");
        return elements.length > 0 ? AbstractC8797p.m14640g(elements) : m14771n();
    }

    /* renamed from: r */
    public static List m14775r(Object... elements) {
        AbstractC9133u.m16133g(elements, "elements");
        return AbstractC8801r.m14729r0(elements);
    }

    /* renamed from: s */
    public static List m14776s(Object... elements) {
        AbstractC9133u.m16133g(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(m14765h(elements, true));
    }

    /* renamed from: t */
    public static final List m14777t(List list) {
        AbstractC9133u.m16133g(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : AbstractC8807u.m14755e(list.get(0)) : m14771n();
    }

    /* renamed from: u */
    public static final void m14778u(int i10, int i11, int i12) {
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
    public static void m14779v() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: w */
    public static void m14780w() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
