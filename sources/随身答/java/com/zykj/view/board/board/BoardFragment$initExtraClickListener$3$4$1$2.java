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

@Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", ""}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initExtraClickListener$3$4$1$2", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class BoardFragment$initExtraClickListener$3$4$1$2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f12048a;

    /* renamed from: b */
    public /* synthetic */ Object f12049b;

    /* renamed from: c */
    public final /* synthetic */ Function1 f12050c;

    /* renamed from: d */
    public final /* synthetic */ ViewItemSketchRecordAudioBinding f12051d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardFragment$initExtraClickListener$3$4$1$2(Function1 function1, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, Continuation continuation) {
        super(2, continuation);
        this.f12050c = function1;
        this.f12051d = viewItemSketchRecordAudioBinding;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(String str, Continuation continuation) {
        return ((BoardFragment$initExtraClickListener$3$4$1$2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BoardFragment$initExtraClickListener$3$4$1$2 boardFragment$initExtraClickListener$3$4$1$2 = new BoardFragment$initExtraClickListener$3$4$1$2(this.f12050c, this.f12051d, continuation);
        boardFragment$initExtraClickListener$3$4$1$2.f12049b = obj;
        return boardFragment$initExtraClickListener$3$4$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.f12049b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f12048a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.f12050c.invoke(str);
        this.f12051d.f12795f.setEnabled(true);
        return Unit.INSTANCE;
    }
}
