package com.p071uc.crashsdk;

import android.os.Looper;
import android.os.Process;
import com.p071uc.crashsdk.export.LogType;
import com.p071uc.crashsdk.p072a.C6738a;
import com.p071uc.crashsdk.p072a.C6743f;
import com.p071uc.crashsdk.p072a.C6744g;
import com.p071uc.crashsdk.p072a.RunnableC6742e;
import java.io.File;
import java.util.Locale;

/* loaded from: classes4.dex */
public class JNIBridge {
    private static int addCachedInfo(String str, String str2) {
        return C6737a.m5542b(str, str2);
    }

    private static int addDumpFile(String str, String str2, boolean z9, boolean z10, int i9, boolean z11) {
        return C6737a.m5529a(str, str2, z9, z10, i9, z11);
    }

    private static void addHeaderInfo(String str, String str2) {
        C6737a.m5538a(str, str2);
    }

    public static long cmd(int i9) {
        return nativeCmd(i9, 0L, null, null);
    }

    private static int createCachedInfo(String str, int i9, int i10) {
        return C6737a.m5527a(str, i9, i10);
    }

    private static boolean generateCustomLog(String str, String str2, long j9, String str3, String str4, String str5, String str6) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        return C6749e.m5824a(stringBuffer, str2, j9, C6737a.m5548c(str3), C6737a.m5548c(str4), C6737a.m5548c(str5), str6);
    }

    public static String getCallbackInfo(String str, boolean z9) {
        return C6737a.m5532a(str, z9);
    }

    private static String getDatasForClientJavaLog(int i9, String str) {
        boolean zEquals = "$all$".equals(str);
        if (i9 == 1) {
            return zEquals ? C6737a.m5553h() : C6737a.m5531a(str);
        }
        if (i9 == 2) {
            return zEquals ? C6737a.m5555j() : C6737a.m5532a(str, true);
        }
        if (i9 == 3) {
            return zEquals ? C6737a.m5557l() : C6737a.m5544b(str);
        }
        if (i9 == 4) {
            return C6749e.m5847c(str) ? "1" : "0";
        }
        return null;
    }

    private static String getJavaStackTrace(Thread thread, int i9) {
        if (i9 != 0 && i9 == Process.myPid()) {
            thread = Looper.getMainLooper().getThread();
        }
        if (thread != null) {
            return C6749e.m5804a(thread.getStackTrace(), "getJavaStackTrace").toString();
        }
        return null;
    }

    public static native boolean nativeAddCachedInfo(String str, String str2);

    public static native int nativeAddCallbackInfo(String str, int i9, long j9, int i10);

    public static native int nativeAddDumpFile(String str, String str2, boolean z9, boolean z10, int i9, boolean z11);

    public static native void nativeAddHeaderInfo(String str, String str2);

    public static native boolean nativeChangeState(String str, String str2, boolean z9);

    public static native void nativeClientCloseConnection(long j9);

    public static native long nativeClientCreateConnection(String str, String str2, String str3, int i9);

    public static native int nativeClientWriteData(long j9, String str);

    public static native void nativeCloseFile(int i9);

    public static native long nativeCmd(int i9, long j9, String str, Object[] objArr);

    public static native void nativeCrash(int i9, int i10);

    public static native int nativeCreateCachedInfo(String str, int i9, int i10);

    public static native String nativeDumpThreads(String str, long j9);

    public static native int nativeGenerateUnexpLog(long j9, int i9);

    public static native String nativeGet(int i9, long j9, String str);

    public static native String nativeGetCallbackInfo(String str, long j9, int i9, boolean z9);

    public static native boolean nativeIsCrashing();

    public static native boolean nativeLockFile(int i9, boolean z9);

    public static native int nativeLog(int i9, String str, String str2);

    public static native int nativeOpenFile(String str);

    public static native long nativeSet(int i9, long j9, String str, Object[] objArr);

    public static native void nativeSetForeground(boolean z9);

    private static void onCrashLogGenerated(String str, String str2, String str3, boolean z9) {
        boolean zEquals = C6749e.m5868h().equals(str2);
        boolean zEquals2 = LogType.NATIVE_TYPE.equals(str3);
        if (!C6749e.m5773E()) {
            if (zEquals && zEquals2) {
                try {
                    C6750f.m5931c(true);
                } catch (Throwable th) {
                    C6744g.m5614a(th);
                }
            }
            str = C6749e.m5800a(str);
        }
        C6748d.m5763a(str, str2, str3);
        if (C6749e.m5773E()) {
            return;
        }
        if (z9 || (!zEquals && C6751g.m5989s())) {
            C6749e.m5825a(false, false);
        } else if (zEquals) {
            C6749e.m5839b(zEquals2);
        }
    }

    private static void onCrashRestarting() {
        C6748d.m5764a(false);
        C6746b.m5699K();
    }

    private static void onKillProcess(String str, int i9, int i10) {
        String str2 = "onKillProcess. SIG: " + i10;
        if (C6749e.m5818a()) {
            C6738a.m5566b("crashsdk", str2);
        } else {
            C6738a.m5563a("crashsdk", str2);
        }
        StringBuilder sbM5857e = C6749e.m5857e("onKillProcess");
        Locale locale = Locale.US;
        sbM5857e.insert(0, String.format(locale, "State in disk: '%s'\n", C6746b.m5743m()));
        sbM5857e.insert(0, String.format(locale, "SIG: %d, fg: %s, exiting: %s, main process: %s, time: %s\n", Integer.valueOf(i10), Boolean.valueOf(C6746b.m5755y()), Boolean.valueOf(C6746b.m5748r()), Boolean.valueOf(C6746b.m5691C()), C6749e.m5879m()));
        sbM5857e.insert(0, String.format(locale, "Kill PID: %d (%s) by pid: %d (%s) tid: %d (%s)\n", Integer.valueOf(i9), C6749e.m5798a(i9), Integer.valueOf(Process.myPid()), C6749e.m5798a(Process.myPid()), Integer.valueOf(Process.myTid()), Thread.currentThread().getName()));
        String string = sbM5857e.toString();
        if (C6749e.m5818a()) {
            C6738a.m5566b("crashsdk", string);
        } else {
            C6738a.m5563a("crashsdk", string);
        }
        if (C6746b.m5697I()) {
            return;
        }
        C6744g.m5618a(new File(str), string.getBytes());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static String onNativeEvent(int i9, long j9, Object[] objArr) {
        switch (i9) {
            case 1:
                return String.valueOf(Runtime.getRuntime().maxMemory());
            case 2:
                return C6749e.m5849d();
            case 3:
                if (objArr != null && objArr.length == 2) {
                    Object obj = objArr[0];
                    if (obj instanceof String) {
                        Object obj2 = objArr[1];
                        if (obj2 instanceof String) {
                            return C6749e.m5801a((String) obj, (String) obj2);
                        }
                    }
                }
                return null;
            case 4:
                return C6749e.m5866g();
            case 5:
                C6737a.m5541a(true);
                return null;
            case 6:
                return C6744g.m5628d();
            case 7:
                C6743f.m5601a(2, new RunnableC6742e(102), 8000L);
                C6749e.m5887q();
                return null;
            default:
                return null;
        }
    }

    private static int onPreClientCustomLog(String str, String str2, boolean z9) {
        C6751g.m5965a();
        C6749e.m5817a(false);
        if (C6749e.m5823a(str, str2, z9)) {
            return 0;
        }
        C6749e.m5838b(str, str2, z9);
        return 1;
    }

    private static int registerCurrentThread(String str, int i9) {
        return C6737a.m5526a(i9, str);
    }

    private static int registerInfoCallback(String str, int i9, long j9, int i10) {
        return C6737a.m5528a(str, i9, null, j9, i10);
    }

    public static long set(int i9, boolean z9) {
        return nativeSet(i9, z9 ? 1L : 0L, null, null);
    }

    public static long cmd(int i9, String str) {
        return nativeCmd(i9, 0L, str, null);
    }

    public static long set(int i9, long j9) {
        return nativeSet(i9, j9, null, null);
    }

    public static long set(int i9, String str) {
        return nativeSet(i9, 0L, str, null);
    }
}
