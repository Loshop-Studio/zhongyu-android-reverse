package p325rc;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: rc.z0 */
/* loaded from: classes6.dex */
public abstract class AbstractC10985z0 extends AbstractC10983y0 {
    /* renamed from: k */
    public static Set m24165k(Set set, Iterable elements) {
        AbstractC9979u.m20294g(set, "<this>");
        AbstractC9979u.m20294g(elements, "elements");
        Collection<?> collectionM23860E = AbstractC10937b0.m23860E(elements);
        if (collectionM23860E.isEmpty()) {
            return AbstractC10947g0.m23929c1(set);
        }
        if (!(collectionM23860E instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionM23860E);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionM23860E).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    /* renamed from: l */
    public static Set m24166l(Set set, Object obj) {
        AbstractC9979u.m20294g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC10967q0.m24038e(set.size()));
        boolean z10 = false;
        for (Object obj2 : set) {
            boolean z11 = true;
            if (!z10 && AbstractC9979u.m20289b(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: m */
    public static Set m24167m(Set set, Iterable elements) {
        int size;
        AbstractC9979u.m20294g(set, "<this>");
        AbstractC9979u.m20294g(elements, "elements");
        Integer numM24154y = AbstractC10980x.m24154y(elements);
        if (numM24154y != null) {
            size = set.size() + numM24154y.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC10967q0.m24038e(size));
        linkedHashSet.addAll(set);
        AbstractC10937b0.m23857B(linkedHashSet, elements);
        return linkedHashSet;
    }

    /* renamed from: n */
    public static Set m24168n(Set set, Object obj) {
        AbstractC9979u.m20294g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC10967q0.m24038e(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
