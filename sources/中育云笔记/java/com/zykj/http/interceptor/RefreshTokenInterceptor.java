package com.zykj.http.interceptor;

import androidx.annotation.Keep;
import com.alibaba.fastjson.asm.Opcodes;
import com.zykj.http.annotation.UnauthorizedFlow;
import je.C9743w;
import je.C9745y;
import je.InterfaceC9739s;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p012ab.AbstractC0101a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p310qd.AbstractC10793c0;
import p379vd.InterfaceC11602k;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11113g;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@Keep
/* loaded from: classes6.dex */
public final class RefreshTokenInterceptor implements InterfaceC9739s {
    public AbstractC0101a refreshRepository;
    public InterfaceC11602k unauthorizedFlow;

    @InterfaceC11829d(m26210c = "com.zykj.http.interceptor.RefreshTokenInterceptor$refreshTokenAndContinueRequest$1", m26211f = "RefreshTokenInterceptor.kt", m26212l = {Opcodes.ASTORE}, m26213m = "invokeSuspend")
    /* renamed from: com.zykj.http.interceptor.RefreshTokenInterceptor$refreshTokenAndContinueRequest$1 */
    public static final class C85801 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public Object f19697c;

        /* renamed from: d */
        public int f19698d;

        /* renamed from: e */
        public final /* synthetic */ Ref$ObjectRef f19699e;

        /* renamed from: f */
        public final /* synthetic */ RefreshTokenInterceptor f19700f;

        /* renamed from: g */
        public final /* synthetic */ InterfaceC9739s.a f19701g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C85801(Ref$ObjectRef ref$ObjectRef, RefreshTokenInterceptor refreshTokenInterceptor, InterfaceC9739s.a aVar, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f19699e = ref$ObjectRef;
            this.f19700f = refreshTokenInterceptor;
            this.f19701g = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C85801(this.f19699e, this.f19700f, this.f19701g, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strM23149y0;
            Ref$ObjectRef ref$ObjectRef;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f19698d;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                Ref$ObjectRef ref$ObjectRef2 = this.f19699e;
                AbstractC0101a refreshRepository = this.f19700f.getRefreshRepository();
                String strM19586d = this.f19701g.request().m19586d("Authorization");
                if (strM19586d == null || (strM23149y0 = AbstractC10793c0.m23149y0(strM19586d, "Bearer ")) == null) {
                    strM23149y0 = "";
                }
                this.f19697c = ref$ObjectRef2;
                this.f19698d = 1;
                Object objMo273a = refreshRepository.mo273a(strM23149y0, this);
                if (objMo273a == objM25952f) {
                    return objM25952f;
                }
                ref$ObjectRef = ref$ObjectRef2;
                obj = objMo273a;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$ObjectRef = (Ref$ObjectRef) this.f19697c;
                AbstractC9924b.m20071b(obj);
            }
            ref$ObjectRef.f23402c = obj;
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C85801) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @UnauthorizedFlow
    public static /* synthetic */ void getUnauthorizedFlow$annotations() {
    }

    private final C9745y refreshTokenAndContinueRequest(InterfaceC9739s.a aVar) {
        C9743w.a aVarM19590h = aVar.request().m19590h();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f23402c = "";
        AbstractC11113g.m24717b(null, new C85801(ref$ObjectRef, this, aVar, null), 1, null);
        if (AbstractC10793c0.m23132h0((CharSequence) ref$ObjectRef.f23402c)) {
            return null;
        }
        aVarM19590h.m19600h("Authorization", "Bearer " + ref$ObjectRef.f23402c);
        return aVar.mo19477a(aVarM19590h.m19595b());
    }

    public final AbstractC0101a getRefreshRepository() {
        AbstractC0101a abstractC0101a = this.refreshRepository;
        if (abstractC0101a != null) {
            return abstractC0101a;
        }
        AbstractC9979u.m20312y("refreshRepository");
        return null;
    }

    public final InterfaceC11602k getUnauthorizedFlow() {
        InterfaceC11602k interfaceC11602k = this.unauthorizedFlow;
        if (interfaceC11602k != null) {
            return interfaceC11602k;
        }
        AbstractC9979u.m20312y("unauthorizedFlow");
        return null;
    }

    @Override // je.InterfaceC9739s
    public C9745y intercept(InterfaceC9739s.a chain) {
        AbstractC9979u.m20294g(chain, "chain");
        C9745y c9745yMo19477a = chain.mo19477a(chain.request());
        if (c9745yMo19477a.m19632j() != 401) {
            return c9745yMo19477a;
        }
        c9745yMo19477a.close();
        C9745y c9745yRefreshTokenAndContinueRequest = refreshTokenAndContinueRequest(chain);
        if (c9745yRefreshTokenAndContinueRequest == null) {
            return chain.mo19477a(chain.request());
        }
        if (c9745yRefreshTokenAndContinueRequest.m19632j() == 401) {
            AbstractC11113g.m24717b(null, new RefreshTokenInterceptor$intercept$1$1(this, null), 1, null);
        }
        return c9745yRefreshTokenAndContinueRequest;
    }

    public final void setRefreshRepository(AbstractC0101a abstractC0101a) {
        AbstractC9979u.m20294g(abstractC0101a, "<set-?>");
        this.refreshRepository = abstractC0101a;
    }

    public final void setUnauthorizedFlow(InterfaceC11602k interfaceC11602k) {
        AbstractC9979u.m20294g(interfaceC11602k, "<set-?>");
        this.unauthorizedFlow = interfaceC11602k;
    }
}
