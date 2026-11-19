package coil3.network.okhttp.internal;

import je.InterfaceC9725e;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p327s.C11017j;
import p327s.InterfaceC11013f;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class CallFactoryNetworkClient implements InterfaceC11013f {

    /* renamed from: a */
    public final InterfaceC9725e.a f3869a;

    public /* synthetic */ CallFactoryNetworkClient(InterfaceC9725e.a aVar) {
        this.f3869a = aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ CallFactoryNetworkClient m3252b(InterfaceC9725e.a aVar) {
        return new CallFactoryNetworkClient(aVar);
    }

    /* renamed from: d */
    public static boolean m3254d(InterfaceC9725e.a aVar, Object obj) {
        return (obj instanceof CallFactoryNetworkClient) && AbstractC9979u.m20289b(aVar, ((CallFactoryNetworkClient) obj).m3259h());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m3255e(je.InterfaceC9725e.a r8, p327s.C11017j r9, p181hd.InterfaceC9544p r10, vc.InterfaceC11588c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.okhttp.internal.CallFactoryNetworkClient.m3255e(je.e$a, s.j, hd.p, vc.c):java.lang.Object");
    }

    /* renamed from: f */
    public static int m3256f(InterfaceC9725e.a aVar) {
        return aVar.hashCode();
    }

    /* renamed from: g */
    public static String m3257g(InterfaceC9725e.a aVar) {
        return "CallFactoryNetworkClient(callFactory=" + aVar + ')';
    }

    @Override // p327s.InterfaceC11013f
    /* renamed from: a */
    public Object mo3258a(C11017j c11017j, InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c) {
        return m3255e(this.f3869a, c11017j, interfaceC9544p, interfaceC11588c);
    }

    public boolean equals(Object obj) {
        return m3254d(this.f3869a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ InterfaceC9725e.a m3259h() {
        return this.f3869a;
    }

    public int hashCode() {
        return m3256f(this.f3869a);
    }

    public String toString() {
        return m3257g(this.f3869a);
    }

    /* renamed from: c */
    public static InterfaceC9725e.a m3253c(InterfaceC9725e.a aVar) {
        return aVar;
    }
}
