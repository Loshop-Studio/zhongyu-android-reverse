package com.zykj.huiwei.launcher.providers;

import com.zykj.http.interceptor.NetworkInterceptor;
import p006a5.AbstractC0016e;
import p006a5.InterfaceC0017f;
import p058f5.C6356a0;

/* loaded from: classes4.dex */
public final class OkHttpClientProvide_ProvideFileOkHttpClientFactory implements InterfaceC0017f {
    private final InterfaceC0017f networkInterceptorProvider;

    private OkHttpClientProvide_ProvideFileOkHttpClientFactory(InterfaceC0017f interfaceC0017f) {
        this.networkInterceptorProvider = interfaceC0017f;
    }

    public static OkHttpClientProvide_ProvideFileOkHttpClientFactory create(InterfaceC0017f interfaceC0017f) {
        return new OkHttpClientProvide_ProvideFileOkHttpClientFactory(interfaceC0017f);
    }

    public static C6356a0 provideFileOkHttpClient(NetworkInterceptor networkInterceptor) {
        return (C6356a0) AbstractC0016e.m26c(OkHttpClientProvide.INSTANCE.provideFileOkHttpClient(networkInterceptor));
    }

    @Override // javax.inject.Provider
    public C6356a0 get() {
        return provideFileOkHttpClient((NetworkInterceptor) this.networkInterceptorProvider.get());
    }
}
