package com.alibaba.sdk.android.logger;

import com.alibaba.sdk.android.logger.interceptor.ILogInterceptor;
import com.alibaba.sdk.android.logger.interceptor.InterceptorManager;
import com.alibaba.sdk.android.logger.interceptor.InterfaceC1129c;
import com.alibaba.sdk.android.logger.p027b.C1124f;
import com.alibaba.sdk.android.logger.p027b.C1125g;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class LogBuilder {
    private Object instanceObject;
    private ArrayList<ILogInterceptor> logInterceptors = new ArrayList<>();
    private ArrayList<InterfaceC1129c> loggerInterceptors = new ArrayList<>();
    private InterceptorManager originInterceptorManager;
    private C1125g tagGenerator;

    public LogBuilder(InterceptorManager interceptorManager, Object obj, C1125g c1125g) {
        this.originInterceptorManager = interceptorManager;
        this.instanceObject = obj;
        this.tagGenerator = c1125g;
    }

    public LogBuilder addLogInterceptor(ILogInterceptor iLogInterceptor) {
        this.logInterceptors.add(iLogInterceptor);
        return this;
    }

    public LogBuilder addLoggerInterceptor(InterfaceC1129c interfaceC1129c) {
        this.loggerInterceptors.add(interfaceC1129c);
        return this;
    }

    public ILog build() {
        InterceptorManager interceptorManagerM5109a = this.originInterceptorManager.m5109a();
        Iterator<ILogInterceptor> it = this.logInterceptors.iterator();
        while (it.hasNext()) {
            interceptorManagerM5109a.m5111a(it.next());
        }
        Iterator<InterfaceC1129c> it2 = this.loggerInterceptors.iterator();
        while (it2.hasNext()) {
            interceptorManagerM5109a.m5112a(it2.next());
        }
        return new C1124f(this.tagGenerator.m5105a(this.instanceObject), interceptorManagerM5109a);
    }
}
