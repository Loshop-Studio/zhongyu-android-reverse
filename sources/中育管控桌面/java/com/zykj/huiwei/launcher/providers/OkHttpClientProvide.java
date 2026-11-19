package com.zykj.huiwei.launcher.providers;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blankj.utilcode.util.AbstractC4640d;
import com.zykj.http.annotation.CommonOkHttpClient;
import com.zykj.http.annotation.CommonResponseOkHttpClient;
import com.zykj.http.annotation.HeaderBeanFlow;
import com.zykj.http.annotation.ResponseOkHttpClient;
import com.zykj.http.annotation.UnauthorizedFlow;
import com.zykj.http.bean.HeaderBean;
import com.zykj.http.interceptor.GzipInterceptor;
import com.zykj.http.interceptor.HeadInterceptor;
import com.zykj.http.interceptor.NetworkInterceptor;
import com.zykj.http.interceptor.RefreshTokenInterceptor;
import com.zykj.lib.error.code.ErrorCode;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import p058f5.C6356a0;

@StabilityInferred(parameters = 1)
@Keep
@Metadata(m7879d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0010J/\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide;", "", "<init>", "()V", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/zykj/lib/error/code/ErrorCode;", "provideUnauthorizedFlow", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/http/bean/HeaderBean;", "provideHeaderBeanFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/http/interceptor/NetworkInterceptor;", "networkInterceptor", "Lf5/a0;", "provideFileOkHttpClient", "(Lcom/zykj/http/interceptor/NetworkInterceptor;)Lf5/a0;", "Lcom/zykj/http/interceptor/GzipInterceptor;", "gzipRequestInterceptor", "provideAuthOkHttpClient", "(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/GzipInterceptor;)Lf5/a0;", "provideCommonOkHttpClient", "Lcom/zykj/http/interceptor/HeadInterceptor;", "headInterceptor", "Lcom/zykj/http/interceptor/RefreshTokenInterceptor;", "responseInterceptor", "provideResponseOkHttpClient", "(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/GzipInterceptor;Lcom/zykj/http/interceptor/RefreshTokenInterceptor;)Lf5/a0;", "provideCommonResponseOkHttpClient", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class OkHttpClientProvide {
    public static final int $stable = 0;
    public static final OkHttpClientProvide INSTANCE = new OkHttpClientProvide();

    private OkHttpClientProvide() {
    }

    @AuthOkHttpClient
    public final C6356a0 provideAuthOkHttpClient(NetworkInterceptor networkInterceptor, GzipInterceptor gzipRequestInterceptor) {
        Intrinsics.checkNotNullParameter(networkInterceptor, "networkInterceptor");
        Intrinsics.checkNotNullParameter(gzipRequestInterceptor, "gzipRequestInterceptor");
        C6356a0.a aVar = new C6356a0.a();
        aVar.m6548a(networkInterceptor);
        aVar.m6549b(gzipRequestInterceptor);
        return aVar.m6550c();
    }

    @CommonOkHttpClient
    public final C6356a0 provideCommonOkHttpClient(NetworkInterceptor networkInterceptor) {
        Intrinsics.checkNotNullParameter(networkInterceptor, "networkInterceptor");
        C6356a0.a aVar = new C6356a0.a();
        aVar.m6548a(networkInterceptor);
        return aVar.m6550c();
    }

    @CommonResponseOkHttpClient
    public final C6356a0 provideCommonResponseOkHttpClient(NetworkInterceptor networkInterceptor, HeadInterceptor headInterceptor, GzipInterceptor gzipRequestInterceptor, RefreshTokenInterceptor responseInterceptor) {
        Intrinsics.checkNotNullParameter(networkInterceptor, "networkInterceptor");
        Intrinsics.checkNotNullParameter(headInterceptor, "headInterceptor");
        Intrinsics.checkNotNullParameter(gzipRequestInterceptor, "gzipRequestInterceptor");
        Intrinsics.checkNotNullParameter(responseInterceptor, "responseInterceptor");
        C6356a0.a aVar = new C6356a0.a();
        aVar.m6548a(networkInterceptor);
        aVar.m6548a(headInterceptor);
        aVar.m6548a(responseInterceptor);
        aVar.m6548a(gzipRequestInterceptor);
        return aVar.m6550c();
    }

    public final C6356a0 provideFileOkHttpClient(NetworkInterceptor networkInterceptor) {
        Intrinsics.checkNotNullParameter(networkInterceptor, "networkInterceptor");
        C6356a0.a aVar = new C6356a0.a();
        aVar.m6548a(networkInterceptor);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        return aVar.m6547U(1L, timeUnit).m6544R(1L, timeUnit).m6550c();
    }

    @Singleton
    @HeaderBeanFlow
    public final MutableStateFlow<HeaderBean> provideHeaderBeanFlow() {
        return StateFlowKt.MutableStateFlow(new HeaderBean(AbstractC4640d.m2150d(), String.valueOf(AbstractC4640d.m2151e()), null, null, null, 28, null));
    }

    @ResponseOkHttpClient
    public final C6356a0 provideResponseOkHttpClient(NetworkInterceptor networkInterceptor, HeadInterceptor headInterceptor, GzipInterceptor gzipRequestInterceptor, RefreshTokenInterceptor responseInterceptor) {
        Intrinsics.checkNotNullParameter(networkInterceptor, "networkInterceptor");
        Intrinsics.checkNotNullParameter(headInterceptor, "headInterceptor");
        Intrinsics.checkNotNullParameter(gzipRequestInterceptor, "gzipRequestInterceptor");
        Intrinsics.checkNotNullParameter(responseInterceptor, "responseInterceptor");
        C6356a0.a aVar = new C6356a0.a();
        aVar.m6548a(networkInterceptor);
        aVar.m6548a(headInterceptor);
        aVar.m6548a(gzipRequestInterceptor);
        aVar.m6548a(responseInterceptor);
        return aVar.m6550c();
    }

    @Singleton
    @UnauthorizedFlow
    public final MutableSharedFlow<ErrorCode> provideUnauthorizedFlow() {
        return SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }
}
