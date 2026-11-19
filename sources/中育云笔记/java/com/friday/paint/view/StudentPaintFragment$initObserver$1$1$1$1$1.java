package com.friday.paint.view;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.view.StudentPaintFragment$initObserver$1$1$1$1$1", m26211f = "StudentPaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class StudentPaintFragment$initObserver$1$1$1$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f9953c;

    /* renamed from: d */
    public final /* synthetic */ StudentPaintFragment f9954d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentPaintFragment$initObserver$1$1$1$1$1(StudentPaintFragment studentPaintFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9954d = studentPaintFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new StudentPaintFragment$initObserver$1$1$1$1$1(this.f9954d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f9953c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        AbstractC11958b.m26588i("文件不存在");
        this.f9954d.isShowLoading(false);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((StudentPaintFragment$initObserver$1$1$1$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
