package com.friday.document.viewmodel;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.StudentShareViewModel$downloadOthers$2", m26211f = "StudentShareViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class StudentShareViewModel$downloadOthers$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8378c;

    /* renamed from: d */
    public final /* synthetic */ StudentShareViewModel f8379d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentShareViewModel$downloadOthers$2(StudentShareViewModel studentShareViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8379d = studentShareViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new StudentShareViewModel$downloadOthers$2(this.f8379d, interfaceC11588c);
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Throwable th, InterfaceC11588c interfaceC11588c) {
        return ((StudentShareViewModel$downloadOthers$2) create(th, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f8378c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        this.f8379d.m6455F(null);
        return C10786q.f26013a;
    }
}
