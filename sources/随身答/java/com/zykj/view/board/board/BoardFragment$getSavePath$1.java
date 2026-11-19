package com.zykj.view.board.board;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", ""}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$getSavePath$1", m13451f = "BoardFragment.kt", m13452i = {0, 1}, m13453l = {977, 980}, m13454m = "invokeSuspend", m13455n = {"it", "it"}, m13456s = {"L$0", "L$0"})
/* loaded from: classes5.dex */
public final class BoardFragment$getSavePath$1 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f12034a;

    /* renamed from: b */
    public /* synthetic */ Object f12035b;

    /* renamed from: c */
    public final /* synthetic */ Function2 f12036c;

    /* renamed from: d */
    public final /* synthetic */ Function2 f12037d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardFragment$getSavePath$1(Function2 function2, Function2 function22, Continuation continuation) {
        super(2, continuation);
        this.f12036c = function2;
        this.f12037d = function22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BoardFragment$getSavePath$1 boardFragment$getSavePath$1 = new BoardFragment$getSavePath$1(this.f12036c, this.f12037d, continuation);
        boardFragment$getSavePath$1.f12035b = obj;
        return boardFragment$getSavePath$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Throwable th, Continuation<? super Unit> continuation) {
        return invoke2(th, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r6.invoke(null, r5) == r1) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f12035b
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r5.f12034a
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L22
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L16
            kotlin.ResultKt.throwOnFailure(r6)
            goto L52
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1e:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L40
        L22:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.jvm.functions.Function2 r6 = r5.f12036c
            if (r6 == 0) goto L34
            r5.f12035b = r0
            r5.f12034a = r4
            java.lang.Object r6 = r6.invoke(r0, r5)
            if (r6 != r1) goto L40
            goto L51
        L34:
            java.lang.String r6 = r0.getMessage()
            if (r6 == 0) goto L40
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.blankj.utilcode.util.ToastUtils.showShort(r6, r2)
        L40:
            kotlin.jvm.functions.Function2 r6 = r5.f12037d
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r5.f12035b = r0
            r5.f12034a = r3
            r0 = 0
            java.lang.Object r6 = r6.invoke(r0, r5)
            if (r6 != r1) goto L52
        L51:
            return r1
        L52:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.board.board.BoardFragment$getSavePath$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/view/board/board/BoardFragment$getSavePath$1.smali:152
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Throwable th, Continuation continuation) {
        return ((BoardFragment$getSavePath$1) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
