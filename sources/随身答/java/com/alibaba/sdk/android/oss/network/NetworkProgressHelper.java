package com.alibaba.sdk.android.oss.network;

import java.io.IOException;
import java.io.InputStream;
import p172l8.C8923v;
import p172l8.C8926y;
import p172l8.InterfaceC8920s;

/* loaded from: classes3.dex */
public class NetworkProgressHelper {
    public static ProgressTouchableRequestBody addProgressRequestBody(InputStream inputStream, long j9, String str, ExecutionContext executionContext) {
        return new ProgressTouchableRequestBody(inputStream, j9, str, executionContext);
    }

    public static C8923v addProgressResponseListener(C8923v c8923v, final ExecutionContext executionContext) {
        return c8923v.m14051A().m14101b(new InterfaceC8920s() { // from class: com.alibaba.sdk.android.oss.network.NetworkProgressHelper.1
            @Override // p172l8.InterfaceC8920s
            public C8926y intercept(InterfaceC8920s.a aVar) throws IOException {
                C8926y c8926yMo14025b = aVar.mo14025b(aVar.mo14024a());
                return c8926yMo14025b.m14183s().m14190b(new ProgressTouchableResponseBody(c8926yMo14025b.m14170a(), executionContext)).m14191c();
            }
        }).m14102c();
    }
}
