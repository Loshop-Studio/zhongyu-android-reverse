package p325rc;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: rc.y0 */
/* loaded from: classes6.dex */
public abstract class AbstractC10983y0 extends AbstractC10981x0 {
    /* renamed from: f */
    public static Set m24160f() {
        return EmptySet.f23282c;
    }

    /* renamed from: g */
    public static LinkedHashSet m24161g(Object... elements) {
        AbstractC9979u.m20294g(elements, "elements");
        return (LinkedHashSet) AbstractC10968r.m24087k1(elements, new LinkedHashSet(AbstractC10967q0.m24038e(elements.length)));
    }

    /* renamed from: h */
    public static Set m24162h(Object... elements) {
        AbstractC9979u.m20294g(elements, "elements");
        return (Set) AbstractC10968r.m24087k1(elements, new LinkedHashSet(AbstractC10967q0.m24038e(elements.length)));
    }

    /* renamed from: i */
    public static final Set m24163i(Set set) {
        AbstractC9979u.m20294g(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : AbstractC10981x0.m24158d(set.iterator().next()) : m24160f();
    }

    /* renamed from: j */
    public static Set m24164j(Object... elements) {
        AbstractC9979u.m20294g(elements, "elements");
        return AbstractC10968r.m24115y1(elements);
    }
}
