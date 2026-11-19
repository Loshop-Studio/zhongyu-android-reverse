package com.zykj.huiwei.launcher.providers;

import com.zykj.huiwei.launcher.bean.BaseAppInfo;
import java.util.List;
import kotlinx.coroutines.flow.MutableStateFlow;
import p006a5.AbstractC0016e;
import p006a5.InterfaceC0017f;

/* loaded from: classes4.dex */
public final class GlobalObjectProvide_ProvideAppListFactory implements InterfaceC0017f {
    private final GlobalObjectProvide module;

    private GlobalObjectProvide_ProvideAppListFactory(GlobalObjectProvide globalObjectProvide) {
        this.module = globalObjectProvide;
    }

    public static GlobalObjectProvide_ProvideAppListFactory create(GlobalObjectProvide globalObjectProvide) {
        return new GlobalObjectProvide_ProvideAppListFactory(globalObjectProvide);
    }

    public static MutableStateFlow<List<BaseAppInfo>> provideAppList(GlobalObjectProvide globalObjectProvide) {
        return (MutableStateFlow) AbstractC0016e.m26c(globalObjectProvide.provideAppList());
    }

    @Override // javax.inject.Provider
    public MutableStateFlow<List<BaseAppInfo>> get() {
        return provideAppList(this.module);
    }
}
