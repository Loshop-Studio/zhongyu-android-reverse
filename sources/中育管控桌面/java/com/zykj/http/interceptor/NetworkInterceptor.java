package com.zykj.http.interceptor;

import androidx.annotation.Keep;
import com.blankj.utilcode.util.AbstractC4669t;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p058f5.C6362d0;
import p058f5.InterfaceC6385x;

@Keep
@Metadata(m7879d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m7880d2 = {"Lcom/zykj/http/interceptor/NetworkInterceptor;", "Lf5/x;", "<init>", "()V", "Lf5/x$a;", "chain", "Lf5/d0;", "intercept", "(Lf5/x$a;)Lf5/d0;", "http_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class NetworkInterceptor implements InterfaceC6385x {
    @Override // p058f5.InterfaceC6385x
    public C6362d0 intercept(InterfaceC6385x.a chain) throws RemoteCodeException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (AbstractC4669t.m2432f()) {
            return chain.mo6872b(chain.mo6871a());
        }
        throw new RemoteCodeException(ErrorCode.NET_NO_CONNECT);
    }
}
