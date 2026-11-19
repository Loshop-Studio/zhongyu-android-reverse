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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.view.board.play.SketchPlayFragment$play$1$1", m13451f = "SketchPlayFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class SketchPlayFragment$play$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f12415a;

    /* renamed from: b */
    public final /* synthetic */ boolean f12416b;

    /* renamed from: c */
    public final /* synthetic */ SketchPlayFragment f12417c;

    /* renamed from: d */
    public final /* synthetic */ String f12418d;

    /* renamed from: e */
    public final /* synthetic */ int f12419e;

    /* renamed from: f */
    public final /* synthetic */ Function1 f12420f;

    /* renamed from: g */
    public final /* synthetic */ Function1 f12421g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayFragment$play$1$1(boolean z9, SketchPlayFragment sketchPlayFragment, String str, int i9, Function1 function1, Function1 function12, Continuation continuation) {
        super(2, continuation);
        this.f12416b = z9;
        this.f12417c = sketchPlayFragment;
        this.f12418d = str;
        this.f12419e = i9;
        this.f12420f = function1;
        this.f12421g = function12;
    }

    /* renamed from: k */
    public static final Unit m11775k(final SketchPlayFragment sketchPlayFragment, final int i9, final boolean z9, final Function1 function1, final int i10) {
        sketchPlayFragment.mTotalTime = i10;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f12677h.post(new Runnable() { // from class: com.zykj.view.board.play.c
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayFragment$play$1$1.m11776n(i10, sketchPlayFragment, i9, z9, function1);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final void m11776n(int i9, SketchPlayFragment sketchPlayFragment, int i10, boolean z9, Function1 function1) {
        if (i9 > 0) {
            sketchPlayFragment.m11733R(i10);
        } else {
            sketchPlayFragment.m11734S();
        }
        if (z9) {
            sketchPlayFragment.m11731P();
        }
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(i9 > 0));
        }
    }

    /* renamed from: q */
    public static final Unit m11777q(boolean z9, SketchPlayFragment sketchPlayFragment, Function1 function1, Throwable th) {
        if (z9) {
            sketchPlayFragment.m11731P();
        }
        if (function1 != null) {
            function1.invoke(th);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SketchPlayFragment$play$1$1(this.f12416b, this.f12417c, this.f12418d, this.f12419e, this.f12420f, this.f12421g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f12415a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = null;
        if (this.f12416b) {
            SketchPlayFragment.m11672B0(this.f12417c, null, false, 3, null);
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = this.f12417c.mBinding;
        if (viewFragmentSketchPlayBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding2;
        }
        MergeSketchPlayView mergeSketchPlayView = viewFragmentSketchPlayBinding.f12677h;
        String str = this.f12418d;
        final SketchPlayFragment sketchPlayFragment = this.f12417c;
        final int i9 = this.f12419e;
        final boolean z9 = this.f12416b;
        final Function1 function1 = this.f12420f;
        Function1<? super Integer, Unit> function12 = new Function1() { // from class: com.zykj.view.board.play.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return SketchPlayFragment$play$1$1.m11775k(sketchPlayFragment, i9, z9, function1, ((Integer) obj2).intValue());
            }
        };
        final boolean z10 = this.f12416b;
        final SketchPlayFragment sketchPlayFragment2 = this.f12417c;
        final Function1 function13 = this.f12421g;
        mergeSketchPlayView.loadData(str, function12, new Function1() { // from class: com.zykj.view.board.play.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return SketchPlayFragment$play$1$1.m11777q(z10, sketchPlayFragment2, function13, (Throwable) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SketchPlayFragment$play$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
