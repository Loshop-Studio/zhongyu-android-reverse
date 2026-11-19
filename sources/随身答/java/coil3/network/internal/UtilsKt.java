package coil3.network.internal;

import androidx.documentfile.provider.AbstractC3902a;
import coil3.disk.InterfaceC5325a;
import coil3.network.C5344c;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p257u.C9654l;
import p257u.InterfaceC9655m;

/* loaded from: classes3.dex */
public abstract class UtilsKt {
    /* renamed from: a */
    public static final void m2875a(InterfaceC5325a.b bVar) {
        try {
            bVar.mo2765b();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static final C5344c.a m2876b(C5344c.a aVar, String str) {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, ':', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String string = StringsKt.trim((CharSequence) strSubstring).toString();
        String strSubstring2 = str.substring(iIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        aVar.m2871a(string, strSubstring2);
        return aVar;
    }

    /* renamed from: c */
    public static final void m2877c(AutoCloseable autoCloseable) {
        try {
            AbstractC3902a.m1693a(autoCloseable);
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static final C5344c m2878d(C5344c c5344c, C5344c c5344c2) {
        C5344c.a aVarM2870d = c5344c.m2870d();
        for (Map.Entry entry : c5344c2.m2868b().entrySet()) {
            aVarM2870d.m2874d((String) entry.getKey(), (List) entry.getValue());
        }
        return aVarM2870d.m2872b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2879e(p257u.InterfaceC9655m r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof coil3.network.internal.UtilsKt$readBuffer$1
            if (r0 == 0) goto L13
            r0 = r5
            coil3.network.internal.UtilsKt$readBuffer$1 r0 = (coil3.network.internal.UtilsKt$readBuffer$1) r0
            int r1 = r0.f3085d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3085d = r1
            goto L18
        L13:
            coil3.network.internal.UtilsKt$readBuffer$1 r0 = new coil3.network.internal.UtilsKt$readBuffer$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f3084c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f3085d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f3083b
            okio.Buffer r4 = (okio.Buffer) r4
            java.lang.Object r0 = r0.f3082a
            java.lang.AutoCloseable r0 = (java.lang.AutoCloseable) r0
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L31
            goto L52
        L31:
            r4 = move-exception
            goto L5a
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.ResultKt.throwOnFailure(r5)
            okio.Buffer r5 = new okio.Buffer     // Catch: java.lang.Throwable -> L57
            r5.<init>()     // Catch: java.lang.Throwable -> L57
            r0.f3082a = r4     // Catch: java.lang.Throwable -> L57
            r0.f3083b = r5     // Catch: java.lang.Throwable -> L57
            r0.f3085d = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r0 = r4.mo15999b(r5, r0)     // Catch: java.lang.Throwable -> L57
            if (r0 != r1) goto L50
            return r1
        L50:
            r0 = r4
            r4 = r5
        L52:
            r5 = 0
            kotlin.jdk7.AutoCloseableKt.closeFinally(r0, r5)
            return r4
        L57:
            r5 = move-exception
            r0 = r4
            r4 = r5
        L5a:
            throw r4     // Catch: java.lang.Throwable -> L5b
        L5b:
            r5 = move-exception
            kotlin.jdk7.AutoCloseableKt.closeFinally(r0, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.internal.UtilsKt.m2879e(u.m, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: f */
    public static final InterfaceC9655m m2880f(C9654l c9654l) {
        InterfaceC9655m interfaceC9655mM15994c = c9654l.m15994c();
        if (interfaceC9655mM15994c != null) {
            return interfaceC9655mM15994c;
        }
        throw new IllegalStateException("body == null");
    }
}
