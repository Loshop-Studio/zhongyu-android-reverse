package com.zykj.huiwei.launcher.providers;

import androidx.lifecycle.MutableLiveData;
import com.zykj.huiwei.launcher.proto.C6075m;
import p006a5.AbstractC0016e;
import p006a5.InterfaceC0017f;

/* loaded from: classes4.dex */
public final class GlobalObjectProvide_ProvideUserLiveDataBeanFactory implements InterfaceC0017f {
    private final GlobalObjectProvide module;

    private GlobalObjectProvide_ProvideUserLiveDataBeanFactory(GlobalObjectProvide globalObjectProvide) {
        this.module = globalObjectProvide;
    }

    public static GlobalObjectProvide_ProvideUserLiveDataBeanFactory create(GlobalObjectProvide globalObjectProvide) {
        return new GlobalObjectProvide_ProvideUserLiveDataBeanFactory(globalObjectProvide);
    }

    public static MutableLiveData<C6075m> provideUserLiveDataBean(GlobalObjectProvide globalObjectProvide) {
        return (MutableLiveData) AbstractC0016e.m26c(globalObjectProvide.provideUserLiveDataBean());
    }

    @Override // javax.inject.Provider
    public MutableLiveData<C6075m> get() {
        return provideUserLiveDataBean(this.module);
    }
}
