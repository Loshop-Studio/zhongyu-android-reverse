package p112q1;

import com.zykj.http.bean.HeaderLiveData;
import com.zykj.http.interceptor.NetWorkResponseWithRefreshTokenInterceptor;
import p116r1.AbstractC4494a;

/* renamed from: q1.d */
/* loaded from: classes2.dex */
public abstract class AbstractC4481d {
    /* renamed from: a */
    public static void m5764a(NetWorkResponseWithRefreshTokenInterceptor netWorkResponseWithRefreshTokenInterceptor, HeaderLiveData headerLiveData) {
        netWorkResponseWithRefreshTokenInterceptor.headerLiveData = headerLiveData;
    }

    /* renamed from: b */
    public static void m5765b(NetWorkResponseWithRefreshTokenInterceptor netWorkResponseWithRefreshTokenInterceptor, AbstractC4494a abstractC4494a) {
        netWorkResponseWithRefreshTokenInterceptor.refreshRepository = abstractC4494a;
    }
}
