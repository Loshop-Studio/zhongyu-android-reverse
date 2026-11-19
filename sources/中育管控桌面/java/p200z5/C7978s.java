package p200z5;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: z5.s */
/* loaded from: classes4.dex */
public final class C7978s {

    /* renamed from: a */
    public final Class f10793a;

    /* renamed from: b */
    public final Object f10794b;

    /* renamed from: c */
    public final Method f10795c;

    /* renamed from: d */
    public final List f10796d;

    public C7978s(Class cls, Object obj, Method method, List list) {
        this.f10793a = cls;
        this.f10794b = obj;
        this.f10795c = method;
        this.f10796d = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public Method m9855a() {
        return this.f10795c;
    }

    /* renamed from: b */
    public Class m9856b() {
        return this.f10793a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f10793a.getName(), this.f10795c.getName(), this.f10796d);
    }
}
