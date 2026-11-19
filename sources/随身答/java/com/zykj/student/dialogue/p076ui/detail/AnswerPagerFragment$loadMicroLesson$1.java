package com.zykj.student.dialogue.p076ui.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.zykj.view.board.play.SketchPlayFragment;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$loadMicroLesson$1", m13451f = "AnswerPagerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class AnswerPagerFragment$loadMicroLesson$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10922a;

    /* renamed from: b */
    public final /* synthetic */ AnswerPagerFragment f10923b;

    /* renamed from: c */
    public final /* synthetic */ String f10924c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerPagerFragment$loadMicroLesson$1(AnswerPagerFragment answerPagerFragment, String str, Continuation continuation) {
        super(2, continuation);
        this.f10923b = answerPagerFragment;
        this.f10924c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnswerPagerFragment$loadMicroLesson$1(this.f10923b, this.f10924c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f10922a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SketchPlayFragment sketchPlayFragment = this.f10923b.sketchPlayFragment;
        if (sketchPlayFragment != null) {
            AnswerPagerFragment answerPagerFragment = this.f10923b;
            String str = this.f10924c;
            LifecycleOwner viewLifecycleOwner = sketchPlayFragment.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AnswerPagerFragment$loadMicroLesson$1$1$1(sketchPlayFragment, answerPagerFragment, str, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AnswerPagerFragment$loadMicroLesson$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
