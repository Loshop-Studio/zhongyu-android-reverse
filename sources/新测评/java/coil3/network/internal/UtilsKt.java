package coil3.network.internal;

import androidx.documentfile.provider.AbstractC3757a;
import coil3.disk.InterfaceC5190a;
import coil3.network.C5209c;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p249u.C9526l;
import p249u.InterfaceC9527m;

/* loaded from: classes3.dex */
public abstract class UtilsKt {
    /* renamed from: a */
    public static final void m3155a(InterfaceC5190a.b bVar) {
        try {
            bVar.mo3040b();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static final C5209c.a m3156b(C5209c.a aVar, String str) {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, ':', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String string = StringsKt.trim((CharSequence) strSubstring).toString();
        String strSubstring2 = str.substring(iIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        aVar.m3151a(string, strSubstring2);
        return aVar;
    }

    /* renamed from: c */
    public static final void m3157c(AutoCloseable autoCloseable) {
        try {
            AbstractC3757a.m1902a(autoCloseable);
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static final C5209c m3158d(C5209c c5209c, C5209c c5209c2) {
        C5209c.a aVarM3150d = c5209c.m3150d();
        for (Map.Entry entry : c5209c2.m3148b().entrySet()) {
            aVarM3150d.m3154d((String) entry.getKey(), (List) entry.getValue());
        }
        return aVarM3150d.m3152b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3159e(p249u.InterfaceC9527m r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof coil3.network.internal.UtilsKt$readBuffer$1
            if (r0 == 0) goto L13
            r0 = r5
            coil3.network.internal.UtilsKt$readBuffer$1 r0 = (coil3.network.internal.UtilsKt$readBuffer$1) r0
            int r1 = r0.f3193g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3193g = r1
            goto L18
        L13:
            coil3.network.internal.UtilsKt$readBuffer$1 r0 = new coil3.network.internal.UtilsKt$readBuffer$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f3192f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f3193g
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r4 = r0.f3190d
            okio.Buffer r4 = (okio.Buffer) r4
            java.lang.Object r1 = r0.f3189c
            u.m r1 = (p249u.InterfaceC9527m) r1
            java.lang.Object r1 = r0.f3188b
            java.lang.AutoCloseable r1 = (java.lang.AutoCloseable) r1
            java.lang.Object r0 = r0.f3187a
            u.m r0 = (p249u.InterfaceC9527m) r0
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
            r0.f3187a = r2     // Catch: java.lang.Throwable -> L6e
            r0.f3188b = r4     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)     // Catch: java.lang.Throwable -> L6e
            r0.f3189c = r2     // Catch: java.lang.Throwable -> L6e
            r0.f3190d = r5     // Catch: java.lang.Throwable -> L6e
            r2 = 0
            r0.f3191e = r2     // Catch: java.lang.Throwable -> L6e
            r0.f3193g = r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = r4.mo15896b(r5, r0)     // Catch: java.lang.Throwable -> L6e
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
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.internal.UtilsKt.m3159e(u.m, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: f */
    public static final InterfaceC9527m m3160f(C9526l c9526l) {
        InterfaceC9527m interfaceC9527mM15891c = c9526l.m15891c();
        if (interfaceC9527mM15891c != null) {
            return interfaceC9527mM15891c;
        }
        throw new IllegalStateException("body == null");
    }
}
