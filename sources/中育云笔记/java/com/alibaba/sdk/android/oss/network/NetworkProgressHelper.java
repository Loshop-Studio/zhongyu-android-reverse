package com.alibaba.sdk.android.oss.network;

import java.io.InputStream;
import je.C9742v;
import je.C9745y;
import je.InterfaceC9739s;

/* loaded from: classes3.dex */
public class NetworkProgressHelper {
    public static ProgressTouchableRequestBody addProgressRequestBody(InputStream inputStream, long j10, String str, ExecutionContext executionContext) {
        return new ProgressTouchableRequestBody(inputStream, j10, str, executionContext);
    }

    public static C9742v addProgressResponseListener(C9742v c9742v, final ExecutionContext executionContext) {
        return c9742v.m19536z().m19556b(new InterfaceC9739s() { // from class: com.alibaba.sdk.android.oss.network.NetworkProgressHelper.1
            @Override // je.InterfaceC9739s
            public C9745y intercept(InterfaceC9739s.a aVar) {
                C9745y c9745yMo19477a = aVar.mo19477a(aVar.request());
                return c9745yMo19477a.m19641v().m19647b(new ProgressTouchableResponseBody(c9745yMo19477a.m19628e(), executionContext)).m19648c();
            }
        }).m19557c();
    }
}
