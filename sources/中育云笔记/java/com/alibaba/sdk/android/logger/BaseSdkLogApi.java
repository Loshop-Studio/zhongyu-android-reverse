package com.alibaba.sdk.android.logger;

import com.alibaba.sdk.android.logger.interceptor.C5611a;
import com.alibaba.sdk.android.logger.interceptor.C5612b;
import com.alibaba.sdk.android.logger.interceptor.InterceptorManager;
import com.alibaba.sdk.android.logger.p056a.C5602a;
import com.alibaba.sdk.android.logger.p057b.C5603a;
import com.alibaba.sdk.android.logger.p057b.C5604b;
import com.alibaba.sdk.android.logger.p057b.C5605c;
import com.alibaba.sdk.android.logger.p057b.C5607e;
import com.alibaba.sdk.android.logger.p057b.C5608f;
import com.alibaba.sdk.android.logger.p057b.C5609g;
import com.alibaba.sdk.android.logger.p057b.C5610h;

/* loaded from: classes3.dex */
public class BaseSdkLogApi {

    /* renamed from: a */
    private C5609g f4072a;

    /* renamed from: d */
    private InterceptorManager f4075d;

    /* renamed from: c */
    private C5602a f4074c = new C5602a();

    /* renamed from: e */
    private C5604b f4076e = new C5604b();

    /* renamed from: b */
    private C5607e f4073b = new C5607e(this.f4076e);

    public BaseSdkLogApi(String str, boolean z10) {
        this.f4072a = new C5609g(str);
        InterceptorManager interceptorManager = new InterceptorManager(new C5611a(new C5610h(this.f4074c)), new C5612b(this.f4073b));
        this.f4075d = interceptorManager;
        interceptorManager.m3561a(new C5605c(this.f4073b));
        if (z10) {
            this.f4076e.m3547a(LogLevel.DEBUG);
            this.f4075d.m3562a(new C5603a());
        }
    }

    public void addILogger(ILogger iLogger) {
        this.f4073b.m3553b(iLogger);
    }

    public <T> void addObjectFormat(Class<T> cls, IObjectLogFormat<T> iObjectLogFormat) {
        this.f4074c.m3544a(cls, iObjectLogFormat);
    }

    public void enable(boolean z10) {
        this.f4076e.m3548a(z10);
    }

    public LogBuilder getLogBuilder(Object obj) {
        return new LogBuilder(this.f4075d, obj, this.f4072a);
    }

    public ILog getLogger(Object obj) {
        return new C5608f(this.f4072a.m3555a(obj), this.f4075d);
    }

    public void removeILogger(ILogger iLogger) {
        this.f4073b.m3554c(iLogger);
    }

    public void setILogger(ILogger iLogger) {
        this.f4073b.m3551a(iLogger);
    }

    public void setLevel(LogLevel logLevel) {
        this.f4076e.m3547a(logLevel);
    }
}
