package com.alibaba.sdk.android.logger;

import com.alibaba.sdk.android.logger.interceptor.C1127a;
import com.alibaba.sdk.android.logger.interceptor.C1128b;
import com.alibaba.sdk.android.logger.interceptor.InterceptorManager;
import com.alibaba.sdk.android.logger.p026a.C1118a;
import com.alibaba.sdk.android.logger.p027b.C1119a;
import com.alibaba.sdk.android.logger.p027b.C1120b;
import com.alibaba.sdk.android.logger.p027b.C1121c;
import com.alibaba.sdk.android.logger.p027b.C1123e;
import com.alibaba.sdk.android.logger.p027b.C1124f;
import com.alibaba.sdk.android.logger.p027b.C1125g;
import com.alibaba.sdk.android.logger.p027b.C1126h;

/* loaded from: classes.dex */
public class BaseSdkLogApi {

    /* renamed from: a */
    private C1125g f6553a;

    /* renamed from: d */
    private InterceptorManager f6556d;

    /* renamed from: c */
    private C1118a f6555c = new C1118a();

    /* renamed from: e */
    private C1120b f6557e = new C1120b();

    /* renamed from: b */
    private C1123e f6554b = new C1123e(this.f6557e);

    public BaseSdkLogApi(String str, boolean z3) {
        this.f6553a = new C1125g(str);
        InterceptorManager interceptorManager = new InterceptorManager(new C1127a(new C1126h(this.f6555c)), new C1128b(this.f6554b));
        this.f6556d = interceptorManager;
        interceptorManager.m5111a(new C1121c(this.f6554b));
        if (z3) {
            this.f6557e.m5097a(LogLevel.DEBUG);
            this.f6556d.m5112a(new C1119a());
        }
    }

    public void addILogger(ILogger iLogger) {
        this.f6554b.m5103b(iLogger);
    }

    public <T> void addObjectFormat(Class<T> cls, IObjectLogFormat<T> iObjectLogFormat) {
        this.f6555c.m5094a(cls, iObjectLogFormat);
    }

    public void enable(boolean z3) {
        this.f6557e.m5098a(z3);
    }

    public LogBuilder getLogBuilder(Object obj) {
        return new LogBuilder(this.f6556d, obj, this.f6553a);
    }

    public ILog getLogger(Object obj) {
        return new C1124f(this.f6553a.m5105a(obj), this.f6556d);
    }

    public void removeILogger(ILogger iLogger) {
        this.f6554b.m5104c(iLogger);
    }

    public void setILogger(ILogger iLogger) {
        this.f6554b.m5101a(iLogger);
    }

    public void setLevel(LogLevel logLevel) {
        this.f6557e.m5097a(logLevel);
    }
}
