package com.zykj.evaluation.p057ui.sheet.preview;

import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.evaluation.p057ui.sheet.AnswerSheetViewModel;
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
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.preview.PreviewPageKt$PreviewPage$1$1", m13596f = "PreviewPage.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class PreviewPageKt$PreviewPage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10149a;

    /* renamed from: b */
    public final /* synthetic */ AnswerSheetViewModel f10150b;

    /* renamed from: c */
    public final /* synthetic */ NavController f10151c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewPageKt$PreviewPage$1$1(AnswerSheetViewModel answerSheetViewModel, NavController navController, Continuation continuation) {
        super(2, continuation);
        this.f10150b = answerSheetViewModel;
        this.f10151c = navController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PreviewPageKt$PreviewPage$1$1(this.f10150b, this.f10151c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f10149a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.f10150b.getIsFirstIn() && this.f10150b.m10183K()) {
            LogUtils.m3239i("直接前往拍照页面");
            NavController.navigate$default(this.f10151c, "ANSWER_SHEET", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        }
        this.f10150b.m10189Q();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((PreviewPageKt$PreviewPage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
