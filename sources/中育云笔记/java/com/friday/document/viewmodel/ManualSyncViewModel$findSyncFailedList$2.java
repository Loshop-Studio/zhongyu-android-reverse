package com.friday.document.viewmodel;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ManualSyncViewModel$findSyncFailedList$2", m26211f = "ManualSyncViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ManualSyncViewModel$findSyncFailedList$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8048c;

    /* renamed from: d */
    public /* synthetic */ Object f8049d;

    /* renamed from: e */
    public final /* synthetic */ ManualSyncViewModel f8050e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualSyncViewModel$findSyncFailedList$2(ManualSyncViewModel manualSyncViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8050e = manualSyncViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        ManualSyncViewModel$findSyncFailedList$2 manualSyncViewModel$findSyncFailedList$2 = new ManualSyncViewModel$findSyncFailedList$2(this.f8050e, interfaceC11588c);
        manualSyncViewModel$findSyncFailedList$2.f8049d = obj;
        return manualSyncViewModel$findSyncFailedList$2;
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Throwable th, InterfaceC11588c interfaceC11588c) {
        return ((ManualSyncViewModel$findSyncFailedList$2) create(th, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th = (Throwable) this.f8049d;
        AbstractC11725a.m25952f();
        if (this.f8048c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        this.f8050e.m6305i().setValue(null);
        th.printStackTrace();
        return C10786q.f26013a;
    }
}
