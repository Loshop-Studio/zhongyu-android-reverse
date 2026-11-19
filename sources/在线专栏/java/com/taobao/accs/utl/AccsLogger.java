package com.taobao.accs.utl;

import com.alibaba.sdk.android.logger.BaseSdkLogApi;
import com.alibaba.sdk.android.logger.ILog;
import com.alibaba.sdk.android.logger.ILogger;
import com.alibaba.sdk.android.logger.LogLevel;

/* loaded from: classes.dex */
public class AccsLogger {

    /* renamed from: com.taobao.accs.utl.AccsLogger$a */
    private static class C1777a {

        /* renamed from: a */
        private static final BaseSdkLogApi f7825a = new BaseSdkLogApi("EMASNAccs", false);

        private C1777a() {
        }
    }

    public static void addILogger(ILogger iLogger) {
        C1777a.f7825a.addILogger(iLogger);
    }

    public static void enable(boolean z3) {
        C1777a.f7825a.enable(z3);
    }

    public static ILog getLogger(Object obj) {
        return C1777a.f7825a.getLogger(obj);
    }

    public static void removeILogger(ILogger iLogger) {
        C1777a.f7825a.removeILogger(iLogger);
    }

    public static void setILogger(ILogger iLogger) {
        C1777a.f7825a.setILogger(iLogger);
    }

    public static void setLevel(LogLevel logLevel) {
        C1777a.f7825a.setLevel(logLevel);
    }
}
