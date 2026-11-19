package p134i7;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: i7.v0 */
/* loaded from: classes5.dex */
public abstract class AbstractC8810v0 {
    /* renamed from: a */
    public static Set m14781a(Set builder) {
        AbstractC9133u.m16133g(builder, "builder");
        return ((SetBuilder) builder).m16056a();
    }

    /* renamed from: b */
    public static Set m14782b() {
        return new SetBuilder();
    }

    /* renamed from: c */
    public static Set m14783c(int i10) {
        return new SetBuilder(i10);
    }

    /* renamed from: d */
    public static Set m14784d(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        AbstractC9133u.m16132f(setSingleton, "singleton(...)");
        return setSingleton;
    }

    /* renamed from: e */
    public static TreeSet m14785e(Object... elements) {
        AbstractC9133u.m16133g(elements, "elements");
        return (TreeSet) AbstractC8801r.m14726p1(elements, new TreeSet());
    }
}
