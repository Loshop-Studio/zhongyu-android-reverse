package com.alibaba.sdk.android.logger;

import com.alibaba.sdk.android.logger.interceptor.ILogInterceptor;
import com.alibaba.sdk.android.logger.interceptor.InterceptorManager;
import com.alibaba.sdk.android.logger.interceptor.InterfaceC5613c;
import com.alibaba.sdk.android.logger.p057b.C5608f;
import com.alibaba.sdk.android.logger.p057b.C5609g;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class LogBuilder {
    private Object instanceObject;
    private ArrayList<ILogInterceptor> logInterceptors = new ArrayList<>();
    private ArrayList<InterfaceC5613c> loggerInterceptors = new ArrayList<>();
    private InterceptorManager originInterceptorManager;
    private C5609g tagGenerator;

    public LogBuilder(InterceptorManager interceptorManager, Object obj, C5609g c5609g) {
        this.originInterceptorManager = interceptorManager;
        this.instanceObject = obj;
        this.tagGenerator = c5609g;
    }

    public LogBuilder addLogInterceptor(ILogInterceptor iLogInterceptor) {
        this.logInterceptors.add(iLogInterceptor);
        return this;
    }

    public LogBuilder addLoggerInterceptor(InterfaceC5613c interfaceC5613c) {
        this.loggerInterceptors.add(interfaceC5613c);
        return this;
    }

    public ILog build() {
        InterceptorManager interceptorManagerM3559a = this.originInterceptorManager.m3559a();
        ArrayList<ILogInterceptor> arrayList = this.logInterceptors;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            ILogInterceptor iLogInterceptor = arrayList.get(i11);
            i11++;
            interceptorManagerM3559a.m3561a(iLogInterceptor);
        }
        ArrayList<InterfaceC5613c> arrayList2 = this.loggerInterceptors;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            InterfaceC5613c interfaceC5613c = arrayList2.get(i10);
            i10++;
            interceptorManagerM3559a.m3562a(interfaceC5613c);
        }
        return new C5608f(this.tagGenerator.m3555a(this.instanceObject), interceptorManagerM3559a);
    }
}
