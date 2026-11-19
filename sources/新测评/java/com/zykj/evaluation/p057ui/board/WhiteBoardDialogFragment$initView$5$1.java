package com.zykj.evaluation.p057ui.board;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.board.WhiteBoardDialogFragment$initView$5$1", m13596f = "WhiteBoardDialogFragment.kt", m13597i = {}, m13598l = {119}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class WhiteBoardDialogFragment$initView$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9059a;

    /* renamed from: b */
    public final /* synthetic */ WhiteBoardDialogFragment f9060b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhiteBoardDialogFragment$initView$5$1(WhiteBoardDialogFragment whiteBoardDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.f9060b = whiteBoardDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WhiteBoardDialogFragment$initView$5$1(this.f9060b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f9059a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 != r3) goto L10
            kotlin.ResultKt.throwOnFailure(r5)
            goto L2c
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            kotlin.ResultKt.throwOnFailure(r5)
            com.zykj.evaluation.ui.board.WhiteBoardDialogFragment r5 = r4.f9060b
            kotlin.jvm.functions.Function1 r5 = com.zykj.evaluation.p057ui.board.WhiteBoardDialogFragment.m9190p(r5)
            if (r5 == 0) goto L2f
            r4.f9059a = r3
            java.lang.Object r5 = r5.invoke(r4)
            if (r5 != r0) goto L2c
            return r0
        L2c:
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            goto L30
        L2f:
            r5 = r2
        L30:
            if (r5 != 0) goto L3d
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r0 = "暂无答案可导入"
            com.blankj.utilcode.util.ToastUtils.showShort(r0, r5)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L3d:
            com.zykj.evaluation.ui.board.WhiteBoardDialogFragment r0 = r4.f9060b
            com.zykj.view.board.evaluation.BlackboardEvaluationFragment r0 = com.zykj.evaluation.p057ui.board.WhiteBoardDialogFragment.m9191q(r0)
            if (r0 != 0) goto L4b
            java.lang.String r0 = "sketch"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            goto L4c
        L4b:
            r2 = r0
        L4c:
            r2.m11169U(r5)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.board.WhiteBoardDialogFragment$initView$5$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/board/WhiteBoardDialogFragment$initView$5$1.smali:131
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((WhiteBoardDialogFragment$initView$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
