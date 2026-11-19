package com.alibaba.sdk.android.logger.interceptor;

import com.alibaba.sdk.android.logger.ILogger;
import com.alibaba.sdk.android.logger.LogLevel;

/* renamed from: com.alibaba.sdk.android.logger.interceptor.b */
/* loaded from: classes3.dex */
public class C5612b implements InterfaceC5613c {

    /* renamed from: a */
    private ILogger f4101a;

    public C5612b(ILogger iLogger) {
        this.f4101a = iLogger;
    }

    @Override // com.alibaba.sdk.android.logger.interceptor.InterfaceC5613c
    /* renamed from: a */
    public void mo3546a(InterceptorManager interceptorManager, int i10, LogLevel logLevel, String str, String str2) {
        this.f4101a.print(logLevel, str, str2);
    }
}
