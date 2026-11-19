package com.zykj.http.interceptor;

import androidx.annotation.Keep;
import com.zykj.http.bean.HeaderLiveData;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import kotlin.jvm.internal.C2769l;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

@Keep
/* loaded from: classes.dex */
public final class OfflineModeInterceptor implements Interceptor {
    public HeaderLiveData headerLiveData;

    @NotNull
    public final HeaderLiveData getHeaderLiveData() {
        HeaderLiveData headerLiveData = this.headerLiveData;
        if (headerLiveData != null) {
            return headerLiveData;
        }
        C2769l.m9256t("headerLiveData");
        throw null;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws RemoteCodeException {
        C2769l.m9241e(chain, "chain");
        Boolean value = getHeaderLiveData().getOfflineMode().getValue();
        if (value != null && value.booleanValue()) {
            throw new RemoteCodeException(ErrorCode.NET_OFFLINE_MODE);
        }
        return chain.proceed(chain.request());
    }

    public final void setHeaderLiveData(@NotNull HeaderLiveData headerLiveData) {
        C2769l.m9241e(headerLiveData, "<set-?>");
        this.headerLiveData = headerLiveData;
    }
}
