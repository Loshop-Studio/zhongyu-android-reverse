package com.alibaba.sdk.android.logger.interceptor;

import com.alibaba.sdk.android.logger.LogLevel;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class InterceptorManager {

    /* renamed from: a */
    private ArrayList<ILogInterceptor> f6575a = new ArrayList<>();

    /* renamed from: b */
    private ArrayList<InterfaceC1129c> f6576b = new ArrayList<>();

    /* renamed from: c */
    private C1127a f6577c;

    /* renamed from: d */
    private C1128b f6578d;

    public InterceptorManager(C1127a c1127a, C1128b c1128b) {
        this.f6577c = c1127a;
        this.f6578d = c1128b;
    }

    /* renamed from: a */
    public InterceptorManager m5109a() {
        InterceptorManager interceptorManager = new InterceptorManager(this.f6577c, this.f6578d);
        interceptorManager.f6575a.addAll(this.f6575a);
        interceptorManager.f6576b.addAll(this.f6576b);
        return interceptorManager;
    }

    /* renamed from: a */
    public void m5110a(LogLevel logLevel, String str, Object[] objArr) {
        toNextLogInterceptor(-1, logLevel, str, objArr);
    }

    /* renamed from: a */
    public void m5111a(ILogInterceptor iLogInterceptor) {
        this.f6575a.add(iLogInterceptor);
    }

    /* renamed from: a */
    public void m5112a(InterfaceC1129c interfaceC1129c) {
        this.f6576b.add(interfaceC1129c);
    }

    public void toNextLogInterceptor(int i4, LogLevel logLevel, String str, Object[] objArr) {
        int i5 = i4 + 1;
        if (i5 >= this.f6575a.size()) {
            this.f6577c.handle(this, i5, logLevel, str, objArr);
        } else {
            this.f6575a.get(i5).handle(this, i5, logLevel, str, objArr);
        }
    }

    public void toNextLoggerInterceptor(int i4, LogLevel logLevel, String str, String str2) {
        int i5 = i4 + 1;
        if (i5 >= this.f6576b.size()) {
            this.f6578d.mo5096a(this, i5, logLevel, str, str2);
        } else {
            this.f6576b.get(i5).mo5096a(this, i5, logLevel, str, str2);
        }
    }
}
