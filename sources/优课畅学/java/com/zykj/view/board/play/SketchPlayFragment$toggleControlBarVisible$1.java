package com.zykj.view.board.play;

import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import com.zykj.view.databinding.ViewFragmentSketchPlayBinding;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.view.board.play.SketchPlayFragment$toggleControlBarVisible$1", m17801f = "SketchPlayFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class SketchPlayFragment$toggleControlBarVisible$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f15204a;

    /* renamed from: b */
    public final /* synthetic */ SketchPlayFragment f15205b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayFragment$toggleControlBarVisible$1(SketchPlayFragment sketchPlayFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f15205b = sketchPlayFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new SketchPlayFragment$toggleControlBarVisible$1(this.f15205b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((SketchPlayFragment$toggleControlBarVisible$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f15204a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = null;
        if (this.f15205b.f15172g > 0) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = this.f15205b.f15177l;
            if (viewFragmentSketchPlayBinding2 == null) {
                AbstractC9133u.m16151y("mBinding");
            } else {
                viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding2;
            }
            Group groupSeekBar = viewFragmentSketchPlayBinding.f15416b.f15488a;
            AbstractC9133u.m16132f(groupSeekBar, "groupSeekBar");
            if (groupSeekBar.getVisibility() == 0) {
                this.f15205b.m13133P();
            } else {
                this.f15205b.m13140k0();
            }
        } else if (this.f15205b.f15168c.m18738e()) {
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding3 = this.f15205b.f15177l;
            if (viewFragmentSketchPlayBinding3 == null) {
                AbstractC9133u.m16151y("mBinding");
                viewFragmentSketchPlayBinding3 = null;
            }
            ImageView ivFullscreen = viewFragmentSketchPlayBinding3.f15416b.f15489b;
            AbstractC9133u.m16132f(ivFullscreen, "ivFullscreen");
            ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding4 = this.f15205b.f15177l;
            if (viewFragmentSketchPlayBinding4 == null) {
                AbstractC9133u.m16151y("mBinding");
            } else {
                viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding4;
            }
            ImageView ivFullscreen2 = viewFragmentSketchPlayBinding.f15416b.f15489b;
            AbstractC9133u.m16132f(ivFullscreen2, "ivFullscreen");
            ivFullscreen.setVisibility(ivFullscreen2.getVisibility() == 0 ? 8 : 0);
        }
        return C8736p.f16368a;
    }
}
