package p134i7;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: i7.w0 */
/* loaded from: classes5.dex */
public abstract class AbstractC8812w0 extends AbstractC8810v0 {
    /* renamed from: f */
    public static Set m14788f() {
        return EmptySet.f17369a;
    }

    /* renamed from: g */
    public static Set m14789g(Object... elements) {
        AbstractC9133u.m16133g(elements, "elements");
        return (Set) AbstractC8801r.m14726p1(elements, new LinkedHashSet(AbstractC8798p0.m14663e(elements.length)));
    }

    /* renamed from: h */
    public static final Set m14790h(Set set) {
        AbstractC9133u.m16133g(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : AbstractC8810v0.m14784d(set.iterator().next()) : m14788f();
    }

    /* renamed from: i */
    public static Set m14791i(Object... elements) {
        AbstractC9133u.m16133g(elements, "elements");
        return AbstractC8801r.m14673D1(elements);
    }
}
