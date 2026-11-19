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
@DebugMetadata(m5191c = "com.zykj.http.interceptor.NetWorkResponseWithRefreshTokenInterceptor$refreshTokenAndContinueRequest$1$1$1", m5192f = "NetWorkResponseWithRefreshTokenInterceptor.kt", m5193i = {}, m5194l = {72}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
/* renamed from: com.zykj.http.interceptor.NetWorkResponseWithRefreshTokenInterceptor$refreshTokenAndContinueRequest$1$1$1 */
/* loaded from: classes2.dex */
public final class C3658xf8ba81e8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f4130a;

    /* renamed from: b */
    public int f4131b;

    /* renamed from: c */
    public final /* synthetic */ Ref.ObjectRef f4132c;

    /* renamed from: d */
    public final /* synthetic */ NetWorkResponseWithRefreshTokenInterceptor f4133d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3658xf8ba81e8(Ref.ObjectRef objectRef, NetWorkResponseWithRefreshTokenInterceptor netWorkResponseWithRefreshTokenInterceptor, Continuation continuation) {
        super(2, continuation);
        this.f4132c = objectRef;
        this.f4133d = netWorkResponseWithRefreshTokenInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3658xf8ba81e8(this.f4132c, this.f4133d, continuation);
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
        int i4 = this.f4131b;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = this.f4132c;
            AbstractC4494a refreshRepository = this.f4133d.getRefreshRepository();
            this.f4130a = objectRef2;
            this.f4131b = 1;
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
            objectRef = (Ref.ObjectRef) this.f4130a;
            ResultKt.throwOnFailure(obj);
            t3 = obj;
        }
        objectRef.element = t3;
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((C3658xf8ba81e8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
