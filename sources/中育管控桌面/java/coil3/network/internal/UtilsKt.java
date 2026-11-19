package coil3.network.internal;

import androidx.documentfile.provider.AbstractC3242a;
import coil3.disk.InterfaceC4571a;
import coil3.network.C4590c;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p159u.C7745l;
import p159u.InterfaceC7746m;

/* loaded from: classes3.dex */
public abstract class UtilsKt {
    /* renamed from: a */
    public static final void m1981a(InterfaceC4571a.b bVar) {
        try {
            bVar.mo1868b();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static final C4590c.a m1982b(C4590c.a aVar, String str) {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, ':', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String string = StringsKt.trim((CharSequence) strSubstring).toString();
        String strSubstring2 = str.substring(iIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        aVar.m1977a(string, strSubstring2);
        return aVar;
    }

    /* renamed from: c */
    public static final void m1983c(AutoCloseable autoCloseable) {
        try {
            AbstractC3242a.m980a(autoCloseable);
        } catch (RuntimeException e6) {
            throw e6;
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static final C4590c m1984d(C4590c c4590c, C4590c c4590c2) {
        C4590c.a aVarM1976d = c4590c.m1976d();
        for (Map.Entry entry : c4590c2.m1974b().entrySet()) {
            aVarM1976d.m1980d((String) entry.getKey(), (List) entry.getValue());
        }
        return aVarM1976d.m1978b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1985e(p159u.InterfaceC7746m r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof coil3.network.internal.UtilsKt$readBuffer$1
            if (r0 == 0) goto L13
            r0 = r5
            coil3.network.internal.UtilsKt$readBuffer$1 r0 = (coil3.network.internal.UtilsKt$readBuffer$1) r0
            int r1 = r0.f1877g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1877g = r1
            goto L18
        L13:
            coil3.network.internal.UtilsKt$readBuffer$1 r0 = new coil3.network.internal.UtilsKt$readBuffer$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f1876f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1877g
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r4 = r0.f1874d
            okio.Buffer r4 = (okio.Buffer) r4
            java.lang.Object r1 = r0.f1873c
            u.m r1 = (p159u.InterfaceC7746m) r1
            java.lang.Object r1 = r0.f1872b
            java.lang.AutoCloseable r1 = (java.lang.AutoCloseable) r1
            java.lang.Object r0 = r0.f1871a
            u.m r0 = (p159u.InterfaceC7746m) r0
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L39
            goto L69
        L39:
            r4 = move-exception
            goto L71
        L3b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L43:
            kotlin.ResultKt.throwOnFailure(r5)
            okio.Buffer r5 = new okio.Buffer     // Catch: java.lang.Throwable -> L6e
            r5.<init>()     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)     // Catch: java.lang.Throwable -> L6e
            r0.f1871a = r2     // Catch: java.lang.Throwable -> L6e
            r0.f1872b = r4     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)     // Catch: java.lang.Throwable -> L6e
            r0.f1873c = r2     // Catch: java.lang.Throwable -> L6e
            r0.f1874d = r5     // Catch: java.lang.Throwable -> L6e
            r2 = 0
            r0.f1875e = r2     // Catch: java.lang.Throwable -> L6e
            r0.f1877g = r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = r4.mo9246b(r5, r0)     // Catch: java.lang.Throwable -> L6e
            if (r0 != r1) goto L67
            return r1
        L67:
            r1 = r4
            r4 = r5
        L69:
            r5 = 0
            kotlin.jdk7.AutoCloseableKt.closeFinally(r1, r5)
            return r4
        L6e:
            r5 = move-exception
            r1 = r4
            r4 = r5
        L71:
            throw r4     // Catch: java.lang.Throwable -> L72
        L72:
            r5 = move-exception
            kotlin.jdk7.AutoCloseableKt.closeFinally(r1, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.internal.UtilsKt.m1985e(u.m, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: f */
    public static final InterfaceC7746m m1986f(C7745l c7745l) {
        InterfaceC7746m interfaceC7746mM9241c = c7745l.m9241c();
        if (interfaceC7746mM9241c != null) {
            return interfaceC7746mM9241c;
        }
        throw new IllegalStateException("body == null");
    }
}
