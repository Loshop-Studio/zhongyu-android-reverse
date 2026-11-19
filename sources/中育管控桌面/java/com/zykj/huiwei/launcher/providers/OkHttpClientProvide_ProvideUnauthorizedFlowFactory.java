package com.zykj.huiwei.launcher.providers;

import com.zykj.lib.error.code.ErrorCode;
import kotlinx.coroutines.flow.MutableSharedFlow;
import p006a5.AbstractC0016e;
import p006a5.InterfaceC0017f;

/* loaded from: classes4.dex */
public final class OkHttpClientProvide_ProvideUnauthorizedFlowFactory implements InterfaceC0017f {

    public static final class InstanceHolder {
        static final OkHttpClientProvide_ProvideUnauthorizedFlowFactory INSTANCE = new OkHttpClientProvide_ProvideUnauthorizedFlowFactory();

        private InstanceHolder() {
        }
    }

    public static OkHttpClientProvide_ProvideUnauthorizedFlowFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MutableSharedFlow<ErrorCode> provideUnauthorizedFlow() {
        return (MutableSharedFlow) AbstractC0016e.m26c(OkHttpClientProvide.INSTANCE.provideUnauthorizedFlow());
    }

    @Override // javax.inject.Provider
    public MutableSharedFlow<ErrorCode> get() {
        return provideUnauthorizedFlow();
    }
}
