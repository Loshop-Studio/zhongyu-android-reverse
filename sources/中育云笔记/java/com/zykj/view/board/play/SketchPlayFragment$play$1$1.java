package com.zykj.view.board.play;

import com.zykj.merge.sketch.view.MergeSketchPlayView;
import com.zykj.view.databinding.ViewFragmentSketchPlayBinding;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.view.board.play.SketchPlayFragment$play$1$1", m26211f = "SketchPlayFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class SketchPlayFragment$play$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f20402c;

    /* renamed from: d */
    public final /* synthetic */ boolean f20403d;

    /* renamed from: e */
    public final /* synthetic */ SketchPlayFragment f20404e;

    /* renamed from: f */
    public final /* synthetic */ String f20405f;

    /* renamed from: g */
    public final /* synthetic */ int f20406g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC9540l f20407h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC9540l f20408i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayFragment$play$1$1(boolean z10, SketchPlayFragment sketchPlayFragment, String str, int i10, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20403d = z10;
        this.f20404e = sketchPlayFragment;
        this.f20405f = str;
        this.f20406g = i10;
        this.f20407h = interfaceC9540l;
        this.f20408i = interfaceC9540l2;
    }

    /* renamed from: p */
    public static final C10786q m17239p(final SketchPlayFragment sketchPlayFragment, final int i10, final boolean z10, final InterfaceC9540l interfaceC9540l, final int i11) {
        sketchPlayFragment.f20383j = i11;
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = sketchPlayFragment.f20388o;
        if (viewFragmentSketchPlayBinding == null) {
            AbstractC9979u.m20312y("mBinding");
            viewFragmentSketchPlayBinding = null;
        }
        viewFragmentSketchPlayBinding.f20633j.post(new Runnable() { // from class: com.zykj.view.board.play.c
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayFragment$play$1$1.m17240t(i11, sketchPlayFragment, i10, z10, interfaceC9540l);
            }
        });
        return C10786q.f26013a;
    }

    /* renamed from: t */
    public static final void m17240t(int i10, SketchPlayFragment sketchPlayFragment, int i11, boolean z10, InterfaceC9540l interfaceC9540l) {
        if (i10 > 0) {
            sketchPlayFragment.m17206Z(i11);
        } else {
            sketchPlayFragment.m17207a0();
        }
        if (z10) {
            sketchPlayFragment.m17204X();
        }
        if (interfaceC9540l != null) {
            interfaceC9540l.invoke(Boolean.valueOf(i10 > 0));
        }
    }

    /* renamed from: v */
    public static final C10786q m17241v(boolean z10, SketchPlayFragment sketchPlayFragment, InterfaceC9540l interfaceC9540l, Throwable th) {
        if (z10) {
            sketchPlayFragment.m17204X();
        }
        if (interfaceC9540l != null) {
            interfaceC9540l.invoke(th);
        }
        return C10786q.f26013a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new SketchPlayFragment$play$1$1(this.f20403d, this.f20404e, this.f20405f, this.f20406g, this.f20407h, this.f20408i, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f20402c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding = null;
        if (this.f20403d) {
            SketchPlayFragment.m17192r0(this.f20404e, null, false, 3, null);
        }
        ViewFragmentSketchPlayBinding viewFragmentSketchPlayBinding2 = this.f20404e.f20388o;
        if (viewFragmentSketchPlayBinding2 == null) {
            AbstractC9979u.m20312y("mBinding");
        } else {
            viewFragmentSketchPlayBinding = viewFragmentSketchPlayBinding2;
        }
        MergeSketchPlayView mergeSketchPlayView = viewFragmentSketchPlayBinding.f20633j;
        String str = this.f20405f;
        final SketchPlayFragment sketchPlayFragment = this.f20404e;
        final int i10 = this.f20406g;
        final boolean z10 = this.f20403d;
        final InterfaceC9540l interfaceC9540l = this.f20407h;
        InterfaceC9540l interfaceC9540l2 = new InterfaceC9540l() { // from class: com.zykj.view.board.play.a
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj2) {
                return SketchPlayFragment$play$1$1.m17239p(sketchPlayFragment, i10, z10, interfaceC9540l, ((Integer) obj2).intValue());
            }
        };
        final boolean z11 = this.f20403d;
        final SketchPlayFragment sketchPlayFragment2 = this.f20404e;
        final InterfaceC9540l interfaceC9540l3 = this.f20408i;
        mergeSketchPlayView.loadData(str, interfaceC9540l2, new InterfaceC9540l() { // from class: com.zykj.view.board.play.b
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj2) {
                return SketchPlayFragment$play$1$1.m17241v(z11, sketchPlayFragment2, interfaceC9540l3, (Throwable) obj2);
            }
        });
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((SketchPlayFragment$play$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
