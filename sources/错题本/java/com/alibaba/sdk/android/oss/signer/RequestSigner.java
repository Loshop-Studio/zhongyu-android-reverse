package com.alibaba.sdk.android.oss.signer;

import com.alibaba.sdk.android.oss.internal.RequestMessage;

/* loaded from: classes2.dex */
public interface RequestSigner {
    void sign(RequestMessage requestMessage) throws Exception;
}
