package com.alibaba.sdk.android.logger.p057b;

import com.alibaba.sdk.android.logger.ILog;
import com.alibaba.sdk.android.logger.LogLevel;
import com.alibaba.sdk.android.logger.interceptor.InterceptorManager;

/* renamed from: com.alibaba.sdk.android.logger.b.f */
/* loaded from: classes3.dex */
public class C5608f implements ILog {

    /* renamed from: a */
    private String f4088a;

    /* renamed from: b */
    private InterceptorManager f4089b;

    public C5608f(String str, InterceptorManager interceptorManager) {
        this.f4088a = str;
        this.f4089b = interceptorManager;
    }

    @Override // com.alibaba.sdk.android.logger.ILog
    /* renamed from: d */
    public void mo3533d(String str) {
        mo3534d(str);
    }

    @Override // com.alibaba.sdk.android.logger.ILog
    /* renamed from: e */
    public void mo3535e(String str) {
        mo3537e(str);
    }

    @Override // com.alibaba.sdk.android.logger.ILog
    /* renamed from: i */
    public void mo3538i(String str) {
        mo3539i(str);
    }

    @Override // com.alibaba.sdk.android.logger.ILog
    /* renamed from: w */
    public void mo3540w(String str) {
        mo3542w(str);
    }

    @Override // com.alibaba.sdk.android.logger.ILog
    /* renamed from: d */
    public void mo3534d(Object... objArr) {
        this.f4089b.m3560a(LogLevel.DEBUG, this.f4088a, objArr);
    }

    @Override // com.alibaba.sdk.android.logger.ILog
    /* renamed from: e */
    public void mo3536e(String str, Throwable th) {
        mo3537e(str, th);
    }

    @Override // com.alibaba.sdk.android.logger.ILog
    /* renamed from: i */
    public void mo3539i(Object... objArr) {
        this.f4089b.m3560a(LogLevel.INFO, this.f4088a, objArr);
    }

    @Override // com.alibaba.sdk.android.logger.ILog
    /* renamed from: w */
    public void mo3541w(String str, Throwable th) {
        mo3542w(str, th);
    }

    @Override // com.alibaba.sdk.android.logger.ILog
    /* renamed from: e */
    public void mo3537e(Object... objArr) {
        this.f4089b.m3560a(LogLevel.ERROR, this.f4088a, objArr);
    }

    @Override // com.alibaba.sdk.android.logger.ILog
    /* renamed from: w */
    public void mo3542w(Object... objArr) {
        this.f4089b.m3560a(LogLevel.WARN, this.f4088a, objArr);
    }
}
