package com.zykj.cloudhelper.viewmodel;

import com.friday.common.entity.FileEntity;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.cloudhelper.viewmodel.PickNoteViewModel$createFolder$1", m26211f = "PickNoteViewModel.kt", m26212l = {275, 285}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class PickNoteViewModel$createFolder$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f19546c;

    /* renamed from: d */
    public int f19547d;

    /* renamed from: e */
    public final /* synthetic */ PickNoteViewModel f19548e;

    /* renamed from: f */
    public final /* synthetic */ FileEntity f19549f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickNoteViewModel$createFolder$1(PickNoteViewModel pickNoteViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f19548e = pickNoteViewModel;
        this.f19549f = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new PickNoteViewModel$createFolder$1(this.f19548e, this.f19549f, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
    
        if (r1.mo4910I(r3, r10) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Exception {
        /*
            r10 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r10.f19547d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r10.f19546c
            com.friday.common.property.BaseResponse r0 = (com.friday.common.property.BaseResponse) r0
            kotlin.AbstractC9924b.m20071b(r11)
            goto L76
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            kotlin.AbstractC9924b.m20071b(r11)
            goto L57
        L22:
            kotlin.AbstractC9924b.m20071b(r11)
            com.zykj.cloudhelper.viewmodel.PickNoteViewModel r11 = r10.f19548e
            pa.a r11 = com.zykj.cloudhelper.viewmodel.PickNoteViewModel.m16480i(r11)
            com.friday.common.entity.UpdateRequest r4 = new com.friday.common.entity.UpdateRequest
            com.friday.common.entity.FileEntity r1 = r10.f19549f
            java.lang.String r5 = r1.getFileId()
            com.friday.common.entity.FileEntity r1 = r10.f19549f
            java.lang.String r6 = r1.getFileName()
            com.friday.common.entity.FileEntity r1 = r10.f19549f
            java.lang.String r7 = r1.getOssFileUrl()
            com.friday.common.entity.FileEntity r1 = r10.f19549f
            java.lang.String r8 = r1.getParentId()
            com.friday.common.entity.FileEntity r1 = r10.f19549f
            java.lang.String r9 = r1.getFileType()
            r4.<init>(r5, r6, r7, r8, r9)
            r10.f19547d = r3
            java.lang.Object r11 = r11.m22510c(r4, r10)
            if (r11 != r0) goto L57
            goto L75
        L57:
            com.friday.common.property.BaseResponse r11 = (com.friday.common.property.BaseResponse) r11
            int r1 = r11.getCode()
            if (r1 != 0) goto L79
            com.zykj.cloudhelper.viewmodel.PickNoteViewModel r1 = r10.f19548e
            com.friday.common.dao.FileDao r1 = com.zykj.cloudhelper.viewmodel.PickNoteViewModel.m16478g(r1)
            com.friday.common.entity.FileEntity r3 = r10.f19549f
            java.lang.Object r11 = p409xc.AbstractC11833h.m26224a(r11)
            r10.f19546c = r11
            r10.f19547d = r2
            java.lang.Object r11 = r1.mo4910I(r3, r10)
            if (r11 != r0) goto L76
        L75:
            return r0
        L76:
            qc.q r11 = p309qc.C10786q.f26013a
            return r11
        L79:
            java.lang.Exception r11 = new java.lang.Exception
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.cloudhelper.viewmodel.PickNoteViewModel$createFolder$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes6/com/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1.smali:131
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((PickNoteViewModel$createFolder$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
