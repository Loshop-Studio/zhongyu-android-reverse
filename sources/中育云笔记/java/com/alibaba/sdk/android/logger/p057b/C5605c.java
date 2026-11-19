package com.alibaba.sdk.android.logger.p057b;

import com.alibaba.sdk.android.logger.LogLevel;
import com.alibaba.sdk.android.logger.interceptor.ILogInterceptor;
import com.alibaba.sdk.android.logger.interceptor.InterceptorManager;

/* renamed from: com.alibaba.sdk.android.logger.b.c */
/* loaded from: classes3.dex */
public class C5605c implements ILogInterceptor {

    /* renamed from: a */
    private C5607e f4082a;

    public C5605c(C5607e c5607e) {
        this.f4082a = c5607e;
    }

    @Override // com.alibaba.sdk.android.logger.interceptor.ILogInterceptor
    public void handle(InterceptorManager interceptorManager, int i10, LogLevel logLevel, String str, Object[] objArr) {
        if (this.f4082a.m3552a(logLevel)) {
            interceptorManager.toNextLogInterceptor(i10, logLevel, str, objArr);
        }
    }
}
