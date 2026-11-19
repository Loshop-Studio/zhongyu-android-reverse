package com.zykj.huiwei.launcher.providers;

import com.zykj.http.bean.HeaderBean;
import kotlinx.coroutines.flow.MutableStateFlow;
import p006a5.AbstractC0016e;
import p006a5.InterfaceC0017f;

/* loaded from: classes4.dex */
public final class OkHttpClientProvide_ProvideHeaderBeanFlowFactory implements InterfaceC0017f {

    public static final class InstanceHolder {
        static final OkHttpClientProvide_ProvideHeaderBeanFlowFactory INSTANCE = new OkHttpClientProvide_ProvideHeaderBeanFlowFactory();

        private InstanceHolder() {
        }
    }

    public static OkHttpClientProvide_ProvideHeaderBeanFlowFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MutableStateFlow<HeaderBean> provideHeaderBeanFlow() {
        return (MutableStateFlow) AbstractC0016e.m26c(OkHttpClientProvide.INSTANCE.provideHeaderBeanFlow());
    }

    @Override // javax.inject.Provider
    public MutableStateFlow<HeaderBean> get() {
        return provideHeaderBeanFlow();
    }
}
