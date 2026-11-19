package com.zykj.http.interceptor;

import androidx.annotation.Keep;
import com.blankj.utilcode.util.NetworkUtils;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import je.C9745y;
import je.InterfaceC9739s;
import kotlin.jvm.internal.AbstractC9979u;

@Keep
/* loaded from: classes6.dex */
public final class NetworkInterceptor implements InterfaceC9739s {
    @Override // je.InterfaceC9739s
    public C9745y intercept(InterfaceC9739s.a chain) throws RemoteCodeException {
        AbstractC9979u.m20294g(chain, "chain");
        if (NetworkUtils.isConnected()) {
            return chain.mo19477a(chain.request());
        }
        throw new RemoteCodeException(ErrorCode.NET_NO_CONNECT);
    }
}
