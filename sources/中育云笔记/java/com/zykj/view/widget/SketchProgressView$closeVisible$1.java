package com.zykj.view.widget;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.view.widget.SketchProgressView$closeVisible$1", m26211f = "SketchProgressView.kt", m26212l = {370}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class SketchProgressView$closeVisible$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f20840c;

    /* renamed from: d */
    public final /* synthetic */ SketchProgressView f20841d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchProgressView$closeVisible$1(SketchProgressView sketchProgressView, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20841d = sketchProgressView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new SketchProgressView$closeVisible$1(this.f20841d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f20840c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            this.f20840c = 1;
            if (DelayKt.m20376b(2000L, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        this.f20841d.f20836n = false;
        this.f20841d.m17422l();
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((SketchProgressView$closeVisible$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
