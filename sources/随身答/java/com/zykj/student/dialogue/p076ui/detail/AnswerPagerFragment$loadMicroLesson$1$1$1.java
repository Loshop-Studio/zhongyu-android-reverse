package com.zykj.student.dialogue.p076ui.detail;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.UriUtils;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.databinding.DialogueFragmentAnswerPagerBinding;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.AbstractC7539b;
import com.zykj.view.board.play.SketchPlayFragment;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p214p6.C9336k;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$loadMicroLesson$1$1$1", m13451f = "AnswerPagerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nAnswerPagerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerPagerFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$loadMicroLesson$1$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,579:1\n278#2,2:580\n278#2,2:582\n278#2,2:584\n*S KotlinDebug\n*F\n+ 1 AnswerPagerFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$loadMicroLesson$1$1$1\n*L\n536#1:580,2\n526#1:582,2\n544#1:584,2\n*E\n"})
/* loaded from: classes5.dex */
public final class AnswerPagerFragment$loadMicroLesson$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10925a;

    /* renamed from: b */
    public final /* synthetic */ SketchPlayFragment f10926b;

    /* renamed from: c */
    public final /* synthetic */ AnswerPagerFragment f10927c;

    /* renamed from: d */
    public final /* synthetic */ String f10928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerPagerFragment$loadMicroLesson$1$1$1(SketchPlayFragment sketchPlayFragment, AnswerPagerFragment answerPagerFragment, String str, Continuation continuation) {
        super(2, continuation);
        this.f10926b = sketchPlayFragment;
        this.f10927c = answerPagerFragment;
        this.f10928d = str;
    }

    /* renamed from: A */
    public static final Unit m10271A(AnswerPagerFragment answerPagerFragment, SketchPlayFragment sketchPlayFragment) {
        m10280u(answerPagerFragment, sketchPlayFragment);
        return Unit.INSTANCE;
    }

    /* renamed from: B */
    public static final Unit m10272B(AnswerPagerFragment answerPagerFragment, SketchPlayFragment sketchPlayFragment) {
        m10280u(answerPagerFragment, sketchPlayFragment);
        return Unit.INSTANCE;
    }

    /* renamed from: u */
    public static final void m10280u(final AnswerPagerFragment answerPagerFragment, SketchPlayFragment sketchPlayFragment) {
        answerPagerFragment.m10225K().m10469M(AbstractC7539b.b.f11258a);
        sketchPlayFragment.m11744p0(true);
        sketchPlayFragment.m11740l0(true);
        sketchPlayFragment.m11751w0(true);
        SketchPlayFragment sketchPlayFragment2 = answerPagerFragment.sketchPlayFragment;
        if (sketchPlayFragment2 != null && sketchPlayFragment2.m11735c0()) {
            sketchPlayFragment.m11745q0(true);
        }
        sketchPlayFragment.m11741m0(new Function1() { // from class: com.zykj.student.dialogue.ui.detail.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnswerPagerFragment$loadMicroLesson$1$1$1.m10281v(answerPagerFragment, (View) obj);
            }
        });
        sketchPlayFragment.m11752x0(new Function1() { // from class: com.zykj.student.dialogue.ui.detail.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnswerPagerFragment$loadMicroLesson$1$1$1.m10282w(answerPagerFragment, ((Boolean) obj).booleanValue());
            }
        });
        sketchPlayFragment.m11747s0(new Function0() { // from class: com.zykj.student.dialogue.ui.detail.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnswerPagerFragment$loadMicroLesson$1$1$1.m10283x(answerPagerFragment);
            }
        });
        SketchPlayFragment sketchPlayFragment3 = answerPagerFragment.sketchPlayFragment;
        if (sketchPlayFragment3 != null) {
            sketchPlayFragment3.m11748t0(true);
        }
    }

    /* renamed from: v */
    public static final Unit m10281v(AnswerPagerFragment answerPagerFragment, View view) {
        answerPagerFragment.m10262V();
        return Unit.INSTANCE;
    }

    /* renamed from: w */
    public static final Unit m10282w(AnswerPagerFragment answerPagerFragment, boolean z9) {
        DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding = answerPagerFragment.binding;
        if (dialogueFragmentAnswerPagerBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentAnswerPagerBinding = null;
        }
        ImageView ivAnswer = dialogueFragmentAnswerPagerBinding.f10426c;
        Intrinsics.checkNotNullExpressionValue(ivAnswer, "ivAnswer");
        boolean z10 = true;
        if (!answerPagerFragment.m10259S() && z9) {
            z10 = false;
        }
        ivAnswer.setVisibility(z10 ? 4 : 0);
        return Unit.INSTANCE;
    }

    /* renamed from: x */
    public static final Unit m10283x(AnswerPagerFragment answerPagerFragment) {
        answerPagerFragment.m10261U();
        return Unit.INSTANCE;
    }

    /* renamed from: y */
    public static final Unit m10284y(AnswerPagerFragment answerPagerFragment, SketchPlayFragment sketchPlayFragment, Throwable th) {
        m10280u(answerPagerFragment, sketchPlayFragment);
        answerPagerFragment.m10260T(false);
        return Unit.INSTANCE;
    }

    /* renamed from: z */
    public static final Unit m10285z(final SketchPlayFragment sketchPlayFragment, final AnswerPagerFragment answerPagerFragment, int i9, boolean z9) {
        if (!sketchPlayFragment.isDetached()) {
            DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding = answerPagerFragment.binding;
            if (dialogueFragmentAnswerPagerBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogueFragmentAnswerPagerBinding = null;
            }
            ImageView ivAnswer = dialogueFragmentAnswerPagerBinding.f10426c;
            Intrinsics.checkNotNullExpressionValue(ivAnswer, "ivAnswer");
            ivAnswer.setVisibility(answerPagerFragment.m10259S() ? 4 : 0);
            answerPagerFragment.m10260T(true);
            sketchPlayFragment.m11722G(answerPagerFragment.m10225K().getPlayInfo().m15220b(), false);
            if (i9 > 0) {
                sketchPlayFragment.m11739k0(i9, answerPagerFragment.m10225K().getPlayInfo().m15219a(), new Function0() { // from class: com.zykj.student.dialogue.ui.detail.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AnswerPagerFragment$loadMicroLesson$1$1$1.m10271A(answerPagerFragment, sketchPlayFragment);
                    }
                }, new Function0() { // from class: com.zykj.student.dialogue.ui.detail.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AnswerPagerFragment$loadMicroLesson$1$1$1.m10272B(answerPagerFragment, sketchPlayFragment);
                    }
                });
                answerPagerFragment.m10225K().m10475S(false);
            } else {
                m10280u(answerPagerFragment, sketchPlayFragment);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnswerPagerFragment$loadMicroLesson$1$1$1(this.f10926b, this.f10927c, this.f10928d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnswerPagerFragment answerPagerFragment;
        SketchPlayFragment sketchPlayFragment;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f10925a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.f10926b.m11750v0(R.color.color_primary);
        Drawable drawable = ContextCompat.getDrawable(this.f10926b.requireContext(), R.drawable.dialogue_seekbar_style);
        if (drawable != null) {
            this.f10926b.m11749u0(drawable);
        }
        Drawable drawable2 = ContextCompat.getDrawable(this.f10926b.requireContext(), R.drawable.dialogue_speed_rate);
        if (drawable2 != null) {
            this.f10926b.m11753y0(drawable2);
        }
        this.f10926b.m11754z0(R.color.dialogue_speed_rate_item_color);
        this.f10926b.m11742n0(R.drawable.selector_fullscreen_home);
        final int iM15221c = this.f10927c.m10225K().getPlayInfo().m15221c();
        DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding = this.f10927c.binding;
        DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding2 = null;
        if (dialogueFragmentAnswerPagerBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentAnswerPagerBinding = null;
        }
        ImageView ivAnswer = dialogueFragmentAnswerPagerBinding.f10426c;
        Intrinsics.checkNotNullExpressionValue(ivAnswer, "ivAnswer");
        ivAnswer.setVisibility(this.f10927c.m10259S() ? 4 : 0);
        final SketchPlayFragment sketchPlayFragment2 = this.f10926b;
        String str = this.f10928d;
        final AnswerPagerFragment answerPagerFragment2 = this.f10927c;
        Function1 function1 = new Function1() { // from class: com.zykj.student.dialogue.ui.detail.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AnswerPagerFragment$loadMicroLesson$1$1$1.m10284y(answerPagerFragment2, sketchPlayFragment2, (Throwable) obj2);
            }
        };
        final SketchPlayFragment sketchPlayFragment3 = this.f10926b;
        final AnswerPagerFragment answerPagerFragment3 = this.f10927c;
        sketchPlayFragment2.m11738g0(str, iM15221c, false, function1, new Function1() { // from class: com.zykj.student.dialogue.ui.detail.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AnswerPagerFragment$loadMicroLesson$1$1$1.m10285z(sketchPlayFragment3, answerPagerFragment3, iM15221c, ((Boolean) obj2).booleanValue());
            }
        });
        String strM15231f = ((C9336k) this.f10927c.m10225K().getViewState().getValue()).m15231f();
        if (strM15231f != null && (sketchPlayFragment = (answerPagerFragment = this.f10927c).sketchPlayFragment) != null && sketchPlayFragment.m11735c0()) {
            DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding3 = answerPagerFragment.binding;
            if (dialogueFragmentAnswerPagerBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                dialogueFragmentAnswerPagerBinding2 = dialogueFragmentAnswerPagerBinding3;
            }
            dialogueFragmentAnswerPagerBinding2.f10430g.setImageURI(UriUtils.file2Uri(new File(strM15231f)));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AnswerPagerFragment$loadMicroLesson$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
