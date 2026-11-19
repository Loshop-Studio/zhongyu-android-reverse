package retrofit2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: retrofit2.s */
/* loaded from: classes4.dex */
public final class C6518s {

    /* renamed from: a */
    public final Class f10785a;

    /* renamed from: b */
    public final Object f10786b;

    /* renamed from: c */
    public final Method f10787c;

    /* renamed from: d */
    public final List f10788d;

    public C6518s(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.f10785a = cls;
        this.f10786b = obj;
        this.f10787c = method;
        this.f10788d = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.f10785a.getName(), this.f10787c.getName(), this.f10788d);
    }
}
