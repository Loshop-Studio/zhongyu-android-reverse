package p110d2;

import com.friday.common.network.StudentSessionInterceptor;
import com.friday.common.p067di.OkHttpClientProvide;
import com.zykj.http.interceptor.HeadInterceptor;
import com.zykj.http.interceptor.NetworkInterceptor;
import com.zykj.http.interceptor.RefreshTokenInterceptor;
import je.C9742v;
import p166gc.AbstractC9291e;
import p166gc.InterfaceC9292f;

/* renamed from: d2.m */
/* loaded from: classes3.dex */
public abstract class AbstractC8923m implements InterfaceC9292f {
    /* renamed from: a */
    public static C9742v m17515a(NetworkInterceptor networkInterceptor, StudentSessionInterceptor studentSessionInterceptor, HeadInterceptor headInterceptor, RefreshTokenInterceptor refreshTokenInterceptor) {
        return (C9742v) AbstractC9291e.m18323c(OkHttpClientProvide.INSTANCE.provideRefreshTokenOkHttpClient(networkInterceptor, studentSessionInterceptor, headInterceptor, refreshTokenInterceptor));
    }
}
