package com.friday.document.viewmodel;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel$pollFolderLevel$1$realLevel$1", m26211f = "BaseFileViewModel.kt", m26212l = {80}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseFileViewModel$pollFolderLevel$1$realLevel$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7928c;

    /* renamed from: d */
    public final /* synthetic */ BaseFileViewModel f7929d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFileViewModel$pollFolderLevel$1$realLevel$1(BaseFileViewModel baseFileViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7929d = baseFileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BaseFileViewModel$pollFolderLevel$1$realLevel$1(this.f7929d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7928c;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return obj;
        }
        AbstractC9924b.m20071b(obj);
        BaseFileViewModel baseFileViewModel = this.f7929d;
        this.f7928c = 1;
        Object objM6235S = baseFileViewModel.m6235S(this);
        return objM6235S == objM25952f ? objM25952f : objM6235S;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((BaseFileViewModel$pollFolderLevel$1$realLevel$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
