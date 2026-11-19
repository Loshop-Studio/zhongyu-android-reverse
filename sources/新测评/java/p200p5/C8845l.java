package p200p5;

import com.google.gson.GsonBuilder;
import com.zykj.http.interceptor.NetworkInterceptor;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p011a9.C0059v;
import p226r9.C9059d0;
import p237s9.C9356a;
import p248t9.C9514k;

/* renamed from: p5.l */
/* loaded from: classes4.dex */
public final class C8845l {

    /* renamed from: a */
    public static final C8845l f15039a = new C8845l();

    /* renamed from: a */
    public final C0059v m14846a(NetworkInterceptor networkInterceptor) {
        Intrinsics.checkNotNullParameter(networkInterceptor, "networkInterceptor");
        C0059v.a aVar = new C0059v.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.m348e(30L, timeUnit);
        aVar.m341O(30L, timeUnit);
        aVar.m343Q(30L, timeUnit);
        aVar.m344a(networkInterceptor);
        return aVar.m346c();
    }

    /* renamed from: b */
    public final InterfaceC8844k m14847b(C0059v okHttpClient) throws SecurityException {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Object objM15249b = new C9059d0.b().m15263f(okHttpClient).m15260c("https://hagateway.zyai.cc").m15258a(C9514k.m15876f()).m15258a(C9356a.m15607f(new GsonBuilder().registerTypeAdapter(Date.class, new C8842i()).create())).m15261d().m15249b(InterfaceC8844k.class);
        Intrinsics.checkNotNullExpressionValue(objM15249b, "create(...)");
        return (InterfaceC8844k) objM15249b;
    }
}
