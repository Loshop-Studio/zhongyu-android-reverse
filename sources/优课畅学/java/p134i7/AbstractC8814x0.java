package p134i7;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: i7.x0 */
/* loaded from: classes5.dex */
public abstract class AbstractC8814x0 extends AbstractC8812w0 {
    /* renamed from: j */
    public static Set m14792j(Set set, Object obj) {
        AbstractC9133u.m16133g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC8798p0.m14663e(set.size()));
        boolean z10 = false;
        for (Object obj2 : set) {
            boolean z11 = true;
            if (!z10 && AbstractC9133u.m16128b(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: k */
    public static Set m14793k(Set set, Iterable elements) {
        int size;
        AbstractC9133u.m16133g(set, "<this>");
        AbstractC9133u.m16133g(elements, "elements");
        Integer numM14787y = AbstractC8811w.m14787y(elements);
        if (numM14787y != null) {
            size = set.size() + numM14787y.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC8798p0.m14663e(size));
        linkedHashSet.addAll(set);
        AbstractC8768a0.m14481C(linkedHashSet, elements);
        return linkedHashSet;
    }

    /* renamed from: l */
    public static Set m14794l(Set set, Object obj) {
        AbstractC9133u.m16133g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC8798p0.m14663e(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
