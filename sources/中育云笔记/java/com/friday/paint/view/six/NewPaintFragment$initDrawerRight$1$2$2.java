package com.friday.paint.view.six;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment$initDrawerRight$1$2$2", m26211f = "NewPaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NewPaintFragment$initDrawerRight$1$2$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10160c;

    /* renamed from: d */
    public final /* synthetic */ NewPaintFragment f10161d;

    /* renamed from: e */
    public final /* synthetic */ String f10162e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewPaintFragment$initDrawerRight$1$2$2(NewPaintFragment newPaintFragment, String str, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10161d = newPaintFragment;
        this.f10162e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NewPaintFragment$initDrawerRight$1$2$2(this.f10161d, this.f10162e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f10160c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        this.f10161d.updateNoteScreenShotByNotePath(this.f10162e);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NewPaintFragment$initDrawerRight$1$2$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
