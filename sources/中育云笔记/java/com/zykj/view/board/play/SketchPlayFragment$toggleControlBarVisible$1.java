package com.zykj.view.board.play;

import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
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

@InterfaceC11829d(m26210c = "com.zykj.view.board.play.SketchPlayFragment$toggleControlBarVisible$1", m26211f = "SketchPlayFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class SketchPlayFragment$toggleControlBarVisible$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f20415c;

    /* renamed from: d */
    public final /* synthetic */ SketchPlayFragment f20416d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayFragment$toggleControlBarVisible$1(SketchPlayFragment sketchPlayFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20416d = sketchPlayFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new SketchPlayFragment$toggleControlBarVisible$1(this.f20416d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f20415c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = null;
        if (this.f20416d.f20383j > 0) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = this.f20416d.f20388o;
            if (viewFragmentSketchPlayBinding2 == null) {
                AbstractC9979u.m20312y("mBinding");
            } else {
                viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding2;
            }
            Group groupSeekBar = viewFragmentSketchPlayBinding.f20627d.f20699c;
            AbstractC9979u.m20293f(groupSeekBar, "groupSeekBar");
            if (groupSeekBar.getVisibility() == 0) {
                this.f20416d.m17205Y();
            } else {
                this.f20416d.m17212s0();
            }
        } else if (this.f20416d.f20379f.m21712e()) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.f20416d.f20388o;
            if (viewFragmentSketchPlayBinding3 == null) {
                AbstractC9979u.m20312y("mBinding");
                viewFragmentSketchPlayBinding3 = null;
            }
            ImageView ivFullscreen = viewFragmentSketchPlayBinding3.f20627d.f20700d;
            AbstractC9979u.m20293f(ivFullscreen, "ivFullscreen");
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.f20416d.f20388o;
            if (viewFragmentSketchPlayBinding4 == null) {
                AbstractC9979u.m20312y("mBinding");
            } else {
                viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding4;
            }
            ImageView ivFullscreen2 = viewFragmentSketchPlayBinding.f20627d.f20700d;
            AbstractC9979u.m20293f(ivFullscreen2, "ivFullscreen");
            ivFullscreen.setVisibility(ivFullscreen2.getVisibility() == 0 ? 8 : 0);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((SketchPlayFragment$toggleControlBarVisible$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
