package com.zykj.http.interceptor;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import android.util.Log;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.umeng.analytics.pro.C3335ai;
import com.zykj.http.bean.ApiResp;
import com.zykj.http.bean.HeaderLiveData;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import com.zykj.lib.error.code.ErrorCodeInfo;
import java.lang.reflect.Type;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import p117r2.AbstractC4498b0;
import p117r2.C4496a0;
import p117r2.C4519v;
import p117r2.InterfaceC4518u;

@Keep
@Metadata(m5174d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\t\b\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, m5175d2 = {"Lcom/zykj/http/interceptor/ResponseInterceptor;", "Lr2/u;", "", "jsonStr", "Lcom/zykj/http/bean/ApiResp;", "Lcom/google/gson/JsonElement;", "parseJson", "resp", "Lr2/b0;", "reBuildResponse", "Lr2/u$a;", "chain", "Lr2/a0;", "intercept", "Lcom/zykj/http/bean/HeaderLiveData;", "headerLiveData", "Lcom/zykj/http/bean/HeaderLiveData;", "getHeaderLiveData", "()Lcom/zykj/http/bean/HeaderLiveData;", "setHeaderLiveData", "(Lcom/zykj/http/bean/HeaderLiveData;)V", "Lcom/google/gson/Gson;", "json", "Lcom/google/gson/Gson;", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "type", "Ljava/lang/reflect/Type;", "<init>", "()V", "Companion", C3335ai.f1705at, "http_release"}, m5176k = 1, m5177mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ResponseInterceptor implements InterfaceC4518u {
    public static final String CONTENT_TYPE_JSON = "application/json";
    private static final String TAG;
    public HeaderLiveData headerLiveData;
    private final Gson json;
    private final Type type;

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        String name = companion.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "this::class.java.name");
        TAG = name;
    }

    public ResponseInterceptor() {
        Gson gsonCreate = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create()");
        this.json = gsonCreate;
        this.type = new TypeToken<ApiResp<JsonElement>>() { // from class: com.zykj.http.interceptor.ResponseInterceptor$type$1
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
        if (resp.getResult().isJsonArray() || resp.getResult().isJsonObject()) {
            String toJson = this.json.toJson(resp.getResult());
            AbstractC4498b0.b bVar = AbstractC4498b0.f5320b;
            Intrinsics.checkNotNullExpressionValue(toJson, "toJson");
            return bVar.m5843a(toJson, C4519v.f5558g.m6054a("application/json"));
        }
        if (resp.getResult().isJsonPrimitive()) {
            String toJson2 = this.json.toJson(resp.getResult());
            AbstractC4498b0.b bVar2 = AbstractC4498b0.f5320b;
            Intrinsics.checkNotNullExpressionValue(toJson2, "toJson");
            return bVar2.m5843a(toJson2, C4519v.f5558g.m6054a("application/json"));
        }
        String toJson3 = this.json.toJson((JsonElement) JsonNull.INSTANCE);
        AbstractC4498b0.b bVar3 = AbstractC4498b0.f5320b;
        Intrinsics.checkNotNullExpressionValue(toJson3, "toJson");
        return bVar3.m5843a(toJson3, C4519v.f5558g.m6054a("application/json"));
    }

    public final HeaderLiveData getHeaderLiveData() {
        HeaderLiveData headerLiveData = this.headerLiveData;
        if (headerLiveData != null) {
            return headerLiveData;
        }
        Intrinsics.throwUninitializedPropertyAccessException("headerLiveData");
        throw null;
    }

    @Override // p117r2.InterfaceC4518u
    public C4496a0 intercept(InterfaceC4518u.a chain) throws RemoteCodeException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4496a0 c4496a0Mo6046a = chain.mo6046a(chain.mo6045S());
        if (c4496a0Mo6046a.m5804e() == 401) {
            Log.e(TAG, "url=" + chain.mo6045S().m6141j() + " header=" + chain.mo6045S().m6136e());
            getHeaderLiveData().getUnauthorized().postValue(ErrorCode.NET_TOKEN_ERROR);
            return c4496a0Mo6046a;
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
                if (json != null) {
                    return c4496a0Mo6046a.m5812n().m5819b(reBuildResponse(json)).m5820c();
                }
                throw new RemoteCodeException(ErrorCode.NET_RESPONSE_NULL);
            }
        }
        return c4496a0Mo6046a;
    }

    public final void setHeaderLiveData(HeaderLiveData headerLiveData) {
        Intrinsics.checkNotNullParameter(headerLiveData, "<set-?>");
        this.headerLiveData = headerLiveData;
    }
}
