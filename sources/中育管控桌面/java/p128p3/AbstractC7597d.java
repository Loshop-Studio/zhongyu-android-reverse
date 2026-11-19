package p128p3;

import com.zykj.http.interceptor.RefreshTokenInterceptor;
import kotlinx.coroutines.flow.MutableSharedFlow;
import p135q3.AbstractC7624a;

/* renamed from: p3.d */
/* loaded from: classes4.dex */
public abstract class AbstractC7597d {
    /* renamed from: a */
    public static void m9007a(RefreshTokenInterceptor refreshTokenInterceptor, AbstractC7624a abstractC7624a) {
        refreshTokenInterceptor.refreshRepository = abstractC7624a;
    }

    /* renamed from: b */
    public static void m9008b(RefreshTokenInterceptor refreshTokenInterceptor, MutableSharedFlow mutableSharedFlow) {
        refreshTokenInterceptor.unauthorizedFlow = mutableSharedFlow;
    }
}
