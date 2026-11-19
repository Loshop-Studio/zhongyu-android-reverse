package com.friday.main.viewmodel;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.FolderMoveViewModel$restoreFile$1", m26211f = "FolderMoveViewModel.kt", m26212l = {549, 551, 552}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class FolderMoveViewModel$restoreFile$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f9567c;

    /* renamed from: d */
    public int f9568d;

    /* renamed from: e */
    public final /* synthetic */ FolderMoveViewModel f9569e;

    /* renamed from: f */
    public final /* synthetic */ String f9570f;

    /* renamed from: g */
    public final /* synthetic */ String f9571g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderMoveViewModel$restoreFile$1(FolderMoveViewModel folderMoveViewModel, String str, String str2, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9569e = folderMoveViewModel;
        this.f9570f = str;
        this.f9571g = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FolderMoveViewModel$restoreFile$1(this.f9569e, this.f9570f, this.f9571g, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r8.emit(r3, r7) != r0) goto L24;
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
            int r1 = r7.f9568d
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2e
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r0 = r7.f9567c
            com.friday.common.property.BaseResponse r0 = (com.friday.common.property.BaseResponse) r0
            kotlin.AbstractC9924b.m20071b(r8)
            goto L90
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L22:
            java.lang.Object r1 = r7.f9567c
            com.friday.common.property.BaseResponse r1 = (com.friday.common.property.BaseResponse) r1
            kotlin.AbstractC9924b.m20071b(r8)
            goto L6d
        L2a:
            kotlin.AbstractC9924b.m20071b(r8)
            goto L49
        L2e:
            kotlin.AbstractC9924b.m20071b(r8)
            com.friday.main.viewmodel.FolderMoveViewModel r8 = r7.f9569e
            u3.b r8 = com.friday.main.viewmodel.FolderMoveViewModel.m7200i(r8)
            com.friday.main.model.RestoreReq r1 = new com.friday.main.model.RestoreReq
            java.lang.String r5 = r7.f9570f
            java.lang.String r6 = r7.f9571g
            r1.<init>(r5, r6)
            r7.f9568d = r4
            java.lang.Object r8 = r8.m25281a(r1, r7)
            if (r8 != r0) goto L49
            goto L85
        L49:
            r1 = r8
            com.friday.common.property.BaseResponse r1 = (com.friday.common.property.BaseResponse) r1
            int r8 = r1.getCode()
            if (r8 != 0) goto L86
            com.friday.main.viewmodel.FolderMoveViewModel r8 = r7.f9569e
            com.friday.common.dao.FileDao r8 = com.friday.main.viewmodel.FolderMoveViewModel.m7199h(r8)
            java.lang.Object r5 = r1.getData()
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = p409xc.AbstractC11833h.m26224a(r1)
            r7.f9567c = r6
            r7.f9568d = r3
            java.lang.Object r8 = r8.mo4909H(r5, r7)
            if (r8 != r0) goto L6d
            goto L85
        L6d:
            com.friday.main.viewmodel.FolderMoveViewModel r8 = r7.f9569e
            vd.k r8 = r8.m7210A()
            java.lang.Boolean r3 = p409xc.AbstractC11826a.m26206a(r4)
            java.lang.Object r1 = p409xc.AbstractC11833h.m26224a(r1)
            r7.f9567c = r1
            r7.f9568d = r2
            java.lang.Object r8 = r8.emit(r3, r7)
            if (r8 != r0) goto L90
        L85:
            return r0
        L86:
            java.lang.String r8 = r1.getMsg()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.blankj.utilcode.util.ToastUtils.showShort(r8, r0)
        L90:
            qc.q r8 = p309qc.C10786q.f26013a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.main.viewmodel.FolderMoveViewModel$restoreFile$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1.smali:142
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FolderMoveViewModel$restoreFile$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
