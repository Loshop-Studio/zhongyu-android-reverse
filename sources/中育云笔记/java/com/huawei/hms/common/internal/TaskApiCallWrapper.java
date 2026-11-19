package com.huawei.hms.common.internal;

import p385w4.C11702f;

/* loaded from: classes5.dex */
public class TaskApiCallWrapper<TResult> extends BaseContentWrapper {

    /* renamed from: a */
    public final TaskApiCall f11592a;

    /* renamed from: b */
    public final C11702f f11593b;

    public TaskApiCallWrapper(TaskApiCall<? extends AnyClient, TResult> taskApiCall, C11702f c11702f) {
        super(1);
        this.f11592a = taskApiCall;
        this.f11593b = c11702f;
    }

    public TaskApiCall<? extends AnyClient, TResult> getTaskApiCall() {
        return this.f11592a;
    }

    public C11702f getTaskCompletionSource() {
        return this.f11593b;
    }
}
