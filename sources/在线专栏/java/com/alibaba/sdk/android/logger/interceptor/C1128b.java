package com.alibaba.sdk.android.logger.interceptor;

import com.alibaba.sdk.android.logger.ILogger;
import com.alibaba.sdk.android.logger.LogLevel;

/* renamed from: com.alibaba.sdk.android.logger.interceptor.b */
/* loaded from: classes.dex */
public class C1128b implements InterfaceC1129c {

    /* renamed from: a */
    private ILogger f6582a;

    public C1128b(ILogger iLogger) {
        this.f6582a = iLogger;
    }

    @Override // com.alibaba.sdk.android.logger.interceptor.InterfaceC1129c
    /* renamed from: a */
    public void mo5096a(InterceptorManager interceptorManager, int i4, LogLevel logLevel, String str, String str2) {
        this.f6582a.print(logLevel, str, str2);
    }
}
