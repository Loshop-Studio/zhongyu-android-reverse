package com.friday.document.viewmodel;

import com.friday.common.entity.FileEntity;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.viewmodel.FolderViewModel$retrySyncSingleFile$1", m26211f = "FolderViewModel.kt", m26212l = {210, 212}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FolderViewModel$retrySyncSingleFile$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f8032c;

    /* renamed from: d */
    public Object f8033d;

    /* renamed from: e */
    public int f8034e;

    /* renamed from: f */
    public int f8035f;

    /* renamed from: g */
    public /* synthetic */ Object f8036g;

    /* renamed from: h */
    public final /* synthetic */ FolderViewModel f8037h;

    /* renamed from: i */
    public final /* synthetic */ FileEntity f8038i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderViewModel$retrySyncSingleFile$1(FolderViewModel folderViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8037h = folderViewModel;
        this.f8038i = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        FolderViewModel$retrySyncSingleFile$1 folderViewModel$retrySyncSingleFile$1 = new FolderViewModel$retrySyncSingleFile$1(this.f8037h, this.f8038i, interfaceC11588c);
        folderViewModel$retrySyncSingleFile$1.f8036g = obj;
        return folderViewModel$retrySyncSingleFile$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f8036g
            sd.i0 r0 = (sd.InterfaceC11122i0) r0
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r9.f8035f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L30
            if (r2 == r5) goto L26
            if (r2 != r4) goto L1e
            java.lang.Object r0 = r9.f8033d
            qc.q r0 = (p309qc.C10786q) r0
            java.lang.Object r0 = r9.f8032c
            kotlin.AbstractC9924b.m20071b(r10)
            goto La1
        L1e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L26:
            java.lang.Object r2 = r9.f8032c
            sd.i0 r2 = (sd.InterfaceC11122i0) r2
            kotlin.AbstractC9924b.m20071b(r10)     // Catch: java.lang.Throwable -> L2e
            goto L65
        L2e:
            r10 = move-exception
            goto L6c
        L30:
            kotlin.AbstractC9924b.m20071b(r10)
            com.friday.document.viewmodel.FolderViewModel r10 = r9.f8037h
            com.friday.common.entity.FileEntity r2 = r9.f8038i
            kotlin.Result$a r6 = kotlin.Result.f23263d     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = "单个同步开始"
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L2e
            com.blankj.utilcode.util.LogUtils.m3887e(r6)     // Catch: java.lang.Throwable -> L2e
            com.friday.document.service.FileManager r6 = r10.m6230N()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = r2.getFileId()     // Catch: java.lang.Throwable -> L2e
            long r7 = r10.m6240X()     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r10 = p409xc.AbstractC11833h.m26224a(r0)     // Catch: java.lang.Throwable -> L2e
            r9.f8036g = r10     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r10 = p409xc.AbstractC11833h.m26224a(r0)     // Catch: java.lang.Throwable -> L2e
            r9.f8032c = r10     // Catch: java.lang.Throwable -> L2e
            r9.f8034e = r3     // Catch: java.lang.Throwable -> L2e
            r9.f8035f = r5     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r10 = r6.m5604I(r2, r7, r9)     // Catch: java.lang.Throwable -> L2e
            if (r10 != r1) goto L65
            goto L9f
        L65:
            qc.q r10 = p309qc.C10786q.f26013a     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r10 = kotlin.Result.m20054c(r10)     // Catch: java.lang.Throwable -> L2e
            goto L76
        L6c:
            kotlin.Result$a r2 = kotlin.Result.f23263d
            java.lang.Object r10 = kotlin.AbstractC9924b.m20070a(r10)
            java.lang.Object r10 = kotlin.Result.m20054c(r10)
        L76:
            com.friday.document.viewmodel.FolderViewModel r2 = r9.f8037h
            boolean r5 = kotlin.Result.m20059k(r10)
            if (r5 == 0) goto La2
            r5 = r10
            qc.q r5 = (p309qc.C10786q) r5
            vd.k r2 = com.friday.document.viewmodel.FolderViewModel.m6286F0(r2)
            qc.q r6 = p309qc.C10786q.f26013a
            java.lang.Object r0 = p409xc.AbstractC11833h.m26224a(r0)
            r9.f8036g = r0
            r9.f8032c = r10
            java.lang.Object r0 = p409xc.AbstractC11833h.m26224a(r5)
            r9.f8033d = r0
            r9.f8034e = r3
            r9.f8035f = r4
            java.lang.Object r0 = r2.emit(r6, r9)
            if (r0 != r1) goto La0
        L9f:
            return r1
        La0:
            r0 = r10
        La1:
            r10 = r0
        La2:
            java.lang.Throwable r10 = kotlin.Result.m20056e(r10)
            if (r10 == 0) goto Lcf
            java.lang.String r0 = r10.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "单个同步失败: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.blankj.utilcode.util.LogUtils.m3887e(r0)
            java.lang.String r10 = r10.getMessage()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            p429z1.AbstractC11958b.m26588i(r10)
        Lcf:
            qc.q r10 = p309qc.C10786q.f26013a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.viewmodel.FolderViewModel$retrySyncSingleFile$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/viewmodel/FolderViewModel$retrySyncSingleFile$1.smali:141
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FolderViewModel$retrySyncSingleFile$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
