package p101i2;

import android.util.Log;
import com.google.gson.Gson;
import com.zykj.http.interceptor.HeadInterceptor;
import com.zykj.subscriber.entity.resp.ApiResp;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import kotlin.jvm.internal.AbstractC2770m;
import kotlin.jvm.internal.C2769l;
import kotlin.jvm.internal.C2778u;
import kotlin.jvm.internal.C2781x;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import p076d2.C2453b;
import p116l2.C2840a;
import p116l2.C2844e;
import p128o2.C2925r;
import p171x2.InterfaceC3470l;

/* renamed from: i2.a */
/* loaded from: classes.dex */
public final class C2666a implements Interceptor {

    /* renamed from: a */
    @NotNull
    private InterfaceC3470l<? super InterfaceC3470l<? super String, C2925r>, C2925r> f10600a = a.f10601a;

    /* renamed from: i2.a$a */
    static final class a extends AbstractC2770m implements InterfaceC3470l<InterfaceC3470l<? super String, ? extends C2925r>, C2925r> {

        /* renamed from: a */
        public static final a f10601a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m8946a(@NotNull InterfaceC3470l<? super String, C2925r> it) {
            C2769l.m9241e(it, "it");
            it.invoke("");
        }

        @Override // p171x2.InterfaceC3470l
        public /* bridge */ /* synthetic */ C2925r invoke(InterfaceC3470l<? super String, ? extends C2925r> interfaceC3470l) {
            m8946a(interfaceC3470l);
            return C2925r.f11415a;
        }
    }

    /* renamed from: i2.a$b */
    static final class b extends AbstractC2770m implements InterfaceC3470l<String, C2925r> {

        /* renamed from: a */
        final /* synthetic */ C2781x<String> f10602a;

        /* renamed from: b */
        final /* synthetic */ C2778u f10603b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C2781x<String> c2781x, C2778u c2778u) {
            super(1);
            this.f10602a = c2781x;
            this.f10603b = c2778u;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void m8947a(@NotNull String token) {
            C2769l.m9241e(token, "token");
            this.f10602a.f10737a = token;
            this.f10603b.f10734a = false;
        }

        @Override // p171x2.InterfaceC3470l
        public /* bridge */ /* synthetic */ C2925r invoke(String str) {
            m8947a(str);
            return C2925r.f11415a;
        }
    }

    /* renamed from: a */
    public final void m8945a(@NotNull InterfaceC3470l<? super InterfaceC3470l<? super String, C2925r>, C2925r> interfaceC3470l) {
        C2769l.m9241e(interfaceC3470l, "<set-?>");
        this.f10600a = interfaceC3470l;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        ResponseBody responseBodyCreate;
        boolean zM9237a;
        C2769l.m9241e(chain, "chain");
        Request request = chain.request();
        Response responseProceed = chain.proceed(request);
        if (responseProceed.code() == 401) {
            ResponseBody responseBodyBody = responseProceed.body();
            String errorMessage = null;
            String strString = responseBodyBody == null ? null : responseBodyBody.string();
            Response.Builder builderNewBuilder = responseProceed.newBuilder();
            if (strString == null) {
                responseBodyCreate = null;
            } else {
                ResponseBody.Companion companion = ResponseBody.Companion;
                ResponseBody responseBodyBody2 = responseProceed.body();
                responseBodyCreate = companion.create(strString, responseBodyBody2 == null ? null : responseBodyBody2.contentType());
            }
            responseProceed = builderNewBuilder.body(responseBodyCreate).build();
            if (strString == null) {
                zM9237a = false;
            } else {
                try {
                    ApiResp apiResp = (ApiResp) new Gson().fromJson((Reader) new StringReader(strString), ApiResp.class);
                    if (apiResp != null) {
                        errorMessage = apiResp.getErrorMessage();
                    }
                    zM9237a = C2769l.m9237a(errorMessage, "CurrentUserDidNotLoginToTheApplication");
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            if (zM9237a) {
                Log.i("OkHttp", "接口返回401");
                C2778u c2778u = new C2778u();
                c2778u.f10734a = true;
                C2781x c2781x = new C2781x();
                c2781x.f10737a = "";
                this.f10600a.invoke(new b(c2781x, c2778u));
                while (c2778u.f10734a) {
                }
                Log.i("OkHttp", "接口重新请求");
                if (((CharSequence) c2781x.f10737a).length() > 0) {
                    Response responseProceed2 = chain.proceed(request.newBuilder().header(HeadInterceptor.APP_NAME_KEY, "Browser").header(HeadInterceptor.APP_VERSION_KEY, C2840a.m9535a(C2453b.m8199a()) + "").header("Authorization", C2769l.m9248l("bearer ", c2781x.f10737a)).build());
                    if (responseProceed2.code() == 401) {
                        Log.e("OkHttp", "Token 刷新成功但重试请求仍然 401，触发登出。");
                        C2844e.f10946a.m9543b();
                    }
                    return responseProceed2;
                }
                Log.e("OkHttp", "Token 刷新失败，触发登出。");
                C2844e.f10946a.m9543b();
            }
        }
        return responseProceed;
    }
}
