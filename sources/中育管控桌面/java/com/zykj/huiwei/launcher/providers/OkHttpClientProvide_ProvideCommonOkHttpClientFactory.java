package com.zykj.huiwei.launcher.providers;

import com.zykj.http.interceptor.NetworkInterceptor;
import p006a5.AbstractC0016e;
import p006a5.InterfaceC0017f;
import p058f5.C6356a0;

/* loaded from: classes4.dex */
public final class OkHttpClientProvide_ProvideCommonOkHttpClientFactory implements InterfaceC0017f {
    private final InterfaceC0017f networkInterceptorProvider;

    private OkHttpClientProvide_ProvideCommonOkHttpClientFactory(InterfaceC0017f interfaceC0017f) {
        this.networkInterceptorProvider = interfaceC0017f;
    }

    public static OkHttpClientProvide_ProvideCommonOkHttpClientFactory create(InterfaceC0017f interfaceC0017f) {
        return new OkHttpClientProvide_ProvideCommonOkHttpClientFactory(interfaceC0017f);
    }

    public static C6356a0 provideCommonOkHttpClient(NetworkInterceptor networkInterceptor) {
        return (C6356a0) AbstractC0016e.m26c(OkHttpClientProvide.INSTANCE.provideCommonOkHttpClient(networkInterceptor));
    }

    @Override // javax.inject.Provider
    public C6356a0 get() {
        return provideCommonOkHttpClient((NetworkInterceptor) this.networkInterceptorProvider.get());
    }
}
