package com.zykj.http.interceptor;

import androidx.annotation.Keep;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.zykj.http.annotation.UnauthorizedFlow;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
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
import p011a9.C0060w;
import p011a9.C0062y;
import p011a9.InterfaceC0056s;
import p134j7.AbstractC7814a;

@Keep
@Metadata(m13557d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR.\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\f\u0010\r\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m13558d2 = {"Lcom/zykj/http/interceptor/RefreshTokenInterceptor;", "La9/s;", "<init>", "()V", "La9/s$a;", "chain", "La9/y;", "refreshTokenAndContinueRequest", "(La9/s$a;)La9/y;", "intercept", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/zykj/lib/error/code/ErrorCode;", "unauthorizedFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getUnauthorizedFlow", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "setUnauthorizedFlow", "(Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "getUnauthorizedFlow$annotations", "Lj7/a;", "refreshRepository", "Lj7/a;", "getRefreshRepository", "()Lj7/a;", "setRefreshRepository", "(Lj7/a;)V", "http_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class RefreshTokenInterceptor implements InterfaceC0056s {
    public AbstractC7814a refreshRepository;
    public MutableSharedFlow<ErrorCode> unauthorizedFlow;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.http.interceptor.RefreshTokenInterceptor$refreshTokenAndContinueRequest$1", m13596f = "RefreshTokenInterceptor.kt", m13597i = {}, m13598l = {58}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: com.zykj.http.interceptor.RefreshTokenInterceptor$refreshTokenAndContinueRequest$1 */
    public static final class C69601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public Object f10555a;

        /* renamed from: b */
        public int f10556b;

        /* renamed from: c */
        public final /* synthetic */ Ref.ObjectRef f10557c;

        /* renamed from: d */
        public final /* synthetic */ RefreshTokenInterceptor f10558d;

        /* renamed from: e */
        public final /* synthetic */ InterfaceC0056s.a f10559e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C69601(Ref.ObjectRef objectRef, RefreshTokenInterceptor refreshTokenInterceptor, InterfaceC0056s.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f10557c = objectRef;
            this.f10558d = refreshTokenInterceptor;
            this.f10559e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C69601(this.f10557c, this.f10558d, this.f10559e, continuation);
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
            T t10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f10556b;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef objectRef2 = this.f10557c;
                AbstractC7814a refreshRepository = this.f10558d.getRefreshRepository();
                String strM375d = this.f10559e.mo268a().m375d(HttpHeaders.AUTHORIZATION);
                if (strM375d == null || (strRemovePrefix = StringsKt.removePrefix(strM375d, (CharSequence) "Bearer ")) == null) {
                    strRemovePrefix = "";
                }
                this.f10555a = objectRef2;
                this.f10556b = 1;
                Object objMo8774a = refreshRepository.mo8774a(strRemovePrefix, this);
                if (objMo8774a == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
                t10 = objMo8774a;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.f10555a;
                ResultKt.throwOnFailure(obj);
                t10 = obj;
            }
            objectRef.element = t10;
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C69601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @UnauthorizedFlow
    public static /* synthetic */ void getUnauthorizedFlow$annotations() {
    }

    private final C0062y refreshTokenAndContinueRequest(InterfaceC0056s.a chain) throws InterruptedException {
        C0060w.a aVarM379h = chain.mo268a().m379h();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        BuildersKt__BuildersKt.runBlocking$default(null, new C69601(objectRef, this, chain, null), 1, null);
        if (StringsKt.isBlank((CharSequence) objectRef.element)) {
            return null;
        }
        aVarM379h.m389h(HttpHeaders.AUTHORIZATION, "Bearer " + objectRef.element);
        return chain.mo269b(aVarM379h.m384b());
    }

    public final AbstractC7814a getRefreshRepository() {
        AbstractC7814a abstractC7814a = this.refreshRepository;
        if (abstractC7814a != null) {
            return abstractC7814a;
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

    @Override // p011a9.InterfaceC0056s
    public C0062y intercept(InterfaceC0056s.a chain) throws InterruptedException, RemoteCodeException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C0062y c0062yMo269b = chain.mo269b(chain.mo268a());
        if (c0062yMo269b.m418i() != 401) {
            return c0062yMo269b;
        }
        c0062yMo269b.close();
        C0062y c0062yRefreshTokenAndContinueRequest = refreshTokenAndContinueRequest(chain);
        if (c0062yRefreshTokenAndContinueRequest == null) {
            return chain.mo269b(chain.mo268a());
        }
        if (c0062yRefreshTokenAndContinueRequest.m418i() == 401) {
            BuildersKt__BuildersKt.runBlocking$default(null, new RefreshTokenInterceptor$intercept$1$1(this, null), 1, null);
        }
        return c0062yRefreshTokenAndContinueRequest;
    }

    public final void setRefreshRepository(AbstractC7814a abstractC7814a) {
        Intrinsics.checkNotNullParameter(abstractC7814a, "<set-?>");
        this.refreshRepository = abstractC7814a;
    }

    public final void setUnauthorizedFlow(MutableSharedFlow<ErrorCode> mutableSharedFlow) {
        Intrinsics.checkNotNullParameter(mutableSharedFlow, "<set-?>");
        this.unauthorizedFlow = mutableSharedFlow;
    }
}
