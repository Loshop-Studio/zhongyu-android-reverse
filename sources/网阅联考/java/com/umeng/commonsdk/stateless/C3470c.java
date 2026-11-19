package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.C3473b;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.stateless.c */
/* loaded from: classes2.dex */
public class C3470c {

    /* renamed from: a */
    private String f2718a = "10.0.0.172";

    /* renamed from: b */
    private int f2719b = 80;

    /* renamed from: c */
    private Context f2720c;

    public C3470c(Context context) {
        this.f2720c = context;
    }

    /* renamed from: a */
    private void m3599a() {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.f2720c, "sl_domain_p", "");
        if (TextUtils.isEmpty(strImprintProperty)) {
            return;
        }
        C3468a.f2701i = DataHelper.assembleStatelessURL(strImprintProperty);
    }

    /* renamed from: b */
    private void m3600b() {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.f2720c, "sl_domain_p", "");
        String strImprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f2720c, "oversea_sl_domain_p", "");
        if (!TextUtils.isEmpty(strImprintProperty)) {
            C3468a.f2700h = DataHelper.assembleStatelessURL(strImprintProperty);
        }
        if (!TextUtils.isEmpty(strImprintProperty2)) {
            C3468a.f2703k = DataHelper.assembleStatelessURL(strImprintProperty2);
        }
        C3468a.f2701i = C3468a.f2703k;
        if (TextUtils.isEmpty(C3473b.f2730b)) {
            return;
        }
        if (C3473b.f2730b.startsWith("460") || C3473b.f2730b.startsWith("461")) {
            C3468a.f2701i = C3468a.f2700h;
        }
    }

    /* renamed from: c */
    private boolean m3601c() {
        NetworkInfo activeNetworkInfo;
        String extraInfo;
        Context context = this.f2720c;
        if (context == null || context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.f2720c.getPackageName()) != 0) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f2720c.getSystemService("connectivity");
            if (DeviceConfig.checkPermission(this.f2720c, "android.permission.ACCESS_NETWORK_STATE") && connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.getType() != 1 && (extraInfo = activeNetworkInfo.getExtraInfo()) != null) {
                if (!extraInfo.equals("cmwap") && !extraInfo.equals("3gwap")) {
                    if (extraInfo.equals("uniwap")) {
                    }
                }
                return true;
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.f2720c, th);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010c A[EXC_TOP_SPLITTER, PHI: r2 r4 r13
      0x010c: PHI (r2v3 boolean) = (r2v0 boolean), (r2v0 boolean), (r2v4 boolean), (r2v4 boolean) binds: [B:35:0x0123, B:42:0x0132, B:53:0x010c, B:23:0x0109] A[DONT_GENERATE, DONT_INLINE]
      0x010c: PHI (r4v8 java.io.OutputStream) = (r4v5 java.io.OutputStream), (r4v6 java.io.OutputStream), (r4v11 java.io.OutputStream), (r4v11 java.io.OutputStream) binds: [B:35:0x0123, B:42:0x0132, B:53:0x010c, B:23:0x0109] A[DONT_GENERATE, DONT_INLINE]
      0x010c: PHI (r13v8 ??) = (r13v5 ??), (r13v6 ??), (r13v13 ??), (r13v13 ??) binds: [B:35:0x0123, B:42:0x0132, B:53:0x010c, B:23:0x0109] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0135 A[PHI: r2 r4 r13
      0x0135: PHI (r2v2 boolean) = (r2v0 boolean), (r2v0 boolean), (r2v3 boolean) binds: [B:35:0x0123, B:42:0x0132, B:24:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r4v7 java.io.OutputStream) = (r4v5 java.io.OutputStream), (r4v6 java.io.OutputStream), (r4v8 java.io.OutputStream) binds: [B:35:0x0123, B:42:0x0132, B:24:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r13v7 ??) = (r13v5 ??), (r13v6 ??), (r13v8 ??) binds: [B:35:0x0123, B:42:0x0132, B:24:0x010c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.net.HttpURLConnection, java.net.URLConnection, javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.StringBuilder] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m3602a(byte[] r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.C3470c.m3602a(byte[], java.lang.String, java.lang.String, java.lang.String):boolean");
    }
}
