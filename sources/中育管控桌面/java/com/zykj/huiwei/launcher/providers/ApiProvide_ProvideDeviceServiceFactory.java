package com.zykj.huiwei.launcher.providers;

import com.zykj.huiwei.launcher.api.DeviceService;
import p006a5.AbstractC0016e;
import p006a5.InterfaceC0017f;
import p058f5.C6356a0;

/* loaded from: classes4.dex */
public final class ApiProvide_ProvideDeviceServiceFactory implements InterfaceC0017f {
    private final InterfaceC0017f okHttpClientProvider;

    private ApiProvide_ProvideDeviceServiceFactory(InterfaceC0017f interfaceC0017f) {
        this.okHttpClientProvider = interfaceC0017f;
    }

    public static ApiProvide_ProvideDeviceServiceFactory create(InterfaceC0017f interfaceC0017f) {
        return new ApiProvide_ProvideDeviceServiceFactory(interfaceC0017f);
    }

    public static DeviceService provideDeviceService(C6356a0 c6356a0) {
        return (DeviceService) AbstractC0016e.m26c(ApiProvide.INSTANCE.provideDeviceService(c6356a0));
    }

    @Override // javax.inject.Provider
    public DeviceService get() {
        return provideDeviceService((C6356a0) this.okHttpClientProvider.get());
    }
}
