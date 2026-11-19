package com.zykj.view.board.play;

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

@InterfaceC9539d(m17800c = "com.zykj.view.board.play.SketchPlayFragment$sketchStartPlaying$1", m17801f = "SketchPlayFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class SketchPlayFragment$sketchStartPlaying$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f15200a;

    /* renamed from: b */
    public final /* synthetic */ SketchPlayFragment f15201b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayFragment$sketchStartPlaying$1(SketchPlayFragment sketchPlayFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f15201b = sketchPlayFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new SketchPlayFragment$sketchStartPlaying$1(this.f15201b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((SketchPlayFragment$sketchStartPlaying$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f15200a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = this.f15201b.f15177l;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f15422h.m9535o();
        if (this.f15201b.f15168c.m18734a()) {
            this.f15201b.m13143n0();
        }
        return C8736p.f16368a;
    }
}
