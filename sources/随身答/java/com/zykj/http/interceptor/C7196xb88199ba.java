package com.zykj.http.interceptor;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import p313z5.AbstractC10002a;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.http.interceptor.ResponseWithRefreshTokenInterceptor$refreshTokenAndContinueRequest$1$1$1", m13451f = "ResponseWithRefreshTokenInterceptor.kt", m13452i = {}, m13453l = {92}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* renamed from: com.zykj.http.interceptor.ResponseWithRefreshTokenInterceptor$refreshTokenAndContinueRequest$1$1$1 */
/* loaded from: classes4.dex */
public final class C7196xb88199ba extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f9999a;

    /* renamed from: b */
    public int f10000b;

    /* renamed from: c */
    public final /* synthetic */ Ref.ObjectRef f10001c;

    /* renamed from: d */
    public final /* synthetic */ ResponseWithRefreshTokenInterceptor f10002d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7196xb88199ba(Ref.ObjectRef objectRef, ResponseWithRefreshTokenInterceptor responseWithRefreshTokenInterceptor, Continuation continuation) {
        super(2, continuation);
        this.f10001c = objectRef;
        this.f10002d = responseWithRefreshTokenInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C7196xb88199ba(this.f10001c, this.f10002d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        T t9;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f10000b;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = this.f10001c;
            AbstractC10002a refreshRepository = this.f10002d.getRefreshRepository();
            this.f9999a = objectRef2;
            this.f10000b = 1;
            Object objMo9976a = refreshRepository.mo9976a(this);
            if (objMo9976a == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
            t9 = objMo9976a;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.f9999a;
            ResultKt.throwOnFailure(obj);
            t9 = obj;
        }
        objectRef.element = t9;
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((C7196xb88199ba) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
