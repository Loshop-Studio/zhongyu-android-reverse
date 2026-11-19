package p122df;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: df.s */
/* loaded from: classes6.dex */
public final class C9052s {

    /* renamed from: a */
    public final Class f21141a;

    /* renamed from: b */
    public final Object f21142b;

    /* renamed from: c */
    public final Method f21143c;

    /* renamed from: d */
    public final List f21144d;

    public C9052s(Class cls, Object obj, Method method, List list) {
        this.f21141a = cls;
        this.f21142b = obj;
        this.f21143c = method;
        this.f21144d = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public Method m17773a() {
        return this.f21143c;
    }

    /* renamed from: b */
    public Class m17774b() {
        return this.f21141a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f21141a.getName(), this.f21143c.getName(), this.f21144d);
    }
}
