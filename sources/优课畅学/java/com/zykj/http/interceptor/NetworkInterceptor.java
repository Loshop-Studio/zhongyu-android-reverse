package com.zykj.http.interceptor;

import androidx.annotation.Keep;
import com.blankj.utilcode.util.NetworkUtils;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import kotlin.jvm.internal.AbstractC9133u;
import p136i9.C8903d0;
import p136i9.InterfaceC8926x;

@Keep
/* loaded from: classes4.dex */
public final class NetworkInterceptor implements InterfaceC8926x {
    @Override // p136i9.InterfaceC8926x
    public C8903d0 intercept(InterfaceC8926x.a chain) throws RemoteCodeException {
        AbstractC9133u.m16133g(chain, "chain");
        if (NetworkUtils.m2360g()) {
            return chain.mo15333b(chain.mo15332a());
        }
        throw new RemoteCodeException(ErrorCode.NET_NO_CONNECT);
    }
}
