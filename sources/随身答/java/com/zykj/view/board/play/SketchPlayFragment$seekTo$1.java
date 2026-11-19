package com.zykj.view.board.play;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.merge.sketch.view.MergeSketchPlayView;
import com.zykj.view.databinding.ViewFragmentSketchPlayBinding;
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
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.view.board.play.SketchPlayFragment$seekTo$1", m13451f = "SketchPlayFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class SketchPlayFragment$seekTo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f12422a;

    /* renamed from: b */
    public final /* synthetic */ SketchPlayFragment f12423b;

    /* renamed from: c */
    public final /* synthetic */ int f12424c;

    /* renamed from: d */
    public final /* synthetic */ boolean f12425d;

    /* renamed from: e */
    public final /* synthetic */ Function0 f12426e;

    /* renamed from: f */
    public final /* synthetic */ Function0 f12427f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayFragment$seekTo$1(SketchPlayFragment sketchPlayFragment, int i9, boolean z9, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.f12423b = sketchPlayFragment;
        this.f12424c = i9;
        this.f12425d = z9;
        this.f12426e = function0;
        this.f12427f = function02;
    }

    /* renamed from: g */
    public static final Unit m11780g(boolean z9, SketchPlayFragment sketchPlayFragment, Function0 function0, int i9) {
        if (z9) {
            sketchPlayFragment.m11718D0();
        }
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public static final Unit m11781k(Function0 function0, Throwable th) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SketchPlayFragment$seekTo$1(this.f12423b, this.f12424c, this.f12425d, this.f12426e, this.f12427f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f12422a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f12423b.mBinding;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        MergeSketchPlayView mergeSketchPlayView = viewFragmentSketchPlayBinding.f12677h;
        int i9 = this.f12424c;
        final boolean z9 = this.f12425d;
        final SketchPlayFragment sketchPlayFragment = this.f12423b;
        final Function0 function0 = this.f12426e;
        Function1<? super Integer, Unit> function1 = new Function1() { // from class: com.zykj.view.board.play.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return SketchPlayFragment$seekTo$1.m11780g(z9, sketchPlayFragment, function0, ((Integer) obj2).intValue());
            }
        };
        final Function0 function02 = this.f12427f;
        mergeSketchPlayView.seekTo(i9, function1, new Function1() { // from class: com.zykj.view.board.play.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return SketchPlayFragment$seekTo$1.m11781k(function02, (Throwable) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SketchPlayFragment$seekTo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
