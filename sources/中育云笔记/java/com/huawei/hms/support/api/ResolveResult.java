package com.huawei.hms.support.api;

import com.huawei.hms.support.api.client.Result;

/* loaded from: classes5.dex */
public class ResolveResult<T> extends Result {

    /* renamed from: c */
    public Object f11727c;

    public ResolveResult() {
        this.f11727c = null;
    }

    public T getValue() {
        return (T) this.f11727c;
    }

    public ResolveResult(T t10) {
        this.f11727c = t10;
    }
}
