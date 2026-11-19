package com.alibaba.sdk.android.logger.p027b;

import com.alibaba.sdk.android.logger.LogLevel;
import com.alibaba.sdk.android.logger.interceptor.InterceptorManager;
import com.alibaba.sdk.android.logger.interceptor.InterfaceC1129c;

/* renamed from: com.alibaba.sdk.android.logger.b.a */
/* loaded from: classes.dex */
public class C1119a implements InterfaceC1129c {
    /* renamed from: a */
    private String m5095a() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        for (int i4 = 1; i4 < stackTrace.length; i4++) {
            if (!stackTrace[i4].getClassName().startsWith("com.alibaba.sdk.android.logger")) {
                return "(" + stackTrace[i4].getFileName() + ":" + stackTrace[i4].getLineNumber() + ")";
            }
        }
        return "";
    }

    @Override // com.alibaba.sdk.android.logger.interceptor.InterfaceC1129c
    /* renamed from: a */
    public void mo5096a(InterceptorManager interceptorManager, int i4, LogLevel logLevel, String str, String str2) {
        interceptorManager.toNextLoggerInterceptor(i4, logLevel, str, str2 + m5095a());
    }
}
