package p128u1;

import com.google.gson.GsonBuilder;
import com.zykj.http.BaseUrlEnum;
import com.zykj.http.bean.HeaderLiveData;
import com.zykj.http.interceptor.HeadInterceptor;
import com.zykj.http.interceptor.NetWorkResponseWithRefreshTokenInterceptor;
import com.zykj.http.interceptor.NetworkInterceptor;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p080j3.C3814e0;
import p085k3.C3861a;
import p092l3.C4351k;
import p117r2.C4521x;
import p120s1.C4547c;

/* renamed from: u1.a */
/* loaded from: classes2.dex */
public final class C4603a {

    /* renamed from: a */
    public static final C4603a f5807a = new C4603a();

    /* renamed from: a */
    public final HeaderLiveData m6345a() {
        return new HeaderLiveData();
    }

    /* renamed from: b */
    public final C4521x m6346b(NetworkInterceptor networkInterceptor, HeadInterceptor headInterceptor, NetWorkResponseWithRefreshTokenInterceptor responseInterceptor) {
        Intrinsics.checkNotNullParameter(networkInterceptor, "networkInterceptor");
        Intrinsics.checkNotNullParameter(headInterceptor, "headInterceptor");
        Intrinsics.checkNotNullParameter(responseInterceptor, "responseInterceptor");
        C4521x.a aVar = new C4521x.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.m6106c(30L, timeUnit);
        aVar.m6102H(30L, timeUnit);
        aVar.m6103I(30L, timeUnit);
        aVar.m6104a(networkInterceptor);
        aVar.m6104a(headInterceptor);
        aVar.m6104a(responseInterceptor);
        return aVar.m6105b();
    }

    /* renamed from: c */
    public final C3814e0 m6347c(C4521x okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        C3814e0 c3814e0M5040e = new C3814e0.b().m5042g(okHttpClient).m5038c(BaseUrlEnum.DEFAULT.getUrl()).m5037b(C4351k.m5362f()).m5036a(new C4547c()).m5037b(C3861a.m5170f(new GsonBuilder().registerTypeAdapter(Date.class, new C4608f()).create())).m5040e();
        Intrinsics.checkNotNullExpressionValue(c3814e0M5040e, "Builder()\n            .c…   )\n            .build()");
        return c3814e0M5040e;
    }

    /* renamed from: d */
    public final InterfaceC4609g m6348d(C3814e0 retrofit) throws SecurityException {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objM5027b = retrofit.m5027b(InterfaceC4609g.class);
        Intrinsics.checkNotNullExpressionValue(objM5027b, "retrofit.create(InsightApi::class.java)");
        return (InterfaceC4609g) objM5027b;
    }
}
