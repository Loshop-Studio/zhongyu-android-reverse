package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.smtt.utils.C6845b;
import com.tencent.smtt.utils.TbsLog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* loaded from: classes4.dex */
public class TbsShareManager {

    /* renamed from: a */
    private static Context f6674a = null;

    /* renamed from: b */
    private static boolean f6675b = false;

    /* renamed from: c */
    private static String f6676c = null;

    /* renamed from: d */
    private static String f6677d = null;

    /* renamed from: e */
    private static int f6678e = 0;

    /* renamed from: f */
    private static String f6679f = null;

    /* renamed from: g */
    private static boolean f6680g = false;

    /* renamed from: h */
    private static boolean f6681h = false;

    /* renamed from: i */
    private static String f6682i = null;

    /* renamed from: j */
    private static boolean f6683j = false;

    /* renamed from: k */
    private static boolean f6684k = false;
    public static boolean mHasQueryed = false;

    /* renamed from: a */
    public static int m5923a(Context context, boolean z10) {
        m5929b(context, z10);
        return f6678e;
    }

    /* renamed from: b */
    private static File m5927b(Context context, String str) throws IOException {
        File fileM6122o = C6785ak.m6068a().m6122o(context);
        if (fileM6122o == null) {
            return null;
        }
        File file = new File(fileM6122o, str);
        if (file.exists()) {
            return file;
        }
        try {
            file.createNewFile();
            return file;
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public static String m5930c(Context context) {
        m5937i(context);
        return f6677d;
    }

    /* renamed from: d */
    public static int m5932d(Context context) {
        return m5923a(context, true);
    }

    /* renamed from: e */
    public static Context m5933e(Context context) {
        m5937i(context);
        String str = f6679f;
        if (str == null) {
            return null;
        }
        Context contextM5924a = m5924a(context, str);
        if (C6785ak.m6068a().m6112e(contextM5924a)) {
            return contextM5924a;
        }
        return null;
    }

    /* renamed from: f */
    public static synchronized String m5934f(Context context) {
        BufferedInputStream bufferedInputStream;
        try {
            File fileM5927b = m5927b(context, "core_info");
            if (fileM5927b == null) {
                return null;
            }
            bufferedInputStream = new BufferedInputStream(new FileInputStream(fileM5927b));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                String property = properties.getProperty("core_packagename", "");
                if ("".equals(property)) {
                    try {
                        bufferedInputStream.close();
                    } catch (Exception unused) {
                    }
                    return null;
                }
                try {
                    bufferedInputStream.close();
                } catch (Exception unused2) {
                }
                return property;
            } catch (Throwable th) {
                th = th;
                try {
                    th.printStackTrace();
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Exception unused3) {
                        }
                    }
                    return null;
                } catch (Throwable th2) {
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Exception unused4) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
        }
    }

    public static int findCoreForThirdPartyApp(Context context) {
        String str;
        m5941m(context);
        TbsLog.m6248i("TbsShareManager", "core_info mAvailableCoreVersion is " + f6678e + " mAvailableCorePath is " + f6677d + " mSrcPackageName is " + f6679f);
        if (f6679f == null) {
            TbsLog.m6246e("TbsShareManager", "mSrcPackageName is null !!!");
        }
        String str2 = f6679f;
        if (str2 == null || !str2.equals("AppDefined")) {
            if (!m5938j(context) && !m5939k(context)) {
                f6678e = 0;
                f6677d = null;
                f6679f = null;
                str = "core_info error checkCoreInfo is false and checkCoreInOthers is false ";
                TbsLog.m6248i("TbsShareManager", str);
            }
        } else if (f6678e != C6785ak.m6068a().m6092a(f6676c)) {
            f6678e = 0;
            f6677d = null;
            f6679f = null;
            str = "check AppDefined core is error src is " + f6678e + " dest is " + C6785ak.m6068a().m6092a(f6676c);
            TbsLog.m6248i("TbsShareManager", str);
        }
        int i10 = f6678e;
        if (i10 > 0 && (QbSdk.m5841a(context, i10) || f6680g)) {
            f6678e = 0;
            f6677d = null;
            f6679f = null;
            TbsLog.m6248i("TbsShareManager", "core_info error QbSdk.isX5Disabled ");
        }
        return f6678e;
    }

    public static boolean forceLoadX5FromTBSDemo(Context context) throws IOException {
        int sharedTbsCoreVersion;
        if (context == null || C6785ak.m6068a().m6100a(context, (File[]) null) || (sharedTbsCoreVersion = getSharedTbsCoreVersion(context, TbsConfig.APP_DEMO)) <= 0) {
            return false;
        }
        writeProperties(context, Integer.toString(sharedTbsCoreVersion), TbsConfig.APP_DEMO, C6785ak.m6068a().m6121n(m5924a(context, TbsConfig.APP_DEMO)).getAbsolutePath(), "1");
        return true;
    }

    public static void forceToLoadX5ForThirdApp(Context context, boolean z10) {
        File fileM6122o;
        int iM6092a;
        try {
            if (isThirdPartyApp(context) && (fileM6122o = C6785ak.m6068a().m6122o(context)) != null) {
                if (z10 && new File(fileM6122o, "core_info").exists()) {
                    return;
                }
                if (f6676c != null && (iM6092a = C6785ak.m6068a().m6092a(f6676c)) > 0) {
                    f6677d = f6676c;
                    f6679f = "AppDefined";
                    f6678e = iM6092a;
                    writeProperties(context, Integer.toString(iM6092a), f6679f, f6677d, Integer.toString(1));
                    return;
                }
                String[] coreProviderAppList = getCoreProviderAppList();
                for (String str : coreProviderAppList) {
                    int coreShareDecoupleCoreVersion = getCoreShareDecoupleCoreVersion(context, str);
                    if (coreShareDecoupleCoreVersion > 0) {
                        f6677d = C6785ak.m6068a().m6108c(context, m5924a(context, str)).getAbsolutePath();
                        f6679f = str;
                        f6678e = coreShareDecoupleCoreVersion;
                        if (QbSdk.canLoadX5FirstTimeThirdApp(context)) {
                            writeProperties(context, Integer.toString(f6678e), f6679f, f6677d, Integer.toString(C6845b.m6275b(context)));
                            Log.e("0411", "writeProperties is " + f6678e);
                            return;
                        }
                        f6678e = 0;
                        f6677d = null;
                        f6679f = null;
                    }
                }
                for (String str2 : coreProviderAppList) {
                    int sharedTbsCoreVersion = getSharedTbsCoreVersion(context, str2);
                    if (sharedTbsCoreVersion > 0) {
                        f6677d = C6785ak.m6068a().m6102b(context, m5924a(context, str2)).getAbsolutePath();
                        f6679f = str2;
                        f6678e = sharedTbsCoreVersion;
                        if (QbSdk.canLoadX5FirstTimeThirdApp(context)) {
                            writeProperties(context, Integer.toString(f6678e), f6679f, f6677d, Integer.toString(C6845b.m6275b(context)));
                            return;
                        } else {
                            f6678e = 0;
                            f6677d = null;
                            f6679f = null;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public static synchronized int m5935g(Context context) {
        Throwable th;
        BufferedInputStream bufferedInputStream;
        try {
            File fileM5927b = m5927b(context, "core_info");
            if (fileM5927b == null) {
                return 0;
            }
            bufferedInputStream = new BufferedInputStream(new FileInputStream(fileM5927b));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                String property = properties.getProperty("core_version", "");
                if ("".equals(property)) {
                    try {
                        bufferedInputStream.close();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    return 0;
                }
                int iMax = Math.max(Integer.parseInt(property), 0);
                try {
                    bufferedInputStream.close();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                return iMax;
            } catch (Throwable th2) {
                th = th2;
                try {
                    th.printStackTrace();
                    return -2;
                } finally {
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
        }
    }

    public static boolean getCoreDisabled() {
        return f6680g;
    }

    public static boolean getCoreFormOwn() {
        return f6683j;
    }

    public static String[] getCoreProviderAppList() {
        return new String[0];
    }

    public static int getCoreShareDecoupleCoreVersion(Context context, String str) {
        Context contextM5924a = m5924a(context, str);
        if (contextM5924a != null) {
            return C6785ak.m6068a().m6114g(contextM5924a);
        }
        return 0;
    }

    public static String getHostCorePathAppDefined() {
        return f6676c;
    }

    public static long getHostCoreVersions(Context context) {
        long sharedTbsCoreVersion;
        long sharedTbsCoreVersion2;
        long j10;
        long j11 = 0;
        for (String str : getCoreProviderAppList()) {
            if (str.equalsIgnoreCase(TbsConfig.APP_WX)) {
                sharedTbsCoreVersion2 = getSharedTbsCoreVersion(context, str);
                j10 = 10000000000L;
            } else if (str.equalsIgnoreCase(TbsConfig.APP_QQ)) {
                sharedTbsCoreVersion2 = getSharedTbsCoreVersion(context, str);
                j10 = 100000;
            } else if (str.equalsIgnoreCase(TbsConfig.APP_QZONE)) {
                sharedTbsCoreVersion = getSharedTbsCoreVersion(context, str);
                j11 += sharedTbsCoreVersion;
            }
            sharedTbsCoreVersion = sharedTbsCoreVersion2 * j10;
            j11 += sharedTbsCoreVersion;
        }
        return j11;
    }

    public static int getSharedTbsCoreVersion(Context context, String str) {
        Context contextM5924a = m5924a(context, str);
        if (contextM5924a != null) {
            return C6785ak.m6068a().m6115h(contextM5924a);
        }
        return 0;
    }

    /* renamed from: h */
    public static boolean m5936h(Context context) {
        try {
            if (f6678e == 0) {
                findCoreForThirdPartyApp(context);
            }
            int i10 = f6678e;
            if (i10 == 0) {
                TbsLog.addLog(TbsLog.TBSLOG_CODE_SDK_NO_SHARE_X5CORE, null, new Object[0]);
                return false;
            }
            if (f6676c == null) {
                if (i10 != 0 && getSharedTbsCoreVersion(context, f6679f) == f6678e) {
                    return true;
                }
            } else if (i10 != 0 && C6785ak.m6068a().m6092a(f6676c) == f6678e) {
                return true;
            }
            if (m5939k(context)) {
                return true;
            }
            TbsCoreLoadStat.getInstance().m5852a(context, TbsListener.ErrorCode.INFO_CORE_EXIST_NOT_LOAD, new Throwable("mAvailableCoreVersion=" + f6678e + "; mSrcPackageName=" + f6679f + "; getSharedTbsCoreVersion(ctx, mSrcPackageName) is " + getSharedTbsCoreVersion(context, f6679f) + "; getHostCoreVersions is " + getHostCoreVersions(context)));
            f6677d = null;
            f6678e = 0;
            TbsLog.addLog(TbsLog.TBSLOG_CODE_SDK_CONFLICT_X5CORE, null, new Object[0]);
            QbSdk.m5839a(context, "TbsShareManager::isShareTbsCoreAvailableInner forceSysWebViewInner!");
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            TbsLog.addLog(TbsLog.TBSLOG_CODE_SDK_UNAVAIL_X5CORE, null, new Object[0]);
            return false;
        }
    }

    /* renamed from: i */
    public static boolean m5937i(Context context) {
        return m5929b(context, true);
    }

    public static boolean isThirdPartyApp(Context context) {
        Context context2;
        try {
            context2 = f6674a;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (context2 != null && context2.equals(context.getApplicationContext())) {
            return f6675b;
        }
        Context applicationContext = context.getApplicationContext();
        f6674a = applicationContext;
        String packageName = applicationContext.getPackageName();
        for (String str : getCoreProviderAppList()) {
            if (packageName.equals(str)) {
                f6675b = false;
                return false;
            }
        }
        f6675b = true;
        return true;
    }

    /* renamed from: j */
    private static boolean m5938j(Context context) {
        String str = f6679f;
        if (str == null) {
            return false;
        }
        return f6678e == getSharedTbsCoreVersion(context, str) || f6678e == getCoreShareDecoupleCoreVersion(context, f6679f);
    }

    /* renamed from: k */
    private static boolean m5939k(Context context) {
        String str;
        File fileM6108c;
        String[] coreProviderAppList = getCoreProviderAppList();
        int length = coreProviderAppList.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                int length2 = coreProviderAppList.length;
                for (int i11 = 0; i11 < length2; i11++) {
                    str = coreProviderAppList[i11];
                    int i12 = f6678e;
                    if (i12 > 0 && i12 == getCoreShareDecoupleCoreVersion(context, str)) {
                        Context contextM5924a = m5924a(context, str);
                        if (C6785ak.m6068a().m6112e(context)) {
                            fileM6108c = C6785ak.m6068a().m6108c(context, contextM5924a);
                        }
                    }
                }
                return false;
            }
            str = coreProviderAppList[i10];
            int i13 = f6678e;
            if (i13 > 0 && i13 == getSharedTbsCoreVersion(context, str)) {
                Context contextM5924a2 = m5924a(context, str);
                if (C6785ak.m6068a().m6112e(context)) {
                    fileM6108c = C6785ak.m6068a().m6102b(context, contextM5924a2);
                    break;
                }
            }
            i10++;
        }
        f6677d = fileM6108c.getAbsolutePath();
        f6679f = str;
        return true;
    }

    /* renamed from: l */
    private static boolean m5940l(Context context) throws IOException {
        if (context == null) {
            return false;
        }
        writeProperties(context, Integer.toString(0), "", "", Integer.toString(0));
        return true;
    }

    /* renamed from: m */
    private static synchronized void m5941m(Context context) {
        Throwable th;
        BufferedInputStream bufferedInputStream;
        File fileM5927b;
        Context context2;
        if (f6684k) {
            return;
        }
        try {
            try {
                fileM5927b = m5927b(context, "core_info");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = null;
        }
        if (fileM5927b == null) {
            return;
        }
        bufferedInputStream = new BufferedInputStream(new FileInputStream(fileM5927b));
        try {
            Properties properties = new Properties();
            properties.load(bufferedInputStream);
            String property = properties.getProperty("core_version", "");
            if (!"".equals(property)) {
                f6678e = Math.max(Integer.parseInt(property), 0);
            }
            String property2 = properties.getProperty("core_packagename", "");
            if (!"".equals(property2)) {
                f6679f = property2;
            }
            String str = f6679f;
            if (str != null && (context2 = f6674a) != null) {
                if (str.equals(context2.getPackageName())) {
                    f6683j = true;
                } else {
                    f6683j = false;
                }
            }
            String property3 = properties.getProperty("core_path", "");
            if (!"".equals(property3)) {
                f6677d = property3;
            }
            String property4 = properties.getProperty("app_version", "");
            if (!"".equals(property4)) {
                f6682i = property4;
            }
            f6680g = Boolean.parseBoolean(properties.getProperty("core_disabled", "false"));
            f6684k = true;
            bufferedInputStream.close();
        } catch (Throwable th3) {
            th = th3;
            try {
                th.printStackTrace();
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            } finally {
            }
        }
    }

    public static void setHostCorePathAppDefined(String str) {
        f6676c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0187, code lost:
    
        if (r4.equals(r9.getApplicationContext().getPackageName()) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0189, code lost:
    
        com.tencent.smtt.utils.TbsLog.m6248i("TbsShareManager", "thirdAPP pre--> delete old core_share Directory:" + r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a7, code lost:
    
        com.tencent.smtt.utils.C6854k.m6317b(com.tencent.smtt.sdk.C6785ak.m6068a().m6121n(r9));
        com.tencent.smtt.utils.TbsLog.m6248i("TbsShareManager", "thirdAPP success--> delete old core_share Directory");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b2, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b3, code lost:
    
        r11.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x022a, code lost:
    
        if (r4.equals(r9.getApplicationContext().getPackageName()) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x022c, code lost:
    
        com.tencent.smtt.utils.TbsLog.m6248i("TbsShareManager", "thirdAPP pre--> delete old core_share Directory:" + r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x024a, code lost:
    
        com.tencent.smtt.utils.C6854k.m6317b(com.tencent.smtt.sdk.C6785ak.m6068a().m6121n(r9));
        com.tencent.smtt.utils.TbsLog.m6248i("TbsShareManager", "thirdAPP success--> delete old core_share Directory");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0255, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0256, code lost:
    
        r11.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x029b A[EDGE_INSN: B:128:0x029b->B:105:0x029b BREAK  A[LOOP:1: B:63:0x0151->B:104:0x0297], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0150 A[Catch: all -> 0x0015, TRY_ENTER, TryCatch #4 {, blocks: (B:5:0x0005, B:10:0x0018, B:12:0x001e, B:16:0x002d, B:22:0x0044, B:25:0x0054, B:27:0x005a, B:28:0x0066, B:30:0x006c, B:32:0x0078, B:39:0x00b8, B:42:0x00bd, B:44:0x00c9, B:46:0x00cd, B:48:0x00d5, B:51:0x00f3, B:58:0x0147, B:62:0x0150, B:64:0x0153, B:66:0x015b, B:69:0x017b, B:71:0x0189, B:75:0x01b3, B:76:0x01b6, B:83:0x01f3, B:84:0x01f8, B:86:0x01fe, B:89:0x021e, B:91:0x022c, B:95:0x0256, B:96:0x0259, B:72:0x01a7, B:92:0x024a, B:52:0x0104, B:55:0x0122, B:33:0x0087, B:36:0x0093), top: B:117:0x0003, inners: #1, #3, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0153 A[Catch: all -> 0x0015, TryCatch #4 {, blocks: (B:5:0x0005, B:10:0x0018, B:12:0x001e, B:16:0x002d, B:22:0x0044, B:25:0x0054, B:27:0x005a, B:28:0x0066, B:30:0x006c, B:32:0x0078, B:39:0x00b8, B:42:0x00bd, B:44:0x00c9, B:46:0x00cd, B:48:0x00d5, B:51:0x00f3, B:58:0x0147, B:62:0x0150, B:64:0x0153, B:66:0x015b, B:69:0x017b, B:71:0x0189, B:75:0x01b3, B:76:0x01b6, B:83:0x01f3, B:84:0x01f8, B:86:0x01fe, B:89:0x021e, B:91:0x022c, B:95:0x0256, B:96:0x0259, B:72:0x01a7, B:92:0x024a, B:52:0x0104, B:55:0x0122, B:33:0x0087, B:36:0x0093), top: B:117:0x0003, inners: #1, #3, #5, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void writeCoreInfoForThirdPartyApp(android.content.Context r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsShareManager.writeCoreInfoForThirdPartyApp(android.content.Context, int, boolean):void");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0085 -> B:70:0x00a0). Please report as a decompilation issue!!! */
    public static void writeProperties(Context context, String str, String str2, String str3, String str4) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        File fileM5927b;
        Properties properties;
        int i10;
        BufferedOutputStream bufferedOutputStream2;
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                fileM5927b = m5927b(context, "core_info");
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (fileM5927b == null) {
            TbsDownloadConfig.getInstance(f6674a).setDownloadInterruptCode(-405);
            return;
        }
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(fileM5927b));
        try {
            properties = new Properties();
            properties.load(bufferedInputStream2);
            try {
                i10 = Integer.parseInt(str);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 != 0) {
                properties.setProperty("core_version", str);
                properties.setProperty("core_disabled", String.valueOf(false));
                properties.setProperty("core_packagename", str2);
                properties.setProperty("core_path", str3);
                properties.setProperty("app_version", str4);
            } else {
                properties.setProperty("core_disabled", String.valueOf(true));
            }
            bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(fileM5927b));
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream = null;
        }
        try {
            properties.store(bufferedOutputStream2, (String) null);
            f6684k = false;
            TbsDownloadConfig.getInstance(f6674a).setDownloadInterruptCode(-406);
            try {
                bufferedInputStream2.close();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            bufferedOutputStream2.close();
        } catch (Throwable th3) {
            bufferedOutputStream = bufferedOutputStream2;
            th = th3;
            bufferedInputStream = bufferedInputStream2;
            try {
                th.printStackTrace();
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
            } finally {
            }
        }
    }

    /* renamed from: a */
    public static Context m5924a(Context context, String str) {
        try {
            return context.createPackageContext(str, 2);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static void m5928b(Context context) {
        try {
            m5926a(context, new TbsLinuxToolsJni(context), C6785ak.m6068a().m6120m(context));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: c */
    private static void m5931c(Context context, boolean z10) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        File fileM5927b;
        Properties properties;
        BufferedInputStream bufferedInputStream = null;
        try {
            fileM5927b = m5927b(context, "core_info");
        } catch (Throwable th) {
            th = th;
            bufferedOutputStream = null;
        }
        if (fileM5927b == null) {
            return;
        }
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(fileM5927b));
        try {
            properties = new Properties();
            properties.load(bufferedInputStream2);
            properties.setProperty("core_disabled", String.valueOf(false));
            if (z10) {
                String absolutePath = C6785ak.m6068a().m6121n(context).getAbsolutePath();
                String packageName = context.getApplicationContext().getPackageName();
                int iM6275b = C6845b.m6275b(context);
                properties.setProperty("core_packagename", packageName);
                properties.setProperty("core_path", absolutePath);
                properties.setProperty("app_version", String.valueOf(iM6275b));
            }
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileM5927b));
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream = null;
        }
        try {
            try {
                properties.store(bufferedOutputStream, (String) null);
                try {
                    bufferedInputStream2.close();
                } catch (Exception unused) {
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = bufferedInputStream2;
                try {
                    th.printStackTrace();
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Exception unused2) {
                        }
                    }
                    if (bufferedOutputStream == null) {
                        return;
                    }
                    bufferedOutputStream.close();
                } finally {
                }
            }
            bufferedOutputStream.close();
        } catch (Exception unused3) {
        }
    }

    /* renamed from: a */
    public static void m5925a(Context context) {
        try {
            TbsLinuxToolsJni tbsLinuxToolsJni = new TbsLinuxToolsJni(context);
            m5926a(context, tbsLinuxToolsJni, C6785ak.m6068a().m6121n(context));
            tbsLinuxToolsJni.m5876a(C6785ak.m6068a().m6122o(context).getAbsolutePath(), "755");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    public static boolean m5929b(Context context, boolean z10) {
        if (m5936h(context)) {
            return true;
        }
        if (!z10) {
            return false;
        }
        QbSdk.m5839a(context, "TbsShareManager::isShareTbsCoreAvailable forceSysWebViewInner!");
        return false;
    }

    /* renamed from: a */
    private static void m5926a(Context context, TbsLinuxToolsJni tbsLinuxToolsJni, File file) {
        if (file != null && file.exists() && file.isDirectory()) {
            tbsLinuxToolsJni.m5876a(file.getAbsolutePath(), "755");
            for (File file2 : file.listFiles()) {
                if (file2.isFile()) {
                    int iIndexOf = file2.getAbsolutePath().indexOf(".so");
                    String absolutePath = file2.getAbsolutePath();
                    if (iIndexOf > 0) {
                        tbsLinuxToolsJni.m5876a(absolutePath, "755");
                    } else {
                        tbsLinuxToolsJni.m5876a(absolutePath, "644");
                    }
                } else if (file2.isDirectory()) {
                    m5926a(context, tbsLinuxToolsJni, file2);
                } else {
                    TbsLog.m6247e("TbsShareManager", "unknown file type.", true);
                }
            }
        }
    }
}
