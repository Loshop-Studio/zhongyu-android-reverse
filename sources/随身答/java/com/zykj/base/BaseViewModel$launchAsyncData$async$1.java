package com.zykj.base;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(m13412d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.base.BaseViewModel$launchAsyncData$async$1", m13451f = "BaseViewModel.kt", m13452i = {}, m13453l = {160}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes4.dex */
public final class BaseViewModel$launchAsyncData$async$1<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {

    /* renamed from: a */
    public int f8122a;

    /* renamed from: b */
    public /* synthetic */ Object f8123b;

    /* renamed from: c */
    public final /* synthetic */ Function2 f8124c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$launchAsyncData$async$1(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f8124c = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseViewModel$launchAsyncData$async$1 baseViewModel$launchAsyncData$async$1 = new BaseViewModel$launchAsyncData$async$1(this.f8124c, continuation);
        baseViewModel$launchAsyncData$async$1.f8123b = obj;
        return baseViewModel$launchAsyncData$async$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f8122a;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f8123b;
        Function2 function2 = this.f8124c;
        this.f8122a = 1;
        Object objInvoke = function2.invoke(coroutineScope, this);
        return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BaseViewModel$launchAsyncData$async$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
