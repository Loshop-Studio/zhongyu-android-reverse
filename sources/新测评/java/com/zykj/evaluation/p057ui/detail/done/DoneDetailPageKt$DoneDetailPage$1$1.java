package com.zykj.evaluation.p057ui.detail.done;

import com.zykj.evaluation.p057ui.guide.normal.done.DoneGuideViewModel;
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
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.done.DoneDetailPageKt$DoneDetailPage$1$1", m13596f = "DoneDetailPage.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class DoneDetailPageKt$DoneDetailPage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9247a;

    /* renamed from: b */
    public final /* synthetic */ DoneGuideViewModel f9248b;

    /* renamed from: c */
    public final /* synthetic */ boolean f9249c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoneDetailPageKt$DoneDetailPage$1$1(DoneGuideViewModel doneGuideViewModel, boolean z9, Continuation continuation) {
        super(2, continuation);
        this.f9248b = doneGuideViewModel;
        this.f9249c = z9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DoneDetailPageKt$DoneDetailPage$1$1(this.f9248b, this.f9249c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f9247a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.f9248b.m9875Z(this.f9249c);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DoneDetailPageKt$DoneDetailPage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
