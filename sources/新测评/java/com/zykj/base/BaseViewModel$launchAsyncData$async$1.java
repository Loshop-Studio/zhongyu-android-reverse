package com.zykj.base;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(m13557d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.base.BaseViewModel$launchAsyncData$async$1", m13596f = "BaseViewModel.kt", m13597i = {0}, m13598l = {123}, m13599m = "invokeSuspend", m13600n = {"$this$async"}, m13601s = {"L$0"})
/* loaded from: classes4.dex */
public final class BaseViewModel$launchAsyncData$async$1<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {

    /* renamed from: a */
    public int f6881a;

    /* renamed from: b */
    public /* synthetic */ Object f6882b;

    /* renamed from: c */
    public final /* synthetic */ Function2 f6883c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$launchAsyncData$async$1(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f6883c = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseViewModel$launchAsyncData$async$1 baseViewModel$launchAsyncData$async$1 = new BaseViewModel$launchAsyncData$async$1(this.f6883c, continuation);
        baseViewModel$launchAsyncData$async$1.f6882b = obj;
        return baseViewModel$launchAsyncData$async$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.f6882b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f6881a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Function2 function2 = this.f6883c;
        this.f6882b = SpillingKt.nullOutSpilledVariable(coroutineScope);
        this.f6881a = 1;
        Object objInvoke = function2.invoke(coroutineScope, this);
        return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BaseViewModel$launchAsyncData$async$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
