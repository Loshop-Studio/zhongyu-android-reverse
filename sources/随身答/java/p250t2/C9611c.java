package p250t2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.AbstractC6782a;
import p210p2.AbstractC9318a;
import p260u2.C9670e;
import p270v2.AbstractC9753a;
import p270v2.AbstractC9754b;

/* renamed from: t2.c */
/* loaded from: classes4.dex */
public class C9611c {

    /* renamed from: a */
    public String f16894a = "10.0.0.172";

    /* renamed from: b */
    public int f16895b = 80;

    /* renamed from: c */
    public Context f16896c;

    public C9611c(Context context) {
        this.f16896c = context;
    }

    /* renamed from: a */
    public final void m15888a() {
        String strM6274h = AbstractC6782a.m6274h(this.f16896c, "sl_domain_p", "");
        if (TextUtils.isEmpty(strM6274h)) {
            return;
        }
        AbstractC9609a.f16881b = AbstractC9753a.m16335a(strM6274h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0119 A[EXC_TOP_SPLITTER, PHI: r2 r3 r12
      0x0119: PHI (r2v3 boolean) = (r2v0 boolean), (r2v0 boolean), (r2v4 boolean), (r2v4 boolean) binds: [B:37:0x012a, B:44:0x0139, B:54:0x0119, B:31:0x0116] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r3v8 java.io.OutputStream) = (r3v5 java.io.OutputStream), (r3v6 java.io.OutputStream), (r3v11 java.io.OutputStream), (r3v11 java.io.OutputStream) binds: [B:37:0x012a, B:44:0x0139, B:54:0x0119, B:31:0x0116] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r12v8 ??) = (r12v5 ??), (r12v6 ??), (r12v13 ??), (r12v13 ??) binds: [B:37:0x012a, B:44:0x0139, B:54:0x0119, B:31:0x0116] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013c A[PHI: r2 r3 r12
      0x013c: PHI (r2v2 boolean) = (r2v0 boolean), (r2v0 boolean), (r2v3 boolean) binds: [B:37:0x012a, B:44:0x0139, B:32:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r3v7 java.io.OutputStream) = (r3v5 java.io.OutputStream), (r3v6 java.io.OutputStream), (r3v8 java.io.OutputStream) binds: [B:37:0x012a, B:44:0x0139, B:32:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r12v7 ??) = (r12v5 ??), (r12v6 ??), (r12v8 ??) binds: [B:37:0x012a, B:44:0x0139, B:32:0x0119] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.net.HttpURLConnection, java.net.URLConnection, javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.StringBuilder] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m15889b(byte[] r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p250t2.C9611c.m15889b(byte[], java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: c */
    public final void m15890c() {
        String strM6274h = AbstractC6782a.m6274h(this.f16896c, "sl_domain_p", "");
        String strM6274h2 = AbstractC6782a.m6274h(this.f16896c, "oversea_sl_domain_p", "");
        if (!TextUtils.isEmpty(strM6274h)) {
            AbstractC9609a.f16880a = AbstractC9753a.m16335a(strM6274h);
        }
        if (!TextUtils.isEmpty(strM6274h2)) {
            AbstractC9609a.f16883d = AbstractC9753a.m16335a(strM6274h2);
        }
        AbstractC9609a.f16881b = AbstractC9609a.f16883d;
        if (TextUtils.isEmpty(C9670e.f17091f)) {
            return;
        }
        if (C9670e.f17091f.startsWith("460") || C9670e.f17091f.startsWith("461")) {
            AbstractC9609a.f16881b = AbstractC9609a.f16880a;
        }
    }

    /* renamed from: d */
    public final boolean m15891d() {
        NetworkInfo activeNetworkInfo;
        String extraInfo;
        Context context = this.f16896c;
        if (context == null || context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.f16896c.getPackageName()) != 0) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f16896c.getSystemService("connectivity");
            if (AbstractC9754b.m16367b(this.f16896c, "android.permission.ACCESS_NETWORK_STATE") && connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.getType() != 1 && (extraInfo = activeNetworkInfo.getExtraInfo()) != null) {
                if (!extraInfo.equals("cmwap") && !extraInfo.equals("3gwap")) {
                    if (extraInfo.equals("uniwap")) {
                    }
                }
                return true;
            }
        } catch (Throwable th) {
            AbstractC9318a.m15200b(this.f16896c, th);
        }
        return false;
    }
}
