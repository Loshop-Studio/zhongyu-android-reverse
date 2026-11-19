package coil3.network.okhttp.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p011a9.InterfaceC0042e;
import p249u.C9524j;
import p249u.InterfaceC9520f;

/* loaded from: classes3.dex */
public final class CallFactoryNetworkClient implements InterfaceC9520f {

    /* renamed from: a */
    public final InterfaceC0042e.a f3194a;

    public /* synthetic */ CallFactoryNetworkClient(InterfaceC0042e.a aVar) {
        this.f3194a = aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ CallFactoryNetworkClient m3161b(InterfaceC0042e.a aVar) {
        return new CallFactoryNetworkClient(aVar);
    }

    /* renamed from: d */
    public static boolean m3163d(InterfaceC0042e.a aVar, Object obj) {
        return (obj instanceof CallFactoryNetworkClient) && Intrinsics.areEqual(aVar, ((CallFactoryNetworkClient) obj).m3168h());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m3164e(p011a9.InterfaceC0042e.a r8, p249u.C9524j r9, kotlin.jvm.functions.Function2 r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.okhttp.internal.CallFactoryNetworkClient.m3164e(a9.e$a, u.j, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: f */
    public static int m3165f(InterfaceC0042e.a aVar) {
        return aVar.hashCode();
    }

    /* renamed from: g */
    public static String m3166g(InterfaceC0042e.a aVar) {
        return "CallFactoryNetworkClient(callFactory=" + aVar + ')';
    }

    @Override // p249u.InterfaceC9520f
    /* renamed from: a */
    public Object mo3167a(C9524j c9524j, Function2 function2, Continuation continuation) {
        return m3164e(this.f3194a, c9524j, function2, continuation);
    }

    public boolean equals(Object obj) {
        return m3163d(this.f3194a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ InterfaceC0042e.a m3168h() {
        return this.f3194a;
    }

    public int hashCode() {
        return m3165f(this.f3194a);
    }

    public String toString() {
        return m3166g(this.f3194a);
    }

    /* renamed from: c */
    public static InterfaceC0042e.a m3162c(InterfaceC0042e.a aVar) {
        return aVar;
    }
}
