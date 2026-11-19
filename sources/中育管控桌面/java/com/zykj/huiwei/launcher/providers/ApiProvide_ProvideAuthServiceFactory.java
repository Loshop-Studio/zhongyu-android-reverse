package com.zykj.huiwei.launcher.providers;

import com.zykj.huiwei.launcher.api.AuthService;
import p006a5.AbstractC0016e;
import p006a5.InterfaceC0017f;
import p058f5.C6356a0;

/* loaded from: classes4.dex */
public final class ApiProvide_ProvideAuthServiceFactory implements InterfaceC0017f {
    private final InterfaceC0017f okHttpClientProvider;

    private ApiProvide_ProvideAuthServiceFactory(InterfaceC0017f interfaceC0017f) {
        this.okHttpClientProvider = interfaceC0017f;
    }

    public static ApiProvide_ProvideAuthServiceFactory create(InterfaceC0017f interfaceC0017f) {
        return new ApiProvide_ProvideAuthServiceFactory(interfaceC0017f);
    }

    public static AuthService provideAuthService(C6356a0 c6356a0) {
        return (AuthService) AbstractC0016e.m26c(ApiProvide.INSTANCE.provideAuthService(c6356a0));
    }

    @Override // javax.inject.Provider
    public AuthService get() {
        return provideAuthService((C6356a0) this.okHttpClientProvider.get());
    }
}
