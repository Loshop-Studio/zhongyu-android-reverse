package com.friday.paint.viewmodel;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.viewmodel.NewNoteViewModel$copyToOthers$1", m26211f = "NewNoteViewModel.kt", m26212l = {389, 391, 393}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NewNoteViewModel$copyToOthers$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f10332c;

    /* renamed from: d */
    public int f10333d;

    /* renamed from: e */
    public final /* synthetic */ NewNoteViewModel f10334e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewNoteViewModel$copyToOthers$1(NewNoteViewModel newNoteViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10334e = newNoteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NewNoteViewModel$copyToOthers$1(this.f10334e, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r1.emit(r2, r13) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
    
        if (r1.emit(r3, r13) == r0) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r13.f10333d
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L29
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L1a
        L12:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1a:
            java.lang.Object r0 = r13.f10332c
            java.util.List r0 = (java.util.List) r0
            kotlin.AbstractC9924b.m20071b(r14)
            r10 = r13
            goto Lab
        L24:
            kotlin.AbstractC9924b.m20071b(r14)
            r10 = r13
            goto L59
        L29:
            kotlin.AbstractC9924b.m20071b(r14)
            com.friday.paint.viewmodel.NewNoteViewModel r14 = r13.f10334e
            com.friday.common.dao.ResourceDao r5 = com.friday.paint.viewmodel.NewNoteViewModel.m7651k(r14)
            com.friday.paint.viewmodel.NewNoteViewModel r14 = r13.f10334e
            java.lang.String r6 = r14.m7665G()
            com.friday.paint.viewmodel.NewNoteViewModel r14 = r13.f10334e
            androidx.lifecycle.MutableLiveData r14 = r14.m7660B()
            java.lang.Object r14 = r14.getValue()
            kotlin.jvm.internal.AbstractC9979u.m20291d(r14)
            java.lang.Number r14 = (java.lang.Number) r14
            int r7 = r14.intValue()
            r13.f10333d = r4
            r8 = 0
            r11 = 4
            r12 = 0
            r10 = r13
            java.lang.Object r14 = com.friday.common.dao.ResourceDao.m5072M(r5, r6, r7, r8, r10, r11, r12)
            if (r14 != r0) goto L59
            goto Laa
        L59:
            java.util.List r14 = (java.util.List) r14
            r1 = r14
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L81
            com.friday.paint.viewmodel.NewNoteViewModel r1 = r10.f10334e
            vd.k r1 = com.friday.paint.viewmodel.NewNoteViewModel.m7654n(r1)
            java.lang.Object r2 = kotlin.Result.m20054c(r14)
            kotlin.Result r2 = kotlin.Result.m20053a(r2)
            java.lang.Object r14 = p409xc.AbstractC11833h.m26224a(r14)
            r10.f10332c = r14
            r10.f10333d = r3
            java.lang.Object r14 = r1.emit(r2, r13)
            if (r14 != r0) goto Lab
            goto Laa
        L81:
            com.friday.paint.viewmodel.NewNoteViewModel r1 = r10.f10334e
            vd.k r1 = com.friday.paint.viewmodel.NewNoteViewModel.m7654n(r1)
            kotlin.Result$a r3 = kotlin.Result.f23263d
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r4 = "复制失败，请稍后再试"
            r3.<init>(r4)
            java.lang.Object r3 = kotlin.AbstractC9924b.m20070a(r3)
            java.lang.Object r3 = kotlin.Result.m20054c(r3)
            kotlin.Result r3 = kotlin.Result.m20053a(r3)
            java.lang.Object r14 = p409xc.AbstractC11833h.m26224a(r14)
            r10.f10332c = r14
            r10.f10333d = r2
            java.lang.Object r14 = r1.emit(r3, r13)
            if (r14 != r0) goto Lab
        Laa:
            return r0
        Lab:
            qc.q r14 = p309qc.C10786q.f26013a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.viewmodel.NewNoteViewModel$copyToOthers$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1.smali:122
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NewNoteViewModel$copyToOthers$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
