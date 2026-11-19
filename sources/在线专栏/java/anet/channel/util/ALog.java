package anet.channel.util;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
public class ALog {
    private static Object LOG_BREAK;
    private static boolean canUseTlog;
    private static boolean isPrintLog;
    private static volatile ILog log;
    public static Logcat logcat;

    public interface ILog {
        /* renamed from: d */
        void mo4394d(String str, String str2);

        /* renamed from: e */
        void mo4395e(String str, String str2);

        /* renamed from: e */
        void mo4396e(String str, String str2, Throwable th);

        /* renamed from: i */
        void mo4397i(String str, String str2);

        boolean isPrintLog(int i4);

        boolean isValid();

        void setLogLevel(int i4);

        /* renamed from: w */
        void mo4398w(String str, String str2);

        /* renamed from: w */
        void mo4399w(String str, String str2, Throwable th);
    }

    public static class Level {

        /* renamed from: D */
        public static final int f5464D = 1;

        /* renamed from: E */
        public static final int f5465E = 4;

        /* renamed from: I */
        public static final int f5466I = 2;

        /* renamed from: N */
        public static final int f5467N = 5;

        /* renamed from: V */
        public static final int f5468V = 0;

        /* renamed from: W */
        public static final int f5469W = 3;
    }

    public static class Logcat implements ILog {
        int defaultLevel = 1;

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: d */
        public void mo4394d(String str, String str2) {
            Log.d(str, str2);
        }

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: e */
        public void mo4395e(String str, String str2) {
            Log.e(str, str2);
        }

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: i */
        public void mo4397i(String str, String str2) {
            Log.i(str, str2);
        }

        @Override // anet.channel.util.ALog.ILog
        public boolean isPrintLog(int i4) {
            return i4 >= this.defaultLevel;
        }

        @Override // anet.channel.util.ALog.ILog
        public boolean isValid() {
            return true;
        }

        @Override // anet.channel.util.ALog.ILog
        public void setLogLevel(int i4) {
            if (i4 < 0 || i4 > 5) {
                this.defaultLevel = 5;
            } else {
                this.defaultLevel = i4;
            }
        }

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: w */
        public void mo4398w(String str, String str2) {
            Log.w(str, str2);
        }

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: e */
        public void mo4396e(String str, String str2, Throwable th) {
            Log.e(str, str2, th);
        }

        @Override // anet.channel.util.ALog.ILog
        /* renamed from: w */
        public void mo4399w(String str, String str2, Throwable th) {
            Log.w(str, str2, th);
        }
    }

    static {
        Logcat logcat2 = new Logcat();
        logcat = logcat2;
        log = logcat2;
        LOG_BREAK = "|";
        isPrintLog = true;
        canUseTlog = true;
    }

    private static String buildLogMsg(String str, String str2, Object... objArr) {
        if (str == null && str2 == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(64);
        if (!TextUtils.isEmpty(str2)) {
            sb.append(LOG_BREAK);
            sb.append("[seq:");
            sb.append(str2);
            sb.append("]");
        }
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
                sb.append(objArr[i4] != null ? objArr[i4] : "");
                sb.append(":");
                sb.append(objArr[i5] != null ? objArr[i5] : "");
                i4 += 2;
            }
            if (i4 < objArr.length) {
                sb.append(" ");
                sb.append(objArr[i4]);
            }
        }
        return sb.toString();
    }

    private static String buildLogTag(String str) {
        return str;
    }

    /* renamed from: d */
    public static void m4636d(String str, String str2, String str3, Object... objArr) {
        if (!isPrintLog(1) || log == null) {
            return;
        }
        log.mo4394d(buildLogTag(str), buildLogMsg(str2, str3, objArr));
    }

    /* renamed from: e */
    public static void m4638e(String str, String str2, String str3, Object... objArr) {
        if (!isPrintLog(4) || log == null) {
            return;
        }
        log.mo4395e(buildLogTag(str), buildLogMsg(str2, str3, objArr));
    }

    public static ILog getLog() {
        return log;
    }

    /* renamed from: i */
    public static void m4639i(String str, String str2, String str3, Object... objArr) {
        if (!isPrintLog(2) || log == null) {
            return;
        }
        log.mo4397i(buildLogTag(str), buildLogMsg(str2, str3, objArr));
    }

    public static boolean isPrintLog(int i4) {
        if (isPrintLog && log != null) {
            return log.isPrintLog(i4);
        }
        return false;
    }

    public static void setLevel(int i4) {
        if (log != null) {
            log.setLogLevel(i4);
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

    public static void setPrintLog(boolean z3) {
        isPrintLog = z3;
    }

    @Deprecated
    public static void setUseTlog(boolean z3) {
        if (z3) {
            canUseTlog = true;
        } else {
            canUseTlog = false;
            log = logcat;
        }
    }

    /* renamed from: w */
    public static void m4641w(String str, String str2, String str3, Object... objArr) {
        if (!isPrintLog(3) || log == null) {
            return;
        }
        log.mo4398w(buildLogTag(str), buildLogMsg(str2, str3, objArr));
    }

    /* renamed from: e */
    public static void m4637e(String str, String str2, String str3, Throwable th, Object... objArr) {
        if (!isPrintLog(4) || log == null) {
            return;
        }
        log.mo4396e(buildLogTag(str), buildLogMsg(str2, str3, objArr), th);
    }

    /* renamed from: w */
    public static void m4640w(String str, String str2, String str3, Throwable th, Object... objArr) {
        if (!isPrintLog(3) || log == null) {
            return;
        }
        log.mo4399w(buildLogTag(str), buildLogMsg(str2, str3, objArr), th);
    }
}
