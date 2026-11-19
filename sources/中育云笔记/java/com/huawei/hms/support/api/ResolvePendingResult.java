package com.huawei.hms.support.api;

import com.huawei.hms.core.aidl.InterfaceC7278e;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.Status;

/* loaded from: classes5.dex */
public class ResolvePendingResult<T extends InterfaceC7278e> extends PendingResultImpl<ResolveResult<T>, T> {
    public ResolvePendingResult(ApiClient apiClient, String str, InterfaceC7278e interfaceC7278e, Class<T> cls) {
        super(apiClient, str, interfaceC7278e, cls);
    }

    public static <R extends InterfaceC7278e> ResolvePendingResult<R> build(ApiClient apiClient, String str, InterfaceC7278e interfaceC7278e, Class<R> cls) {
        return new ResolvePendingResult<>(apiClient, str, interfaceC7278e, cls);
    }

    public T get() {
        return (T) await().getValue();
    }

    @Override // com.huawei.hms.support.api.PendingResultImpl
    public /* bridge */ /* synthetic */ Result onComplete(InterfaceC7278e interfaceC7278e) {
        return onComplete((ResolvePendingResult<T>) interfaceC7278e);
    }

    @Override // com.huawei.hms.support.api.PendingResultImpl
    public ResolveResult<T> onComplete(T t10) {
        ResolveResult<T> resolveResult = new ResolveResult<>(t10);
        resolveResult.setStatus(new Status(0));
        return resolveResult;
    }
}
