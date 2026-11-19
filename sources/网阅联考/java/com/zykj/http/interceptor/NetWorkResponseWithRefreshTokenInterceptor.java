package com.zykj.http.interceptor;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import android.util.Log;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.umeng.analytics.pro.C3335ai;
import com.zykj.http.bean.ApiResp;
import com.zykj.http.bean.ErrorInfo;
import com.zykj.http.bean.HeaderLiveData;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import p116r1.AbstractC4494a;
import p117r2.AbstractC4498b0;
import p117r2.C4496a0;
import p117r2.C4522y;
import p117r2.InterfaceC4518u;

@Keep
@Metadata(m5174d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001%B\t\b\u0007¢\u0006\u0004\b\"\u0010#J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006&"}, m5175d2 = {"Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;", "Lr2/u;", "Lr2/a0;", "response", "Lr2/u$a;", "chain", "refreshTokenAndContinueRequest", "", "jsonStr", "Lcom/zykj/http/bean/ApiResp;", "Lcom/google/gson/JsonElement;", "parseJson", "intercept", "Lcom/zykj/http/bean/HeaderLiveData;", "headerLiveData", "Lcom/zykj/http/bean/HeaderLiveData;", "getHeaderLiveData", "()Lcom/zykj/http/bean/HeaderLiveData;", "setHeaderLiveData", "(Lcom/zykj/http/bean/HeaderLiveData;)V", "Lr1/a;", "refreshRepository", "Lr1/a;", "getRefreshRepository", "()Lr1/a;", "setRefreshRepository", "(Lr1/a;)V", "Lcom/google/gson/Gson;", "json", "Lcom/google/gson/Gson;", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "type", "Ljava/lang/reflect/Type;", "<init>", "()V", "Companion", C3335ai.f1705at, "http_release"}, m5176k = 1, m5177mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class NetWorkResponseWithRefreshTokenInterceptor implements InterfaceC4518u {
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

    public NetWorkResponseWithRefreshTokenInterceptor() {
        Gson gsonCreate = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create()");
        this.json = gsonCreate;
        this.type = new TypeToken<ApiResp<JsonElement>>() { // from class: com.zykj.http.interceptor.NetWorkResponseWithRefreshTokenInterceptor$type$1
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
                BuildersKt__BuildersKt.runBlocking$default(null, new C3658xf8ba81e8(objectRef, this, null), 1, null);
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
    public C4496a0 intercept(InterfaceC4518u.a chain) throws InterruptedException, RemoteCodeException {
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
