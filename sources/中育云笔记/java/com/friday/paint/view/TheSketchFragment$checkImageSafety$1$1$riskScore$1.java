package com.friday.paint.view;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p141f2.C9167d;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.view.TheSketchFragment$checkImageSafety$1$1$riskScore$1", m26211f = "TheSketchFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TheSketchFragment$checkImageSafety$1$1$riskScore$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10043c;

    /* renamed from: d */
    public final /* synthetic */ String f10044d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheSketchFragment$checkImageSafety$1$1$riskScore$1(String str, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10044d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new TheSketchFragment$checkImageSafety$1$1$riskScore$1(this.f10044d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f10043c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        return AbstractC11826a.m26208c((int) (C9167d.f21407a.m18066d(this.f10044d)[1] * 100));
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((TheSketchFragment$checkImageSafety$1$1$riskScore$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
