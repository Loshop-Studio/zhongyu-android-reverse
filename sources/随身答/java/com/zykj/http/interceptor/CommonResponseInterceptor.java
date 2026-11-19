package com.zykj.http.interceptor;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import android.util.Log;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.zykj.http.bean.CommonApiResp;
import com.zykj.http.bean.HeaderLiveData;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import com.zykj.lib.error.code.ErrorCodeInfo;
import java.lang.reflect.Type;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p172l8.AbstractC8927z;
import p172l8.C8921t;
import p172l8.C8926y;
import p172l8.InterfaceC8920s;

@Deprecated(message = "如果不符合条件，则会抛异常，这样的逻辑不合理")
@Keep
@Metadata(m13412d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, m13413d2 = {"Lcom/zykj/http/interceptor/CommonResponseInterceptor;", "Ll8/s;", "<init>", "()V", "", "jsonStr", "Lcom/zykj/http/bean/CommonApiResp;", "Lcom/google/gson/JsonElement;", "parseJson", "(Ljava/lang/String;)Lcom/zykj/http/bean/CommonApiResp;", "resp", "Ll8/z;", "reBuildResponse", "(Lcom/zykj/http/bean/CommonApiResp;)Ll8/z;", "Ll8/s$a;", "chain", "Ll8/y;", "intercept", "(Ll8/s$a;)Ll8/y;", "Lcom/zykj/http/bean/HeaderLiveData;", "headerLiveData", "Lcom/zykj/http/bean/HeaderLiveData;", "getHeaderLiveData", "()Lcom/zykj/http/bean/HeaderLiveData;", "setHeaderLiveData", "(Lcom/zykj/http/bean/HeaderLiveData;)V", "Lcom/google/gson/Gson;", "json", "Lcom/google/gson/Gson;", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "type", "Ljava/lang/reflect/Type;", "Companion", "a", "http_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class CommonResponseInterceptor implements InterfaceC8920s {
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

    public CommonResponseInterceptor() {
        Gson gsonCreate = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create()");
        this.json = gsonCreate;
        this.type = new TypeToken<CommonApiResp<JsonElement>>() { // from class: com.zykj.http.interceptor.CommonResponseInterceptor$type$1
        }.getType();
    }

    private final CommonApiResp<JsonElement> parseJson(String jsonStr) throws RemoteCodeException {
        try {
            return (CommonApiResp) this.json.fromJson(jsonStr, this.type);
        } catch (JsonParseException e10) {
            throw new RemoteCodeException(ErrorCode.JSON_PARSE_FAIL, e10);
        } catch (ClassCastException e11) {
            throw new RemoteCodeException(ErrorCode.CLASS_CAST_FAIL, e11);
        } catch (IllegalArgumentException e12) {
            throw new RemoteCodeException(ErrorCode.ARGUMENT_SERIAL_FAIL, e12);
        }
    }

    private final AbstractC8927z reBuildResponse(CommonApiResp<JsonElement> resp) throws JsonIOException, RemoteCodeException {
        if (resp.getCode() != 0) {
            if (resp.getMessage() != null) {
                throw new RemoteCodeException(new ErrorCodeInfo(0, "请求失败", null, resp.getMessage(), 4, null));
            }
            throw new RemoteCodeException(new ErrorCodeInfo(0, "请求失败，返回的message=null", null, null, 12, null));
        }
        if (resp.getResult() == null) {
            AbstractC8927z.b bVar = AbstractC8927z.Companion;
            String json = this.json.toJson("");
            Intrinsics.checkNotNullExpressionValue(json, "json.toJson(\"\")");
            return bVar.m14210a(json, C8921t.f14817e.m14034a("application/json"));
        }
        if (resp.getResult().isJsonPrimitive()) {
            AbstractC8927z.b bVar2 = AbstractC8927z.Companion;
            String asString = resp.getResult().getAsString();
            Intrinsics.checkNotNullExpressionValue(asString, "resp.result.asString");
            return bVar2.m14210a(asString, C8921t.f14817e.m14034a("application/json"));
        }
        String toJson = this.json.toJson(resp.getResult());
        AbstractC8927z.b bVar3 = AbstractC8927z.Companion;
        Intrinsics.checkNotNullExpressionValue(toJson, "toJson");
        return bVar3.m14210a(toJson, C8921t.f14817e.m14034a("application/json"));
    }

    public final HeaderLiveData getHeaderLiveData() {
        HeaderLiveData headerLiveData = this.headerLiveData;
        if (headerLiveData != null) {
            return headerLiveData;
        }
        Intrinsics.throwUninitializedPropertyAccessException("headerLiveData");
        throw null;
    }

    @Override // p172l8.InterfaceC8920s
    public C8926y intercept(InterfaceC8920s.a chain) throws RemoteCodeException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C8926y c8926yMo14025b = chain.mo14025b(chain.mo14024a());
        if (c8926yMo14025b.m14174i() == 401) {
            try {
                Log.e(TAG, "url=" + chain.mo14024a().m14137j() + " header=" + chain.mo14024a().m14132e());
            } catch (IllegalStateException unused) {
            }
            getHeaderLiveData().getUnauthorized().postValue(ErrorCode.NET_TOKEN_ERROR);
            return c8926yMo14025b;
        }
        if (c8926yMo14025b.m14180p() && c8926yMo14025b.m14170a() != null) {
            AbstractC8927z abstractC8927zM14170a = c8926yMo14025b.m14170a();
            String strValueOf = String.valueOf(abstractC8927zM14170a == null ? null : abstractC8927zM14170a.contentType());
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = strValueOf.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "application/json", false, 2, (Object) null)) {
                AbstractC8927z abstractC8927zM14170a2 = c8926yMo14025b.m14170a();
                CommonApiResp<JsonElement> json = parseJson(abstractC8927zM14170a2 != null ? abstractC8927zM14170a2.string() : null);
                if (json != null) {
                    return c8926yMo14025b.m14183s().m14190b(reBuildResponse(json)).m14191c();
                }
                throw new RemoteCodeException(ErrorCode.NET_RESPONSE_NULL);
            }
        }
        return c8926yMo14025b;
    }

    public final void setHeaderLiveData(HeaderLiveData headerLiveData) {
        Intrinsics.checkNotNullParameter(headerLiveData, "<set-?>");
        this.headerLiveData = headerLiveData;
    }
}
