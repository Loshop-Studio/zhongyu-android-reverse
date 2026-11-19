package com.zykj.evaluation.p057ui.detail.toCorrectSelf;

import com.zykj.evaluation.p057ui.detail.AbstractC6900e;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.toCorrectSelf.ToCorrectSelfDetailViewModel$updateCorrectResult$3", m13596f = "ToCorrectSelfDetailViewModel.kt", m13597i = {}, m13598l = {557}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class ToCorrectSelfDetailViewModel$updateCorrectResult$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9473a;

    /* renamed from: b */
    public final /* synthetic */ ToCorrectSelfDetailViewModel f9474b;

    /* renamed from: c */
    public final /* synthetic */ String f9475c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC6900e f9476d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToCorrectSelfDetailViewModel$updateCorrectResult$3(ToCorrectSelfDetailViewModel toCorrectSelfDetailViewModel, String str, AbstractC6900e abstractC6900e, Continuation continuation) {
        super(2, continuation);
        this.f9474b = toCorrectSelfDetailViewModel;
        this.f9475c = str;
        this.f9476d = abstractC6900e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ToCorrectSelfDetailViewModel$updateCorrectResult$3(this.f9474b, this.f9475c, this.f9476d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9473a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            ToCorrectSelfDetailViewModel toCorrectSelfDetailViewModel = this.f9474b;
            String str = this.f9475c;
            int iM9481b = this.f9476d.m9481b();
            this.f9473a = 1;
            if (toCorrectSelfDetailViewModel.m9713T0(str, iM9481b, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ToCorrectSelfDetailViewModel$updateCorrectResult$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
