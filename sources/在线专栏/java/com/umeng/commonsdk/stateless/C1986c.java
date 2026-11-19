package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.C1989b;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.stateless.c */
/* loaded from: classes.dex */
public class C1986c {

    /* renamed from: a */
    private String f9310a = "10.0.0.172";

    /* renamed from: b */
    private int f9311b = 80;

    /* renamed from: c */
    private Context f9312c;

    public C1986c(Context context) {
        this.f9312c = context;
    }

    /* renamed from: a */
    private void m7522a() {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.f9312c, "sl_domain_p", "");
        if (TextUtils.isEmpty(strImprintProperty)) {
            return;
        }
        C1984a.f9293i = DataHelper.assembleStatelessURL(strImprintProperty);
    }

    /* renamed from: b */
    private void m7523b() {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.f9312c, "sl_domain_p", "");
        String strImprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f9312c, "oversea_sl_domain_p", "");
        if (!TextUtils.isEmpty(strImprintProperty)) {
            C1984a.f9292h = DataHelper.assembleStatelessURL(strImprintProperty);
        }
        if (!TextUtils.isEmpty(strImprintProperty2)) {
            C1984a.f9295k = DataHelper.assembleStatelessURL(strImprintProperty2);
        }
        C1984a.f9293i = C1984a.f9295k;
        if (TextUtils.isEmpty(C1989b.f9322b)) {
            return;
        }
        if (C1989b.f9322b.startsWith("460") || C1989b.f9322b.startsWith("461")) {
            C1984a.f9293i = C1984a.f9292h;
        }
    }

    /* renamed from: c */
    private boolean m7524c() {
        NetworkInfo activeNetworkInfo;
        String extraInfo;
        Context context = this.f9312c;
        if (context == null || context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.f9312c.getPackageName()) != 0) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f9312c.getSystemService("connectivity");
            if (DeviceConfig.checkPermission(this.f9312c, "android.permission.ACCESS_NETWORK_STATE") && connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.getType() != 1 && (extraInfo = activeNetworkInfo.getExtraInfo()) != null) {
                if (!extraInfo.equals("cmwap") && !extraInfo.equals("3gwap")) {
                    if (extraInfo.equals("uniwap")) {
                    }
                }
                return true;
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.f9312c, th);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010c A[EXC_TOP_SPLITTER, PHI: r2 r4 r13
      0x010c: PHI (r2v3 boolean) = (r2v0 boolean), (r2v0 boolean), (r2v4 boolean), (r2v4 boolean) binds: [B:37:0x0125, B:46:0x0136, B:59:0x010c, B:23:0x0109] A[DONT_GENERATE, DONT_INLINE]
      0x010c: PHI (r4v8 java.io.OutputStream) = (r4v5 java.io.OutputStream), (r4v6 java.io.OutputStream), (r4v11 java.io.OutputStream), (r4v11 java.io.OutputStream) binds: [B:37:0x0125, B:46:0x0136, B:59:0x010c, B:23:0x0109] A[DONT_GENERATE, DONT_INLINE]
      0x010c: PHI (r13v8 ??) = (r13v5 javax.net.ssl.HttpsURLConnection), (r13v6 javax.net.ssl.HttpsURLConnection), (r13v13 ??), (r13v13 ??) binds: [B:37:0x0125, B:46:0x0136, B:59:0x010c, B:23:0x0109] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0139 A[PHI: r2 r4 r13
      0x0139: PHI (r2v2 boolean) = (r2v0 boolean), (r2v0 boolean), (r2v3 boolean) binds: [B:37:0x0125, B:46:0x0136, B:24:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0139: PHI (r4v7 java.io.OutputStream) = (r4v5 java.io.OutputStream), (r4v6 java.io.OutputStream), (r4v8 java.io.OutputStream) binds: [B:37:0x0125, B:46:0x0136, B:24:0x010c] A[DONT_GENERATE, DONT_INLINE]
      0x0139: PHI (r13v7 ??) = (r13v5 javax.net.ssl.HttpsURLConnection), (r13v6 javax.net.ssl.HttpsURLConnection), (r13v8 ??) binds: [B:37:0x0125, B:46:0x0136, B:24:0x010c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v13, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [javax.net.ssl.HttpsURLConnection] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m7525a(byte[] r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.C1986c.m7525a(byte[], java.lang.String, java.lang.String, java.lang.String):boolean");
    }
}
