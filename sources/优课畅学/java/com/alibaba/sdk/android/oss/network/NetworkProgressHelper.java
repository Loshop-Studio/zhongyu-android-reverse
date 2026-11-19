package com.alibaba.sdk.android.oss.network;

import java.io.InputStream;
import p136i9.C8897a0;
import p136i9.C8903d0;
import p136i9.InterfaceC8926x;

/* loaded from: classes3.dex */
public class NetworkProgressHelper {
    public static ProgressTouchableRequestBody addProgressRequestBody(InputStream inputStream, long j10, String str, ExecutionContext executionContext) {
        return new ProgressTouchableRequestBody(inputStream, j10, str, executionContext);
    }

    public static C8897a0 addProgressResponseListener(C8897a0 c8897a0, final ExecutionContext executionContext) {
        return c8897a0.m14954A().m15013b(new InterfaceC8926x() { // from class: com.alibaba.sdk.android.oss.network.NetworkProgressHelper.1
            @Override // p136i9.InterfaceC8926x
            public C8903d0 intercept(InterfaceC8926x.a aVar) {
                C8903d0 c8903d0Mo15333b = aVar.mo15333b(aVar.mo15332a());
                return c8903d0Mo15333b.m15137p().m15144b(new ProgressTouchableResponseBody(c8903d0Mo15333b.m15124b(), executionContext)).m15145c();
            }
        }).m15014c();
    }
}
