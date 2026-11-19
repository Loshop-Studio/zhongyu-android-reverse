package ca;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: ca.s */
/* loaded from: classes5.dex */
public final class C5302s {

    /* renamed from: a */
    public final Class f2532a;

    /* renamed from: b */
    public final Object f2533b;

    /* renamed from: c */
    public final Method f2534c;

    /* renamed from: d */
    public final List f2535d;

    public C5302s(Class cls, Object obj, Method method, List list) {
        this.f2532a = cls;
        this.f2533b = obj;
        this.f2534c = method;
        this.f2535d = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public Method m2315a() {
        return this.f2534c;
    }

    /* renamed from: b */
    public Class m2316b() {
        return this.f2532a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f2532a.getName(), this.f2534c.getName(), this.f2535d);
    }
}
