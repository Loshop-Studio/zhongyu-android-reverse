package com.zykj.http.interceptor;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import android.util.Log;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.zykj.http.bean.ApiResp;
import com.zykj.http.bean.ErrorInfo;
import com.zykj.http.bean.HeaderLiveData;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import p172l8.AbstractC8927z;
import p172l8.C8924w;
import p172l8.C8926y;
import p172l8.InterfaceC8920s;
import p313z5.AbstractC10002a;

@Keep
@Metadata(m13412d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001(B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010%\u001a\n $*\u0004\u0018\u00010#0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, m13413d2 = {"Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;", "Ll8/s;", "<init>", "()V", "Ll8/y;", "response", "Ll8/s$a;", "chain", "refreshTokenAndContinueRequest", "(Ll8/y;Ll8/s$a;)Ll8/y;", "", "jsonStr", "Lcom/zykj/http/bean/ApiResp;", "Lcom/google/gson/JsonElement;", "parseJson", "(Ljava/lang/String;)Lcom/zykj/http/bean/ApiResp;", "intercept", "(Ll8/s$a;)Ll8/y;", "Lcom/zykj/http/bean/HeaderLiveData;", "headerLiveData", "Lcom/zykj/http/bean/HeaderLiveData;", "getHeaderLiveData", "()Lcom/zykj/http/bean/HeaderLiveData;", "setHeaderLiveData", "(Lcom/zykj/http/bean/HeaderLiveData;)V", "Lz5/a;", "refreshRepository", "Lz5/a;", "getRefreshRepository", "()Lz5/a;", "setRefreshRepository", "(Lz5/a;)V", "Lcom/google/gson/Gson;", "json", "Lcom/google/gson/Gson;", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "type", "Ljava/lang/reflect/Type;", "Companion", "a", "http_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class NetWorkResponseWithRefreshTokenInterceptor implements InterfaceC8920s {
    private static final String TAG;
    public HeaderLiveData headerLiveData;
    private final Gson json;
    public AbstractC10002a refreshRepository;
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
        } catch (JsonParseException e10) {
            throw new RemoteCodeException(ErrorCode.JSON_PARSE_FAIL, e10);
        } catch (ClassCastException e11) {
            throw new RemoteCodeException(ErrorCode.CLASS_CAST_FAIL, e11);
        } catch (IllegalArgumentException e12) {
            throw new RemoteCodeException(ErrorCode.ARGUMENT_SERIAL_FAIL, e12);
        }
    }

    private final C8926y refreshTokenAndContinueRequest(C8926y response, InterfaceC8920s.a chain) throws InterruptedException {
        ApiResp<JsonElement> json;
        AbstractC8927z abstractC8927zM14170a = response.m14170a();
        if (abstractC8927zM14170a != null && (json = parseJson(abstractC8927zM14170a.string())) != null) {
            String str = TAG;
            Log.e(str, "apiResp");
            ErrorInfo error = json.getError();
            if (Intrinsics.areEqual("CurrentUserDidNotLoginToTheApplication", error == null ? null : error.getMessage())) {
                Log.e(str, "token expire");
                C8924w.a aVarM14135h = chain.mo14024a().m14135h();
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = "";
                BuildersKt__BuildersKt.runBlocking$default(null, new C7193xf8ba81e8(objectRef, this, null), 1, null);
                if (StringsKt.isBlank((CharSequence) objectRef.element)) {
                    Log.e(str, "token is null");
                    return null;
                }
                aVarM14135h.m14145h("Authorization", Intrinsics.stringPlus("Bearer ", objectRef.element));
                C8924w c8924wM14140b = aVarM14135h.m14140b();
                Log.e(str, Intrinsics.stringPlus("new request header=", c8924wM14140b.m14132e()));
                response.close();
                return chain.mo14025b(c8924wM14140b);
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

    public final AbstractC10002a getRefreshRepository() {
        AbstractC10002a abstractC10002a = this.refreshRepository;
        if (abstractC10002a != null) {
            return abstractC10002a;
        }
        Intrinsics.throwUninitializedPropertyAccessException("refreshRepository");
        throw null;
    }

    @Override // p172l8.InterfaceC8920s
    public C8926y intercept(InterfaceC8920s.a chain) throws InterruptedException, RemoteCodeException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C8926y c8926yMo14025b = chain.mo14025b(chain.mo14024a());
        if (c8926yMo14025b.m14174i() == 401) {
            Log.e(TAG, "url=" + chain.mo14024a().m14137j() + " header=" + chain.mo14024a().m14132e());
            C8926y c8926yRefreshTokenAndContinueRequest = refreshTokenAndContinueRequest(c8926yMo14025b, chain);
            if (c8926yRefreshTokenAndContinueRequest == null) {
                getHeaderLiveData().getUnauthorized().postValue(ErrorCode.NET_TOKEN_ERROR);
                c8926yMo14025b.close();
                return chain.mo14025b(chain.mo14024a());
            }
            c8926yMo14025b = c8926yRefreshTokenAndContinueRequest;
        }
        if (c8926yMo14025b.m14174i() == 401) {
            getHeaderLiveData().getUnauthorized().postValue(ErrorCode.NET_TOKEN_ERROR);
        }
        return c8926yMo14025b;
    }

    public final void setHeaderLiveData(HeaderLiveData headerLiveData) {
        Intrinsics.checkNotNullParameter(headerLiveData, "<set-?>");
        this.headerLiveData = headerLiveData;
    }

    public final void setRefreshRepository(AbstractC10002a abstractC10002a) {
        Intrinsics.checkNotNullParameter(abstractC10002a, "<set-?>");
        this.refreshRepository = abstractC10002a;
    }
}
