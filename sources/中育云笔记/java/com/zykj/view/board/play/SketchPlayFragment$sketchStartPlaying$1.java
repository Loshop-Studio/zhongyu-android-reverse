package com.zykj.view.board.play;

import com.zykj.view.databinding.ViewFragmentSketchPlayBinding;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.view.board.play.SketchPlayFragment$sketchStartPlaying$1", m26211f = "SketchPlayFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class SketchPlayFragment$sketchStartPlaying$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f20411c;

    /* renamed from: d */
    public final /* synthetic */ SketchPlayFragment f20412d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayFragment$sketchStartPlaying$1(SketchPlayFragment sketchPlayFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20412d = sketchPlayFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new SketchPlayFragment$sketchStartPlaying$1(this.f20412d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f20411c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f20412d.f20388o;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f20633j.start();
        if (this.f20412d.f20379f.m21708a()) {
            this.f20412d.m17215v0();
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((SketchPlayFragment$sketchStartPlaying$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
