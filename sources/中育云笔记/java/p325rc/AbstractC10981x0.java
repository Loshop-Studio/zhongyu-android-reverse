package p325rc;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: rc.x0 */
/* loaded from: classes6.dex */
public abstract class AbstractC10981x0 {
    /* renamed from: a */
    public static Set m24155a(Set builder) {
        AbstractC9979u.m20294g(builder, "builder");
        return ((SetBuilder) builder).m20201a();
    }

    /* renamed from: b */
    public static Set m24156b() {
        return new SetBuilder();
    }

    /* renamed from: c */
    public static Set m24157c(int i10) {
        return new SetBuilder(i10);
    }

    /* renamed from: d */
    public static Set m24158d(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        AbstractC9979u.m20293f(setSingleton, "singleton(...)");
        return setSingleton;
    }

    /* renamed from: e */
    public static TreeSet m24159e(Object... elements) {
        AbstractC9979u.m20294g(elements, "elements");
        return (TreeSet) AbstractC10968r.m24087k1(elements, new TreeSet());
    }
}
