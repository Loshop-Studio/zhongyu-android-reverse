package com.alibaba.sdk.android.oss.network;

import java.io.InputStream;
import p058f5.C6356a0;
import p058f5.C6362d0;
import p058f5.InterfaceC6385x;

/* loaded from: classes3.dex */
public class NetworkProgressHelper {
    public static ProgressTouchableRequestBody addProgressRequestBody(InputStream inputStream, long j6, String str, ExecutionContext executionContext) {
        return new ProgressTouchableRequestBody(inputStream, j6, str, executionContext);
    }

    public static C6356a0 addProgressResponseListener(C6356a0 c6356a0, final ExecutionContext executionContext) {
        return c6356a0.m6490A().m6549b(new InterfaceC6385x() { // from class: com.alibaba.sdk.android.oss.network.NetworkProgressHelper.1
            @Override // p058f5.InterfaceC6385x
            public C6362d0 intercept(InterfaceC6385x.a aVar) {
                C6362d0 c6362d0Mo6872b = aVar.mo6872b(aVar.mo6871a());
                return c6362d0Mo6872b.m6674t().m6681b(new ProgressTouchableResponseBody(c6362d0Mo6872b.m6661c(), executionContext)).m6682c();
            }
        }).m6550c();
    }
}
