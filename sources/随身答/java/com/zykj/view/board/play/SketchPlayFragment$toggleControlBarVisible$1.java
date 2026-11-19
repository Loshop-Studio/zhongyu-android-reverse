package com.zykj.view.board.play;

import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.zykj.view.databinding.ViewFragmentSketchPlayBinding;
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
@DebugMetadata(m13450c = "com.zykj.view.board.play.SketchPlayFragment$toggleControlBarVisible$1", m13451f = "SketchPlayFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nSketchPlayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SketchPlayFragment.kt\ncom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,839:1\n255#2:840\n255#2:841\n257#2,2:842\n*S KotlinDebug\n*F\n+ 1 SketchPlayFragment.kt\ncom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1\n*L\n324#1:840\n332#1:841\n331#1:842,2\n*E\n"})
/* loaded from: classes5.dex */
public final class SketchPlayFragment$toggleControlBarVisible$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f12437a;

    /* renamed from: b */
    public final /* synthetic */ SketchPlayFragment f12438b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayFragment$toggleControlBarVisible$1(SketchPlayFragment sketchPlayFragment, Continuation continuation) {
        super(2, continuation);
        this.f12438b = sketchPlayFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SketchPlayFragment$toggleControlBarVisible$1(this.f12438b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f12437a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = null;
        if (this.f12438b.mTotalTime > 0) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = this.f12438b.mBinding;
            if (viewFragmentSketchPlayBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding2;
            }
            Group groupSeekBar = viewFragmentSketchPlayBinding.f12671b.f12779a;
            Intrinsics.checkNotNullExpressionValue(groupSeekBar, "groupSeekBar");
            if (groupSeekBar.getVisibility() == 0) {
                this.f12438b.m11732Q();
            } else {
                this.f12438b.m11717C0();
            }
        } else if (this.f12438b.extraConfig.m12361g()) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.f12438b.mBinding;
            if (viewFragmentSketchPlayBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                viewFragmentSketchPlayBinding3 = null;
            }
            ImageView ivFullscreen = viewFragmentSketchPlayBinding3.f12671b.f12780b;
            Intrinsics.checkNotNullExpressionValue(ivFullscreen, "ivFullscreen");
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.f12438b.mBinding;
            if (viewFragmentSketchPlayBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding4;
            }
            ImageView ivFullscreen2 = viewFragmentSketchPlayBinding.f12671b.f12780b;
            Intrinsics.checkNotNullExpressionValue(ivFullscreen2, "ivFullscreen");
            ivFullscreen.setVisibility(ivFullscreen2.getVisibility() == 0 ? 8 : 0);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SketchPlayFragment$toggleControlBarVisible$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
