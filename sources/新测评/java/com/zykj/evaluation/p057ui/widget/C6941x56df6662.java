package com.zykj.evaluation.p057ui.widget;

import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0003H\n"}, m13558d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.widget.AnswerSheetCorrectView$rebuildPageQuestionAnswerData$3$1$bitmap$1", m13596f = "AnswerSheetCorrectView.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* renamed from: com.zykj.evaluation.ui.widget.AnswerSheetCorrectView$rebuildPageQuestionAnswerData$3$1$bitmap$1 */
/* loaded from: classes4.dex */
public final class C6941x56df6662 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {

    /* renamed from: a */
    public int f10248a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f10249b;

    /* renamed from: c */
    public final /* synthetic */ Rect f10250c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6941x56df6662(Bitmap bitmap, Rect rect, Continuation continuation) {
        super(2, continuation);
        this.f10249b = bitmap;
        this.f10250c = rect;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C6941x56df6662(this.f10249b, this.f10250c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f10248a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Bitmap bitmap = this.f10249b;
        Rect rect = this.f10250c;
        return Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), this.f10250c.height());
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((C6941x56df6662) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
