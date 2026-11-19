package com.taobao.accs.utl;

import anet.channel.util.ALog;
import com.alibaba.sdk.android.logger.ILog;
import com.alibaba.sdk.android.logger.LogLevel;

@Deprecated
/* loaded from: classes5.dex */
public class ALog {
    private static final ILog LOG = AccsLogger.getLogger("DefaultLog");

    public enum Level {
        V,
        D,
        I,
        W,
        E,
        L
    }

    private static String buildLogMsg(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            sb2.append(" ");
            sb2.append(str);
        }
        if (objArr != null) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i11 >= objArr.length) {
                    break;
                }
                sb2.append(" ");
                sb2.append(formatKv(objArr[i10], objArr[i11]));
                i10 += 2;
            }
            if (i10 == objArr.length - 1) {
                sb2.append(" ");
                sb2.append(objArr[i10]);
            }
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public static void m10116d(String str, String str2, Object... objArr) {
        LOG.mo3533d("[" + str + "]" + buildLogMsg(str2, objArr));
    }

    /* renamed from: e */
    public static void m10118e(String str, String str2, Object... objArr) {
        LOG.mo3535e("[" + str + "]" + buildLogMsg(str2, objArr));
    }

    private static String formatKv(Object obj, Object obj2) {
        StringBuilder sb2 = new StringBuilder();
        if (obj == null) {
            obj = "";
        }
        sb2.append(obj);
        sb2.append(":");
        if (obj2 == null) {
            obj2 = "";
        }
        sb2.append(obj2);
        return sb2.toString();
    }

    /* renamed from: i */
    public static void m10119i(String str, String str2, Object... objArr) {
        LOG.mo3538i("[" + str + "]" + buildLogMsg(str2, objArr));
    }

    @Deprecated
    public static void initALog(String str, int i10) {
    }

    @Deprecated
    public static boolean isPrintLog() {
        return true;
    }

    @Deprecated
    private static boolean isTLogExist() {
        return false;
    }

    @Deprecated
    public static void setEnableTLog(boolean z10) {
    }

    @Deprecated
    public static void setLogLevel(Level level) {
        LogLevel logLevel = LogLevel.ERROR;
        switch (C7676b.f13227b[level.ordinal()]) {
            case 1:
            case 2:
                logLevel = LogLevel.DEBUG;
                break;
            case 3:
                logLevel = LogLevel.INFO;
                break;
            case 4:
                logLevel = LogLevel.WARN;
                break;
        }
        AccsLogger.setLevel(logLevel);
    }

    @Deprecated
    public static void setLogger(ALog.ILog iLog) {
        if (iLog != null) {
            AccsLogger.addILogger(new C7675a(iLog));
        }
    }

    public static void setPrintLog(boolean z10) {
        AccsLogger.enable(z10);
    }

    @Deprecated
    public static void setUseTlog(boolean z10) {
    }

    /* renamed from: v */
    public static void m10120v(String str, String str2, Object... objArr) {
        LOG.mo3533d("[" + str + "]" + buildLogMsg(str2, objArr));
    }

    /* renamed from: w */
    public static void m10122w(String str, String str2, Object... objArr) {
        LOG.mo3540w("[" + str + "]" + buildLogMsg(str2, objArr));
    }

    /* renamed from: e */
    public static void m10117e(String str, String str2, Throwable th, Object... objArr) {
        LOG.mo3536e("[" + str + "]" + buildLogMsg(str2, objArr), th);
    }

    public static boolean isPrintLog(Level level) {
        return true;
    }

    /* renamed from: w */
    public static void m10121w(String str, String str2, Throwable th, Object... objArr) {
        LOG.mo3541w("[" + str + "]" + buildLogMsg(str2, objArr), th);
    }
}
