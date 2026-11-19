package kotlin.jvm.internal;

import p089e8.InterfaceC8375c;
import p089e8.InterfaceC8378f;
import p089e8.InterfaceC8379g;
import p089e8.InterfaceC8381i;
import p089e8.InterfaceC8382j;
import p089e8.InterfaceC8384l;
import p089e8.InterfaceC8385m;
import p089e8.InterfaceC8386n;

/* renamed from: kotlin.jvm.internal.y */
/* loaded from: classes5.dex */
public abstract class AbstractC9137y {

    /* renamed from: a */
    public static final C9138z f17500a;

    /* renamed from: b */
    public static final InterfaceC8375c[] f17501b;

    static {
        C9138z c9138z = null;
        try {
            c9138z = (C9138z) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c9138z == null) {
            c9138z = new C9138z();
        }
        f17500a = c9138z;
        f17501b = new InterfaceC8375c[0];
    }

    /* renamed from: a */
    public static InterfaceC8379g m16153a(FunctionReference functionReference) {
        return f17500a.m16163a(functionReference);
    }

    /* renamed from: b */
    public static InterfaceC8375c m16154b(Class cls) {
        return f17500a.m16164b(cls);
    }

    /* renamed from: c */
    public static InterfaceC8378f m16155c(Class cls) {
        return f17500a.m16165c(cls, "");
    }

    /* renamed from: d */
    public static InterfaceC8381i m16156d(MutablePropertyReference0 mutablePropertyReference0) {
        return f17500a.m16166d(mutablePropertyReference0);
    }

    /* renamed from: e */
    public static InterfaceC8382j m16157e(MutablePropertyReference1 mutablePropertyReference1) {
        return f17500a.m16167e(mutablePropertyReference1);
    }

    /* renamed from: f */
    public static InterfaceC8384l m16158f(PropertyReference0 propertyReference0) {
        return f17500a.m16168f(propertyReference0);
    }

    /* renamed from: g */
    public static InterfaceC8385m m16159g(PropertyReference1 propertyReference1) {
        return f17500a.m16169g(propertyReference1);
    }

    /* renamed from: h */
    public static InterfaceC8386n m16160h(PropertyReference2 propertyReference2) {
        return f17500a.m16170h(propertyReference2);
    }

    /* renamed from: i */
    public static String m16161i(InterfaceC9130r interfaceC9130r) {
        return f17500a.m16171i(interfaceC9130r);
    }

    /* renamed from: j */
    public static String m16162j(Lambda lambda) {
        return f17500a.m16172j(lambda);
    }
}
