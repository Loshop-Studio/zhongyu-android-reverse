package com.p068uc.crashsdk;

import android.os.Looper;
import android.os.Process;
import com.p068uc.crashsdk.export.LogType;
import com.p068uc.crashsdk.p069a.C1815a;
import com.p068uc.crashsdk.p069a.C1820f;
import com.p068uc.crashsdk.p069a.C1821g;
import com.p068uc.crashsdk.p069a.RunnableC1819e;
import java.io.File;
import java.util.Locale;
import org.android.agoo.message.MessageService;

/* loaded from: classes.dex */
public class JNIBridge {
    private static int addCachedInfo(String str, String str2) {
        return C1814a.m6221b(str, str2);
    }

    private static int addDumpFile(String str, String str2, boolean z3, boolean z4, int i4, boolean z5) {
        return C1814a.m6208a(str, str2, z3, z4, i4, z5);
    }

    private static void addHeaderInfo(String str, String str2) {
        C1814a.m6217a(str, str2);
    }

    public static long cmd(int i4) {
        return nativeCmd(i4, 0L, null, null);
    }

    private static int createCachedInfo(String str, int i4, int i5) {
        return C1814a.m6206a(str, i4, i5);
    }

    private static boolean generateCustomLog(String str, String str2, long j4, String str3, String str4, String str5, String str6) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        return C1826e.m6503a(stringBuffer, str2, j4, C1814a.m6227c(str3), C1814a.m6227c(str4), C1814a.m6227c(str5), str6);
    }

    protected static String getCallbackInfo(String str, boolean z3) {
        return C1814a.m6211a(str, z3);
    }

    private static String getDatasForClientJavaLog(int i4, String str) {
        boolean zEquals = "$all$".equals(str);
        if (i4 == 1) {
            return zEquals ? C1814a.m6232h() : C1814a.m6210a(str);
        }
        if (i4 == 2) {
            return zEquals ? C1814a.m6234j() : C1814a.m6211a(str, true);
        }
        if (i4 == 3) {
            return zEquals ? C1814a.m6236l() : C1814a.m6223b(str);
        }
        if (i4 == 4) {
            return C1826e.m6526c(str) ? "1" : MessageService.MSG_DB_READY_REPORT;
        }
        return null;
    }

    private static String getJavaStackTrace(Thread thread, int i4) {
        if (i4 != 0 && i4 == Process.myPid()) {
            thread = Looper.getMainLooper().getThread();
        }
        if (thread != null) {
            return C1826e.m6483a(thread.getStackTrace(), "getJavaStackTrace").toString();
        }
        return null;
    }

    public static native boolean nativeAddCachedInfo(String str, String str2);

    public static native int nativeAddCallbackInfo(String str, int i4, long j4, int i5);

    public static native int nativeAddDumpFile(String str, String str2, boolean z3, boolean z4, int i4, boolean z5);

    public static native void nativeAddHeaderInfo(String str, String str2);

    public static native boolean nativeChangeState(String str, String str2, boolean z3);

    public static native void nativeClientCloseConnection(long j4);

    public static native long nativeClientCreateConnection(String str, String str2, String str3, int i4);

    public static native int nativeClientWriteData(long j4, String str);

    public static native void nativeCloseFile(int i4);

    public static native long nativeCmd(int i4, long j4, String str, Object[] objArr);

    public static native void nativeCrash(int i4, int i5);

    public static native int nativeCreateCachedInfo(String str, int i4, int i5);

    public static native String nativeDumpThreads(String str, long j4);

    public static native int nativeGenerateUnexpLog(long j4, int i4);

    public static native String nativeGet(int i4, long j4, String str);

    public static native String nativeGetCallbackInfo(String str, long j4, int i4, boolean z3);

    public static native boolean nativeIsCrashing();

    public static native boolean nativeLockFile(int i4, boolean z3);

    public static native int nativeLog(int i4, String str, String str2);

    public static native int nativeOpenFile(String str);

    public static native long nativeSet(int i4, long j4, String str, Object[] objArr);

    public static native void nativeSetForeground(boolean z3);

    private static void onCrashLogGenerated(String str, String str2, String str3, boolean z3) {
        boolean zEquals = C1826e.m6547h().equals(str2);
        boolean zEquals2 = LogType.NATIVE_TYPE.equals(str3);
        if (!C1826e.m6452E()) {
            if (zEquals && zEquals2) {
                try {
                    C1827f.m6610c(true);
                } catch (Throwable th) {
                    C1821g.m6293a(th);
                }
            }
            str = C1826e.m6479a(str);
        }
        C1825d.m6442a(str, str2, str3);
        if (C1826e.m6452E()) {
            return;
        }
        if (z3 || (!zEquals && C1828g.m6668s())) {
            C1826e.m6504a(false, false);
        } else if (zEquals) {
            C1826e.m6518b(zEquals2);
        }
    }

    private static void onCrashRestarting() {
        C1825d.m6443a(false);
        C1823b.m6378K();
    }

    private static void onKillProcess(String str, int i4, int i5) {
        String str2 = "onKillProcess. SIG: " + i5;
        if (C1826e.m6497a()) {
            C1815a.m6245b("crashsdk", str2);
        } else {
            C1815a.m6242a("crashsdk", str2);
        }
        StringBuilder sbM6536e = C1826e.m6536e("onKillProcess");
        Locale locale = Locale.US;
        sbM6536e.insert(0, String.format(locale, "State in disk: '%s'\n", C1823b.m6422m()));
        sbM6536e.insert(0, String.format(locale, "SIG: %d, fg: %s, exiting: %s, main process: %s, time: %s\n", Integer.valueOf(i5), Boolean.valueOf(C1823b.m6434y()), Boolean.valueOf(C1823b.m6427r()), Boolean.valueOf(C1823b.m6370C()), C1826e.m6558m()));
        sbM6536e.insert(0, String.format(locale, "Kill PID: %d (%s) by pid: %d (%s) tid: %d (%s)\n", Integer.valueOf(i4), C1826e.m6477a(i4), Integer.valueOf(Process.myPid()), C1826e.m6477a(Process.myPid()), Integer.valueOf(Process.myTid()), Thread.currentThread().getName()));
        String string = sbM6536e.toString();
        if (C1826e.m6497a()) {
            C1815a.m6245b("crashsdk", string);
        } else {
            C1815a.m6242a("crashsdk", string);
        }
        if (C1823b.m6376I()) {
            return;
        }
        C1821g.m6297a(new File(str), string.getBytes());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static String onNativeEvent(int i4, long j4, Object[] objArr) {
        switch (i4) {
            case 1:
                return String.valueOf(Runtime.getRuntime().maxMemory());
            case 2:
                return C1826e.m6528d();
            case 3:
                if (objArr != null && objArr.length == 2 && (objArr[0] instanceof String) && (objArr[1] instanceof String)) {
                    return C1826e.m6480a((String) objArr[0], (String) objArr[1]);
                }
                return null;
            case 4:
                return C1826e.m6545g();
            case 5:
                C1814a.m6220a(true);
                return null;
            case 6:
                return C1821g.m6307d();
            case 7:
                C1820f.m6280a(2, new RunnableC1819e(102), 8000L);
                C1826e.m6566q();
                return null;
            default:
                return null;
        }
    }

    private static int onPreClientCustomLog(String str, String str2, boolean z3) {
        C1828g.m6644a();
        C1826e.m6496a(false);
        if (C1826e.m6502a(str, str2, z3)) {
            return 0;
        }
        C1826e.m6517b(str, str2, z3);
        return 1;
    }

    private static int registerCurrentThread(String str, int i4) {
        return C1814a.m6205a(i4, str);
    }

    private static int registerInfoCallback(String str, int i4, long j4, int i5) {
        return C1814a.m6207a(str, i4, null, j4, i5);
    }

    public static long set(int i4, boolean z3) {
        return nativeSet(i4, z3 ? 1L : 0L, null, null);
    }

    public static long cmd(int i4, String str) {
        return nativeCmd(i4, 0L, str, null);
    }

    public static long set(int i4, long j4) {
        return nativeSet(i4, j4, null, null);
    }

    public static long set(int i4, String str) {
        return nativeSet(i4, 0L, str, null);
    }
}
