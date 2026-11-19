package com.alibaba.sdk.android.oss.signer;

import com.alibaba.sdk.android.oss.internal.RequestMessage;

/* loaded from: classes2.dex */
public interface RequestPresigner {
    void presign(RequestMessage requestMessage) throws Exception;
}
