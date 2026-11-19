package com.tencent.mars.xlog;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.widget.Toast;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class Log {
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_ERROR = 4;
    public static final int LEVEL_FATAL = 5;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_NONE = 6;
    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_WARNING = 3;
    private static final String SYS_INFO;
    private static final String TAG = "mars.xlog.log";
    private static LogImp debugLog = null;
    private static int level = 6;
    private static LogImp logImp;
    private static Map<String, LogInstance> sLogInstanceMap;
    public static Context toastSupportContext;

    public interface LogImp {
        void appenderClose();

        void appenderFlush(long j4, boolean z3);

        void appenderOpen(int i4, int i5, String str, String str2, String str3, int i6);

        int getLogLevel(long j4);

        long getXlogInstance(String str);

        void logD(long j4, String str, String str2, String str3, int i4, int i5, long j5, long j6, String str4);

        void logE(long j4, String str, String str2, String str3, int i4, int i5, long j5, long j6, String str4);

        void logF(long j4, String str, String str2, String str3, int i4, int i5, long j5, long j6, String str4);

        void logI(long j4, String str, String str2, String str3, int i4, int i5, long j5, long j6, String str4);

        void logV(long j4, String str, String str2, String str3, int i4, int i5, long j5, long j6, String str4);

        void logW(long j4, String str, String str2, String str3, int i4, int i5, long j5, long j6, String str4);

        long openLogInstance(int i4, int i5, String str, String str2, String str3, int i6);

        void releaseXlogInstance(String str);

        void setAppenderMode(long j4, int i4);

        void setConsoleLogOpen(long j4, boolean z3);

        void setMaxAliveTime(long j4, long j5);

        void setMaxFileSize(long j4, long j5);
    }

    public static class LogInstance {
        private long mLogInstancePtr;
        private String mPrefix;

        public void appenderFlush() {
            if (Log.logImp == null || this.mLogInstancePtr == -1) {
                return;
            }
            Log.logImp.appenderFlush(this.mLogInstancePtr, false);
        }

        public void appenderFlushSync() {
            if (Log.logImp == null || this.mLogInstancePtr == -1) {
                return;
            }
            Log.logImp.appenderFlush(this.mLogInstancePtr, true);
        }

        /* renamed from: d */
        public void m2276d(String str, String str2, Object... objArr) {
            if (Log.logImp == null || getLogLevel() > 1 || this.mLogInstancePtr == -1) {
                return;
            }
            String str3 = objArr == null ? str2 : String.format(str2, objArr);
            if (str3 == null) {
                str3 = "";
            }
            Log.logImp.logD(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str3);
        }

        /* renamed from: e */
        public void m2277e(String str, String str2, Object... objArr) {
            if (Log.logImp == null || getLogLevel() > 4 || this.mLogInstancePtr == -1) {
                return;
            }
            String str3 = objArr == null ? str2 : String.format(str2, objArr);
            if (str3 == null) {
                str3 = "";
            }
            Log.logImp.logE(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str3);
        }

        /* renamed from: f */
        public void m2278f(String str, String str2, Object... objArr) {
            if (Log.logImp == null || getLogLevel() > 5 || this.mLogInstancePtr == -1) {
                return;
            }
            Log.logImp.logF(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), objArr == null ? str2 : String.format(str2, objArr));
        }

        public int getLogLevel() {
            if (Log.logImp == null || this.mLogInstancePtr == -1) {
                return 6;
            }
            return Log.logImp.getLogLevel(this.mLogInstancePtr);
        }

        /* renamed from: i */
        public void m2279i(String str, String str2, Object... objArr) {
            if (Log.logImp == null || getLogLevel() > 2 || this.mLogInstancePtr == -1) {
                return;
            }
            String str3 = objArr == null ? str2 : String.format(str2, objArr);
            if (str3 == null) {
                str3 = "";
            }
            Log.logImp.logI(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str3);
        }

        public void printErrStackTrace(String str, Throwable th, String str2, Object... objArr) {
            if (Log.logImp == null || getLogLevel() > 4 || this.mLogInstancePtr == -1) {
                return;
            }
            String str3 = objArr == null ? str2 : String.format(str2, objArr);
            if (str3 == null) {
                str3 = "";
            }
            Log.logImp.logE(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str3 + "  " + android.util.Log.getStackTraceString(th));
        }

        public void setConsoleLogOpen(boolean z3) {
            if (Log.logImp == null || this.mLogInstancePtr == -1) {
                return;
            }
            Log.logImp.setConsoleLogOpen(this.mLogInstancePtr, z3);
        }

        /* renamed from: v */
        public void m2280v(String str, String str2, Object... objArr) {
            if (Log.logImp == null || getLogLevel() > 0 || this.mLogInstancePtr == -1) {
                return;
            }
            String str3 = objArr == null ? str2 : String.format(str2, objArr);
            if (str3 == null) {
                str3 = "";
            }
            Log.logImp.logV(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str3);
        }

        /* renamed from: w */
        public void m2281w(String str, String str2, Object... objArr) {
            if (Log.logImp == null || getLogLevel() > 3 || this.mLogInstancePtr == -1) {
                return;
            }
            String str3 = objArr == null ? str2 : String.format(str2, objArr);
            if (str3 == null) {
                str3 = "";
            }
            Log.logImp.logW(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str3);
        }

        private LogInstance(int i4, int i5, String str, String str2, String str3, int i6) {
            this.mLogInstancePtr = -1L;
            this.mPrefix = null;
            if (Log.logImp != null) {
                this.mLogInstancePtr = Log.logImp.openLogInstance(i4, i5, str, str2, str3, i6);
                this.mPrefix = str3;
            }
        }
    }

    static {
        LogImp logImp2 = new LogImp() { // from class: com.tencent.mars.xlog.Log.1
            private Handler handler = new Handler(Looper.getMainLooper());

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void appenderClose() {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void appenderFlush(long j4, boolean z3) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void appenderOpen(int i4, int i5, String str, String str2, String str3, int i6) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public int getLogLevel(long j4) {
                return Log.level;
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public long getXlogInstance(String str) {
                return 0L;
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logD(long j4, String str, String str2, String str3, int i4, int i5, long j5, long j6, String str4) {
                int unused = Log.level;
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logE(long j4, String str, String str2, String str3, int i4, int i5, long j5, long j6, String str4) {
                if (Log.level <= 4) {
                    android.util.Log.e(str, str4);
                }
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logF(long j4, String str, String str2, String str3, int i4, int i5, long j5, long j6, final String str4) {
                if (Log.level > 5) {
                    return;
                }
                android.util.Log.e(str, str4);
                if (Log.toastSupportContext != null) {
                    this.handler.post(new Runnable() { // from class: com.tencent.mars.xlog.Log.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Toast.makeText(Log.toastSupportContext, str4, 1).show();
                        }
                    });
                }
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logI(long j4, String str, String str2, String str3, int i4, int i5, long j5, long j6, String str4) {
                if (Log.level <= 2) {
                    android.util.Log.i(str, str4);
                }
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logV(long j4, String str, String str2, String str3, int i4, int i5, long j5, long j6, String str4) {
                int unused = Log.level;
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logW(long j4, String str, String str2, String str3, int i4, int i5, long j5, long j6, String str4) {
                if (Log.level <= 3) {
                    android.util.Log.w(str, str4);
                }
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public long openLogInstance(int i4, int i5, String str, String str2, String str3, int i6) {
                return 0L;
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void releaseXlogInstance(String str) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void setAppenderMode(long j4, int i4) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void setConsoleLogOpen(long j4, boolean z3) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void setMaxAliveTime(long j4, long j5) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void setMaxFileSize(long j4, long j5) {
            }
        };
        debugLog = logImp2;
        logImp = logImp2;
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("VERSION.RELEASE:[" + Build.VERSION.RELEASE);
            sb.append("] VERSION.CODENAME:[" + Build.VERSION.CODENAME);
            sb.append("] VERSION.INCREMENTAL:[" + Build.VERSION.INCREMENTAL);
            sb.append("] BOARD:[" + Build.BOARD);
            sb.append("] DEVICE:[" + Build.DEVICE);
            sb.append("] DISPLAY:[" + Build.DISPLAY);
            sb.append("] FINGERPRINT:[" + Build.FINGERPRINT);
            sb.append("] HOST:[" + Build.HOST);
            sb.append("] MANUFACTURER:[" + Build.MANUFACTURER);
            sb.append("] MODEL:[" + Build.MODEL);
            sb.append("] PRODUCT:[" + Build.PRODUCT);
            sb.append("] TAGS:[" + Build.TAGS);
            sb.append("] TYPE:[" + Build.TYPE);
            sb.append("] USER:[" + Build.USER + "]");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        SYS_INFO = sb.toString();
        sLogInstanceMap = new HashMap();
    }

    public static void appenderClose() {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderClose();
            Iterator<Map.Entry<String, LogInstance>> it = sLogInstanceMap.entrySet().iterator();
            while (it.hasNext()) {
                closeLogInstance(it.next().getKey());
            }
        }
    }

    public static void appenderFlush() {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderFlush(0L, false);
            Iterator<Map.Entry<String, LogInstance>> it = sLogInstanceMap.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().appenderFlush();
            }
        }
    }

    public static void appenderFlushSync(boolean z3) {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderFlush(0L, z3);
        }
    }

    public static void appenderOpen(int i4, int i5, String str, String str2, String str3, int i6) {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderOpen(i4, i5, str, str2, str3, i6);
        }
    }

    public static void closeLogInstance(String str) {
        synchronized (sLogInstanceMap) {
            if (logImp != null && sLogInstanceMap.containsKey(str)) {
                LogInstance logInstanceRemove = sLogInstanceMap.remove(str);
                logImp.releaseXlogInstance(str);
                logInstanceRemove.mLogInstancePtr = -1L;
            }
        }
    }

    /* renamed from: d */
    public static void m2264d(String str, String str2) {
        m2265d(str, str2, null);
    }

    /* renamed from: e */
    public static void m2266e(String str, String str2) {
        m2267e(str, str2, null);
    }

    /* renamed from: f */
    public static void m2268f(String str, String str2) {
        m2269f(str, str2, null);
    }

    public static LogImp getImpl() {
        return logImp;
    }

    public static LogInstance getLogInstance(String str) {
        synchronized (sLogInstanceMap) {
            if (!sLogInstanceMap.containsKey(str)) {
                return null;
            }
            return sLogInstanceMap.get(str);
        }
    }

    public static int getLogLevel() {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            return logImp2.getLogLevel(0L);
        }
        return 6;
    }

    public static String getSysInfo() {
        return SYS_INFO;
    }

    /* renamed from: i */
    public static void m2270i(String str, String str2) {
        m2271i(str, str2, null);
    }

    public static LogInstance openLogInstance(int i4, int i5, String str, String str2, String str3, int i6) {
        synchronized (sLogInstanceMap) {
            if (sLogInstanceMap.containsKey(str3)) {
                return sLogInstanceMap.get(str3);
            }
            LogInstance logInstance = new LogInstance(i4, i5, str, str2, str3, i6);
            sLogInstanceMap.put(str3, logInstance);
            return logInstance;
        }
    }

    public static void printErrStackTrace(String str, Throwable th, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 == null || logImp2.getLogLevel(0L) > 4) {
            return;
        }
        String str3 = objArr == null ? str2 : String.format(str2, objArr);
        if (str3 == null) {
            str3 = "";
        }
        logImp.logE(0L, str, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str3 + "  " + android.util.Log.getStackTraceString(th));
    }

    public static void setConsoleLogOpen(boolean z3) {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.setConsoleLogOpen(0L, z3);
        }
    }

    public static void setLevel(int i4, boolean z3) {
        level = i4;
        android.util.Log.w(TAG, "new log level: " + i4);
        if (z3) {
            android.util.Log.e(TAG, "no jni log level support");
        }
    }

    public static void setLogImp(LogImp logImp2) {
        logImp = logImp2;
    }

    /* renamed from: v */
    public static void m2272v(String str, String str2) {
        m2273v(str, str2, null);
    }

    /* renamed from: w */
    public static void m2274w(String str, String str2) {
        m2275w(str, str2, null);
    }

    /* renamed from: d */
    public static void m2265d(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 == null || logImp2.getLogLevel(0L) > 1) {
            return;
        }
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        logImp.logD(0L, str, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
    }

    /* renamed from: e */
    public static void m2267e(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 == null || logImp2.getLogLevel(0L) > 4) {
            return;
        }
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        logImp.logE(0L, str, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
    }

    /* renamed from: f */
    public static void m2269f(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 == null || logImp2.getLogLevel(0L) > 5) {
            return;
        }
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        logImp.logF(0L, str, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
    }

    /* renamed from: i */
    public static void m2271i(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 == null || logImp2.getLogLevel(0L) > 2) {
            return;
        }
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        logImp.logI(0L, str, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
    }

    /* renamed from: v */
    public static void m2273v(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 == null || logImp2.getLogLevel(0L) > 0) {
            return;
        }
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        logImp.logV(0L, str, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
    }

    /* renamed from: w */
    public static void m2275w(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 == null || logImp2.getLogLevel(0L) > 3) {
            return;
        }
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        logImp.logW(0L, str, "", "", 0, Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str2);
    }
}
