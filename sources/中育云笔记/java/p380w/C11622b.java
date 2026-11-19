package p380w;

import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.InterfaceC10045g;

/* renamed from: w.b */
/* loaded from: classes3.dex */
public final class C11622b implements InterfaceC11635o {

    /* renamed from: c */
    public final InterfaceC10045g f27525c;

    public /* synthetic */ C11622b(InterfaceC10045g interfaceC10045g) {
        this.f27525c = interfaceC10045g;
    }

    /* renamed from: d */
    public static final /* synthetic */ C11622b m25635d(InterfaceC10045g interfaceC10045g) {
        return new C11622b(interfaceC10045g);
    }

    /* renamed from: f */
    public static boolean m25637f(InterfaceC10045g interfaceC10045g, Object obj) {
        return (obj instanceof C11622b) && AbstractC9979u.m20289b(interfaceC10045g, ((C11622b) obj).m25640i());
    }

    /* renamed from: g */
    public static int m25638g(InterfaceC10045g interfaceC10045g) {
        return interfaceC10045g.hashCode();
    }

    /* renamed from: h */
    public static String m25639h(InterfaceC10045g interfaceC10045g) {
        return "BaseRequestDelegate(job=" + interfaceC10045g + ')';
    }

    public boolean equals(Object obj) {
        return m25637f(this.f27525c, obj);
    }

    public int hashCode() {
        return m25638g(this.f27525c);
    }

    /* renamed from: i */
    public final /* synthetic */ InterfaceC10045g m25640i() {
        return this.f27525c;
    }

    public String toString() {
        return m25639h(this.f27525c);
    }

    /* renamed from: e */
    public static InterfaceC10045g m25636e(InterfaceC10045g interfaceC10045g) {
        return interfaceC10045g;
    }
}
