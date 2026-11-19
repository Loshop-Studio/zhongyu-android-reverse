package p080j3;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: j3.n */
/* loaded from: classes2.dex */
public final class C3827n {

    /* renamed from: a */
    public final Method f4669a;

    /* renamed from: b */
    public final List f4670b;

    public C3827n(Method method, List list) {
        this.f4669a = method;
        this.f4670b = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public Method m5082a() {
        return this.f4669a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f4669a.getDeclaringClass().getName(), this.f4669a.getName(), this.f4670b);
    }
}
