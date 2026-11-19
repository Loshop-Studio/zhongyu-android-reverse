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
@Metadata(m7879d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.base.BaseViewModel$launchAsyncData$async$1", m7918f = "BaseViewModel.kt", m7919i = {0}, m7920l = {123}, m7921m = "invokeSuspend", m7922n = {"$this$async"}, m7923s = {"L$0"})
/* loaded from: classes3.dex */
public final class BaseViewModel$launchAsyncData$async$1<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {

    /* renamed from: a */
    public int f5604a;

    /* renamed from: b */
    public /* synthetic */ Object f5605b;

    /* renamed from: c */
    public final /* synthetic */ Function2 f5606c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$launchAsyncData$async$1(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f5606c = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseViewModel$launchAsyncData$async$1 baseViewModel$launchAsyncData$async$1 = new BaseViewModel$launchAsyncData$async$1(this.f5606c, continuation);
        baseViewModel$launchAsyncData$async$1.f5605b = obj;
        return baseViewModel$launchAsyncData$async$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.f5605b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f5604a;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Function2 function2 = this.f5606c;
        this.f5605b = SpillingKt.nullOutSpilledVariable(coroutineScope);
        this.f5604a = 1;
        Object objInvoke = function2.invoke(coroutineScope, this);
        return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BaseViewModel$launchAsyncData$async$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
