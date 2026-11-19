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

/* loaded from: classes4.dex */
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

        void appenderFlush(long j9, boolean z9);

        void appenderOpen(int i9, int i10, String str, String str2, String str3, int i11);

        int getLogLevel(long j9);

        long getXlogInstance(String str);

        void logD(long j9, String str, String str2, String str3, int i9, int i10, long j10, long j11, String str4);

        void logE(long j9, String str, String str2, String str3, int i9, int i10, long j10, long j11, String str4);

        void logF(long j9, String str, String str2, String str3, int i9, int i10, long j10, long j11, String str4);

        void logI(long j9, String str, String str2, String str3, int i9, int i10, long j10, long j11, String str4);

        void logV(long j9, String str, String str2, String str3, int i9, int i10, long j10, long j11, String str4);

        void logW(long j9, String str, String str2, String str3, int i9, int i10, long j10, long j11, String str4);

        long openLogInstance(int i9, int i10, String str, String str2, String str3, int i11);

        void releaseXlogInstance(String str);

        void setAppenderMode(long j9, int i9);

        void setConsoleLogOpen(long j9, boolean z9);

        void setMaxAliveTime(long j9, long j10);

        void setMaxFileSize(long j9, long j10);
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
        public void m5520d(String str, String str2, Object... objArr) {
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
        public void m5521e(String str, String str2, Object... objArr) {
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
        public void m5522f(String str, String str2, Object... objArr) {
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
        public void m5523i(String str, String str2, Object... objArr) {
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

        public void setConsoleLogOpen(boolean z9) {
            if (Log.logImp == null || this.mLogInstancePtr == -1) {
                return;
            }
            Log.logImp.setConsoleLogOpen(this.mLogInstancePtr, z9);
        }

        /* renamed from: v */
        public void m5524v(String str, String str2, Object... objArr) {
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
        public void m5525w(String str, String str2, Object... objArr) {
            if (Log.logImp == null || getLogLevel() > 3 || this.mLogInstancePtr == -1) {
                return;
            }
            String str3 = objArr == null ? str2 : String.format(str2, objArr);
            if (str3 == null) {
                str3 = "";
            }
            Log.logImp.logW(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), Looper.getMainLooper().getThread().getId(), str3);
        }

        private LogInstance(int i9, int i10, String str, String str2, String str3, int i11) {
            this.mLogInstancePtr = -1L;
            this.mPrefix = null;
            if (Log.logImp != null) {
                this.mLogInstancePtr = Log.logImp.openLogInstance(i9, i10, str, str2, str3, i11);
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
            public void appenderFlush(long j9, boolean z9) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void appenderOpen(int i9, int i10, String str, String str2, String str3, int i11) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public int getLogLevel(long j9) {
                return Log.level;
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public long getXlogInstance(String str) {
                return 0L;
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logD(long j9, String str, String str2, String str3, int i9, int i10, long j10, long j11, String str4) {
                int unused = Log.level;
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logE(long j9, String str, String str2, String str3, int i9, int i10, long j10, long j11, String str4) {
                if (Log.level <= 4) {
                    android.util.Log.e(str, str4);
                }
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logF(long j9, String str, String str2, String str3, int i9, int i10, long j10, long j11, final String str4) {
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
            public void logI(long j9, String str, String str2, String str3, int i9, int i10, long j10, long j11, String str4) {
                if (Log.level <= 2) {
                    android.util.Log.i(str, str4);
                }
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logV(long j9, String str, String str2, String str3, int i9, int i10, long j10, long j11, String str4) {
                int unused = Log.level;
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logW(long j9, String str, String str2, String str3, int i9, int i10, long j10, long j11, String str4) {
                if (Log.level <= 3) {
                    android.util.Log.w(str, str4);
                }
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public long openLogInstance(int i9, int i10, String str, String str2, String str3, int i11) {
                return 0L;
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void releaseXlogInstance(String str) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void setAppenderMode(long j9, int i9) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void setConsoleLogOpen(long j9, boolean z9) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void setMaxAliveTime(long j9, long j10) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void setMaxFileSize(long j9, long j10) {
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

    public static void appenderFlushSync(boolean z9) {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderFlush(0L, z9);
        }
    }

    public static void appenderOpen(int i9, int i10, String str, String str2, String str3, int i11) {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderOpen(i9, i10, str, str2, str3, i11);
        }
    }

    public static void closeLogInstance(String str) {
        synchronized (sLogInstanceMap) {
            try {
                if (logImp != null && sLogInstanceMap.containsKey(str)) {
                    LogInstance logInstanceRemove = sLogInstanceMap.remove(str);
                    logImp.releaseXlogInstance(str);
                    logInstanceRemove.mLogInstancePtr = -1L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public static void m5508d(String str, String str2) {
        m5509d(str, str2, null);
    }

    /* renamed from: e */
    public static void m5510e(String str, String str2) {
        m5511e(str, str2, null);
    }

    /* renamed from: f */
    public static void m5512f(String str, String str2) {
        m5513f(str, str2, null);
    }

    public static LogImp getImpl() {
        return logImp;
    }

    public static LogInstance getLogInstance(String str) {
        synchronized (sLogInstanceMap) {
            try {
                if (!sLogInstanceMap.containsKey(str)) {
                    return null;
                }
                return sLogInstanceMap.get(str);
            } catch (Throwable th) {
                throw th;
            }
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
    public static void m5514i(String str, String str2) {
        m5515i(str, str2, null);
    }

    public static LogInstance openLogInstance(int i9, int i10, String str, String str2, String str3, int i11) {
        synchronized (sLogInstanceMap) {
            try {
                if (sLogInstanceMap.containsKey(str3)) {
                    return sLogInstanceMap.get(str3);
                }
                LogInstance logInstance = new LogInstance(i9, i10, str, str2, str3, i11);
                sLogInstanceMap.put(str3, logInstance);
                return logInstance;
            } catch (Throwable th) {
                throw th;
            }
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

    public static void setConsoleLogOpen(boolean z9) {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.setConsoleLogOpen(0L, z9);
        }
    }

    public static void setLevel(int i9, boolean z9) {
        level = i9;
        android.util.Log.w(TAG, "new log level: " + i9);
        if (z9) {
            android.util.Log.e(TAG, "no jni log level support");
        }
    }

    public static void setLogImp(LogImp logImp2) {
        logImp = logImp2;
    }

    /* renamed from: v */
    public static void m5516v(String str, String str2) {
        m5517v(str, str2, null);
    }

    /* renamed from: w */
    public static void m5518w(String str, String str2) {
        m5519w(str, str2, null);
    }

    /* renamed from: d */
    public static void m5509d(String str, String str2, Object... objArr) {
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
    public static void m5511e(String str, String str2, Object... objArr) {
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
    public static void m5513f(String str, String str2, Object... objArr) {
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
    public static void m5515i(String str, String str2, Object... objArr) {
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
    public static void m5517v(String str, String str2, Object... objArr) {
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
    public static void m5519w(String str, String str2, Object... objArr) {
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
