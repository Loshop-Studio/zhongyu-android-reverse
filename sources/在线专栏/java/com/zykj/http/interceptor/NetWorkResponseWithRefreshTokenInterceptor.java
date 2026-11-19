package com.zykj.http.interceptor;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.tencent.mars.xlog.Log;
import com.zykj.http.bean.ApiResp;
import com.zykj.http.bean.ErrorInfo;
import com.zykj.http.bean.HeaderLiveData;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import java.io.IOException;
import java.lang.reflect.Type;
import kotlin.coroutines.jvm.internal.AbstractC2755k;
import kotlin.coroutines.jvm.internal.InterfaceC2750f;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import kotlin.jvm.internal.C2781x;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p082e3.C2495u;
import p087f3.C2556h;
import p087f3.InterfaceC2557h0;
import p128o2.C2920m;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p146r2.C3033d;
import p166w1.AbstractC3427a;
import p171x2.InterfaceC3474p;

@Keep
/* loaded from: classes.dex */
public final class NetWorkResponseWithRefreshTokenInterceptor implements Interceptor {

    @NotNull
    public static final C2400a Companion;

    @NotNull
    private static final String TAG;
    public HeaderLiveData headerLiveData;

    @NotNull
    private final Gson json;
    public AbstractC3427a refreshRepository;
    private final Type type;

    /* renamed from: com.zykj.http.interceptor.NetWorkResponseWithRefreshTokenInterceptor$a */
    public static final class C2400a {
        private C2400a() {
        }

        public /* synthetic */ C2400a(C2764g c2764g) {
            this();
        }
    }

    @InterfaceC2750f(m9206c = "com.zykj.http.interceptor.NetWorkResponseWithRefreshTokenInterceptor$refreshTokenAndContinueRequest$1$1$1", m9207f = "NetWorkResponseWithRefreshTokenInterceptor.kt", m9208l = {72}, m9209m = "invokeSuspend")
    /* renamed from: com.zykj.http.interceptor.NetWorkResponseWithRefreshTokenInterceptor$b */
    static final class C2401b extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super C2925r>, Object> {

        /* renamed from: b */
        Object f9790b;

        /* renamed from: c */
        int f9791c;

        /* renamed from: d */
        final /* synthetic */ C2781x<String> f9792d;

        /* renamed from: e */
        final /* synthetic */ NetWorkResponseWithRefreshTokenInterceptor f9793e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2401b(C2781x<String> c2781x, NetWorkResponseWithRefreshTokenInterceptor netWorkResponseWithRefreshTokenInterceptor, InterfaceC3012d<? super C2401b> interfaceC3012d) {
            super(2, interfaceC3012d);
            this.f9792d = c2781x;
            this.f9793e = netWorkResponseWithRefreshTokenInterceptor;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @NotNull
        public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> interfaceC3012d) {
            return new C2401b(this.f9792d, this.f9793e, interfaceC3012d);
        }

        @Override // p171x2.InterfaceC3474p
        @Nullable
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object mo2812d(@NotNull InterfaceC2557h0 interfaceC2557h0, @Nullable InterfaceC3012d<? super C2925r> interfaceC3012d) {
            return ((C2401b) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C3033d.m10175c();
            int i4 = this.f9791c;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2781x c2781x = (C2781x) this.f9790b;
                C2920m.m9994b(obj);
                c2781x.f10737a = obj;
                return C2925r.f11415a;
            }
            C2920m.m9994b(obj);
            C2781x<String> c2781x2 = this.f9792d;
            this.f9793e.getRefreshRepository();
            this.f9790b = c2781x2;
            this.f9791c = 1;
            throw null;
        }
    }

    /* renamed from: com.zykj.http.interceptor.NetWorkResponseWithRefreshTokenInterceptor$c */
    public static final class C2402c extends TypeToken<ApiResp<JsonElement>> {
        C2402c() {
        }
    }

    static {
        C2400a c2400a = new C2400a(null);
        Companion = c2400a;
        String name = c2400a.getClass().getName();
        C2769l.m9240d(name, "this::class.java.name");
        TAG = name;
    }

    public NetWorkResponseWithRefreshTokenInterceptor() {
        Gson gsonCreate = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        C2769l.m9240d(gsonCreate, "GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create()");
        this.json = gsonCreate;
        this.type = new C2402c().getType();
    }

    private final ApiResp<JsonElement> parseJson(String str) throws RemoteCodeException {
        try {
            return (ApiResp) this.json.fromJson(str, this.type);
        } catch (JsonParseException e4) {
            throw new RemoteCodeException(ErrorCode.JSON_PARSE_FAIL, e4);
        } catch (ClassCastException e5) {
            throw new RemoteCodeException(ErrorCode.CLASS_CAST_FAIL, e5);
        } catch (IllegalArgumentException e6) {
            throw new RemoteCodeException(ErrorCode.ARGUMENT_SERIAL_FAIL, e6);
        }
    }

    private final Response refreshTokenAndContinueRequest(Response response, Interceptor.Chain chain) throws InterruptedException {
        ApiResp<JsonElement> json;
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody != null && (json = parseJson(responseBodyBody.string())) != null) {
            String str = TAG;
            Log.m6189e(str, "apiResp");
            ErrorInfo error = json.getError();
            if (C2769l.m9237a("CurrentUserDidNotLoginToTheApplication", error == null ? null : error.getMessage())) {
                Log.m6189e(str, "token expire");
                Request.Builder builderNewBuilder = chain.request().newBuilder();
                C2781x c2781x = new C2781x();
                c2781x.f10737a = "";
                C2556h.m8568b(null, new C2401b(c2781x, this, null), 1, null);
                if (C2495u.m8346r((CharSequence) c2781x.f10737a)) {
                    Log.m6189e(str, "token is null");
                    return null;
                }
                builderNewBuilder.header("Authorization", C2769l.m9248l("Bearer ", c2781x.f10737a));
                Request requestBuild = builderNewBuilder.build();
                Log.m6189e(str, C2769l.m9248l("new request header=", requestBuild.headers()));
                return chain.proceed(requestBuild);
            }
        }
        return null;
    }

    @NotNull
    public final HeaderLiveData getHeaderLiveData() {
        HeaderLiveData headerLiveData = this.headerLiveData;
        if (headerLiveData != null) {
            return headerLiveData;
        }
        C2769l.m9256t("headerLiveData");
        throw null;
    }

    @NotNull
    public final AbstractC3427a getRefreshRepository() {
        C2769l.m9256t("refreshRepository");
        throw null;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws InterruptedException, IOException {
        C2769l.m9241e(chain, "chain");
        Response responseProceed = chain.proceed(chain.request());
        if (responseProceed.code() == 401) {
            Log.m6189e(TAG, "url=" + chain.request().url() + " header=" + chain.request().headers());
            Response responseRefreshTokenAndContinueRequest = refreshTokenAndContinueRequest(responseProceed, chain);
            if (responseRefreshTokenAndContinueRequest == null) {
                getHeaderLiveData().getUnauthorized().postValue(ErrorCode.NET_TOKEN_ERROR);
                return responseProceed;
            }
            responseProceed = responseRefreshTokenAndContinueRequest;
        }
        if (responseProceed.code() == 401) {
            getHeaderLiveData().getUnauthorized().postValue(ErrorCode.NET_TOKEN_ERROR);
        }
        return responseProceed;
    }

    public final void setHeaderLiveData(@NotNull HeaderLiveData headerLiveData) {
        C2769l.m9241e(headerLiveData, "<set-?>");
        this.headerLiveData = headerLiveData;
    }

    public final void setRefreshRepository(@NotNull AbstractC3427a abstractC3427a) {
        C2769l.m9241e(abstractC3427a, "<set-?>");
    }
}
