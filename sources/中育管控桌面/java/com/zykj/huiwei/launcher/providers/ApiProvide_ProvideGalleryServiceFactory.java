package com.zykj.huiwei.launcher.providers;

import com.zykj.gallery.api.PictureService;
import p006a5.AbstractC0016e;
import p006a5.InterfaceC0017f;
import p058f5.C6356a0;

/* loaded from: classes4.dex */
public final class ApiProvide_ProvideGalleryServiceFactory implements InterfaceC0017f {
    private final InterfaceC0017f okHttpClientProvider;

    private ApiProvide_ProvideGalleryServiceFactory(InterfaceC0017f interfaceC0017f) {
        this.okHttpClientProvider = interfaceC0017f;
    }

    public static ApiProvide_ProvideGalleryServiceFactory create(InterfaceC0017f interfaceC0017f) {
        return new ApiProvide_ProvideGalleryServiceFactory(interfaceC0017f);
    }

    public static PictureService provideGalleryService(C6356a0 c6356a0) {
        return (PictureService) AbstractC0016e.m26c(ApiProvide.INSTANCE.provideGalleryService(c6356a0));
    }

    @Override // javax.inject.Provider
    public PictureService get() {
        return provideGalleryService((C6356a0) this.okHttpClientProvider.get());
    }
}
