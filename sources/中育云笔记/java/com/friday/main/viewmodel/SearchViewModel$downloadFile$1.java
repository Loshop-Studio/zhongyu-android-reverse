package com.friday.main.viewmodel;

import com.friday.common.entity.FileEntity;
import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.SearchViewModel$downloadFile$1", m26211f = "SearchViewModel.kt", m26212l = {128, 130, PatchStatus.CODE_LOAD_LIB_CPUABIS, PatchStatus.CODE_LOAD_LIB_LOST}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SearchViewModel$downloadFile$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f9694c;

    /* renamed from: d */
    public int f9695d;

    /* renamed from: e */
    public final /* synthetic */ SearchViewModel f9696e;

    /* renamed from: f */
    public final /* synthetic */ FileEntity f9697f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$downloadFile$1(SearchViewModel searchViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9696e = searchViewModel;
        this.f9697f = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new SearchViewModel$downloadFile$1(this.f9696e, this.f9697f, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
    
        if (r8 != r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c A[PHI: r1
      0x009c: PHI (r1v5 com.friday.common.property.BaseResponse) = 
      (r1v4 com.friday.common.property.BaseResponse)
      (r1v4 com.friday.common.property.BaseResponse)
      (r1v8 com.friday.common.property.BaseResponse)
     binds: [B:24:0x0099, B:21:0x0082, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r7.f9695d
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L31
            if (r1 == r5) goto L2d
            if (r1 == r4) goto L25
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r0 = r7.f9694c
            com.friday.common.property.BaseResponse r0 = (com.friday.common.property.BaseResponse) r0
            kotlin.AbstractC9924b.m20071b(r8)
            goto Lb7
        L1d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L25:
            java.lang.Object r1 = r7.f9694c
            com.friday.common.property.BaseResponse r1 = (com.friday.common.property.BaseResponse) r1
            kotlin.AbstractC9924b.m20071b(r8)
            goto L9c
        L2d:
            kotlin.AbstractC9924b.m20071b(r8)
            goto L49
        L31:
            kotlin.AbstractC9924b.m20071b(r8)
            com.friday.main.viewmodel.SearchViewModel r8 = r7.f9696e
            u3.b r8 = com.friday.main.viewmodel.SearchViewModel.m7274h(r8)
            com.friday.common.entity.FileEntity r1 = r7.f9697f
            java.lang.String r1 = r1.getFileId()
            r7.f9695d = r5
            java.lang.Object r8 = r8.m25282b(r1, r7)
            if (r8 != r0) goto L49
            goto Lb6
        L49:
            r1 = r8
            com.friday.common.property.BaseResponse r1 = (com.friday.common.property.BaseResponse) r1
            int r8 = r1.getCode()
            if (r8 != 0) goto L85
            java.lang.Object r8 = r1.getData()
            com.friday.common.entity.GetResourceEntity r8 = (com.friday.common.entity.GetResourceEntity) r8
            java.util.List r8 = r8.getResourceList()
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L85
            com.friday.main.viewmodel.SearchViewModel r8 = r7.f9696e
            j2.d r8 = com.friday.main.viewmodel.SearchViewModel.m7273g(r8)
            java.lang.Object r3 = r1.getData()
            com.friday.common.entity.GetResourceEntity r3 = (com.friday.common.entity.GetResourceEntity) r3
            java.util.List r3 = r3.getResourceList()
            com.friday.common.entity.FileEntity r5 = r7.f9697f
            java.lang.Object r6 = p409xc.AbstractC11833h.m26224a(r1)
            r7.f9694c = r6
            r7.f9695d = r4
            java.lang.Object r8 = r8.mo5608a(r3, r5, r7)
            if (r8 != r0) goto L9c
            goto Lb6
        L85:
            com.friday.main.viewmodel.SearchViewModel r8 = r7.f9696e
            j2.d r8 = com.friday.main.viewmodel.SearchViewModel.m7273g(r8)
            com.friday.common.entity.FileEntity r4 = r7.f9697f
            java.lang.Object r5 = p409xc.AbstractC11833h.m26224a(r1)
            r7.f9694c = r5
            r7.f9695d = r3
            java.lang.Object r8 = r8.mo5610c(r4, r7)
            if (r8 != r0) goto L9c
            goto Lb6
        L9c:
            com.friday.main.viewmodel.SearchViewModel r8 = r7.f9696e
            com.friday.common.dao.FileDao r8 = com.friday.main.viewmodel.SearchViewModel.m7272f(r8)
            com.friday.common.entity.FileEntity r3 = r7.f9697f
            java.lang.String r3 = r3.getFileId()
            java.lang.Object r1 = p409xc.AbstractC11833h.m26224a(r1)
            r7.f9694c = r1
            r7.f9695d = r2
            java.lang.Object r8 = r8.mo4941r(r3, r7)
            if (r8 != r0) goto Lb7
        Lb6:
            return r0
        Lb7:
            com.friday.common.entity.FileEntity r8 = (com.friday.common.entity.FileEntity) r8
            com.friday.main.viewmodel.SearchViewModel r0 = r7.f9696e
            androidx.lifecycle.MutableLiveData r0 = r0.m7289v()
            r0.postValue(r8)
            qc.q r8 = p309qc.C10786q.f26013a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.main.viewmodel.SearchViewModel$downloadFile$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/main/viewmodel/SearchViewModel$downloadFile$1.smali:133
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((SearchViewModel$downloadFile$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
