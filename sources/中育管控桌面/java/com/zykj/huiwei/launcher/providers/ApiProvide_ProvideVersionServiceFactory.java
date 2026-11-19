package com.zykj.huiwei.launcher.providers;

import com.zykj.huiwei.launcher.api.VersionService;
import p006a5.AbstractC0016e;
import p006a5.InterfaceC0017f;
import p058f5.C6356a0;

/* loaded from: classes4.dex */
public final class ApiProvide_ProvideVersionServiceFactory implements InterfaceC0017f {
    private final InterfaceC0017f okHttpClientProvider;

    private ApiProvide_ProvideVersionServiceFactory(InterfaceC0017f interfaceC0017f) {
        this.okHttpClientProvider = interfaceC0017f;
    }

    public static ApiProvide_ProvideVersionServiceFactory create(InterfaceC0017f interfaceC0017f) {
        return new ApiProvide_ProvideVersionServiceFactory(interfaceC0017f);
    }

    public static VersionService provideVersionService(C6356a0 c6356a0) {
        return (VersionService) AbstractC0016e.m26c(ApiProvide.INSTANCE.provideVersionService(c6356a0));
    }

    @Override // javax.inject.Provider
    public VersionService get() {
        return provideVersionService((C6356a0) this.okHttpClientProvider.get());
    }
}
