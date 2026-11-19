package com.zykj.view.board.play;

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

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.view.board.play.SketchPlayFragment$play$1$1", m13596f = "SketchPlayFragment.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes5.dex */
public final class SketchPlayFragment$play$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11193a;

    /* renamed from: b */
    public final /* synthetic */ boolean f11194b;

    /* renamed from: c */
    public final /* synthetic */ SketchPlayFragment f11195c;

    /* renamed from: d */
    public final /* synthetic */ String f11196d;

    /* renamed from: e */
    public final /* synthetic */ int f11197e;

    /* renamed from: f */
    public final /* synthetic */ Function1 f11198f;

    /* renamed from: g */
    public final /* synthetic */ Function1 f11199g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayFragment$play$1$1(boolean z9, SketchPlayFragment sketchPlayFragment, String str, int i10, Function1 function1, Function1 function12, Continuation continuation) {
        super(2, continuation);
        this.f11194b = z9;
        this.f11195c = sketchPlayFragment;
        this.f11196d = str;
        this.f11197e = i10;
        this.f11198f = function1;
        this.f11199g = function12;
    }

    /* renamed from: k */
    public static final Unit m11293k(final SketchPlayFragment sketchPlayFragment, final int i10, final boolean z9, final Function1 function1, final int i11) {
        sketchPlayFragment.mTotalTime = i11;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
        if (viewFragmentSketchPlayBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f11433h.post(new Runnable() { // from class: com.zykj.view.board.play.c
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayFragment$play$1$1.m11294m(i11, sketchPlayFragment, i10, z9, function1);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final void m11294m(int i10, SketchPlayFragment sketchPlayFragment, int i11, boolean z9, Function1 function1) {
        if (i10 > 0) {
            sketchPlayFragment.m11262N(i11);
        } else {
            sketchPlayFragment.m11263O();
        }
        if (z9) {
            sketchPlayFragment.hideProgress();
        }
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(i10 > 0));
        }
    }

    /* renamed from: o */
    public static final Unit m11295o(boolean z9, SketchPlayFragment sketchPlayFragment, Function1 function1, Throwable th) {
        if (z9) {
            sketchPlayFragment.hideProgress();
        }
        if (function1 != null) {
            function1.invoke(th);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SketchPlayFragment$play$1$1(this.f11194b, this.f11195c, this.f11196d, this.f11197e, this.f11198f, this.f11199g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f11193a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = null;
        if (this.f11194b) {
            SketchPlayFragment.m11237g0(this.f11195c, null, false, 3, null);
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = this.f11195c.mBinding;
        if (viewFragmentSketchPlayBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding2;
        }
        MergeSketchPlayView mergeSketchPlayView = viewFragmentSketchPlayBinding.f11433h;
        String str = this.f11196d;
        final SketchPlayFragment sketchPlayFragment = this.f11195c;
        final int i10 = this.f11197e;
        final boolean z9 = this.f11194b;
        final Function1 function1 = this.f11198f;
        Function1<? super Integer, Unit> function12 = new Function1() { // from class: com.zykj.view.board.play.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return SketchPlayFragment$play$1$1.m11293k(sketchPlayFragment, i10, z9, function1, ((Integer) obj2).intValue());
            }
        };
        final boolean z10 = this.f11194b;
        final SketchPlayFragment sketchPlayFragment2 = this.f11195c;
        final Function1 function13 = this.f11199g;
        mergeSketchPlayView.loadData(str, function12, new Function1() { // from class: com.zykj.view.board.play.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return SketchPlayFragment$play$1$1.m11295o(z10, sketchPlayFragment2, function13, (Throwable) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SketchPlayFragment$play$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
