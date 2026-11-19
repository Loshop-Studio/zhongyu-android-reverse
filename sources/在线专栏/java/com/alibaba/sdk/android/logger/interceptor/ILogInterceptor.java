package com.alibaba.sdk.android.logger.interceptor;

import com.alibaba.sdk.android.logger.LogLevel;

/* loaded from: classes.dex */
public interface ILogInterceptor {
    void handle(InterceptorManager interceptorManager, int i4, LogLevel logLevel, String str, Object[] objArr);
}
