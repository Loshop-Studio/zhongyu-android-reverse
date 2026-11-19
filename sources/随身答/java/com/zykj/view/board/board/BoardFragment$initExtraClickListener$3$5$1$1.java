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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initExtraClickListener$3$5$1$1", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {542}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class BoardFragment$initExtraClickListener$3$5$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f12052a;

    /* renamed from: b */
    public final /* synthetic */ ViewItemSketchRecordAudioBinding f12053b;

    /* renamed from: c */
    public final /* synthetic */ Function2 f12054c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardFragment$initExtraClickListener$3$5$1$1(ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f12053b = viewItemSketchRecordAudioBinding;
        this.f12054c = function2;
    }

    /* renamed from: c */
    public static final Unit m11229c(ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding) {
        viewItemSketchRecordAudioBinding.f12797h.setEnabled(true);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BoardFragment$initExtraClickListener$3$5$1$1(this.f12053b, this.f12054c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f12052a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f12053b.f12797h.setEnabled(false);
            Function2 function2 = this.f12054c;
            final ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding = this.f12053b;
            Function0 function0 = new Function0() { // from class: com.zykj.view.board.board.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BoardFragment$initExtraClickListener$3$5$1$1.m11229c(viewItemSketchRecordAudioBinding);
                }
            };
            this.f12052a = 1;
            if (function2.invoke(function0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BoardFragment$initExtraClickListener$3$5$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
