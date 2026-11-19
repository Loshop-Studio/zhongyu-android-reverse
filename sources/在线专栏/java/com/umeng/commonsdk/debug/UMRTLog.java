package com.umeng.commonsdk.debug;

import android.util.Log;
import com.umeng.commonsdk.utils.UMUtils;
import org.android.agoo.message.MessageService;

/* loaded from: classes.dex */
public class UMRTLog {
    private static final String RTLOG_ENABLE = "1";
    private static final String RTLOG_PROP = "debug.umeng.rtlog";
    public static final String RTLOG_TAG = "MobclickRT";

    private UMRTLog() {
    }

    /* renamed from: d */
    public static void m7354d(String str, String str2) {
        if (shouldOutput()) {
            Log.d(str, warpperMsg(str2, false));
        }
    }

    /* renamed from: e */
    public static void m7355e(String str, String str2) {
        if (shouldOutput()) {
            Log.e(str, warpperMsg(str2, false));
        }
    }

    /* renamed from: i */
    public static void m7356i(String str, String str2) {
        if (shouldOutput()) {
            Log.i(str, warpperMsg(str2, false));
        }
    }

    /* renamed from: sd */
    public static void m7357sd(String str, String str2) {
        if (shouldOutput()) {
            Log.d(str, warpperMsg(str2, true));
        }
    }

    /* renamed from: se */
    public static void m7358se(String str, String str2) {
        if (shouldOutput()) {
            Log.e(str, warpperMsg(str2, true));
        }
    }

    private static boolean shouldOutput() {
        return "1".equals(UMUtils.getSystemProperty(RTLOG_PROP, MessageService.MSG_DB_READY_REPORT));
    }

    /* renamed from: si */
    public static void m7359si(String str, String str2) {
        if (shouldOutput()) {
            Log.i(str, warpperMsg(str2, true));
        }
    }

    /* renamed from: sv */
    public static void m7360sv(String str, String str2) {
        if (shouldOutput()) {
            Log.v(str, warpperMsg(str2, true));
        }
    }

    /* renamed from: sw */
    public static void m7361sw(String str, String str2) {
        if (shouldOutput()) {
            Log.w(str, warpperMsg(str2, true));
        }
    }

    /* renamed from: v */
    public static void m7362v(String str, String str2) {
        if (shouldOutput()) {
            Log.v(str, warpperMsg(str2, false));
        }
    }

    /* renamed from: w */
    public static void m7363w(String str, String str2) {
        if (shouldOutput()) {
            Log.w(str, warpperMsg(str2, false));
        }
    }

    private static String warpperMsg(String str, boolean z3) {
        if (!z3) {
            return str;
        }
        StringBuffer stringBuffer = null;
        try {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length >= 3) {
                String fileName = stackTrace[2].getFileName();
                String methodName = stackTrace[2].getMethodName();
                int lineNumber = stackTrace[2].getLineNumber();
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("<");
                stringBuffer2.append(fileName);
                stringBuffer2.append(":");
                stringBuffer2.append(methodName);
                stringBuffer2.append(":");
                stringBuffer2.append(lineNumber);
                stringBuffer2.append("> ");
                stringBuffer2.append(str);
                stringBuffer = stringBuffer2;
            }
            return stringBuffer.toString();
        } catch (Throwable unused) {
            return str;
        }
    }
}
