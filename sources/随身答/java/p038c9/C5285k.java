package p038c9;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: c9.k */
/* loaded from: classes5.dex */
public final class C5285k {

    /* renamed from: a */
    public final Method f2560a;

    /* renamed from: b */
    public final List f2561b;

    public C5285k(Method method, List list) {
        this.f2560a = method;
        this.f2561b = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public Method m2458a() {
        return this.f2560a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f2560a.getDeclaringClass().getName(), this.f2560a.getName(), this.f2561b);
    }
}
