package com.friday.common.p067di;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blankj.utilcode.util.AppUtils;
import com.friday.common.network.StudentSessionInterceptor;
import com.google.gson.GsonBuilder;
import com.zykj.http.annotation.CommonOkHttpClient;
import com.zykj.http.annotation.HeaderBeanFlow;
import com.zykj.http.annotation.ResponseOkHttpClient;
import com.zykj.http.annotation.UnauthorizedFlow;
import com.zykj.http.bean.HeaderBean;
import com.zykj.http.interceptor.HeadInterceptor;
import com.zykj.http.interceptor.NetworkInterceptor;
import com.zykj.http.interceptor.RefreshTokenInterceptor;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import je.C9742v;
import kotlin.jvm.internal.AbstractC9979u;
import p110d2.InterfaceC8919i;
import p122df.C9033d0;
import p137ef.C9140a;
import p154ff.C9240k;
import p170h2.C9452c;
import p170h2.C9454e;
import p170h2.C9455f;
import p379vd.AbstractC11608q;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11602k;
import p379vd.InterfaceC11603l;

@StabilityInferred(parameters = 1)
@Keep
/* loaded from: classes3.dex */
public final class OkHttpClientProvide {
    public static final int $stable = 0;
    public static final OkHttpClientProvide INSTANCE = new OkHttpClientProvide();
    private static final long OkHTTP_CONNECT_TIME = 30;
    private static final long OkHTTP_READ_TIME = 30;
    private static final long OkHTTP_WRITE_TIME = 30;

    private OkHttpClientProvide() {
    }

    @AesOkhttpClient
    public final C9742v provideAesOkhttpClient(NetworkInterceptor networkInterceptor, StudentSessionInterceptor studentSessionInterceptor, HeadInterceptor headInterceptor, RefreshTokenInterceptor responseInterceptor, C9454e requestEncryptInterceptor, C9455f responseDecryptInterceptor) {
        AbstractC9979u.m20294g(networkInterceptor, "networkInterceptor");
        AbstractC9979u.m20294g(studentSessionInterceptor, "studentSessionInterceptor");
        AbstractC9979u.m20294g(headInterceptor, "headInterceptor");
        AbstractC9979u.m20294g(responseInterceptor, "responseInterceptor");
        AbstractC9979u.m20294g(requestEncryptInterceptor, "requestEncryptInterceptor");
        AbstractC9979u.m20294g(responseDecryptInterceptor, "responseDecryptInterceptor");
        C9742v.a aVar = new C9742v.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.m19559e(30L, timeUnit);
        aVar.m19551O(30L, timeUnit);
        aVar.m19554R(30L, timeUnit);
        aVar.m19555a(networkInterceptor);
        aVar.m19555a(studentSessionInterceptor);
        aVar.m19555a(headInterceptor);
        aVar.m19555a(responseInterceptor);
        aVar.m19555a(requestEncryptInterceptor);
        aVar.m19555a(responseDecryptInterceptor);
        return aVar.m19557c();
    }

    @AuthTokenOkHttpClient
    public final C9742v provideAuthTokenOkHttpClient(NetworkInterceptor networkInterceptor) {
        AbstractC9979u.m20294g(networkInterceptor, "networkInterceptor");
        C9742v.a aVar = new C9742v.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.m19559e(30L, timeUnit);
        aVar.m19551O(30L, timeUnit);
        aVar.m19554R(30L, timeUnit);
        aVar.m19555a(networkInterceptor);
        return aVar.m19557c();
    }

    @CommonOkHttpClient
    public final C9742v provideCommonOkHttpClient(NetworkInterceptor networkInterceptor) {
        AbstractC9979u.m20294g(networkInterceptor, "networkInterceptor");
        C9742v.a aVar = new C9742v.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.m19559e(30L, timeUnit);
        aVar.m19551O(30L, timeUnit);
        aVar.m19554R(30L, timeUnit);
        aVar.m19555a(networkInterceptor);
        return aVar.m19557c();
    }

    public final InterfaceC8919i provideEzyService(@RefreshTokenOkHttpClient C9742v okHttpClient) throws SecurityException {
        AbstractC9979u.m20294g(okHttpClient, "okHttpClient");
        Object objM17712b = new C9033d0.b().m17726f(okHttpClient).m17722b("https://hagateway.zyai.cc").m17721a(C9240k.m18163a()).m17721a(C9140a.m17985a(new GsonBuilder().registerTypeAdapter(Date.class, new C9452c()).create())).m17724d().m17712b(InterfaceC8919i.class);
        AbstractC9979u.m20293f(objM17712b, "create(...)");
        return (InterfaceC8919i) objM17712b;
    }

    @HeaderBeanFlow
    public final InterfaceC11603l provideHeaderBeanFlow() {
        return AbstractC11613v.m25602a(new HeaderBean(AppUtils.getAppPackageName(), String.valueOf(AppUtils.getAppVersionCode()), null, null, null, 28, null));
    }

    @RefreshTokenOkHttpClient
    public final C9742v provideRefreshTokenOkHttpClient(NetworkInterceptor networkInterceptor, StudentSessionInterceptor studentSessionInterceptor, HeadInterceptor headInterceptor, RefreshTokenInterceptor responseInterceptor) {
        AbstractC9979u.m20294g(networkInterceptor, "networkInterceptor");
        AbstractC9979u.m20294g(studentSessionInterceptor, "studentSessionInterceptor");
        AbstractC9979u.m20294g(headInterceptor, "headInterceptor");
        AbstractC9979u.m20294g(responseInterceptor, "responseInterceptor");
        C9742v.a aVar = new C9742v.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.m19559e(30L, timeUnit);
        aVar.m19551O(30L, timeUnit);
        aVar.m19554R(30L, timeUnit);
        aVar.m19555a(networkInterceptor);
        aVar.m19555a(studentSessionInterceptor);
        aVar.m19555a(headInterceptor);
        aVar.m19555a(responseInterceptor);
        return aVar.m19557c();
    }

    @ResponseOkHttpClient
    public final C9742v provideResponseOkHttpClient(NetworkInterceptor networkInterceptor, StudentSessionInterceptor studentSessionInterceptor, HeadInterceptor headInterceptor) {
        AbstractC9979u.m20294g(networkInterceptor, "networkInterceptor");
        AbstractC9979u.m20294g(studentSessionInterceptor, "studentSessionInterceptor");
        AbstractC9979u.m20294g(headInterceptor, "headInterceptor");
        C9742v.a aVar = new C9742v.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.m19559e(30L, timeUnit);
        aVar.m19551O(30L, timeUnit);
        aVar.m19554R(30L, timeUnit);
        aVar.m19555a(networkInterceptor);
        aVar.m19555a(studentSessionInterceptor);
        aVar.m19555a(headInterceptor);
        return aVar.m19557c();
    }

    @UnauthorizedFlow
    public final InterfaceC11602k provideUnauthorizedFlow() {
        return AbstractC11608q.m25592b(0, 0, null, 7, null);
    }
}
