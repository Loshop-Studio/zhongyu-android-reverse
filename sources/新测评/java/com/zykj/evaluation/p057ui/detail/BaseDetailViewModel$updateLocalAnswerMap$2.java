package com.zykj.evaluation.p057ui.detail;

import com.zykj.evaluation.utils.LocalAnswerManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p101g7.C7589e;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.BaseDetailViewModel$updateLocalAnswerMap$2", m13596f = "BaseDetailViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class BaseDetailViewModel$updateLocalAnswerMap$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9173a;

    /* renamed from: b */
    public final /* synthetic */ BaseDetailViewModel f9174b;

    /* renamed from: c */
    public final /* synthetic */ String f9175c;

    /* renamed from: d */
    public final /* synthetic */ List f9176d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDetailViewModel$updateLocalAnswerMap$2(BaseDetailViewModel baseDetailViewModel, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.f9174b = baseDetailViewModel;
        this.f9175c = str;
        this.f9176d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseDetailViewModel$updateLocalAnswerMap$2(this.f9174b, this.f9175c, this.f9176d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f9173a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.f9174b.getLocalAnswerMap().put(this.f9175c, this.f9176d);
        LocalAnswerManager.f10541a.m10526c(this.f9174b.getLocalAnswerMap(), this.f9174b.m9268K().m12467m(C7589e.f12717d.m12473a()));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BaseDetailViewModel$updateLocalAnswerMap$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
