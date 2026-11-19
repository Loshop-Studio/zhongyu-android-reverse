package com.zykj.huiwei.launcher.providers;

import com.zykj.huiwei.launcher.api.UserService;
import p006a5.AbstractC0016e;
import p006a5.InterfaceC0017f;
import p058f5.C6356a0;

/* loaded from: classes4.dex */
public final class ApiProvide_ProvideUserServiceFactory implements InterfaceC0017f {
    private final InterfaceC0017f okHttpClientProvider;

    private ApiProvide_ProvideUserServiceFactory(InterfaceC0017f interfaceC0017f) {
        this.okHttpClientProvider = interfaceC0017f;
    }

    public static ApiProvide_ProvideUserServiceFactory create(InterfaceC0017f interfaceC0017f) {
        return new ApiProvide_ProvideUserServiceFactory(interfaceC0017f);
    }

    public static UserService provideUserService(C6356a0 c6356a0) {
        return (UserService) AbstractC0016e.m26c(ApiProvide.INSTANCE.provideUserService(c6356a0));
    }

    @Override // javax.inject.Provider
    public UserService get() {
        return provideUserService((C6356a0) this.okHttpClientProvider.get());
    }
}
