package p110d2;

import com.friday.common.network.StudentSessionInterceptor;
import com.friday.common.p067di.OkHttpClientProvide;
import com.zykj.http.interceptor.HeadInterceptor;
import com.zykj.http.interceptor.NetworkInterceptor;
import com.zykj.http.interceptor.RefreshTokenInterceptor;
import je.C9742v;
import p166gc.AbstractC9291e;
import p166gc.InterfaceC9292f;
import p170h2.C9454e;
import p170h2.C9455f;

/* renamed from: d2.j */
/* loaded from: classes3.dex */
public abstract class AbstractC8920j implements InterfaceC9292f {
    /* renamed from: a */
    public static C9742v m17512a(NetworkInterceptor networkInterceptor, StudentSessionInterceptor studentSessionInterceptor, HeadInterceptor headInterceptor, RefreshTokenInterceptor refreshTokenInterceptor, C9454e c9454e, C9455f c9455f) {
        return (C9742v) AbstractC9291e.m18323c(OkHttpClientProvide.INSTANCE.provideAesOkhttpClient(networkInterceptor, studentSessionInterceptor, headInterceptor, refreshTokenInterceptor, c9454e, c9455f));
    }
}
