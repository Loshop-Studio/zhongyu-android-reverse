package com.friday.document.viewmodel;

import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel$pollFolderLevel$1", m26211f = "BaseFileViewModel.kt", m26212l = {79, PatchStatus.CODE_LOAD_FIND_CONSTRUCTOR}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseFileViewModel$pollFolderLevel$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f7925c;

    /* renamed from: d */
    public int f7926d;

    /* renamed from: e */
    public final /* synthetic */ BaseFileViewModel f7927e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFileViewModel$pollFolderLevel$1(BaseFileViewModel baseFileViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7927e = baseFileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BaseFileViewModel$pollFolderLevel$1(this.f7927e, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (r1.emit(r3, r6) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r6.f7926d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r6.f7925c
            com.friday.document.model.FolderLevelEntity r0 = (com.friday.document.model.FolderLevelEntity) r0
            kotlin.AbstractC9924b.m20071b(r7)
            goto L64
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            kotlin.AbstractC9924b.m20071b(r7)
            goto L3a
        L22:
            kotlin.AbstractC9924b.m20071b(r7)
            sd.e0 r7 = sd.C11157r0.m24799b()
            com.friday.document.viewmodel.BaseFileViewModel$pollFolderLevel$1$realLevel$1 r1 = new com.friday.document.viewmodel.BaseFileViewModel$pollFolderLevel$1$realLevel$1
            com.friday.document.viewmodel.BaseFileViewModel r4 = r6.f7927e
            r5 = 0
            r1.<init>(r4, r5)
            r6.f7926d = r3
            java.lang.Object r7 = sd.AbstractC11109f.m24709g(r7, r1, r6)
            if (r7 != r0) goto L3a
            goto L63
        L3a:
            com.friday.document.model.FolderLevelEntity r7 = (com.friday.document.model.FolderLevelEntity) r7
            com.friday.document.viewmodel.BaseFileViewModel r1 = r6.f7927e
            androidx.lifecycle.MutableLiveData r1 = com.friday.document.viewmodel.BaseFileViewModel.m6208l(r1)
            r1.postValue(r7)
            com.friday.document.viewmodel.BaseFileViewModel r1 = r6.f7927e
            vd.k r1 = com.friday.document.viewmodel.BaseFileViewModel.m6210n(r1)
            if (r7 == 0) goto L53
            java.lang.String r3 = r7.getFileId()
            if (r3 != 0) goto L55
        L53:
            java.lang.String r3 = "0"
        L55:
            java.lang.Object r7 = p409xc.AbstractC11833h.m26224a(r7)
            r6.f7925c = r7
            r6.f7926d = r2
            java.lang.Object r7 = r1.emit(r3, r6)
            if (r7 != r0) goto L64
        L63:
            return r0
        L64:
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.BaseFileViewModel$pollFolderLevel$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/BaseFileViewModel$pollFolderLevel$1.smali:121
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((BaseFileViewModel$pollFolderLevel$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
