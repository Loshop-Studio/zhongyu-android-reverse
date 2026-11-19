package com.tencent.smtt.utils;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import android.widget.TextView;
import com.tencent.smtt.sdk.TbsConfig;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes4.dex */
public class TbsLog {
    public static final int TBSLOG_CODE_SDK_BASE = 1000;
    public static final int TBSLOG_CODE_SDK_CONFLICT_X5CORE = 993;
    public static final int TBSLOG_CODE_SDK_INIT = 999;
    public static final int TBSLOG_CODE_SDK_INVOKE_ERROR = 997;
    public static final int TBSLOG_CODE_SDK_LOAD_ERROR = 998;
    public static final int TBSLOG_CODE_SDK_NO_SHARE_X5CORE = 994;
    public static final int TBSLOG_CODE_SDK_SELF_MODE = 996;
    public static final int TBSLOG_CODE_SDK_THIRD_MODE = 995;
    public static final int TBSLOG_CODE_SDK_UNAVAIL_X5CORE = 992;
    public static final String X5LOGTAG = "x5logtag";

    /* renamed from: a */
    private static boolean f6943a = false;

    /* renamed from: b */
    private static boolean f6944b = true;

    /* renamed from: c */
    private static TbsLogClient f6945c;
    public static List<String> sTbsLogList = new LinkedList();
    public static int sLogMaxCount = 10;

    public static void addLog(int i10, String str, Object... objArr) {
        synchronized (sTbsLogList) {
            try {
                if (sTbsLogList.size() > sLogMaxCount) {
                    int size = sTbsLogList.size() - sLogMaxCount;
                    while (true) {
                        int i11 = size - 1;
                        if (size <= 0 || sTbsLogList.size() <= 0) {
                            break;
                        }
                        sTbsLogList.remove(0);
                        size = i11;
                    }
                }
                String str2 = null;
                if (str != null) {
                    try {
                        str2 = String.format(str, objArr);
                    } catch (Exception unused) {
                    }
                }
                if (str2 == null) {
                    str2 = "";
                }
                sTbsLogList.add(String.format("[%d][%d][%c][%d]%s", Long.valueOf(System.currentTimeMillis()), 1, '0', Integer.valueOf(i10), str2));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void app_extra(String str, Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            String[] strArr = {TbsConfig.APP_DEMO, TbsConfig.APP_QB, TbsConfig.APP_WX, TbsConfig.APP_QQ, TbsConfig.APP_DEMO_TEST, TbsConfig.APP_QZONE};
            String[] strArr2 = {"DEMO", "QB", "WX", "QQ", "TEST", "QZ"};
            int i10 = 0;
            while (true) {
                if (i10 >= 6) {
                    break;
                }
                if (applicationContext.getPackageName().contains(strArr[i10])) {
                    m6248i(str, "app_extra pid:" + Process.myPid() + "; APP_TAG:" + strArr2[i10] + "!");
                    break;
                }
                i10++;
            }
            if (i10 == 6) {
                m6248i(str, "app_extra pid:" + Process.myPid() + "; APP_TAG:OTHER!");
            }
        } catch (Throwable th) {
            m6252w(str, "app_extra exception:" + Log.getStackTraceString(th));
        }
    }

    /* renamed from: d */
    public static void m6244d(String str, String str2) {
    }

    /* renamed from: e */
    public static void m6246e(String str, String str2) {
        TbsLogClient tbsLogClient = f6945c;
        if (tbsLogClient == null) {
            return;
        }
        tbsLogClient.writeLog("(E)-" + str + "-TBS:" + str2);
    }

    public static String getTbsLogFilePath() {
        File file = TbsLogClient.f6947c;
        if (file != null) {
            return file.getAbsolutePath();
        }
        return null;
    }

    /* renamed from: i */
    public static void m6248i(String str, String str2) {
        TbsLogClient tbsLogClient = f6945c;
        if (tbsLogClient == null) {
            return;
        }
        tbsLogClient.writeLog("(I)-" + str + "-TBS:" + str2);
    }

    public static synchronized void initIfNeed(Context context) {
        if (f6945c == null) {
            setTbsLogClient(new TbsLogClient(context));
        }
    }

    public static void setLogView(TextView textView) {
        TbsLogClient tbsLogClient;
        if (textView == null || (tbsLogClient = f6945c) == null) {
            return;
        }
        tbsLogClient.setLogView(textView);
    }

    public static boolean setTbsLogClient(TbsLogClient tbsLogClient) {
        if (tbsLogClient == null) {
            return false;
        }
        f6945c = tbsLogClient;
        TbsLogClient.setWriteLogJIT(f6944b);
        return true;
    }

    public static void setWriteLogJIT(boolean z10) {
        f6944b = z10;
        if (f6945c == null) {
            return;
        }
        TbsLogClient.setWriteLogJIT(z10);
    }

    /* renamed from: v */
    public static void m6250v(String str, String str2) {
    }

    /* renamed from: w */
    public static void m6252w(String str, String str2) {
        TbsLogClient tbsLogClient = f6945c;
        if (tbsLogClient == null) {
            return;
        }
        tbsLogClient.writeLog("(W)-" + str + "-TBS:" + str2);
    }

    public static synchronized void writeLogToDisk() {
        TbsLogClient tbsLogClient = f6945c;
        if (tbsLogClient != null) {
            tbsLogClient.writeLogToDisk();
        }
    }

    /* renamed from: d */
    public static void m6245d(String str, String str2, boolean z10) {
        m6244d(str, str2);
        TbsLogClient tbsLogClient = f6945c;
        if (tbsLogClient != null && f6943a && z10) {
            tbsLogClient.showLog(str + ": " + str2);
        }
    }

    /* renamed from: e */
    public static void m6247e(String str, String str2, boolean z10) {
        m6246e(str, str2);
        TbsLogClient tbsLogClient = f6945c;
        if (tbsLogClient != null && f6943a && z10) {
            tbsLogClient.showLog(str + ": " + str2);
        }
    }

    /* renamed from: i */
    public static void m6249i(String str, String str2, boolean z10) {
        m6248i(str, str2);
        TbsLogClient tbsLogClient = f6945c;
        if (tbsLogClient != null && f6943a && z10) {
            tbsLogClient.showLog(str + ": " + str2);
        }
    }

    /* renamed from: v */
    public static void m6251v(String str, String str2, boolean z10) {
        m6250v(str, str2);
        TbsLogClient tbsLogClient = f6945c;
        if (tbsLogClient != null && f6943a && z10) {
            tbsLogClient.showLog(str + ": " + str2);
        }
    }

    /* renamed from: w */
    public static void m6253w(String str, String str2, boolean z10) {
        m6252w(str, str2);
        TbsLogClient tbsLogClient = f6945c;
        if (tbsLogClient != null && f6943a && z10) {
            tbsLogClient.showLog(str + ": " + str2);
        }
    }
}
