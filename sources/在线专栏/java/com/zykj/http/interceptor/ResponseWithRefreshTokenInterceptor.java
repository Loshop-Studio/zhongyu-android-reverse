package com.zykj.http.interceptor;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import android.util.Log;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.reflect.TypeToken;
import com.zykj.http.bean.ApiResp;
import com.zykj.http.bean.ErrorInfo;
import com.zykj.http.bean.HeaderLiveData;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import com.zykj.lib.error.code.ErrorCodeInfo;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.AbstractC2755k;
import kotlin.coroutines.jvm.internal.InterfaceC2750f;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import kotlin.jvm.internal.C2781x;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p082e3.C2495u;
import p082e3.C2496v;
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
public final class ResponseWithRefreshTokenInterceptor implements Interceptor {

    @NotNull
    public static final String CONTENT_TYPE_JSON = "application/json";

    @NotNull
    public static final C2405a Companion;

    @NotNull
    private static final String TAG;
    public HeaderLiveData headerLiveData;

    @NotNull
    private final Gson json;
    public AbstractC3427a refreshRepository;
    private final Type type;

    /* renamed from: com.zykj.http.interceptor.ResponseWithRefreshTokenInterceptor$a */
    public static final class C2405a {
        private C2405a() {
        }

        public /* synthetic */ C2405a(C2764g c2764g) {
            this();
        }
    }

    @InterfaceC2750f(m9206c = "com.zykj.http.interceptor.ResponseWithRefreshTokenInterceptor$refreshTokenAndContinueRequest$1$1$1", m9207f = "ResponseWithRefreshTokenInterceptor.kt", m9208l = {94}, m9209m = "invokeSuspend")
    /* renamed from: com.zykj.http.interceptor.ResponseWithRefreshTokenInterceptor$b */
    static final class C2406b extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super C2925r>, Object> {

        /* renamed from: b */
        Object f9794b;

        /* renamed from: c */
        int f9795c;

        /* renamed from: d */
        final /* synthetic */ C2781x<String> f9796d;

        /* renamed from: e */
        final /* synthetic */ ResponseWithRefreshTokenInterceptor f9797e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2406b(C2781x<String> c2781x, ResponseWithRefreshTokenInterceptor responseWithRefreshTokenInterceptor, InterfaceC3012d<? super C2406b> interfaceC3012d) {
            super(2, interfaceC3012d);
            this.f9796d = c2781x;
            this.f9797e = responseWithRefreshTokenInterceptor;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @NotNull
        public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> interfaceC3012d) {
            return new C2406b(this.f9796d, this.f9797e, interfaceC3012d);
        }

        @Override // p171x2.InterfaceC3474p
        @Nullable
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object mo2812d(@NotNull InterfaceC2557h0 interfaceC2557h0, @Nullable InterfaceC3012d<? super C2925r> interfaceC3012d) {
            return ((C2406b) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C3033d.m10175c();
            int i4 = this.f9795c;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2781x c2781x = (C2781x) this.f9794b;
                C2920m.m9994b(obj);
                c2781x.f10737a = obj;
                return C2925r.f11415a;
            }
            C2920m.m9994b(obj);
            C2781x<String> c2781x2 = this.f9796d;
            this.f9797e.getRefreshRepository();
            this.f9794b = c2781x2;
            this.f9795c = 1;
            throw null;
        }
    }

    /* renamed from: com.zykj.http.interceptor.ResponseWithRefreshTokenInterceptor$c */
    public static final class C2407c extends TypeToken<ApiResp<JsonElement>> {
        C2407c() {
        }
    }

    static {
        C2405a c2405a = new C2405a(null);
        Companion = c2405a;
        String name = c2405a.getClass().getName();
        C2769l.m9240d(name, "this::class.java.name");
        TAG = name;
    }

    public ResponseWithRefreshTokenInterceptor() {
        Gson gsonCreate = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        C2769l.m9240d(gsonCreate, "GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create()");
        this.json = gsonCreate;
        this.type = new C2407c().getType();
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

    private final ResponseBody reBuildResponse(ApiResp<JsonElement> apiResp) throws JsonIOException, RemoteCodeException {
        if (!apiResp.getSuccess()) {
            if (apiResp.getError() != null) {
                throw new RemoteCodeException(new ErrorCodeInfo(apiResp.getError().getCode(), C2769l.m9248l("http返回error=", apiResp.getError()), null, apiResp.getError().getMessage(), 4, null));
            }
            throw new RemoteCodeException(new ErrorCodeInfo(0, "http返回error=null", null, null, 12, null));
        }
        if (apiResp.getResult() == null) {
            throw new RemoteCodeException(ErrorCode.NET_RESULT_NULL);
        }
        if (apiResp.getResult().isJsonPrimitive() && (apiResp.getResult() instanceof JsonPrimitive)) {
            ResponseBody.Companion companion = ResponseBody.Companion;
            String asString = ((JsonPrimitive) apiResp.getResult()).getAsString();
            C2769l.m9240d(asString, "resp.result.asString");
            return companion.create(asString, MediaType.Companion.get("application/json"));
        }
        String toJson = this.json.toJson(apiResp.getResult());
        ResponseBody.Companion companion2 = ResponseBody.Companion;
        C2769l.m9240d(toJson, "toJson");
        return companion2.create(toJson, MediaType.Companion.get("application/json"));
    }

    private final Response refreshTokenAndContinueRequest(Response response, Interceptor.Chain chain) throws InterruptedException {
        ApiResp<JsonElement> json;
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody != null && (json = parseJson(responseBodyBody.string())) != null) {
            String str = TAG;
            Log.e(str, "apiResp");
            ErrorInfo error = json.getError();
            if (C2769l.m9237a("CurrentUserDidNotLoginToTheApplication", error == null ? null : error.getMessage())) {
                Log.e(str, "token expire");
                Request.Builder builderNewBuilder = chain.request().newBuilder();
                C2781x c2781x = new C2781x();
                c2781x.f10737a = "";
                C2556h.m8568b(null, new C2406b(c2781x, this, null), 1, null);
                if (C2495u.m8346r((CharSequence) c2781x.f10737a)) {
                    Log.e(str, "token is null");
                    return null;
                }
                builderNewBuilder.header("Authorization", C2769l.m9248l("Bearer ", c2781x.f10737a));
                Request requestBuild = builderNewBuilder.build();
                Log.e(str, C2769l.m9248l("new request header=", requestBuild.headers()));
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
    public Response intercept(@NotNull Interceptor.Chain chain) throws InterruptedException, JsonIOException, IOException {
        C2769l.m9241e(chain, "chain");
        Response responseProceed = chain.proceed(chain.request());
        if (responseProceed.code() == 401) {
            Log.e(TAG, "url=" + chain.request().url() + " header=" + chain.request().headers());
            Response responseRefreshTokenAndContinueRequest = refreshTokenAndContinueRequest(responseProceed, chain);
            if (responseRefreshTokenAndContinueRequest == null) {
                getHeaderLiveData().getUnauthorized().postValue(ErrorCode.NET_TOKEN_ERROR);
                return responseProceed;
            }
            responseProceed = responseRefreshTokenAndContinueRequest;
        }
        if (responseProceed.code() == 401) {
            getHeaderLiveData().getUnauthorized().postValue(ErrorCode.NET_TOKEN_ERROR);
            return responseProceed;
        }
        if (responseProceed.isSuccessful() && responseProceed.body() != null) {
            ResponseBody responseBodyBody = responseProceed.body();
            String strValueOf = String.valueOf(responseBodyBody == null ? null : responseBodyBody.contentType());
            Locale ROOT = Locale.ROOT;
            C2769l.m9240d(ROOT, "ROOT");
            String lowerCase = strValueOf.toLowerCase(ROOT);
            C2769l.m9240d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            if (C2496v.m8366H(lowerCase, "application/json", false, 2, null)) {
                ResponseBody responseBodyBody2 = responseProceed.body();
                ApiResp<JsonElement> json = parseJson(responseBodyBody2 != null ? responseBodyBody2.string() : null);
                if (json == null) {
                    throw new RemoteCodeException(ErrorCode.NET_RESPONSE_NULL);
                }
                ResponseBody responseBodyReBuildResponse = reBuildResponse(json);
                if (responseBodyReBuildResponse != null) {
                    return responseProceed.newBuilder().body(responseBodyReBuildResponse).build();
                }
            }
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
