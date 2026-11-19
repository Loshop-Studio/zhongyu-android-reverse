package com.zykj.study.provide;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.zykj.http.annotation.UnauthorizedFlow;
import com.zykj.http.bean.ApiResp;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import com.zykj.lib.error.code.ErrorCodeInfo;
import java.lang.reflect.Type;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p130i3.AbstractC8756a;
import p135i8.AbstractC8836g;
import p135i8.InterfaceC8822b0;
import p136i9.AbstractC8905e0;
import p136i9.C8899b0;
import p136i9.C8903d0;
import p136i9.C8927y;
import p136i9.InterfaceC8926x;
import p169l8.InterfaceC9270g;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
@Keep
/* loaded from: classes3.dex */
public final class ResponseRefreshTokenInterceptor implements InterfaceC8926x {
    public static final String CONTENT_TYPE_JSON = "application/json";
    private final Gson json;
    private AbstractC8756a refreshRepository;
    private final Type type;
    private InterfaceC9270g unauthorizedFlow;
    public static final C7737a Companion = new C7737a(null);
    public static final int $stable = 8;

    /* renamed from: com.zykj.study.provide.ResponseRefreshTokenInterceptor$a */
    public static final class C7737a {
        public /* synthetic */ C7737a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7737a() {
        }
    }

    /* renamed from: com.zykj.study.provide.ResponseRefreshTokenInterceptor$b */
    public static final class C7738b extends TypeToken<ApiResp<JsonElement>> {
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.provide.ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1", m17801f = "ResponseRefreshTokenInterceptor.kt", m17802l = {IjkMediaMeta.FF_PROFILE_H264_MAIN}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.provide.ResponseRefreshTokenInterceptor$refreshTokenAndContinueRequest$1 */
    public static final class C77391 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public Object f11287a;

        /* renamed from: b */
        public int f11288b;

        /* renamed from: c */
        public final /* synthetic */ Ref$ObjectRef f11289c;

        /* renamed from: d */
        public final /* synthetic */ ResponseRefreshTokenInterceptor f11290d;

        /* renamed from: e */
        public final /* synthetic */ InterfaceC8926x.a f11291e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C77391(Ref$ObjectRef ref$ObjectRef, ResponseRefreshTokenInterceptor responseRefreshTokenInterceptor, InterfaceC8926x.a aVar, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f11289c = ref$ObjectRef;
            this.f11290d = responseRefreshTokenInterceptor;
            this.f11291e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C77391(this.f11289c, this.f11290d, this.f11291e, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C77391) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strM14010y0;
            Ref$ObjectRef ref$ObjectRef;
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f11288b;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                Ref$ObjectRef ref$ObjectRef2 = this.f11289c;
                AbstractC8756a refreshRepository = this.f11290d.getRefreshRepository();
                String strM15045e = this.f11291e.mo15332a().m15045e(HttpHeaders.AUTHORIZATION);
                if (strM15045e == null || (strM14010y0 = AbstractC8661c0.m14010y0(strM15045e, "Bearer ")) == null) {
                    strM14010y0 = "";
                }
                this.f11287a = ref$ObjectRef2;
                this.f11288b = 1;
                Object objMo10386a = refreshRepository.mo10386a(strM14010y0, this);
                if (objMo10386a == objM17291f) {
                    return objM17291f;
                }
                ref$ObjectRef = ref$ObjectRef2;
                obj = objMo10386a;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$ObjectRef = (Ref$ObjectRef) this.f11287a;
                AbstractC9079b.m15926b(obj);
            }
            ref$ObjectRef.f17473a = obj;
            return C8736p.f16368a;
        }
    }

    @Inject
    public ResponseRefreshTokenInterceptor(@UnauthorizedFlow InterfaceC9270g unauthorizedFlow, AbstractC8756a refreshRepository) {
        AbstractC9133u.m16133g(unauthorizedFlow, "unauthorizedFlow");
        AbstractC9133u.m16133g(refreshRepository, "refreshRepository");
        this.unauthorizedFlow = unauthorizedFlow;
        this.refreshRepository = refreshRepository;
        Gson gsonCreate = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        AbstractC9133u.m16132f(gsonCreate, "create(...)");
        this.json = gsonCreate;
        this.type = new C7738b().getType();
    }

    private final ApiResp<JsonElement> parseJson(String str) throws RemoteCodeException {
        try {
            return (ApiResp) this.json.fromJson(str, this.type);
        } catch (JsonParseException e10) {
            throw new RemoteCodeException(ErrorCode.JSON_PARSE_FAIL, e10);
        } catch (ClassCastException e11) {
            throw new RemoteCodeException(ErrorCode.CLASS_CAST_FAIL, e11);
        } catch (IllegalArgumentException e12) {
            throw new RemoteCodeException(ErrorCode.ARGUMENT_SERIAL_FAIL, e12);
        }
    }

    private final AbstractC8905e0 reBuildResponse(ApiResp<JsonElement> apiResp) throws RemoteCodeException {
        if (apiResp.getCode() != 0) {
            throw new RemoteCodeException(new ErrorCodeInfo(apiResp.getCode(), "请求失败", null, apiResp.getMsg(), 4, null));
        }
        if (apiResp.getResult() == null) {
            AbstractC8905e0.b bVar = AbstractC8905e0.Companion;
            String json = this.json.toJson("");
            AbstractC9133u.m16132f(json, "toJson(...)");
            return bVar.m15170e(json, C8927y.f16815e.m15342a(CONTENT_TYPE_JSON));
        }
        JsonElement result = apiResp.getResult();
        AbstractC9133u.m16130d(result);
        if (!result.isJsonPrimitive()) {
            String json2 = this.json.toJson(apiResp.getResult());
            AbstractC8905e0.b bVar2 = AbstractC8905e0.Companion;
            AbstractC9133u.m16130d(json2);
            return bVar2.m15170e(json2, C8927y.f16815e.m15342a(CONTENT_TYPE_JSON));
        }
        AbstractC8905e0.b bVar3 = AbstractC8905e0.Companion;
        JsonElement result2 = apiResp.getResult();
        AbstractC9133u.m16130d(result2);
        String asString = result2.getAsString();
        AbstractC9133u.m16132f(asString, "getAsString(...)");
        return bVar3.m15170e(asString, C8927y.f16815e.m15342a(CONTENT_TYPE_JSON));
    }

    private final C8903d0 refreshTokenAndContinueRequest(InterfaceC8926x.a aVar) {
        C8899b0.a aVarM15049i = aVar.mo15332a().m15049i();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f17473a = "";
        AbstractC8836g.m14852b(null, new C77391(ref$ObjectRef, this, aVar, null), 1, null);
        if (AbstractC8661c0.m13993h0((CharSequence) ref$ObjectRef.f17473a)) {
            return null;
        }
        aVarM15049i.m15067o(HttpHeaders.AUTHORIZATION, "Bearer " + ref$ObjectRef.f17473a);
        return aVar.mo15333b(aVarM15049i.m15055b());
    }

    public final AbstractC8756a getRefreshRepository() {
        return this.refreshRepository;
    }

    public final InterfaceC9270g getUnauthorizedFlow() {
        return this.unauthorizedFlow;
    }

    @Override // p136i9.InterfaceC8926x
    public C8903d0 intercept(InterfaceC8926x.a chain) throws RemoteCodeException {
        AbstractC9133u.m16133g(chain, "chain");
        C8903d0 c8903d0Mo15333b = chain.mo15333b(chain.mo15332a());
        if (c8903d0Mo15333b.m15128f() == 401) {
            c8903d0Mo15333b.close();
            c8903d0Mo15333b = refreshTokenAndContinueRequest(chain);
            if (c8903d0Mo15333b == null) {
                this.unauthorizedFlow.mo16670a(ErrorCode.NET_TOKEN_ERROR);
                return chain.mo15333b(chain.mo15332a());
            }
        }
        if (c8903d0Mo15333b.m15128f() == 401) {
            this.unauthorizedFlow.mo16670a(ErrorCode.NET_TOKEN_ERROR);
        }
        if (c8903d0Mo15333b.m15134m()) {
            String strValueOf = String.valueOf(c8903d0Mo15333b.m15124b().contentType());
            Locale ROOT = Locale.ROOT;
            AbstractC9133u.m16132f(ROOT, "ROOT");
            String lowerCase = strValueOf.toLowerCase(ROOT);
            AbstractC9133u.m16132f(lowerCase, "toLowerCase(...)");
            if (AbstractC8661c0.m13973S(lowerCase, CONTENT_TYPE_JSON, false, 2, null)) {
                ApiResp<JsonElement> json = parseJson(c8903d0Mo15333b.m15124b().string());
                if (json == null) {
                    throw new RemoteCodeException(ErrorCode.NET_RESPONSE_NULL);
                }
                return c8903d0Mo15333b.m15137p().m15144b(reBuildResponse(json)).m15145c();
            }
        }
        return c8903d0Mo15333b;
    }

    public final void setRefreshRepository(AbstractC8756a abstractC8756a) {
        AbstractC9133u.m16133g(abstractC8756a, "<set-?>");
        this.refreshRepository = abstractC8756a;
    }

    public final void setUnauthorizedFlow(InterfaceC9270g interfaceC9270g) {
        AbstractC9133u.m16133g(interfaceC9270g, "<set-?>");
        this.unauthorizedFlow = interfaceC9270g;
    }
}
