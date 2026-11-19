package com.alibaba.sdk.android.logger.interceptor;

import com.alibaba.sdk.android.logger.ILogger;
import com.alibaba.sdk.android.logger.LogLevel;

/* renamed from: com.alibaba.sdk.android.logger.interceptor.a */
/* loaded from: classes3.dex */
public class C5611a implements ILogInterceptor {

    /* renamed from: a */
    private InterfaceC5614d f4098a;

    public C5611a(InterfaceC5614d interfaceC5614d) {
        this.f4098a = interfaceC5614d;
    }

    @Override // com.alibaba.sdk.android.logger.interceptor.ILogInterceptor
    public void handle(final InterceptorManager interceptorManager, int i10, LogLevel logLevel, String str, Object[] objArr) {
        this.f4098a.mo3558a(logLevel, str, objArr, new ILogger() { // from class: com.alibaba.sdk.android.logger.interceptor.a.1
            @Override // com.alibaba.sdk.android.logger.ILogger
            public void print(LogLevel logLevel2, String str2, String str3) {
                interceptorManager.toNextLoggerInterceptor(-1, logLevel2, str2, str3);
            }
        });
    }
}
