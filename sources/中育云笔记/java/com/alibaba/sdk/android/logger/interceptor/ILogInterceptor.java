package com.alibaba.sdk.android.logger.interceptor;

import com.alibaba.sdk.android.logger.LogLevel;

/* loaded from: classes3.dex */
public interface ILogInterceptor {
    void handle(InterceptorManager interceptorManager, int i10, LogLevel logLevel, String str, Object[] objArr);
}
