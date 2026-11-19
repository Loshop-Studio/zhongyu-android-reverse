package p101i2;

import com.zykj.http.interceptor.HeadInterceptor;
import kotlin.jvm.internal.C2769l;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import p076d2.C2453b;
import p096h2.C2656a;
import p116l2.C2840a;

/* renamed from: i2.b */
/* loaded from: classes.dex */
public final class C2667b implements Interceptor {

    /* renamed from: a */
    @NotNull
    private final C2656a f10604a;

    public C2667b(@NotNull C2656a apiManager) {
        C2769l.m9241e(apiManager, "apiManager");
        this.f10604a = apiManager;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        C2769l.m9241e(chain, "chain");
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        builderNewBuilder.header(HeadInterceptor.APP_NAME_KEY, "Browser");
        builderNewBuilder.header(HeadInterceptor.APP_VERSION_KEY, String.valueOf(C2840a.m9535a(C2453b.m8199a())));
        String strM8919b = this.f10604a.m8919b();
        if (strM8919b != null) {
            builderNewBuilder.header("Authorization", C2769l.m9248l("Bearer ", strM8919b));
        }
        return chain.proceed(builderNewBuilder.build());
    }
}
