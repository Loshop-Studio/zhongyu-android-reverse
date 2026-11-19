package com.friday.document.viewmodel;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.ManualSyncViewModel$findSyncFailedList$1", m26211f = "ManualSyncViewModel.kt", m26212l = {38, 38}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ManualSyncViewModel$findSyncFailedList$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8046c;

    /* renamed from: d */
    public final /* synthetic */ ManualSyncViewModel f8047d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualSyncViewModel$findSyncFailedList$1(ManualSyncViewModel manualSyncViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8047d = manualSyncViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new ManualSyncViewModel$findSyncFailedList$1(this.f8047d, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r8 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r8 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r7.f8046c
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L1e
            if (r1 == r2) goto L1a
            if (r1 != r3) goto L12
            kotlin.AbstractC9924b.m20071b(r8)
            goto L56
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            kotlin.AbstractC9924b.m20071b(r8)
            goto L3e
        L1e:
            kotlin.AbstractC9924b.m20071b(r8)
            com.friday.document.viewmodel.ManualSyncViewModel r8 = r7.f8047d
            boolean r8 = com.friday.document.viewmodel.ManualSyncViewModel.m6302f(r8)
            if (r8 == 0) goto L41
            com.friday.document.viewmodel.ManualSyncViewModel r8 = r7.f8047d
            com.friday.common.dao.FileDao r8 = r8.m6306j()
            com.friday.document.viewmodel.ManualSyncViewModel r1 = r7.f8047d
            long r4 = com.friday.document.viewmodel.ManualSyncViewModel.m6303g(r1)
            r7.f8046c = r2
            java.lang.Object r8 = r8.mo4920S(r4, r7)
            if (r8 != r0) goto L3e
            goto L55
        L3e:
            java.util.List r8 = (java.util.List) r8
            goto L58
        L41:
            com.friday.document.viewmodel.ManualSyncViewModel r8 = r7.f8047d
            com.friday.common.dao.FileDao r8 = r8.m6306j()
            com.friday.document.viewmodel.ManualSyncViewModel r1 = r7.f8047d
            long r1 = com.friday.document.viewmodel.ManualSyncViewModel.m6303g(r1)
            r7.f8046c = r3
            java.lang.Object r8 = r8.mo4937n(r1, r7)
            if (r8 != r0) goto L56
        L55:
            return r0
        L56:
            java.util.List r8 = (java.util.List) r8
        L58:
            com.friday.document.viewmodel.ManualSyncViewModel r0 = r7.f8047d
            androidx.lifecycle.MutableLiveData r0 = r0.m6305i()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p325rc.AbstractC10980x.m24153x(r8, r2)
            r1.<init>(r2)
            java.util.Iterator r8 = r8.iterator()
        L6f:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r2 = r8.next()
            com.friday.common.entity.FileEntity r2 = (com.friday.common.entity.FileEntity) r2
            com.friday.document.model.ManualSyncEntity r4 = new com.friday.document.model.ManualSyncEntity
            r5 = 0
            r6 = 0
            r4.<init>(r2, r5, r3, r6)
            r1.add(r4)
            goto L6f
        L86:
            r0.setValue(r1)
            qc.q r8 = p309qc.C10786q.f26013a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.ManualSyncViewModel$findSyncFailedList$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/ManualSyncViewModel$findSyncFailedList$1.smali:119
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ManualSyncViewModel$findSyncFailedList$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
