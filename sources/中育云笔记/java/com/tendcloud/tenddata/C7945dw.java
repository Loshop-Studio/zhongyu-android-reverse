package com.tendcloud.tenddata;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.tendcloud.tenddata.dw */
/* loaded from: classes5.dex */
public final class C7945dw {

    /* renamed from: a */
    public static CountDownLatch f14801a = new CountDownLatch(1);

    /* renamed from: com.tendcloud.tenddata.dw$a */
    public static class a {
        private static C7945dw instance = new C7945dw();

        private a() {
        }
    }

    /* renamed from: a */
    private void m11817a(final Context context) {
        if (context == null) {
            return;
        }
        try {
            C7910co.f14599a.execute(new Runnable() { // from class: com.tendcloud.tenddata.dw.1
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024 A[Catch: all -> 0x00bc, TRY_ENTER, TryCatch #1 {all -> 0x00bc, blocks: (B:2:0x0000, B:4:0x0006, B:8:0x0024, B:10:0x002a, B:11:0x0031, B:13:0x0039, B:14:0x0040, B:16:0x0048, B:17:0x004f, B:19:0x0057, B:20:0x005d, B:22:0x0065, B:23:0x006b, B:25:0x0071, B:26:0x0077, B:28:0x007f, B:29:0x0085, B:31:0x008d, B:32:0x0093, B:34:0x009b, B:35:0x00a1, B:37:0x00a9, B:38:0x00af, B:40:0x00b7), top: B:47:0x0000 }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        r4 = this;
                        boolean r0 = com.tendcloud.tenddata.C7968es.m11909a()     // Catch: java.lang.Throwable -> Lbc
                        if (r0 == 0) goto L24
                        android.content.Context r0 = r2     // Catch: java.lang.Throwable -> Lbc
                        com.tendcloud.tenddata.C7968es.reflectMSA(r0)     // Catch: java.lang.Throwable -> Lbc
                        java.util.concurrent.CountDownLatch r0 = com.tendcloud.tenddata.C7945dw.f14801a     // Catch: java.lang.Throwable -> L24
                        java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L24
                        r2 = 2
                        r0.await(r2, r1)     // Catch: java.lang.Throwable -> L24
                        com.tendcloud.tenddata.fr r0 = com.tendcloud.tenddata.C7994fr.m11998a()     // Catch: java.lang.Throwable -> L24
                        java.lang.String r0 = r0.m11999c()     // Catch: java.lang.Throwable -> L24
                        boolean r0 = com.tendcloud.tenddata.C7912cq.m11608b(r0)     // Catch: java.lang.Throwable -> L24
                        if (r0 != 0) goto L24
                        goto Lbc
                    L24:
                        boolean r0 = com.tendcloud.tenddata.C7974ey.m11925a()     // Catch: java.lang.Throwable -> Lbc
                        if (r0 == 0) goto L31
                        android.content.Context r0 = r2     // Catch: java.lang.Throwable -> Lbc
                        com.tendcloud.tenddata.C7974ey.reflectMiUi(r0)     // Catch: java.lang.Throwable -> Lbc
                        goto Lbc
                    L31:
                        android.content.Context r0 = r2     // Catch: java.lang.Throwable -> Lbc
                        boolean r0 = com.tendcloud.tenddata.C7965ep.m11900a(r0)     // Catch: java.lang.Throwable -> Lbc
                        if (r0 == 0) goto L40
                        android.content.Context r0 = r2     // Catch: java.lang.Throwable -> Lbc
                        com.tendcloud.tenddata.C7965ep.bindHWServiceGetOAID(r0)     // Catch: java.lang.Throwable -> Lbc
                        goto Lbc
                    L40:
                        android.content.Context r0 = r2     // Catch: java.lang.Throwable -> Lbc
                        boolean r0 = com.tendcloud.tenddata.C7972ew.m11920a(r0)     // Catch: java.lang.Throwable -> Lbc
                        if (r0 == 0) goto L4f
                        android.content.Context r0 = r2     // Catch: java.lang.Throwable -> Lbc
                        com.tendcloud.tenddata.C7972ew.bindSECServiceGetOAID(r0)     // Catch: java.lang.Throwable -> Lbc
                        goto Lbc
                    L4f:
                        android.content.Context r0 = r2     // Catch: java.lang.Throwable -> Lbc
                        boolean r0 = com.tendcloud.tenddata.C7971ev.m11917a(r0)     // Catch: java.lang.Throwable -> Lbc
                        if (r0 == 0) goto L5d
                        android.content.Context r0 = r2     // Catch: java.lang.Throwable -> Lbc
                        com.tendcloud.tenddata.C7971ev.bindOPPOServiceGetOAID(r0)     // Catch: java.lang.Throwable -> Lbc
                        goto Lbc
                    L5d:
                        android.content.Context r0 = r2     // Catch: java.lang.Throwable -> Lbc
                        boolean r0 = com.tendcloud.tenddata.C7970eu.m11913a(r0)     // Catch: java.lang.Throwable -> Lbc
                        if (r0 == 0) goto L6b
                        android.content.Context r0 = r2     // Catch: java.lang.Throwable -> Lbc
                        com.tendcloud.tenddata.C7970eu.bindONEPLUSServiceGetOAID(r0)     // Catch: java.lang.Throwable -> Lbc
                        goto Lbc
                    L6b:
                        boolean r0 = com.tendcloud.tenddata.C7973ex.m11924a()     // Catch: java.lang.Throwable -> Lbc
                        if (r0 == 0) goto L77
                        android.content.Context r0 = r2     // Catch: java.lang.Throwable -> Lbc
                        com.tendcloud.tenddata.C7973ex.reflectVIVO(r0)     // Catch: java.lang.Throwable -> Lbc
                        goto Lbc
                    L77:
                        android.content.Context r0 = r2     // Catch: java.lang.Throwable -> Lbc
                        boolean r0 = com.tendcloud.tenddata.C7964eo.m11897a(r0)     // Catch: java.lang.Throwable -> Lbc
                        if (r0 == 0) goto L85
                        android.content.Context r0 = r2     // Catch: java.lang.Throwable -> Lbc
                        com.tendcloud.tenddata.C7964eo.bindASUSServiceGetOAID(r0)     // Catch: java.lang.Throwable -> Lbc
                        goto Lbc
                    L85:
                        android.content.Context r0 = r2     // Catch: java.lang.Throwable -> Lbc
                        boolean r0 = com.tendcloud.tenddata.C7967er.m11908a(r0)     // Catch: java.lang.Throwable -> Lbc
                        if (r0 == 0) goto L93
                        android.content.Context r0 = r2     // Catch: java.lang.Throwable -> Lbc
                        com.tendcloud.tenddata.C7967er.reflectMEiZU(r0)     // Catch: java.lang.Throwable -> Lbc
                        goto Lbc
                    L93:
                        android.content.Context r0 = r2     // Catch: java.lang.Throwable -> Lbc
                        boolean r0 = com.tendcloud.tenddata.C7975ez.m11928a(r0)     // Catch: java.lang.Throwable -> Lbc
                        if (r0 == 0) goto La1
                        android.content.Context r0 = r2     // Catch: java.lang.Throwable -> Lbc
                        com.tendcloud.tenddata.C7975ez.bindZTEServiceGetOAID(r0)     // Catch: java.lang.Throwable -> Lbc
                        goto Lbc
                    La1:
                        android.content.Context r0 = r2     // Catch: java.lang.Throwable -> Lbc
                        boolean r0 = com.tendcloud.tenddata.C7966eq.m11906a(r0)     // Catch: java.lang.Throwable -> Lbc
                        if (r0 == 0) goto Laf
                        android.content.Context r0 = r2     // Catch: java.lang.Throwable -> Lbc
                        com.tendcloud.tenddata.C7966eq.bindLENOVOServiceGetOAID(r0)     // Catch: java.lang.Throwable -> Lbc
                        goto Lbc
                    Laf:
                        android.content.Context r0 = r2     // Catch: java.lang.Throwable -> Lbc
                        boolean r0 = com.tendcloud.tenddata.C7969et.m11910a(r0)     // Catch: java.lang.Throwable -> Lbc
                        if (r0 == 0) goto Lbc
                        android.content.Context r0 = r2     // Catch: java.lang.Throwable -> Lbc
                        com.tendcloud.tenddata.C7969et.reflectNUBIA(r0)     // Catch: java.lang.Throwable -> Lbc
                    Lbc:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.C7945dw.AnonymousClass1.run():void");
                }
            });
        } catch (Throwable unused) {
        }
    }

    private C7945dw() {
        m11817a(C7843ab.f14307g);
    }

    /* renamed from: a */
    public static C7945dw m11816a() {
        return a.instance;
    }
}
