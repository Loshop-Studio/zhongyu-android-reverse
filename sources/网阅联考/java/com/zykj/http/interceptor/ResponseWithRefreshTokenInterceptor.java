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
import com.umeng.analytics.pro.C3335ai;
import com.zykj.http.bean.ApiResp;
import com.zykj.http.bean.ErrorInfo;
import com.zykj.http.bean.HeaderLiveData;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import com.zykj.lib.error.code.ErrorCodeInfo;
import java.lang.reflect.Type;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import p116r1.AbstractC4494a;
import p117r2.AbstractC4498b0;
import p117r2.C4496a0;
import p117r2.C4519v;
import p117r2.C4522y;
import p117r2.InterfaceC4518u;

@Keep
@Metadata(m5174d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001(B\t\b\u0007¢\u0006\u0004\b%\u0010&J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010#\u001a\n \"*\u0004\u0018\u00010!0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006)"}, m5175d2 = {"Lcom/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor;", "Lr2/u;", "Lr2/a0;", "response", "Lr2/u$a;", "chain", "refreshTokenAndContinueRequest", "", "jsonStr", "Lcom/zykj/http/bean/ApiResp;", "Lcom/google/gson/JsonElement;", "parseJson", "resp", "Lr2/b0;", "reBuildResponse", "intercept", "Lcom/zykj/http/bean/HeaderLiveData;", "headerLiveData", "Lcom/zykj/http/bean/HeaderLiveData;", "getHeaderLiveData", "()Lcom/zykj/http/bean/HeaderLiveData;", "setHeaderLiveData", "(Lcom/zykj/http/bean/HeaderLiveData;)V", "Lr1/a;", "refreshRepository", "Lr1/a;", "getRefreshRepository", "()Lr1/a;", "setRefreshRepository", "(Lr1/a;)V", "Lcom/google/gson/Gson;", "json", "Lcom/google/gson/Gson;", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "type", "Ljava/lang/reflect/Type;", "<init>", "()V", "Companion", C3335ai.f1705at, "http_release"}, m5176k = 1, m5177mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ResponseWithRefreshTokenInterceptor implements InterfaceC4518u {
    public static final String CONTENT_TYPE_JSON = "application/json";
    private static final String TAG;
    public HeaderLiveData headerLiveData;
    private final Gson json;
    public AbstractC4494a refreshRepository;
    private final Type type;

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        String name = companion.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "this::class.java.name");
        TAG = name;
    }

    public ResponseWithRefreshTokenInterceptor() {
        Gson gsonCreate = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create()");
        this.json = gsonCreate;
        this.type = new TypeToken<ApiResp<JsonElement>>() { // from class: com.zykj.http.interceptor.ResponseWithRefreshTokenInterceptor$type$1
        }.getType();
    }

    private final ApiResp<JsonElement> parseJson(String jsonStr) throws RemoteCodeException {
        try {
            return (ApiResp) this.json.fromJson(jsonStr, this.type);
        } catch (JsonParseException e4) {
            throw new RemoteCodeException(ErrorCode.JSON_PARSE_FAIL, e4);
        } catch (ClassCastException e5) {
            throw new RemoteCodeException(ErrorCode.CLASS_CAST_FAIL, e5);
        } catch (IllegalArgumentException e6) {
            throw new RemoteCodeException(ErrorCode.ARGUMENT_SERIAL_FAIL, e6);
        }
    }

    private final AbstractC4498b0 reBuildResponse(ApiResp<JsonElement> resp) throws JsonIOException, RemoteCodeException {
        if (!resp.getSuccess()) {
            if (resp.getError() != null) {
                throw new RemoteCodeException(new ErrorCodeInfo(resp.getError().getCode(), Intrinsics.stringPlus("http返回error=", resp.getError()), null, resp.getError().getMessage(), 4, null));
            }
            throw new RemoteCodeException(new ErrorCodeInfo(0, "http返回error=null", null, null, 12, null));
        }
        if (resp.getResult() == null) {
            throw new RemoteCodeException(ErrorCode.NET_RESULT_NULL);
        }
        if (resp.getResult().isJsonPrimitive() && (resp.getResult() instanceof JsonPrimitive)) {
            AbstractC4498b0.b bVar = AbstractC4498b0.f5320b;
            String asString = ((JsonPrimitive) resp.getResult()).getAsString();
            Intrinsics.checkNotNullExpressionValue(asString, "resp.result.asString");
            return bVar.m5843a(asString, C4519v.f5558g.m6054a("application/json"));
        }
        String toJson = this.json.toJson(resp.getResult());
        AbstractC4498b0.b bVar2 = AbstractC4498b0.f5320b;
        Intrinsics.checkNotNullExpressionValue(toJson, "toJson");
        return bVar2.m5843a(toJson, C4519v.f5558g.m6054a("application/json"));
    }

    private final C4496a0 refreshTokenAndContinueRequest(C4496a0 response, InterfaceC4518u.a chain) throws InterruptedException {
        ApiResp<JsonElement> json;
        AbstractC4498b0 abstractC4498b0M5800a = response.m5800a();
        if (abstractC4498b0M5800a != null && (json = parseJson(abstractC4498b0M5800a.m5841g())) != null) {
            String str = TAG;
            Log.e(str, "apiResp");
            ErrorInfo error = json.getError();
            if (Intrinsics.areEqual("CurrentUserDidNotLoginToTheApplication", error == null ? null : error.getMessage())) {
                Log.e(str, "token expire");
                C4522y.a aVarM6139h = chain.mo6045S().m6139h();
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = "";
                BuildersKt__BuildersKt.runBlocking$default(null, new C3661xb88199ba(objectRef, this, null), 1, null);
                if (StringsKt__StringsJVMKt.isBlank((CharSequence) objectRef.element)) {
                    Log.e(str, "token is null");
                    return null;
                }
                aVarM6139h.m6144c(HeadInterceptor.AUTH_KEY, Intrinsics.stringPlus("Bearer ", objectRef.element));
                C4522y c4522yM6143b = aVarM6139h.m6143b();
                Log.e(str, Intrinsics.stringPlus("new request header=", c4522yM6143b.m6136e()));
                response.close();
                return chain.mo6046a(c4522yM6143b);
            }
        }
        return null;
    }

    public final HeaderLiveData getHeaderLiveData() {
        HeaderLiveData headerLiveData = this.headerLiveData;
        if (headerLiveData != null) {
            return headerLiveData;
        }
        Intrinsics.throwUninitializedPropertyAccessException("headerLiveData");
        throw null;
    }

    public final AbstractC4494a getRefreshRepository() {
        AbstractC4494a abstractC4494a = this.refreshRepository;
        if (abstractC4494a != null) {
            return abstractC4494a;
        }
        Intrinsics.throwUninitializedPropertyAccessException("refreshRepository");
        throw null;
    }

    @Override // p117r2.InterfaceC4518u
    public C4496a0 intercept(InterfaceC4518u.a chain) throws InterruptedException, RemoteCodeException, JsonIOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4496a0 c4496a0Mo6046a = chain.mo6046a(chain.mo6045S());
        if (c4496a0Mo6046a.m5804e() == 401) {
            Log.e(TAG, "url=" + chain.mo6045S().m6141j() + " header=" + chain.mo6045S().m6136e());
            C4496a0 c4496a0RefreshTokenAndContinueRequest = refreshTokenAndContinueRequest(c4496a0Mo6046a, chain);
            if (c4496a0RefreshTokenAndContinueRequest == null) {
                getHeaderLiveData().getUnauthorized().postValue(ErrorCode.NET_TOKEN_ERROR);
                c4496a0Mo6046a.close();
                return chain.mo6046a(chain.mo6045S());
            }
            c4496a0Mo6046a = c4496a0RefreshTokenAndContinueRequest;
        }
        if (c4496a0Mo6046a.m5809k() && c4496a0Mo6046a.m5800a() != null) {
            AbstractC4498b0 abstractC4498b0M5800a = c4496a0Mo6046a.m5800a();
            String strValueOf = String.valueOf(abstractC4498b0M5800a == null ? null : abstractC4498b0M5800a.mo5091d());
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = strValueOf.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "application/json", false, 2, (Object) null)) {
                AbstractC4498b0 abstractC4498b0M5800a2 = c4496a0Mo6046a.m5800a();
                ApiResp<JsonElement> json = parseJson(abstractC4498b0M5800a2 != null ? abstractC4498b0M5800a2.m5841g() : null);
                if (json == null) {
                    throw new RemoteCodeException(ErrorCode.NET_RESPONSE_NULL);
                }
                AbstractC4498b0 abstractC4498b0ReBuildResponse = reBuildResponse(json);
                if (abstractC4498b0ReBuildResponse != null) {
                    return c4496a0Mo6046a.m5812n().m5819b(abstractC4498b0ReBuildResponse).m5820c();
                }
            }
        }
        if (c4496a0Mo6046a.m5804e() == 401) {
            getHeaderLiveData().getUnauthorized().postValue(ErrorCode.NET_TOKEN_ERROR);
        }
        return c4496a0Mo6046a;
    }

    public final void setHeaderLiveData(HeaderLiveData headerLiveData) {
        Intrinsics.checkNotNullParameter(headerLiveData, "<set-?>");
        this.headerLiveData = headerLiveData;
    }

    public final void setRefreshRepository(AbstractC4494a abstractC4494a) {
        Intrinsics.checkNotNullParameter(abstractC4494a, "<set-?>");
        this.refreshRepository = abstractC4494a;
    }
}
