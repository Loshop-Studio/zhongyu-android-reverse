package kotlin.jvm.internal;

import java.util.Collections;
import java.util.List;

/* renamed from: kotlin.jvm.internal.m */
/* loaded from: classes2.dex */
public abstract class AbstractC5832m {

    /* renamed from: a */
    public static final C5833n f9223a;

    static {
        C5833n c5833n = null;
        try {
            c5833n = (C5833n) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c5833n == null) {
            c5833n = new C5833n();
        }
        f9223a = c5833n;
    }

    /* renamed from: a */
    public static C5823d m5340a(Class cls) {
        f9223a.getClass();
        return new C5823d(cls);
    }

    /* renamed from: b */
    public static C5837r m5341b(Class cls) {
        C5823d c5823dM5340a = m5340a(cls);
        List list = Collections.EMPTY_LIST;
        f9223a.getClass();
        return new C5837r(c5823dM5340a, list);
    }
}
