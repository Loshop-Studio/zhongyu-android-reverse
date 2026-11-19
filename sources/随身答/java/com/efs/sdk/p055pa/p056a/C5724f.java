package com.efs.sdk.p055pa.p056a;

import android.util.Log;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.efs.sdk.p055pa.C5726b;
import com.efs.sdk.p055pa.PAMsgListener;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* renamed from: com.efs.sdk.pa.a.f */
/* loaded from: classes3.dex */
final class C5724f implements InterfaceC5722d {

    /* renamed from: a */
    PAMsgListener f4836a;

    /* renamed from: b */
    boolean f4837b;

    /* renamed from: c */
    String f4838c;

    /* renamed from: d */
    BufferedOutputStream f4839d;

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.efs.sdk.p055pa.C5726b m4212b(java.lang.String r9, long r10, long r12) {
        /*
            java.lang.String r0 = "{"
            java.lang.String r1 = ")"
            java.lang.String r2 = "("
            r3 = 0
            if (r9 != 0) goto La
            return r3
        La:
            com.efs.sdk.pa.b r4 = new com.efs.sdk.pa.b
            r4.<init>()
            java.lang.String r5 = ":"
            int r5 = r9.indexOf(r5)     // Catch: java.lang.Exception -> L2b
            java.lang.String r6 = ""
            r7 = -1
            if (r5 == r7) goto L2e
            int r5 = r5 + 2
            int r8 = r9.length()     // Catch: java.lang.Exception -> L2b
            if (r5 >= r8) goto L2e
            int r8 = r9.length()     // Catch: java.lang.Exception -> L2b
            java.lang.String r5 = r9.substring(r5, r8)     // Catch: java.lang.Exception -> L2b
            goto L2f
        L2b:
            r9 = move-exception
            goto Laf
        L2e:
            r5 = r6
        L2f:
            r4.f4843a = r5     // Catch: java.lang.Exception -> L2b
            boolean r5 = r9.contains(r2)     // Catch: java.lang.Exception -> L2b
            java.lang.String r8 = "}"
            if (r5 == 0) goto L5a
            boolean r5 = r9.contains(r1)     // Catch: java.lang.Exception -> L2b
            if (r5 == 0) goto L5a
            int r0 = r9.indexOf(r2)     // Catch: java.lang.Exception -> L2b
            int r1 = r9.indexOf(r1)     // Catch: java.lang.Exception -> L2b
            if (r0 == r7) goto L81
            if (r1 == r7) goto L81
            int r0 = r0 + 1
            int r2 = r9.length()     // Catch: java.lang.Exception -> L2b
            if (r0 >= r2) goto L81
            if (r1 <= r0) goto L81
            java.lang.String r0 = r9.substring(r0, r1)     // Catch: java.lang.Exception -> L2b
            goto L82
        L5a:
            boolean r1 = r9.contains(r0)     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto L81
            boolean r1 = r9.contains(r8)     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto L81
            int r0 = r9.indexOf(r0)     // Catch: java.lang.Exception -> L2b
            int r1 = r9.indexOf(r8)     // Catch: java.lang.Exception -> L2b
            if (r0 == r7) goto L81
            if (r1 == r7) goto L81
            int r0 = r0 + 1
            int r2 = r9.length()     // Catch: java.lang.Exception -> L2b
            if (r0 >= r2) goto L81
            if (r1 <= r0) goto L81
            java.lang.String r0 = r9.substring(r0, r1)     // Catch: java.lang.Exception -> L2b
            goto L82
        L81:
            r0 = r6
        L82:
            r4.f4844b = r0     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = "null"
            boolean r0 = r9.contains(r0)     // Catch: java.lang.Exception -> L2b
            if (r0 != 0) goto La8
            boolean r0 = r9.contains(r8)     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto La8
            int r0 = r9.lastIndexOf(r8)     // Catch: java.lang.Exception -> L2b
            if (r0 == r7) goto La8
            int r0 = r0 + 1
            int r1 = r9.length()     // Catch: java.lang.Exception -> L2b
            if (r0 >= r1) goto La8
            int r1 = r9.length()     // Catch: java.lang.Exception -> L2b
            java.lang.String r6 = r9.substring(r0, r1)     // Catch: java.lang.Exception -> L2b
        La8:
            r4.f4845c = r6     // Catch: java.lang.Exception -> L2b
            r4.f4846d = r10
            r4.f4847e = r12
            return r4
        Laf:
            r9.printStackTrace()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.p055pa.p056a.C5724f.m4212b(java.lang.String, long, long):com.efs.sdk.pa.b");
    }

    @Override // com.efs.sdk.p055pa.p056a.InterfaceC5722d
    /* renamed from: a */
    public final void mo4211a(String str, long j9, long j10) throws IOException {
        C5726b c5726bM4212b = m4212b(str, j9, j10);
        if (c5726bM4212b != null) {
            if (this.f4837b) {
                Log.e("PerformanceAnalyze", c5726bM4212b.toString());
            }
            if (this.f4838c != null) {
                try {
                    this.f4839d.write((c5726bM4212b.toString() + AbsSection.SEP_ORIGIN_LINE_BREAK).getBytes());
                } catch (Exception unused) {
                }
            }
            this.f4836a.msg(c5726bM4212b);
        }
    }
}
