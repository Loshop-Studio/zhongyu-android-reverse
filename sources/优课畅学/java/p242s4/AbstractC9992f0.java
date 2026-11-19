package p242s4;

import com.zykj.http.interceptor.GzipInterceptor;
import com.zykj.http.interceptor.HeadInterceptor;
import com.zykj.http.interceptor.NetworkInterceptor;
import com.zykj.study.provide.ClientCodeInterceptor;
import com.zykj.study.provide.OkHttpClientProvide;
import p136i9.C8897a0;
import p167l6.AbstractC9257e;
import p167l6.InterfaceC9258f;

/* renamed from: s4.f0 */
/* loaded from: classes3.dex */
public abstract class AbstractC9992f0 implements InterfaceC9258f {
    /* renamed from: a */
    public static C8897a0 m18682a(NetworkInterceptor networkInterceptor, HeadInterceptor headInterceptor, GzipInterceptor gzipInterceptor, ClientCodeInterceptor clientCodeInterceptor) {
        return (C8897a0) AbstractC9257e.m16973c(OkHttpClientProvide.INSTANCE.provideResponseOkHttpClient(networkInterceptor, headInterceptor, gzipInterceptor, clientCodeInterceptor));
    }
}
