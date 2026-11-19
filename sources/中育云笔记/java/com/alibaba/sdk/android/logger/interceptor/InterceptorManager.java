package com.alibaba.sdk.android.logger.interceptor;

import com.alibaba.sdk.android.logger.LogLevel;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class InterceptorManager {

    /* renamed from: a */
    private ArrayList<ILogInterceptor> f4094a = new ArrayList<>();

    /* renamed from: b */
    private ArrayList<InterfaceC5613c> f4095b = new ArrayList<>();

    /* renamed from: c */
    private C5611a f4096c;

    /* renamed from: d */
    private C5612b f4097d;

    public InterceptorManager(C5611a c5611a, C5612b c5612b) {
        this.f4096c = c5611a;
        this.f4097d = c5612b;
    }

    /* renamed from: a */
    public InterceptorManager m3559a() {
        InterceptorManager interceptorManager = new InterceptorManager(this.f4096c, this.f4097d);
        interceptorManager.f4094a.addAll(this.f4094a);
        interceptorManager.f4095b.addAll(this.f4095b);
        return interceptorManager;
    }

    public void toNextLogInterceptor(int i10, LogLevel logLevel, String str, Object[] objArr) {
        int i11 = i10 + 1;
        if (i11 >= this.f4094a.size()) {
            this.f4096c.handle(this, i11, logLevel, str, objArr);
        } else {
            this.f4094a.get(i11).handle(this, i11, logLevel, str, objArr);
        }
    }

    public void toNextLoggerInterceptor(int i10, LogLevel logLevel, String str, String str2) {
        int i11 = i10 + 1;
        if (i11 >= this.f4095b.size()) {
            this.f4097d.mo3546a(this, i11, logLevel, str, str2);
        } else {
            this.f4095b.get(i11).mo3546a(this, i11, logLevel, str, str2);
        }
    }

    /* renamed from: a */
    public void m3560a(LogLevel logLevel, String str, Object[] objArr) {
        toNextLogInterceptor(-1, logLevel, str, objArr);
    }

    /* renamed from: a */
    public void m3561a(ILogInterceptor iLogInterceptor) {
        this.f4094a.add(iLogInterceptor);
    }

    /* renamed from: a */
    public void m3562a(InterfaceC5613c interfaceC5613c) {
        this.f4095b.add(interfaceC5613c);
    }
}
