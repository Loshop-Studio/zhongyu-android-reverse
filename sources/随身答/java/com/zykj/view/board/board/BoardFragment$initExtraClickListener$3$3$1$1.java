package com.zykj.view.board.board;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.databinding.ViewItemSketchRecordAudioBinding;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", ""}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initExtraClickListener$3$3$1$1", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class BoardFragment$initExtraClickListener$3$3$1$1 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f12038a;

    /* renamed from: b */
    public final /* synthetic */ Function1 f12039b;

    /* renamed from: c */
    public final /* synthetic */ ViewItemSketchRecordAudioBinding f12040c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardFragment$initExtraClickListener$3$3$1$1(Function1 function1, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, Continuation continuation) {
        super(2, continuation);
        this.f12039b = function1;
        this.f12040c = viewItemSketchRecordAudioBinding;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BoardFragment$initExtraClickListener$3$3$1$1(this.f12039b, this.f12040c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Throwable th, Continuation<? super Unit> continuation) {
        return invoke2(th, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f12038a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.f12039b.invoke(null);
        this.f12040c.f12792c.setEnabled(true);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Throwable th, Continuation continuation) {
        return ((BoardFragment$initExtraClickListener$3$3$1$1) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
