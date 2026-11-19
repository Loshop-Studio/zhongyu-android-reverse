package anet.channel.util;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* loaded from: classes3.dex */
public class ALog {
    private static Object LOG_BREAK;
    private static boolean canUseTlog;
    private static boolean isPrintLog;
    private static volatile ILog log;
    public static Logcat logcat;

    public interface ILog {
        /* renamed from: d */
        void mo2285d(String str, String str2);

        /* renamed from: e */
        void mo2286e(String str, String str2);

        /* renamed from: e */
        void mo2287e(String str, String str2, Throwable th);

        /* renamed from: i */
        void mo2288i(String str, String str2);

        boolean isPrintLog(int i10);

        boolean isValid();

        void setLogLevel(int i10);

        /* renamed from: w */
        void mo2289w(String str, String str2);

        /* renamed from: w */
        void mo2290w(String str, String str2, Throwable th);
    }

    public static class Level {

        /* renamed from: D */
        public static final int f2742D = 1;

        /* renamed from: E */
        public static final int f2743E = 4;

        /* renamed from: I */
        public static final int f2744I = 2;

        /* renamed from: N */
        public static final int f2745N = 5;

        /* renamed from: V */
        public static final int f2746V = 0;

        /* renamed from: W */
        public static final int f2747W = 3;
    }

    public static class Logcat implements ILog {
        int defaultLevel = 1;

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: d */
        public void mo2285d(String str, String str2) {
        }

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: e */
        public void mo2286e(String str, String str2) {
            Log.e(str, str2);
        }

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: i */
        public void mo2288i(String str, String str2) {
            Log.i(str, str2);
        }

        @Override // anet.channel.util.ALog.ILog
        public boolean isPrintLog(int i10) {
            return i10 >= this.defaultLevel;
        }

        @Override // anet.channel.util.ALog.ILog
        public boolean isValid() {
            return true;
        }

        @Override // anet.channel.util.ALog.ILog
        public void setLogLevel(int i10) {
            if (i10 < 0 || i10 > 5) {
                this.defaultLevel = 5;
            } else {
                this.defaultLevel = i10;
            }
        }

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: w */
        public void mo2289w(String str, String str2) {
            Log.w(str, str2);
        }

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: e */
        public void mo2287e(String str, String str2, Throwable th) {
            Log.e(str, str2, th);
        }

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: w */
        public void mo2290w(String str, String str2, Throwable th) {
            Log.w(str, str2, th);
        }
    }

    static {
        Logcat logcat2 = new Logcat();
        logcat = logcat2;
        log = logcat2;
        LOG_BREAK = HiAnalyticsConstant.REPORT_VAL_SEPARATOR;
        isPrintLog = true;
        canUseTlog = true;
    }

    private static String buildLogMsg(String str, String str2, Object... objArr) {
        if (str == null && str2 == null && objArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(64);
        if (!TextUtils.isEmpty(str2)) {
            sb2.append(LOG_BREAK);
            sb2.append("[seq:");
            sb2.append(str2);
            sb2.append("]");
        }
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
                Object obj = objArr[i10];
                if (obj == null) {
                    obj = "";
                }
                sb2.append(obj);
                sb2.append(":");
                Object obj2 = objArr[i11];
                if (obj2 == null) {
                    obj2 = "";
                }
                sb2.append(obj2);
                i10 += 2;
            }
            if (i10 < objArr.length) {
                sb2.append(" ");
                sb2.append(objArr[i10]);
            }
        }
        return sb2.toString();
    }

    private static String buildLogTag(String str) {
        return str;
    }

    /* renamed from: d */
    public static void m2527d(String str, String str2, String str3, Object... objArr) {
        if (!isPrintLog(1) || log == null) {
            return;
        }
        log.mo2285d(buildLogTag(str), buildLogMsg(str2, str3, objArr));
    }

    /* renamed from: e */
    public static void m2529e(String str, String str2, String str3, Object... objArr) {
        if (!isPrintLog(4) || log == null) {
            return;
        }
        log.mo2286e(buildLogTag(str), buildLogMsg(str2, str3, objArr));
    }

    public static ILog getLog() {
        return log;
    }

    /* renamed from: i */
    public static void m2530i(String str, String str2, String str3, Object... objArr) {
        if (!isPrintLog(2) || log == null) {
            return;
        }
        log.mo2288i(buildLogTag(str), buildLogMsg(str2, str3, objArr));
    }

    public static boolean isPrintLog(int i10) {
        if (isPrintLog && log != null) {
            return log.isPrintLog(i10);
        }
        return false;
    }

    public static void setLevel(int i10) {
        if (log != null) {
            log.setLogLevel(i10);
        }
    }

    public static void setLog(ILog iLog) {
        if (iLog == null) {
            return;
        }
        if ((canUseTlog || !iLog.getClass().getSimpleName().toLowerCase().contains("tlog")) && iLog.isValid()) {
            log = iLog;
        }
    }

    public static void setPrintLog(boolean z10) {
        isPrintLog = z10;
    }

    @Deprecated
    public static void setUseTlog(boolean z10) {
        if (z10) {
            canUseTlog = true;
        } else {
            canUseTlog = false;
            log = logcat;
        }
    }

    /* renamed from: w */
    public static void m2532w(String str, String str2, String str3, Object... objArr) {
        if (!isPrintLog(3) || log == null) {
            return;
        }
        log.mo2289w(buildLogTag(str), buildLogMsg(str2, str3, objArr));
    }

    /* renamed from: e */
    public static void m2528e(String str, String str2, String str3, Throwable th, Object... objArr) {
        if (!isPrintLog(4) || log == null) {
            return;
        }
        log.mo2287e(buildLogTag(str), buildLogMsg(str2, str3, objArr), th);
    }

    /* renamed from: w */
    public static void m2531w(String str, String str2, String str3, Throwable th, Object... objArr) {
        if (!isPrintLog(3) || log == null) {
            return;
        }
        log.mo2290w(buildLogTag(str), buildLogMsg(str2, str3, objArr), th);
    }
}
