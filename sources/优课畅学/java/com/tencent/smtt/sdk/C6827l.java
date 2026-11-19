package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.smtt.utils.TbsLog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* renamed from: com.tencent.smtt.sdk.l */
/* loaded from: classes4.dex */
class C6827l {

    /* renamed from: a */
    static boolean f6902a = false;

    /* renamed from: c */
    private static C6827l f6903c = null;

    /* renamed from: f */
    private static int f6904f = 0;

    /* renamed from: g */
    private static int f6905g = 0;

    /* renamed from: h */
    private static int f6906h = 3;

    /* renamed from: j */
    private static String f6907j;

    /* renamed from: b */
    private C6805bd f6908b = null;

    /* renamed from: d */
    private boolean f6909d = false;

    /* renamed from: e */
    private boolean f6910e = false;

    /* renamed from: i */
    private File f6911i = null;

    private C6827l() {
    }

    /* renamed from: b */
    private void m6216b(int i10) throws IOException {
        String strValueOf = String.valueOf(i10);
        Properties properties = new Properties();
        properties.setProperty(f6907j, strValueOf);
        try {
            properties.store(new FileOutputStream(new File(this.f6911i, "count.prop")), (String) null);
        } catch (FileNotFoundException | IOException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: d */
    public static int m6217d() {
        return f6904f;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m6218i() throws java.lang.Throwable {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.io.File r3 = r6.f6911i     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r4 = "count.prop"
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r3 != 0) goto L12
            return r0
        L12:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.util.Properties r1 = new java.util.Properties     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            r1.<init>()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            r1.load(r2)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            java.lang.String r3 = com.tencent.smtt.sdk.C6827l.f6907j     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            java.lang.String r4 = "1"
            java.lang.String r1 = r1.getProperty(r3, r4)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            int r0 = r1.intValue()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40
            r2.close()     // Catch: java.io.IOException -> L38
            return r0
        L38:
            r1 = move-exception
            r1.printStackTrace()
            return r0
        L3d:
            r0 = move-exception
            r1 = r2
            goto L56
        L40:
            r1 = move-exception
            goto L48
        L42:
            r0 = move-exception
            goto L56
        L44:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L48:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L55
            r2.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r1 = move-exception
            r1.printStackTrace()
        L55:
            return r0
        L56:
            if (r1 == 0) goto L60
            r1.close()     // Catch: java.io.IOException -> L5c
            goto L60
        L5c:
            r1 = move-exception
            r1.printStackTrace()
        L60:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C6827l.m6218i():int");
    }

    /* renamed from: a */
    public C6805bd m6219a() {
        if (this.f6909d) {
            return this.f6908b;
        }
        return null;
    }

    /* renamed from: c */
    public C6805bd m6224c() {
        return this.f6908b;
    }

    /* renamed from: e */
    public String m6225e() {
        C6805bd c6805bd = this.f6908b;
        return (c6805bd == null || QbSdk.f6572a) ? "system webview get nothing..." : c6805bd.m6145a();
    }

    /* renamed from: f */
    public boolean m6226f() throws Throwable {
        if (f6902a) {
            if (f6907j == null) {
                return false;
            }
            int iM6218i = m6218i();
            if (iM6218i == 0) {
                m6216b(1);
            } else {
                int i10 = iM6218i + 1;
                if (i10 > f6906h) {
                    return false;
                }
                m6216b(i10);
            }
        }
        return f6902a;
    }

    /* renamed from: g */
    public boolean m6227g() {
        return this.f6910e;
    }

    /* renamed from: h */
    public boolean m6228h() {
        return QbSdk.useSoftWare();
    }

    /* renamed from: a */
    public static C6827l m6214a(boolean z10) {
        if (f6903c == null && z10) {
            synchronized (C6827l.class) {
                try {
                    if (f6903c == null) {
                        f6903c = new C6827l();
                    }
                } finally {
                }
            }
        }
        return f6903c;
    }

    /* renamed from: b */
    public boolean m6222b() {
        return this.f6909d;
    }

    /* renamed from: a */
    public static void m6215a(int i10) {
        f6904f = i10;
    }

    /* renamed from: b */
    public boolean m6223b(boolean z10) {
        f6902a = z10;
        return z10;
    }

    /* renamed from: a */
    public synchronized void m6220a(Context context, boolean z10, boolean z11, C6784aj c6784aj) {
        File fileM6121n;
        Context applicationContext;
        File fileM6121n2;
        try {
            TbsLog.addLog(999, null, new Object[0]);
            TbsLog.initIfNeed(context);
            int i10 = f6905g + 1;
            f6905g = i10;
            if (c6784aj != null) {
                c6784aj.f6810b = i10 == 1;
            }
            TbsCoreLoadStat.getInstance().m5850a();
            if (c6784aj != null) {
                c6784aj.m6062a("tbs_rename_task", (byte) 1);
            }
            C6785ak.m6068a().m6107b(context, f6905g == 1);
            if (c6784aj != null) {
                c6784aj.m6062a("tbs_rename_task", (byte) 2);
            }
            TbsShareManager.forceToLoadX5ForThirdApp(context, true);
            if (c6784aj != null) {
                c6784aj.m6062a("can_load_x5", (byte) 1);
            }
            boolean zM5844a = QbSdk.m5844a(context, z10, z11);
            if (c6784aj != null) {
                c6784aj.m6062a("can_load_x5", (byte) 2);
            }
            if (!zM5844a) {
                String str = "can_load_x5=" + zM5844a + "; is_compatible=true";
                TbsLog.m6246e("SDKEngine", "SDKEngine.init canLoadTbs=false; failure: " + str);
                if (!QbSdk.f6572a || !this.f6909d) {
                    this.f6909d = false;
                    TbsCoreLoadStat.getInstance().m5852a(context, TbsListener.ErrorCode.INFO_CAN_NOT_LOAD_TBS, new Throwable(str));
                }
            } else {
                if (this.f6909d) {
                    return;
                }
                try {
                    if (TbsShareManager.isThirdPartyApp(context)) {
                        TbsLog.addLog(TbsLog.TBSLOG_CODE_SDK_THIRD_MODE, null, new Object[0]);
                        if (c6784aj != null) {
                            c6784aj.m6062a("read_core_info", (byte) 1);
                        }
                        boolean zM5937i = TbsShareManager.m5937i(context);
                        if (c6784aj != null) {
                            c6784aj.m6062a("read_core_info", (byte) 2);
                        }
                        if (!zM5937i) {
                            this.f6909d = false;
                            QbSdk.m5839a(context, "SDKEngine::useSystemWebView by error_host_unavailable");
                            return;
                        }
                        fileM6121n = new File(TbsShareManager.m5930c(context));
                        fileM6121n2 = C6785ak.m6068a().m6121n(context);
                        applicationContext = TbsShareManager.m5933e(context);
                        if (fileM6121n2 == null) {
                            this.f6909d = false;
                            QbSdk.m5839a(context, "SDKEngine::useSystemWebView by error_tbs_core_dexopt_dir null!");
                            return;
                        }
                    } else {
                        TbsLog.addLog(TbsLog.TBSLOG_CODE_SDK_SELF_MODE, null, new Object[0]);
                        fileM6121n = C6785ak.m6068a().m6121n(context);
                        int i11 = f6904f;
                        applicationContext = (i11 == 25436 || i11 == 25437) ? context.getApplicationContext() : context;
                        if (fileM6121n == null) {
                            this.f6909d = false;
                            QbSdk.m5839a(context, "SDKEngine::useSystemWebView by tbs_core_share_dir null!");
                            return;
                        }
                        fileM6121n2 = fileM6121n;
                    }
                    String[] dexLoaderFileList = QbSdk.getDexLoaderFileList(context, applicationContext, fileM6121n.getAbsolutePath());
                    for (int i12 = 0; i12 < dexLoaderFileList.length; i12++) {
                    }
                    this.f6908b = new C6805bd(context, applicationContext, fileM6121n.getAbsolutePath(), TbsShareManager.getHostCorePathAppDefined() != null ? TbsShareManager.getHostCorePathAppDefined() : fileM6121n2.getAbsolutePath(), dexLoaderFileList, QbSdk.f6575d, c6784aj);
                    this.f6909d = true;
                } catch (Throwable th) {
                    TbsLog.m6246e("SDKEngine", "useSystemWebView by exception: " + th);
                    TbsCoreLoadStat.getInstance().m5852a(context, TbsListener.ErrorCode.TEST_THROWABLE_ISNOT_NULL, th);
                    this.f6909d = false;
                    QbSdk.m5839a(context, "SDKEngine::useSystemWebView by exception: " + th);
                }
            }
            this.f6911i = C6785ak.m6087p(context);
            this.f6910e = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: a */
    public void m6221a(String str) {
        f6907j = str;
    }
}
