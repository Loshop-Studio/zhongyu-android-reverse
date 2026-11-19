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
import com.zykj.http.bean.HeaderLiveData;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import com.zykj.lib.error.code.ErrorCodeInfo;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Locale;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import p082e3.C2496v;
import p128o2.C2911d;

@Keep
/* loaded from: classes.dex */
public final class ResponseInterceptor implements Interceptor {

    @NotNull
    public static final String CONTENT_TYPE_JSON = "application/json";

    @NotNull
    public static final C2403a Companion;

    @NotNull
    private static final String TAG;
    public HeaderLiveData headerLiveData;

    @NotNull
    private final Gson json;
    private final Type type;

    /* renamed from: com.zykj.http.interceptor.ResponseInterceptor$a */
    public static final class C2403a {
        private C2403a() {
        }

        public /* synthetic */ C2403a(C2764g c2764g) {
            this();
        }
    }

    /* renamed from: com.zykj.http.interceptor.ResponseInterceptor$b */
    public static final class C2404b extends TypeToken<ApiResp<JsonElement>> {
        C2404b() {
        }
    }

    static {
        C2403a c2403a = new C2403a(null);
        Companion = c2403a;
        String name = c2403a.getClass().getName();
        C2769l.m9240d(name, "this::class.java.name");
        TAG = name;
    }

    public ResponseInterceptor() {
        Gson gsonCreate = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        C2769l.m9240d(gsonCreate, "GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create()");
        this.json = gsonCreate;
        this.type = new C2404b().getType();
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
            ResponseBody.Companion companion = ResponseBody.Companion;
            String json = this.json.toJson("");
            C2769l.m9240d(json, "json.toJson(\"\")");
            return companion.create(json, MediaType.Companion.get("application/json"));
        }
        if (apiResp.getResult().isJsonPrimitive() && (apiResp.getResult() instanceof JsonPrimitive)) {
            ResponseBody.Companion companion2 = ResponseBody.Companion;
            String asString = ((JsonPrimitive) apiResp.getResult()).getAsString();
            C2769l.m9240d(asString, "resp.result.asString");
            return companion2.create(asString, MediaType.Companion.get("application/json"));
        }
        String toJson = this.json.toJson(apiResp.getResult());
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
    public Response intercept(@NotNull Interceptor.Chain chain) throws JsonIOException, IOException {
        C2769l.m9241e(chain, "chain");
        Response responseProceed = chain.proceed(chain.request());
        if (responseProceed.code() == 401) {
            Log.e(TAG, "url=" + chain.request().url() + " header=" + chain.request().headers());
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
                throw new C2911d();
            }
        }
        return responseProceed;
    }

    public final void setHeaderLiveData(@NotNull HeaderLiveData headerLiveData) {
        C2769l.m9241e(headerLiveData, "<set-?>");
        this.headerLiveData = headerLiveData;
    }
}
