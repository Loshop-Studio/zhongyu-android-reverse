package coil3.network.okhttp.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p058f5.InterfaceC6363e;
import p159u.C7743j;
import p159u.InterfaceC7739f;

/* loaded from: classes3.dex */
public final class CallFactoryNetworkClient implements InterfaceC7739f {

    /* renamed from: a */
    public final InterfaceC6363e.a f1878a;

    public /* synthetic */ CallFactoryNetworkClient(InterfaceC6363e.a aVar) {
        this.f1878a = aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ CallFactoryNetworkClient m1987b(InterfaceC6363e.a aVar) {
        return new CallFactoryNetworkClient(aVar);
    }

    /* renamed from: d */
    public static boolean m1989d(InterfaceC6363e.a aVar, Object obj) {
        return (obj instanceof CallFactoryNetworkClient) && Intrinsics.areEqual(aVar, ((CallFactoryNetworkClient) obj).m1994h());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m1990e(p058f5.InterfaceC6363e.a r8, p159u.C7743j r9, kotlin.jvm.functions.Function2 r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.okhttp.internal.CallFactoryNetworkClient.m1990e(f5.e$a, u.j, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: f */
    public static int m1991f(InterfaceC6363e.a aVar) {
        return aVar.hashCode();
    }

    /* renamed from: g */
    public static String m1992g(InterfaceC6363e.a aVar) {
        return "CallFactoryNetworkClient(callFactory=" + aVar + ')';
    }

    @Override // p159u.InterfaceC7739f
    /* renamed from: a */
    public Object mo1993a(C7743j c7743j, Function2 function2, Continuation continuation) {
        return m1990e(this.f1878a, c7743j, function2, continuation);
    }

    public boolean equals(Object obj) {
        return m1989d(this.f1878a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ InterfaceC6363e.a m1994h() {
        return this.f1878a;
    }

    public int hashCode() {
        return m1991f(this.f1878a);
    }

    public String toString() {
        return m1992g(this.f1878a);
    }

    /* renamed from: c */
    public static InterfaceC6363e.a m1988c(InterfaceC6363e.a aVar) {
        return aVar;
    }
}
