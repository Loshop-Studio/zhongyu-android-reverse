package com.tencent.smtt.sdk.p058a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.smtt.sdk.TbsConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: com.tencent.smtt.sdk.a.d */
/* loaded from: classes4.dex */
public class C6774d {

    /* renamed from: com.tencent.smtt.sdk.a.d$a */
    public static class a {

        /* renamed from: a */
        public int f6749a = -1;

        /* renamed from: b */
        public int f6750b = -1;

        /* renamed from: c */
        public String f6751c = "";

        /* renamed from: d */
        public String f6752d = "0";

        /* renamed from: e */
        public String f6753e = null;
    }

    /* renamed from: com.tencent.smtt.sdk.a.d$b */
    public static class b {

        /* renamed from: a */
        public String f6754a;

        /* renamed from: b */
        public String f6755b;

        private b() {
            this.f6754a = "";
            this.f6755b = "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0072, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.f6754a) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0074, code lost:
    
        r1 = r0.f6755b;
        r0 = r0.f6754a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b4, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.f6754a) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c8, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.f6754a) == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0106 A[Catch: ActivityNotFoundException -> 0x012f, TryCatch #1 {ActivityNotFoundException -> 0x012f, blocks: (B:75:0x00f6, B:77:0x0106, B:78:0x012a), top: B:85:0x00f6 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m5994a(android.content.Context r7, java.lang.String r8, java.util.HashMap<java.lang.String, java.lang.String> r9, com.tencent.smtt.sdk.WebView r10) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.p058a.C6774d.m5994a(android.content.Context, java.lang.String, java.util.HashMap, com.tencent.smtt.sdk.WebView):int");
    }

    /* renamed from: b */
    public static boolean m6002b(Context context) {
        return m5996a(context).f6749a != -1;
    }

    /* renamed from: c */
    public static boolean m6003c(Context context) throws PackageManager.NameNotFoundException {
        a aVarM5996a = m5996a(context);
        boolean z10 = false;
        try {
            if (Long.valueOf(aVarM5996a.f6752d).longValue() >= 6001500) {
                z10 = true;
            }
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
        }
        if (aVarM5996a.f6750b >= 601500) {
            return true;
        }
        return z10;
    }

    /* renamed from: d */
    private static int m6004d(Context context) {
        String str = context.getApplicationInfo().processName;
        if (str.equals(TbsConfig.APP_QQ)) {
            return 13;
        }
        if (str.equals(TbsConfig.APP_QZONE)) {
            return 14;
        }
        if (str.equals("com.tencent.WBlog")) {
            return 15;
        }
        return str.equals(TbsConfig.APP_WX) ? 24 : 26;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m5995a(android.content.Context r4, java.lang.String r5, java.util.HashMap<java.lang.String, java.lang.String> r6, java.lang.String r7, com.tencent.smtt.sdk.WebView r8) throws java.io.UnsupportedEncodingException {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            android.content.pm.PackageManager r2 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1d
            java.lang.String r3 = "com.tencent.mtt"
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r1)     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1d
            int r2 = r2.versionCode     // Catch: java.lang.Throwable -> L1d
            r3 = 601000(0x92ba8, float:8.4218E-40)
            if (r2 <= r3) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = r1
        L1e:
            java.lang.String r3 = "UTF-8"
            java.lang.String r1 = java.net.URLEncoder.encode(r5, r3)     // Catch: java.lang.Exception -> L28
            if (r2 == 0) goto L27
            r5 = r1
        L27:
            r1 = r2
        L28:
            if (r1 == 0) goto L2d
            java.lang.String r1 = ",encoded=1"
            goto L2f
        L2d:
            java.lang.String r1 = ""
        L2f:
            java.lang.String r2 = "mttbrowser://url="
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = ",product="
            r0.append(r5)
            java.lang.String r5 = "TBS"
            r0.append(r5)
            java.lang.String r5 = ",packagename="
            r0.append(r5)
            java.lang.String r5 = r4.getPackageName()
            r0.append(r5)
            java.lang.String r5 = ",from="
            r0.append(r5)
            r0.append(r7)
            java.lang.String r5 = ",version="
            r0.append(r5)
            java.lang.String r5 = "3.5.0.1063"
            r0.append(r5)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            int r4 = m5994a(r4, r5, r6, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.p058a.C6774d.m5995a(android.content.Context, java.lang.String, java.util.HashMap, java.lang.String, com.tencent.smtt.sdk.WebView):int");
    }

    /* renamed from: a */
    public static a m5996a(Context context) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        int i10;
        boolean z10 = context.getApplicationContext().getSharedPreferences("x5_proxy_setting", 0).getBoolean("qb_install_status", false);
        a aVar = new a();
        if (!z10) {
            try {
                PackageManager packageManager = context.getPackageManager();
                try {
                    packageInfo = packageManager.getPackageInfo(TbsConfig.APP_QB, 0);
                    try {
                        aVar.f6749a = 2;
                        aVar.f6753e = TbsConfig.APP_QB;
                        aVar.f6751c = "ADRQB_";
                        if (packageInfo != null && (i10 = packageInfo.versionCode) > 420000) {
                            aVar.f6750b = i10;
                            aVar.f6751c += packageInfo.versionName.replaceAll("\\.", "");
                            aVar.f6752d = packageInfo.versionName.replaceAll("\\.", "");
                            return aVar;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    packageInfo = null;
                }
                try {
                    try {
                        try {
                            try {
                                try {
                                    packageInfo = packageManager.getPackageInfo("com.tencent.qbx", 0);
                                    aVar.f6749a = 0;
                                    aVar.f6753e = "com.tencent.qbx";
                                    aVar.f6751c = "ADRQBX_";
                                } catch (Exception unused3) {
                                }
                            } catch (PackageManager.NameNotFoundException unused4) {
                                packageInfo = packageManager.getPackageInfo("com.tencent.qbx5", 0);
                                aVar.f6749a = 1;
                                aVar.f6753e = "com.tencent.qbx5";
                                aVar.f6751c = "ADRQBX5_";
                            }
                        } catch (Exception unused5) {
                            b bVarM5997a = m5997a(context, Uri.parse("http://mdc.html5.qq.com/mh?channel_id=50079&u="));
                            if (bVarM5997a != null && !TextUtils.isEmpty(bVarM5997a.f6755b)) {
                                PackageInfo packageInfo2 = packageManager.getPackageInfo(bVarM5997a.f6755b, 0);
                                try {
                                    aVar.f6753e = bVarM5997a.f6755b;
                                    aVar.f6749a = 2;
                                    aVar.f6751c = "ADRQB_";
                                } catch (Exception unused6) {
                                }
                                packageInfo = packageInfo2;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused7) {
                        packageInfo = packageManager.getPackageInfo(TbsConfig.APP_QB, 0);
                        aVar.f6753e = TbsConfig.APP_QB;
                        aVar.f6749a = 2;
                        aVar.f6751c = "ADRQB_";
                    }
                } catch (PackageManager.NameNotFoundException unused8) {
                    packageInfo = packageManager.getPackageInfo("com.tencent.mtt.x86", 0);
                    aVar.f6753e = "com.tencent.mtt.x86";
                    aVar.f6749a = 2;
                    aVar.f6751c = "ADRQB_";
                }
                if (packageInfo != null) {
                    aVar.f6750b = packageInfo.versionCode;
                    aVar.f6751c += packageInfo.versionName.replaceAll("\\.", "");
                    aVar.f6752d = packageInfo.versionName.replaceAll("\\.", "");
                }
            } catch (Exception unused9) {
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private static b m5997a(Context context, Uri uri) {
        Intent intent = new Intent("com.tencent.QQBrowser.action.VIEW");
        intent.setData(uri);
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities.size() <= 0) {
            return null;
        }
        b bVar = new b();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            String str = resolveInfo.activityInfo.packageName;
            if (str.contains(TbsConfig.APP_QB)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                bVar.f6754a = activityInfo.name;
                bVar.f6755b = activityInfo.packageName;
                return bVar;
            }
            if (str.contains("com.tencent.qbx")) {
                ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                bVar.f6754a = activityInfo2.name;
                bVar.f6755b = activityInfo2.packageName;
            }
        }
        return bVar;
    }

    /* renamed from: a */
    public static boolean m5998a(Context context, long j10, long j11) throws PackageManager.NameNotFoundException {
        boolean z10 = false;
        try {
            if (Long.valueOf(m5996a(context).f6752d).longValue() >= j10) {
                z10 = true;
            }
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
        }
        if (r4.f6750b >= j11) {
            return true;
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0079 A[Catch: Exception -> 0x0082, TryCatch #0 {Exception -> 0x0082, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x000f, B:7:0x0013, B:9:0x0019, B:11:0x002b, B:12:0x002f, B:15:0x0044, B:18:0x004d, B:20:0x0079, B:21:0x007e), top: B:26:0x0000 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m5999a(android.content.Context r5, java.lang.String r6, int r7, java.lang.String r8, java.util.HashMap<java.lang.String, java.lang.String> r9, android.os.Bundle r10) {
        /*
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L82
            java.lang.String r1 = "com.tencent.QQBrowser.action.sdk.document"
            r0.<init>(r1)     // Catch: java.lang.Exception -> L82
            if (r9 == 0) goto L2f
            java.util.Set r1 = r9.keySet()     // Catch: java.lang.Exception -> L82
            if (r1 == 0) goto L2f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L82
        L13:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L82
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L82
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L82
            java.lang.Object r3 = r9.get(r2)     // Catch: java.lang.Exception -> L82
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L82
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L82
            if (r4 != 0) goto L13
            r0.putExtra(r2, r3)     // Catch: java.lang.Exception -> L82
            goto L13
        L2f:
            java.io.File r9 = new java.io.File     // Catch: java.lang.Exception -> L82
            r9.<init>(r6)     // Catch: java.lang.Exception -> L82
            java.lang.String r1 = "key_reader_sdk_id"
            r2 = 3
            r0.putExtra(r1, r2)     // Catch: java.lang.Exception -> L82
            java.lang.String r1 = "key_reader_sdk_type"
            r0.putExtra(r1, r7)     // Catch: java.lang.Exception -> L82
            r1 = 1
            if (r7 != 0) goto L48
            java.lang.String r7 = "key_reader_sdk_path"
        L44:
            r0.putExtra(r7, r6)     // Catch: java.lang.Exception -> L82
            goto L4d
        L48:
            if (r7 != r1) goto L4d
            java.lang.String r7 = "key_reader_sdk_url"
            goto L44
        L4d:
            java.lang.String r6 = "key_reader_sdk_format"
            r0.putExtra(r6, r8)     // Catch: java.lang.Exception -> L82
            android.net.Uri r6 = android.net.Uri.fromFile(r9)     // Catch: java.lang.Exception -> L82
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L82
            r7.<init>()     // Catch: java.lang.Exception -> L82
            java.lang.String r9 = "mtt/"
            r7.append(r9)     // Catch: java.lang.Exception -> L82
            r7.append(r8)     // Catch: java.lang.Exception -> L82
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L82
            r0.setDataAndType(r6, r7)     // Catch: java.lang.Exception -> L82
            java.lang.String r6 = "loginType"
            android.content.Context r7 = r5.getApplicationContext()     // Catch: java.lang.Exception -> L82
            int r7 = m6004d(r7)     // Catch: java.lang.Exception -> L82
            r0.putExtra(r6, r7)     // Catch: java.lang.Exception -> L82
            if (r10 == 0) goto L7e
            java.lang.String r6 = "key_reader_sdk_extrals"
            r0.putExtra(r6, r10)     // Catch: java.lang.Exception -> L82
        L7e:
            r5.startActivity(r0)     // Catch: java.lang.Exception -> L82
            return r1
        L82:
            r5 = move-exception
            r5.printStackTrace()
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.p058a.C6774d.m5999a(android.content.Context, java.lang.String, int, java.lang.String, java.util.HashMap, android.os.Bundle):boolean");
    }

    /* renamed from: a */
    public static boolean m6000a(Context context, String str, HashMap<String, String> map) {
        Set<String> setKeySet;
        Uri uri = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.setDataAndType(uri, "video/*");
        if (map != null && (setKeySet = map.keySet()) != null) {
            for (String str2 : setKeySet) {
                String str3 = map.get(str2);
                if (!TextUtils.isEmpty(str3)) {
                    intent.putExtra(str2, str3);
                }
            }
        }
        try {
            intent.putExtra("loginType", m6004d(context));
            intent.setComponent(new ComponentName(TbsConfig.APP_QB, "com.tencent.mtt.browser.video.H5VideoThrdcallActivity"));
            context.startActivity(intent);
            return true;
        } catch (Throwable unused) {
            try {
                intent.setComponent(null);
                context.startActivity(intent);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }
    }

    /* renamed from: a */
    private static boolean m6001a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        String strTrim = str.trim();
        int iIndexOf = strTrim.toLowerCase().indexOf("://");
        int iIndexOf2 = strTrim.toLowerCase().indexOf(46);
        if (iIndexOf <= 0 || iIndexOf2 <= 0 || iIndexOf <= iIndexOf2) {
            return strTrim.toLowerCase().contains("://");
        }
        return false;
    }
}
