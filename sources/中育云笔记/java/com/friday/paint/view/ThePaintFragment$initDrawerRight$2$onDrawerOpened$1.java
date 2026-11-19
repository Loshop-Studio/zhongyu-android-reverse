package com.friday.paint.view;

import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.view.ThePaintFragment$initDrawerRight$2$onDrawerOpened$1", m26211f = "ThePaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ThePaintFragment$initDrawerRight$2$onDrawerOpened$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10003c;

    /* renamed from: d */
    public final /* synthetic */ ThePaintFragment f10004d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThePaintFragment$initDrawerRight$2$onDrawerOpened$1(ThePaintFragment thePaintFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10004d = thePaintFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ThePaintFragment$initDrawerRight$2$onDrawerOpened$1(this.f10004d, interfaceC11588c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f10003c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        Integer num = (Integer) this.f10004d.m7456v0().m7743x().getValue();
        if (num != null) {
            ThePaintFragment thePaintFragment = this.f10004d;
            thePaintFragment.m7472u0().updateThumbnailExceptCurrent(num.intValue());
        }
        LiveEventBus.get("updateCurrentThumbnail").post(null);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ThePaintFragment$initDrawerRight$2$onDrawerOpened$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
