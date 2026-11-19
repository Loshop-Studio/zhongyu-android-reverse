package com.zykj.http.interceptor;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p172l8.C8926y;
import p172l8.InterfaceC8920s;

@Keep
@Metadata(m13412d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m13413d2 = {"Lcom/zykj/http/interceptor/NetworkInterceptor;", "Ll8/s;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/net/NetworkInfo;", "getNetworkMonitor", "(Landroid/content/Context;)Landroid/net/NetworkInfo;", "Ll8/s$a;", "chain", "Ll8/y;", "intercept", "(Ll8/s$a;)Ll8/y;", "Landroid/app/Application;", "Landroid/app/Application;", "getContext", "()Landroid/app/Application;", "setContext", "(Landroid/app/Application;)V", "http_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class NetworkInterceptor implements InterfaceC8920s {
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
        Intrinsics.throwUninitializedPropertyAccessException("context");
        throw null;
    }

    @Override // p172l8.InterfaceC8920s
    public C8926y intercept(InterfaceC8920s.a chain) throws RemoteCodeException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        NetworkInfo networkMonitor = getNetworkMonitor(getContext());
        if (networkMonitor == null || !networkMonitor.isConnected()) {
            throw new RemoteCodeException(ErrorCode.NET_NO_CONNECT);
        }
        return chain.mo14025b(chain.mo14024a());
    }

    public final void setContext(Application application) {
        Intrinsics.checkNotNullParameter(application, "<set-?>");
        this.context = application;
    }
}
