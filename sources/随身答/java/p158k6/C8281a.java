package p158k6;

import com.google.gson.GsonBuilder;
import com.zykj.http.BaseUrlEnum;
import com.zykj.http.bean.HeaderLiveData;
import com.zykj.http.interceptor.HeadInterceptor;
import com.zykj.http.interceptor.NetWorkResponseWithRefreshTokenInterceptor;
import com.zykj.http.interceptor.NetworkInterceptor;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p007a6.C0042c;
import p038c9.C5299y;
import p088d9.C7794a;
import p099e9.C7903k;
import p172l8.C8923v;

/* renamed from: k6.a */
/* loaded from: classes5.dex */
public final class C8281a {

    /* renamed from: a */
    public static final C8281a f14423a = new C8281a();

    /* renamed from: a */
    public final HeaderLiveData m13376a() {
        return new HeaderLiveData();
    }

    /* renamed from: b */
    public final InterfaceC8287g m13377b(C5299y retrofit) throws SecurityException {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objM2527b = retrofit.m2527b(InterfaceC8287g.class);
        Intrinsics.checkNotNullExpressionValue(objM2527b, "create(...)");
        return (InterfaceC8287g) objM2527b;
    }

    /* renamed from: c */
    public final C8923v m13378c(NetworkInterceptor networkInterceptor, HeadInterceptor headInterceptor, NetWorkResponseWithRefreshTokenInterceptor responseInterceptor) {
        Intrinsics.checkNotNullParameter(networkInterceptor, "networkInterceptor");
        Intrinsics.checkNotNullParameter(headInterceptor, "headInterceptor");
        Intrinsics.checkNotNullParameter(responseInterceptor, "responseInterceptor");
        C8923v.a aVar = new C8923v.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.m14104e(30L, timeUnit);
        aVar.m14097O(30L, timeUnit);
        aVar.m14099Q(30L, timeUnit);
        aVar.m14100a(networkInterceptor);
        aVar.m14100a(headInterceptor);
        aVar.m14100a(responseInterceptor);
        return aVar.m14102c();
    }

    /* renamed from: d */
    public final C5299y m13379d(C8923v okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        C5299y c5299yM2540e = new C5299y.b().m2542g(okHttpClient).m2538c(BaseUrlEnum.DEFAULT.getUrl()).m2537b(C7903k.m12378f()).m2536a(new C0042c()).m2537b(C7794a.m12158f(new GsonBuilder().registerTypeAdapter(Date.class, new C8286f()).create())).m2540e();
        Intrinsics.checkNotNullExpressionValue(c5299yM2540e, "build(...)");
        return c5299yM2540e;
    }
}
