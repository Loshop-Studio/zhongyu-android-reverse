package za;

import com.zykj.http.interceptor.RefreshTokenInterceptor;
import p012ab.AbstractC0101a;
import p379vd.InterfaceC11602k;

/* renamed from: za.d */
/* loaded from: classes6.dex */
public abstract class AbstractC12035d {
    /* renamed from: a */
    public static void m26660a(RefreshTokenInterceptor refreshTokenInterceptor, AbstractC0101a abstractC0101a) {
        refreshTokenInterceptor.refreshRepository = abstractC0101a;
    }

    /* renamed from: b */
    public static void m26661b(RefreshTokenInterceptor refreshTokenInterceptor, InterfaceC11602k interfaceC11602k) {
        refreshTokenInterceptor.unauthorizedFlow = interfaceC11602k;
    }
}
