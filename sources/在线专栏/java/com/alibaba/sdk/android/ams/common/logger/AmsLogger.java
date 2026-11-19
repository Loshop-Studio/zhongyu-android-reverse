package com.alibaba.sdk.android.ams.common.logger;

import android.util.Log;
import com.alibaba.sdk.android.logger.ILogger;
import com.alibaba.sdk.android.logger.LogLevel;
import com.taobao.accs.utl.AccsLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class AmsLogger {
    public static final int DEBUG = 2;
    public static final int ERROR = 0;
    public static final int INFO = 1;
    public static volatile int log_level = 3;
    String TAG;
    static List<LoggerListener> listener = new ArrayList();
    private static final String IMPORTANT_LOG_TAG = "[MPS]";
    private static final AmsLogger importantLogger = getLogger(IMPORTANT_LOG_TAG);

    /* renamed from: com.alibaba.sdk.android.ams.common.logger.AmsLogger$2 */
    static /* synthetic */ class C11062 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6517a;

        static {
            int[] iArr = new int[LogLevel.values().length];
            f6517a = iArr;
            try {
                iArr[LogLevel.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6517a[LogLevel.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6517a[LogLevel.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6517a[LogLevel.DEBUG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void addListener(final LoggerListener loggerListener) {
        listener.add(loggerListener);
        AccsLogger.addILogger(new ILogger() { // from class: com.alibaba.sdk.android.ams.common.logger.AmsLogger.1
            @Override // com.alibaba.sdk.android.logger.ILogger
            public void print(LogLevel logLevel, String str, String str2) {
                int i4 = C11062.f6517a[logLevel.ordinal()];
                if (i4 == 1) {
                    loggerListener.m5030e(str, str2, null, 0);
                    return;
                }
                if (i4 == 2) {
                    loggerListener.m5032w(str, str2, null, 0);
                } else if (i4 == 3) {
                    loggerListener.m5031i(str, str2, null, 0);
                } else {
                    if (i4 != 4) {
                        return;
                    }
                    loggerListener.m5029d(str, str2, null, 0);
                }
            }
        });
    }

    public static void clearListeners() {
        listener.clear();
    }

    public static AmsLogger getImportantLogger() {
        return importantLogger;
    }

    public static AmsLogger getLogger(String str) {
        AmsLogger amsLogger = new AmsLogger();
        amsLogger.TAG = str;
        return amsLogger;
    }

    /* renamed from: d */
    public void m5016d(String str) {
        m5018d(str, null, 0);
    }

    /* renamed from: d */
    public void m5017d(String str, Throwable th) {
        m5018d(str, th, 0);
    }

    /* renamed from: d */
    public void m5018d(String str, Throwable th, int i4) {
        if (log_level >= 2) {
            String str2 = this.TAG;
            if (th == null) {
                Log.d(str2, str);
            } else {
                Log.d(str2, str, th);
            }
        }
        Iterator<LoggerListener> it = listener.iterator();
        while (it.hasNext()) {
            it.next().m5029d(this.TAG, str, th, i4);
        }
    }

    /* renamed from: e */
    public void m5019e(String str) {
        m5021e(str, null, 0);
    }

    /* renamed from: e */
    public void m5020e(String str, Throwable th) {
        m5021e(str, th, 0);
    }

    /* renamed from: e */
    public void m5021e(String str, Throwable th, int i4) {
        if (log_level >= 0) {
            String str2 = this.TAG;
            if (th == null) {
                Log.e(str2, str);
            } else {
                Log.e(str2, str, th);
            }
        }
        Iterator<LoggerListener> it = listener.iterator();
        while (it.hasNext()) {
            it.next().m5030e(this.TAG, str, th, i4);
        }
    }

    /* renamed from: i */
    public void m5022i(String str) {
        m5024i(str, null, 0);
    }

    /* renamed from: i */
    public void m5023i(String str, Throwable th) {
        m5024i(str, th, 0);
    }

    /* renamed from: i */
    public void m5024i(String str, Throwable th, int i4) {
        if (log_level >= 1) {
            String str2 = this.TAG;
            if (th == null) {
                Log.i(str2, str);
            } else {
                Log.i(str2, str, th);
            }
        }
        Iterator<LoggerListener> it = listener.iterator();
        while (it.hasNext()) {
            it.next().m5031i(this.TAG, str, th, i4);
        }
    }

    /* renamed from: w */
    public void m5025w(String str) {
        m5027w(str, null, 0);
    }

    /* renamed from: w */
    public void m5026w(String str, Throwable th) {
        m5027w(str, th, 0);
    }

    /* renamed from: w */
    public void m5027w(String str, Throwable th, int i4) {
        if (log_level >= 1) {
            String str2 = this.TAG;
            if (th == null) {
                Log.w(str2, str);
            } else if (str == null) {
                Log.w(str2, th);
            } else {
                Log.w(str2, str, th);
            }
        }
        Iterator<LoggerListener> it = listener.iterator();
        while (it.hasNext()) {
            it.next().m5032w(this.TAG, str, th, i4);
        }
    }

    /* renamed from: w */
    public void m5028w(Throwable th) {
        m5027w(null, th, 0);
    }
}
