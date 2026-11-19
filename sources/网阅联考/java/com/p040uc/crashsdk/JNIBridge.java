package com.p040uc.crashsdk;

import android.os.Looper;
import android.os.Process;
import com.p040uc.crashsdk.export.LogType;
import com.p040uc.crashsdk.p041a.C3299a;
import com.p040uc.crashsdk.p041a.C3304f;
import com.p040uc.crashsdk.p041a.C3305g;
import com.p040uc.crashsdk.p041a.RunnableC3303e;
import com.umeng.commonsdk.statistics.SdkVersion;
import java.io.File;
import java.util.Locale;

/* loaded from: classes2.dex */
public class JNIBridge {
    private static int addCachedInfo(String str, String str2) {
        return C3298a.m2298b(str, str2);
    }

    private static int addDumpFile(String str, String str2, boolean z3, boolean z4, int i4, boolean z5) {
        return C3298a.m2285a(str, str2, z3, z4, i4, z5);
    }

    private static void addHeaderInfo(String str, String str2) {
        C3298a.m2294a(str, str2);
    }

    public static long cmd(int i4) {
        return nativeCmd(i4, 0L, null, null);
    }

    private static int createCachedInfo(String str, int i4, int i5) {
        return C3298a.m2283a(str, i4, i5);
    }

    private static boolean generateCustomLog(String str, String str2, long j4, String str3, String str4, String str5, String str6) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        return C3310e.m2580a(stringBuffer, str2, j4, C3298a.m2304c(str3), C3298a.m2304c(str4), C3298a.m2304c(str5), str6);
    }

    public static String getCallbackInfo(String str, boolean z3) {
        return C3298a.m2288a(str, z3);
    }

    private static String getDatasForClientJavaLog(int i4, String str) {
        boolean zEquals = "$all$".equals(str);
        if (i4 == 1) {
            return zEquals ? C3298a.m2309h() : C3298a.m2287a(str);
        }
        if (i4 == 2) {
            return zEquals ? C3298a.m2311j() : C3298a.m2288a(str, true);
        }
        if (i4 == 3) {
            return zEquals ? C3298a.m2313l() : C3298a.m2300b(str);
        }
        if (i4 == 4) {
            return C3310e.m2603c(str) ? SdkVersion.MINI_VERSION : "0";
        }
        return null;
    }

    private static String getJavaStackTrace(Thread thread, int i4) {
        if (i4 != 0 && i4 == Process.myPid()) {
            thread = Looper.getMainLooper().getThread();
        }
        if (thread != null) {
            return C3310e.m2560a(thread.getStackTrace(), "getJavaStackTrace").toString();
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
        boolean zEquals = C3310e.m2624h().equals(str2);
        boolean zEquals2 = LogType.NATIVE_TYPE.equals(str3);
        if (!C3310e.m2529E()) {
            if (zEquals && zEquals2) {
                try {
                    C3311f.m2687c(true);
                } catch (Throwable th) {
                    C3305g.m2370a(th);
                }
            }
            str = C3310e.m2556a(str);
        }
        C3309d.m2519a(str, str2, str3);
        if (C3310e.m2529E()) {
            return;
        }
        if (z3 || (!zEquals && C3312g.m2745s())) {
            C3310e.m2581a(false, false);
        } else if (zEquals) {
            C3310e.m2595b(zEquals2);
        }
    }

    private static void onCrashRestarting() {
        C3309d.m2520a(false);
        C3307b.m2455K();
    }

    private static void onKillProcess(String str, int i4, int i5) {
        String str2 = "onKillProcess. SIG: " + i5;
        if (C3310e.m2574a()) {
            C3299a.m2322b("crashsdk", str2);
        } else {
            C3299a.m2319a("crashsdk", str2);
        }
        StringBuilder sbM2613e = C3310e.m2613e("onKillProcess");
        Locale locale = Locale.US;
        sbM2613e.insert(0, String.format(locale, "State in disk: '%s'\n", C3307b.m2499m()));
        sbM2613e.insert(0, String.format(locale, "SIG: %d, fg: %s, exiting: %s, main process: %s, time: %s\n", Integer.valueOf(i5), Boolean.valueOf(C3307b.m2511y()), Boolean.valueOf(C3307b.m2504r()), Boolean.valueOf(C3307b.m2447C()), C3310e.m2635m()));
        sbM2613e.insert(0, String.format(locale, "Kill PID: %d (%s) by pid: %d (%s) tid: %d (%s)\n", Integer.valueOf(i4), C3310e.m2554a(i4), Integer.valueOf(Process.myPid()), C3310e.m2554a(Process.myPid()), Integer.valueOf(Process.myTid()), Thread.currentThread().getName()));
        String string = sbM2613e.toString();
        if (C3310e.m2574a()) {
            C3299a.m2322b("crashsdk", string);
        } else {
            C3299a.m2319a("crashsdk", string);
        }
        if (C3307b.m2453I()) {
            return;
        }
        C3305g.m2374a(new File(str), string.getBytes());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static String onNativeEvent(int i4, long j4, Object[] objArr) {
        switch (i4) {
            case 1:
                return String.valueOf(Runtime.getRuntime().maxMemory());
            case 2:
                return C3310e.m2605d();
            case 3:
                if (objArr != null && objArr.length == 2) {
                    Object obj = objArr[0];
                    if (obj instanceof String) {
                        Object obj2 = objArr[1];
                        if (obj2 instanceof String) {
                            return C3310e.m2557a((String) obj, (String) obj2);
                        }
                    }
                }
                return null;
            case 4:
                return C3310e.m2622g();
            case 5:
                C3298a.m2297a(true);
                return null;
            case 6:
                return C3305g.m2384d();
            case 7:
                C3304f.m2357a(2, new RunnableC3303e(102), 8000L);
                C3310e.m2643q();
                return null;
            default:
                return null;
        }
    }

    private static int onPreClientCustomLog(String str, String str2, boolean z3) {
        C3312g.m2721a();
        C3310e.m2573a(false);
        if (C3310e.m2579a(str, str2, z3)) {
            return 0;
        }
        C3310e.m2594b(str, str2, z3);
        return 1;
    }

    private static int registerCurrentThread(String str, int i4) {
        return C3298a.m2282a(i4, str);
    }

    private static int registerInfoCallback(String str, int i4, long j4, int i5) {
        return C3298a.m2284a(str, i4, null, j4, i5);
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
