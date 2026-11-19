package com.zykj.http.interceptor;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.Keep;
import com.umeng.analytics.pro.C1896c;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import java.util.Objects;
import kotlin.jvm.internal.C2769l;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

@Keep
/* loaded from: classes.dex */
public final class NetworkInterceptor implements Interceptor {
    public Application context;

    private final NetworkInfo getNetworkMonitor(Context context) {
        Object systemService = context.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return ((ConnectivityManager) systemService).getActiveNetworkInfo();
    }

    @NotNull
    public final Application getContext() {
        Application application = this.context;
        if (application != null) {
            return application;
        }
        C2769l.m9256t(C1896c.f8557R);
        throw null;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws RemoteCodeException {
        C2769l.m9241e(chain, "chain");
        NetworkInfo networkMonitor = getNetworkMonitor(getContext());
        boolean z3 = false;
        if (networkMonitor != null && networkMonitor.isConnected()) {
            z3 = true;
        }
        if (z3) {
            return chain.proceed(chain.request());
        }
        throw new RemoteCodeException(ErrorCode.NET_NO_CONNECT);
    }

    public final void setContext(@NotNull Application application) {
        C2769l.m9241e(application, "<set-?>");
        this.context = application;
    }
}
