package kotlin.jvm.internal;

import p280od.InterfaceC10469c;
import p280od.InterfaceC10472f;
import p280od.InterfaceC10473g;
import p280od.InterfaceC10475i;
import p280od.InterfaceC10476j;
import p280od.InterfaceC10479m;
import p280od.InterfaceC10480n;

/* renamed from: kotlin.jvm.internal.y */
/* loaded from: classes6.dex */
public abstract class AbstractC9983y {

    /* renamed from: a */
    public static final C9984z f23429a;

    /* renamed from: b */
    public static final InterfaceC10469c[] f23430b;

    static {
        C9984z c9984z = null;
        try {
            c9984z = (C9984z) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c9984z == null) {
            c9984z = new C9984z();
        }
        f23429a = c9984z;
        f23430b = new InterfaceC10469c[0];
    }

    /* renamed from: a */
    public static InterfaceC10473g m20314a(FunctionReference functionReference) {
        return f23429a.m20323a(functionReference);
    }

    /* renamed from: b */
    public static InterfaceC10469c m20315b(Class cls) {
        return f23429a.m20324b(cls);
    }

    /* renamed from: c */
    public static InterfaceC10472f m20316c(Class cls) {
        return f23429a.m20325c(cls, "");
    }

    /* renamed from: d */
    public static InterfaceC10475i m20317d(MutablePropertyReference0 mutablePropertyReference0) {
        return f23429a.m20326d(mutablePropertyReference0);
    }

    /* renamed from: e */
    public static InterfaceC10476j m20318e(MutablePropertyReference1 mutablePropertyReference1) {
        return f23429a.m20327e(mutablePropertyReference1);
    }

    /* renamed from: f */
    public static InterfaceC10479m m20319f(PropertyReference0 propertyReference0) {
        return f23429a.m20328f(propertyReference0);
    }

    /* renamed from: g */
    public static InterfaceC10480n m20320g(PropertyReference1 propertyReference1) {
        return f23429a.m20329g(propertyReference1);
    }

    /* renamed from: h */
    public static String m20321h(InterfaceC9976r interfaceC9976r) {
        return f23429a.m20330h(interfaceC9976r);
    }

    /* renamed from: i */
    public static String m20322i(Lambda lambda) {
        return f23429a.m20331i(lambda);
    }
}
