package com.zykj.base;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(m5174d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m5175d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, m5176k = 3, m5177mv = {1, 5, 1})
@DebugMetadata(m5191c = "com.zykj.base.BaseViewModel$launchAsyncData$async$1", m5192f = "BaseViewModel.kt", m5193i = {}, m5194l = {160}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
/* loaded from: classes2.dex */
public final class BaseViewModel$launchAsyncData$async$1<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {

    /* renamed from: a */
    public int f4051a;

    /* renamed from: b */
    public /* synthetic */ Object f4052b;

    /* renamed from: c */
    public final /* synthetic */ Function2 f4053c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$launchAsyncData$async$1(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f4053c = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseViewModel$launchAsyncData$async$1 baseViewModel$launchAsyncData$async$1 = new BaseViewModel$launchAsyncData$async$1(this.f4053c, continuation);
        baseViewModel$launchAsyncData$async$1.f4052b = obj;
        return baseViewModel$launchAsyncData$async$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.f4051a;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f4052b;
            Function2 function2 = this.f4053c;
            this.f4051a = 1;
            obj = function2.invoke(coroutineScope, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BaseViewModel$launchAsyncData$async$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
