package com.alibaba.sdk.android.sender;

import com.alibaba.sdk.android.logger.BaseSdkLogApi;
import com.alibaba.sdk.android.logger.ILog;
import com.alibaba.sdk.android.logger.ILogger;
import com.alibaba.sdk.android.logger.LogLevel;

/* loaded from: classes3.dex */
public class SenderLog {

    /* renamed from: com.alibaba.sdk.android.sender.SenderLog$a */
    public static class C5696a {

        /* renamed from: a */
        private static final BaseSdkLogApi f4465a = new BaseSdkLogApi("Sender", false);
    }

    private SenderLog() {
    }

    public static void addILogger(ILogger iLogger) {
        C5696a.f4465a.addILogger(iLogger);
    }

    public static void enable(boolean z10) {
        C5696a.f4465a.enable(z10);
    }

    public static ILog getLogger(Object obj) {
        return C5696a.f4465a.getLogger(obj);
    }

    public static void removeILogger(ILogger iLogger) {
        C5696a.f4465a.removeILogger(iLogger);
    }

    public static void setILogger(ILogger iLogger) {
        C5696a.f4465a.setILogger(iLogger);
    }

    public static void setLevel(LogLevel logLevel) {
        C5696a.f4465a.setLevel(logLevel);
    }
}
