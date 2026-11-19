package coil3.network.okhttp.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p172l8.InterfaceC8906e;
import p257u.C9652j;
import p257u.InterfaceC9648f;

/* loaded from: classes3.dex */
public final class CallFactoryNetworkClient implements InterfaceC9648f {

    /* renamed from: a */
    public final InterfaceC8906e.a f3086a;

    public /* synthetic */ CallFactoryNetworkClient(InterfaceC8906e.a aVar) {
        this.f3086a = aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ CallFactoryNetworkClient m2881b(InterfaceC8906e.a aVar) {
        return new CallFactoryNetworkClient(aVar);
    }

    /* renamed from: d */
    public static boolean m2883d(InterfaceC8906e.a aVar, Object obj) {
        return (obj instanceof CallFactoryNetworkClient) && Intrinsics.areEqual(aVar, ((CallFactoryNetworkClient) obj).m2888h());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m2884e(p172l8.InterfaceC8906e.a r8, p257u.C9652j r9, kotlin.jvm.functions.Function2 r10, kotlin.coroutines.Continuation r11) {
        /*
            boolean r0 = r11 instanceof coil3.network.okhttp.internal.CallFactoryNetworkClient$executeRequest$1
            if (r0 == 0) goto L13
            r0 = r11
            coil3.network.okhttp.internal.CallFactoryNetworkClient$executeRequest$1 r0 = (coil3.network.okhttp.internal.CallFactoryNetworkClient$executeRequest$1) r0
            int r1 = r0.f3090d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3090d = r1
            goto L18
        L13:
            coil3.network.okhttp.internal.CallFactoryNetworkClient$executeRequest$1 r0 = new coil3.network.okhttp.internal.CallFactoryNetworkClient$executeRequest$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f3089c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f3090d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L53
            if (r2 == r5) goto L46
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r8 = r0.f3087a
            java.io.Closeable r8 = (java.io.Closeable) r8
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L34
            goto L8d
        L34:
            r9 = move-exception
            goto L95
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            java.lang.Object r8 = r0.f3087a
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            kotlin.ResultKt.throwOnFailure(r11)
            goto L77
        L46:
            java.lang.Object r8 = r0.f3088b
            l8.e$a r8 = (p172l8.InterfaceC8906e.a) r8
            java.lang.Object r9 = r0.f3087a
            r10 = r9
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto L63
        L53:
            kotlin.ResultKt.throwOnFailure(r11)
            r0.f3087a = r10
            r0.f3088b = r8
            r0.f3090d = r5
            java.lang.Object r11 = coil3.network.okhttp.internal.UtilsKt.m2890b(r9, r0)
            if (r11 != r1) goto L63
            goto L8b
        L63:
            l8.w r11 = (p172l8.C8924w) r11
            l8.e r8 = r8.mo13868b(r11)
            r0.f3087a = r10
            r0.f3088b = r6
            r0.f3090d = r4
            java.lang.Object r11 = p287x.AbstractC9845a.m16783a(r8, r0)
            if (r11 != r1) goto L76
            goto L8b
        L76:
            r8 = r10
        L77:
            r9 = r11
            java.io.Closeable r9 = (java.io.Closeable) r9
            r10 = r9
            l8.y r10 = (p172l8.C8926y) r10     // Catch: java.lang.Throwable -> L91
            u.l r10 = coil3.network.okhttp.internal.UtilsKt.m2889a(r10)     // Catch: java.lang.Throwable -> L91
            r0.f3087a = r9     // Catch: java.lang.Throwable -> L91
            r0.f3090d = r3     // Catch: java.lang.Throwable -> L91
            java.lang.Object r11 = r8.invoke(r10, r0)     // Catch: java.lang.Throwable -> L91
            if (r11 != r1) goto L8c
        L8b:
            return r1
        L8c:
            r8 = r9
        L8d:
            kotlin.p161io.CloseableKt.closeFinally(r8, r6)
            return r11
        L91:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L95:
            throw r9     // Catch: java.lang.Throwable -> L96
        L96:
            r10 = move-exception
            kotlin.p161io.CloseableKt.closeFinally(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.okhttp.internal.CallFactoryNetworkClient.m2884e(l8.e$a, u.j, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: f */
    public static int m2885f(InterfaceC8906e.a aVar) {
        return aVar.hashCode();
    }

    /* renamed from: g */
    public static String m2886g(InterfaceC8906e.a aVar) {
        return "CallFactoryNetworkClient(callFactory=" + aVar + ')';
    }

    @Override // p257u.InterfaceC9648f
    /* renamed from: a */
    public Object mo2887a(C9652j c9652j, Function2 function2, Continuation continuation) {
        return m2884e(this.f3086a, c9652j, function2, continuation);
    }

    public boolean equals(Object obj) {
        return m2883d(this.f3086a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ InterfaceC8906e.a m2888h() {
        return this.f3086a;
    }

    public int hashCode() {
        return m2885f(this.f3086a);
    }

    public String toString() {
        return m2886g(this.f3086a);
    }

    /* renamed from: c */
    public static InterfaceC8906e.a m2882c(InterfaceC8906e.a aVar) {
        return aVar;
    }
}
