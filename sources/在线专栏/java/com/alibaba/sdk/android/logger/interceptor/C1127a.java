package com.alibaba.sdk.android.logger.interceptor;

import com.alibaba.sdk.android.logger.ILogger;
import com.alibaba.sdk.android.logger.LogLevel;

/* renamed from: com.alibaba.sdk.android.logger.interceptor.a */
/* loaded from: classes.dex */
public class C1127a implements ILogInterceptor {

    /* renamed from: a */
    private InterfaceC1130d f6579a;

    public C1127a(InterfaceC1130d interfaceC1130d) {
        this.f6579a = interfaceC1130d;
    }

    @Override // com.alibaba.sdk.android.logger.interceptor.ILogInterceptor
    public void handle(final InterceptorManager interceptorManager, int i4, LogLevel logLevel, String str, Object[] objArr) {
        this.f6579a.mo5108a(logLevel, str, objArr, new ILogger() { // from class: com.alibaba.sdk.android.logger.interceptor.a.1
            @Override // com.alibaba.sdk.android.logger.ILogger
            public void print(LogLevel logLevel2, String str2, String str3) {
                interceptorManager.toNextLoggerInterceptor(-1, logLevel2, str2, str3);
            }
        });
    }
}
