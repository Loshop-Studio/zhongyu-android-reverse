package com.zykj.huiwei.launcher.providers;

import com.zykj.huiwei.launcher.api.GatewayService;
import p006a5.AbstractC0016e;
import p006a5.InterfaceC0017f;
import p058f5.C6356a0;

/* loaded from: classes4.dex */
public final class ApiProvide_ProvideGatewayServiceFactory implements InterfaceC0017f {
    private final InterfaceC0017f okHttpClientProvider;

    private ApiProvide_ProvideGatewayServiceFactory(InterfaceC0017f interfaceC0017f) {
        this.okHttpClientProvider = interfaceC0017f;
    }

    public static ApiProvide_ProvideGatewayServiceFactory create(InterfaceC0017f interfaceC0017f) {
        return new ApiProvide_ProvideGatewayServiceFactory(interfaceC0017f);
    }

    public static GatewayService provideGatewayService(C6356a0 c6356a0) {
        return (GatewayService) AbstractC0016e.m26c(ApiProvide.INSTANCE.provideGatewayService(c6356a0));
    }

    @Override // javax.inject.Provider
    public GatewayService get() {
        return provideGatewayService((C6356a0) this.okHttpClientProvider.get());
    }
}
