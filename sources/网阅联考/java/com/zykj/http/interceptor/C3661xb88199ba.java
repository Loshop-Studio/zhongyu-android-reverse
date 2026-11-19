package com.zykj.http.interceptor;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import p116r1.AbstractC4494a;

@Metadata(m5174d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m5175d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 5, 1})
@DebugMetadata(m5191c = "com.zykj.http.interceptor.ResponseWithRefreshTokenInterceptor$refreshTokenAndContinueRequest$1$1$1", m5192f = "ResponseWithRefreshTokenInterceptor.kt", m5193i = {}, m5194l = {92}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
/* renamed from: com.zykj.http.interceptor.ResponseWithRefreshTokenInterceptor$refreshTokenAndContinueRequest$1$1$1 */
/* loaded from: classes2.dex */
public final class C3661xb88199ba extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f4134a;

    /* renamed from: b */
    public int f4135b;

    /* renamed from: c */
    public final /* synthetic */ Ref.ObjectRef f4136c;

    /* renamed from: d */
    public final /* synthetic */ ResponseWithRefreshTokenInterceptor f4137d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3661xb88199ba(Ref.ObjectRef objectRef, ResponseWithRefreshTokenInterceptor responseWithRefreshTokenInterceptor, Continuation continuation) {
        super(2, continuation);
        this.f4136c = objectRef;
        this.f4137d = responseWithRefreshTokenInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3661xb88199ba(this.f4136c, this.f4137d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        T t3;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.f4135b;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = this.f4136c;
            AbstractC4494a refreshRepository = this.f4137d.getRefreshRepository();
            this.f4134a = objectRef2;
            this.f4135b = 1;
            Object objMo4605a = refreshRepository.mo4605a(this);
            if (objMo4605a == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
            t3 = objMo4605a;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.f4134a;
            ResultKt.throwOnFailure(obj);
            t3 = obj;
        }
        objectRef.element = t3;
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((C3661xb88199ba) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
