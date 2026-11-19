package p325rc;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC9962d0;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p296pd.AbstractC10669q;
import p296pd.InterfaceC10659g;

/* renamed from: rc.b0 */
/* loaded from: classes6.dex */
public abstract class AbstractC10937b0 extends AbstractC10935a0 {
    /* renamed from: B */
    public static boolean m23857B(Collection collection, Iterable elements) {
        AbstractC9979u.m20294g(collection, "<this>");
        AbstractC9979u.m20294g(elements, "elements");
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

    /* renamed from: C */
    public static boolean m23858C(Collection collection, InterfaceC10659g elements) {
        AbstractC9979u.m20294g(collection, "<this>");
        AbstractC9979u.m20294g(elements, "elements");
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
    public static boolean m23859D(Collection collection, Object[] elements) {
        AbstractC9979u.m20294g(collection, "<this>");
        AbstractC9979u.m20294g(elements, "elements");
        return collection.addAll(AbstractC10964p.m24014g(elements));
    }

    /* renamed from: E */
    public static final Collection m23860E(Iterable iterable) {
        AbstractC9979u.m20294g(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : AbstractC10947g0.m23922X0(iterable);
    }

    /* renamed from: F */
    public static final boolean m23861F(Iterable iterable, InterfaceC9540l interfaceC9540l, boolean z10) {
        Iterator it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (((Boolean) interfaceC9540l.invoke(it.next())).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    /* renamed from: G */
    public static final boolean m23862G(List list, InterfaceC9540l interfaceC9540l, boolean z10) {
        int i10;
        if (!(list instanceof RandomAccess)) {
            AbstractC9979u.m20292e(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return m23861F(AbstractC9962d0.m20251b(list), interfaceC9540l, z10);
        }
        int iM24138p = AbstractC10978w.m24138p(list);
        if (iM24138p >= 0) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                Object obj = list.get(i11);
                if (((Boolean) interfaceC9540l.invoke(obj)).booleanValue() != z10) {
                    if (i10 != i11) {
                        list.set(i10, obj);
                    }
                    i10++;
                }
                if (i11 == iM24138p) {
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
        int iM24138p2 = AbstractC10978w.m24138p(list);
        if (i10 > iM24138p2) {
            return true;
        }
        while (true) {
            list.remove(iM24138p2);
            if (iM24138p2 == i10) {
                return true;
            }
            iM24138p2--;
        }
    }

    /* renamed from: H */
    public static boolean m23863H(Iterable iterable, InterfaceC9540l predicate) {
        AbstractC9979u.m20294g(iterable, "<this>");
        AbstractC9979u.m20294g(predicate, "predicate");
        return m23861F(iterable, predicate, true);
    }

    /* renamed from: I */
    public static boolean m23864I(Collection collection, Iterable elements) {
        AbstractC9979u.m20294g(collection, "<this>");
        AbstractC9979u.m20294g(elements, "elements");
        return collection.removeAll(m23860E(elements));
    }

    /* renamed from: J */
    public static boolean m23865J(Collection collection, InterfaceC10659g elements) {
        AbstractC9979u.m20294g(collection, "<this>");
        AbstractC9979u.m20294g(elements, "elements");
        List listM22574F = AbstractC10669q.m22574F(elements);
        return !listM22574F.isEmpty() && collection.removeAll(listM22574F);
    }

    /* renamed from: K */
    public static boolean m23866K(Collection collection, Object[] elements) {
        AbstractC9979u.m20294g(collection, "<this>");
        AbstractC9979u.m20294g(elements, "elements");
        return !(elements.length == 0) && collection.removeAll(AbstractC10964p.m24014g(elements));
    }

    /* renamed from: L */
    public static boolean m23867L(List list, InterfaceC9540l predicate) {
        AbstractC9979u.m20294g(list, "<this>");
        AbstractC9979u.m20294g(predicate, "predicate");
        return m23862G(list, predicate, true);
    }

    /* renamed from: M */
    public static Object m23868M(List list) {
        AbstractC9979u.m20294g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    /* renamed from: N */
    public static Object m23869N(List list) {
        AbstractC9979u.m20294g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    /* renamed from: O */
    public static Object m23870O(List list) {
        AbstractC9979u.m20294g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(AbstractC10978w.m24138p(list));
    }

    /* renamed from: P */
    public static Object m23871P(List list) {
        AbstractC9979u.m20294g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(AbstractC10978w.m24138p(list));
    }

    /* renamed from: Q */
    public static boolean m23872Q(Iterable iterable, InterfaceC9540l predicate) {
        AbstractC9979u.m20294g(iterable, "<this>");
        AbstractC9979u.m20294g(predicate, "predicate");
        return m23861F(iterable, predicate, false);
    }

    /* renamed from: R */
    public static boolean m23873R(Collection collection, Iterable elements) {
        AbstractC9979u.m20294g(collection, "<this>");
        AbstractC9979u.m20294g(elements, "elements");
        return collection.retainAll(m23860E(elements));
    }
}
