package p226r9;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: r9.s */
/* loaded from: classes5.dex */
public final class C9078s {

    /* renamed from: a */
    public final Class f15638a;

    /* renamed from: b */
    public final Object f15639b;

    /* renamed from: c */
    public final Method f15640c;

    /* renamed from: d */
    public final List f15641d;

    public C9078s(Class cls, Object obj, Method method, List list) {
        this.f15638a = cls;
        this.f15639b = obj;
        this.f15640c = method;
        this.f15641d = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public Method m15313a() {
        return this.f15640c;
    }

    /* renamed from: b */
    public Class m15314b() {
        return this.f15638a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f15638a.getName(), this.f15640c.getName(), this.f15641d);
    }
}
