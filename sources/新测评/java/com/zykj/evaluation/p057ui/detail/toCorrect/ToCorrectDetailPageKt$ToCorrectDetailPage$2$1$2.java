package com.zykj.evaluation.p057ui.detail.toCorrect;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@Metadata(m13557d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m13558d2 = {"<anonymous>", "Landroid/graphics/Bitmap;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.toCorrect.ToCorrectDetailPageKt$ToCorrectDetailPage$2$1$2", m13596f = "ToCorrectDetailPage.kt", m13597i = {}, m13598l = {79}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class ToCorrectDetailPageKt$ToCorrectDetailPage$2$1$2 extends SuspendLambda implements Function1<Continuation<? super Bitmap>, Object> {

    /* renamed from: a */
    public int f9359a;

    /* renamed from: b */
    public final /* synthetic */ ToCorrectDetailViewModel f9360b;

    /* renamed from: c */
    public final /* synthetic */ String f9361c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToCorrectDetailPageKt$ToCorrectDetailPage$2$1$2(ToCorrectDetailViewModel toCorrectDetailViewModel, String str, Continuation continuation) {
        super(1, continuation);
        this.f9360b = toCorrectDetailViewModel;
        this.f9361c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ToCorrectDetailPageKt$ToCorrectDetailPage$2$1$2(this.f9360b, this.f9361c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Bitmap> continuation) {
        return invoke2((Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9359a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        ToCorrectDetailViewModel toCorrectDetailViewModel = this.f9360b;
        String str = this.f9361c;
        this.f9359a = 1;
        Object objM9663P0 = toCorrectDetailViewModel.m9663P0(str, this);
        return objM9663P0 == coroutine_suspended ? coroutine_suspended : objM9663P0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation continuation) {
        return ((ToCorrectDetailPageKt$ToCorrectDetailPage$2$1$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
