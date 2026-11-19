package com.efs.sdk.p051pa.p052a;

import android.util.Log;
import com.efs.sdk.p051pa.C1358b;
import com.efs.sdk.p051pa.PAMsgListener;
import java.io.BufferedOutputStream;

/* renamed from: com.efs.sdk.pa.a.f */
/* loaded from: classes.dex */
final class C1356f implements InterfaceC1354d {

    /* renamed from: a */
    PAMsgListener f7202a;

    /* renamed from: b */
    boolean f7203b;

    /* renamed from: c */
    String f7204c;

    /* renamed from: d */
    BufferedOutputStream f7205d;

    C1356f() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.efs.sdk.p051pa.C1358b m5602b(java.lang.String r9, long r10, long r12) {
        /*
            java.lang.String r0 = ")"
            java.lang.String r1 = "{"
            java.lang.String r2 = "("
            r3 = 0
            if (r9 != 0) goto La
            return r3
        La:
            com.efs.sdk.pa.b r4 = new com.efs.sdk.pa.b
            r4.<init>()
            java.lang.String r5 = ":"
            int r5 = r9.indexOf(r5)     // Catch: java.lang.Exception -> Lac
            java.lang.String r6 = ""
            r7 = -1
            if (r5 == r7) goto L2b
            int r5 = r5 + 2
            int r8 = r9.length()     // Catch: java.lang.Exception -> Lac
            if (r5 >= r8) goto L2b
            int r8 = r9.length()     // Catch: java.lang.Exception -> Lac
            java.lang.String r5 = r9.substring(r5, r8)     // Catch: java.lang.Exception -> Lac
            goto L2c
        L2b:
            r5 = r6
        L2c:
            r4.f7209a = r5     // Catch: java.lang.Exception -> Lac
            boolean r5 = r9.contains(r2)     // Catch: java.lang.Exception -> Lac
            java.lang.String r8 = "}"
            if (r5 == 0) goto L57
            boolean r5 = r9.contains(r0)     // Catch: java.lang.Exception -> Lac
            if (r5 == 0) goto L57
            int r1 = r9.indexOf(r2)     // Catch: java.lang.Exception -> Lac
            int r0 = r9.indexOf(r0)     // Catch: java.lang.Exception -> Lac
            if (r1 == r7) goto L7e
            if (r0 == r7) goto L7e
            int r1 = r1 + 1
            int r2 = r9.length()     // Catch: java.lang.Exception -> Lac
            if (r1 >= r2) goto L7e
            if (r0 <= r1) goto L7e
            java.lang.String r0 = r9.substring(r1, r0)     // Catch: java.lang.Exception -> Lac
            goto L7f
        L57:
            boolean r0 = r9.contains(r1)     // Catch: java.lang.Exception -> Lac
            if (r0 == 0) goto L7e
            boolean r0 = r9.contains(r8)     // Catch: java.lang.Exception -> Lac
            if (r0 == 0) goto L7e
            int r0 = r9.indexOf(r1)     // Catch: java.lang.Exception -> Lac
            int r1 = r9.indexOf(r8)     // Catch: java.lang.Exception -> Lac
            if (r0 == r7) goto L7e
            if (r1 == r7) goto L7e
            int r0 = r0 + 1
            int r2 = r9.length()     // Catch: java.lang.Exception -> Lac
            if (r0 >= r2) goto L7e
            if (r1 <= r0) goto L7e
            java.lang.String r0 = r9.substring(r0, r1)     // Catch: java.lang.Exception -> Lac
            goto L7f
        L7e:
            r0 = r6
        L7f:
            r4.f7210b = r0     // Catch: java.lang.Exception -> Lac
            java.lang.String r0 = "null"
            boolean r0 = r9.contains(r0)     // Catch: java.lang.Exception -> Lac
            if (r0 != 0) goto La5
            boolean r0 = r9.contains(r8)     // Catch: java.lang.Exception -> Lac
            if (r0 == 0) goto La5
            int r0 = r9.lastIndexOf(r8)     // Catch: java.lang.Exception -> Lac
            if (r0 == r7) goto La5
            int r0 = r0 + 1
            int r1 = r9.length()     // Catch: java.lang.Exception -> Lac
            if (r0 >= r1) goto La5
            int r1 = r9.length()     // Catch: java.lang.Exception -> Lac
            java.lang.String r6 = r9.substring(r0, r1)     // Catch: java.lang.Exception -> Lac
        La5:
            r4.f7211c = r6     // Catch: java.lang.Exception -> Lac
            r4.f7212d = r10
            r4.f7213e = r12
            return r4
        Lac:
            r9 = move-exception
            r9.printStackTrace()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.p051pa.p052a.C1356f.m5602b(java.lang.String, long, long):com.efs.sdk.pa.b");
    }

    @Override // com.efs.sdk.p051pa.p052a.InterfaceC1354d
    /* renamed from: a */
    public final void mo5601a(String str, long j4, long j5) {
        C1358b c1358bM5602b = m5602b(str, j4, j5);
        if (c1358bM5602b != null) {
            if (this.f7203b) {
                Log.e("PerformanceAnalyze", c1358bM5602b.toString());
            }
            if (this.f7204c != null) {
                try {
                    this.f7205d.write((c1358bM5602b.toString() + "\n").getBytes());
                } catch (Exception unused) {
                }
            }
            this.f7202a.msg(c1358bM5602b);
        }
    }
}
