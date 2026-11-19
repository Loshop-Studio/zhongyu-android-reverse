package com.alibaba.sdk.android.logger.p057b;

import com.alibaba.sdk.android.logger.LogLevel;
import com.alibaba.sdk.android.logger.interceptor.InterceptorManager;
import com.alibaba.sdk.android.logger.interceptor.InterfaceC5613c;

/* renamed from: com.alibaba.sdk.android.logger.b.a */
/* loaded from: classes3.dex */
public class C5603a implements InterfaceC5613c {
    /* renamed from: a */
    private String m3545a() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        for (int i10 = 1; i10 < stackTrace.length; i10++) {
            if (!stackTrace[i10].getClassName().startsWith("com.alibaba.sdk.android.logger")) {
                return "(" + stackTrace[i10].getFileName() + ":" + stackTrace[i10].getLineNumber() + ")";
            }
        }
        return "";
    }

    @Override // com.alibaba.sdk.android.logger.interceptor.InterfaceC5613c
    /* renamed from: a */
    public void mo3546a(InterceptorManager interceptorManager, int i10, LogLevel logLevel, String str, String str2) {
        interceptorManager.toNextLoggerInterceptor(i10, logLevel, str, str2 + m3545a());
    }
}
