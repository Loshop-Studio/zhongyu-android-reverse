package com.alibaba.sdk.android.logger.p027b;

import com.alibaba.sdk.android.logger.ILog;
import com.alibaba.sdk.android.logger.LogLevel;
import com.alibaba.sdk.android.logger.interceptor.InterceptorManager;

/* renamed from: com.alibaba.sdk.android.logger.b.f */
/* loaded from: classes.dex */
public class C1124f implements ILog {

    /* renamed from: a */
    private String f6569a;

    /* renamed from: b */
    private InterceptorManager f6570b;

    public C1124f(String str, InterceptorManager interceptorManager) {
        this.f6569a = str;
        this.f6570b = interceptorManager;
    }

    @Override // com.alibaba.sdk.android.logger.ILog
    /* renamed from: d */
    public void mo5083d(String str) {
        mo5084d(str);
    }

    @Override // com.alibaba.sdk.android.logger.ILog
    /* renamed from: d */
    public void mo5084d(Object... objArr) {
        this.f6570b.m5110a(LogLevel.DEBUG, this.f6569a, objArr);
    }

    @Override // com.alibaba.sdk.android.logger.ILog
    /* renamed from: e */
    public void mo5085e(String str) {
        mo5087e(str);
    }

    @Override // com.alibaba.sdk.android.logger.ILog
    /* renamed from: e */
    public void mo5086e(String str, Throwable th) {
        mo5087e(str, th);
    }

    @Override // com.alibaba.sdk.android.logger.ILog
    /* renamed from: e */
    public void mo5087e(Object... objArr) {
        this.f6570b.m5110a(LogLevel.ERROR, this.f6569a, objArr);
    }

    @Override // com.alibaba.sdk.android.logger.ILog
    /* renamed from: i */
    public void mo5088i(String str) {
        mo5089i(str);
    }

    @Override // com.alibaba.sdk.android.logger.ILog
    /* renamed from: i */
    public void mo5089i(Object... objArr) {
        this.f6570b.m5110a(LogLevel.INFO, this.f6569a, objArr);
    }

    @Override // com.alibaba.sdk.android.logger.ILog
    /* renamed from: w */
    public void mo5090w(String str) {
        mo5092w(str);
    }

    @Override // com.alibaba.sdk.android.logger.ILog
    /* renamed from: w */
    public void mo5091w(String str, Throwable th) {
        mo5092w(str, th);
    }

    @Override // com.alibaba.sdk.android.logger.ILog
    /* renamed from: w */
    public void mo5092w(Object... objArr) {
        this.f6570b.m5110a(LogLevel.WARN, this.f6569a, objArr);
    }
}
