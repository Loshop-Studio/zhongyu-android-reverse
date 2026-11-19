package com.zykj.huiwei.launcher.providers;

import com.zykj.http.interceptor.GzipInterceptor;
import com.zykj.http.interceptor.NetworkInterceptor;
import p006a5.AbstractC0016e;
import p006a5.InterfaceC0017f;
import p058f5.C6356a0;

/* loaded from: classes4.dex */
public final class OkHttpClientProvide_ProvideAuthOkHttpClientFactory implements InterfaceC0017f {
    private final InterfaceC0017f gzipRequestInterceptorProvider;
    private final InterfaceC0017f networkInterceptorProvider;

    private OkHttpClientProvide_ProvideAuthOkHttpClientFactory(InterfaceC0017f interfaceC0017f, InterfaceC0017f interfaceC0017f2) {
        this.networkInterceptorProvider = interfaceC0017f;
        this.gzipRequestInterceptorProvider = interfaceC0017f2;
    }

    public static OkHttpClientProvide_ProvideAuthOkHttpClientFactory create(InterfaceC0017f interfaceC0017f, InterfaceC0017f interfaceC0017f2) {
        return new OkHttpClientProvide_ProvideAuthOkHttpClientFactory(interfaceC0017f, interfaceC0017f2);
    }

    public static C6356a0 provideAuthOkHttpClient(NetworkInterceptor networkInterceptor, GzipInterceptor gzipInterceptor) {
        return (C6356a0) AbstractC0016e.m26c(OkHttpClientProvide.INSTANCE.provideAuthOkHttpClient(networkInterceptor, gzipInterceptor));
    }

    @Override // javax.inject.Provider
    public C6356a0 get() {
        return provideAuthOkHttpClient((NetworkInterceptor) this.networkInterceptorProvider.get(), (GzipInterceptor) this.gzipRequestInterceptorProvider.get());
    }
}
