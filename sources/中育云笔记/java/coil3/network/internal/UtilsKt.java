package coil3.network.internal;

import androidx.documentfile.provider.AbstractC3754a;
import coil3.disk.InterfaceC5467a;
import coil3.network.C5486c;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10793c0;
import p327s.C11019l;
import p327s.InterfaceC11020m;

/* loaded from: classes3.dex */
public abstract class UtilsKt {
    /* renamed from: a */
    public static final void m3246a(InterfaceC5467a.b bVar) {
        try {
            bVar.mo3134b();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static final C5486c.a m3247b(C5486c.a aVar, String str) {
        int iM23128e0 = AbstractC10793c0.m23128e0(str, ':', 0, false, 6, null);
        if (iM23128e0 == -1) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String strSubstring = str.substring(0, iM23128e0);
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        String string = AbstractC10793c0.m23129e1(strSubstring).toString();
        String strSubstring2 = str.substring(iM23128e0 + 1);
        AbstractC9979u.m20293f(strSubstring2, "substring(...)");
        aVar.m3242a(string, strSubstring2);
        return aVar;
    }

    /* renamed from: c */
    public static final void m3248c(AutoCloseable autoCloseable) {
        try {
            AbstractC3754a.m1748a(autoCloseable);
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static final C5486c m3249d(C5486c c5486c, C5486c c5486c2) {
        C5486c.a aVarM3241d = c5486c.m3241d();
        for (Map.Entry entry : c5486c2.m3239b().entrySet()) {
            aVarM3241d.m3245d((String) entry.getKey(), (List) entry.getValue());
        }
        return aVarM3241d.m3243b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3250e(p327s.InterfaceC11020m r4, vc.InterfaceC11588c r5) throws java.lang.Exception {
        /*
            boolean r0 = r5 instanceof coil3.network.internal.UtilsKt$readBuffer$1
            if (r0 == 0) goto L13
            r0 = r5
            coil3.network.internal.UtilsKt$readBuffer$1 r0 = (coil3.network.internal.UtilsKt$readBuffer$1) r0
            int r1 = r0.f3868i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3868i = r1
            goto L18
        L13:
            coil3.network.internal.UtilsKt$readBuffer$1 r0 = new coil3.network.internal.UtilsKt$readBuffer$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f3867h
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f3868i
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r4 = r0.f3865f
            okio.Buffer r4 = (okio.Buffer) r4
            java.lang.Object r1 = r0.f3864e
            s.m r1 = (p327s.InterfaceC11020m) r1
            java.lang.Object r1 = r0.f3863d
            java.lang.AutoCloseable r1 = (java.lang.AutoCloseable) r1
            java.lang.Object r0 = r0.f3862c
            s.m r0 = (p327s.InterfaceC11020m) r0
            kotlin.AbstractC9924b.m20071b(r5)     // Catch: java.lang.Throwable -> L39
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
            kotlin.AbstractC9924b.m20071b(r5)
            okio.Buffer r5 = new okio.Buffer     // Catch: java.lang.Throwable -> L6e
            r5.<init>()     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r2 = p409xc.AbstractC11833h.m26224a(r4)     // Catch: java.lang.Throwable -> L6e
            r0.f3862c = r2     // Catch: java.lang.Throwable -> L6e
            r0.f3863d = r4     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r2 = p409xc.AbstractC11833h.m26224a(r4)     // Catch: java.lang.Throwable -> L6e
            r0.f3864e = r2     // Catch: java.lang.Throwable -> L6e
            r0.f3865f = r5     // Catch: java.lang.Throwable -> L6e
            r2 = 0
            r0.f3866g = r2     // Catch: java.lang.Throwable -> L6e
            r0.f3868i = r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = r4.mo24345h(r5, r0)     // Catch: java.lang.Throwable -> L6e
            if (r0 != r1) goto L67
            return r1
        L67:
            r1 = r4
            r4 = r5
        L69:
            r5 = 0
            p152fd.AbstractC9223a.m18142a(r1, r5)
            return r4
        L6e:
            r5 = move-exception
            r1 = r4
            r4 = r5
        L71:
            throw r4     // Catch: java.lang.Throwable -> L72
        L72:
            r5 = move-exception
            p152fd.AbstractC9223a.m18142a(r1, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.internal.UtilsKt.m3250e(s.m, vc.c):java.lang.Object");
    }

    /* renamed from: f */
    public static final InterfaceC11020m m3251f(C11019l c11019l) {
        InterfaceC11020m interfaceC11020mM24339c = c11019l.m24339c();
        if (interfaceC11020mM24339c != null) {
            return interfaceC11020mM24339c;
        }
        throw new IllegalStateException("body == null");
    }
}
