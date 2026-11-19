package p200p5;

import com.blankj.utilcode.util.AppUtils;
import com.google.gson.GsonBuilder;
import com.zykj.http.bean.HeaderBean;
import com.zykj.http.interceptor.HeadInterceptor;
import com.zykj.http.interceptor.NetworkInterceptor;
import com.zykj.http.interceptor.RefreshTokenInterceptor;
import com.zykj.message.server.bean.UserInfo;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import p011a9.C0059v;
import p112h7.InterfaceC7632b;
import p226r9.C9059d0;
import p237s9.C9356a;
import p248t9.C9514k;

/* renamed from: p5.a */
/* loaded from: classes4.dex */
public final class C8834a {

    /* renamed from: a */
    public static final C8834a f15038a = new C8834a();

    /* renamed from: a */
    public final MutableStateFlow m14804a() {
        return StateFlowKt.MutableStateFlow(new HeaderBean(AppUtils.getAppPackageName(), String.valueOf(AppUtils.getAppVersionCode()), null, null, null, 28, null));
    }

    /* renamed from: b */
    public final C0059v m14805b(NetworkInterceptor networkInterceptor, HeadInterceptor headInterceptor, RefreshTokenInterceptor responseInterceptor) {
        Intrinsics.checkNotNullParameter(networkInterceptor, "networkInterceptor");
        Intrinsics.checkNotNullParameter(headInterceptor, "headInterceptor");
        Intrinsics.checkNotNullParameter(responseInterceptor, "responseInterceptor");
        C0059v.a aVar = new C0059v.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.m348e(30L, timeUnit);
        aVar.m341O(30L, timeUnit);
        aVar.m343Q(30L, timeUnit);
        aVar.m344a(networkInterceptor);
        aVar.m344a(headInterceptor);
        aVar.m344a(responseInterceptor);
        return aVar.m346c();
    }

    /* renamed from: c */
    public final C9059d0 m14806c(C0059v okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        C9059d0 c9059d0M15261d = new C9059d0.b().m15263f(okHttpClient).m15260c("https://hagateway.zyai.cc").m15258a(C9514k.m15876f()).m15258a(C9356a.m15607f(new GsonBuilder().registerTypeAdapter(Date.class, new C8842i()).create())).m15261d();
        Intrinsics.checkNotNullExpressionValue(c9059d0M15261d, "build(...)");
        return c9059d0M15261d;
    }

    /* renamed from: d */
    public final InterfaceC8843j m14807d(C9059d0 retrofit) throws SecurityException {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objM15249b = retrofit.m15249b(InterfaceC8843j.class);
        Intrinsics.checkNotNullExpressionValue(objM15249b, "create(...)");
        return (InterfaceC8843j) objM15249b;
    }

    /* renamed from: e */
    public final MutableSharedFlow m14808e() {
        return SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    /* renamed from: f */
    public final MutableStateFlow m14809f() {
        return StateFlowKt.MutableStateFlow(new UserInfo());
    }

    /* renamed from: g */
    public final InterfaceC7632b m14810g(C9059d0 retrofit) throws SecurityException {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objM15249b = retrofit.m15249b(InterfaceC7632b.class);
        Intrinsics.checkNotNullExpressionValue(objM15249b, "create(...)");
        return (InterfaceC7632b) objM15249b;
    }
}
