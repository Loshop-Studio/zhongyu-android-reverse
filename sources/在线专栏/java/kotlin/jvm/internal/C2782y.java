package kotlin.jvm.internal;

import p019c3.InterfaceC1086c;
import p019c3.InterfaceC1087d;
import p019c3.InterfaceC1088e;
import p019c3.InterfaceC1090g;
import p019c3.InterfaceC1093j;

/* renamed from: kotlin.jvm.internal.y */
/* loaded from: classes.dex */
public class C2782y {

    /* renamed from: a */
    private static final C2783z f10738a;

    /* renamed from: b */
    private static final InterfaceC1086c[] f10739b;

    static {
        C2783z c2783z = null;
        try {
            c2783z = (C2783z) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c2783z == null) {
            c2783z = new C2783z();
        }
        f10738a = c2783z;
        f10739b = new InterfaceC1086c[0];
    }

    /* renamed from: a */
    public static InterfaceC1088e m9257a(C2766i c2766i) {
        return f10738a.m9264a(c2766i);
    }

    /* renamed from: b */
    public static InterfaceC1086c m9258b(Class cls) {
        return f10738a.m9265b(cls);
    }

    /* renamed from: c */
    public static InterfaceC1087d m9259c(Class cls) {
        return f10738a.m9266c(cls, "");
    }

    /* renamed from: d */
    public static InterfaceC1090g m9260d(AbstractC2771n abstractC2771n) {
        return f10738a.m9267d(abstractC2771n);
    }

    /* renamed from: e */
    public static InterfaceC1093j m9261e(AbstractC2775r abstractC2775r) {
        return f10738a.m9268e(abstractC2775r);
    }

    /* renamed from: f */
    public static String m9262f(InterfaceC2765h interfaceC2765h) {
        return f10738a.m9269f(interfaceC2765h);
    }

    /* renamed from: g */
    public static String m9263g(AbstractC2770m abstractC2770m) {
        return f10738a.m9270g(abstractC2770m);
    }
}
