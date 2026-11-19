package com.taobao.accs.utl;

import com.alibaba.sdk.android.logger.BaseSdkLogApi;
import com.alibaba.sdk.android.logger.ILog;
import com.alibaba.sdk.android.logger.ILogger;
import com.alibaba.sdk.android.logger.LogLevel;

/* loaded from: classes5.dex */
public class AccsLogger {

    /* renamed from: com.taobao.accs.utl.AccsLogger$a */
    public static class C7674a {

        /* renamed from: a */
        private static final BaseSdkLogApi f13223a = new BaseSdkLogApi("EMASNAccs", false);

        private C7674a() {
        }
    }

    public static void addILogger(ILogger iLogger) {
        C7674a.f13223a.addILogger(iLogger);
    }

    public static void enable(boolean z10) {
        C7674a.f13223a.enable(z10);
    }

    public static ILog getLogger(Object obj) {
        return C7674a.f13223a.getLogger(obj);
    }

    public static void removeILogger(ILogger iLogger) {
        C7674a.f13223a.removeILogger(iLogger);
    }

    public static void setILogger(ILogger iLogger) {
        C7674a.f13223a.setILogger(iLogger);
    }

    public static void setLevel(LogLevel logLevel) {
        C7674a.f13223a.setLevel(logLevel);
    }
}
