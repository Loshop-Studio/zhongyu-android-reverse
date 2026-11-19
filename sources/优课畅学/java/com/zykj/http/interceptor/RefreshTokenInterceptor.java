package com.zykj.http.interceptor;

import androidx.annotation.Keep;
import androidx.databinding.library.baseAdapters.C3721BR;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.zykj.http.annotation.UnauthorizedFlow;
import javax.inject.Inject;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p130i3.AbstractC8756a;
import p135i8.AbstractC8836g;
import p135i8.InterfaceC8822b0;
import p136i9.C8899b0;
import p136i9.C8903d0;
import p136i9.InterfaceC8926x;
import p169l8.InterfaceC9270g;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@Keep
/* loaded from: classes4.dex */
public final class RefreshTokenInterceptor implements InterfaceC8926x {

    @Inject
    public AbstractC8756a refreshRepository;

    @Inject
    public InterfaceC9270g unauthorizedFlow;

    @InterfaceC9539d(m17800c = "com.zykj.http.interceptor.RefreshTokenInterceptor$refreshTokenAndContinueRequest$1", m17801f = "RefreshTokenInterceptor.kt", m17802l = {C3721BR.versionViewModel}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.http.interceptor.RefreshTokenInterceptor$refreshTokenAndContinueRequest$1 */
    public static final class C73001 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public Object f9712a;

        /* renamed from: b */
        public int f9713b;

        /* renamed from: c */
        public final /* synthetic */ Ref$ObjectRef f9714c;

        /* renamed from: d */
        public final /* synthetic */ RefreshTokenInterceptor f9715d;

        /* renamed from: e */
        public final /* synthetic */ InterfaceC8926x.a f9716e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C73001(Ref$ObjectRef ref$ObjectRef, RefreshTokenInterceptor refreshTokenInterceptor, InterfaceC8926x.a aVar, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f9714c = ref$ObjectRef;
            this.f9715d = refreshTokenInterceptor;
            this.f9716e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C73001(this.f9714c, this.f9715d, this.f9716e, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C73001) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strM14010y0;
            Ref$ObjectRef ref$ObjectRef;
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f9713b;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                Ref$ObjectRef ref$ObjectRef2 = this.f9714c;
                AbstractC8756a refreshRepository = this.f9715d.getRefreshRepository();
                String strM15045e = this.f9716e.mo15332a().m15045e(HttpHeaders.AUTHORIZATION);
                if (strM15045e == null || (strM14010y0 = AbstractC8661c0.m14010y0(strM15045e, "Bearer ")) == null) {
                    strM14010y0 = "";
                }
                this.f9712a = ref$ObjectRef2;
                this.f9713b = 1;
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
                ref$ObjectRef = (Ref$ObjectRef) this.f9712a;
                AbstractC9079b.m15926b(obj);
            }
            ref$ObjectRef.f17473a = obj;
            return C8736p.f16368a;
        }
    }

    @Inject
    public RefreshTokenInterceptor() {
    }

    @UnauthorizedFlow
    public static /* synthetic */ void getUnauthorizedFlow$annotations() {
    }

    private final C8903d0 refreshTokenAndContinueRequest(InterfaceC8926x.a aVar) {
        C8899b0.a aVarM15049i = aVar.mo15332a().m15049i();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f17473a = "";
        AbstractC8836g.m14852b(null, new C73001(ref$ObjectRef, this, aVar, null), 1, null);
        if (AbstractC8661c0.m13993h0((CharSequence) ref$ObjectRef.f17473a)) {
            return null;
        }
        aVarM15049i.m15067o(HttpHeaders.AUTHORIZATION, "Bearer " + ref$ObjectRef.f17473a);
        return aVar.mo15333b(aVarM15049i.m15055b());
    }

    public final AbstractC8756a getRefreshRepository() {
        AbstractC8756a abstractC8756a = this.refreshRepository;
        if (abstractC8756a != null) {
            return abstractC8756a;
        }
        AbstractC9133u.m16151y("refreshRepository");
        return null;
    }

    public final InterfaceC9270g getUnauthorizedFlow() {
        InterfaceC9270g interfaceC9270g = this.unauthorizedFlow;
        if (interfaceC9270g != null) {
            return interfaceC9270g;
        }
        AbstractC9133u.m16151y("unauthorizedFlow");
        return null;
    }

    @Override // p136i9.InterfaceC8926x
    public C8903d0 intercept(InterfaceC8926x.a chain) {
        AbstractC9133u.m16133g(chain, "chain");
        C8903d0 c8903d0Mo15333b = chain.mo15333b(chain.mo15332a());
        if (c8903d0Mo15333b.m15128f() != 401) {
            return c8903d0Mo15333b;
        }
        c8903d0Mo15333b.close();
        C8903d0 c8903d0RefreshTokenAndContinueRequest = refreshTokenAndContinueRequest(chain);
        if (c8903d0RefreshTokenAndContinueRequest == null) {
            return chain.mo15333b(chain.mo15332a());
        }
        if (c8903d0RefreshTokenAndContinueRequest.m15128f() == 401) {
            AbstractC8836g.m14852b(null, new RefreshTokenInterceptor$intercept$1$1(this, null), 1, null);
        }
        return c8903d0RefreshTokenAndContinueRequest;
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
