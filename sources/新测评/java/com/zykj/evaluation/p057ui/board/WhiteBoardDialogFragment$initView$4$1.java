package com.zykj.evaluation.p057ui.board;

// RE note 本类字节码直接引用的读写或显示接口包括位图。

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.blankj.utilcode.util.ToastUtils;
import com.zykj.view.board.evaluation.BlackboardEvaluationFragment;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.board.WhiteBoardDialogFragment$initView$4$1", m13596f = "WhiteBoardDialogFragment.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nWhiteBoardDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhiteBoardDialogFragment.kt\ncom/zykj/evaluation/ui/board/WhiteBoardDialogFragment$initView$4$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1#2:208\n*E\n"})
/* loaded from: classes4.dex */
public final class WhiteBoardDialogFragment$initView$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9057a;

    /* renamed from: b */
    public final /* synthetic */ WhiteBoardDialogFragment f9058b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhiteBoardDialogFragment$initView$4$1(WhiteBoardDialogFragment whiteBoardDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.f9058b = whiteBoardDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WhiteBoardDialogFragment$initView$4$1(this.f9058b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String absolutePath;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f9057a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        WhiteBoardDialogFragment whiteBoardDialogFragment = this.f9058b;
        File fileM9204s = whiteBoardDialogFragment.m9204s(whiteBoardDialogFragment.stemSketchPath);
        BlackboardEvaluationFragment blackboardEvaluationFragment = null;
        Bitmap bitmapDecodeFile = (fileM9204s == null || (absolutePath = fileM9204s.getAbsolutePath()) == null) ? null : BitmapFactory.decodeFile(absolutePath);
        if (bitmapDecodeFile == null) {
            ToastUtils.showShort("导入失败", new Object[0]);
            return Unit.INSTANCE;
        }
        BlackboardEvaluationFragment blackboardEvaluationFragment2 = this.f9058b.sketch;
        if (blackboardEvaluationFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sketch");
        } else {
            blackboardEvaluationFragment = blackboardEvaluationFragment2;
        }
        blackboardEvaluationFragment.m11169U(bitmapDecodeFile);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((WhiteBoardDialogFragment$initView$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
