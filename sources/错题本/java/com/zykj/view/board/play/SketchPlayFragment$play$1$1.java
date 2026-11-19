package com.zykj.view.board.play;

import com.zykj.merge.sketch.view.MergeSketchPlayView;
import com.zykj.view.databinding.ViewFragmentSketchPlayBinding;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.view.board.play.SketchPlayFragment$play$1$1", m5303f = "SketchPlayFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
public final class SketchPlayFragment$play$1$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ InterfaceC6471c $onFailure;
    final /* synthetic */ InterfaceC6471c $onSuccess;
    final /* synthetic */ String $path;
    final /* synthetic */ int $progress;
    final /* synthetic */ boolean $showLoading;
    int label;
    final /* synthetic */ SketchPlayFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayFragment$play$1$1(boolean z8, SketchPlayFragment sketchPlayFragment, String str, int i, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC5631c<? super SketchPlayFragment$play$1$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$showLoading = z8;
        this.this$0 = sketchPlayFragment;
        this.$path = str;
        this.$progress = i;
        this.$onSuccess = interfaceC6471c;
        this.$onFailure = interfaceC6471c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s invokeSuspend$lambda$1(final SketchPlayFragment sketchPlayFragment, final int i, final boolean z8, final InterfaceC6471c interfaceC6471c, final int i8) {
        sketchPlayFragment.mTotalTime = i8;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.mBinding;
        if (viewFragmentSketchPlayBinding != null) {
            viewFragmentSketchPlayBinding.sketchView.post(new Runnable() { // from class: com.zykj.view.board.play.i
                @Override // java.lang.Runnable
                public final void run() {
                    SketchPlayFragment$play$1$1.invokeSuspend$lambda$1$lambda$0(i8, sketchPlayFragment, i, z8, interfaceC6471c);
                }
            });
            return C5443s.f8405a;
        }
        AbstractC5830k.m5339p("mBinding");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1$lambda$0(int i, SketchPlayFragment sketchPlayFragment, int i8, boolean z8, InterfaceC6471c interfaceC6471c) {
        if (i > 0) {
            sketchPlayFragment.initPlaySketch(i8);
        } else {
            sketchPlayFragment.initStaticSketch();
        }
        if (z8) {
            sketchPlayFragment.hideProgress();
        }
        if (interfaceC6471c != null) {
            interfaceC6471c.invoke(Boolean.valueOf(i > 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s invokeSuspend$lambda$2(boolean z8, SketchPlayFragment sketchPlayFragment, InterfaceC6471c interfaceC6471c, Throwable th) {
        if (z8) {
            sketchPlayFragment.hideProgress();
        }
        if (interfaceC6471c != null) {
            interfaceC6471c.invoke(th);
        }
        return C5443s.f8405a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new SketchPlayFragment$play$1$1(this.$showLoading, this.this$0, this.$path, this.$progress, this.$onSuccess, this.$onFailure, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5774b.m5119b(obj);
        int i = 0;
        if (this.$showLoading) {
            SketchPlayFragment.showProgress$default(this.this$0, null, false, 3, null);
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.this$0.mBinding;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        MergeSketchPlayView mergeSketchPlayView = viewFragmentSketchPlayBinding.sketchView;
        String str = this.$path;
        final SketchPlayFragment sketchPlayFragment = this.this$0;
        final int i8 = this.$progress;
        final boolean z8 = this.$showLoading;
        final InterfaceC6471c interfaceC6471c = this.$onSuccess;
        mergeSketchPlayView.loadData(str, new InterfaceC6471c() { // from class: com.zykj.view.board.play.g
            @Override // p152r6.InterfaceC6471c
            public final Object invoke(Object obj2) {
                int iIntValue = ((Integer) obj2).intValue();
                return SketchPlayFragment$play$1$1.invokeSuspend$lambda$1(sketchPlayFragment, i8, z8, interfaceC6471c, iIntValue);
            }
        }, new C5359h(z8, sketchPlayFragment, this.$onFailure, i));
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((SketchPlayFragment$play$1$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
