package com.alibaba.sdk.android.ams.common.logger;

import android.util.Log;
import com.alibaba.sdk.android.logger.ILogger;
import com.alibaba.sdk.android.logger.LogLevel;
import com.taobao.accs.utl.AccsLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
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
    public static /* synthetic */ class C55812 {

        /* renamed from: a */
        static final /* synthetic */ int[] f4002a;

        static {
            int[] iArr = new int[LogLevel.values().length];
            f4002a = iArr;
            try {
                iArr[LogLevel.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4002a[LogLevel.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4002a[LogLevel.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4002a[LogLevel.DEBUG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void addListener(final LoggerListener loggerListener) {
        listener.add(loggerListener);
        AccsLogger.addILogger(new ILogger() { // from class: com.alibaba.sdk.android.ams.common.logger.AmsLogger.1
            @Override // com.alibaba.sdk.android.logger.ILogger
            public void print(LogLevel logLevel, String str, String str2) {
                int i10 = C55812.f4002a[logLevel.ordinal()];
                if (i10 == 1) {
                    loggerListener.m3431e(str, str2, null, 0);
                    return;
                }
                if (i10 == 2) {
                    loggerListener.m3433w(str, str2, null, 0);
                } else if (i10 == 3) {
                    loggerListener.m3432i(str, str2, null, 0);
                } else {
                    if (i10 != 4) {
                        return;
                    }
                    loggerListener.m3430d(str, str2, null, 0);
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
    public void m3417d(String str) {
        m3419d(str, null, 0);
    }

    /* renamed from: e */
    public void m3420e(String str) {
        m3422e(str, null, 0);
    }

    /* renamed from: i */
    public void m3423i(String str) {
        m3425i(str, null, 0);
    }

    /* renamed from: w */
    public void m3426w(String str) {
        m3428w(str, null, 0);
    }

    /* renamed from: d */
    public void m3418d(String str, Throwable th) {
        m3419d(str, th, 0);
    }

    /* renamed from: e */
    public void m3421e(String str, Throwable th) {
        m3422e(str, th, 0);
    }

    /* renamed from: i */
    public void m3424i(String str, Throwable th) {
        m3425i(str, th, 0);
    }

    /* renamed from: w */
    public void m3427w(String str, Throwable th) {
        m3428w(str, th, 0);
    }

    /* renamed from: d */
    public void m3419d(String str, Throwable th, int i10) {
        Iterator<LoggerListener> it = listener.iterator();
        while (it.hasNext()) {
            it.next().m3430d(this.TAG, str, th, i10);
        }
    }

    /* renamed from: e */
    public void m3422e(String str, Throwable th, int i10) {
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
            it.next().m3431e(this.TAG, str, th, i10);
        }
    }

    /* renamed from: i */
    public void m3425i(String str, Throwable th, int i10) {
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
            it.next().m3432i(this.TAG, str, th, i10);
        }
    }

    /* renamed from: w */
    public void m3428w(String str, Throwable th, int i10) {
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
            it.next().m3433w(this.TAG, str, th, i10);
        }
    }

    /* renamed from: w */
    public void m3429w(Throwable th) {
        m3428w(null, th, 0);
    }
}
