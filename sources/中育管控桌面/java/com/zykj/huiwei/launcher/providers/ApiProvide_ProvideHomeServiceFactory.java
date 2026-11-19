package com.zykj.huiwei.launcher.providers;

import com.zykj.huiwei.launcher.api.HomeService;
import p006a5.AbstractC0016e;
import p006a5.InterfaceC0017f;
import p058f5.C6356a0;

/* loaded from: classes4.dex */
public final class ApiProvide_ProvideHomeServiceFactory implements InterfaceC0017f {
    private final InterfaceC0017f okHttpClientProvider;

    private ApiProvide_ProvideHomeServiceFactory(InterfaceC0017f interfaceC0017f) {
        this.okHttpClientProvider = interfaceC0017f;
    }

    public static ApiProvide_ProvideHomeServiceFactory create(InterfaceC0017f interfaceC0017f) {
        return new ApiProvide_ProvideHomeServiceFactory(interfaceC0017f);
    }

    public static HomeService provideHomeService(C6356a0 c6356a0) {
        return (HomeService) AbstractC0016e.m26c(ApiProvide.INSTANCE.provideHomeService(c6356a0));
    }

    @Override // javax.inject.Provider
    public HomeService get() {
        return provideHomeService((C6356a0) this.okHttpClientProvider.get());
    }
}
