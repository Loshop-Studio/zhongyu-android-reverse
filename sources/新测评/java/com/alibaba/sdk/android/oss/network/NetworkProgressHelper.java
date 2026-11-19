package com.alibaba.sdk.android.oss.network;

import java.io.IOException;
import java.io.InputStream;
import p011a9.C0059v;
import p011a9.C0062y;
import p011a9.InterfaceC0056s;

/* loaded from: classes3.dex */
public class NetworkProgressHelper {
    public static ProgressTouchableRequestBody addProgressRequestBody(InputStream inputStream, long j10, String str, ExecutionContext executionContext) {
        return new ProgressTouchableRequestBody(inputStream, j10, str, executionContext);
    }

    public static C0059v addProgressResponseListener(C0059v c0059v, final ExecutionContext executionContext) {
        return c0059v.m295A().m345b(new InterfaceC0056s() { // from class: com.alibaba.sdk.android.oss.network.NetworkProgressHelper.1
            @Override // p011a9.InterfaceC0056s
            public C0062y intercept(InterfaceC0056s.a aVar) throws IOException {
                C0062y c0062yMo269b = aVar.mo269b(aVar.mo268a());
                return c0062yMo269b.m427s().m434b(new ProgressTouchableResponseBody(c0062yMo269b.m414a(), executionContext)).m435c();
            }
        }).m346c();
    }
}
