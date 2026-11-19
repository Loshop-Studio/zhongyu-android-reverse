package com.zykj.gallery.p034ui.gallery.commonState;

import com.zykj.gallery.repository.GalleryRepository;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import p006a5.InterfaceC0017f;

/* loaded from: classes4.dex */
public final class GalleryStateDelegate_Factory implements InterfaceC0017f {
    private final InterfaceC0017f isRecycleBinProvider;
    private final InterfaceC0017f repositoryProvider;
    private final InterfaceC0017f scopeProvider;

    private GalleryStateDelegate_Factory(InterfaceC0017f interfaceC0017f, InterfaceC0017f interfaceC0017f2, InterfaceC0017f interfaceC0017f3) {
        this.repositoryProvider = interfaceC0017f;
        this.isRecycleBinProvider = interfaceC0017f2;
        this.scopeProvider = interfaceC0017f3;
    }

    public static GalleryStateDelegate_Factory create(InterfaceC0017f interfaceC0017f, InterfaceC0017f interfaceC0017f2, InterfaceC0017f interfaceC0017f3) {
        return new GalleryStateDelegate_Factory(interfaceC0017f, interfaceC0017f2, interfaceC0017f3);
    }

    public static GalleryStateDelegate newInstance(GalleryRepository galleryRepository, Function0<Boolean> function0, CoroutineScope coroutineScope) {
        return new GalleryStateDelegate(galleryRepository, function0, coroutineScope);
    }

    @Override // javax.inject.Provider
    public GalleryStateDelegate get() {
        return newInstance((GalleryRepository) this.repositoryProvider.get(), (Function0) this.isRecycleBinProvider.get(), (CoroutineScope) this.scopeProvider.get());
    }
}
