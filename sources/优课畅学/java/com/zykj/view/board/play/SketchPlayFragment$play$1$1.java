package com.zykj.view.board.play;

import com.zykj.merge.sketch.view.MergeSketchPlayView;
import com.zykj.view.databinding.ViewFragmentSketchPlayBinding;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.view.board.play.SketchPlayFragment$play$1$1", m17801f = "SketchPlayFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class SketchPlayFragment$play$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f15191a;

    /* renamed from: b */
    public final /* synthetic */ boolean f15192b;

    /* renamed from: c */
    public final /* synthetic */ SketchPlayFragment f15193c;

    /* renamed from: d */
    public final /* synthetic */ String f15194d;

    /* renamed from: e */
    public final /* synthetic */ int f15195e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC10570l f15196f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC10570l f15197g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayFragment$play$1$1(boolean z10, SketchPlayFragment sketchPlayFragment, String str, int i10, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f15192b = z10;
        this.f15193c = sketchPlayFragment;
        this.f15194d = str;
        this.f15195e = i10;
        this.f15196f = interfaceC10570l;
        this.f15197g = interfaceC10570l2;
    }

    /* renamed from: l */
    public static final C8736p m13165l(final SketchPlayFragment sketchPlayFragment, final int i10, final boolean z10, final InterfaceC10570l interfaceC10570l, final int i11) {
        sketchPlayFragment.f15172g = i11;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.f15177l;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC9133u.m16151y("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f15422h.post(new Runnable() { // from class: com.zykj.view.board.play.c
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayFragment$play$1$1.m13166m(i11, sketchPlayFragment, i10, z10, interfaceC10570l);
            }
        });
        return C8736p.f16368a;
    }

    /* renamed from: m */
    public static final void m13166m(int i10, SketchPlayFragment sketchPlayFragment, int i11, boolean z10, InterfaceC10570l interfaceC10570l) {
        if (i10 > 0) {
            sketchPlayFragment.m13134Q(i11);
        } else {
            sketchPlayFragment.m13135R();
        }
        if (z10) {
            sketchPlayFragment.m13132O();
        }
        if (interfaceC10570l != null) {
            interfaceC10570l.invoke(Boolean.valueOf(i10 > 0));
        }
    }

    /* renamed from: n */
    public static final C8736p m13167n(boolean z10, SketchPlayFragment sketchPlayFragment, InterfaceC10570l interfaceC10570l, Throwable th) {
        if (z10) {
            sketchPlayFragment.m13132O();
        }
        if (interfaceC10570l != null) {
            interfaceC10570l.invoke(th);
        }
        return C8736p.f16368a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new SketchPlayFragment$play$1$1(this.f15192b, this.f15193c, this.f15194d, this.f15195e, this.f15196f, this.f15197g, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((SketchPlayFragment$play$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f15191a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = null;
        if (this.f15192b) {
            SketchPlayFragment.m13112j0(this.f15193c, null, false, 3, null);
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = this.f15193c.f15177l;
        if (viewFragmentSketchPlayBinding2 == null) {
            AbstractC9133u.m16151y("mBinding");
        } else {
            viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding2;
        }
        MergeSketchPlayView mergeSketchPlayView = viewFragmentSketchPlayBinding.f15422h;
        String str = this.f15194d;
        final SketchPlayFragment sketchPlayFragment = this.f15193c;
        final int i10 = this.f15195e;
        final boolean z10 = this.f15192b;
        final InterfaceC10570l interfaceC10570l = this.f15196f;
        InterfaceC10570l interfaceC10570l2 = new InterfaceC10570l() { // from class: com.zykj.view.board.play.a
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj2) {
                return SketchPlayFragment$play$1$1.m13165l(sketchPlayFragment, i10, z10, interfaceC10570l, ((Integer) obj2).intValue());
            }
        };
        final boolean z11 = this.f15192b;
        final SketchPlayFragment sketchPlayFragment2 = this.f15193c;
        final InterfaceC10570l interfaceC10570l3 = this.f15197g;
        mergeSketchPlayView.m9528h(str, interfaceC10570l2, new InterfaceC10570l() { // from class: com.zykj.view.board.play.b
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj2) {
                return SketchPlayFragment$play$1$1.m13167n(z11, sketchPlayFragment2, interfaceC10570l3, (Throwable) obj2);
            }
        });
        return C8736p.f16368a;
    }
}
