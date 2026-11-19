package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5830k;
import p185v7.AbstractC6675d;

/* renamed from: kotlin.collections.j0 */
/* loaded from: classes2.dex */
public abstract class AbstractC5795j0 extends AbstractC6675d {
    /* renamed from: v */
    public static EmptySet m5161v() {
        return EmptySet.INSTANCE;
    }

    /* renamed from: w */
    public static LinkedHashSet m5162w(Set set, Object obj) {
        AbstractC5830k.m5330g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC5785e0.m5149C(set.size()));
        boolean z8 = false;
        for (Object obj2 : set) {
            boolean z9 = true;
            if (!z8 && AbstractC5830k.m5325b(obj2, obj)) {
                z8 = true;
                z9 = false;
            }
            if (z9) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: x */
    public static LinkedHashSet m5163x(Set set, Iterable elements) {
        AbstractC5830k.m5330g(set, "<this>");
        AbstractC5830k.m5330g(elements, "elements");
        Integer numValueOf = elements instanceof Collection ? Integer.valueOf(((Collection) elements).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC5785e0.m5149C(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        AbstractC5810y.m5291S(elements, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: y */
    public static LinkedHashSet m5164y(Set set, Object obj) {
        AbstractC5830k.m5330g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC5785e0.m5149C(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
