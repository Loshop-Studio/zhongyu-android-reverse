package com.tencent.liteav.basic.log;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.liteav.basic.util.C6592e;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes4.dex */
public class TXCLog {
    public static final int LOG_ASYNC = 0;
    public static final int LOG_DEBUG = 1;
    public static final int LOG_ERROR = 4;
    public static final int LOG_FATAL = 5;
    public static final int LOG_INFO = 2;
    public static final int LOG_NONE = 6;
    public static final int LOG_SYNC = 1;
    public static final int LOG_VERBOSE = 0;
    public static final int LOG_WARNING = 3;
    private static boolean mEnableCallback = false;
    private static boolean mEnableCompress = true;
    private static boolean mEnableConsole = true;
    private static boolean mHasInit = false;
    private static InterfaceC6583a mListener = null;
    private static String mLogCacheDir = "";
    public static String mLogDir = "";
    private static int mLogLevel;
    private static final Object mLogLock = new Object();

    /* renamed from: com.tencent.liteav.basic.log.TXCLog$a */
    public interface InterfaceC6583a {
        /* renamed from: a */
        void mo5000a(int i10, String str, String str2);
    }

    /* renamed from: d */
    public static void m4990d(String str, String str2, Object... objArr) {
        log(1, str, String.format(str2, objArr));
    }

    /* renamed from: e */
    public static void m4993e(String str, String str2, Object... objArr) {
        log(4, str, String.format(str2, objArr));
    }

    /* renamed from: i */
    public static void m4995i(String str, String str2, Object... objArr) {
        log(2, str, String.format(str2, objArr));
    }

    public static boolean init() {
        File externalFilesDir;
        if (mHasInit) {
            return true;
        }
        synchronized (mLogLock) {
            try {
                if (mHasInit) {
                    return true;
                }
                boolean zM5058f = C6592e.m5058f();
                Context appContext = TXCCommonUtil.getAppContext();
                if (zM5058f && appContext != null) {
                    if (TextUtils.isEmpty(mLogDir) && (externalFilesDir = appContext.getExternalFilesDir(null)) != null) {
                        mLogDir = externalFilesDir.getAbsolutePath() + "/log/tencent/liteav";
                    }
                    mLogCacheDir = appContext.getFilesDir().getAbsolutePath() + "/log/tencent/liteav";
                    Log.i("TXCLog", "TXCLog init log file path : " + mLogDir + ", cache : " + mLogCacheDir);
                    nativeLogInit();
                    nativeLogSetLevel(mLogLevel);
                    nativeLogSetConsole(mEnableConsole);
                    nativeLogOpen(0, mLogDir, mLogCacheDir, "LiteAV", mEnableCompress);
                    nativeEnableCallback(mEnableCallback);
                    mHasInit = true;
                }
                return mHasInit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void log(int i10, String str, String str2) {
        int i11;
        String str3;
        String str4;
        if (init()) {
            i11 = i10;
            str3 = str;
            str4 = str2;
            nativeLog(i11, str3, "", 0, "", str4);
        } else {
            i11 = i10;
            str3 = str;
            str4 = str2;
        }
        log_callback(i11, str3, str4);
    }

    private static void log_callback(int i10, String str, String str2) {
        InterfaceC6583a interfaceC6583a = mListener;
        if (interfaceC6583a != null) {
            interfaceC6583a.mo5000a(i10, str, str2);
        }
    }

    private static native void nativeEnableCallback(boolean z10);

    private static native void nativeLog(int i10, String str, String str2, int i11, String str3, String str4);

    private static native void nativeLogClose();

    private static native void nativeLogInit();

    private static native void nativeLogOpen(int i10, String str, String str2, String str3, boolean z10);

    private static native void nativeLogSetConsole(boolean z10);

    private static native void nativeLogSetLevel(int i10);

    public static void setConsoleEnabled(boolean z10) {
        mEnableConsole = z10;
        if (mHasInit) {
            nativeLogSetConsole(z10);
        }
    }

    public static void setLevel(int i10) {
        mLogLevel = i10;
        if (mHasInit) {
            nativeLogSetLevel(i10);
        }
    }

    public static void setListener(InterfaceC6583a interfaceC6583a) {
        mListener = interfaceC6583a;
        boolean z10 = interfaceC6583a != null;
        mEnableCallback = z10;
        if (mHasInit) {
            nativeEnableCallback(z10);
        }
    }

    public static void setLogCompressEnabled(boolean z10) {
        if (mEnableCompress != z10) {
            mEnableCompress = z10;
            if (mHasInit) {
                nativeLogClose();
                nativeLogOpen(0, mLogDir, mLogCacheDir, "LiteAV", mEnableCompress);
            }
        }
    }

    public static void setLogDirPath(String str) {
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase(mLogDir)) {
            return;
        }
        mLogDir = str;
        if (mHasInit) {
            Log.i("TXCLog", "TXCLog setLogDirPath " + str);
            nativeLogClose();
            nativeLogOpen(0, mLogDir, mLogCacheDir, "LiteAV", mEnableCompress);
        }
    }

    public static void sliceLogFile() {
        if (mHasInit) {
            Log.i("TXCLog", "TXCLog sliceLogFile");
            nativeLogOpen(0, mLogDir, mLogCacheDir, "LiteAV", mEnableCompress);
        }
    }

    /* renamed from: v */
    public static void m4997v(String str, String str2, Object... objArr) {
        log(0, str, String.format(str2, objArr));
    }

    /* renamed from: w */
    public static void m4999w(String str, String str2, Object... objArr) {
        log(3, str, String.format(str2, objArr));
    }

    /* renamed from: d */
    public static void m4989d(String str, String str2) {
        log(1, str, str2);
    }

    /* renamed from: e */
    public static void m4991e(String str, String str2) {
        log(4, str, str2);
    }

    /* renamed from: i */
    public static void m4994i(String str, String str2) {
        log(2, str, str2);
    }

    /* renamed from: v */
    public static void m4996v(String str, String str2) {
        log(0, str, str2);
    }

    /* renamed from: w */
    public static void m4998w(String str, String str2) {
        log(3, str, str2);
    }

    /* renamed from: e */
    public static void m4992e(String str, String str2, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
        }
        printWriter.close();
        m4991e(str, str2 + SignParameters.NEW_LINE + stringWriter.toString());
    }
}
