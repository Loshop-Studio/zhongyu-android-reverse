package com.zykj.huiwei.launcher.providers;

import androidx.lifecycle.MutableLiveData;
import com.zykj.huiwei.launcher.proto.C6063a;
import p006a5.AbstractC0016e;
import p006a5.InterfaceC0017f;

/* loaded from: classes4.dex */
public final class GlobalObjectProvide_ProvideServerLiveDataBeanFactory implements InterfaceC0017f {
    private final GlobalObjectProvide module;

    private GlobalObjectProvide_ProvideServerLiveDataBeanFactory(GlobalObjectProvide globalObjectProvide) {
        this.module = globalObjectProvide;
    }

    public static GlobalObjectProvide_ProvideServerLiveDataBeanFactory create(GlobalObjectProvide globalObjectProvide) {
        return new GlobalObjectProvide_ProvideServerLiveDataBeanFactory(globalObjectProvide);
    }

    public static MutableLiveData<C6063a> provideServerLiveDataBean(GlobalObjectProvide globalObjectProvide) {
        return (MutableLiveData) AbstractC0016e.m26c(globalObjectProvide.provideServerLiveDataBean());
    }

    @Override // javax.inject.Provider
    public MutableLiveData<C6063a> get() {
        return provideServerLiveDataBean(this.module);
    }
}
