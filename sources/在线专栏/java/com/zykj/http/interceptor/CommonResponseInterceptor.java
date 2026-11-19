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
import com.zykj.http.bean.CommonApiResp;
import com.zykj.http.bean.HeaderLiveData;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import com.zykj.lib.error.code.ErrorCodeInfo;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.AbstractC2755k;
import kotlin.coroutines.jvm.internal.C2746b;
import kotlin.coroutines.jvm.internal.InterfaceC2750f;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p082e3.C2496v;
import p087f3.C2556h;
import p087f3.InterfaceC2557h0;
import p102i3.InterfaceC2672e;
import p128o2.C2920m;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p146r2.C3033d;
import p171x2.InterfaceC3474p;

@Keep
/* loaded from: classes.dex */
public final class CommonResponseInterceptor implements Interceptor {

    @NotNull
    public static final String CONTENT_TYPE_JSON = "application/json";

    @NotNull
    public static final C2395a Companion;

    @NotNull
    private static final String TAG;
    public HeaderLiveData headerLiveData;

    @NotNull
    private final Gson json;
    private final Type type;

    /* renamed from: com.zykj.http.interceptor.CommonResponseInterceptor$a */
    public static final class C2395a {
        private C2395a() {
        }

        public /* synthetic */ C2395a(C2764g c2764g) {
            this();
        }
    }

    @InterfaceC2750f(m9206c = "com.zykj.http.interceptor.CommonResponseInterceptor$reBuildResponse$1", m9207f = "CommonResponseInterceptor.kt", m9208l = {103}, m9209m = "invokeSuspend")
    /* renamed from: com.zykj.http.interceptor.CommonResponseInterceptor$b */
    static final class C2396b extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super C2925r>, Object> {

        /* renamed from: b */
        int f9788b;

        C2396b(InterfaceC3012d<? super C2396b> interfaceC3012d) {
            super(2, interfaceC3012d);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @NotNull
        public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> interfaceC3012d) {
            return CommonResponseInterceptor.this.new C2396b(interfaceC3012d);
        }

        @Override // p171x2.InterfaceC3474p
        @Nullable
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object mo2812d(@NotNull InterfaceC2557h0 interfaceC2557h0, @Nullable InterfaceC3012d<? super C2925r> interfaceC3012d) {
            return ((C2396b) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM10175c = C3033d.m10175c();
            int i4 = this.f9788b;
            if (i4 == 0) {
                C2920m.m9994b(obj);
                InterfaceC2672e<Boolean> lessonDeauthorized = CommonResponseInterceptor.this.getHeaderLiveData().getLessonDeauthorized();
                Boolean boolM9202a = C2746b.m9202a(true);
                this.f9788b = 1;
                if (lessonDeauthorized.mo8120a(boolM9202a, this) == objM10175c) {
                    return objM10175c;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2920m.m9994b(obj);
            }
            return C2925r.f11415a;
        }
    }

    /* renamed from: com.zykj.http.interceptor.CommonResponseInterceptor$c */
    public static final class C2397c extends TypeToken<CommonApiResp<JsonElement>> {
        C2397c() {
        }
    }

    static {
        C2395a c2395a = new C2395a(null);
        Companion = c2395a;
        String name = c2395a.getClass().getName();
        C2769l.m9240d(name, "this::class.java.name");
        TAG = name;
    }

    public CommonResponseInterceptor() {
        Gson gsonCreate = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        C2769l.m9240d(gsonCreate, "GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create()");
        this.json = gsonCreate;
        this.type = new C2397c().getType();
    }

    private final CommonApiResp<JsonElement> parseJson(String str) throws RemoteCodeException {
        try {
            return (CommonApiResp) this.json.fromJson(str, this.type);
        } catch (JsonParseException e4) {
            throw new RemoteCodeException(ErrorCode.JSON_PARSE_FAIL, e4);
        } catch (ClassCastException e5) {
            throw new RemoteCodeException(ErrorCode.CLASS_CAST_FAIL, e5);
        } catch (IllegalArgumentException e6) {
            throw new RemoteCodeException(ErrorCode.ARGUMENT_SERIAL_FAIL, e6);
        }
    }

    private final ResponseBody reBuildResponse(CommonApiResp<JsonElement> commonApiResp) throws InterruptedException, JsonIOException, RemoteCodeException {
        if (commonApiResp.getCode() != 0) {
            if (commonApiResp.getCode() == 1022) {
                C2556h.m8568b(null, new C2396b(null), 1, null);
                throw new RemoteCodeException(new ErrorCodeInfo(1022, "课程授权被取消", null, commonApiResp.getMessage(), 4, null));
            }
            if (commonApiResp.getMessage() != null) {
                throw new RemoteCodeException(new ErrorCodeInfo(0, "请求失败", null, commonApiResp.getMessage(), 4, null));
            }
            throw new RemoteCodeException(new ErrorCodeInfo(0, "请求失败，返回的message=null", null, null, 12, null));
        }
        if (commonApiResp.getResult() == null) {
            ResponseBody.Companion companion = ResponseBody.Companion;
            String json = this.json.toJson("");
            C2769l.m9240d(json, "json.toJson(\"\")");
            return companion.create(json, MediaType.Companion.get("application/json"));
        }
        if (commonApiResp.getResult().isJsonPrimitive() && (commonApiResp.getResult() instanceof JsonPrimitive)) {
            ResponseBody.Companion companion2 = ResponseBody.Companion;
            String asString = ((JsonPrimitive) commonApiResp.getResult()).getAsString();
            C2769l.m9240d(asString, "resp.result.asString");
            return companion2.create(asString, MediaType.Companion.get("application/json"));
        }
        String toJson = this.json.toJson(commonApiResp.getResult());
        ResponseBody.Companion companion3 = ResponseBody.Companion;
        C2769l.m9240d(toJson, "toJson");
        return companion3.create(toJson, MediaType.Companion.get("application/json"));
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

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        C2769l.m9241e(chain, "chain");
        Response responseProceed = chain.proceed(chain.request());
        if (responseProceed.code() == 401) {
            try {
                Log.e(TAG, "url=" + chain.request().url() + " header=" + chain.request().headers());
            } catch (IllegalStateException unused) {
            }
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
                CommonApiResp<JsonElement> json = parseJson(responseBodyBody2 != null ? responseBodyBody2.string() : null);
                if (json != null) {
                    return responseProceed.newBuilder().body(reBuildResponse(json)).build();
                }
                throw new RemoteCodeException(ErrorCode.NET_RESPONSE_NULL);
            }
        }
        return responseProceed;
    }

    public final void setHeaderLiveData(@NotNull HeaderLiveData headerLiveData) {
        C2769l.m9241e(headerLiveData, "<set-?>");
        this.headerLiveData = headerLiveData;
    }
}
