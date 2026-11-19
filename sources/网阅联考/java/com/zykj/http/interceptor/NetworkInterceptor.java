package com.zykj.http.interceptor;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.Keep;
import com.umeng.analytics.pro.C3380c;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p117r2.C4496a0;
import p117r2.InterfaceC4518u;

@Keep
@Metadata(m5174d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u0003\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m5175d2 = {"Lcom/zykj/http/interceptor/NetworkInterceptor;", "Lr2/u;", "Landroid/content/Context;", C3380c.f1965R, "Landroid/net/NetworkInfo;", "getNetworkMonitor", "Lr2/u$a;", "chain", "Lr2/a0;", "intercept", "Landroid/app/Application;", "Landroid/app/Application;", "getContext", "()Landroid/app/Application;", "setContext", "(Landroid/app/Application;)V", "<init>", "()V", "http_release"}, m5176k = 1, m5177mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class NetworkInterceptor implements InterfaceC4518u {
    public Application context;

    private final NetworkInfo getNetworkMonitor(Context context) {
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            return ((ConnectivityManager) systemService).getActiveNetworkInfo();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    public final Application getContext() {
        Application application = this.context;
        if (application != null) {
            return application;
        }
        Intrinsics.throwUninitializedPropertyAccessException(C3380c.f1965R);
        throw null;
    }

    @Override // p117r2.InterfaceC4518u
    public C4496a0 intercept(InterfaceC4518u.a chain) throws RemoteCodeException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        NetworkInfo networkMonitor = getNetworkMonitor(getContext());
        boolean z3 = false;
        if (networkMonitor != null && networkMonitor.isConnected()) {
            z3 = true;
        }
        if (z3) {
            return chain.mo6046a(chain.mo6045S());
        }
        throw new RemoteCodeException(ErrorCode.NET_NO_CONNECT);
    }

    public final void setContext(Application application) {
        Intrinsics.checkNotNullParameter(application, "<set-?>");
        this.context = application;
    }
}
