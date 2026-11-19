package kotlin.jvm.internal;

import p019c3.InterfaceC1086c;
import p019c3.InterfaceC1087d;
import p019c3.InterfaceC1088e;
import p019c3.InterfaceC1090g;
import p019c3.InterfaceC1093j;

/* renamed from: kotlin.jvm.internal.z */
/* loaded from: classes.dex */
public class C2783z {
    /* renamed from: a */
    public InterfaceC1088e m9264a(C2766i c2766i) {
        return c2766i;
    }

    /* renamed from: b */
    public InterfaceC1086c m9265b(Class cls) {
        return new C2762e(cls);
    }

    /* renamed from: c */
    public InterfaceC1087d m9266c(Class cls, String str) {
        return new C2774q(cls, str);
    }

    /* renamed from: d */
    public InterfaceC1090g m9267d(AbstractC2771n abstractC2771n) {
        return abstractC2771n;
    }

    /* renamed from: e */
    public InterfaceC1093j m9268e(AbstractC2775r abstractC2775r) {
        return abstractC2775r;
    }

    /* renamed from: f */
    public String m9269f(InterfaceC2765h interfaceC2765h) {
        String string = interfaceC2765h.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* renamed from: g */
    public String m9270g(AbstractC2770m abstractC2770m) {
        return m9269f(abstractC2770m);
    }
}
