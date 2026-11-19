package com.zykj.evaluation.p057ui.sheet;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import com.blankj.utilcode.util.LogUtils;
import com.google.gson.Gson;
import com.zykj.evaluation.bean.bundle.AnswerSheetBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.AnswerSheetPageKt$AnswerSheetPage$2$1", m13596f = "AnswerSheetPage.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class AnswerSheetPageKt$AnswerSheetPage$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9914a;

    /* renamed from: b */
    public final /* synthetic */ Function1 f9915b;

    /* renamed from: c */
    public final /* synthetic */ String f9916c;

    /* renamed from: d */
    public final /* synthetic */ AnswerSheetViewModel f9917d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerSheetPageKt$AnswerSheetPage$2$1(Function1 function1, String str, AnswerSheetViewModel answerSheetViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9915b = function1;
        this.f9916c = str;
        this.f9917d = answerSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnswerSheetPageKt$AnswerSheetPage$2$1(this.f9915b, this.f9916c, this.f9917d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnswerSheetBundle answerSheetBundle;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f9914a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.f9915b.invoke(Boxing.boxInt(1));
        if (StringsKt.isBlank(this.f9916c)) {
            return Unit.INSTANCE;
        }
        try {
            answerSheetBundle = (AnswerSheetBundle) new Gson().fromJson(this.f9916c, AnswerSheetBundle.class);
        } catch (Exception e10) {
            LogUtils.m3238e("AnswerSheetPage页面JSON解析失败: " + e10.getMessage() + ",原始数据: " + this.f9916c);
            answerSheetBundle = null;
        }
        if (answerSheetBundle != null) {
            this.f9917d.mo10180H(answerSheetBundle);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AnswerSheetPageKt$AnswerSheetPage$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
