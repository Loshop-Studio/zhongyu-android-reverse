package com.umeng.commonsdk.debug;

import android.util.Log;
import com.umeng.commonsdk.utils.UMUtils;

/* loaded from: classes2.dex */
public class UMRTLog {
    private static final String RTLOG_ENABLE = "1";
    private static final String RTLOG_PROP = "debug.umeng.rtlog";
    public static final String RTLOG_TAG = "MobclickRT";

    private UMRTLog() {
    }

    /* renamed from: d */
    public static void m3431d(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, false);
        }
    }

    /* renamed from: e */
    public static void m3432e(String str, String str2) {
        if (shouldOutput()) {
            Log.e(str, warpperMsg(str2, false));
        }
    }

    /* renamed from: i */
    public static void m3433i(String str, String str2) {
        if (shouldOutput()) {
            Log.i(str, warpperMsg(str2, false));
        }
    }

    /* renamed from: sd */
    public static void m3434sd(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, true);
        }
    }

    /* renamed from: se */
    public static void m3435se(String str, String str2) {
        if (shouldOutput()) {
            Log.e(str, warpperMsg(str2, true));
        }
    }

    private static boolean shouldOutput() {
        return "1".equals(UMUtils.getSystemProperty(RTLOG_PROP, "0"));
    }

    /* renamed from: si */
    public static void m3436si(String str, String str2) {
        if (shouldOutput()) {
            Log.i(str, warpperMsg(str2, true));
        }
    }

    /* renamed from: sv */
    public static void m3437sv(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, true);
        }
    }

    /* renamed from: sw */
    public static void m3438sw(String str, String str2) {
        if (shouldOutput()) {
            Log.w(str, warpperMsg(str2, true));
        }
    }

    /* renamed from: v */
    public static void m3439v(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, false);
        }
    }

    /* renamed from: w */
    public static void m3440w(String str, String str2) {
        if (shouldOutput()) {
            Log.w(str, warpperMsg(str2, false));
        }
    }

    private static String warpperMsg(String str, boolean z3) {
        StringBuffer stringBuffer;
        if (!z3) {
            return str;
        }
        try {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length >= 3) {
                String fileName = stackTrace[2].getFileName();
                String methodName = stackTrace[2].getMethodName();
                int lineNumber = stackTrace[2].getLineNumber();
                stringBuffer = new StringBuffer();
                stringBuffer.append("<");
                stringBuffer.append(fileName);
                stringBuffer.append(":");
                stringBuffer.append(methodName);
                stringBuffer.append(":");
                stringBuffer.append(lineNumber);
                stringBuffer.append("> ");
                stringBuffer.append(str);
            } else {
                stringBuffer = null;
            }
            return stringBuffer.toString();
        } catch (Throwable unused) {
            return str;
        }
    }
}
