package p242s4;

import com.zykj.http.interceptor.HeadInterceptor;
import com.zykj.http.interceptor.NetworkInterceptor;
import com.zykj.study.provide.ClientCodeInterceptor;
import com.zykj.study.provide.OkHttpClientProvide;
import p136i9.C8897a0;
import p167l6.AbstractC9257e;
import p167l6.InterfaceC9258f;

/* renamed from: s4.b0 */
/* loaded from: classes3.dex */
public abstract class AbstractC9984b0 implements InterfaceC9258f {
    /* renamed from: a */
    public static C8897a0 m18674a(NetworkInterceptor networkInterceptor, HeadInterceptor headInterceptor, ClientCodeInterceptor clientCodeInterceptor) {
        return (C8897a0) AbstractC9257e.m16973c(OkHttpClientProvide.INSTANCE.provideCommonOkHttpClient(networkInterceptor, headInterceptor, clientCodeInterceptor));
    }
}
