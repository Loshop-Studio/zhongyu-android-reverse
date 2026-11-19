package com.alibaba.sdk.android.oss.internal;

import com.alibaba.sdk.android.oss.model.OSSResult;

/* loaded from: classes3.dex */
public interface ResponseParser<T extends OSSResult> {
    T parse(ResponseMessage responseMessage);
}
