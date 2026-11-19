package p134i7;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC9116d0;
import kotlin.jvm.internal.AbstractC9133u;
import p101f8.AbstractC8479q;
import p101f8.InterfaceC8469g;
import p300x7.InterfaceC10570l;

/* renamed from: i7.a0 */
/* loaded from: classes5.dex */
public abstract class AbstractC8768a0 extends AbstractC8816z {
    /* renamed from: B */
    public static boolean m14480B(Collection collection, InterfaceC8469g elements) {
        AbstractC9133u.m16133g(collection, "<this>");
        AbstractC9133u.m16133g(elements, "elements");
        Iterator it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: C */
    public static boolean m14481C(Collection collection, Iterable elements) {
        AbstractC9133u.m16133g(collection, "<this>");
        AbstractC9133u.m16133g(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: D */
    public static boolean m14482D(Collection collection, Object[] elements) {
        AbstractC9133u.m16133g(collection, "<this>");
        AbstractC9133u.m16133g(elements, "elements");
        return collection.addAll(AbstractC8797p.m14640g(elements));
    }

    /* renamed from: E */
    public static final Collection m14483E(Iterable iterable) {
        AbstractC9133u.m16133g(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : AbstractC8778f0.m14544U0(iterable);
    }

    /* renamed from: F */
    public static final boolean m14484F(Iterable iterable, InterfaceC10570l interfaceC10570l, boolean z10) {
        Iterator it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (((Boolean) interfaceC10570l.invoke(it.next())).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    /* renamed from: G */
    public static final boolean m14485G(List list, InterfaceC10570l interfaceC10570l, boolean z10) {
        int i10;
        if (!(list instanceof RandomAccess)) {
            AbstractC9133u.m16131e(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return m14484F(AbstractC9116d0.m16093b(list), interfaceC10570l, z10);
        }
        int iM14773p = AbstractC8809v.m14773p(list);
        if (iM14773p >= 0) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                Object obj = list.get(i11);
                if (((Boolean) interfaceC10570l.invoke(obj)).booleanValue() != z10) {
                    if (i10 != i11) {
                        list.set(i10, obj);
                    }
                    i10++;
                }
                if (i11 == iM14773p) {
                    break;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        if (i10 >= list.size()) {
            return false;
        }
        int iM14773p2 = AbstractC8809v.m14773p(list);
        if (i10 > iM14773p2) {
            return true;
        }
        while (true) {
            list.remove(iM14773p2);
            if (iM14773p2 == i10) {
                return true;
            }
            iM14773p2--;
        }
    }

    /* renamed from: H */
    public static boolean m14486H(Iterable iterable, InterfaceC10570l predicate) {
        AbstractC9133u.m16133g(iterable, "<this>");
        AbstractC9133u.m16133g(predicate, "predicate");
        return m14484F(iterable, predicate, true);
    }

    /* renamed from: I */
    public static boolean m14487I(Collection collection, InterfaceC8469g elements) {
        AbstractC9133u.m16133g(collection, "<this>");
        AbstractC9133u.m16133g(elements, "elements");
        List listM13843F = AbstractC8479q.m13843F(elements);
        return !listM13843F.isEmpty() && collection.removeAll(listM13843F);
    }

    /* renamed from: J */
    public static boolean m14488J(Collection collection, Iterable elements) {
        AbstractC9133u.m16133g(collection, "<this>");
        AbstractC9133u.m16133g(elements, "elements");
        return collection.removeAll(m14483E(elements));
    }

    /* renamed from: K */
    public static boolean m14489K(Collection collection, Object[] elements) {
        AbstractC9133u.m16133g(collection, "<this>");
        AbstractC9133u.m16133g(elements, "elements");
        return !(elements.length == 0) && collection.removeAll(AbstractC8797p.m14640g(elements));
    }

    /* renamed from: L */
    public static boolean m14490L(List list, InterfaceC10570l predicate) {
        AbstractC9133u.m16133g(list, "<this>");
        AbstractC9133u.m16133g(predicate, "predicate");
        return m14485G(list, predicate, true);
    }

    /* renamed from: M */
    public static Object m14491M(List list) {
        AbstractC9133u.m16133g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    /* renamed from: N */
    public static Object m14492N(List list) {
        AbstractC9133u.m16133g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    /* renamed from: O */
    public static Object m14493O(List list) {
        AbstractC9133u.m16133g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(AbstractC8809v.m14773p(list));
    }

    /* renamed from: P */
    public static Object m14494P(List list) {
        AbstractC9133u.m16133g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(AbstractC8809v.m14773p(list));
    }

    /* renamed from: Q */
    public static boolean m14495Q(Iterable iterable, InterfaceC10570l predicate) {
        AbstractC9133u.m16133g(iterable, "<this>");
        AbstractC9133u.m16133g(predicate, "predicate");
        return m14484F(iterable, predicate, false);
    }

    /* renamed from: R */
    public static boolean m14496R(Collection collection, Iterable elements) {
        AbstractC9133u.m16133g(collection, "<this>");
        AbstractC9133u.m16133g(elements, "elements");
        return collection.retainAll(m14483E(elements));
    }
}
