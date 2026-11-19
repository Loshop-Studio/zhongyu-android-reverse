package com.tencent.smtt.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.tencent.smtt.sdk.TbsConfig;
import com.tencent.smtt.sdk.p058a.C6774d;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.smtt.utils.s */
/* loaded from: classes4.dex */
public class C6862s {

    /* renamed from: a */
    private static C6862s f7001a;

    /* renamed from: b */
    private Handler f7002b;

    private C6862s() {
        this.f7002b = null;
        this.f7002b = new HandlerC6863t(this, Looper.getMainLooper());
    }

    /* renamed from: a */
    private int m6354a(Context context) {
        if (m6367a(TbsConfig.APP_QB, context, 128) != null) {
            return 2;
        }
        return !TextUtils.isEmpty(m6365e(context)) ? 1 : 0;
    }

    /* renamed from: b */
    private void m6359b(Context context) {
        Message message = new Message();
        message.what = 1;
        message.obj = new Object[]{context};
        this.f7002b.sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m6361c(Context context) {
        try {
            String strM6365e = m6365e(context);
            if (TextUtils.isEmpty(strM6365e)) {
                return;
            }
            File file = new File(strM6365e);
            if (file.exists()) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(268435456);
                intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
                context.startActivity(intent);
                C6864u.m6369a(context).m6372a(context.getApplicationInfo().processName);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x004a A[EXC_TOP_SPLITTER, PHI: r0 r7
      0x004a: PHI (r0v1 java.io.FileInputStream) = (r0v3 java.io.FileInputStream), (r0v5 java.io.FileInputStream) binds: [B:27:0x0056, B:21:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x004a: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v6 java.lang.String) binds: [B:27:0x0056, B:21:0x0048] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Map<java.lang.String, java.lang.String> m6363d(android.content.Context r7) throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r7 = ""
            r0 = 0
            java.lang.String r1 = "/data/data/com.tencent.mm/app_tbs/share/QQBrowserDownloadInfo.ini"
            java.lang.String r2 = "/data/data/com.tencent.mobileqq/app_tbs/share/QQBrowserDownloadInfo.ini"
            java.lang.String r3 = "/data/data/com.qzone/app_tbs/share/QQBrowserDownloadInfo.ini"
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L1a
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r4.exists()     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L1c
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L1a
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r1 = move-exception
            goto L53
        L1c:
            boolean r1 = r4.exists()     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L27
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L1a
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1a
        L27:
            boolean r1 = r4.exists()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L48
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L1a
            byte[] r0 = com.tencent.smtt.utils.C6854k.m6323b(r1)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L47
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "utf-8"
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L42
            r0 = r1
            r7 = r2
            goto L48
        L42:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L53
        L47:
            r0 = r1
        L48:
            if (r0 == 0) goto L59
        L4a:
            r0.close()     // Catch: java.io.IOException -> L4e
            goto L59
        L4e:
            r0 = move-exception
            r0.printStackTrace()
            goto L59
        L53:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L59
            goto L4a
        L59:
            java.util.Map r7 = r6.m6356a(r7)
            return r7
        L5e:
            r7 = move-exception
            if (r0 == 0) goto L69
            r0.close()     // Catch: java.io.IOException -> L65
            goto L69
        L65:
            r0 = move-exception
            r0.printStackTrace()
        L69:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.C6862s.m6363d(android.content.Context):java.util.Map");
    }

    /* renamed from: e */
    private String m6365e(Context context) throws IOException {
        Map<String, String> mapM6363d = m6363d(context);
        if (mapM6363d != null && mapM6363d.size() > 0) {
            String str = mapM6363d.get("FileDownloadPath");
            String str2 = mapM6363d.get("FileDownloadVerifyInfo");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return "";
            }
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            if (TextUtils.equals(C6858o.m6338a(file.lastModified() + ""), str2)) {
                return str;
            }
        }
        return "";
    }

    /* renamed from: b */
    public static void m6360b(Context context, String str) throws PackageManager.NameNotFoundException {
        if (context == null || str == null || str.length() <= 0) {
            return;
        }
        C6774d.m5994a(context, str, null, null);
    }

    /* renamed from: c */
    private void m6362c(Context context, String str) {
        Object[] objArr = {context, str};
        Message message = new Message();
        message.what = 0;
        message.obj = objArr;
        this.f7002b.sendMessage(message);
    }

    /* renamed from: d */
    private void m6364d(Context context, String str) {
        Object[] objArr = {context, str};
        Message message = new Message();
        message.what = 2;
        message.obj = objArr;
        this.f7002b.sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m6366e(Context context, String str) {
        if (context == null || str == null || str.length() <= 0) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public PackageInfo m6367a(String str, Context context, int i10) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                return context.getPackageManager().getPackageInfo(str, i10);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C6862s m6355a() {
        if (f7001a == null) {
            f7001a = new C6862s();
        }
        return f7001a;
    }

    /* renamed from: a */
    private Map<String, String> m6356a(String str) {
        String[] strArrSplit;
        HashMap map = null;
        if (str != null && str.length() > 0) {
            try {
                HashMap map2 = new HashMap();
                try {
                    for (String str2 : str.split(SignParameters.NEW_LINE)) {
                        if (str2 != null && str2.length() > 0 && (strArrSplit = str2.trim().split("=", 2)) != null && strArrSplit.length >= 2) {
                            String str3 = strArrSplit[0];
                            String str4 = strArrSplit[1];
                            if (str3 != null && str3.length() > 0) {
                                map2.put(str3, str4);
                            }
                        }
                    }
                    return map2;
                } catch (Throwable th) {
                    th = th;
                    map = map2;
                    th.printStackTrace();
                    return map;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return map;
    }

    /* renamed from: a */
    public boolean m6368a(Context context, String str) {
        String str2;
        if (str != null) {
            try {
                if (str.startsWith("tbsqbdownload://")) {
                    String[] strArrSplit = str.substring(16).split(",");
                    String strSubstring = null;
                    if (strArrSplit.length > 1) {
                        String[] strArrSplit2 = strArrSplit[0].split("=");
                        String strSubstring2 = (strArrSplit2.length <= 1 || !IjkMediaPlayer.OnNativeInvokeListener.ARG_URL.equalsIgnoreCase(strArrSplit2[0])) ? null : strArrSplit[0].substring(4);
                        String[] strArrSplit3 = strArrSplit[1].split("=");
                        if (strArrSplit3.length > 1 && "downloadurl".equalsIgnoreCase(strArrSplit3[0])) {
                            strSubstring = strArrSplit[1].substring(12);
                        }
                        str2 = strSubstring;
                        strSubstring = strSubstring2;
                    } else {
                        str2 = null;
                    }
                    if (strSubstring != null && str2 != null) {
                        int iM6354a = m6354a(context);
                        if (iM6354a == 2) {
                            m6362c(context, strSubstring);
                        } else if (iM6354a == 1) {
                            m6359b(context);
                        } else if (iM6354a == 0) {
                            m6364d(context, str2);
                        }
                        return true;
                    }
                    return false;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return false;
    }
}
