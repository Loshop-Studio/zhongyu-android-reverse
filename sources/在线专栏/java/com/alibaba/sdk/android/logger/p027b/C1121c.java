package com.alibaba.sdk.android.logger.p027b;

import com.alibaba.sdk.android.logger.LogLevel;
import com.alibaba.sdk.android.logger.interceptor.ILogInterceptor;
import com.alibaba.sdk.android.logger.interceptor.InterceptorManager;

/* renamed from: com.alibaba.sdk.android.logger.b.c */
/* loaded from: classes.dex */
public class C1121c implements ILogInterceptor {

    /* renamed from: a */
    private C1123e f6563a;

    public C1121c(C1123e c1123e) {
        this.f6563a = c1123e;
    }

    @Override // com.alibaba.sdk.android.logger.interceptor.ILogInterceptor
    public void handle(InterceptorManager interceptorManager, int i4, LogLevel logLevel, String str, Object[] objArr) {
        if (this.f6563a.m5102a(logLevel)) {
            interceptorManager.toNextLogInterceptor(i4, logLevel, str, objArr);
        }
    }
}
