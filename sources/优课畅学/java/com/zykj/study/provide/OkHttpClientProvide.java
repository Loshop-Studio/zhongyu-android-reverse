package com.zykj.study.provide;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blankj.utilcode.util.AbstractC5357d;
import com.zykj.http.annotation.CommonOkHttpClient;
import com.zykj.http.annotation.CommonResponseOkHttpClient;
import com.zykj.http.annotation.HeaderBeanFlow;
import com.zykj.http.annotation.ResponseOkHttpClient;
import com.zykj.http.annotation.UnauthorizedFlow;
import com.zykj.http.bean.HeaderBean;
import com.zykj.http.interceptor.GzipInterceptor;
import com.zykj.http.interceptor.HeadInterceptor;
import com.zykj.http.interceptor.NetworkInterceptor;
import com.zykj.http.interceptor.RefreshTokenInterceptor;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;
import kotlin.jvm.internal.AbstractC9133u;
import p136i9.C8897a0;
import p169l8.AbstractC9276m;
import p169l8.AbstractC9281r;
import p169l8.InterfaceC9270g;
import p169l8.InterfaceC9271h;

@StabilityInferred(parameters = 1)
@Keep
/* loaded from: classes3.dex */
public final class OkHttpClientProvide {
    public static final int $stable = 0;
    public static final OkHttpClientProvide INSTANCE = new OkHttpClientProvide();

    private OkHttpClientProvide() {
    }

    @Singleton
    @AuthOkHttpClient
    public final C8897a0 provideAuthOkHttpClient(NetworkInterceptor networkInterceptor, GzipInterceptor gzipRequestInterceptor) {
        AbstractC9133u.m16133g(networkInterceptor, "networkInterceptor");
        AbstractC9133u.m16133g(gzipRequestInterceptor, "gzipRequestInterceptor");
        C8897a0.a aVar = new C8897a0.a();
        aVar.m15012a(networkInterceptor);
        aVar.m15013b(gzipRequestInterceptor);
        return aVar.m15014c();
    }

    @CommonOkHttpClient
    public final C8897a0 provideCommonOkHttpClient(NetworkInterceptor networkInterceptor, HeadInterceptor headInterceptor, ClientCodeInterceptor clientCodeInterceptor) {
        AbstractC9133u.m16133g(networkInterceptor, "networkInterceptor");
        AbstractC9133u.m16133g(headInterceptor, "headInterceptor");
        AbstractC9133u.m16133g(clientCodeInterceptor, "clientCodeInterceptor");
        C8897a0.a aVar = new C8897a0.a();
        aVar.m15012a(networkInterceptor);
        aVar.m15012a(headInterceptor);
        aVar.m15012a(clientCodeInterceptor);
        return aVar.m15014c();
    }

    @CommonResponseOkHttpClient
    public final C8897a0 provideCommonResponseOkHttpClient(NetworkInterceptor networkInterceptor, HeadInterceptor headInterceptor, GzipInterceptor gzipRequestInterceptor, ResponseRefreshTokenInterceptor responseInterceptor, ClientCodeInterceptor clientCodeInterceptor) {
        AbstractC9133u.m16133g(networkInterceptor, "networkInterceptor");
        AbstractC9133u.m16133g(headInterceptor, "headInterceptor");
        AbstractC9133u.m16133g(gzipRequestInterceptor, "gzipRequestInterceptor");
        AbstractC9133u.m16133g(responseInterceptor, "responseInterceptor");
        AbstractC9133u.m16133g(clientCodeInterceptor, "clientCodeInterceptor");
        C8897a0.a aVar = new C8897a0.a();
        aVar.m15012a(networkInterceptor);
        aVar.m15012a(headInterceptor);
        aVar.m15012a(responseInterceptor);
        aVar.m15013b(gzipRequestInterceptor);
        aVar.m15012a(clientCodeInterceptor);
        return aVar.m15014c();
    }

    @Singleton
    @HeaderBeanFlow
    public final InterfaceC9271h provideHeaderBeanFlow() {
        return AbstractC9281r.m17054a(new HeaderBean(AbstractC5357d.m2436b(), String.valueOf(AbstractC5357d.m2437c()), null, null, null, 28, null));
    }

    @Singleton
    @LessonDeauthorizedFlow
    public final InterfaceC9270g provideLessonDeauthorizedFlow() {
        return AbstractC9276m.m17044b(0, 0, null, 7, null);
    }

    @RefreshTokenOkHttpClient
    public final C8897a0 provideRefreshTokenOkHttpClient(NetworkInterceptor networkInterceptor, HeadInterceptor headInterceptor, ClientCodeInterceptor clientCodeInterceptor, RefreshTokenInterceptor responseInterceptor) {
        AbstractC9133u.m16133g(networkInterceptor, "networkInterceptor");
        AbstractC9133u.m16133g(headInterceptor, "headInterceptor");
        AbstractC9133u.m16133g(clientCodeInterceptor, "clientCodeInterceptor");
        AbstractC9133u.m16133g(responseInterceptor, "responseInterceptor");
        C8897a0.a aVar = new C8897a0.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.m15016e(30L, timeUnit);
        aVar.m15008R(30L, timeUnit);
        aVar.m15011U(30L, timeUnit);
        aVar.m15012a(networkInterceptor);
        aVar.m15012a(headInterceptor);
        aVar.m15012a(clientCodeInterceptor);
        aVar.m15012a(responseInterceptor);
        return aVar.m15014c();
    }

    @ResponseOkHttpClient
    public final C8897a0 provideResponseOkHttpClient(NetworkInterceptor networkInterceptor, HeadInterceptor headInterceptor, GzipInterceptor gzipRequestInterceptor, ClientCodeInterceptor clientCodeInterceptor) {
        AbstractC9133u.m16133g(networkInterceptor, "networkInterceptor");
        AbstractC9133u.m16133g(headInterceptor, "headInterceptor");
        AbstractC9133u.m16133g(gzipRequestInterceptor, "gzipRequestInterceptor");
        AbstractC9133u.m16133g(clientCodeInterceptor, "clientCodeInterceptor");
        C8897a0.a aVar = new C8897a0.a();
        aVar.m15012a(networkInterceptor);
        aVar.m15012a(headInterceptor);
        aVar.m15013b(gzipRequestInterceptor);
        aVar.m15012a(clientCodeInterceptor);
        return aVar.m15014c();
    }

    @Singleton
    @UnauthorizedFlow
    public final InterfaceC9270g provideUnauthorizedFlow() {
        return AbstractC9276m.m17044b(0, 0, null, 7, null);
    }
}
