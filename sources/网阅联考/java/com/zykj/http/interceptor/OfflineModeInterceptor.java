package com.zykj.http.interceptor;

import androidx.annotation.Keep;
import com.zykj.http.bean.HeaderLiveData;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p117r2.C4496a0;
import p117r2.InterfaceC4518u;

@Keep
@Metadata(m5174d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m5175d2 = {"Lcom/zykj/http/interceptor/OfflineModeInterceptor;", "Lr2/u;", "Lr2/u$a;", "chain", "Lr2/a0;", "intercept", "Lcom/zykj/http/bean/HeaderLiveData;", "headerLiveData", "Lcom/zykj/http/bean/HeaderLiveData;", "getHeaderLiveData", "()Lcom/zykj/http/bean/HeaderLiveData;", "setHeaderLiveData", "(Lcom/zykj/http/bean/HeaderLiveData;)V", "<init>", "()V", "http_release"}, m5176k = 1, m5177mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class OfflineModeInterceptor implements InterfaceC4518u {
    public HeaderLiveData headerLiveData;

    public final HeaderLiveData getHeaderLiveData() {
        HeaderLiveData headerLiveData = this.headerLiveData;
        if (headerLiveData != null) {
            return headerLiveData;
        }
        Intrinsics.throwUninitializedPropertyAccessException("headerLiveData");
        throw null;
    }

    @Override // p117r2.InterfaceC4518u
    public C4496a0 intercept(InterfaceC4518u.a chain) throws RemoteCodeException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Boolean value = getHeaderLiveData().getOfflineMode().getValue();
        if (value != null && value.booleanValue()) {
            throw new RemoteCodeException(ErrorCode.NET_OFFLINE_MODE);
        }
        return chain.mo6046a(chain.mo6045S());
    }

    public final void setHeaderLiveData(HeaderLiveData headerLiveData) {
        Intrinsics.checkNotNullParameter(headerLiveData, "<set-?>");
        this.headerLiveData = headerLiveData;
    }
}
