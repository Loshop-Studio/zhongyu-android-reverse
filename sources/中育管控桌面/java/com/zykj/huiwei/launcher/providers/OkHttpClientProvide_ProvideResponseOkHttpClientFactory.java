package com.zykj.huiwei.launcher.providers;

import com.zykj.http.interceptor.GzipInterceptor;
import com.zykj.http.interceptor.HeadInterceptor;
import com.zykj.http.interceptor.NetworkInterceptor;
import com.zykj.http.interceptor.RefreshTokenInterceptor;
import p006a5.AbstractC0016e;
import p006a5.InterfaceC0017f;
import p058f5.C6356a0;

/* loaded from: classes4.dex */
public final class OkHttpClientProvide_ProvideResponseOkHttpClientFactory implements InterfaceC0017f {
    private final InterfaceC0017f gzipRequestInterceptorProvider;
    private final InterfaceC0017f headInterceptorProvider;
    private final InterfaceC0017f networkInterceptorProvider;
    private final InterfaceC0017f responseInterceptorProvider;

    private OkHttpClientProvide_ProvideResponseOkHttpClientFactory(InterfaceC0017f interfaceC0017f, InterfaceC0017f interfaceC0017f2, InterfaceC0017f interfaceC0017f3, InterfaceC0017f interfaceC0017f4) {
        this.networkInterceptorProvider = interfaceC0017f;
        this.headInterceptorProvider = interfaceC0017f2;
        this.gzipRequestInterceptorProvider = interfaceC0017f3;
        this.responseInterceptorProvider = interfaceC0017f4;
    }

    public static OkHttpClientProvide_ProvideResponseOkHttpClientFactory create(InterfaceC0017f interfaceC0017f, InterfaceC0017f interfaceC0017f2, InterfaceC0017f interfaceC0017f3, InterfaceC0017f interfaceC0017f4) {
        return new OkHttpClientProvide_ProvideResponseOkHttpClientFactory(interfaceC0017f, interfaceC0017f2, interfaceC0017f3, interfaceC0017f4);
    }

    public static C6356a0 provideResponseOkHttpClient(NetworkInterceptor networkInterceptor, HeadInterceptor headInterceptor, GzipInterceptor gzipInterceptor, RefreshTokenInterceptor refreshTokenInterceptor) {
        return (C6356a0) AbstractC0016e.m26c(OkHttpClientProvide.INSTANCE.provideResponseOkHttpClient(networkInterceptor, headInterceptor, gzipInterceptor, refreshTokenInterceptor));
    }

    @Override // javax.inject.Provider
    public C6356a0 get() {
        return provideResponseOkHttpClient((NetworkInterceptor) this.networkInterceptorProvider.get(), (HeadInterceptor) this.headInterceptorProvider.get(), (GzipInterceptor) this.gzipRequestInterceptorProvider.get(), (RefreshTokenInterceptor) this.responseInterceptorProvider.get());
    }
}
