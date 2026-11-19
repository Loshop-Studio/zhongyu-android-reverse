package com.taobao.accs.utl;

import anet.channel.util.ALog;
import com.alibaba.sdk.android.logger.ILog;
import com.alibaba.sdk.android.logger.LogLevel;

@Deprecated
/* loaded from: classes.dex */
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
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        if (objArr != null) {
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i5 >= objArr.length) {
                    break;
                }
                sb.append(" ");
                sb.append(formatKv(objArr[i4], objArr[i5]));
                i4 = i5 + 1;
            }
            if (i4 == objArr.length - 1) {
                sb.append(" ");
                sb.append(objArr[i4]);
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static void m6090d(String str, String str2, Object... objArr) {
        LOG.mo5083d("[" + str + "]" + buildLogMsg(str2, objArr));
    }

    /* renamed from: e */
    public static void m6092e(String str, String str2, Object... objArr) {
        LOG.mo5085e("[" + str + "]" + buildLogMsg(str2, objArr));
    }

    private static String formatKv(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        if (obj == null) {
            obj = "";
        }
        sb.append(obj);
        sb.append(":");
        if (obj2 == null) {
            obj2 = "";
        }
        sb.append(obj2);
        return sb.toString();
    }

    /* renamed from: i */
    public static void m6093i(String str, String str2, Object... objArr) {
        LOG.mo5088i("[" + str + "]" + buildLogMsg(str2, objArr));
    }

    @Deprecated
    public static void initALog(String str, int i4) {
    }

    @Deprecated
    public static boolean isPrintLog() {
        return true;
    }

    public static boolean isPrintLog(Level level) {
        return true;
    }

    @Deprecated
    private static boolean isTLogExist() {
        return false;
    }

    @Deprecated
    public static void setEnableTLog(boolean z3) {
    }

    @Deprecated
    public static void setLogLevel(Level level) {
        LogLevel logLevel = LogLevel.ERROR;
        switch (C1779b.f7829b[level.ordinal()]) {
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
            AccsLogger.addILogger(new C1778a(iLog));
        }
    }

    public static void setPrintLog(boolean z3) {
        AccsLogger.enable(z3);
    }

    @Deprecated
    public static void setUseTlog(boolean z3) {
    }

    /* renamed from: v */
    public static void m6094v(String str, String str2, Object... objArr) {
        LOG.mo5083d("[" + str + "]" + buildLogMsg(str2, objArr));
    }

    /* renamed from: w */
    public static void m6096w(String str, String str2, Object... objArr) {
        LOG.mo5090w("[" + str + "]" + buildLogMsg(str2, objArr));
    }

    /* renamed from: e */
    public static void m6091e(String str, String str2, Throwable th, Object... objArr) {
        LOG.mo5086e("[" + str + "]" + buildLogMsg(str2, objArr), th);
    }

    /* renamed from: w */
    public static void m6095w(String str, String str2, Throwable th, Object... objArr) {
        LOG.mo5091w("[" + str + "]" + buildLogMsg(str2, objArr), th);
    }
}
