package com.zykj.huiwei.launcher.providers;

import com.zykj.huiwei.launcher.api.WhiteUrlService;
import p006a5.AbstractC0016e;
import p006a5.InterfaceC0017f;
import p058f5.C6356a0;

/* loaded from: classes4.dex */
public final class ApiProvide_ProvideWhiteUrlServiceFactory implements InterfaceC0017f {
    private final InterfaceC0017f okHttpClientProvider;

    private ApiProvide_ProvideWhiteUrlServiceFactory(InterfaceC0017f interfaceC0017f) {
        this.okHttpClientProvider = interfaceC0017f;
    }

    public static ApiProvide_ProvideWhiteUrlServiceFactory create(InterfaceC0017f interfaceC0017f) {
        return new ApiProvide_ProvideWhiteUrlServiceFactory(interfaceC0017f);
    }

    public static WhiteUrlService provideWhiteUrlService(C6356a0 c6356a0) {
        return (WhiteUrlService) AbstractC0016e.m26c(ApiProvide.INSTANCE.provideWhiteUrlService(c6356a0));
    }

    @Override // javax.inject.Provider
    public WhiteUrlService get() {
        return provideWhiteUrlService((C6356a0) this.okHttpClientProvider.get());
    }
}
