package com.zykj.http.interceptor;

import androidx.annotation.Keep;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.zykj.http.annotation.UnauthorizedFlow;
import com.zykj.lib.error.code.ErrorCode;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import p058f5.C6358b0;
import p058f5.C6362d0;
import p058f5.InterfaceC6385x;
import p135q3.AbstractC7624a;

@Keep
@Metadata(m7879d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR.\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\f\u0010\r\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m7880d2 = {"Lcom/zykj/http/interceptor/RefreshTokenInterceptor;", "Lf5/x;", "<init>", "()V", "Lf5/x$a;", "chain", "Lf5/d0;", "refreshTokenAndContinueRequest", "(Lf5/x$a;)Lf5/d0;", "intercept", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/zykj/lib/error/code/ErrorCode;", "unauthorizedFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getUnauthorizedFlow", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "setUnauthorizedFlow", "(Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "getUnauthorizedFlow$annotations", "Lq3/a;", "refreshRepository", "Lq3/a;", "getRefreshRepository", "()Lq3/a;", "setRefreshRepository", "(Lq3/a;)V", "http_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class RefreshTokenInterceptor implements InterfaceC6385x {

    @Inject
    public AbstractC7624a refreshRepository;

    @Inject
    public MutableSharedFlow<ErrorCode> unauthorizedFlow;

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.http.interceptor.RefreshTokenInterceptor$refreshTokenAndContinueRequest$1", m7918f = "RefreshTokenInterceptor.kt", m7919i = {}, m7920l = {58}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.http.interceptor.RefreshTokenInterceptor$refreshTokenAndContinueRequest$1 */
    public static final class C60401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public Object f5952a;

        /* renamed from: b */
        public int f5953b;

        /* renamed from: c */
        public final /* synthetic */ Ref.ObjectRef f5954c;

        /* renamed from: d */
        public final /* synthetic */ RefreshTokenInterceptor f5955d;

        /* renamed from: e */
        public final /* synthetic */ InterfaceC6385x.a f5956e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C60401(Ref.ObjectRef objectRef, RefreshTokenInterceptor refreshTokenInterceptor, InterfaceC6385x.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f5954c = objectRef;
            this.f5955d = refreshTokenInterceptor;
            this.f5956e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C60401(this.f5954c, this.f5955d, this.f5956e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String strRemovePrefix;
            Ref.ObjectRef objectRef;
            T t6;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f5953b;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef objectRef2 = this.f5954c;
                AbstractC7624a refreshRepository = this.f5955d.getRefreshRepository();
                String strM6581e = this.f5956e.mo6871a().m6581e(HttpHeaders.AUTHORIZATION);
                if (strM6581e == null || (strRemovePrefix = StringsKt.removePrefix(strM6581e, (CharSequence) "Bearer ")) == null) {
                    strRemovePrefix = "";
                }
                this.f5952a = objectRef2;
                this.f5953b = 1;
                Object objMo5430a = refreshRepository.mo5430a(strRemovePrefix, this);
                if (objMo5430a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
                t6 = objMo5430a;
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.f5952a;
                ResultKt.throwOnFailure(obj);
                t6 = obj;
            }
            objectRef.element = t6;
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C60401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Inject
    public RefreshTokenInterceptor() {
    }

    @UnauthorizedFlow
    public static /* synthetic */ void getUnauthorizedFlow$annotations() {
    }

    private final C6362d0 refreshTokenAndContinueRequest(InterfaceC6385x.a chain) {
        C6358b0.a aVarM6585i = chain.mo6871a().m6585i();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        BuildersKt__BuildersKt.runBlocking$default(null, new C60401(objectRef, this, chain, null), 1, null);
        if (StringsKt.isBlank((CharSequence) objectRef.element)) {
            return null;
        }
        aVarM6585i.m6603o(HttpHeaders.AUTHORIZATION, "Bearer " + objectRef.element);
        return chain.mo6872b(aVarM6585i.m6591b());
    }

    public final AbstractC7624a getRefreshRepository() {
        AbstractC7624a abstractC7624a = this.refreshRepository;
        if (abstractC7624a != null) {
            return abstractC7624a;
        }
        Intrinsics.throwUninitializedPropertyAccessException("refreshRepository");
        return null;
    }

    public final MutableSharedFlow<ErrorCode> getUnauthorizedFlow() {
        MutableSharedFlow<ErrorCode> mutableSharedFlow = this.unauthorizedFlow;
        if (mutableSharedFlow != null) {
            return mutableSharedFlow;
        }
        Intrinsics.throwUninitializedPropertyAccessException("unauthorizedFlow");
        return null;
    }

    @Override // p058f5.InterfaceC6385x
    public C6362d0 intercept(InterfaceC6385x.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C6362d0 c6362d0Mo6872b = chain.mo6872b(chain.mo6871a());
        if (c6362d0Mo6872b.m6665j() != 401) {
            return c6362d0Mo6872b;
        }
        c6362d0Mo6872b.close();
        C6362d0 c6362d0RefreshTokenAndContinueRequest = refreshTokenAndContinueRequest(chain);
        if (c6362d0RefreshTokenAndContinueRequest == null) {
            return chain.mo6872b(chain.mo6871a());
        }
        if (c6362d0RefreshTokenAndContinueRequest.m6665j() == 401) {
            BuildersKt__BuildersKt.runBlocking$default(null, new RefreshTokenInterceptor$intercept$1$1(this, null), 1, null);
        }
        return c6362d0RefreshTokenAndContinueRequest;
    }

    public final void setRefreshRepository(AbstractC7624a abstractC7624a) {
        Intrinsics.checkNotNullParameter(abstractC7624a, "<set-?>");
        this.refreshRepository = abstractC7624a;
    }

    public final void setUnauthorizedFlow(MutableSharedFlow<ErrorCode> mutableSharedFlow) {
        Intrinsics.checkNotNullParameter(mutableSharedFlow, "<set-?>");
        this.unauthorizedFlow = mutableSharedFlow;
    }
}
