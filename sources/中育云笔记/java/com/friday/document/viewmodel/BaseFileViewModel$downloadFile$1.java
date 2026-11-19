package com.friday.document.viewmodel;

import com.friday.common.entity.FileEntity;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.BaseFileViewModel$downloadFile$1", m26211f = "BaseFileViewModel.kt", m26212l = {460, 463, 465}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseFileViewModel$downloadFile$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f7874c;

    /* renamed from: d */
    public int f7875d;

    /* renamed from: e */
    public final /* synthetic */ BaseFileViewModel f7876e;

    /* renamed from: f */
    public final /* synthetic */ FileEntity f7877f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFileViewModel$downloadFile$1(BaseFileViewModel baseFileViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7876e = baseFileViewModel;
        this.f7877f = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BaseFileViewModel$downloadFile$1(this.f7876e, this.f7877f, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009e, code lost:
    
        if (r1.mo5608a(r2, r4, r6) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b5, code lost:
    
        if (r1.mo5610c(r3, r6) == r0) goto L24;
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
            int r1 = r6.f7875d
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L1a
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r0 = r6.f7874c
            com.friday.common.property.BaseResponse r0 = (com.friday.common.property.BaseResponse) r0
            kotlin.AbstractC9924b.m20071b(r7)
            goto Lb8
        L23:
            kotlin.AbstractC9924b.m20071b(r7)
            goto L40
        L27:
            kotlin.AbstractC9924b.m20071b(r7)
            com.friday.document.viewmodel.BaseFileViewModel r7 = r6.f7876e
            s2.a r7 = r7.m6223G()
            com.friday.common.entity.FileEntity r1 = r6.f7877f
            java.lang.String r1 = r1.getFileId()
            r6.f7875d = r4
            java.lang.Object r7 = r7.m24494b(r1, r6)
            if (r7 != r0) goto L40
            goto Lb7
        L40:
            com.friday.common.property.BaseResponse r7 = (com.friday.common.property.BaseResponse) r7
            java.lang.Object r1 = r7.getData()
            com.friday.common.entity.GetResourceEntity r1 = (com.friday.common.entity.GetResourceEntity) r1
            java.util.List r1 = r1.getResourceList()
            int r1 = r1.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "页面BaseFleViewModel，需要下载的文件有"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            com.blankj.utilcode.util.LogUtils.m3886d(r1)
            int r1 = r7.getCode()
            if (r1 != 0) goto La1
            java.lang.Object r1 = r7.getData()
            com.friday.common.entity.GetResourceEntity r1 = (com.friday.common.entity.GetResourceEntity) r1
            java.util.List r1 = r1.getResourceList()
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto La1
            com.friday.document.viewmodel.BaseFileViewModel r1 = r6.f7876e
            com.friday.document.service.FileManager r1 = r1.m6230N()
            java.lang.Object r2 = r7.getData()
            com.friday.common.entity.GetResourceEntity r2 = (com.friday.common.entity.GetResourceEntity) r2
            java.util.List r2 = r2.getResourceList()
            com.friday.common.entity.FileEntity r4 = r6.f7877f
            java.lang.Object r7 = p409xc.AbstractC11833h.m26224a(r7)
            r6.f7874c = r7
            r6.f7875d = r3
            java.lang.Object r7 = r1.mo5608a(r2, r4, r6)
            if (r7 != r0) goto Lb8
            goto Lb7
        La1:
            com.friday.document.viewmodel.BaseFileViewModel r1 = r6.f7876e
            com.friday.document.service.FileManager r1 = r1.m6230N()
            com.friday.common.entity.FileEntity r3 = r6.f7877f
            java.lang.Object r7 = p409xc.AbstractC11833h.m26224a(r7)
            r6.f7874c = r7
            r6.f7875d = r2
            java.lang.Object r7 = r1.mo5610c(r3, r6)
            if (r7 != r0) goto Lb8
        Lb7:
            return r0
        Lb8:
            com.friday.common.entity.FileEntity r7 = r6.f7877f
            java.lang.String r7 = r7.getFileId()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "页面BaseFileViewModel.kt -> 准备执行 postValue, id="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            com.blankj.utilcode.util.LogUtils.m3886d(r7)
            com.friday.document.viewmodel.BaseFileViewModel r7 = r6.f7876e
            androidx.lifecycle.MutableLiveData r7 = r7.m6247e0()
            com.friday.common.entity.FileEntity r0 = r6.f7877f
            r7.postValue(r0)
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.BaseFileViewModel$downloadFile$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/BaseFileViewModel$downloadFile$1.smali:132
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((BaseFileViewModel$downloadFile$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
