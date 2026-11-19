package p303y5;

import com.zykj.http.bean.HeaderLiveData;
import com.zykj.http.interceptor.NetWorkResponseWithRefreshTokenInterceptor;
import p313z5.AbstractC10002a;

/* renamed from: y5.d */
/* loaded from: classes4.dex */
public abstract class AbstractC9957d {
    /* renamed from: a */
    public static void m17228a(NetWorkResponseWithRefreshTokenInterceptor netWorkResponseWithRefreshTokenInterceptor, HeaderLiveData headerLiveData) {
        netWorkResponseWithRefreshTokenInterceptor.headerLiveData = headerLiveData;
    }

    /* renamed from: b */
    public static void m17229b(NetWorkResponseWithRefreshTokenInterceptor netWorkResponseWithRefreshTokenInterceptor, AbstractC10002a abstractC10002a) {
        netWorkResponseWithRefreshTokenInterceptor.refreshRepository = abstractC10002a;
    }
}
