package com.zykj.http.interceptor;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.taobao.sophix.PatchStatus;
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
@DebugMetadata(m13450c = "com.zykj.http.interceptor.NetWorkResponseWithRefreshTokenInterceptor$refreshTokenAndContinueRequest$1$1$1", m13451f = "NetWorkResponseWithRefreshTokenInterceptor.kt", m13452i = {}, m13453l = {PatchStatus.CODE_LOAD_AES_DECRYPT}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* renamed from: com.zykj.http.interceptor.NetWorkResponseWithRefreshTokenInterceptor$refreshTokenAndContinueRequest$1$1$1 */
/* loaded from: classes4.dex */
public final class C7193xf8ba81e8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f9995a;

    /* renamed from: b */
    public int f9996b;

    /* renamed from: c */
    public final /* synthetic */ Ref.ObjectRef f9997c;

    /* renamed from: d */
    public final /* synthetic */ NetWorkResponseWithRefreshTokenInterceptor f9998d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7193xf8ba81e8(Ref.ObjectRef objectRef, NetWorkResponseWithRefreshTokenInterceptor netWorkResponseWithRefreshTokenInterceptor, Continuation continuation) {
        super(2, continuation);
        this.f9997c = objectRef;
        this.f9998d = netWorkResponseWithRefreshTokenInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C7193xf8ba81e8(this.f9997c, this.f9998d, continuation);
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
        int i9 = this.f9996b;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = this.f9997c;
            AbstractC10002a refreshRepository = this.f9998d.getRefreshRepository();
            this.f9995a = objectRef2;
            this.f9996b = 1;
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
            objectRef = (Ref.ObjectRef) this.f9995a;
            ResultKt.throwOnFailure(obj);
            t9 = obj;
        }
        objectRef.element = t9;
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((C7193xf8ba81e8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
