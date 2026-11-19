package com.zykj.student.dialogue.p076ui.detail;

import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.databinding.DialogueFragmentAnswerPagerBinding;
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

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$startAutoHideJob$1", m13451f = "AnswerPagerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nAnswerPagerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerPagerFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$startAutoHideJob$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,579:1\n278#2,2:580\n278#2,2:582\n*S KotlinDebug\n*F\n+ 1 AnswerPagerFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$startAutoHideJob$1\n*L\n317#1:580,2\n318#1:582,2\n*E\n"})
/* loaded from: classes5.dex */
public final class AnswerPagerFragment$startAutoHideJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10952a;

    /* renamed from: b */
    public final /* synthetic */ AnswerPagerFragment f10953b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerPagerFragment$startAutoHideJob$1(AnswerPagerFragment answerPagerFragment, Continuation continuation) {
        super(2, continuation);
        this.f10953b = answerPagerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnswerPagerFragment$startAutoHideJob$1(this.f10953b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f10952a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding = this.f10953b.binding;
        DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding2 = null;
        if (dialogueFragmentAnswerPagerBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentAnswerPagerBinding = null;
        }
        ImageView ivAnswer = dialogueFragmentAnswerPagerBinding.f10426c;
        Intrinsics.checkNotNullExpressionValue(ivAnswer, "ivAnswer");
        ivAnswer.setVisibility(4);
        DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding3 = this.f10953b.binding;
        if (dialogueFragmentAnswerPagerBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            dialogueFragmentAnswerPagerBinding2 = dialogueFragmentAnswerPagerBinding3;
        }
        ImageView ivFullscreen = dialogueFragmentAnswerPagerBinding2.f10427d;
        Intrinsics.checkNotNullExpressionValue(ivFullscreen, "ivFullscreen");
        ivFullscreen.setVisibility(4);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AnswerPagerFragment$startAutoHideJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
