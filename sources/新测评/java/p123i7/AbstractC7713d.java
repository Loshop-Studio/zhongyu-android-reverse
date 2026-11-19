package p123i7;

import com.zykj.http.interceptor.RefreshTokenInterceptor;
import kotlinx.coroutines.flow.MutableSharedFlow;
import p134j7.AbstractC7814a;

/* renamed from: i7.d */
/* loaded from: classes4.dex */
public abstract class AbstractC7713d {
    /* renamed from: a */
    public static void m12886a(RefreshTokenInterceptor refreshTokenInterceptor, AbstractC7814a abstractC7814a) {
        refreshTokenInterceptor.refreshRepository = abstractC7814a;
    }

    /* renamed from: b */
    public static void m12887b(RefreshTokenInterceptor refreshTokenInterceptor, MutableSharedFlow mutableSharedFlow) {
        refreshTokenInterceptor.unauthorizedFlow = mutableSharedFlow;
    }
}
