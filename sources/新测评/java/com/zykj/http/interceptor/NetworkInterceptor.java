package com.zykj.http.interceptor;

import androidx.annotation.Keep;
import com.blankj.utilcode.util.NetworkUtils;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p011a9.C0062y;
import p011a9.InterfaceC0056s;

@Keep
@Metadata(m13557d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m13558d2 = {"Lcom/zykj/http/interceptor/NetworkInterceptor;", "La9/s;", "<init>", "()V", "La9/s$a;", "chain", "La9/y;", "intercept", "(La9/s$a;)La9/y;", "http_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class NetworkInterceptor implements InterfaceC0056s {
    @Override // p011a9.InterfaceC0056s
    public C0062y intercept(InterfaceC0056s.a chain) throws RemoteCodeException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (NetworkUtils.isConnected()) {
            return chain.mo269b(chain.mo268a());
        }
        throw new RemoteCodeException(ErrorCode.NET_NO_CONNECT);
    }
}
